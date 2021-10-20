package defpackage;

import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: j9  reason: default package */
public class j9 implements v8 {
    private l9 a;

    public j9() {
        this.a = new l9(null, null, null);
    }

    public j9(l9 l9Var) {
        this.a = l9Var;
    }

    @Override // defpackage.v8
    public u8 H0(String str, String str2, u9 u9Var) throws t8 {
        return new i9(this, str, str2, u9Var);
    }

    public l9 a() {
        return this.a;
    }

    public void b(String str) {
    }

    @Override // java.lang.Object
    public Object clone() {
        return new j9((l9) this.a.clone());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r2 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        if (r8.p() <= 1) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        r8.X(r2);
        r8.b(1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        r10 = defpackage.m9.b(r8, r10, r11);
        r0 = ((java.lang.Integer) r10[0]).intValue();
        r10 = (defpackage.l9) r10[1];
        r3 = r4.equals(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        if (r0 == 0) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d1, code lost:
        if (r0 == 1) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        if (r0 == 2) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        if (r0 == 3) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r0 == 4) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        if (r0 != 5) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        defpackage.m9.a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        if (r3 == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f4, code lost:
        throw new defpackage.t8(vigqyno.C0201.m82(21203), 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
        if (r2 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        if (r8.p() != 1) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fd, code lost:
        r2.o0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        defpackage.m9.a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        defpackage.m9.a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0108, code lost:
        if (r3 == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010c, code lost:
        if (r9 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010e, code lost:
        if (r2 == r10) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0110, code lost:
        if (r2 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011e, code lost:
        if (r2.I().equals(r10.I()) == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0120, code lost:
        r2.o0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0123, code lost:
        r10.o0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0127, code lost:
        if (r3 != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0129, code lost:
        if (r9 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012b, code lost:
        if (r2 == r10) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012d, code lost:
        if (r2 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013b, code lost:
        if (r2.I().equals(r10.I()) == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013e, code lost:
        r10 = r8.S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0146, code lost:
        if (r10.hasNext() == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0148, code lost:
        r11 = (defpackage.l9) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014e, code lost:
        if (r11 == r2) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        r0 = r11.I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0154, code lost:
        if (r2 == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0156, code lost:
        r3 = r2.I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015b, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0160, code lost:
        if (r0.equals(r3) != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0163, code lost:
        r11.o0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0167, code lost:
        if (r2 == null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0169, code lost:
        r2.o0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016d, code lost:
        defpackage.m9.a(r8, r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0170, code lost:
        if (r3 != false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0172, code lost:
        defpackage.m9.a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0175, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0176, code lost:
        if (r9 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017c, code lost:
        if (r8.p() != 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017e, code lost:
        defpackage.m9.a(r8, r4, r12);
     */
    @Override // defpackage.v8
    public void g0(String str, String str2, String str3, String str4, String str5, x9 x9Var) throws t8 {
        l9 l9Var;
        boolean z;
        d9.e(str);
        d9.a(str2);
        d9.f(str4);
        String h = str3 != null ? g9.h(str3) : null;
        String h2 = g9.h(str4);
        l9 g = m9.g(this.a, r9.a(str, str2), true, new x9(7680));
        if (g != null) {
            if (!g.v().j()) {
                if (g.J() || !g.v().k()) {
                    throw new t8(C0201.m82(21199), 102);
                }
                g.v().t(true);
            }
            Iterator S = g.S();
            while (true) {
                boolean hasNext = S.hasNext();
                String r4 = C0201.m82(21200);
                if (!hasNext) {
                    l9Var = null;
                    z = false;
                    break;
                }
                l9Var = (l9) S.next();
                if (!l9Var.K()) {
                    break;
                }
                if (C0201.m82(21201).equals(l9Var.A(1).t())) {
                    if (r4.equals(l9Var.A(1).I())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            throw new t8(C0201.m82(21202), 102);
        }
        throw new t8(C0201.m82(21204), 102);
    }

    @Override // defpackage.v8
    public u8 iterator() throws t8 {
        return H0(null, null, null);
    }
}
