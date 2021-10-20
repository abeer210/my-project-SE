package com.dynatrace.android.agent;

import vigqyno.C0201;

/* compiled from: ErrorSegment */
public class s extends m {
    public String o;
    public String p;
    public String q;
    public String r;

    public s(String str, String str2, String str3, String str4, long j, g30 g30, int i, String str5) {
        this(str, 6, t.ERROR_EXCEPTION, str2, str3, str4, j, g30, i, str5);
    }

    @Override // com.dynatrace.android.agent.m
    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(1668));
        sb.append(this.j.d());
        sb.append(C0201.m82(1669));
        sb.append(s30.q(o()));
        sb.append(C0201.m82(1670));
        sb.append(Thread.currentThread().getId());
        sb.append(C0201.m82(1671));
        sb.append(q());
        sb.append(C0201.m82(1672));
        sb.append(n());
        sb.append(C0201.m82(1673));
        sb.append(t());
        h(sb, C0201.m82(1674), s30.q(this.p));
        h(sb, C0201.m82(1675), s30.q(this.o));
        h(sb, C0201.m82(1676), s30.q(this.q));
        sb.append(C0201.m82(1677));
        sb.append(this.r);
        return sb;
    }

    public s(String str, int i, t tVar, String str2, String str3, String str4, long j, g30 g30, int i2, String str5) {
        super(str, i, tVar, j, g30, i2);
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = str5;
    }
}
