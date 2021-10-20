package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.vg;
import defpackage.zj;
import java.io.File;
import java.io.FileNotFoundException;
import vigqyno.C0201;

/* renamed from: wj  reason: default package */
/* compiled from: MediaStoreFileLoader */
public final class wj implements zj<Uri, File> {
    private final Context a;

    /* renamed from: wj$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class a implements ak<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Uri, File> c(dk dkVar) {
            return new wj(this.a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: wj$b */
    /* compiled from: MediaStoreFileLoader */
    public static class b implements vg<File> {
        private static final String[] c = {C0201.m82(33649)};
        private final Context a;
        private final Uri b;

        public b(Context context, Uri uri) {
            this.a = context;
            this.b = uri;
        }

        @Override // defpackage.vg
        public Class<File> a() {
            return File.class;
        }

        @Override // defpackage.vg
        public void b() {
        }

        @Override // defpackage.vg
        public void cancel() {
        }

        @Override // defpackage.vg
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // defpackage.vg
        public void e(g gVar, vg.a<? super File> aVar) {
            Cursor query = this.a.getContentResolver().query(this.b, c, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow(C0201.m82(33650)));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException(C0201.m82(33651) + this.b));
                return;
            }
            aVar.f(new File(str));
        }
    }

    public wj(Context context) {
        this.a = context;
    }

    /* renamed from: c */
    public zj.a<File> b(Uri uri, int i, int i2, i iVar) {
        return new zj.a<>(new uo(uri), new b(this.a, uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return ih.b(uri);
    }
}
