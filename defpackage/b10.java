package defpackage;

import java.io.IOException;
import java.util.List;
import vigqyno.C0201;

/* renamed from: b10  reason: default package */
/* compiled from: PngDescriptor */
public class b10 extends as<c10> {
    public b10(c10 c10) {
        super(c10);
    }

    public String A() {
        return m(10, C0201.m82(1043), C0201.m82(1044), C0201.m82(1045), C0201.m82(1046));
    }

    public String B() {
        return m(9, null, C0201.m82(1047));
    }

    public String C() {
        Object o = ((c10) this.a).o(13);
        if (o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (jr jrVar : (List) o) {
            if (sb.length() != 0) {
                sb.append('\n');
            }
            sb.append(String.format(C0201.m82(1048), jrVar.a(), jrVar.b()));
        }
        return sb.toString();
    }

    public String D() {
        return m(18, C0201.m82(1049), C0201.m82(1050));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 4) {
            return w();
        }
        if (i == 5) {
            return x();
        }
        if (i == 6) {
            return y();
        }
        if (i == 7) {
            return z();
        }
        if (i == 9) {
            return B();
        }
        if (i == 10) {
            return A();
        }
        if (i == 13) {
            return C();
        }
        if (i == 15) {
            return v();
        }
        if (i != 18) {
            return super.f(i);
        }
        return D();
    }

    public String v() {
        byte[] e = ((c10) this.a).e(15);
        Integer l = ((c10) this.a).l(4);
        if (!(e == null || l == null)) {
            nr nrVar = new nr(e);
            try {
                int intValue = l.intValue();
                if (intValue != 0) {
                    if (intValue == 6 || intValue == 2) {
                        return String.format(C0201.m82(1052), Integer.valueOf(nrVar.p()), Integer.valueOf(nrVar.p()), Integer.valueOf(nrVar.p()));
                    } else if (intValue == 3) {
                        return String.format(C0201.m82(1051), Short.valueOf(nrVar.r()));
                    } else if (intValue != 4) {
                        return null;
                    }
                }
                return String.format(C0201.m82(1053), Integer.valueOf(nrVar.p()));
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public String w() {
        hq b;
        Integer l = ((c10) this.a).l(4);
        if (l == null || (b = hq.b(l.intValue())) == null) {
            return null;
        }
        return b.d();
    }

    public String x() {
        return m(5, C0201.m82(1054));
    }

    public String y() {
        return m(6, C0201.m82(1055));
    }

    public String z() {
        return m(7, C0201.m82(1056), C0201.m82(1057));
    }
}
