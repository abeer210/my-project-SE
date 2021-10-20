package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.i;

/* renamed from: qm  reason: default package */
/* compiled from: DrawableBytesTranscoder */
public final class qm implements sm<Drawable, byte[]> {
    private final qi a;
    private final sm<Bitmap, byte[]> b;
    private final sm<gm, byte[]> c;

    public qm(qi qiVar, sm<Bitmap, byte[]> smVar, sm<gm, byte[]> smVar2) {
        this.a = qiVar;
        this.b = smVar;
        this.c = smVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: hi<android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    private static hi<gm> b(hi<Drawable> hiVar) {
        return hiVar;
    }

    @Override // defpackage.sm
    public hi<byte[]> a(hi<Drawable> hiVar, i iVar) {
        Drawable drawable = hiVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(xk.d(((BitmapDrawable) drawable).getBitmap(), this.a), iVar);
        }
        if (!(drawable instanceof gm)) {
            return null;
        }
        sm<gm, byte[]> smVar = this.c;
        b(hiVar);
        return smVar.a(hiVar, iVar);
    }
}
