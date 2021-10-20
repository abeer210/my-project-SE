package com.google.android.play.core.assetpacks;

import java.util.Map;
import vigqyno.C0201;

public final class h0 extends c {
    private final long a;
    private final Map<String, AssetPackState> b;

    public h0(long j, Map<String, AssetPackState> map) {
        this.a = j;
        this.b = map;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final Map<String, AssetPackState> e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.a == cVar.f() && this.b.equals(cVar.e());
        }
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final long f() {
        return this.a;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append(C0201.m82(27174));
        sb.append(j);
        sb.append(C0201.m82(27175));
        sb.append(valueOf);
        sb.append(C0201.m82(27176));
        return sb.toString();
    }
}
