package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.platform.f;
import vigqyno.C0201;

@TargetApi(11)
/* renamed from: nc0  reason: default package */
/* compiled from: HoneycombBitmapFactory */
public class nc0 extends oc0 {
    private static final String e = null;
    private final kc0 a;
    private final f b;
    private final ud0 c;
    private boolean d;

    static {
        C0201.m83(nc0.class, 488);
    }

    public nc0(kc0 kc0, f fVar, ud0 ud0) {
        this.a = kc0;
        this.b = fVar;
        this.c = ud0;
    }

    private v60<Bitmap> e(int i, int i2, Bitmap.Config config) {
        return this.c.c(Bitmap.createBitmap(i, i2, config), qc0.b());
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.oc0
    @TargetApi(12)
    public v60<Bitmap> d(int i, int i2, Bitmap.Config config) {
        if (this.d) {
            return e(i, i2, config);
        }
        v60<q60> a2 = this.a.a((short) i, (short) i2);
        try {
            af0 af0 = new af0(a2);
            af0.T(nb0.a);
            try {
                v60<Bitmap> b2 = this.b.b(af0, config, null, a2.w().size());
                if (!b2.w().isMutable()) {
                    v60.s(b2);
                    this.d = true;
                    f60.F(e, C0201.m82(30479));
                    v60<Bitmap> e2 = e(i, i2, config);
                    af0.h(af0);
                    return e2;
                }
                b2.w().setHasAlpha(true);
                b2.w().eraseColor(0);
                af0.h(af0);
                a2.close();
                return b2;
            } catch (Throwable th) {
                af0.h(af0);
                throw th;
            }
        } finally {
            a2.close();
        }
    }
}
