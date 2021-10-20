package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.j;
import com.google.android.gms.maps.model.k;
import com.google.android.gms.maps.model.o;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: u52  reason: default package */
/* compiled from: KmlRenderer */
public class u52 extends t42 {
    private final ArrayList<String> q = new ArrayList<>();
    private boolean r = false;
    private boolean s = false;
    private HashMap<m52, j> t;
    private ArrayList<j52> u;

    /* access modifiers changed from: private */
    /* renamed from: u52$a */
    /* compiled from: KmlRenderer */
    public class a extends AsyncTask<String, Void, Bitmap> {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) new URL(this.a).getContent());
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.a);
            } catch (IOException e) {
                Log.e(C0201.m82(36540), C0201.m82(36538) + this.a + C0201.m82(36539), e);
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e(C0201.m82(36542), C0201.m82(36541) + this.a);
                return;
            }
            u52.this.B(this.a, bitmap);
            if (u52.this.z()) {
                u52 u52 = u52.this;
                u52.X(this.a, u52.t, true);
                u52 u522 = u52.this;
                u522.W(this.a, u522.u, true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u52$b */
    /* compiled from: KmlRenderer */
    public class b extends AsyncTask<String, Void, Bitmap> {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) new URL(this.a).getContent());
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.a);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e(C0201.m82(36587), C0201.m82(36586) + this.a);
                return;
            }
            u52.this.B(this.a, bitmap);
            if (u52.this.z()) {
                u52 u52 = u52.this;
                u52.a0(this.a, u52.q());
                u52 u522 = u52.this;
                u522.T(this.a, u522.u);
            }
        }
    }

    public u52(c cVar, Context context) {
        super(cVar, context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void T(String str, Iterable<j52> iterable) {
        for (j52 j52 : iterable) {
            a0(str, j52.d());
            if (j52.i()) {
                T(str, j52.a());
            }
        }
    }

    private void U(Iterable<j52> iterable, boolean z) {
        for (j52 j52 : iterable) {
            boolean f0 = f0(j52, z);
            if (j52.h() != null) {
                D(j52.h());
            }
            if (j52.g() != null) {
                super.n(j52.g(), y());
            }
            V(j52, f0);
            if (j52.i()) {
                U(j52.a(), f0);
            }
        }
    }

    private void V(j52 j52, boolean z) {
        for (r52 r52 : j52.c()) {
            boolean z2 = z && t42.w(r52);
            if (r52.a() != null) {
                String b2 = r52.b();
                o42 a2 = r52.a();
                v52 v = v(b2);
                r52 r522 = r52;
                Object e = e(r522, a2, v, r522.g(), z2);
                j52.k(r522, e);
                A(e, r52);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void W(String str, Iterable<j52> iterable, boolean z) {
        for (j52 j52 : iterable) {
            boolean f0 = f0(j52, z);
            X(str, j52.b(), f0);
            if (j52.i()) {
                W(str, j52.a(), f0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void X(String str, HashMap<m52, j> hashMap, boolean z) {
        com.google.android.gms.maps.model.a c = com.google.android.gms.maps.model.b.c(t().c(str));
        for (m52 m52 : hashMap.keySet()) {
            if (m52.b().equals(str)) {
                k a2 = m52.a();
                a2.E(c);
                j o = o(a2);
                if (!z) {
                    o.g(false);
                }
                hashMap.put(m52, o);
            }
        }
    }

    private void Y(HashMap<m52, j> hashMap) {
        for (m52 m52 : hashMap.keySet()) {
            String b2 = m52.b();
            if (!(b2 == null || m52.c() == null)) {
                if (t().c(b2) != null) {
                    X(b2, this.t, true);
                } else if (!this.q.contains(b2)) {
                    this.q.add(b2);
                }
            }
        }
    }

    private void Z(HashMap<m52, j> hashMap, Iterable<j52> iterable) {
        Y(hashMap);
        for (j52 j52 : iterable) {
            Z(j52.b(), j52.a());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a0(String str, HashMap<r52, Object> hashMap) {
        for (r52 r52 : hashMap.keySet()) {
            v52 v52 = y().get(r52.b());
            r52 r522 = r52;
            v52 g = r522.g();
            if (C0201.m82(31291).equals(r52.a().a())) {
                boolean z = true;
                boolean z2 = g != null && str.equals(g.o());
                if (v52 == null || !str.equals(v52.o())) {
                    z = false;
                }
                if (z2) {
                    h0(g, hashMap, r522);
                } else if (z) {
                    h0(v52, hashMap, r522);
                }
            }
        }
    }

    private void c0(HashMap<? extends n42, Object> hashMap) {
        for (n42 n42 : hashMap.keySet()) {
            b(n42);
        }
    }

    private void d0() {
        this.s = true;
        Iterator<String> it = this.q.iterator();
        while (it.hasNext()) {
            new a(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    private void e0() {
        this.r = true;
        Iterator<String> it = u().iterator();
        while (it.hasNext()) {
            new b(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    public static boolean f0(j52 j52, boolean z) {
        String r0 = C0201.m82(31292);
        boolean z2 = !j52.j(r0) || Integer.parseInt(j52.e(r0)) != 0;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    private void h0(v52 v52, HashMap<r52, Object> hashMap, r52 r52) {
        double n = v52.n();
        ((o) hashMap.get(r52)).j(i0(t().c(v52.o()), Double.valueOf(n)));
    }

    private static com.google.android.gms.maps.model.a i0(Bitmap bitmap, Double d) {
        double width = (double) bitmap.getWidth();
        double doubleValue = d.doubleValue();
        Double.isNaN(width);
        double height = (double) bitmap.getHeight();
        double doubleValue2 = d.doubleValue();
        Double.isNaN(height);
        return com.google.android.gms.maps.model.b.c(Bitmap.createScaledBitmap(bitmap, (int) (width * doubleValue), (int) (height * doubleValue2), false));
    }

    public void b0() {
        J(true);
        this.t = s();
        this.u = r();
        C();
        n(x(), y());
        Z(this.t, this.u);
        U(this.u, true);
        c0(q());
        if (!this.s) {
            d0();
        }
        if (!this.r) {
            e0();
        }
    }

    public Iterable<j52> g0() {
        return this.u;
    }

    public void j0(HashMap<String, v52> hashMap, HashMap<String, String> hashMap2, HashMap<r52, Object> hashMap3, ArrayList<j52> arrayList, HashMap<m52, j> hashMap4) {
        L(hashMap, hashMap2, hashMap3, arrayList, hashMap4);
    }
}
