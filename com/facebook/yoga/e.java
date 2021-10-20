package com.facebook.yoga;

import vigqyno.C0201;

/* compiled from: YogaConfigJNIBase */
public abstract class e extends c {
    public long a;

    private e(long j) {
        if (j != 0) {
            this.a = j;
            return;
        }
        throw new IllegalStateException(C0201.m82(4270));
    }

    @Override // com.facebook.yoga.c
    public void a(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.a, f);
    }

    @Override // com.facebook.yoga.c
    public void b(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.a, z);
    }

    public e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
