package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: gn  reason: default package */
/* compiled from: RequestManagerRetriever */
public class gn implements Handler.Callback {
    private static final b f = new a();
    private volatile k a;
    public final Map<FragmentManager, fn> b = new HashMap();
    public final Map<i, jn> c = new HashMap();
    private final Handler d;
    private final b e;

    /* renamed from: gn$a */
    /* compiled from: RequestManagerRetriever */
    class a implements b {
        @Override // defpackage.gn.b
        public k a(c cVar, cn cnVar, hn hnVar, Context context) {
            return new k(cVar, cnVar, hnVar, context);
        }
    }

    /* renamed from: gn$b */
    /* compiled from: RequestManagerRetriever */
    public interface b {
        k a(c cVar, cn cnVar, hn hnVar, Context context);
    }

    public gn(b bVar) {
        new r0();
        new r0();
        new Bundle();
        this.e = bVar == null ? f : bVar;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException(C0201.m82(17777));
        }
    }

    private static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    private k c(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        fn i = i(fragmentManager, fragment, z);
        k e2 = i.e();
        if (e2 != null) {
            return e2;
        }
        k a2 = this.e.a(c.c(context), i.c(), i.f(), context);
        i.k(a2);
        return a2;
    }

    private k g(Context context) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = this.e.a(c.c(context.getApplicationContext()), new wm(), new bn(), context.getApplicationContext());
                }
            }
        }
        return this.a;
    }

    private fn i(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        String r0 = C0201.m82(17778);
        fn fnVar = (fn) fragmentManager.findFragmentByTag(r0);
        if (fnVar == null && (fnVar = this.b.get(fragmentManager)) == null) {
            fnVar = new fn();
            fnVar.j(fragment);
            if (z) {
                fnVar.c().d();
            }
            this.b.put(fragmentManager, fnVar);
            fragmentManager.beginTransaction().add(fnVar, r0).commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fnVar;
    }

    private jn k(i iVar, androidx.fragment.app.Fragment fragment, boolean z) {
        String r0 = C0201.m82(17779);
        jn jnVar = (jn) iVar.c(r0);
        if (jnVar == null && (jnVar = this.c.get(iVar)) == null) {
            jnVar = new jn();
            jnVar.D(fragment);
            if (z) {
                jnVar.v().d();
            }
            this.c.put(iVar, jnVar);
            n a2 = iVar.a();
            a2.b(jnVar, r0);
            a2.e();
            this.d.obtainMessage(2, iVar).sendToTarget();
        }
        return jnVar;
    }

    private static boolean l(Context context) {
        Activity b2 = b(context);
        return b2 == null || !b2.isFinishing();
    }

    private k m(Context context, i iVar, androidx.fragment.app.Fragment fragment, boolean z) {
        jn k = k(iVar, fragment, z);
        k x = k.x();
        if (x != null) {
            return x;
        }
        k a2 = this.e.a(c.c(context), k.v(), k.y(), context);
        k.E(a2);
        return a2;
    }

    public k d(Activity activity) {
        if (fp.o()) {
            return e(activity.getApplicationContext());
        }
        a(activity);
        return c(activity, activity.getFragmentManager(), null, l(activity));
    }

    public k e(Context context) {
        if (context != null) {
            if (fp.p() && !(context instanceof Application)) {
                if (context instanceof d) {
                    return f((d) context);
                }
                if (context instanceof Activity) {
                    return d((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return e(contextWrapper.getBaseContext());
                    }
                }
            }
            return g(context);
        }
        throw new IllegalArgumentException(C0201.m82(17780));
    }

    public k f(d dVar) {
        if (fp.o()) {
            return e(dVar.getApplicationContext());
        }
        a(dVar);
        return m(dVar, dVar.p(), null, l(dVar));
    }

    @Deprecated
    public fn h(Activity activity) {
        return i(activity.getFragmentManager(), null, l(activity));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    public boolean handleMessage(Message message) {
        Object obj;
        String r1;
        Object obj2;
        Object obj3;
        int i = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.b.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null) {
                r1 = C0201.m82(17781);
                if (Log.isLoggable(r1, 5)) {
                    Log.w(r1, C0201.m82(17782) + obj);
                }
            }
            return z;
        } else {
            obj3 = (i) message.obj;
            obj2 = this.c.remove(obj3);
        }
        obj4 = obj2;
        obj = obj3;
        r1 = C0201.m82(17781);
        if (Log.isLoggable(r1, 5)) {
        }
        return z;
    }

    public jn j(Context context, i iVar) {
        return k(iVar, null, l(context));
    }
}
