package com.airbnb.android.react.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.google.android.gms.maps.model.b;
import defpackage.w90;
import vigqyno.C0201;

/* compiled from: ImageReader */
public class q {
    private final p a;
    private final Context b;
    private final Resources c;
    private final na0<?> d;
    private n70<v60<ye0>> e;
    private final z80<bf0> f = new a();

    /* compiled from: ImageReader */
    class a extends y80<bf0> {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
        /* renamed from: h */
        public void b(String str, bf0 bf0, Animatable animatable) {
            v60 v60;
            Throwable th;
            Bitmap n;
            try {
                v60 = (v60) q.this.e.f();
                if (v60 != null) {
                    try {
                        ye0 ye0 = (ye0) v60.w();
                        if (!(ye0 == null || !(ye0 instanceof ze0) || (n = ((ze0) ye0).n()) == null)) {
                            Bitmap copy = n.copy(Bitmap.Config.ARGB_8888, true);
                            q.this.a.setIconBitmap(copy);
                            q.this.a.setIconBitmapDescriptor(b.c(copy));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        q.this.e.close();
                        if (v60 != null) {
                            v60.s(v60);
                        }
                        throw th;
                    }
                }
                q.this.e.close();
                if (v60 != null) {
                    v60.s(v60);
                }
                q.this.a.a();
            } catch (Throwable th3) {
                v60 = null;
                th = th3;
                q.this.e.close();
                if (v60 != null) {
                }
                throw th;
            }
        }
    }

    public q(Context context, Resources resources, p pVar) {
        this.b = context;
        this.c = resources;
        this.a = pVar;
        na0<?> e2 = na0.e(c(resources), context);
        this.d = e2;
        e2.k();
    }

    private ba0 c(Resources resources) {
        ca0 ca0 = new ca0(resources);
        ca0.v(w90.c.c);
        ca0.y(0);
        return ca0.a();
    }

    private com.google.android.gms.maps.model.a d(String str) {
        return b.d(e(str));
    }

    private int e(String str) {
        return this.c.getIdentifier(str, C0201.m82(31563), this.b.getPackageName());
    }

    public void f(String str) {
        if (str == null) {
            this.a.setIconBitmapDescriptor(null);
            this.a.a();
        } else if (str.startsWith(C0201.m82(31564)) || str.startsWith(C0201.m82(31565)) || str.startsWith(C0201.m82(31566)) || str.startsWith(C0201.m82(31567))) {
            ih0 a2 = jh0.r(Uri.parse(str)).a();
            this.e = c80.a().d(a2, this);
            e80 f2 = c80.f();
            f2.B(a2);
            e80 e80 = f2;
            e80.A(this.f);
            e80 e802 = e80;
            e802.D(this.d.g());
            this.d.o(e802.a());
        } else {
            com.google.android.gms.maps.model.a d2 = d(str);
            if (d2 != null) {
                this.a.setIconBitmapDescriptor(d2);
                this.a.setIconBitmap(BitmapFactory.decodeResource(this.c, e(str)));
            }
            this.a.a();
        }
    }
}
