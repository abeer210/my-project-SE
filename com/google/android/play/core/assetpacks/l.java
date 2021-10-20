package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import vigqyno.C0201;

public class l<T> extends qz1 {
    public final d12<T> a;
    public final /* synthetic */ q b;

    public l(q qVar, d12<T> d12) {
        this.b = qVar;
        this.a = d12;
    }

    public l(q qVar, d12 d12, byte[] bArr) {
        this(qVar, d12);
    }

    public l(q qVar, d12 d12, char[] cArr) {
        this(qVar, d12);
    }

    public l(q qVar, d12 d12, int[] iArr) {
        this(qVar, d12);
    }

    @Override // defpackage.rz1
    public void C2(int i, Bundle bundle) {
        this.b.c.b();
        q.f.f(C0201.m82(10222), Integer.valueOf(i));
    }

    @Override // defpackage.rz1
    public void E2(Bundle bundle) {
        this.b.c.b();
        q.f.f(C0201.m82(10224), Integer.valueOf(bundle.getInt(C0201.m82(10223))));
    }

    @Override // defpackage.rz1
    public void O0(Bundle bundle) {
        this.b.c.b();
        q.f.f(C0201.m82(10227), bundle.getString(C0201.m82(10225)), Integer.valueOf(bundle.getInt(C0201.m82(10226))));
    }

    @Override // defpackage.rz1
    public void a() {
        this.b.c.b();
        q.f.f(C0201.m82(10228), new Object[0]);
    }

    @Override // defpackage.rz1
    public final void a(int i) {
        this.b.c.b();
        q.f.f(C0201.m82(10229), Integer.valueOf(i));
    }

    @Override // defpackage.rz1
    public void a(Bundle bundle) {
        this.b.c.b();
        int i = bundle.getInt(C0201.m82(10230));
        q.f.e(C0201.m82(10231), Integer.valueOf(i));
        this.a.d(new a(i));
    }

    @Override // defpackage.rz1
    public void a(Bundle bundle, Bundle bundle2) {
        this.b.d.b();
        q.f.f(C0201.m82(10233), Boolean.valueOf(bundle.getBoolean(C0201.m82(10232))));
    }

    @Override // defpackage.rz1
    public void a(List<Bundle> list) {
        this.b.c.b();
        q.f.f(C0201.m82(10234), new Object[0]);
    }

    @Override // defpackage.rz1
    public void b() {
        this.b.c.b();
        q.f.f(C0201.m82(10235), new Object[0]);
    }

    @Override // defpackage.rz1
    public final void b(int i) {
        this.b.c.b();
        q.f.f(C0201.m82(10236), Integer.valueOf(i));
    }

    @Override // defpackage.rz1
    public void b(Bundle bundle) {
        this.b.c.b();
        q.f.f(C0201.m82(10241), bundle.getString(C0201.m82(10237)), bundle.getString(C0201.m82(10238)), Integer.valueOf(bundle.getInt(C0201.m82(10239))), Integer.valueOf(bundle.getInt(C0201.m82(10240))));
    }

    @Override // defpackage.rz1
    public void b2(Bundle bundle, Bundle bundle2) {
        this.b.c.b();
        q.f.f(C0201.m82(10242), new Object[0]);
    }

    @Override // defpackage.rz1
    public void x1(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.b.c.b();
        q.f.f(C0201.m82(10243), new Object[0]);
    }
}
