package com.facebook.systrace;

/* compiled from: SystraceMessage */
public final class b {
    private static final AbstractC0053b a = new c();

    /* renamed from: com.facebook.systrace.b$b  reason: collision with other inner class name */
    /* compiled from: SystraceMessage */
    public static abstract class AbstractC0053b {
        public abstract AbstractC0053b a(String str, int i);

        public abstract AbstractC0053b b(String str, Object obj);

        public abstract void c();
    }

    /* compiled from: SystraceMessage */
    private static class c extends AbstractC0053b {
        private c() {
        }

        @Override // com.facebook.systrace.b.AbstractC0053b
        public AbstractC0053b a(String str, int i) {
            return this;
        }

        @Override // com.facebook.systrace.b.AbstractC0053b
        public AbstractC0053b b(String str, Object obj) {
            return this;
        }

        @Override // com.facebook.systrace.b.AbstractC0053b
        public void c() {
        }
    }

    public static AbstractC0053b a(long j, String str) {
        return a;
    }

    public static AbstractC0053b b(long j) {
        return a;
    }
}
