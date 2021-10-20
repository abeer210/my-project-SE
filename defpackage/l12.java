package defpackage;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.m;
import com.google.firebase.components.f;
import com.google.firebase.components.h;
import com.google.firebase.components.l;
import com.google.firebase.components.s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

/* renamed from: l12  reason: default package */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class l12 {
    private static final Object j = new Object();
    private static final Executor k = new d();
    public static final Map<String, l12> l = new r0();
    private final Context a;
    private final String b;
    private final n12 c;
    private final l d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final s<y12> g;
    private final List<b> h = new CopyOnWriteArrayList();
    private final List<m12> i = new CopyOnWriteArrayList();

    /* renamed from: l12$b */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public interface b {
        void a(boolean z);
    }

    /* access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: l12$c */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public static class c implements c.a {
        private static AtomicReference<c> a = new AtomicReference<>();

        private c() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    c cVar = new c();
                    if (a.compareAndSet(null, cVar)) {
                        com.google.android.gms.common.api.internal.c.c(application);
                        com.google.android.gms.common.api.internal.c.b().a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z) {
            synchronized (l12.j) {
                Iterator it = new ArrayList(l12.l.values()).iterator();
                while (it.hasNext()) {
                    l12 l12 = (l12) it.next();
                    if (l12.e.get()) {
                        l12.x(z);
                    }
                }
            }
        }
    }

    /* renamed from: l12$d */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class d implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private d() {
        }

        public void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    @TargetApi(24)
    /* renamed from: l12$e */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public static class e extends BroadcastReceiver {
        private static AtomicReference<e> b = new AtomicReference<>();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                e eVar = new e(context);
                if (b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter(C0201.m82(24903)));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (l12.j) {
                for (l12 l12 : l12.l.values()) {
                    l12.p();
                }
            }
            c();
        }
    }

    public l12(Context context, String str, n12 n12) {
        u.k(context);
        this.a = context;
        u.g(str);
        this.b = str;
        u.k(n12);
        this.c = n12;
        List<h> a2 = f.b(context).a();
        this.d = new l(k, a2, com.google.firebase.components.d.n(context, Context.class, new Class[0]), com.google.firebase.components.d.n(this, l12.class, new Class[0]), com.google.firebase.components.d.n(n12, n12.class, new Class[0]), e22.a(C0201.m82(13055), C0201.m82(13056)), e22.a(C0201.m82(13057), C0201.m82(13058)), b22.b());
        this.g = new s<>(k12.a(this, context));
    }

    private void e() {
        u.o(!this.f.get(), C0201.m82(13059));
    }

    private static List<String> h() {
        ArrayList arrayList = new ArrayList();
        synchronized (j) {
            for (l12 l12 : l.values()) {
                arrayList.add(l12.m());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<l12> j(Context context) {
        ArrayList arrayList;
        synchronized (j) {
            arrayList = new ArrayList(l.values());
        }
        return arrayList;
    }

    public static l12 k() {
        l12 l12;
        synchronized (j) {
            l12 = l.get(C0201.m82(13060));
            if (l12 == null) {
                throw new IllegalStateException(C0201.m82(13061) + m.a() + C0201.m82(13062));
            }
        }
        return l12;
    }

    public static l12 l(String str) {
        l12 l12;
        String str2;
        synchronized (j) {
            l12 = l.get(w(str));
            if (l12 == null) {
                List<String> h2 = h();
                if (h2.isEmpty()) {
                    str2 = C0201.m82(13063);
                } else {
                    str2 = C0201.m82(13064) + TextUtils.join(C0201.m82(13065), h2);
                }
                throw new IllegalStateException(String.format(C0201.m82(13066), str, str2));
            }
        }
        return l12;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        if (!h2.a(this.a)) {
            e.b(this.a);
        } else {
            this.d.e(u());
        }
    }

    public static l12 q(Context context) {
        synchronized (j) {
            if (l.containsKey(C0201.m82(13067))) {
                return k();
            }
            n12 a2 = n12.a(context);
            if (a2 == null) {
                Log.w(C0201.m82(13068), C0201.m82(13069));
                return null;
            }
            return r(context, a2);
        }
    }

    public static l12 r(Context context, n12 n12) {
        return s(context, n12, C0201.m82(13070));
    }

    public static l12 s(Context context, n12 n12, String str) {
        l12 l12;
        c.c(context);
        String w = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            boolean z = !l.containsKey(w);
            u.o(z, C0201.m82(13071) + w + C0201.m82(13072));
            u.l(context, C0201.m82(13073));
            l12 = new l12(context, w, n12);
            l.put(w, l12);
        }
        l12.p();
        return l12;
    }

    public static /* synthetic */ y12 v(l12 l12, Context context) {
        return new y12(context, l12.o(), (u12) l12.d.a(u12.class));
    }

    private static String w(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void x(boolean z) {
        Log.d(C0201.m82(13074), C0201.m82(13075));
        for (b bVar : this.h) {
            bVar.a(z);
        }
    }

    private void y() {
        for (m12 m12 : this.i) {
            m12.a(this.b, this.c);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l12)) {
            return false;
        }
        return this.b.equals(((l12) obj).m());
    }

    public void f() {
        if (this.f.compareAndSet(false, true)) {
            synchronized (j) {
                l.remove(this.b);
            }
            y();
        }
    }

    public <T> T g(Class<T> cls) {
        e();
        return (T) this.d.a(cls);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public Context i() {
        e();
        return this.a;
    }

    public String m() {
        e();
        return this.b;
    }

    public n12 n() {
        e();
        return this.c;
    }

    public String o() {
        return com.google.android.gms.common.util.c.a(m().getBytes(Charset.defaultCharset())) + C0201.m82(13076) + com.google.android.gms.common.util.c.a(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        e();
        return this.g.get().b();
    }

    public String toString() {
        s.a c2 = com.google.android.gms.common.internal.s.c(this);
        c2.a(C0201.m82(13077), this.b);
        c2.a(C0201.m82(13078), this.c);
        return c2.toString();
    }

    public boolean u() {
        return C0201.m82(13079).equals(m());
    }
}
