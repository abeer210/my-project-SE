package defpackage;

import android.net.Uri;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: jk  reason: default package */
/* compiled from: UrlUriLoader */
public class jk<Data> implements zj<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(C0201.m82(24927), C0201.m82(24928))));
    private final zj<sj, Data> a;

    /* renamed from: jk$a */
    /* compiled from: UrlUriLoader */
    public static class a implements ak<Uri, InputStream> {
        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Uri, InputStream> c(dk dkVar) {
            return new jk(dkVar.d(sj.class, InputStream.class));
        }
    }

    public jk(zj<sj, Data> zjVar) {
        this.a = zjVar;
    }

    /* renamed from: c */
    public zj.a<Data> b(Uri uri, int i, int i2, i iVar) {
        return this.a.b(new sj(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
