package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.b0;
import vigqyno.C0201;

/* compiled from: PropHelper */
public class v {

    /* access modifiers changed from: package-private */
    /* compiled from: PropHelper */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[b0.b.values().length];
            a = iArr;
            iArr[b0.b.NUMBER.ordinal()] = 1;
            a[b0.b.PX.ordinal()] = 2;
            a[b0.b.PERCENTAGE.ordinal()] = 3;
            a[b0.b.EMS.ordinal()] = 4;
            a[b0.b.EXS.ordinal()] = 5;
            a[b0.b.CM.ordinal()] = 6;
            a[b0.b.MM.ordinal()] = 7;
            a[b0.b.IN.ordinal()] = 8;
            a[b0.b.PT.ordinal()] = 9;
            a[b0.b.PC.ordinal()] = 10;
            try {
                a[b0.b.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static double a(b0 b0Var, double d, double d2, double d3, double d4) {
        double d5;
        if (b0Var == null) {
            return d2;
        }
        b0.b bVar = b0Var.b;
        double d6 = b0Var.a;
        switch (a.a[bVar.ordinal()]) {
            case 1:
            case 2:
                d4 = 1.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 3:
                d5 = (d6 / 100.0d) * d;
                break;
            case 4:
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 5:
                d4 /= 2.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 6:
                d4 = 35.43307d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 7:
                d4 = 3.543307d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 8:
                d4 = 90.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 9:
                d4 = 1.25d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 10:
                d4 = 15.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            default:
                d5 = d6 * d3;
                break;
        }
        return d5 + d2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static double b(String str, double d, double d2, double d3) {
        double doubleValue;
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals(C0201.m82(26856))) {
            return 0.0d;
        }
        if (trim.codePointAt(i) == 37) {
            return (Double.valueOf(trim.substring(0, i)).doubleValue() / 100.0d) * d;
        }
        int i2 = length - 2;
        if (i2 > 0) {
            String substring = trim.substring(i2);
            char c = 65535;
            int hashCode = substring.hashCode();
            if (hashCode != 3178) {
                if (hashCode != 3240) {
                    if (hashCode != 3365) {
                        if (hashCode != 3488) {
                            if (hashCode != 3571) {
                                if (hashCode != 3588) {
                                    if (hashCode == 3592 && substring.equals(C0201.m82(26857))) {
                                        c = 0;
                                    }
                                } else if (substring.equals(C0201.m82(26858))) {
                                    c = 2;
                                }
                            } else if (substring.equals(C0201.m82(26859))) {
                                c = 3;
                            }
                        } else if (substring.equals(C0201.m82(26860))) {
                            c = 4;
                        }
                    } else if (substring.equals(C0201.m82(26861))) {
                        c = 6;
                    }
                } else if (substring.equals(C0201.m82(26862))) {
                    c = 1;
                }
            } else if (substring.equals(C0201.m82(26863))) {
                c = 5;
            }
            switch (c) {
                case 0:
                    length = i2;
                    d3 = 1.0d;
                    break;
                case 1:
                    length = i2;
                    break;
                case 2:
                    d3 = 1.25d;
                    length = i2;
                    break;
                case 3:
                    d3 = 15.0d;
                    length = i2;
                    break;
                case 4:
                    d3 = 3.543307d;
                    length = i2;
                    break;
                case 5:
                    d3 = 35.43307d;
                    length = i2;
                    break;
                case 6:
                    d3 = 90.0d;
                    length = i2;
                    break;
                default:
                    d3 = 1.0d;
                    break;
            }
            doubleValue = Double.valueOf(trim.substring(0, length)).doubleValue() * d3;
        } else {
            doubleValue = Double.valueOf(trim).doubleValue();
        }
        return doubleValue * d2;
    }

    public static int c(ReadableArray readableArray, float[] fArr, float f) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f;
        return 6;
    }
}
