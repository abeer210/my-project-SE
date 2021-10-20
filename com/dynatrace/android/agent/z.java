package com.dynatrace.android.agent;

import vigqyno.C0201;

/* compiled from: VisitSegment */
public class z extends m {
    public z(g30 g30, int i) {
        super(C0201.m82(2300), 5, t.VISIT_END, 0, g30, i);
    }

    public static z E(g30 g30, int i) {
        z zVar = new z(g30, i);
        zVar.D(g30.d());
        return zVar;
    }

    @Override // com.dynatrace.android.agent.m
    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(2301));
        sb.append(this.j.d());
        sb.append(C0201.m82(2302));
        sb.append(Thread.currentThread().getId());
        sb.append(C0201.m82(2303));
        sb.append(q());
        sb.append(C0201.m82(2304));
        sb.append(n() + 100);
        sb.append(C0201.m82(2305));
        sb.append(t());
        return sb;
    }
}
