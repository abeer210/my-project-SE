package com.facebook.jni;

import com.facebook.jni.DestructorThread;
import com.facebook.jni.annotations.DoNotStrip;
import vigqyno.C0201;

@DoNotStrip
public class HybridData {
    @DoNotStrip
    private Destructor mDestructor = new Destructor(this);

    public static class Destructor extends DestructorThread.Destructor {
        @DoNotStrip
        private long mNativePointer;

        public Destructor(Object obj) {
            super(obj);
        }

        public static native void deleteNative(long j);

        @Override // com.facebook.jni.DestructorThread.Destructor
        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }
    }

    static {
        rl0.c(C0201.m82(24161));
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}
