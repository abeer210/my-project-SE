package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: l43  reason: default package */
/* compiled from: AbstractX500NameStyle */
public abstract class l43 implements k43 {
    private int d(g03 g03) {
        return n43.e(n43.i(g03)).hashCode();
    }

    public static Hashtable e(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private boolean f(boolean z, i43 i43, i43[] i43Arr) {
        if (z) {
            for (int length = i43Arr.length - 1; length >= 0; length--) {
                if (i43Arr[length] != null && g(i43, i43Arr[length])) {
                    i43Arr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != i43Arr.length; i++) {
                if (i43Arr[i] != null && g(i43, i43Arr[i])) {
                    i43Arr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.k43
    public boolean a(j43 j43, j43 j432) {
        i43[] i = j43.i();
        i43[] i2 = j432.i();
        if (i.length != i2.length) {
            return false;
        }
        boolean z = (i[0].g() == null || i2[0].g() == null) ? false : !i[0].g().i().equals(i2[0].g().i());
        for (int i3 = 0; i3 != i.length; i3++) {
            if (!f(z, i[i3], i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.k43
    public int c(j43 j43) {
        i43[] i = j43.i();
        int i2 = 0;
        for (int i3 = 0; i3 != i.length; i3++) {
            if (i[i3].k()) {
                h43[] j = i[i3].j();
                for (int i4 = 0; i4 != j.length; i4++) {
                    i2 = (i2 ^ j[i4].i().hashCode()) ^ d(j[i4].j());
                }
            } else {
                i2 = (i2 ^ i[i3].g().i().hashCode()) ^ d(i[i3].g().j());
            }
        }
        return i2;
    }

    public boolean g(i43 i43, i43 i432) {
        return n43.g(i43, i432);
    }
}
