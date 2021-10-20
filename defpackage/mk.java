package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;

/* renamed from: mk  reason: default package */
/* compiled from: MediaStoreImageThumbLoader */
public class mk implements zj<Uri, InputStream> {
    private final Context a;

    /* renamed from: mk$a */
    /* compiled from: MediaStoreImageThumbLoader */
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
            return new mk(this.a);
        }
    }

    public mk(Context context) {
        this.a = context.getApplicationContext();
    }

    /* renamed from: c */
    public zj.a<InputStream> b(Uri uri, int i, int i2, i iVar) {
        if (ih.d(i, i2)) {
            return new zj.a<>(new uo(uri), jh.f(this.a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return ih.a(uri);
    }
}
