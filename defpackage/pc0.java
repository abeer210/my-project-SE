package defpackage;

import android.os.Build;
import com.facebook.imagepipeline.memory.f0;
import com.facebook.imagepipeline.platform.f;

/* renamed from: pc0  reason: default package */
/* compiled from: PlatformBitmapFactoryProvider */
public class pc0 {
    public static oc0 a(f0 f0Var, f fVar, ud0 ud0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            return new jc0(f0Var.a(), ud0);
        }
        if (i >= 11) {
            return new nc0(new kc0(f0Var.g()), fVar, ud0);
        }
        return new lc0();
    }
}
