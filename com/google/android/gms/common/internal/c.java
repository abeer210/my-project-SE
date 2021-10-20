package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class c<T extends IInterface> {
    private static final xo0[] A = new xo0[0];
    private int a;
    private long b;
    private long c;
    private int d;
    private long e;
    private q0 f;
    private final Context g;
    private final k h;
    private final zo0 i;
    public final Handler j;
    private final Object k;
    private final Object l;
    private r m;
    public AbstractC0058c n;
    private T o;
    private final ArrayList<g<?>> p;
    private j q;
    private int r;
    private final a s;
    private final b t;
    private final int u;
    private final String v;
    private vo0 w;
    private boolean x;
    private volatile k0 y;
    public AtomicInteger z;

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface b {
        void onConnectionFailed(vo0 vo0);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface AbstractC0058c {
        void a(vo0 vo0);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    protected class d implements AbstractC0058c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.c.AbstractC0058c
        public void a(vo0 vo0) {
            if (vo0.u()) {
                c cVar = c.this;
                cVar.f(null, cVar.D());
            } else if (c.this.t != null) {
                c.this.t.onConnectionFailed(vo0);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface e {
        void a();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    private abstract class f extends g<Boolean> {
        private final int d;
        private final Bundle e;

        public f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.d = i;
            this.e = bundle;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.android.gms.common.internal.c.g
        public final /* synthetic */ void c(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                c.this.T(1, null);
                return;
            }
            int i = this.d;
            if (i != 0) {
                if (i != 10) {
                    c.this.T(1, null);
                    Bundle bundle = this.e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable(C0201.m82(10148));
                    }
                    f(new vo0(this.d, pendingIntent));
                    return;
                }
                c.this.T(1, null);
                throw new IllegalStateException(String.format(C0201.m82(10149), getClass().getSimpleName(), c.this.t(), c.this.m()));
            } else if (!g()) {
                c.this.T(1, null);
                f(new vo0(8, null));
            }
        }

        @Override // com.google.android.gms.common.internal.c.g
        public final void d() {
        }

        public abstract void f(vo0 vo0);

        public abstract boolean g();
    }

    /* access modifiers changed from: protected */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public abstract class g<TListener> {
        private TListener a;
        private boolean b = false;

        public g(TListener tlistener) {
            this.a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.a = null;
            }
        }

        public final void b() {
            a();
            synchronized (c.this.p) {
                c.this.p.remove(this);
            }
        }

        public abstract void c(TListener tlistener);

        public abstract void d();

        public final void e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.b) {
                    String r1 = C0201.m82(10184);
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append(C0201.m82(10185));
                    sb.append(valueOf);
                    sb.append(C0201.m82(10186));
                    Log.w(r1, sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    c(tlistener);
                } catch (RuntimeException e) {
                    d();
                    throw e;
                }
            } else {
                d();
            }
            synchronized (this) {
                this.b = true;
            }
            b();
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    final class h extends k01 {
        public h(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            g gVar = (g) message.obj;
            gVar.d();
            gVar.b();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        public final void handleMessage(Message message) {
            vo0 vo0;
            vo0 vo02;
            if (c.this.z.get() == message.arg1) {
                int i = message.what;
                if ((i == 1 || i == 7 || ((i == 4 && !c.this.x()) || message.what == 5)) && !c.this.isConnecting()) {
                    a(message);
                    return;
                }
                int i2 = message.what;
                PendingIntent pendingIntent = null;
                if (i2 == 4) {
                    c.this.w = new vo0(message.arg2);
                    if (!c.this.j0() || c.this.x) {
                        if (c.this.w != null) {
                            vo02 = c.this.w;
                        } else {
                            vo02 = new vo0(8);
                        }
                        c.this.n.a(vo02);
                        c.this.I(vo02);
                        return;
                    }
                    c.this.T(3, null);
                } else if (i2 == 5) {
                    if (c.this.w != null) {
                        vo0 = c.this.w;
                    } else {
                        vo0 = new vo0(8);
                    }
                    c.this.n.a(vo0);
                    c.this.I(vo0);
                } else if (i2 == 3) {
                    Object obj = message.obj;
                    if (obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) obj;
                    }
                    vo0 vo03 = new vo0(message.arg2, pendingIntent);
                    c.this.n.a(vo03);
                    c.this.I(vo03);
                } else if (i2 == 6) {
                    c.this.T(5, null);
                    if (c.this.s != null) {
                        c.this.s.onConnectionSuspended(message.arg2);
                    }
                    c.this.J(message.arg2);
                    c.this.Y(5, 1, null);
                } else if (i2 == 2 && !c.this.isConnected()) {
                    a(message);
                } else if (b(message)) {
                    ((g) message.obj).e();
                } else {
                    int i3 = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append(C0201.m82(10382));
                    sb.append(i3);
                    Log.wtf(C0201.m82(10383), sb.toString(), new Exception());
                }
            } else if (b(message)) {
                a(message);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static final class i extends p.a {
        private c a;
        private final int b;

        public i(c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        @Override // com.google.android.gms.common.internal.p
        public final void I1(int i, IBinder iBinder, k0 k0Var) {
            u.l(this.a, C0201.m82(10416));
            u.k(k0Var);
            this.a.X(k0Var);
            J1(i, iBinder, k0Var.a);
        }

        @Override // com.google.android.gms.common.internal.p
        public final void J1(int i, IBinder iBinder, Bundle bundle) {
            u.l(this.a, C0201.m82(10417));
            this.a.K(i, iBinder, bundle, this.b);
            this.a = null;
        }

        @Override // com.google.android.gms.common.internal.p
        public final void r1(int i, Bundle bundle) {
            Log.wtf(C0201.m82(10418), C0201.m82(10419), new Exception());
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public final class j implements ServiceConnection {
        private final int a;

        public j(int i) {
            this.a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            r rVar;
            if (iBinder == null) {
                c.this.a0(16);
                return;
            }
            synchronized (c.this.l) {
                c cVar = c.this;
                if (iBinder == null) {
                    rVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(10429));
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof r)) {
                        rVar = new q(iBinder);
                    } else {
                        rVar = (r) queryLocalInterface;
                    }
                }
                cVar.m = rVar;
            }
            c.this.S(0, null, this.a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (c.this.l) {
                c.this.m = null;
            }
            Handler handler = c.this.j;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    /* access modifiers changed from: protected */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public final class k extends f {
        public k(int i, Bundle bundle) {
            super(i, null);
        }

        @Override // com.google.android.gms.common.internal.c.f
        public final void f(vo0 vo0) {
            if (!c.this.x() || !c.this.j0()) {
                c.this.n.a(vo0);
                c.this.I(vo0);
                return;
            }
            c.this.a0(16);
        }

        @Override // com.google.android.gms.common.internal.c.f
        public final boolean g() {
            c.this.n.a(vo0.e);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public final class l extends f {
        private final IBinder g;

        public l(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.c.f
        public final void f(vo0 vo0) {
            if (c.this.t != null) {
                c.this.t.onConnectionFailed(vo0);
            }
            c.this.I(vo0);
        }

        @Override // com.google.android.gms.common.internal.c.f
        public final boolean g() {
            String r0 = C0201.m82(10353);
            try {
                String interfaceDescriptor = this.g.getInterfaceDescriptor();
                if (!c.this.m().equals(interfaceDescriptor)) {
                    String m = c.this.m();
                    StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append(C0201.m82(10354));
                    sb.append(m);
                    sb.append(C0201.m82(10355));
                    sb.append(interfaceDescriptor);
                    Log.e(r0, sb.toString());
                    return false;
                }
                IInterface n = c.this.n(this.g);
                if (n == null || (!c.this.Y(2, 4, n) && !c.this.Y(3, 4, n))) {
                    return false;
                }
                c.this.w = null;
                Bundle u = c.this.u();
                if (c.this.s == null) {
                    return true;
                }
                c.this.s.onConnected(u);
                return true;
            } catch (RemoteException unused) {
                Log.w(r0, C0201.m82(10356));
                return false;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public c(Context context, Looper looper, int i2, a aVar, b bVar, String str) {
        this(context, looper, r3, r4, i2, aVar, bVar, str);
        k a2 = k.a(context);
        zo0 h2 = zo0.h();
        u.k(aVar);
        u.k(bVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void T(int i2, T t2) {
        q0 q0Var;
        boolean z2 = false;
        if ((i2 == 4) == (t2 != null)) {
            z2 = true;
        }
        u.a(z2);
        synchronized (this.k) {
            this.r = i2;
            this.o = t2;
            L(i2, t2);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.q == null || this.f == null)) {
                        String r13 = C0201.m82(8058);
                        String d2 = this.f.d();
                        String a2 = this.f.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 70 + String.valueOf(a2).length());
                        sb.append(C0201.m82(8059));
                        sb.append(d2);
                        sb.append(C0201.m82(8060));
                        sb.append(a2);
                        Log.e(r13, sb.toString());
                        this.h.b(this.f.d(), this.f.a(), this.f.c(), this.q, h0());
                        this.z.incrementAndGet();
                    }
                    this.q = new j(this.z.get());
                    if (this.r != 3 || C() == null) {
                        q0Var = new q0(F(), t(), false, 129, G());
                    } else {
                        q0Var = new q0(A().getPackageName(), C(), true, 129, false);
                    }
                    this.f = q0Var;
                    if (!this.h.c(new k.a(q0Var.d(), this.f.a(), this.f.c(), this.f.b()), this.q, h0())) {
                        String r132 = C0201.m82(8061);
                        String d3 = this.f.d();
                        String a3 = this.f.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 34 + String.valueOf(a3).length());
                        sb2.append(C0201.m82(8062));
                        sb2.append(d3);
                        sb2.append(C0201.m82(8063));
                        sb2.append(a3);
                        Log.e(r132, sb2.toString());
                        S(16, null, this.z.get());
                    }
                } else if (i2 == 4) {
                    H(t2);
                }
            } else if (this.q != null) {
                this.h.b(this.f.d(), this.f.a(), this.f.c(), this.q, h0());
                this.q = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void X(k0 k0Var) {
        this.y = k0Var;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean Y(int i2, int i3, T t2) {
        synchronized (this.k) {
            if (this.r != i2) {
                return false;
            }
            T(i3, t2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a0(int i2) {
        int i3;
        if (i0()) {
            i3 = 5;
            this.x = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(i3, this.z.get(), 16));
    }

    private final String h0() {
        String str = this.v;
        return str == null ? this.g.getClass().getName() : str;
    }

    private final boolean i0() {
        boolean z2;
        synchronized (this.k) {
            z2 = this.r == 3;
        }
        return z2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean j0() {
        if (this.x || TextUtils.isEmpty(m()) || TextUtils.isEmpty(C())) {
            return false;
        }
        try {
            Class.forName(m());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Context A() {
        return this.g;
    }

    public Bundle B() {
        return new Bundle();
    }

    public String C() {
        return null;
    }

    public Set<Scope> D() {
        return Collections.EMPTY_SET;
    }

    public final T E() throws DeadObjectException {
        T t2;
        synchronized (this.k) {
            if (this.r != 5) {
                w();
                u.o(this.o != null, C0201.m82(8064));
                t2 = this.o;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    public String F() {
        return C0201.m82(8065);
    }

    public boolean G() {
        return false;
    }

    public void H(T t2) {
        this.c = System.currentTimeMillis();
    }

    public void I(vo0 vo0) {
        this.d = vo0.o();
        this.e = System.currentTimeMillis();
    }

    public void J(int i2) {
        this.a = i2;
        this.b = System.currentTimeMillis();
    }

    public void K(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new l(i2, iBinder, bundle)));
    }

    public void L(int i2, T t2) {
    }

    public boolean M() {
        return false;
    }

    public void N(int i2) {
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(6, this.z.get(), i2));
    }

    public void O(AbstractC0058c cVar, int i2, PendingIntent pendingIntent) {
        u.l(cVar, C0201.m82(8066));
        this.n = cVar;
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(3, this.z.get(), i2, pendingIntent));
    }

    public final void S(int i2, Bundle bundle, int i3) {
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new k(i2, null)));
    }

    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        T t2;
        r rVar;
        synchronized (this.k) {
            i2 = this.r;
            t2 = this.o;
        }
        synchronized (this.l) {
            rVar = this.m;
        }
        printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(8067));
        if (i2 == 1) {
            printWriter.print(C0201.m82(8073));
        } else if (i2 == 2) {
            printWriter.print(C0201.m82(8072));
        } else if (i2 == 3) {
            printWriter.print(C0201.m82(8071));
        } else if (i2 == 4) {
            printWriter.print(C0201.m82(8070));
        } else if (i2 != 5) {
            printWriter.print(C0201.m82(8068));
        } else {
            printWriter.print(C0201.m82(8069));
        }
        printWriter.append((CharSequence) C0201.m82(8074));
        if (t2 == null) {
            printWriter.append((CharSequence) C0201.m82(8075));
        } else {
            printWriter.append((CharSequence) m()).append((CharSequence) C0201.m82(8076)).append((CharSequence) Integer.toHexString(System.identityHashCode(t2.asBinder())));
        }
        printWriter.append((CharSequence) C0201.m82(8077));
        if (rVar == null) {
            printWriter.println(C0201.m82(8078));
        } else {
            printWriter.append((CharSequence) C0201.m82(8079)).println(Integer.toHexString(System.identityHashCode(rVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0201.m82(8080), Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(8081));
            long j2 = this.c;
            String format = simpleDateFormat.format(new Date(this.c));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(C0201.m82(8082));
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(8083));
            int i3 = this.a;
            if (i3 == 1) {
                printWriter.append((CharSequence) C0201.m82(8085));
            } else if (i3 != 2) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append((CharSequence) C0201.m82(8084));
            }
            PrintWriter append2 = printWriter.append((CharSequence) C0201.m82(8086));
            long j3 = this.b;
            String format2 = simpleDateFormat.format(new Date(this.b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(C0201.m82(8087));
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(8088)).append((CharSequence) com.google.android.gms.common.api.d.a(this.d));
            PrintWriter append3 = printWriter.append((CharSequence) C0201.m82(8089));
            long j4 = this.e;
            String format3 = simpleDateFormat.format(new Date(this.e));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(C0201.m82(8090));
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public boolean d() {
        return false;
    }

    public void disconnect() {
        this.z.incrementAndGet();
        synchronized (this.p) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.get(i2).a();
            }
            this.p.clear();
        }
        synchronized (this.l) {
            this.m = null;
        }
        T(1, null);
    }

    public void f(n nVar, Set<Scope> set) {
        Bundle B = B();
        h hVar = new h(this.u);
        hVar.d = this.g.getPackageName();
        hVar.g = B;
        if (set != null) {
            hVar.f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (r()) {
            hVar.h = y() != null ? y() : new Account(C0201.m82(8091), C0201.m82(8092));
            if (nVar != null) {
                hVar.e = nVar.asBinder();
            }
        } else if (M()) {
            hVar.h = y();
        }
        hVar.i = A;
        hVar.j = z();
        try {
            synchronized (this.l) {
                if (this.m != null) {
                    this.m.r0(new i(this, this.z.get()), hVar);
                } else {
                    Log.w(C0201.m82(8093), C0201.m82(8094));
                }
            }
        } catch (DeadObjectException e2) {
            Log.w(C0201.m82(8097), C0201.m82(8098), e2);
            N(1);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w(C0201.m82(8095), C0201.m82(8096), e4);
            K(8, null, null, this.z.get());
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException(C0201.m82(8099));
    }

    public String h() {
        q0 q0Var;
        if (isConnected() && (q0Var = this.f) != null) {
            return q0Var.a();
        }
        throw new RuntimeException(C0201.m82(8100));
    }

    public void i(AbstractC0058c cVar) {
        u.l(cVar, C0201.m82(8101));
        this.n = cVar;
        T(2, null);
    }

    public boolean isConnected() {
        boolean z2;
        synchronized (this.k) {
            z2 = this.r == 4;
        }
        return z2;
    }

    public boolean isConnecting() {
        boolean z2;
        synchronized (this.k) {
            if (this.r != 2) {
                if (this.r != 3) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public void k(e eVar) {
        eVar.a();
    }

    public abstract String m();

    public abstract T n(IBinder iBinder);

    public boolean o() {
        return true;
    }

    public int p() {
        return zo0.a;
    }

    public final xo0[] q() {
        k0 k0Var = this.y;
        if (k0Var == null) {
            return null;
        }
        return k0Var.b;
    }

    public boolean r() {
        return false;
    }

    public IBinder s() {
        synchronized (this.l) {
            if (this.m == null) {
                return null;
            }
            return this.m.asBinder();
        }
    }

    public abstract String t();

    public Bundle u() {
        return null;
    }

    public void v() {
        int j2 = this.i.j(this.g, p());
        if (j2 != 0) {
            T(1, null);
            O(new d(), j2, null);
            return;
        }
        i(new d());
    }

    public final void w() {
        if (!isConnected()) {
            throw new IllegalStateException(C0201.m82(8102));
        }
    }

    public boolean x() {
        return false;
    }

    public Account y() {
        return null;
    }

    public xo0[] z() {
        return A;
    }

    public c(Context context, Looper looper, k kVar, zo0 zo0, int i2, a aVar, b bVar, String str) {
        this.k = new Object();
        this.l = new Object();
        this.p = new ArrayList<>();
        this.r = 1;
        this.w = null;
        this.x = false;
        this.y = null;
        this.z = new AtomicInteger(0);
        u.l(context, C0201.m82(8054));
        this.g = context;
        u.l(looper, C0201.m82(8055));
        u.l(kVar, C0201.m82(8056));
        this.h = kVar;
        u.l(zo0, C0201.m82(8057));
        this.i = zo0;
        this.j = new h(looper);
        this.u = i2;
        this.s = aVar;
        this.t = bVar;
        this.v = str;
    }
}
