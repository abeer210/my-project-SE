package defpackage;

import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;
import java.net.URL;

/* renamed from: pk  reason: default package */
/* compiled from: UrlLoader */
public class pk implements zj<URL, InputStream> {
    private final zj<sj, InputStream> a;

    /* renamed from: pk$a */
    /* compiled from: UrlLoader */
    public static class a implements ak<URL, InputStream> {
        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<URL, InputStream> c(dk dkVar) {
            return new pk(dkVar.d(sj.class, InputStream.class));
        }
    }

    public pk(zj<sj, InputStream> zjVar) {
        this.a = zjVar;
    }

    /* renamed from: c */
    public zj.a<InputStream> b(URL url, int i, int i2, i iVar) {
        return this.a.b(new sj(url), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(URL url) {
        return true;
    }
}
