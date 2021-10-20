package defpackage;

import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: d30  reason: default package */
/* compiled from: XamarinStacktraceProcessor */
public class d30 implements b30 {
    private final String a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public d30(String str, int i) {
        this(str, i, 128000, C0188.f18, 250);
    }

    public static String b(Throwable th) {
        while (th != null) {
            String message = th.getMessage();
            if (message != null && e(message)) {
                return message;
            }
            th = th.getCause();
        }
        return null;
    }

    private String c(String[] strArr, int i) {
        StringBuilder sb = new StringBuilder();
        String str = strArr[0];
        String r3 = C0201.m82(30495);
        int indexOf = str.indexOf(r3);
        if (indexOf < 0) {
            sb.append(strArr[0]);
            int i2 = 1;
            while (true) {
                if (i2 >= strArr.length || strArr[i2].startsWith(C0201.m82(30496)) || sb.length() >= i) {
                    break;
                }
                sb.append(C0201.m82(30497));
                int indexOf2 = strArr[i2].indexOf(r3);
                if (indexOf2 >= 0) {
                    sb.append(strArr[i2].substring(0, indexOf2));
                    break;
                }
                sb.append(strArr[i2]);
                i2++;
            }
        } else {
            sb.append(strArr[0].substring(0, indexOf));
        }
        if (sb.length() > i) {
            return sb.substring(0, i);
        }
        return sb.toString();
    }

    private String d(String[] strArr) {
        if (strArr.length <= this.b && this.a.length() <= this.c) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < Math.min(strArr.length, this.b)) {
            int i3 = i == 0 ? 0 : 1;
            if (strArr[i].length() + i2 + i3 > this.c) {
                break;
            }
            if (i3 > 0) {
                sb.append(C0201.m82(30498));
            }
            sb.append(strArr[i]);
            i2 += strArr[i].length() + i3;
            i++;
        }
        return sb.toString();
    }

    private static boolean e(String str) {
        for (String str2 : str.split(C0201.m82(30499))) {
            if (str2.startsWith(C0201.m82(30500))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b30
    public a30 a() {
        String[] split = this.a.split(C0201.m82(30501));
        if (split.length < 1) {
            throw new IllegalArgumentException(C0201.m82(30506));
        } else if (!split[0].startsWith(C0201.m82(30502))) {
            int indexOf = split[0].indexOf(C0201.m82(30503));
            if (indexOf >= 0) {
                return new a30(s30.o(split[0].substring(0, indexOf), this.e), c(split, this.d), d(split), y20.XAMARIN);
            }
            throw new IllegalArgumentException(C0201.m82(30504));
        } else {
            throw new IllegalArgumentException(C0201.m82(30505));
        }
    }

    public d30(String str, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
