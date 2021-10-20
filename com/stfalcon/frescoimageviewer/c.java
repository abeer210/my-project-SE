package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.stfalcon.frescoimageviewer.b;
import defpackage.w90;
import java.util.HashSet;
import java.util.Iterator;
import vigqyno.C0201;

/* compiled from: ImageViewerAdapter */
public class c extends rp2<b> {
    private Context f;
    private b.d<?> g;
    private HashSet<b> h = new HashSet<>();
    private jh0 i;
    private ca0 j;
    private boolean k;

    /* access modifiers changed from: package-private */
    /* compiled from: ImageViewerAdapter */
    public class a extends y80<bf0> {
        public final /* synthetic */ up2 b;

        public a(c cVar, up2 up2) {
            this.b = up2;
        }

        /* renamed from: h */
        public void b(String str, bf0 bf0, Animatable animatable) {
            super.b(str, bf0, animatable);
            if (bf0 != null) {
                this.b.p(bf0.c(), bf0.a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ImageViewerAdapter */
    public class b extends sp2 implements ux2 {
        private int e = -1;
        private up2 f;
        private boolean g;

        public b(View view) {
            super(view);
            this.f = (up2) view;
        }

        private void j(String str, ReadableMap readableMap) {
            e80 f2 = c80.f();
            f2.D(this.f.getController());
            f2.A(c.this.J(this.f));
            f2.y(true);
            if (c.this.i != null) {
                c.this.i.F(Uri.parse(str));
                f2.B(c.this.i.a());
            }
            f2.B(com.facebook.react.modules.fresco.a.w(jh0.r(new nl0(c.this.I(), str).e()), readableMap));
            this.f.setController(f2.a());
        }

        private void k() {
            if (c.this.j != null) {
                c.this.j.v(w90.c.c);
                this.f.setHierarchy(c.this.j.a());
            }
        }

        @Override // defpackage.ux2
        public void a(float f2, float f3, float f4) {
            this.g = this.f.getScale() > 1.0f;
        }

        public void h(int i) {
            String r0 = C0201.m82(7373);
            this.e = i;
            k();
            ReadableMap readableMap = null;
            try {
                com.merryjs.PhotoViewer.b bVar = (com.merryjs.PhotoViewer.b) c.this.g.e().get(i);
                if (bVar.a != null && bVar.a.hasKey(r0)) {
                    readableMap = bVar.a.getMap(r0);
                }
            } catch (Exception unused) {
            }
            j(c.this.g.c(i), readableMap);
            this.f.setOnScaleChangeListener(this);
        }

        public void i() {
            this.f.o(1.0f, true);
        }
    }

    public c(Context context, b.d<?> dVar, jh0 jh0, ca0 ca0, boolean z) {
        this.f = context;
        this.g = dVar;
        this.i = jh0;
        this.j = ca0;
        this.k = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private y80<bf0> J(up2 up2) {
        return new a(this, up2);
    }

    public Context I() {
        return this.f;
    }

    public boolean K(int i2) {
        Iterator<b> it = this.h.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.e == i2) {
                return next.g;
            }
        }
        return false;
    }

    /* renamed from: L */
    public void B(b bVar, int i2) {
        bVar.h(i2);
    }

    /* renamed from: M */
    public b C(ViewGroup viewGroup, int i2) {
        up2 up2 = new up2(this.f);
        up2.setEnabled(this.k);
        b bVar = new b(up2);
        this.h.add(bVar);
        return bVar;
    }

    public void N(int i2) {
        Iterator<b> it = this.h.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.e == i2) {
                next.i();
                return;
            }
        }
    }

    @Override // defpackage.rp2
    public int y() {
        return this.g.e().size();
    }
}
