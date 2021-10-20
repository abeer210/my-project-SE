package defpackage;

import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: fp1  reason: default package */
public final class fp1 {
    public static final Charset a = Charset.forName(C0201.m82(4025));
    public static final Object b = new Object();

    static {
        Charset.forName(C0201.m82(4026));
    }

    public static void a(bp1 bp1, bp1 bp12) {
        dp1 dp1 = bp1.b;
        if (dp1 != null) {
            bp12.b = (dp1) dp1.clone();
        }
    }
}
