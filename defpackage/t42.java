package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.j;
import com.google.android.gms.maps.model.k;
import com.google.android.gms.maps.model.o;
import com.google.android.gms.maps.model.p;
import com.google.android.gms.maps.model.s;
import com.google.android.gms.maps.model.t;
import com.google.android.gms.maps.model.u;
import com.google.android.gms.maps.model.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: t42  reason: default package */
/* compiled from: Renderer */
public class t42 {
    private static final Object p = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private c a;
    private final v42<n42> b = new v42<>();
    private HashMap<String, v52> c;
    private HashMap<String, v52> d;
    private HashMap<String, String> e;
    private v42<n42> f;
    private HashMap<m52, j> g;
    private final ArrayList<String> h;
    private final v0<String, Bitmap> i;
    private boolean j;
    private Context k;
    private ArrayList<j52> l;
    private final e52 m;
    private final z42 n;
    private final g52 o;

    /* access modifiers changed from: package-private */
    /* renamed from: t42$a */
    /* compiled from: Renderer */
    public class a implements c.b {
        public a() {
        }

        @Override // com.google.android.gms.maps.c.b
        public View a(o oVar) {
            View inflate = LayoutInflater.from(t42.this.k).inflate(k42.amu_info_window, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(j42.window);
            if (oVar.b() != null) {
                textView.setText(Html.fromHtml(oVar.c() + C0201.m82(28944) + oVar.b()));
            } else {
                textView.setText(Html.fromHtml(oVar.c()));
            }
            return inflate;
        }

        @Override // com.google.android.gms.maps.c.b
        public View d(o oVar) {
            return null;
        }
    }

    static {
        C0201.m83(t42.class, 110);
    }

    public t42(c cVar, Context context) {
        this.a = cVar;
        this.k = context;
        this.j = false;
        this.i = new v0<>(50);
        this.h = new ArrayList<>();
        this.d = new HashMap<>();
        this.m = null;
        this.n = null;
        this.o = null;
        this.f = new v42<>();
    }

    public static void E(Object obj) {
        if (obj instanceof o) {
            ((o) obj).e();
        } else if (obj instanceof u) {
            ((u) obj).b();
        } else if (obj instanceof s) {
            ((s) obj).b();
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                E(it.next());
            }
        }
    }

    private void F(w42 w42) {
        if (w42.j() == null) {
            w42.o(this.m);
        }
        if (w42.h() == null) {
            w42.n(this.n);
        }
        if (w42.l() == null) {
            w42.p(this.o);
        }
    }

    private void G(v vVar, v52 v52) {
        v r = v52.r();
        if (v52.z(C0201.m82(35676))) {
            vVar.p(r.u());
        }
        if (v52.z(C0201.m82(35677))) {
            vVar.T(r.E());
        }
        if (v52.x()) {
            vVar.p(v52.g(r.u()));
        }
    }

    private void H(p pVar, v52 v52, String str) {
        p p2 = v52.p();
        if (v52.z(C0201.m82(35678))) {
            pVar.f0(p2.F());
        }
        if (v52.z(C0201.m82(35679))) {
            pVar.p(p2.w(), p2.y());
        }
        if (v52.z(C0201.m82(35680))) {
            pVar.Q(p2.z());
        }
        if (v52.z(C0201.m82(35681))) {
            g(v52.o(), pVar);
        } else if (str != null) {
            g(str, pVar);
        }
    }

    private void I(t tVar, v52 v52) {
        t q = v52.q();
        if (v52.u() && v52.z(C0201.m82(35682))) {
            tVar.r(q.u());
        }
        if (v52.v()) {
            if (v52.z(C0201.m82(35683))) {
                tVar.P(q.y());
            }
            if (v52.z(C0201.m82(35684))) {
                tVar.Q(q.D());
            }
        }
        if (v52.y()) {
            tVar.r(v52.g(q.u()));
        }
    }

    private void K(v52 v52, o oVar, r52 r52) {
        String r0 = C0201.m82(35685);
        boolean f2 = r52.f(r0);
        String r2 = C0201.m82(35686);
        boolean f3 = r52.f(r2);
        boolean t = v52.t();
        HashMap<String, String> l2 = v52.l();
        String r6 = C0201.m82(35687);
        boolean containsKey = l2.containsKey(r6);
        if (t && containsKey) {
            oVar.o(v52.l().get(r6));
            p();
        } else if (t && f2) {
            oVar.o(r52.d(r0));
            p();
        } else if (f2 && f3) {
            oVar.o(r52.d(r0));
            oVar.n(r52.d(r2));
            p();
        } else if (f3) {
            oVar.o(r52.d(r2));
            p();
        } else if (f2) {
            oVar.o(r52.d(r0));
            p();
        }
    }

    private ArrayList<Object> d(w42 w42, List<o42> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (o42 o42 : list) {
            arrayList.add(c(w42, o42));
        }
        return arrayList;
    }

    private void g(String str, p pVar) {
        if (this.i.c(str) != null) {
            pVar.Q(b.c(this.i.c(str)));
        } else if (!this.h.contains(str)) {
            this.h.add(str);
        }
    }

    private ArrayList<Object> h(r52 r52, p52 p52, v52 v52, v52 v522, boolean z2) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<o42> it = p52.e().iterator();
        while (it.hasNext()) {
            arrayList.add(e(r52, it.next(), v52, v522, z2));
        }
        return arrayList;
    }

    private ArrayList<u> i(z42 z42, a52 a52) {
        ArrayList<u> arrayList = new ArrayList<>();
        Iterator<y42> it = a52.f().iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        it.next();
        z42.g();
        throw null;
    }

    private ArrayList<o> j(e52 e52, b52 b52) {
        ArrayList<o> arrayList = new ArrayList<>();
        Iterator<d52> it = b52.f().iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        it.next();
        e52.g();
        throw null;
    }

    private ArrayList<s> k(g52 g52, c52 c52) {
        ArrayList<s> arrayList = new ArrayList<>();
        Iterator<f52> it = c52.f().iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        it.next();
        g52.g();
        throw null;
    }

    private void p() {
        this.a.p(new a());
    }

    public static boolean w(n42 n42) {
        String r0 = C0201.m82(35688);
        return !n42.f(r0) || Integer.parseInt(n42.d(r0)) != 0;
    }

    public void A(Object obj, n42 n42) {
        this.f.put(n42, obj);
    }

    public void B(String str, Bitmap bitmap) {
        this.i.d(str, bitmap);
    }

    public void C() {
        this.d.putAll(this.c);
    }

    public void D(HashMap<String, v52> hashMap) {
        this.d.putAll(hashMap);
    }

    public void J(boolean z2) {
        this.j = z2;
    }

    public void L(HashMap<String, v52> hashMap, HashMap<String, String> hashMap2, HashMap<r52, Object> hashMap3, ArrayList<j52> arrayList, HashMap<m52, j> hashMap4) {
        this.c = hashMap;
        this.e = hashMap2;
        this.b.putAll(hashMap3);
        this.l = arrayList;
        this.g = hashMap4;
    }

    public void b(n42 n42) {
        Object obj = p;
        if (n42 instanceof w42) {
            F((w42) n42);
        }
        if (this.j) {
            if (this.b.containsKey(n42)) {
                E(this.b.get(n42));
            }
            if (n42.e()) {
                if (n42 instanceof r52) {
                    r52 r52 = (r52) n42;
                    obj = e(r52, n42.a(), v(n42.b()), r52.g(), w(n42));
                } else {
                    obj = c(n42, n42.a());
                }
            }
        }
        this.b.put(n42, obj);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public Object c(n42 n42, o42 o42) {
        char c2;
        String a2 = o42.a();
        switch (a2.hashCode()) {
            case -2116761119:
                if (a2.equals(C0201.m82(35695))) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1065891849:
                if (a2.equals(C0201.m82(35694))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -627102946:
                if (a2.equals(C0201.m82(35693))) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 77292912:
                if (a2.equals(C0201.m82(35692))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1267133722:
                if (a2.equals(C0201.m82(35691))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1806700869:
                if (a2.equals(C0201.m82(35690))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1950410960:
                if (a2.equals(C0201.m82(35689))) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        p pVar = null;
        t tVar = null;
        v vVar = null;
        switch (c2) {
            case 0:
                if (!(n42 instanceof w42)) {
                    if (n42 instanceof r52) {
                        pVar = ((r52) n42).h();
                    }
                    return l(pVar, (d52) o42);
                }
                ((w42) n42).i();
                throw null;
            case 1:
                if (!(n42 instanceof w42)) {
                    if (n42 instanceof r52) {
                        vVar = ((r52) n42).j();
                    }
                    return f(vVar, (y42) o42);
                }
                ((w42) n42).m();
                throw null;
            case 2:
                if (!(n42 instanceof w42)) {
                    if (n42 instanceof r52) {
                        tVar = ((r52) n42).i();
                    }
                    return m(tVar, (m42) o42);
                }
                ((w42) n42).k();
                throw null;
            case 3:
                return j(((w42) n42).j(), (b52) o42);
            case 4:
                return i(((w42) n42).h(), (a52) o42);
            case 5:
                return k(((w42) n42).l(), (c52) o42);
            case 6:
                return d((w42) n42, ((x42) o42).f());
            default:
                return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r0.equals(defpackage.t42.z) != false) goto L_0x004c;
     */
    public Object e(r52 r52, o42 o42, v52 v52, v52 v522, boolean z2) {
        String a2 = o42.a();
        String str = y;
        boolean f2 = r52.f(str);
        char c2 = 0;
        float f3 = 0.0f;
        if (f2) {
            try {
                f3 = Float.parseFloat(r52.d(str));
            } catch (NumberFormatException unused) {
                f2 = false;
            }
        }
        switch (a2.hashCode()) {
            case 77292912:
                break;
            case 89139371:
                if (a2.equals(w)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1267133722:
                if (a2.equals(x)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1806700869:
                if (a2.equals(v)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            p p2 = v52.p();
            if (v522 != null) {
                H(p2, v522, v52.o());
            } else if (v52.o() != null) {
                g(v52.o(), p2);
            }
            o l2 = l(p2, (s52) o42);
            l2.p(z2);
            K(v52, l2, r52);
            if (f2) {
                l2.q(f3);
            }
            return l2;
        } else if (c2 == 1) {
            v r = v52.r();
            if (v522 != null) {
                G(r, v522);
            } else if (v52.x()) {
                r.p(v52.g(r.u()));
            }
            u f4 = f(r, (q42) o42);
            f4.j(z2);
            if (f2) {
                f4.l(f3);
            }
            return f4;
        } else if (c2 == 2) {
            t q = v52.q();
            if (v522 != null) {
                I(q, v522);
            } else if (v52.y()) {
                q.r(v52.g(q.u()));
            }
            s m2 = m(q, (m42) o42);
            m2.j(z2);
            if (f2) {
                m2.k(f3);
            }
            return m2;
        } else if (c2 != 3) {
            return null;
        } else {
            return h(r52, (p52) o42, v52, v522, z2);
        }
    }

    public u f(v vVar, q42 q42) {
        vVar.o(q42.d());
        u e2 = this.a.e(vVar);
        e2.c(true);
        return e2;
    }

    public o l(p pVar, s42 s42) {
        pVar.e0(s42.d());
        return this.a.c(pVar);
    }

    public s m(t tVar, m42 m42) {
        tVar.o(m42.b());
        for (List<LatLng> list : m42.c()) {
            tVar.p(list);
        }
        s d2 = this.a.d(tVar);
        d2.c(true);
        return d2;
    }

    public void n(HashMap<String, String> hashMap, HashMap<String, v52> hashMap2) {
        for (String str : hashMap.keySet()) {
            String str2 = hashMap.get(str);
            if (hashMap2.containsKey(str2)) {
                hashMap2.put(str, hashMap2.get(str2));
            }
        }
    }

    public j o(k kVar) {
        return this.a.b(kVar);
    }

    public HashMap<? extends n42, Object> q() {
        return this.b;
    }

    public ArrayList<j52> r() {
        return this.l;
    }

    public HashMap<m52, j> s() {
        return this.g;
    }

    public v0<String, Bitmap> t() {
        return this.i;
    }

    public ArrayList<String> u() {
        return this.h;
    }

    public v52 v(String str) {
        return this.d.get(str) != null ? this.d.get(str) : this.d.get(null);
    }

    public HashMap<String, String> x() {
        return this.e;
    }

    public HashMap<String, v52> y() {
        return this.d;
    }

    public boolean z() {
        return this.j;
    }
}
