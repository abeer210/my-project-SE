package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.File;
import java.io.InputStream;

/* renamed from: gk  reason: default package */
/* compiled from: StringLoader */
public class gk<Data> implements zj<String, Data> {
    private final zj<Uri, Data> a;

    /* renamed from: gk$a */
    /* compiled from: StringLoader */
    public static final class a implements ak<String, AssetFileDescriptor> {
        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<String, AssetFileDescriptor> c(dk dkVar) {
            return new gk(dkVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: gk$b */
    /* compiled from: StringLoader */
    public static class b implements ak<String, ParcelFileDescriptor> {
        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<String, ParcelFileDescriptor> c(dk dkVar) {
            return new gk(dkVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: gk$c */
    /* compiled from: StringLoader */
    public static class c implements ak<String, InputStream> {
        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<String, InputStream> c(dk dkVar) {
            return new gk(dkVar.d(Uri.class, InputStream.class));
        }
    }

    public gk(zj<Uri, Data> zjVar) {
        this.a = zjVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public zj.a<Data> b(String str, int i, int i2, i iVar) {
        Uri e = e(str);
        if (e == null || !this.a.a(e)) {
            return null;
        }
        return this.a.b(e, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(String str) {
        return true;
    }
}
