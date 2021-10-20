package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: SVGLength */
public class b0 {
    public final double a;
    public final b b;

    /* access modifiers changed from: package-private */
    /* compiled from: SVGLength */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            iArr[ReadableType.Number.ordinal()] = 1;
            a[ReadableType.String.ordinal()] = 2;
            try {
                a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: SVGLength */
    public enum b {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    private b0() {
        this.a = 0.0d;
        this.b = b.UNKNOWN;
    }

    public static ArrayList<b0> a(Dynamic dynamic) {
        int i = a.a[dynamic.getType().ordinal()];
        if (i == 1) {
            ArrayList<b0> arrayList = new ArrayList<>(1);
            arrayList.add(new b0(dynamic.asDouble()));
            return arrayList;
        } else if (i == 2) {
            ArrayList<b0> arrayList2 = new ArrayList<>(1);
            arrayList2.add(new b0(dynamic.asString()));
            return arrayList2;
        } else if (i != 3) {
            return null;
        } else {
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            ArrayList<b0> arrayList3 = new ArrayList<>(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList3.add(b(asArray.getDynamic(i2)));
            }
            return arrayList3;
        }
    }

    public static b0 b(Dynamic dynamic) {
        int i = a.a[dynamic.getType().ordinal()];
        if (i == 1) {
            return new b0(dynamic.asDouble());
        }
        if (i != 2) {
            return new b0();
        }
        return new b0(dynamic.asString());
    }

    public static String c(Dynamic dynamic) {
        int i = a.a[dynamic.getType().ordinal()];
        if (i == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public b0(double d) {
        this.a = d;
        this.b = b.NUMBER;
    }

    private b0(String str) {
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals(C0201.m82(1753))) {
            this.b = b.UNKNOWN;
            this.a = 0.0d;
        } else if (trim.codePointAt(i) == 37) {
            this.b = b.PERCENTAGE;
            this.a = Double.valueOf(trim.substring(0, i)).doubleValue();
        } else {
            int i2 = length - 2;
            if (i2 > 0) {
                String substring = trim.substring(i2);
                char c = 65535;
                int hashCode = substring.hashCode();
                if (hashCode != 3178) {
                    if (hashCode != 3240) {
                        if (hashCode != 3251) {
                            if (hashCode != 3365) {
                                if (hashCode != 3488) {
                                    if (hashCode != 3571) {
                                        if (hashCode != 3588) {
                                            if (hashCode == 3592 && substring.equals(C0201.m82(1754))) {
                                                c = 0;
                                            }
                                        } else if (substring.equals(C0201.m82(1755))) {
                                            c = 3;
                                        }
                                    } else if (substring.equals(C0201.m82(1756))) {
                                        c = 4;
                                    }
                                } else if (substring.equals(C0201.m82(1757))) {
                                    c = 5;
                                }
                            } else if (substring.equals(C0201.m82(1758))) {
                                c = 7;
                            }
                        } else if (substring.equals(C0201.m82(1759))) {
                            c = 2;
                        }
                    } else if (substring.equals(C0201.m82(1760))) {
                        c = 1;
                    }
                } else if (substring.equals(C0201.m82(1761))) {
                    c = 6;
                }
                switch (c) {
                    case 0:
                        this.b = b.NUMBER;
                        length = i2;
                        break;
                    case 1:
                        this.b = b.EMS;
                        length = i2;
                        break;
                    case 2:
                        this.b = b.EXS;
                        length = i2;
                        break;
                    case 3:
                        this.b = b.PT;
                        length = i2;
                        break;
                    case 4:
                        this.b = b.PC;
                        length = i2;
                        break;
                    case 5:
                        this.b = b.MM;
                        length = i2;
                        break;
                    case 6:
                        this.b = b.CM;
                        length = i2;
                        break;
                    case 7:
                        this.b = b.IN;
                        length = i2;
                        break;
                    default:
                        this.b = b.NUMBER;
                        break;
                }
                this.a = Double.valueOf(trim.substring(0, length)).doubleValue();
                return;
            }
            this.b = b.NUMBER;
            this.a = Double.valueOf(trim).doubleValue();
        }
    }
}
