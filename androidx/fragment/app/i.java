package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: FragmentManager */
public abstract class i {
    public static final g b = new g();
    private g a = null;

    /* compiled from: FragmentManager */
    public static abstract class a {
        public abstract void a(i iVar, Fragment fragment, Bundle bundle);

        public abstract void b(i iVar, Fragment fragment, Context context);

        public abstract void c(i iVar, Fragment fragment, Bundle bundle);

        public abstract void d(i iVar, Fragment fragment);

        public abstract void e(i iVar, Fragment fragment);

        public abstract void f(i iVar, Fragment fragment);

        public abstract void g(i iVar, Fragment fragment, Context context);

        public abstract void h(i iVar, Fragment fragment, Bundle bundle);

        public abstract void i(i iVar, Fragment fragment);

        public abstract void j(i iVar, Fragment fragment, Bundle bundle);

        public abstract void k(i iVar, Fragment fragment);

        public abstract void l(i iVar, Fragment fragment);

        public abstract void m(i iVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(i iVar, Fragment fragment);
    }

    /* compiled from: FragmentManager */
    public interface b {
        void a();
    }

    public abstract n a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Fragment c(String str);

    public g d() {
        if (this.a == null) {
            this.a = b;
        }
        return this.a;
    }

    public abstract List<Fragment> e();

    public abstract boolean f();

    public abstract void g(int i, int i2);

    public abstract boolean h();

    public void i(g gVar) {
        this.a = gVar;
    }
}
