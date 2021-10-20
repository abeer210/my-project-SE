package defpackage;

import android.graphics.Color;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.p;
import com.google.android.gms.maps.model.t;
import com.google.android.gms.maps.model.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import vigqyno.C0201;

/* renamed from: v52  reason: default package */
/* compiled from: KmlStyle */
public class v52 extends u42 {
    private final HashMap<String, String> d = new HashMap<>();
    private final HashSet<String> e = new HashSet<>();
    private boolean f = true;
    private boolean g = true;
    private String h;
    private double i = 1.0d;
    private String j = null;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private float n = 0.0f;

    public static int g(int i2) {
        Random random = new Random();
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (red != 0) {
            red = random.nextInt(red);
        }
        if (blue != 0) {
            blue = random.nextInt(blue);
        }
        if (green != 0) {
            green = random.nextInt(green);
        }
        return Color.rgb(red, green, blue);
    }

    private static String h(String str) {
        String str2;
        if (str.length() > 6) {
            str2 = str.substring(0, 2) + str.substring(6, 8) + str.substring(4, 6) + str.substring(2, 4);
        } else {
            str2 = str.substring(4, 6) + str.substring(2, 4) + str.substring(0, 2);
        }
        if (!str2.substring(0, 1).equals(C0201.m82(29340))) {
            return str2;
        }
        return C0201.m82(29341) + str2.substring(1, str2.length());
    }

    private static p i(p pVar, boolean z, float f2) {
        p pVar2 = new p();
        pVar2.f0(pVar.F());
        pVar2.p(pVar.w(), pVar.y());
        if (z) {
            pVar.Q(b.b(m(g((int) f2))));
        }
        pVar2.Q(pVar.z());
        return pVar2;
    }

    private static t j(t tVar, boolean z, boolean z2) {
        t tVar2 = new t();
        if (z) {
            tVar2.r(tVar.u());
        }
        if (z2) {
            tVar2.P(tVar.y());
            tVar2.Q(tVar.D());
        }
        return tVar2;
    }

    private static v k(v vVar) {
        v vVar2 = new v();
        vVar2.p(vVar.u());
        vVar2.T(vVar.E());
        return vVar2;
    }

    private static float m(int i2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i2, fArr);
        return fArr[0];
    }

    public void A(boolean z) {
        this.f = z;
    }

    public void B(String str) {
        e(Color.parseColor(C0201.m82(29342) + h(str)));
        this.e.add(C0201.m82(29343));
    }

    public void C(float f2) {
        d(f2);
        this.e.add(C0201.m82(29344));
    }

    public void D(float f2, float f3, String str, String str2) {
        c(f2, f3, str, str2);
        this.e.add(C0201.m82(29345));
    }

    public void E(String str) {
        this.k = str.equals(C0201.m82(29346));
        this.e.add(C0201.m82(29347));
    }

    public void F(double d2) {
        this.i = d2;
        this.e.add(C0201.m82(29348));
    }

    public void G(String str) {
        this.h = str;
        this.e.add(C0201.m82(29349));
    }

    public void H(String str) {
        this.d.put(C0201.m82(29350), str);
    }

    public void I(String str) {
        this.l = str.equals(C0201.m82(29351));
        this.e.add(C0201.m82(29352));
    }

    public void J(String str) {
        float m2 = m(Color.parseColor(C0201.m82(29353) + h(str)));
        this.n = m2;
        this.a.Q(b.b(m2));
        this.e.add(C0201.m82(29354));
    }

    public void K(boolean z) {
        this.g = z;
        this.e.add(C0201.m82(29355));
    }

    public void L(String str) {
        v vVar = this.b;
        StringBuilder sb = new StringBuilder();
        String r2 = C0201.m82(29356);
        sb.append(r2);
        sb.append(h(str));
        vVar.p(Color.parseColor(sb.toString()));
        t tVar = this.c;
        tVar.P(Color.parseColor(r2 + str));
        this.e.add(C0201.m82(29357));
    }

    public void M(String str) {
        this.m = str.equals(C0201.m82(29358));
        this.e.add(C0201.m82(29359));
    }

    public void N(String str) {
        this.j = str;
    }

    public void O(Float f2) {
        b(f2.floatValue());
        f(f2.floatValue());
        this.e.add(C0201.m82(29360));
    }

    public HashMap<String, String> l() {
        return this.d;
    }

    public double n() {
        return this.i;
    }

    public String o() {
        return this.h;
    }

    public p p() {
        return i(this.a, w(), this.n);
    }

    public t q() {
        return j(this.c, this.f, this.g);
    }

    public v r() {
        return k(this.b);
    }

    public String s() {
        return this.j;
    }

    public boolean t() {
        return this.d.size() > 0;
    }

    public String toString() {
        return C0201.m82(29361) + C0201.m82(29362) + C0201.m82(29363) + this.d + C0201.m82(29364) + this.f + C0201.m82(29365) + this.g + C0201.m82(29366) + this.h + C0201.m82(29367) + this.i + C0201.m82(29368) + this.j + C0201.m82(29369);
    }

    public boolean u() {
        return this.f;
    }

    public boolean v() {
        return this.g;
    }

    public boolean w() {
        return this.k;
    }

    public boolean x() {
        return this.l;
    }

    public boolean y() {
        return this.m;
    }

    public boolean z(String str) {
        return this.e.contains(str);
    }
}
