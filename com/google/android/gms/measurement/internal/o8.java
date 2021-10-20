package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

public final class o8 implements q3 {
    private final /* synthetic */ String a;
    private final /* synthetic */ m8 b;

    public o8(m8 m8Var, String str) {
        this.b = m8Var;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.q3
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.i(i, th, bArr, this.a);
    }
}
