package com.google.android.play.core.assetpacks;

import vigqyno.C0201;

public final class g0 extends AssetPackState {
    private final String a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final int f;

    public g0(String str, int i, int i2, long j, long j2, int i3) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = j2;
            this.f = i3;
            return;
        }
        throw new NullPointerException(C0201.m82(29420));
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long c() {
        return this.d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int d() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.a.equals(assetPackState.e()) && this.b == assetPackState.f() && this.c == assetPackState.d() && this.d == assetPackState.c() && this.e == assetPackState.g() && this.f == assetPackState.h();
        }
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long g() {
        return this.e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        int i3 = this.f;
        StringBuilder sb = new StringBuilder(str.length() + 185);
        sb.append(C0201.m82(29421));
        sb.append(str);
        sb.append(C0201.m82(29422));
        sb.append(i);
        sb.append(C0201.m82(29423));
        sb.append(i2);
        sb.append(C0201.m82(29424));
        sb.append(j);
        sb.append(C0201.m82(29425));
        sb.append(j2);
        sb.append(C0201.m82(29426));
        sb.append(i3);
        sb.append(C0201.m82(29427));
        return sb.toString();
    }
}
