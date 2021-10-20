package defpackage;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import vigqyno.C0201;

/* renamed from: d73  reason: default package */
/* compiled from: ProviderConfigurationPermission */
public class d73 extends BasicPermission {
    private final String a;
    private final int b;

    public d73(String str, String str2) {
        super(str, str2);
        this.a = str2;
        this.b = a(str2);
    }

    private int a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(mb3.d(str), C0201.m82(47));
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(C0201.m82(48))) {
                i |= 1;
            } else if (nextToken.equals(C0201.m82(49))) {
                i |= 2;
            } else if (nextToken.equals(C0201.m82(50))) {
                i |= 4;
            } else if (nextToken.equals(C0201.m82(51))) {
                i |= 8;
            } else if (nextToken.equals(C0201.m82(52))) {
                i |= 16;
            } else if (nextToken.equals(C0201.m82(53))) {
                i |= 32;
            } else if (nextToken.equals(C0201.m82(54))) {
                i |= 63;
            }
        }
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(C0201.m82(55));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d73)) {
            return false;
        }
        d73 d73 = (d73) obj;
        if (this.b != d73.b || !getName().equals(d73.getName())) {
            return false;
        }
        return true;
    }

    public String getActions() {
        return this.a;
    }

    public int hashCode() {
        return getName().hashCode() + this.b;
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof d73) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.b;
        int i2 = ((d73) permission).b;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
