package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import vigqyno.C0201;

/* renamed from: u4  reason: default package */
/* compiled from: Loader */
public class u4<D> {
    public int a;
    public c<D> b;
    public b<D> c;
    public Context d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public boolean i = false;

    /* renamed from: u4$a */
    /* compiled from: Loader */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            u4.this.p();
        }
    }

    /* renamed from: u4$b */
    /* compiled from: Loader */
    public interface b<D> {
        void a(u4<D> u4Var);
    }

    /* renamed from: u4$c */
    /* compiled from: Loader */
    public interface c<D> {
        void a(u4<D> u4Var, D d);
    }

    public u4(Context context) {
        this.d = context.getApplicationContext();
    }

    public void A(c<D> cVar) {
        c<D> cVar2 = this.b;
        if (cVar2 == null) {
            throw new IllegalStateException(C0201.m82(5970));
        } else if (cVar2 == cVar) {
            this.b = null;
        } else {
            throw new IllegalArgumentException(C0201.m82(5969));
        }
    }

    public void b() {
        this.f = true;
        n();
    }

    public boolean c() {
        return o();
    }

    public void d() {
        this.i = false;
    }

    public String e(D d2) {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.util.a.a(d2, sb);
        sb.append(C0201.m82(5971));
        return sb.toString();
    }

    public void f() {
        b<D> bVar = this.c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void g(D d2) {
        c<D> cVar = this.b;
        if (cVar != null) {
            cVar.a(this, d2);
        }
    }

    @Deprecated
    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print(C0201.m82(5972));
        printWriter.print(this.a);
        printWriter.print(C0201.m82(5973));
        printWriter.println(this.b);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print(C0201.m82(5974));
            printWriter.print(this.e);
            printWriter.print(C0201.m82(5975));
            printWriter.print(this.h);
            printWriter.print(C0201.m82(5976));
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(str);
            printWriter.print(C0201.m82(5977));
            printWriter.print(this.f);
            printWriter.print(C0201.m82(5978));
            printWriter.println(this.g);
        }
    }

    public void i() {
        q();
    }

    public Context j() {
        return this.d;
    }

    public boolean k() {
        return this.f;
    }

    public boolean l() {
        return this.g;
    }

    public boolean m() {
        return this.e;
    }

    public void n() {
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        if (this.e) {
            i();
        } else {
            this.h = true;
        }
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
        throw null;
    }

    public void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.util.a.a(this, sb);
        sb.append(C0201.m82(5979));
        sb.append(this.a);
        sb.append(C0201.m82(5980));
        return sb.toString();
    }

    public void u(int i2, c<D> cVar) {
        if (this.b == null) {
            this.b = cVar;
            this.a = i2;
            return;
        }
        throw new IllegalStateException(C0201.m82(5981));
    }

    public void v() {
        r();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void w() {
        if (this.i) {
            p();
        }
    }

    public final void x() {
        this.e = true;
        this.g = false;
        this.f = false;
        s();
    }

    public void y() {
        this.e = false;
        t();
    }

    public boolean z() {
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        return z;
    }
}
