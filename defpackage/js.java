package defpackage;

import defpackage.is;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: js  reason: default package */
/* compiled from: BmpReader */
public class js {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;

    static {
        C0201.m83(js.class, 81);
    }

    public void a(String str, wr wrVar) {
        ur urVar = (ur) wrVar.e(ur.class);
        if (urVar == null) {
            wrVar.a(new ur(str));
        } else {
            urVar.a(str);
        }
    }

    public void b(or orVar, wr wrVar) {
        orVar.s(false);
        d(orVar, wrVar, true);
    }

    public void c(or orVar, is isVar, wr wrVar) {
        try {
            int j = isVar.j(-2);
            long l = orVar.l();
            int f = orVar.f();
            isVar.J(-1, f);
            if (f == 12 && j == 19778) {
                isVar.J(2, orVar.e());
                isVar.J(1, orVar.e());
                isVar.J(3, orVar.p());
                isVar.J(4, orVar.p());
            } else if (f == 12) {
                isVar.J(2, orVar.p());
                isVar.J(1, orVar.p());
                isVar.J(3, orVar.p());
                isVar.J(4, orVar.p());
            } else {
                if (f != 16) {
                    if (f != 64) {
                        if (!(f == 40 || f == 52 || f == 56 || f == 108)) {
                            if (f != 124) {
                                isVar.a(a + f);
                                return;
                            }
                        }
                        isVar.J(2, orVar.f());
                        isVar.J(1, orVar.f());
                        isVar.J(3, orVar.p());
                        isVar.J(4, orVar.p());
                        isVar.J(5, orVar.f());
                        orVar.t(4);
                        isVar.J(6, orVar.f());
                        isVar.J(7, orVar.f());
                        isVar.J(8, orVar.f());
                        isVar.J(9, orVar.f());
                        if (f != 40) {
                            isVar.L(12, orVar.q());
                            isVar.L(13, orVar.q());
                            isVar.L(14, orVar.q());
                            if (f != 52) {
                                isVar.L(15, orVar.q());
                                if (f != 56) {
                                    long q = orVar.q();
                                    isVar.L(16, q);
                                    orVar.t(36);
                                    isVar.L(17, orVar.q());
                                    isVar.L(18, orVar.q());
                                    isVar.L(19, orVar.q());
                                    if (f != 108) {
                                        isVar.J(20, orVar.f());
                                        if (q != is.d.PROFILE_EMBEDDED.b()) {
                                            if (q != is.d.PROFILE_LINKED.b()) {
                                                orVar.t(12);
                                                return;
                                            }
                                        }
                                        long q2 = orVar.q();
                                        int f2 = orVar.f();
                                        long j2 = q2 + l;
                                        if (orVar.l() > j2) {
                                            isVar.a(b + Long.toHexString(j2));
                                            return;
                                        }
                                        orVar.t(j2 - orVar.l());
                                        if (q == is.d.PROFILE_LINKED.b()) {
                                            isVar.R(21, orVar.j(f2, fr.f));
                                            return;
                                        }
                                        new iw().d(new br(orVar.d(f2)), wrVar, isVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                isVar.J(2, orVar.f());
                isVar.J(1, orVar.f());
                isVar.J(3, orVar.p());
                isVar.J(4, orVar.p());
                if (f > 16) {
                    isVar.J(5, orVar.f());
                    orVar.t(4);
                    isVar.J(6, orVar.f());
                    isVar.J(7, orVar.f());
                    isVar.J(8, orVar.f());
                    isVar.J(9, orVar.f());
                    orVar.t(6);
                    isVar.J(10, orVar.p());
                    orVar.t(8);
                    isVar.J(11, orVar.f());
                    orVar.t(4);
                }
            }
        } catch (IOException unused) {
            isVar.a(d);
        } catch (xr unused2) {
            isVar.a(c);
        }
    }

    public void d(or orVar, wr wrVar, boolean z) {
        try {
            int p = orVar.p();
            is isVar = null;
            if (p != 16706) {
                if (p == 17225 || p == 18755 || p == 19778 || p == 20547 || p == 21584) {
                    is isVar2 = new is();
                    try {
                        wrVar.a(isVar2);
                        isVar2.J(-2, p);
                        orVar.t(12);
                        c(orVar, isVar2, wrVar);
                    } catch (IOException unused) {
                        isVar = isVar2;
                    }
                } else {
                    try {
                        wrVar.a(new ur(C0201.m82(25398) + Integer.toHexString(p)));
                    } catch (IOException unused2) {
                        String r8 = C0201.m82(25401);
                        if (isVar == null) {
                            a(r8, wrVar);
                        } else {
                            isVar.a(r8);
                        }
                    }
                }
            } else if (!z) {
                a(C0201.m82(25399), wrVar);
            } else {
                orVar.t(4);
                long q = orVar.q();
                orVar.t(4);
                d(orVar, wrVar, false);
                if (q != 0) {
                    if (orVar.l() > q) {
                        a(C0201.m82(25400), wrVar);
                        return;
                    }
                    orVar.t(q - orVar.l());
                    d(orVar, wrVar, true);
                }
            }
        } catch (IOException e) {
            wrVar.a(new ur(C0201.m82(25402) + e.getMessage()));
        }
    }
}
