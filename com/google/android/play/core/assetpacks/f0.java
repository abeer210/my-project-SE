package com.google.android.play.core.assetpacks;

import vigqyno.C0201;

public final class f0 extends b {
    private final int a;
    private final String b;
    private final String c;

    public f0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final int c() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.c() && ((str = this.b) != null ? str.equals(bVar.d()) : bVar.d() == null)) {
                String str2 = this.c;
                String b2 = bVar.b();
                if (str2 != null ? str2.equals(b2) : b2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append(C0201.m82(21884));
        sb.append(i);
        sb.append(C0201.m82(21885));
        sb.append(str);
        sb.append(C0201.m82(21886));
        sb.append(str2);
        sb.append(C0201.m82(21887));
        return sb.toString();
    }
}
