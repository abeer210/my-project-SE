package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: mj  reason: default package */
/* compiled from: AssetUriLoader */
public class mj<Data> implements zj<Uri, Data> {
    private static final int c = 0;
    private final AssetManager a;
    private final a<Data> b;

    /* renamed from: mj$a */
    /* compiled from: AssetUriLoader */
    public interface a<Data> {
        vg<Data> b(AssetManager assetManager, String str);
    }

    /* renamed from: mj$b */
    /* compiled from: AssetUriLoader */
    public static class b implements ak<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.mj.a
        public vg<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new zg(assetManager, str);
        }

        @Override // defpackage.ak
        public zj<Uri, ParcelFileDescriptor> c(dk dkVar) {
            return new mj(this.a, this);
        }
    }

    /* renamed from: mj$c */
    /* compiled from: AssetUriLoader */
    public static class c implements ak<Uri, InputStream>, a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.mj.a
        public vg<InputStream> b(AssetManager assetManager, String str) {
            return new fh(assetManager, str);
        }

        @Override // defpackage.ak
        public zj<Uri, InputStream> c(dk dkVar) {
            return new mj(this.a, this);
        }
    }

    static {
        C0201.m83(mj.class, 717);
    }

    public mj(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    /* renamed from: c */
    public zj.a<Data> b(Uri uri, int i, int i2, i iVar) {
        return new zj.a<>(new uo(uri), this.b.b(this.a, uri.toString().substring(c)));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        if (!C0201.m82(31104).equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        if (C0201.m82(31105).equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }
}
