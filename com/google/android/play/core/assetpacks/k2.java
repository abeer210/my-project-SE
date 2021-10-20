package com.google.android.play.core.assetpacks;

import vigqyno.C0201;

public final class k2 {
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    public k2() {
    }

    public k2(int i, String str, long j, long j2, int i2) {
        this();
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            k2 k2Var = (k2) obj;
            return this.a == k2Var.a() && ((str = this.b) != null ? str.equals(k2Var.b()) : k2Var.b() == null) && this.c == k2Var.c() && this.d == k2Var.d() && this.e == k2Var.e();
        }
    }

    public int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        long j2 = this.d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append(C0201.m82(19143));
        sb.append(i);
        sb.append(C0201.m82(19144));
        sb.append(str);
        sb.append(C0201.m82(19145));
        sb.append(j);
        sb.append(C0201.m82(19146));
        sb.append(j2);
        sb.append(C0201.m82(19147));
        sb.append(i2);
        sb.append(C0201.m82(19148));
        return sb.toString();
    }
}
