package defpackage;

import com.dynatrace.android.agent.u;
import vigqyno.C0201;

/* renamed from: z20  reason: default package */
/* compiled from: SafeXamarinStacktraceProcessor */
public class z20 implements b30 {
    private static final String d = (u.b + C0201.m82(32970));
    private final Throwable a;
    private final String b;
    private final int c;

    public z20(Throwable th, String str, int i) {
        this.a = th;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.b30
    public a30 a() {
        try {
            return new d30(this.b, this.c).a();
        } catch (Exception e) {
            if (u.c) {
                s30.s(d, C0201.m82(32971), e);
            }
            return new x20(this.a, this.c).a();
        }
    }
}
