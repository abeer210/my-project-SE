package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import vigqyno.C0201;

/* compiled from: AppCompatDelegate */
public abstract class e {
    private static int a;
    private static final s0<WeakReference<e>> b = new s0<>();
    private static final Object c = new Object();

    static {
        C0201.m83(e.class, 740);
    }

    public static e e(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e f(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    public static int h() {
        return a;
    }

    public static void n(e eVar) {
        synchronized (c) {
            x(eVar);
            b.add(new WeakReference<>(eVar));
        }
    }

    public static void o(e eVar) {
        synchronized (c) {
            x(eVar);
        }
    }

    private static void x(e eVar) {
        synchronized (c) {
            Iterator<WeakReference<e>> it = b.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void z(boolean z) {
        c1.b(z);
    }

    public abstract void A(int i);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void D(Toolbar toolbar);

    public void E(int i) {
    }

    public abstract void F(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public void d(Context context) {
    }

    public abstract <T extends View> T g(int i);

    public int i() {
        return -100;
    }

    public abstract MenuInflater j();

    public abstract a k();

    public abstract void l();

    public abstract void m();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean y(int i);
}
