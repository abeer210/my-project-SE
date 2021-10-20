package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: FontData */
public class h {
    public static final h p = new h();
    public final double a;
    public final String b;
    public final j0 c;
    public final ReadableMap d;
    public l0 e;
    public int f;
    public final String g;
    public final String h;
    public final k0 i;
    public final m0 j;
    private final n0 k;
    public final double l;
    public final double m;
    public final double n;
    public final boolean o;

    /* access modifiers changed from: package-private */
    /* compiled from: FontData */
    public static class a {
        private static final l0[] a;
        private static final int[] b = {C0188.f25, C0188.f17, 100, 200, C0188.f19, C0188.f25, C0188.f21, 600, C0188.f17, C0188.f20, C0188.f22};

        static {
            l0 l0Var = l0.w100;
            l0 l0Var2 = l0.w900;
            a = new l0[]{l0Var, l0Var, l0.w200, l0.w300, l0.Normal, l0.w500, l0.w600, l0.Bold, l0.w800, l0Var2, l0Var2};
        }

        private static int a(int i) {
            return i < 350 ? C0188.f25 : i < 550 ? C0188.f17 : i < 900 ? C0188.f22 : i;
        }

        public static int b(l0 l0Var, h hVar) {
            if (l0Var == l0.Bolder) {
                return a(hVar.f);
            }
            if (l0Var == l0.Lighter) {
                return c(hVar.f);
            }
            return b[l0Var.ordinal()];
        }

        private static int c(int i) {
            if (i < 100) {
                return i;
            }
            if (i < 550) {
                return 100;
            }
            return i < 750 ? C0188.f25 : C0188.f17;
        }

        public static l0 d(int i) {
            return a[Math.round(((float) i) / 100.0f)];
        }
    }

    private h() {
        this.d = null;
        String r0 = C0201.m82(25161);
        this.b = r0;
        this.c = j0.normal;
        this.e = l0.Normal;
        this.f = C0188.f25;
        this.g = r0;
        this.h = r0;
        this.i = k0.normal;
        this.j = m0.start;
        this.k = n0.None;
        this.o = false;
        this.l = 0.0d;
        this.a = 12.0d;
        this.m = 0.0d;
        this.n = 0.0d;
    }

    private void a(h hVar, double d2) {
        long round = Math.round(d2);
        if (round < 1 || round > 1000) {
            b(hVar);
            return;
        }
        int i2 = (int) round;
        this.f = i2;
        this.e = a.d(i2);
    }

    private void b(h hVar) {
        this.f = hVar.f;
        this.e = hVar.e;
    }

    private double c(ReadableMap readableMap, String str, double d2, double d3, double d4) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str);
        }
        return v.b(readableMap.getString(str), d4, d2, d3);
    }

    public h(ReadableMap readableMap, h hVar, double d2) {
        double d3 = hVar.a;
        if (readableMap.hasKey(C0201.m82(25162))) {
            this.a = c(readableMap, C0201.m82(25163), 1.0d, d3, d3);
        } else {
            this.a = d3;
        }
        String r0 = C0201.m82(25164);
        if (!readableMap.hasKey(r0)) {
            b(hVar);
        } else if (readableMap.getType(r0) == ReadableType.Number) {
            a(hVar, readableMap.getDouble(r0));
        } else {
            String string = readableMap.getString(r0);
            if (l0.d(string)) {
                int b2 = a.b(l0.b(string), hVar);
                this.f = b2;
                this.e = a.d(b2);
            } else if (string != null) {
                a(hVar, Double.parseDouble(string));
            } else {
                b(hVar);
            }
        }
        String r02 = C0201.m82(25165);
        this.d = readableMap.hasKey(r02) ? readableMap.getMap(r02) : hVar.d;
        String r03 = C0201.m82(25166);
        this.b = readableMap.hasKey(r03) ? readableMap.getString(r03) : hVar.b;
        String r04 = C0201.m82(25167);
        this.c = readableMap.hasKey(r04) ? j0.valueOf(readableMap.getString(r04)) : hVar.c;
        String r05 = C0201.m82(25168);
        this.g = readableMap.hasKey(r05) ? readableMap.getString(r05) : hVar.g;
        String r06 = C0201.m82(25169);
        this.h = readableMap.hasKey(r06) ? readableMap.getString(r06) : hVar.h;
        String r07 = C0201.m82(25170);
        this.i = readableMap.hasKey(r07) ? k0.valueOf(readableMap.getString(r07)) : hVar.i;
        String r08 = C0201.m82(25171);
        this.j = readableMap.hasKey(r08) ? m0.valueOf(readableMap.getString(r08)) : hVar.j;
        String r09 = C0201.m82(25172);
        this.k = readableMap.hasKey(r09) ? n0.b(readableMap.getString(r09)) : hVar.k;
        boolean hasKey = readableMap.hasKey(C0201.m82(25173));
        this.o = hasKey || hVar.o;
        this.l = hasKey ? c(readableMap, C0201.m82(25174), d2, this.a, 0.0d) : hVar.l;
        this.m = readableMap.hasKey(C0201.m82(25175)) ? c(readableMap, C0201.m82(25176), d2, this.a, 0.0d) : hVar.m;
        this.n = readableMap.hasKey(C0201.m82(25177)) ? c(readableMap, C0201.m82(25178), d2, this.a, 0.0d) : hVar.n;
    }
}
