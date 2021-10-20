package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import java.io.File;

/* renamed from: uk  reason: default package */
/* compiled from: BitmapDrawableEncoder */
public class uk implements l<BitmapDrawable> {
    private final qi a;
    private final l<Bitmap> b;

    public uk(qi qiVar, l<Bitmap> lVar) {
        this.a = qiVar;
        this.b = lVar;
    }

    @Override // com.bumptech.glide.load.l
    public c b(i iVar) {
        return this.b.b(iVar);
    }

    /* renamed from: c */
    public boolean a(hi<BitmapDrawable> hiVar, File file, i iVar) {
        return this.b.a(new xk(hiVar.get().getBitmap(), this.a), file, iVar);
    }
}
