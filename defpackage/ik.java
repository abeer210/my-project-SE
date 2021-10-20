package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: ik  reason: default package */
/* compiled from: UriLoader */
public class ik<Data> implements zj<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(C0201.m82(22258), C0201.m82(22259), C0201.m82(22260))));
    private final c<Data> a;

    /* renamed from: ik$a */
    /* compiled from: UriLoader */
    public static final class a implements ak<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ik.c
        public vg<AssetFileDescriptor> b(Uri uri) {
            return new sg(this.a, uri);
        }

        @Override // defpackage.ak
        public zj<Uri, AssetFileDescriptor> c(dk dkVar) {
            return new ik(this);
        }
    }

    /* renamed from: ik$b */
    /* compiled from: UriLoader */
    public static class b implements ak<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ik.c
        public vg<ParcelFileDescriptor> b(Uri uri) {
            return new ah(this.a, uri);
        }

        @Override // defpackage.ak
        public zj<Uri, ParcelFileDescriptor> c(dk dkVar) {
            return new ik(this);
        }
    }

    /* renamed from: ik$c */
    /* compiled from: UriLoader */
    public interface c<Data> {
        vg<Data> b(Uri uri);
    }

    /* renamed from: ik$d */
    /* compiled from: UriLoader */
    public static class d implements ak<Uri, InputStream>, c<InputStream> {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ik.c
        public vg<InputStream> b(Uri uri) {
            return new gh(this.a, uri);
        }

        @Override // defpackage.ak
        public zj<Uri, InputStream> c(dk dkVar) {
            return new ik(this);
        }
    }

    public ik(c<Data> cVar) {
        this.a = cVar;
    }

    /* renamed from: c */
    public zj.a<Data> b(Uri uri, int i, int i2, i iVar) {
        return new zj.a<>(new uo(uri), this.a.b(uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
