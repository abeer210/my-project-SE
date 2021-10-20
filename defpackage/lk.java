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

/* renamed from: lk  reason: default package */
/* compiled from: HttpUriLoader */
public class lk implements zj<Uri, InputStream> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(C0201.m82(29300), C0201.m82(29301))));
    private final zj<sj, InputStream> a;

    /* renamed from: lk$a */
    /* compiled from: HttpUriLoader */
    public static class a implements ak<Uri, InputStream> {
        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Uri, InputStream> c(dk dkVar) {
            return new lk(dkVar.d(sj.class, InputStream.class));
        }
    }

    public lk(zj<sj, InputStream> zjVar) {
        this.a = zjVar;
    }

    /* renamed from: c */
    public zj.a<InputStream> b(Uri uri, int i, int i2, i iVar) {
        return this.a.b(new sj(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
