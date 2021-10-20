package com.google.firebase.iid;

public final /* synthetic */ class s0 implements ys1 {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final String d;

    public s0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.ys1
    public final zs1 then(Object obj) {
        return this.a.q(this.b, this.c, this.d, (String) obj);
    }
}
