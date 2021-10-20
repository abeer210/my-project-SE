package com.facebook.yoga;

/* compiled from: YogaConfigJNIFinalizer */
public class f extends e {
    public void c() {
        long j = this.a;
        if (j != 0) {
            this.a = 0;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }

    public void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
