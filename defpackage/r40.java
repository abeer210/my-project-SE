package defpackage;

import android.net.Uri;

/* renamed from: r40  reason: default package */
/* compiled from: SimpleCacheKey */
public class r40 implements m40 {
    public final String a;

    public r40(String str) {
        z50.g(str);
        this.a = str;
    }

    @Override // defpackage.m40
    public boolean a(Uri uri) {
        return this.a.contains(uri.toString());
    }

    @Override // defpackage.m40
    public String b() {
        return this.a;
    }

    @Override // defpackage.m40
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r40) {
            return this.a.equals(((r40) obj).a);
        }
        return false;
    }

    @Override // defpackage.m40
    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
