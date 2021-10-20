package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.b;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* compiled from: ImageViewer */
public class b implements e, DialogInterface.OnKeyListener {
    private static final String d = b.class.getSimpleName();
    private c a;
    private androidx.appcompat.app.b b;
    private d c;

    /* access modifiers changed from: package-private */
    /* compiled from: ImageViewer */
    public class a extends ViewPager.n {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.n, androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            w30.t(i);
            try {
                if (b.this.a.e != null) {
                    b.this.a.e.a(i);
                }
            } finally {
                w30.u();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.stfalcon.frescoimageviewer.b$b  reason: collision with other inner class name */
    /* compiled from: ImageViewer */
    public class DialogInterface$OnDismissListenerC0128b implements DialogInterface.OnDismissListener {
        public DialogInterface$OnDismissListenerC0128b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (b.this.a.f != null) {
                b.this.a.f.onDismiss();
            }
        }
    }

    /* compiled from: ImageViewer */
    public static class c<T> {
        private Context a;
        private d<T> b;
        private int c;
        private int d;
        private g e;
        private f f;
        private View g;
        private int h;
        private int[] i;
        private jh0 j;
        private ca0 k;
        private boolean l;
        private boolean m;
        private boolean n;

        public c(Context context, T[] tArr) {
            this(context, new ArrayList(Arrays.asList(tArr)));
        }

        public b o() {
            return new b(this);
        }

        public c p(boolean z) {
            this.l = z;
            return this;
        }

        public c q(ca0 ca0) {
            this.k = ca0;
            return this;
        }

        public c r(e<T> eVar) {
            ((d) this.b).b = eVar;
            return this;
        }

        public c s(g gVar) {
            this.e = gVar;
            return this;
        }

        public c t(f fVar) {
            this.f = fVar;
            return this;
        }

        public c u(View view) {
            this.g = view;
            return this;
        }

        public c v(int i2) {
            this.d = i2;
            return this;
        }

        public c(Context context, List<T> list) {
            this.c = -16777216;
            this.i = new int[4];
            this.l = true;
            this.m = true;
            this.n = true;
            this.a = context;
            this.b = new d<>(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ImageViewer */
    public static class d<T> {
        private List<T> a;
        private e<T> b;

        public d(List<T> list) {
            this.a = list;
        }

        public String c(int i) {
            return d(this.a.get(i));
        }

        public String d(T t) {
            e<T> eVar = this.b;
            if (eVar == null) {
                return t.toString();
            }
            return eVar.a(t);
        }

        public List<T> e() {
            return this.a;
        }
    }

    /* compiled from: ImageViewer */
    public interface e<T> {
        String a(T t);
    }

    /* compiled from: ImageViewer */
    public interface f {
        void onDismiss();
    }

    /* compiled from: ImageViewer */
    public interface g {
        void a(int i);
    }

    public b(c cVar) {
        this.a = cVar;
        b();
    }

    private void b() {
        d dVar = new d(this.a.a);
        this.c = dVar;
        dVar.r(this.a.j);
        this.c.q(this.a.k);
        this.c.g(this.a.m);
        this.c.f(this.a.n);
        this.c.t(this);
        this.c.setBackgroundColor(this.a.c);
        this.c.u(this.a.g);
        this.c.s(this.a.h);
        this.c.p(this.a.i);
        this.c.x(this.a.b, this.a.d);
        this.c.v(new a());
        b.a aVar = new b.a(this.a.a, c());
        aVar.m(this.c);
        aVar.i(this);
        androidx.appcompat.app.b a2 = aVar.a();
        this.b = a2;
        a2.setOnDismissListener(new DialogInterface$OnDismissListenerC0128b());
    }

    private int c() {
        return this.a.l ? 16973841 : 16973840;
    }

    public void d() {
        if (!this.a.b.a.isEmpty()) {
            this.b.show();
        } else {
            Log.w(d, C0201.m82(25448));
        }
    }

    @Override // com.stfalcon.frescoimageviewer.e
    public void onDismiss() {
        this.b.dismiss();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            if (this.c.j()) {
                this.c.o();
            } else {
                dialogInterface.cancel();
            }
        }
        return true;
    }
}
