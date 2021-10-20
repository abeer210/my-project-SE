package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: k6  reason: default package */
/* compiled from: TransitionValues */
public class k6 {
    public final Map<String, Object> a = new HashMap();
    public View b;
    public final ArrayList<e6> c = new ArrayList<>();

    @Deprecated
    public k6() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return this.b == k6Var.b && this.a.equals(k6Var.a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(23093) + Integer.toHexString(hashCode()) + C0201.m82(23094));
        sb.append(C0201.m82(23095));
        sb.append(this.b);
        String r0 = C0201.m82(23096);
        sb.append(r0);
        String str = sb.toString() + C0201.m82(23097);
        for (String str2 : this.a.keySet()) {
            str = str + C0201.m82(23098) + str2 + C0201.m82(23099) + this.a.get(str2) + r0;
        }
        return str;
    }

    public k6(View view) {
        this.b = view;
    }
}
