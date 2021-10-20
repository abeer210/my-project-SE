package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.o0;
import com.facebook.systrace.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: UIViewOperationQueue */
public class v0 {
    private static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    private long A;
    private final int[] a = new int[4];
    private final m b;
    private final Object c = new Object();
    private final Object d = new Object();
    private final j e;
    private final ReactApplicationContext f;
    private final boolean g;
    private ArrayList<h> h = new ArrayList<>();
    private ArrayList<u> i = new ArrayList<>();
    private ArrayList<Runnable> j = new ArrayList<>();
    private ArrayDeque<u> k = new ArrayDeque<>();
    private ak0 l;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    /* compiled from: UIViewOperationQueue */
    class a implements Runnable {
        public static final String j = null;
        public static final String k = null;
        public static final String l = null;
        public static final String m = null;
        public static final String n = null;
        public static final String o = null;
        public final /* synthetic */ int a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ ArrayDeque c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;

        static {
            C0201.m83(a.class, 46);
        }

        public a(int i2, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j2, long j3, long j4, long j5) {
            this.a = i2;
            this.b = arrayList;
            this.c = arrayDeque;
            this.d = arrayList2;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = j5;
        }

        public void run() {
            b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, o);
            a2.a(m, this.a);
            a2.c();
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.b != null) {
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        h hVar = (h) it.next();
                        try {
                            hVar.c();
                        } catch (RetryableMountingLayerException e2) {
                            if (hVar.a() == 0) {
                                hVar.b();
                                v0.this.h.add(hVar);
                            } else {
                                ReactSoftException.logSoftException(v0.B, new ReactNoCrashSoftException(e2));
                            }
                        } catch (Throwable th) {
                            ReactSoftException.logSoftException(v0.B, th);
                        }
                    }
                }
                if (this.c != null) {
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        ((u) it2.next()).execute();
                    }
                }
                if (this.d != null) {
                    Iterator it3 = this.d.iterator();
                    while (it3.hasNext()) {
                        ((u) it3.next()).execute();
                    }
                }
                if (v0.this.o && v0.this.q == 0) {
                    v0.this.q = this.e;
                    v0.this.r = SystemClock.uptimeMillis();
                    v0.this.s = this.f;
                    v0.this.t = this.g;
                    v0.this.u = uptimeMillis;
                    v0.this.v = v0.this.r;
                    v0.this.y = this.h;
                    com.facebook.systrace.a.b(0, k, 0, v0.this.q * 1000000);
                    com.facebook.systrace.a.f(0, j, 0, v0.this.t * 1000000);
                    com.facebook.systrace.a.b(0, n, 0, v0.this.t * 1000000);
                    com.facebook.systrace.a.f(0, l, 0, v0.this.u * 1000000);
                }
                v0.this.b.f();
                if (v0.this.l != null) {
                    v0.this.l.b();
                }
                com.facebook.systrace.a.g(0);
            } catch (Exception e3) {
                v0.this.n = true;
                throw e3;
            } catch (Throwable th2) {
                com.facebook.systrace.a.g(0);
                throw th2;
            }
        }
    }

    /* compiled from: UIViewOperationQueue */
    class b extends GuardedRunnable {
        public b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            v0.this.U();
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class c extends y {
        private final int b;
        private final boolean c;
        private final boolean d;

        public c(int i, int i2, boolean z, boolean z2) {
            super(v0.this, i);
            this.b = i2;
            this.d = z;
            this.c = z2;
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            if (!this.d) {
                v0.this.b.z(this.a, this.b, this.c);
            } else {
                v0.this.b.e();
            }
        }
    }

    /* compiled from: UIViewOperationQueue */
    private class d implements u {
        private final ReadableMap a;
        private final Callback b;

        public /* synthetic */ d(v0 v0Var, ReadableMap readableMap, Callback callback, a aVar) {
            this(readableMap, callback);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.h(this.a, this.b);
        }

        private d(ReadableMap readableMap, Callback callback) {
            this.a = readableMap;
            this.b = callback;
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class e extends y {
        private final k0 b;
        private final String c;
        private final c0 d;

        public e(k0 k0Var, int i, String str, c0 c0Var) {
            super(v0.this, i);
            this.b = k0Var;
            this.c = str;
            this.d = c0Var;
            com.facebook.systrace.a.j(0, C0201.m82(15657), this.a);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            com.facebook.systrace.a.d(0, C0201.m82(15658), this.a);
            v0.this.b.j(this.b, this.a, this.c, this.d);
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class f implements u {
        private f() {
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.k();
        }

        public /* synthetic */ f(v0 v0Var, a aVar) {
            this();
        }
    }

    @Deprecated
    /* compiled from: UIViewOperationQueue */
    private final class g extends y implements h {
        private final int b;
        private final ReadableArray c;
        private int d = 0;

        public g(int i, int i2, ReadableArray readableArray) {
            super(v0.this, i);
            this.b = i2;
            this.c = readableArray;
        }

        @Override // com.facebook.react.uimanager.v0.h
        public int a() {
            return this.d;
        }

        @Override // com.facebook.react.uimanager.v0.h
        public void b() {
            this.d++;
        }

        @Override // com.facebook.react.uimanager.v0.h
        public void c() {
            v0.this.b.l(this.a, this.b, this.c);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            try {
                v0.this.b.l(this.a, this.b, this.c);
            } catch (Throwable th) {
                ReactSoftException.logSoftException(v0.B, new RuntimeException(C0201.m82(16068), th));
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: UIViewOperationQueue */
    public interface h {
        int a();

        void b();

        void c();
    }

    /* compiled from: UIViewOperationQueue */
    private final class i extends y implements h {
        private final String b;
        private final ReadableArray c;
        private int d = 0;

        public i(int i, String str, ReadableArray readableArray) {
            super(v0.this, i);
            this.b = str;
            this.c = readableArray;
        }

        @Override // com.facebook.react.uimanager.v0.h
        public int a() {
            return this.d;
        }

        @Override // com.facebook.react.uimanager.v0.h
        public void b() {
            this.d++;
        }

        @Override // com.facebook.react.uimanager.v0.h
        public void c() {
            v0.this.b.m(this.a, this.b, this.c);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            try {
                v0.this.b.m(this.a, this.b, this.c);
            } catch (Throwable th) {
                ReactSoftException.logSoftException(v0.B, new RuntimeException(C0201.m82(15941), th));
            }
        }
    }

    /* compiled from: UIViewOperationQueue */
    private class j extends e {
        private final int c;

        public /* synthetic */ j(v0 v0Var, ReactContext reactContext, int i, a aVar) {
            this(reactContext, i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r2 = android.os.SystemClock.uptimeMillis();
            r1.execute();
            r8.d.p += android.os.SystemClock.uptimeMillis() - r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
            r8.d.n = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
            throw r9;
         */
        private void d(long j) {
            while (16 - ((System.nanoTime() - j) / 1000000) >= ((long) this.c)) {
                synchronized (v0.this.d) {
                    if (!v0.this.k.isEmpty()) {
                        u uVar = (u) v0.this.k.pollFirst();
                    } else {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: finally extract failed */
        @Override // com.facebook.react.uimanager.e
        public void c(long j) {
            if (v0.this.n) {
                f60.A(C0201.m82(15168), C0201.m82(15169));
                return;
            }
            com.facebook.systrace.a.c(0, C0201.m82(15170));
            try {
                d(j);
                com.facebook.systrace.a.g(0);
                v0.this.U();
                com.facebook.react.modules.core.g.i().m(g.c.DISPATCH_UI, this);
            } catch (Throwable th) {
                com.facebook.systrace.a.g(0);
                throw th;
            }
        }

        private j(ReactContext reactContext, int i) {
            super(reactContext);
            this.c = i;
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class k implements u {
        private final int a;
        private final float b;
        private final float c;
        private final Callback d;

        public /* synthetic */ k(v0 v0Var, int i, float f, float f2, Callback callback, a aVar) {
            this(i, f, f2, callback);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            try {
                v0.this.b.t(this.a, v0.this.a);
                float f = (float) v0.this.a[0];
                float f2 = (float) v0.this.a[1];
                int o = v0.this.b.o(this.a, this.b, this.c);
                try {
                    v0.this.b.t(o, v0.this.a);
                    float a2 = q.a(((float) v0.this.a[0]) - f);
                    float a3 = q.a(((float) v0.this.a[1]) - f2);
                    float a4 = q.a((float) v0.this.a[2]);
                    float a5 = q.a((float) v0.this.a[3]);
                    this.d.invoke(Integer.valueOf(o), Float.valueOf(a2), Float.valueOf(a3), Float.valueOf(a4), Float.valueOf(a5));
                } catch (g unused) {
                    this.d.invoke(new Object[0]);
                }
            } catch (g unused2) {
                this.d.invoke(new Object[0]);
            }
        }

        private k(int i, float f, float f2, Callback callback) {
            this.a = i;
            this.b = f;
            this.c = f2;
            this.d = callback;
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class l implements u {
        private final a0 a;
        private final o0.b b;

        public /* synthetic */ l(v0 v0Var, a0 a0Var, o0.b bVar, a aVar) {
            this(v0Var, a0Var, bVar);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            this.b.a(this.a);
        }

        private l(v0 v0Var, a0 a0Var, o0.b bVar) {
            this.a = a0Var;
            this.b = bVar;
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class m extends y {
        private final int[] b;
        private final w0[] c;
        private final int[] d;

        public m(int i, int[] iArr, w0[] w0VarArr, int[] iArr2) {
            super(v0.this, i);
            this.b = iArr;
            this.c = w0VarArr;
            this.d = iArr2;
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.r(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class n implements u {
        private final int a;
        private final Callback b;

        public /* synthetic */ n(v0 v0Var, int i, Callback callback, a aVar) {
            this(i, callback);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            try {
                v0.this.b.u(this.a, v0.this.a);
                float a2 = q.a((float) v0.this.a[0]);
                float a3 = q.a((float) v0.this.a[1]);
                float a4 = q.a((float) v0.this.a[2]);
                float a5 = q.a((float) v0.this.a[3]);
                this.b.invoke(Float.valueOf(a2), Float.valueOf(a3), Float.valueOf(a4), Float.valueOf(a5));
            } catch (o unused) {
                this.b.invoke(new Object[0]);
            }
        }

        private n(int i, Callback callback) {
            this.a = i;
            this.b = callback;
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class o implements u {
        private final int a;
        private final Callback b;

        public /* synthetic */ o(v0 v0Var, int i, Callback callback, a aVar) {
            this(i, callback);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            try {
                v0.this.b.t(this.a, v0.this.a);
                float a2 = q.a((float) v0.this.a[0]);
                float a3 = q.a((float) v0.this.a[1]);
                float a4 = q.a((float) v0.this.a[2]);
                float a5 = q.a((float) v0.this.a[3]);
                this.b.invoke(0, 0, Float.valueOf(a4), Float.valueOf(a5), Float.valueOf(a2), Float.valueOf(a3));
            } catch (o unused) {
                this.b.invoke(new Object[0]);
            }
        }

        private o(int i, Callback callback) {
            this.a = i;
            this.b = callback;
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class p extends y {
        public p(int i) {
            super(v0.this, i);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.v(this.a);
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class q extends y {
        private final int b;

        public /* synthetic */ q(v0 v0Var, int i, int i2, a aVar) {
            this(i, i2);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.y(this.a, this.b);
        }

        private q(int i, int i2) {
            super(v0.this, i);
            this.b = i2;
        }
    }

    /* compiled from: UIViewOperationQueue */
    private class r implements u {
        private final boolean a;

        public /* synthetic */ r(v0 v0Var, boolean z, a aVar) {
            this(z);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.A(this.a);
        }

        private r(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class s extends y {
        private final ReadableArray b;
        private final Callback c;
        private final Callback d;

        public s(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(v0.this, i);
            this.b = readableArray;
            this.c = callback;
            this.d = callback2;
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.B(this.a, this.b, this.d, this.c);
        }
    }

    /* compiled from: UIViewOperationQueue */
    private class t implements u {
        private final n0 a;

        public t(n0 n0Var) {
            this.a = n0Var;
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            this.a.a(v0.this.b);
        }
    }

    /* compiled from: UIViewOperationQueue */
    public interface u {
        void execute();
    }

    /* access modifiers changed from: private */
    /* compiled from: UIViewOperationQueue */
    public final class v extends y {
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;

        public v(int i, int i2, int i3, int i4, int i5, int i6) {
            super(v0.this, i2);
            this.b = i;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            com.facebook.systrace.a.j(0, C0201.m82(17216), this.a);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            com.facebook.systrace.a.d(0, C0201.m82(17217), this.a);
            v0.this.b.C(this.b, this.a, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: UIViewOperationQueue */
    private final class w extends y {
        private final c0 b;

        public /* synthetic */ w(v0 v0Var, int i, c0 c0Var, a aVar) {
            this(i, c0Var);
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.E(this.a, this.b);
        }

        private w(int i, c0 c0Var) {
            super(v0.this, i);
            this.b = c0Var;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: UIViewOperationQueue */
    public final class x extends y {
        private final Object b;

        public x(int i, Object obj) {
            super(v0.this, i);
            this.b = obj;
        }

        @Override // com.facebook.react.uimanager.v0.u
        public void execute() {
            v0.this.b.F(this.a, this.b);
        }
    }

    /* compiled from: UIViewOperationQueue */
    private abstract class y implements u {
        public int a;

        public y(v0 v0Var, int i) {
            this.a = i;
        }
    }

    static {
        C0201.m83(v0.class, 80);
    }

    public v0(ReactApplicationContext reactApplicationContext, m mVar, int i2) {
        this.b = mVar;
        this.e = new j(this, reactApplicationContext, i2 == -1 ? 8 : i2, null);
        this.f = reactApplicationContext;
        this.g = dj0.f;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r2 = android.os.SystemClock.uptimeMillis();
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r0.hasNext() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r0.next().run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r13.o == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r13.w = android.os.SystemClock.uptimeMillis() - r2;
        r13.x = r13.p;
        r13.o = false;
        com.facebook.systrace.a.b(0, vigqyno.C0201.m82(25261), 0, 1000000 * r2);
        com.facebook.systrace.a.e(0, vigqyno.C0201.m82(25262), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r13.p = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        return;
     */
    private void U() {
        if (this.n) {
            f60.A(C0201.m82(25259), C0201.m82(25260));
            return;
        }
        synchronized (this.c) {
            if (!this.j.isEmpty()) {
                ArrayList<Runnable> arrayList = this.j;
                this.j = new ArrayList<>();
            }
        }
    }

    public void A() {
        this.i.add(new c(0, 0, true, false));
    }

    public void B(ReadableMap readableMap, Callback callback) {
        this.i.add(new d(this, readableMap, callback, null));
    }

    public void C(k0 k0Var, int i2, String str, c0 c0Var) {
        synchronized (this.d) {
            this.z++;
            this.k.addLast(new e(k0Var, i2, str, c0Var));
        }
    }

    public void D() {
        this.i.add(new f(this, null));
    }

    @Deprecated
    public void E(int i2, int i3, ReadableArray readableArray) {
        g gVar = new g(i2, i3, readableArray);
        if (this.g) {
            this.h.add(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    public void F(int i2, String str, ReadableArray readableArray) {
        i iVar = new i(i2, str, readableArray);
        if (this.g) {
            this.h.add(iVar);
        } else {
            this.i.add(iVar);
        }
    }

    public void G(int i2, float f2, float f3, Callback callback) {
        this.i.add(new k(this, i2, f2, f3, callback, null));
    }

    public void H(a0 a0Var, o0.b bVar) {
        this.i.add(new l(this, a0Var, bVar, null));
    }

    public void I(int i2, int[] iArr, w0[] w0VarArr, int[] iArr2) {
        this.i.add(new m(i2, iArr, w0VarArr, iArr2));
    }

    public void J(int i2, Callback callback) {
        this.i.add(new o(this, i2, callback, null));
    }

    public void K(int i2, Callback callback) {
        this.i.add(new n(this, i2, callback, null));
    }

    public void L(int i2) {
        this.i.add(new p(i2));
    }

    public void M(int i2, int i3) {
        this.i.add(new q(this, i2, i3, null));
    }

    public void N(int i2, int i3, boolean z2) {
        this.i.add(new c(i2, i3, false, z2));
    }

    public void O(boolean z2) {
        this.i.add(new r(this, z2, null));
    }

    public void P(int i2, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.i.add(new s(i2, readableArray, callback, callback2));
    }

    public void Q(n0 n0Var) {
        this.i.add(new t(n0Var));
    }

    public void R(int i2, Object obj) {
        this.i.add(new x(i2, obj));
    }

    public void S(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.i.add(new v(i2, i3, i4, i5, i6, i7));
    }

    public void T(int i2, String str, c0 c0Var) {
        this.A++;
        this.i.add(new w(this, i2, c0Var, null));
    }

    public m V() {
        return this.b;
    }

    public Map<String, Long> W() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(25263), Long.valueOf(this.q));
        hashMap.put(C0201.m82(25264), Long.valueOf(this.r));
        hashMap.put(C0201.m82(25265), Long.valueOf(this.s));
        hashMap.put(C0201.m82(25266), Long.valueOf(this.t));
        hashMap.put(C0201.m82(25267), Long.valueOf(this.u));
        hashMap.put(C0201.m82(25268), Long.valueOf(this.v));
        hashMap.put(C0201.m82(25269), Long.valueOf(this.w));
        hashMap.put(C0201.m82(25270), Long.valueOf(this.x));
        hashMap.put(C0201.m82(25271), Long.valueOf(this.y));
        hashMap.put(C0201.m82(25272), Long.valueOf(this.z));
        hashMap.put(C0201.m82(25273), Long.valueOf(this.A));
        return hashMap;
    }

    public boolean X() {
        return this.i.isEmpty() && this.h.isEmpty();
    }

    public void Y() {
        this.m = false;
        com.facebook.react.modules.core.g.i().o(g.c.DISPATCH_UI, this.e);
        U();
    }

    public void Z(n0 n0Var) {
        this.i.add(0, new t(n0Var));
    }

    public void a0() {
        this.o = true;
        this.q = 0;
        this.z = 0;
        this.A = 0;
    }

    public void b0() {
        this.m = true;
        com.facebook.react.modules.core.g.i().m(g.c.DISPATCH_UI, this.e);
    }

    public void c0(ak0 ak0) {
        this.l = ak0;
    }

    public void y(int i2, View view) {
        this.b.b(i2, view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b3, code lost:
        r0 = th;
     */
    public void z(int i2, long j2, long j3) {
        long j4;
        Throwable th;
        ArrayList<h> arrayList;
        ArrayList<u> arrayList2;
        a aVar;
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, F);
        a2.a(D, i2);
        a2.c();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            ArrayDeque<u> arrayDeque = null;
            if (!this.h.isEmpty()) {
                ArrayList<h> arrayList3 = this.h;
                this.h = new ArrayList<>();
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (!this.i.isEmpty()) {
                ArrayList<u> arrayList4 = this.i;
                this.i = new ArrayList<>();
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            synchronized (this.d) {
                if (!this.k.isEmpty()) {
                    arrayDeque = this.k;
                    this.k = new ArrayDeque<>();
                }
            }
            if (this.l != null) {
                this.l.a();
            }
            try {
                aVar = new a(i2, arrayList, arrayDeque, arrayList2, j2, j3, uptimeMillis, currentThreadTimeMillis);
                j4 = 0;
            } catch (Throwable th2) {
                th = th2;
                j4 = 0;
                com.facebook.systrace.a.g(j4);
                throw th;
            }
            try {
                b.AbstractC0053b a3 = com.facebook.systrace.b.a(0, C);
                a3.a(E, i2);
                a3.c();
                synchronized (this.c) {
                    com.facebook.systrace.a.g(0);
                    this.j.add(aVar);
                }
                if (!this.m) {
                    UiThreadUtil.runOnUiThread(new b(this.f));
                }
                com.facebook.systrace.a.g(0);
                return;
            } catch (Throwable th3) {
                th = th3;
                com.facebook.systrace.a.g(j4);
                throw th;
            }
            while (true) {
            }
        } catch (Throwable th4) {
            th = th4;
            j4 = 0;
            com.facebook.systrace.a.g(j4);
            throw th;
        }
    }
}
