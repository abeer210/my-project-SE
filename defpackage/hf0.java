package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import vigqyno.C0201;

/* renamed from: hf0  reason: default package */
/* compiled from: IterativeBoxBlurPostProcessor */
public class hf0 extends hh0 {
    private final int b;
    private final int c;
    private m40 d;

    public hf0(int i) {
        this(3, i);
    }

    @Override // defpackage.hh0, defpackage.kh0
    public m40 c() {
        if (this.d == null) {
            this.d = new r40(String.format(null, C0201.m82(1336), Integer.valueOf(this.b), Integer.valueOf(this.c)));
        }
        return this.d;
    }

    @Override // defpackage.hh0
    public void e(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.b, this.c);
    }

    public hf0(int i, int i2) {
        boolean z = true;
        z50.b(i > 0);
        z50.b(i2 <= 0 ? false : z);
        this.b = i;
        this.c = i2;
    }
}
