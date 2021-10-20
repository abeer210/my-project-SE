package com.dynatrace.android.agent;

import vigqyno.C0201;

/* compiled from: WebReqSegment */
public class a0 extends m {
    public String o;
    public int p;
    private long q = ((long) s30.c());
    private long r;
    private long s;

    public a0(long j, int i, long j2, long j3, int i2, String str, String str2, long j4, long j5, g30 g30, int i3) {
        super(str2, 6, t.WEB_REQUEST, j, i, j2, j3, g30, i3);
        this.p = i2;
        this.o = str;
        this.r = j4;
        this.s = j5;
    }

    @Override // com.dynatrace.android.agent.m
    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(5885));
        sb.append(this.j.d());
        sb.append(C0201.m82(5886));
        sb.append(s30.q(o()));
        sb.append(C0201.m82(5887));
        sb.append(Thread.currentThread().getId());
        sb.append(C0201.m82(5888));
        sb.append(q());
        sb.append(C0201.m82(5889));
        sb.append(this.g);
        sb.append(C0201.m82(5890));
        sb.append(t());
        sb.append(C0201.m82(5891));
        sb.append(this.q);
        sb.append(C0201.m82(5892));
        sb.append(l() - t());
        int i = this.p;
        String r2 = C0201.m82(5893);
        if (i > 0) {
            sb.append(r2);
            sb.append(this.p);
        } else if (this.o != null) {
            sb.append(r2);
            sb.append(s30.q(this.o));
        }
        if (this.r >= 0 && this.s >= 0) {
            sb.append(C0201.m82(5894));
            sb.append(this.r);
            sb.append(C0201.m82(5895));
            sb.append(this.s);
        }
        return sb;
    }
}
