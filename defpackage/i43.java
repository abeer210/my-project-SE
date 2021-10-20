package defpackage;

/* renamed from: i43  reason: default package */
/* compiled from: RDN */
public class i43 extends o03 {
    private x03 a;

    private i43(x03 x03) {
        this.a = x03;
    }

    public static i43 i(Object obj) {
        if (obj instanceof i43) {
            return (i43) obj;
        }
        if (obj != null) {
            return new i43(x03.r(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return this.a;
    }

    public h43 g() {
        if (this.a.size() == 0) {
            return null;
        }
        return h43.g(this.a.u(0));
    }

    public h43[] j() {
        int size = this.a.size();
        h43[] h43Arr = new h43[size];
        for (int i = 0; i != size; i++) {
            h43Arr[i] = h43.g(this.a.u(i));
        }
        return h43Arr;
    }

    public boolean k() {
        return this.a.size() > 1;
    }
}
