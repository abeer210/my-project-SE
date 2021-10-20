package defpackage;

import vigqyno.C0201;

/* renamed from: vr  reason: default package */
/* compiled from: Face */
public class vr {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final sr f;

    public vr(int i, int i2, int i3, int i4, String str, sr srVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = srVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vr.class != obj.getClass()) {
            return false;
        }
        vr vrVar = (vr) obj;
        if (this.d != vrVar.d || this.c != vrVar.c || this.a != vrVar.a || this.b != vrVar.b) {
            return false;
        }
        sr srVar = this.f;
        if (srVar == null ? vrVar.f != null : !srVar.equals(vrVar.f)) {
            return false;
        }
        String str = this.e;
        String str2 = vrVar.e;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        int i = ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31;
        String str = this.e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        sr srVar = this.f;
        if (srVar != null) {
            i2 = srVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(13098));
        sb.append(this.a);
        sb.append(C0201.m82(13099));
        sb.append(this.b);
        sb.append(C0201.m82(13100));
        sb.append(this.c);
        sb.append(C0201.m82(13101));
        sb.append(this.d);
        if (this.e != null) {
            sb.append(C0201.m82(13102));
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append(C0201.m82(13103));
            sb.append(this.f.c());
        }
        return sb.toString();
    }
}
