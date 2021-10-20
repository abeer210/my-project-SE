package com.google.android.gms.vision;

public abstract class a<T> {
    private final Object a = new Object();
    private AbstractC0063a<T> b;

    /* renamed from: com.google.android.gms.vision.a$a  reason: collision with other inner class name */
    public interface AbstractC0063a<T> {
        void release();
    }

    public void a() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.release();
                this.b = null;
            }
        }
    }
}
