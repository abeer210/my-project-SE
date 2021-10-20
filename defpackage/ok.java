package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.vg;
import defpackage.zj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: ok  reason: default package */
/* compiled from: QMediaStoreUriLoader */
public final class ok<DataT> implements zj<Uri, DataT> {
    private final Context a;
    private final zj<File, DataT> b;
    private final zj<Uri, DataT> c;
    private final Class<DataT> d;

    /* renamed from: ok$a */
    /* compiled from: QMediaStoreUriLoader */
    private static abstract class a<DataT> implements ak<Uri, DataT> {
        private final Context a;
        private final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // defpackage.ak
        public final void a() {
        }

        @Override // defpackage.ak
        public final zj<Uri, DataT> c(dk dkVar) {
            return new ok(this.a, dkVar.d(File.class, this.b), dkVar.d(Uri.class, this.b), this.b);
        }
    }

    /* renamed from: ok$b */
    /* compiled from: QMediaStoreUriLoader */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: ok$c */
    /* compiled from: QMediaStoreUriLoader */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ok$d */
    /* compiled from: QMediaStoreUriLoader */
    public static final class d<DataT> implements vg<DataT> {
        private static final String[] k = {C0201.m82(30480)};
        private final Context a;
        private final zj<File, DataT> b;
        private final zj<Uri, DataT> c;
        private final Uri d;
        private final int e;
        private final int f;
        private final i g;
        private final Class<DataT> h;
        private volatile boolean i;
        private volatile vg<DataT> j;

        public d(Context context, zj<File, DataT> zjVar, zj<Uri, DataT> zjVar2, Uri uri, int i2, int i3, i iVar, Class<DataT> cls) {
            this.a = context.getApplicationContext();
            this.b = zjVar;
            this.c = zjVar2;
            this.d = uri;
            this.e = i2;
            this.f = i3;
            this.g = iVar;
            this.h = cls;
        }

        private zj.a<DataT> c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.b.b(h(this.d), this.e, this.f, this.g);
            }
            return this.c.b(g() ? MediaStore.setRequireOriginal(this.d) : this.d, this.e, this.f, this.g);
        }

        /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: vg<Data>, vg<DataT> */
        private vg<DataT> f() throws FileNotFoundException {
            zj.a<DataT> c2 = c();
            if (c2 != null) {
                return (vg<Data>) c2.c;
            }
            return null;
        }

        private boolean g() {
            return this.a.checkSelfPermission(C0201.m82(30481)) == 0;
        }

        private File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.a.getContentResolver().query(uri, k, null, null, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException(C0201.m82(30484) + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow(C0201.m82(30482)));
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
                throw new FileNotFoundException(C0201.m82(30483) + uri);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        @Override // defpackage.vg
        public Class<DataT> a() {
            return this.h;
        }

        @Override // defpackage.vg
        public void b() {
            vg<DataT> vgVar = this.j;
            if (vgVar != null) {
                vgVar.b();
            }
        }

        @Override // defpackage.vg
        public void cancel() {
            this.i = true;
            vg<DataT> vgVar = this.j;
            if (vgVar != null) {
                vgVar.cancel();
            }
        }

        @Override // defpackage.vg
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // defpackage.vg
        public void e(g gVar, vg.a<? super DataT> aVar) {
            try {
                vg<DataT> f2 = f();
                if (f2 == null) {
                    aVar.c(new IllegalArgumentException(C0201.m82(30485) + this.d));
                    return;
                }
                this.j = f2;
                if (this.i) {
                    cancel();
                } else {
                    f2.e(gVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    public ok(Context context, zj<File, DataT> zjVar, zj<Uri, DataT> zjVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = zjVar;
        this.c = zjVar2;
        this.d = cls;
    }

    /* renamed from: c */
    public zj.a<DataT> b(Uri uri, int i, int i2, i iVar) {
        return new zj.a<>(new uo(uri), new d(this.a, this.b, this.c, uri, i, i2, iVar, this.d));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && ih.b(uri);
    }
}
