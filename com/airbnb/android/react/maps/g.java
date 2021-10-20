package com.airbnb.android.react.maps;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.android.react.maps.AirMapMarkerManager;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.o;
import com.google.android.gms.maps.model.p;
import defpackage.w90;
import vigqyno.C0201;

/* compiled from: AirMapMarker */
public class g extends c {
    private float A;
    private boolean B;
    private boolean C = true;
    private boolean D = false;
    private boolean E = false;
    private final AirMapMarkerManager F;
    private String G;
    private final na0<?> H;
    private n70<v60<ye0>> I;
    private final z80<bf0> J = new a();
    private Bitmap K = null;
    private p a;
    private o b;
    private int c;
    private int d;
    private String e;
    private LatLng f;
    private String g;
    private String h;
    private boolean i;
    private float j;
    private float k;
    private a l;
    private View m;
    private final Context n;
    private float o = 0.0f;
    private com.google.android.gms.maps.model.a p;
    private Bitmap q;
    private float u = 0.0f;
    private boolean v = false;
    private boolean w = false;
    private int x = 0;
    private float y = 1.0f;
    private float z;

    /* compiled from: AirMapMarker */
    class a extends y80<bf0> {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
        /* renamed from: h */
        public void b(String str, bf0 bf0, Animatable animatable) {
            v60 v60;
            Throwable th;
            Bitmap n;
            try {
                v60 = (v60) g.this.I.f();
                if (v60 != null) {
                    try {
                        ye0 ye0 = (ye0) v60.w();
                        if (!(ye0 == null || !(ye0 instanceof ze0) || (n = ((ze0) ye0).n()) == null)) {
                            Bitmap copy = n.copy(Bitmap.Config.ARGB_8888, true);
                            g.this.q = copy;
                            g.this.p = com.google.android.gms.maps.model.b.c(copy);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        g.this.I.close();
                        if (v60 != null) {
                            v60.s(v60);
                        }
                        throw th;
                    }
                }
                g.this.I.close();
                if (v60 != null) {
                    v60.s(v60);
                }
                if (!(g.this.F == null || g.this.G == null)) {
                    g.this.F.getSharedIcon(g.this.G).e(g.this.p, g.this.q);
                }
                g.this.A(true);
            } catch (Throwable th3) {
                v60 = null;
                th = th3;
                g.this.I.close();
                if (v60 != null) {
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AirMapMarker */
    public class b implements TypeEvaluator<LatLng> {
        public b() {
        }

        /* renamed from: a */
        public LatLng evaluate(float f, LatLng latLng, LatLng latLng2) {
            return g.this.v(f, latLng, latLng2);
        }
    }

    public g(Context context, AirMapMarkerManager airMapMarkerManager) {
        super(context);
        this.n = context;
        this.F = airMapMarkerManager;
        na0<?> e2 = na0.e(r(), context);
        this.H = e2;
        e2.k();
    }

    private void D() {
        boolean z2 = this.C && this.E && this.b != null;
        if (z2 != this.D) {
            this.D = z2;
            if (z2) {
                w.f().e(this);
                return;
            }
            w.f().g(this);
            C();
        }
    }

    private void E() {
        a aVar = this.l;
        if (aVar != null && aVar.getChildCount() != 0) {
            LinearLayout linearLayout = new LinearLayout(this.n);
            linearLayout.setOrientation(1);
            a aVar2 = this.l;
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(aVar2.b, aVar2.c, 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(this.n);
            linearLayout2.setOrientation(0);
            a aVar3 = this.l;
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(aVar3.b, aVar3.c, 0.0f));
            linearLayout.addView(linearLayout2);
            linearLayout2.addView(this.l);
            this.m = linearLayout;
        }
    }

    private com.google.android.gms.maps.model.a getIcon() {
        if (!this.E) {
            com.google.android.gms.maps.model.a aVar = this.p;
            if (aVar != null) {
                return aVar;
            }
            return com.google.android.gms.maps.model.b.b(this.o);
        } else if (this.p == null) {
            return com.google.android.gms.maps.model.b.c(q());
        } else {
            Bitmap q2 = q();
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(this.q.getWidth(), q2.getWidth()), Math.max(this.q.getHeight(), q2.getHeight()), this.q.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(this.q, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(q2, 0.0f, 0.0f, (Paint) null);
            return com.google.android.gms.maps.model.b.c(createBitmap);
        }
    }

    private void p() {
        this.K = null;
    }

    private Bitmap q() {
        int i2 = this.c;
        int i3 = 100;
        if (i2 <= 0) {
            i2 = 100;
        }
        int i4 = this.d;
        if (i4 > 0) {
            i3 = i4;
        }
        buildDrawingCache();
        Bitmap bitmap = this.K;
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() != i2 || bitmap.getHeight() != i3) {
            bitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            this.K = bitmap;
        } else {
            bitmap.eraseColor(0);
        }
        draw(new Canvas(bitmap));
        return bitmap;
    }

    private ba0 r() {
        ca0 ca0 = new ca0(getResources());
        ca0.v(w90.c.c);
        ca0.y(0);
        return ca0.a();
    }

    private p s(p pVar) {
        pVar.e0(this.f);
        if (this.i) {
            pVar.p(this.j, this.k);
        }
        if (this.B) {
            pVar.R(this.z, this.A);
        }
        pVar.i0(this.g);
        pVar.g0(this.h);
        pVar.f0(this.u);
        pVar.s(this.v);
        pVar.r(this.w);
        pVar.j0((float) this.x);
        pVar.o(this.y);
        pVar.Q(getIcon());
        return pVar;
    }

    private com.google.android.gms.maps.model.a t(String str) {
        return com.google.android.gms.maps.model.b.d(u(str));
    }

    private int u(String str) {
        return getResources().getIdentifier(str, C0201.m82(36906), getContext().getPackageName());
    }

    public void A(boolean z2) {
        if (this.b != null) {
            if (z2) {
                C();
            }
            if (this.i) {
                this.b.g(this.j, this.k);
            } else {
                this.b.g(0.5f, 1.0f);
            }
            if (this.B) {
                this.b.k(this.z, this.A);
            } else {
                this.b.k(0.5f, 0.0f);
            }
        }
    }

    public boolean B() {
        if (!this.D) {
            return false;
        }
        C();
        return true;
    }

    public void C() {
        if (this.b != null) {
            boolean z2 = this.E;
            o oVar = this.b;
            if (oVar != null) {
                oVar.j(getIcon());
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        super.addView(view, i2);
        if (!(view instanceof a)) {
            this.E = true;
            D();
        }
        A(true);
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        o oVar = this.b;
        if (oVar != null) {
            oVar.e();
            this.b = null;
            D();
        }
    }

    public View getCallout() {
        if (this.l == null) {
            return null;
        }
        if (this.m == null) {
            E();
        }
        if (this.l.getTooltip()) {
            return this.m;
        }
        return null;
    }

    public a getCalloutView() {
        return this.l;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.b;
    }

    public String getIdentifier() {
        return this.e;
    }

    public View getInfoContents() {
        if (this.l == null) {
            return null;
        }
        if (this.m == null) {
            E();
        }
        if (this.l.getTooltip()) {
            return null;
        }
        return this.m;
    }

    public p getMarkerOptions() {
        if (this.a == null) {
            this.a = new p();
        }
        s(this.a);
        return this.a;
    }

    public void n(c cVar) {
        this.b = cVar.c(getMarkerOptions());
        D();
    }

    public void o(LatLng latLng, Integer num) {
        b bVar = new b();
        Property of = Property.of(o.class, LatLng.class, C0201.m82(36907));
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.b, of, bVar, latLng);
        ofObject.setDuration((long) num.intValue());
        ofObject.start();
    }

    @Override // com.facebook.react.views.view.f
    public void requestLayout() {
        super.requestLayout();
        if (getChildCount() == 0 && this.E) {
            this.E = false;
            p();
            D();
            A(true);
        }
    }

    public void setCalloutView(a aVar) {
        this.l = aVar;
    }

    public void setCoordinate(ReadableMap readableMap) {
        LatLng latLng = new LatLng(readableMap.getDouble(C0201.m82(36908)), readableMap.getDouble(C0201.m82(36909)));
        this.f = latLng;
        o oVar = this.b;
        if (oVar != null) {
            oVar.l(latLng);
        }
        A(false);
    }

    public void setDraggable(boolean z2) {
        this.w = z2;
        o oVar = this.b;
        if (oVar != null) {
            oVar.h(z2);
        }
        A(false);
    }

    public void setFlat(boolean z2) {
        this.v = z2;
        o oVar = this.b;
        if (oVar != null) {
            oVar.i(z2);
        }
        A(false);
    }

    public void setIconBitmap(Bitmap bitmap) {
        this.q = bitmap;
    }

    public void setIdentifier(String str) {
        this.e = str;
        A(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    public void setImage(String str) {
        boolean z2;
        AirMapMarkerManager airMapMarkerManager = this.F;
        if (airMapMarkerManager != null) {
            String str2 = this.G;
            if (str2 != null) {
                airMapMarkerManager.getSharedIcon(str2).c(this);
                this.F.removeSharedIconIfEmpty(this.G);
            }
            if (str != null) {
                AirMapMarkerManager.a sharedIcon = this.F.getSharedIcon(str);
                sharedIcon.a(this);
                z2 = sharedIcon.d();
                this.G = str;
                if (!z2) {
                    if (str == null) {
                        this.p = null;
                        A(true);
                        return;
                    } else if (str.startsWith(C0201.m82(36910)) || str.startsWith(C0201.m82(36911)) || str.startsWith(C0201.m82(36912)) || str.startsWith(C0201.m82(36913)) || str.startsWith(C0201.m82(36914))) {
                        ih0 a2 = jh0.r(Uri.parse(str)).a();
                        this.I = c80.a().d(a2, this);
                        e80 f2 = c80.f();
                        f2.B(a2);
                        e80 e80 = f2;
                        e80.A(this.J);
                        e80 e802 = e80;
                        e802.D(this.H.g());
                        this.H.o(e802.a());
                        return;
                    } else {
                        com.google.android.gms.maps.model.a t = t(str);
                        this.p = t;
                        if (t != null) {
                            int u2 = u(str);
                            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), u2);
                            this.q = decodeResource;
                            if (decodeResource == null) {
                                Drawable drawable = getResources().getDrawable(u2);
                                this.q = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                drawable.draw(new Canvas(this.q));
                            }
                        }
                        AirMapMarkerManager airMapMarkerManager2 = this.F;
                        if (!(airMapMarkerManager2 == null || str == null)) {
                            airMapMarkerManager2.getSharedIcon(str).e(this.p, this.q);
                        }
                        A(true);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        z2 = true;
        this.G = str;
        if (!z2) {
        }
    }

    public void setMarkerHue(float f2) {
        this.o = f2;
        A(false);
    }

    public void setOpacity(float f2) {
        this.y = f2;
        o oVar = this.b;
        if (oVar != null) {
            oVar.f(f2);
        }
        A(false);
    }

    public void setRotation(float f2) {
        this.u = f2;
        o oVar = this.b;
        if (oVar != null) {
            oVar.m(f2);
        }
        A(false);
    }

    public void setSnippet(String str) {
        this.h = str;
        o oVar = this.b;
        if (oVar != null) {
            oVar.n(str);
        }
        A(false);
    }

    public void setTitle(String str) {
        this.g = str;
        o oVar = this.b;
        if (oVar != null) {
            oVar.o(str);
        }
        A(false);
    }

    public void setTracksViewChanges(boolean z2) {
        this.C = z2;
        D();
    }

    public void setZIndex(int i2) {
        this.x = i2;
        o oVar = this.b;
        if (oVar != null) {
            oVar.q((float) i2);
        }
        A(false);
    }

    public LatLng v(float f2, LatLng latLng, LatLng latLng2) {
        double d2 = latLng2.a;
        double d3 = latLng.a;
        double d4 = (double) f2;
        Double.isNaN(d4);
        double d5 = ((d2 - d3) * d4) + d3;
        double d6 = latLng2.b;
        double d7 = latLng.b;
        Double.isNaN(d4);
        return new LatLng(d5, ((d6 - d7) * d4) + d7);
    }

    public void w(double d2, double d3) {
        this.i = true;
        float f2 = (float) d2;
        this.j = f2;
        float f3 = (float) d3;
        this.k = f3;
        o oVar = this.b;
        if (oVar != null) {
            oVar.g(f2, f3);
        }
        A(false);
    }

    public void x(double d2, double d3) {
        this.B = true;
        float f2 = (float) d2;
        this.z = f2;
        float f3 = (float) d3;
        this.A = f3;
        o oVar = this.b;
        if (oVar != null) {
            oVar.k(f2, f3);
        }
        A(false);
    }

    public void y(com.google.android.gms.maps.model.a aVar, Bitmap bitmap) {
        this.p = aVar;
        this.q = bitmap;
        A(true);
    }

    public void z(int i2, int i3) {
        this.c = i2;
        this.d = i3;
        A(true);
    }

    public g(Context context, p pVar, AirMapMarkerManager airMapMarkerManager) {
        super(context);
        this.n = context;
        this.F = airMapMarkerManager;
        na0<?> e2 = na0.e(r(), context);
        this.H = e2;
        e2.k();
        this.f = pVar.E();
        w((double) pVar.w(), (double) pVar.y());
        x((double) pVar.A(), (double) pVar.D());
        setTitle(pVar.H());
        setSnippet(pVar.G());
        setRotation(pVar.F());
        setFlat(pVar.V());
        setDraggable(pVar.T());
        setZIndex(Math.round(pVar.P()));
        setAlpha(pVar.u());
        this.p = pVar.z();
    }
}
