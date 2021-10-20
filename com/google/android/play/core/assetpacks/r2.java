package com.google.android.play.core.assetpacks;

import java.util.Arrays;
import vigqyno.C0201;

public final class r2 {
    private final String a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    public r2() {
    }

    public r2(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    public static r2 a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new r2(str, j, i, z, z2, bArr);
    }

    public final boolean b() {
        if (d() == null) {
            return false;
        }
        return d().endsWith(C0201.m82(32795));
    }

    public final boolean c() {
        return f() == 0;
    }

    public String d() {
        return this.a;
    }

    public long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            r2 r2Var = (r2) obj;
            String str = this.a;
            if (str != null ? str.equals(r2Var.d()) : r2Var.d() == null) {
                if (this.b == r2Var.e() && this.c == r2Var.f() && this.d == r2Var.g() && this.e == r2Var.h()) {
                    if (Arrays.equals(this.f, r2Var instanceof r2 ? r2Var.f : r2Var.i())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int f() {
        return this.c;
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f);
    }

    public byte[] i() {
        return this.f;
    }

    public String toString() {
        String str = this.a;
        long j = this.b;
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        String arrays = Arrays.toString(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append(C0201.m82(32796));
        sb.append(str);
        sb.append(C0201.m82(32797));
        sb.append(j);
        sb.append(C0201.m82(32798));
        sb.append(i);
        sb.append(C0201.m82(32799));
        sb.append(z);
        sb.append(C0201.m82(32800));
        sb.append(z2);
        sb.append(C0201.m82(32801));
        sb.append(arrays);
        sb.append(C0201.m82(32802));
        return sb.toString();
    }
}
