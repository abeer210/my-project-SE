package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.i;

/* renamed from: pm  reason: default package */
/* compiled from: BitmapDrawableTranscoder */
public class pm implements sm<Bitmap, BitmapDrawable> {
    private final Resources a;

    public pm(Resources resources) {
        ep.d(resources);
        this.a = resources;
    }

    @Override // defpackage.sm
    public hi<BitmapDrawable> a(hi<Bitmap> hiVar, i iVar) {
        return nl.d(this.a, hiVar);
    }
}
