package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.n6;
import java.util.List;
import java.util.Map;

public final class a implements n6 {
    private final /* synthetic */ sh1 a;

    public a(sh1 sh1) {
        this.a = sh1;
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final long a() {
        return this.a.d();
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final String b() {
        return this.a.g();
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final void c(String str, String str2, Bundle bundle) {
        this.a.l(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final int d(String str) {
        return this.a.i(str);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final Map<String, Object> e(String str, String str2, boolean z) {
        return this.a.j(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final String f() {
        return this.a.h();
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final List<Bundle> g(String str, String str2) {
        return this.a.e(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final String h() {
        return this.a.f();
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final void i(Bundle bundle) {
        this.a.m(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final void j(String str) {
        this.a.a(str);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final void k(String str) {
        this.a.c(str);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final void l(String str, String str2, Object obj) {
        this.a.u(str, str2, obj);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final void setDataCollectionEnabled(boolean z) {
        this.a.o(z);
    }

    @Override // com.google.android.gms.measurement.internal.n6
    public final String w() {
        return this.a.W();
    }
}
