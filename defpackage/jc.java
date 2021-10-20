package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* renamed from: jc  reason: default package */
/* compiled from: KeyPath */
public class jc {
    private final List<String> a;
    private kc b;

    public jc(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.a;
        return list.get(list.size() - 1).equals(C0201.m82(24299));
    }

    private boolean f(String str) {
        return C0201.m82(24300).equals(str);
    }

    public jc a(String str) {
        jc jcVar = new jc(this);
        jcVar.a.add(str);
        return jcVar;
    }

    public boolean c(String str, int i) {
        if (i >= this.a.size()) {
            return false;
        }
        boolean z = i == this.a.size() - 1;
        String str2 = this.a.get(i);
        if (!str2.equals(C0201.m82(24301))) {
            boolean z2 = str2.equals(str) || str2.equals(C0201.m82(24302));
            if ((z || (i == this.a.size() - 2 && b())) && z2) {
                return true;
            }
            return false;
        }
        if (!z && this.a.get(i + 1).equals(str)) {
            if (i == this.a.size() - 2 || (i == this.a.size() - 3 && b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.a.size() - 1) {
                return false;
            }
            return this.a.get(i2).equals(str);
        }
    }

    public kc d() {
        return this.b;
    }

    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (!this.a.get(i).equals(C0201.m82(24303))) {
            return 1;
        }
        if (i != this.a.size() - 1 && this.a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public boolean g(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        if (this.a.get(i).equals(str) || this.a.get(i).equals(C0201.m82(24304)) || this.a.get(i).equals(C0201.m82(24305))) {
            return true;
        }
        return false;
    }

    public boolean h(String str, int i) {
        if (!C0201.m82(24306).equals(str) && i >= this.a.size() - 1 && !this.a.get(i).equals(C0201.m82(24307))) {
            return false;
        }
        return true;
    }

    public jc i(kc kcVar) {
        jc jcVar = new jc(this);
        jcVar.b = kcVar;
        return jcVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(24308));
        sb.append(this.a);
        sb.append(C0201.m82(24309));
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }

    private jc(jc jcVar) {
        this.a = new ArrayList(jcVar.a);
        this.b = jcVar.b;
    }
}
