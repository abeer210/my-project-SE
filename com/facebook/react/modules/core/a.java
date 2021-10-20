package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* compiled from: ChoreographerCompat */
public class a {
    private static a b;
    private Choreographer a = c();

    /* renamed from: com.facebook.react.modules.core.a$a  reason: collision with other inner class name */
    /* compiled from: ChoreographerCompat */
    public static abstract class AbstractC0040a {
        private Choreographer.FrameCallback a;

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.react.modules.core.a$a$a  reason: collision with other inner class name */
        /* compiled from: ChoreographerCompat */
        public class Choreographer$FrameCallbackC0041a implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC0041a() {
            }

            public void doFrame(long j) {
                AbstractC0040a.this.a(j);
            }
        }

        public abstract void a(long j);

        public Choreographer.FrameCallback b() {
            if (this.a == null) {
                this.a = new Choreographer$FrameCallbackC0041a();
            }
            return this.a;
        }
    }

    private a() {
    }

    private void a(Choreographer.FrameCallback frameCallback) {
        this.a.postFrameCallback(frameCallback);
    }

    private void b(Choreographer.FrameCallback frameCallback) {
        this.a.removeFrameCallback(frameCallback);
    }

    private Choreographer c() {
        return Choreographer.getInstance();
    }

    public static a d() {
        UiThreadUtil.assertOnUiThread();
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public void e(AbstractC0040a aVar) {
        a(aVar.b());
    }

    public void f(AbstractC0040a aVar) {
        b(aVar.b());
    }
}
