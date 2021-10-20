package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;

/* renamed from: nk  reason: default package */
/* compiled from: MediaStoreVideoThumbLoader */
public class nk implements zj<Uri, InputStream> {
    private final Context a;

    /* renamed from: nk$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class a implements ak<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Uri, InputStream> c(dk dkVar) {
            return new nk(this.a);
        }
    }

    public nk(Context context) {
        this.a = context.getApplicationContext();
    }

    private boolean e(i iVar) {
        Long l = (Long) iVar.c(ul.d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: c */
    public zj.a<InputStream> b(Uri uri, int i, int i2, i iVar) {
        if (!ih.d(i, i2) || !e(iVar)) {
            return null;
        }
        return new zj.a<>(new uo(uri), jh.g(this.a, uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return ih.c(uri);
    }
}
