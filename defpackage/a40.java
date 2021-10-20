package defpackage;

import com.dynatrace.android.agent.a0;
import com.dynatrace.android.agent.b0;
import com.dynatrace.android.agent.j;
import com.dynatrace.android.agent.m;
import com.dynatrace.android.agent.p;
import com.dynatrace.android.agent.q;
import com.dynatrace.android.agent.u;
import vigqyno.C0201;

/* renamed from: a40  reason: default package */
/* compiled from: CbWebReqTracker */
public final class a40 {
    public p a;
    public g30 b;
    public boolean c;
    public f40 d;
    public b0 e;
    public long f;
    private long g;
    private String h;
    private long i = -1;
    private long j = -1;
    private m k;
    private String l;

    /* access modifiers changed from: package-private */
    /* renamed from: a40$a */
    /* compiled from: CbWebReqTracker */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[z30.values().length];
            a = iArr;
            iArr[z30.PRE_EXEC.ordinal()] = 1;
            a[z30.POST_EXEC_ERR.ordinal()] = 2;
            a[z30.POST_EXEC_OK.ordinal()] = 3;
            try {
                a[z30.POST_EXEC_FINALIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public a40(p pVar, g30 g30) {
        this.a = pVar;
        this.b = g30;
    }

    public void a(String str) {
        if (!this.e.h(str)) {
            if (u.c) {
                s30.r(C0201.m82(20119), String.format(C0201.m82(20118), this.e.toString(), str));
            }
            p pVar = this.a;
            if (pVar != null) {
                pVar.W(this.e.toString());
            }
            this.e = null;
        }
    }

    public void b(f40 f40) {
        if (this.h == null) {
            this.h = f40.d();
        }
        if (u.c) {
            StringBuilder sb = new StringBuilder();
            sb.append(f40.e());
            String r1 = C0201.m82(20120);
            sb.append(r1);
            sb.append(f40.b);
            sb.append(r1);
            sb.append(f40.c);
            s30.r(C0201.m82(20121), sb.toString());
        }
        int i2 = a.a[f40.c.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            if (this.f <= 0) {
                this.f = this.b.d();
            }
            long j2 = this.i;
            if (j2 >= 0) {
                f40.f = j2;
            } else if (f40 instanceof b40) {
                b40 b40 = (b40) f40;
                if (f40.b != y30.getOutputStream) {
                    z = false;
                }
                b40.g(z);
            }
            long j3 = this.j;
            if (j3 >= 0) {
                f40.g = j3;
            }
        } else if (i2 == 2) {
            long j4 = f40.f;
            if (j4 >= 0) {
                this.i = j4;
            }
            long j5 = f40.g;
            if (j5 >= 0) {
                this.j = j5;
            }
            if (f40.b != y30.getOutputStream || this.g <= 0) {
                this.c = true;
                this.g = this.b.d();
                return;
            }
            this.g = 0;
        } else if (i2 == 3) {
            if ((f40 instanceof b40) && f40.b != y30.getOutputStream) {
                ((b40) f40).i();
            }
            long j6 = f40.f;
            if (j6 >= 0) {
                this.i = j6;
            }
            long j7 = f40.g;
            if (j7 >= 0) {
                this.j = j7;
            }
            if (f40.b == y30.getOutputStream) {
                this.g = this.b.d();
                return;
            }
            this.c = f40.h;
            if (this.g <= 0) {
                this.g = this.b.d();
            }
        } else if (i2 == 4) {
            f40.h = true;
            this.c = true;
            if (this.g <= 0) {
                this.g = this.b.d();
            }
        }
    }

    public void c(f40 f40) {
        b0 b0Var;
        a0 a0Var;
        if (u.c) {
            b0 b0Var2 = this.e;
            String format = String.format(C0201.m82(20123), Long.valueOf(this.f), Long.valueOf(this.g), this.h, b0Var2 != null ? b0Var2.toString() : C0201.m82(20122));
            String r3 = C0201.m82(20124);
            s30.r(r3, format);
            s30.r(r3, String.format(C0201.m82(20125), f40.c(), Integer.valueOf(f40.d), f40.e));
        }
        String c2 = f40.c();
        if (q.e() && this.e != null) {
            a0 a0Var2 = new a0(this.e.b(), this.e.c(), this.f, this.g, f40.d, f40.e, c2, f40.f, f40.g, this.b, this.e.d());
            if (x30.d) {
                a0Var = a0Var2;
                this.k = a0Var;
                this.l = a0Var.i().toString();
            } else {
                a0Var = a0Var2;
            }
            j.l(a0Var);
        }
        p pVar = this.a;
        if (pVar != null && (b0Var = this.e) != null) {
            pVar.j0(b0Var.b());
        }
    }

    public void d(b0 b0Var) {
        this.e = b0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.c));
        sb.append('&');
        sb.append('&');
        sb.append(String.valueOf(this.f));
        sb.append('&');
        sb.append('&');
        sb.append(String.valueOf(this.g));
        sb.append('&');
        sb.append('&');
        sb.append(String.valueOf(this.h));
        sb.append('&');
        sb.append('&');
        b0 b0Var = this.e;
        String r3 = C0201.m82(20126);
        if (b0Var != null) {
            sb.append(b0Var.toString());
            sb.append('&');
            sb.append('&');
        } else {
            sb.append(r3);
            sb.append('&');
            sb.append('&');
        }
        p pVar = this.a;
        if (pVar != null) {
            sb.append(pVar.i().toString());
            sb.append('&');
            sb.append('&');
        } else {
            sb.append(r3);
            sb.append('&');
            sb.append('&');
        }
        if (this.k != null) {
            sb.append(this.l);
        } else {
            sb.append(r3);
        }
        return sb.toString();
    }
}
