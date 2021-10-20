package com.facebook.yoga;

/* compiled from: YogaNodeJNIFinalizer */
public class r extends YogaNodeJNIBase {
    public r() {
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        try {
            x0();
        } finally {
            super.finalize();
        }
    }

    public void x0() {
        long j = this.e;
        if (j != 0) {
            this.e = 0;
            YogaNative.jni_YGNodeFreeJNI(j);
        }
    }

    public r(c cVar) {
        super(cVar);
    }
}
