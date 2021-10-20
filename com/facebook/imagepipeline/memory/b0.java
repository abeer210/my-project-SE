package com.facebook.imagepipeline.memory;

/* compiled from: NoOpPoolStatsTracker */
public class b0 implements h0 {
    private static b0 a;

    private b0() {
    }

    public static synchronized b0 h() {
        b0 b0Var;
        synchronized (b0.class) {
            if (a == null) {
                a = new b0();
            }
            b0Var = a;
        }
        return b0Var;
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void a(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void b(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void c(a aVar) {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void d() {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void e(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void f() {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void g(int i) {
    }
}
