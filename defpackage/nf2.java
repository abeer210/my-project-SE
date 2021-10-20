package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: nf2  reason: default package */
/* compiled from: TopBarButtons */
public class nf2 {
    public je2 a = new je2();
    public ArrayList<tf2> b;
    public ArrayList<tf2> c;

    private ArrayList<tf2> b(ArrayList<tf2> arrayList) {
        if (arrayList.isEmpty() || yi2.l(this.b)) {
            return arrayList;
        }
        tf2 tf2 = arrayList.get(0);
        if (tf2.b != null) {
            return arrayList;
        }
        this.b.get(0).f(tf2);
        return this.b;
    }

    public static nf2 e(vj2 vj2, JSONObject jSONObject) {
        nf2 nf2 = new nf2();
        if (jSONObject == null) {
            return nf2;
        }
        nf2.c = f(vj2, jSONObject, C0201.m82(2526));
        nf2.b = f(vj2, jSONObject, C0201.m82(2527));
        nf2.a = je2.o(jSONObject.optJSONObject(C0201.m82(2528)));
        return nf2;
    }

    private static ArrayList<tf2> f(vj2 vj2, JSONObject jSONObject, String str) {
        return tf2.h(jSONObject, str, vj2);
    }

    public boolean a() {
        return !yi2.l(this.b) && this.b.get(0).b != null;
    }

    public void c(nf2 nf2) {
        ArrayList<tf2> arrayList = nf2.b;
        if (arrayList != null) {
            this.b = b(arrayList);
        }
        ArrayList<tf2> arrayList2 = nf2.c;
        if (arrayList2 != null) {
            this.c = arrayList2;
        }
        this.a.m(nf2.a);
    }

    public void d(nf2 nf2) {
        if (this.b == null) {
            this.b = nf2.b;
        } else if (!yi2.l(nf2.b)) {
            Iterator<tf2> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().g(nf2.b.get(0));
            }
        }
        if (this.c == null) {
            this.c = nf2.c;
        } else if (!yi2.l(nf2.c)) {
            Iterator<tf2> it2 = this.c.iterator();
            while (it2.hasNext()) {
                it2.next().g(nf2.c.get(0));
            }
        }
        this.a.n(nf2.a);
    }
}
