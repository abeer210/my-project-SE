package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* compiled from: InterpolationAnimatedNode */
public class i extends s {
    private static final Pattern t = Pattern.compile(C0201.m82(29116));
    private final double[] i;
    private final double[] j;
    private String k;
    private double[][] l;
    private final boolean m;
    private final Matcher n;
    private final String o;
    private final String p;
    private s q;
    private boolean r;
    private int s;

    public i(ReadableMap readableMap) {
        this.i = m(readableMap.getArray(C0201.m82(29117)));
        ReadableArray array = readableMap.getArray(C0201.m82(29118));
        boolean z = array.getType(0) == ReadableType.String;
        this.m = z;
        if (z) {
            int size = array.size();
            this.j = new double[size];
            String string = array.getString(0);
            this.k = string;
            this.r = string.startsWith(C0201.m82(29119));
            this.n = t.matcher(this.k);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                Matcher matcher = t.matcher(array.getString(i2));
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                while (matcher.find()) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                this.j[i2] = ((Double) arrayList2.get(0)).doubleValue();
            }
            int size2 = ((ArrayList) arrayList.get(0)).size();
            this.s = size2;
            this.l = new double[size2][];
            for (int i3 = 0; i3 < this.s; i3++) {
                double[] dArr = new double[size];
                this.l[i3] = dArr;
                for (int i4 = 0; i4 < size; i4++) {
                    dArr[i4] = ((Double) ((ArrayList) arrayList.get(i4)).get(i3)).doubleValue();
                }
            }
        } else {
            this.j = m(array);
            this.n = null;
        }
        this.o = readableMap.getString(C0201.m82(29120));
        this.p = readableMap.getString(C0201.m82(29121));
    }

    private static int l(double d, double[] dArr) {
        int i2 = 1;
        while (i2 < dArr.length - 1 && dArr[i2] < d) {
            i2++;
        }
        return i2 - 1;
    }

    private static double[] m(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = readableArray.getDouble(i2);
        }
        return dArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        if (r26.equals(r5) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6  */
    private static double n(double d, double d2, double d3, double d4, double d5, String str, String str2) {
        double d6;
        char c;
        char c2 = 0;
        String r3 = C0201.m82(29122);
        String r4 = C0201.m82(29123);
        String r5 = C0201.m82(29124);
        String r6 = C0201.m82(29125);
        if (d < d2) {
            int hashCode = str.hashCode();
            if (hashCode != -1289044198) {
                if (hashCode != -135761730) {
                    if (hashCode == 94742715 && str.equals(r4)) {
                        c = 1;
                        if (c != 0) {
                            return d;
                        }
                        if (c == 1) {
                            d6 = d2;
                            if (d6 > d3) {
                                int hashCode2 = str2.hashCode();
                                if (hashCode2 != -1289044198) {
                                    if (hashCode2 != -135761730) {
                                        if (hashCode2 == 94742715 && str2.equals(r4)) {
                                            c2 = 1;
                                            if (c2 == 0) {
                                                return d6;
                                            }
                                            if (c2 == 1) {
                                                d6 = d3;
                                            } else if (c2 != 2) {
                                                throw new JSApplicationIllegalArgumentException(r3 + str2 + C0201.m82(29127));
                                            }
                                        }
                                    }
                                } else if (str2.equals(r6)) {
                                    c2 = 2;
                                    if (c2 == 0) {
                                    }
                                }
                                c2 = 65535;
                                if (c2 == 0) {
                                }
                            }
                            if (d4 != d5) {
                                return d4;
                            }
                            if (d2 == d3) {
                                return d <= d2 ? d4 : d5;
                            }
                            return d4 + (((d5 - d4) * (d6 - d2)) / (d3 - d2));
                        } else if (c != 2) {
                            throw new JSApplicationIllegalArgumentException(r3 + str + C0201.m82(29126));
                        }
                    }
                } else if (str.equals(r5)) {
                    c = 0;
                    if (c != 0) {
                    }
                }
            } else if (str.equals(r6)) {
                c = 2;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        d6 = d;
        if (d6 > d3) {
        }
        if (d4 != d5) {
        }
    }

    public static double o(double d, double[] dArr, double[] dArr2, String str, String str2) {
        int l2 = l(d, dArr);
        int i2 = l2 + 1;
        return n(d, dArr[l2], dArr[i2], dArr2[l2], dArr2[i2], str, str2);
    }

    @Override // com.facebook.react.animated.b
    public void b(b bVar) {
        if (this.q != null) {
            throw new IllegalStateException(C0201.m82(29129));
        } else if (bVar instanceof s) {
            this.q = (s) bVar;
        } else {
            throw new IllegalArgumentException(C0201.m82(29128));
        }
    }

    @Override // com.facebook.react.animated.b
    public void c(b bVar) {
        if (bVar == this.q) {
            this.q = null;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(29130));
    }

    @Override // com.facebook.react.animated.b
    public void e() {
        String str;
        s sVar = this.q;
        if (sVar != null) {
            double i2 = sVar.i();
            double o2 = o(i2, this.i, this.j, this.o, this.p);
            this.f = o2;
            if (!this.m) {
                return;
            }
            if (this.s > 1) {
                StringBuffer stringBuffer = new StringBuffer(this.k.length());
                this.n.reset();
                int i3 = 0;
                while (this.n.find()) {
                    int i4 = i3 + 1;
                    double o3 = o(i2, this.i, this.l[i3], this.o, this.p);
                    if (this.r) {
                        boolean z = i4 == 4;
                        if (z) {
                            o3 *= 1000.0d;
                        }
                        int round = (int) Math.round(o3);
                        if (z) {
                            double d = (double) round;
                            Double.isNaN(d);
                            str = Double.toString(d / 1000.0d);
                        } else {
                            str = Integer.toString(round);
                        }
                        this.n.appendReplacement(stringBuffer, str);
                    } else {
                        int i5 = (int) o3;
                        this.n.appendReplacement(stringBuffer, ((double) i5) != o3 ? Double.toString(o3) : Integer.toString(i5));
                    }
                    i3 = i4;
                }
                this.n.appendTail(stringBuffer);
                this.e = stringBuffer.toString();
                return;
            }
            this.e = this.n.replaceFirst(String.valueOf(o2));
        }
    }
}
