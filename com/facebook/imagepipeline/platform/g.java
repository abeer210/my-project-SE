package com.facebook.imagepipeline.platform;

import android.os.Build;
import androidx.core.util.f;
import com.facebook.imagepipeline.memory.f0;

/* compiled from: PlatformDecoderFactory */
public class g {
    public static f a(f0 f0Var, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            int d = f0Var.d();
            return new e(f0Var.a(), d, new f(d));
        } else if (i >= 21) {
            int d2 = f0Var.d();
            return new a(f0Var.a(), d2, new f(d2));
        } else if (!z || i >= 19) {
            return new d(f0Var.c());
        } else {
            return new c();
        }
    }
}
