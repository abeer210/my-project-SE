package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: ek  reason: default package */
/* compiled from: ResourceLoader */
public class ek<Data> implements zj<Integer, Data> {
    private final zj<Uri, Data> a;
    private final Resources b;

    /* renamed from: ek$a */
    /* compiled from: ResourceLoader */
    public static final class a implements ak<Integer, AssetFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Integer, AssetFileDescriptor> c(dk dkVar) {
            return new ek(this.a, dkVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: ek$b */
    /* compiled from: ResourceLoader */
    public static class b implements ak<Integer, ParcelFileDescriptor> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Integer, ParcelFileDescriptor> c(dk dkVar) {
            return new ek(this.a, dkVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: ek$c */
    /* compiled from: ResourceLoader */
    public static class c implements ak<Integer, InputStream> {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Integer, InputStream> c(dk dkVar) {
            return new ek(this.a, dkVar.d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: ek$d */
    /* compiled from: ResourceLoader */
    public static class d implements ak<Integer, Uri> {
        private final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Integer, Uri> c(dk dkVar) {
            return new ek(this.a, hk.c());
        }
    }

    public ek(Resources resources, zj<Uri, Data> zjVar) {
        this.b = resources;
        this.a = zjVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse(C0201.m82(13009) + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            String r2 = C0201.m82(13010);
            if (!Log.isLoggable(r2, 5)) {
                return null;
            }
            Log.w(r2, C0201.m82(13011) + num, e);
            return null;
        }
    }

    /* renamed from: c */
    public zj.a<Data> b(Integer num, int i, int i2, i iVar) {
        Uri d2 = d(num);
        if (d2 == null) {
            return null;
        }
        return this.a.b(d2, i, i2, iVar);
    }

    /* renamed from: e */
    public boolean a(Integer num) {
        return true;
    }
}
