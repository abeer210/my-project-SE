package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ar  reason: default package */
/* compiled from: BufferBoundsException */
public final class ar extends IOException {
    public ar(int i, int i2, long j) {
        super(a(i, i2, j));
    }

    private static String a(int i, int i2, long j) {
        if (i < 0) {
            return String.format(C0201.m82(3984), Integer.valueOf(i));
        } else if (i2 < 0) {
            return String.format(C0201.m82(3985), Integer.valueOf(i2));
        } else if ((((long) i) + ((long) i2)) - 1 > 2147483647L) {
            return String.format(C0201.m82(3986), Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            return String.format(C0201.m82(3987), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j - 1));
        }
    }

    public ar(String str) {
        super(str);
    }
}
