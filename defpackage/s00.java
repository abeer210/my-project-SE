package defpackage;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: s00  reason: default package */
/* compiled from: PhotoshopDescriptor */
public class s00 extends as<t00> {
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;

    static {
        C0201.m83(s00.class, 118);
    }

    public s00(t00 t00) {
        super(t00);
    }

    private String E(int i2) {
        byte[] e2 = ((t00) this.a).e(i2);
        if (e2 == null) {
            return null;
        }
        return new String(e2);
    }

    private String v(int i2) {
        byte[] e2 = ((t00) this.a).e(i2);
        if (e2 == null) {
            return null;
        }
        br brVar = new br(e2);
        try {
            return String.format(C0201.m82(38839), Integer.valueOf(brVar.h(0)));
        } catch (IOException unused) {
            return null;
        }
    }

    private String w(int i2) {
        byte[] e2 = ((t00) this.a).e(i2);
        if (e2 == null) {
            return null;
        }
        return String.format(C0201.m82(38840), Integer.valueOf(e2.length));
    }

    private String x(int i2) {
        byte[] e2 = ((t00) this.a).e(i2);
        if (e2 == null || e2.length == 0) {
            return null;
        }
        return e2[0] == 0 ? C0201.m82(38841) : C0201.m82(38842);
    }

    public String A(int i2) {
        String str;
        String str2;
        int i3;
        int i4;
        r00 r00;
        z00 z00;
        br brVar;
        r00 r002;
        String str3 = t;
        String str4 = b;
        String str5 = l;
        try {
            byte[] e2 = ((t00) this.a).e(i2);
            if (e2 == null) {
                return null;
            }
            br brVar2 = new br(e2);
            short s2 = 1;
            int k2 = ((int) ((brVar2.k() - ((long) brVar2.b(((int) brVar2.k()) - 1))) - 1)) / 26;
            z00 z002 = new z00();
            z00 z003 = new z00();
            ArrayList arrayList = new ArrayList();
            String str6 = null;
            int i5 = 0;
            while (i5 < k2) {
                int i6 = i5 * 26;
                try {
                    short f2 = brVar2.f(i6);
                    if (f2 != 0) {
                        i3 = i5;
                        String str7 = m;
                        String str8 = c;
                        if (f2 == s2 || f2 == 2) {
                            str2 = str3;
                            str = str4;
                            i4 = k2;
                            br brVar3 = brVar2;
                            if (f2 == 1) {
                                r00 = new r00(str7);
                            } else {
                                r00 = new r00(str8);
                            }
                            int i7 = 0;
                            while (i7 < 6) {
                                int i8 = i7 * 4;
                                double j2 = (double) brVar3.j(i8 + 2 + i6);
                                double g2 = (double) brVar3.g(i8 + 3 + i6);
                                double pow = Math.pow(2.0d, 24.0d);
                                Double.isNaN(g2);
                                Double.isNaN(j2);
                                r00.c(i7, j2 + (g2 / pow));
                                i7++;
                                i6 = i6;
                                brVar3 = brVar3;
                            }
                            brVar2 = brVar3;
                            z002 = z002;
                            z002.a(r00);
                        } else {
                            if (f2 != 3) {
                                short s3 = 4;
                                if (f2 != 4) {
                                    if (f2 != 5) {
                                        if (f2 == 8) {
                                            str6 = brVar2.f(i6 + 2) == 1 ? n : g;
                                        }
                                        str2 = str3;
                                        str = str4;
                                        i4 = k2;
                                    } else {
                                        s3 = 4;
                                    }
                                }
                                if (f2 == s3) {
                                    r002 = new r00(str7);
                                } else {
                                    r002 = new r00(str8);
                                }
                                int i9 = 0;
                                while (i9 < 6) {
                                    int i10 = i9 * 4;
                                    double j3 = (double) brVar2.j(i10 + 2 + i6);
                                    double g3 = (double) brVar2.g(i10 + 3 + i6);
                                    double pow2 = Math.pow(2.0d, 24.0d);
                                    Double.isNaN(g3);
                                    Double.isNaN(j3);
                                    r002.c(i9, j3 + (g3 / pow2));
                                    i9++;
                                    k2 = k2;
                                    str3 = str3;
                                    str4 = str4;
                                    brVar2 = brVar2;
                                    z002 = z002;
                                }
                                str2 = str3;
                                str = str4;
                                i4 = k2;
                                brVar = brVar2;
                                z00 = z002;
                                z003.a(r002);
                            } else {
                                str2 = str3;
                                str = str4;
                                i4 = k2;
                                brVar = brVar2;
                                z00 = z002;
                                if (z003.d() != 0) {
                                    arrayList.add(z003);
                                }
                                z003 = new z00(d);
                            }
                            brVar2 = brVar;
                            z002 = z00;
                        }
                    } else {
                        str2 = str3;
                        str = str4;
                        i4 = k2;
                        i3 = i5;
                        if (z002.d() != 0) {
                            arrayList.add(z002);
                        }
                        z002 = new z00(k);
                    }
                    i5 = i3 + 1;
                    k2 = i4;
                    str3 = str2;
                    str4 = str;
                    s2 = 1;
                } catch (Exception unused) {
                    return null;
                }
            }
            String str9 = str3;
            String str10 = str4;
            if (z002.d() != 0) {
                arrayList.add(z002);
            }
            if (z003.d() != 0) {
                arrayList.add(z003);
            }
            byte b2 = brVar2.b(((int) brVar2.k()) - 1);
            String q2 = brVar2.q((((int) brVar2.k()) - b2) - 1, b2, fr.c);
            StringBuilder sb = new StringBuilder();
            sb.append('\"');
            sb.append(q2);
            sb.append('\"');
            sb.append(r);
            if (str6 != null) {
                sb.append(f);
                sb.append(str6);
                sb.append(e);
            }
            sb.append(arrayList.size());
            sb.append(arrayList.size() == 1 ? h : s);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z00 z004 = (z00) it.next();
                sb.append(j);
                sb.append(z004.c());
                sb.append(p);
                sb.append(arrayList.size());
                sb.append(arrayList.size() == 1 ? q : o);
                for (r00 r003 : z004.b()) {
                    sb.append(i);
                    sb.append(r003.b());
                    sb.append(str5);
                    sb.append(r003.a(0));
                    sb.append(str10);
                    sb.append(r003.a(1));
                    sb.append(str9);
                    sb.append(str5);
                    sb.append(r003.a(2));
                    sb.append(str10);
                    sb.append(r003.a(3));
                    sb.append(str9);
                    sb.append(str5);
                    sb.append(r003.a(4));
                    sb.append(str10);
                    sb.append(r003.a(5));
                    sb.append(str9);
                    str10 = str10;
                    str9 = str9;
                }
            }
            return sb.toString();
        } catch (Exception unused2) {
            return null;
        }
    }

    public String B() {
        try {
            byte[] e2 = ((t00) this.a).e(1064);
            if (e2 == null) {
                return null;
            }
            return Double.toString(new br(e2).d(4));
        } catch (Exception unused) {
            return null;
        }
    }

    public String C() {
        try {
            byte[] e2 = ((t00) this.a).e(1062);
            if (e2 == null) {
                return null;
            }
            br brVar = new br(e2);
            int h2 = brVar.h(0);
            float e3 = brVar.e(2);
            float e4 = brVar.e(6);
            float e5 = brVar.e(10);
            if (h2 == 0) {
                return C0201.m82(38846) + e5;
            } else if (h2 == 1) {
                return C0201.m82(38845);
            } else {
                if (h2 != 2) {
                    return String.format(C0201.m82(38843), Integer.valueOf(h2), Float.valueOf(e3), Float.valueOf(e4), Float.valueOf(e5));
                }
                return String.format(C0201.m82(38844), Float.valueOf(e3), Float.valueOf(e4), Float.valueOf(e5));
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public String D() {
        try {
            byte[] e2 = ((t00) this.a).e(1005);
            if (e2 == null) {
                return null;
            }
            br brVar = new br(e2);
            float o2 = brVar.o(0);
            float o3 = brVar.o(8);
            DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(38847));
            return decimalFormat.format((double) o2) + C0201.m82(38848) + decimalFormat.format((double) o3) + C0201.m82(38849);
        } catch (Exception unused) {
            return null;
        }
    }

    public String F() {
        try {
            byte[] e2 = ((t00) this.a).e(1050);
            if (e2 == null) {
                return null;
            }
            br brVar = new br(e2);
            int h2 = brVar.h(20) * 2;
            String p2 = brVar.p(24, h2, C0201.m82(38850));
            int h3 = brVar.h(h2 + 24);
            return String.format(C0201.m82(38851), p2, Integer.valueOf(brVar.h(4)), Integer.valueOf(brVar.h(8)), Integer.valueOf(brVar.h(12)), Integer.valueOf(brVar.h(16)), Integer.valueOf(h3));
        } catch (IOException unused) {
            return null;
        }
    }

    public String G(int i2) {
        try {
            byte[] e2 = ((t00) this.a).e(i2);
            if (e2 == null) {
                return null;
            }
            br brVar = new br(e2);
            int h2 = brVar.h(0);
            int h3 = brVar.h(4);
            int h4 = brVar.h(8);
            int h5 = brVar.h(16);
            int h6 = brVar.h(20);
            int h7 = brVar.h(24);
            String r8 = C0201.m82(38852);
            Object[] objArr = new Object[6];
            objArr[0] = h2 == 1 ? C0201.m82(38853) : C0201.m82(38854);
            objArr[1] = Integer.valueOf(h3);
            objArr[2] = Integer.valueOf(h4);
            objArr[3] = Integer.valueOf(h5);
            objArr[4] = Integer.valueOf(h7);
            objArr[5] = Integer.valueOf(h6);
            return String.format(r8, objArr);
        } catch (IOException unused) {
            return null;
        }
    }

    public String H() {
        String r0 = C0201.m82(38855);
        try {
            byte[] e2 = ((t00) this.a).e(1057);
            if (e2 == null) {
                return null;
            }
            br brVar = new br(e2);
            int h2 = brVar.h(0);
            int h3 = brVar.h(5) * 2;
            String p2 = brVar.p(9, h3, r0);
            int i2 = 9 + h3;
            int h4 = brVar.h(i2);
            int i3 = i2 + 4;
            int i4 = h4 * 2;
            String p3 = brVar.p(i3, i4, r0);
            int h5 = brVar.h(i3 + i4);
            return String.format(C0201.m82(38856), Integer.valueOf(h2), p2, p3, Integer.valueOf(h5));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.as
    public String f(int i2) {
        if (i2 != 1002) {
            if (i2 == 1005) {
                return D();
            }
            if (i2 == 1028) {
                return w(i2);
            }
            if (i2 == 1030) {
                return z();
            }
            if (!(i2 == 1044 || i2 == 1054)) {
                if (i2 == 1057) {
                    return H();
                }
                if (i2 == 1062) {
                    return C();
                }
                if (i2 == 1064) {
                    return B();
                }
                if (i2 == 2999) {
                    return y(i2);
                }
                if (i2 != 1049) {
                    if (i2 == 1050) {
                        return F();
                    }
                    switch (i2) {
                        case 1033:
                        case 1036:
                            return G(i2);
                        case 1034:
                            return x(i2);
                        case 1035:
                            break;
                        case 1037:
                            break;
                        default:
                            if (i2 < 2000 || i2 > 2998) {
                                return super.f(i2);
                            }
                            return A(i2);
                    }
                }
            }
            return v(i2);
        }
        return E(i2);
    }

    public String y(int i2) {
        try {
            byte[] e2 = ((t00) this.a).e(i2);
            if (e2 == null) {
                return null;
            }
            br brVar = new br(e2);
            return new String(brVar.c(1, brVar.b(0)), C0201.m82(38857));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[Catch:{ IOException -> 0x00e2 }] */
    public String z() {
        String str;
        try {
            byte[] e2 = ((t00) this.a).e(1030);
            if (e2 == null) {
                return ((t00) this.a).r(1030);
            }
            br brVar = new br(e2);
            int s2 = brVar.s(0);
            int s3 = brVar.s(2);
            int s4 = brVar.s(4);
            int i2 = (s2 > 65535 || s2 < 65533) ? s2 <= 8 ? s2 + 4 : s2 : s2 - 65532;
            switch (s2) {
                case 0:
                    str = C0201.m82(38862);
                    break;
                case 1:
                case 2:
                case 3:
                    str = C0201.m82(38861);
                    break;
                case 4:
                case 5:
                    str = C0201.m82(38860);
                    break;
                case 6:
                case 7:
                case 8:
                    str = C0201.m82(38859);
                    break;
                default:
                    switch (s2) {
                        case 65533:
                        case 65534:
                        case 65535:
                            break;
                        default:
                            str = C0201.m82(38858);
                            break;
                    }
            }
            String r7 = C0201.m82(38863);
            return String.format(C0201.m82(38868), Integer.valueOf(i2), str, s3 != 0 ? s3 != 1 ? s3 != 257 ? String.format(r7, Integer.valueOf(s3)) : C0201.m82(38864) : C0201.m82(38865) : C0201.m82(38866), (s4 < 1 || s4 > 3) ? String.format(r7, Integer.valueOf(s4)) : String.format(C0201.m82(38867), Integer.valueOf(s4 + 2)));
        } catch (IOException unused) {
            return null;
        }
    }
}
