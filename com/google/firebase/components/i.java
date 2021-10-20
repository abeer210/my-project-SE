package com.google.firebase.components;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final /* synthetic */ class i implements x12 {
    private final l a;
    private final d b;

    private i(l lVar, d dVar) {
        this.a = lVar;
        this.b = dVar;
    }

    public static x12 a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    @Override // defpackage.x12
    public Object get() {
        d dVar;
        return dVar.d().a(new u(this.b, this.a));
    }
}
