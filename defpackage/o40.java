package defpackage;

import android.net.Uri;
import java.util.List;
import vigqyno.C0201;

/* renamed from: o40  reason: default package */
/* compiled from: MultiCacheKey */
public class o40 implements m40 {
    public final List<m40> a;

    public o40(List<m40> list) {
        z50.g(list);
        this.a = list;
    }

    @Override // defpackage.m40
    public boolean a(Uri uri) {
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m40
    public String b() {
        return this.a.get(0).b();
    }

    public List<m40> c() {
        return this.a;
    }

    @Override // defpackage.m40
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o40) {
            return this.a.equals(((o40) obj).a);
        }
        return false;
    }

    @Override // defpackage.m40
    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return C0201.m82(36836) + this.a.toString();
    }
}
