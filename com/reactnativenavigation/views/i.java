package com.reactnativenavigation.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* compiled from: Fab */
public class i extends zm0 implements yd2 {
    private String c0 = C0201.m82(37336);
    private zd2 d0 = new zd2(this);

    /* compiled from: Fab */
    class a extends lj2 {
        public final /* synthetic */ uf2 a;

        public a(uf2 uf2) {
            this.a = uf2;
        }

        @Override // defpackage.lj2, defpackage.kj2.b
        public void a(Throwable th) {
            th.printStackTrace();
        }

        @Override // defpackage.lj2, defpackage.kj2.b
        public void b(List<? extends Drawable> list) {
            if (this.a.f()) {
                ((Drawable) list.get(0)).setColorFilter(new PorterDuffColorFilter(((Integer) this.a.d()).intValue(), PorterDuff.Mode.SRC_IN));
            }
            i.this.setImageDrawable((Drawable) list.get(0));
        }
    }

    public i(Context context, String str) {
        super(context);
        this.c0 = str;
    }

    public void O(String str, uf2 uf2) {
        new kj2().h(getContext(), Collections.singletonList(str), new a(uf2));
    }

    public void P() {
        this.d0.e();
    }

    public void Q(fe2 fe2) {
        this.d0.f(fe2);
    }

    @Override // defpackage.yd2
    public void a() {
        K(true);
    }

    @Override // defpackage.yd2
    public void b() {
        w(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.c0.equals(((i) obj).c0);
    }

    public String getFabId() {
        return this.c0;
    }

    public int hashCode() {
        return this.c0.hashCode();
    }
}
