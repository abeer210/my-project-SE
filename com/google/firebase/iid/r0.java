package com.google.firebase.iid;

public final /* synthetic */ class r0 implements ss1 {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;

    public r0(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ss1
    public final Object a(zs1 zs1) {
        return this.a.i(this.b, this.c, zs1);
    }
}
