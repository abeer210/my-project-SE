package com.dynatrace.android.agent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import vigqyno.C0201;

/* compiled from: LcAction */
public class v extends o {
    private static final String G = (u.b + C0201.m82(2149));
    private long A = -1;
    private long B = -1;
    private long C = -1;
    private int D = -1;
    private int E = -1;
    private int F = -1;
    private String z = C0201.m82(2150);

    /* access modifiers changed from: package-private */
    /* compiled from: LcAction */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            int[] iArr = new int[e30.values().length];
            b = iArr;
            try {
                iArr[e30.onActivityCreate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e30.onActivityStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b[e30.onActivityResume.ordinal()] = 3;
            try {
                b[e30.onActivityPostResume.ordinal()] = 4;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[t.values().length];
            a = iArr2;
            iArr2[t.APP_START.ordinal()] = 1;
            a[t.DISPLAY.ordinal()] = 2;
            try {
                a[t.REDISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private v(String str, t tVar, long j, g30 g30, int i) {
        super(str, tVar, j, g30, i);
    }

    public static v Y(String str, t tVar, p pVar) {
        int i;
        g30 g30;
        long j;
        if (pVar == null || pVar.x()) {
            g30 = g30.b(false, false);
            i = b.d().c;
            j = 0;
        } else {
            j = pVar.u();
            g30 = pVar.h;
            i = pVar.i;
        }
        String r15 = (str == null || str.isEmpty()) ? C0201.m82(2151) : str;
        v vVar = new v(r15, tVar, j, g30, i);
        if (j != 0) {
            vVar.q = pVar;
            vVar.u = pVar.u + 1;
            pVar.E(vVar);
            if (vVar.u >= 10) {
                if (u.c) {
                    s30.r(G, C0201.m82(2152) + vVar.o() + C0201.m82(2153));
                }
                return vVar;
            }
        }
        a.a(vVar);
        j.a(r15, 1, j, vVar, g30, i, new String[0]);
        return vVar;
    }

    private String Z() {
        return this.z;
    }

    private int a0() {
        return this.D;
    }

    private long b0() {
        return this.A;
    }

    private int c0() {
        return this.F;
    }

    private long d0() {
        return this.C;
    }

    private int e0() {
        return this.E;
    }

    private long f0() {
        return this.B;
    }

    private void g0() {
        Vector<m> K = K();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(e30.onActivityCreate);
        arrayList.add(e30.onActivityStart);
        arrayList.add(e30.onActivityResume);
        arrayList.add(e30.onActivityPostResume);
        if (u.c) {
            String str = G;
            s30.r(str, K.size() + C0201.m82(2154) + o());
        }
        Iterator<m> it = K.iterator();
        while (it.hasNext()) {
            m next = it.next();
            e30 e30 = null;
            if (u.c) {
                String str2 = G;
                s30.r(str2, C0201.m82(2155) + next.o());
            }
            try {
                e30 = e30.valueOf(next.o());
            } catch (IllegalArgumentException unused) {
            }
            if (e30 != null && arrayList.contains(e30)) {
                if (u.c) {
                    s30.r(G, String.format(C0201.m82(2156), next.o()));
                }
                hashMap.put(e30, next);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            long t = ((m) entry.getValue()).t();
            int n = ((m) entry.getValue()).n();
            int i = a.b[((e30) entry.getKey()).ordinal()];
            if (i == 1) {
                j0(t);
                i0(n);
            } else if (i == 2) {
                o0(t);
                n0(n);
            } else if (i == 3) {
                m0(t);
                l0(n);
            } else if (i == 4) {
                k0(n);
            }
        }
    }

    private void i0(int i) {
        this.D = i;
    }

    private void j0(long j) {
        this.A = j;
    }

    private void k0(int i) {
    }

    private void l0(int i) {
        this.F = i;
    }

    private void m0(long j) {
        this.C = j;
    }

    private void n0(int i) {
        this.E = i;
    }

    private void o0(long j) {
        this.B = j;
    }

    @Override // com.dynatrace.android.agent.o
    public boolean O() {
        if (x()) {
            return false;
        }
        return j.o();
    }

    public void X(String str) {
        E(new m(str, 120, t.PLACEHOLDER, u(), this.h, this.i));
    }

    @Override // com.dynatrace.android.agent.n, com.dynatrace.android.agent.o
    public void c() {
        if (!x()) {
            g0();
            int i = a.a[m().ordinal()];
            if (i == 1) {
                u30.n().d(this);
            } else if (i == 2 || i == 3) {
                u30.n().e(this);
            }
            super.c();
        }
    }

    public void h0(String str) {
        this.z = str;
    }

    @Override // com.dynatrace.android.agent.o, com.dynatrace.android.agent.m
    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(2157));
        sb.append(m().d());
        int i = a.a[m().ordinal()];
        String r3 = C0201.m82(2158);
        String r4 = C0201.m82(2159);
        String r5 = C0201.m82(2160);
        String r6 = C0201.m82(2161);
        String r7 = C0201.m82(2162);
        String r8 = C0201.m82(2163);
        String r9 = C0201.m82(2164);
        String r10 = C0201.m82(2165);
        if (i != 1) {
            String r11 = C0201.m82(2166);
            String r12 = C0201.m82(2167);
            String r13 = C0201.m82(2168);
            String r14 = C0201.m82(2169);
            if (i == 2) {
                sb.append(r10);
                sb.append(s30.q(Z()));
                sb.append(r9);
                sb.append(Thread.currentThread().getId());
                sb.append(r8);
                sb.append(u());
                sb.append(r7);
                sb.append(q());
                sb.append(r6);
                sb.append(n());
                sb.append(r5);
                sb.append(t());
                long b0 = b0() - t();
                if (a0() >= 0 && b0 >= 0) {
                    sb.append(r4);
                    sb.append(a0());
                    sb.append(r3);
                    sb.append(b0);
                }
                long f0 = f0() - t();
                if (e0() >= 0 && f0 >= 0) {
                    sb.append(r14);
                    sb.append(e0());
                    sb.append(r13);
                    sb.append(f0);
                }
                long d0 = d0() - t();
                if (c0() >= 0 && d0 >= 0) {
                    sb.append(r12);
                    sb.append(c0());
                    sb.append(r11);
                    sb.append(d0);
                }
            } else if (i == 3) {
                sb.append(r10);
                sb.append(s30.q(Z()));
                sb.append(r9);
                sb.append(Thread.currentThread().getId());
                sb.append(r8);
                sb.append(u());
                sb.append(r7);
                sb.append(q());
                sb.append(r6);
                sb.append(n());
                sb.append(r5);
                sb.append(t());
                long f02 = f0() - t();
                if (e0() >= 0 && f02 >= 0) {
                    sb.append(r14);
                    sb.append(e0());
                    sb.append(r13);
                    sb.append(f02);
                }
                long d02 = d0() - t();
                if (c0() >= 0 && d02 >= 0) {
                    sb.append(r12);
                    sb.append(c0());
                    sb.append(r11);
                    sb.append(d02);
                }
            }
        } else {
            if (Z() != null && !Z().equals(C0201.m82(2170))) {
                sb.append(r10);
                sb.append(s30.q(Z()));
            }
            sb.append(r9);
            sb.append(Thread.currentThread().getId());
            sb.append(r8);
            sb.append(u());
            sb.append(r7);
            sb.append(q());
            sb.append(r6);
            sb.append(n());
            sb.append(r5);
            sb.append(t());
            sb.append(r4);
            sb.append(s30.c());
            sb.append(r3);
            sb.append(this.h.d() - t());
        }
        return sb;
    }
}
