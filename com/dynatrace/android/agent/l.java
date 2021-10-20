package com.dynatrace.android.agent;

import vigqyno.C0201;

/* compiled from: CrashSegment */
public class l extends s {

    /* compiled from: CrashSegment */
    public static class a {
        public String a(String str) {
            int indexOf = str.indexOf(C0201.m82(12999));
            if (indexOf < 0) {
                return str;
            }
            int indexOf2 = str.indexOf(C0201.m82(13000), indexOf + 1);
            if (indexOf2 < 0) {
                indexOf2 = str.length();
            }
            return str.replace(str.substring(indexOf, indexOf2), C0201.m82(13001));
        }
    }

    public l(String str, String str2, String str3, long j, g30 g30, int i, String str4) {
        super(str, 11, t.CRASH, str, str2, str3, j, g30, i, str4);
    }

    @Override // com.dynatrace.android.agent.s, com.dynatrace.android.agent.m
    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(3144));
        sb.append(this.j.d());
        sb.append(C0201.m82(3145));
        sb.append(s30.q(o()));
        sb.append(C0201.m82(3146));
        sb.append(Thread.currentThread().getId());
        sb.append(C0201.m82(3147));
        sb.append(q());
        sb.append(C0201.m82(3148));
        sb.append(this.g);
        sb.append(C0201.m82(3149));
        sb.append(t());
        h(sb, C0201.m82(3150), s30.q(this.p));
        h(sb, C0201.m82(3151), s30.q(this.q));
        sb.append(C0201.m82(3152));
        sb.append(this.r);
        return sb;
    }
}
