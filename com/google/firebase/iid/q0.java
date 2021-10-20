package com.google.firebase.iid;

public final /* synthetic */ class q0 implements u {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public q0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, String str4) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.google.firebase.iid.u
    public final zs1 D() {
        return this.a.j(this.b, this.c, this.d, this.e);
    }
}
