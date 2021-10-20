package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.g;
import defpackage.vg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: jh  reason: default package */
/* compiled from: ThumbFetcher */
public class jh implements vg<InputStream> {
    private final Uri a;
    private final lh b;
    private InputStream c;

    /* access modifiers changed from: package-private */
    /* renamed from: jh$a */
    /* compiled from: ThumbFetcher */
    public static class a implements kh {
        private static final String[] b = {C0201.m82(22393)};
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.kh
        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, C0201.m82(22394), new String[]{lastPathSegment}, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jh$b */
    /* compiled from: ThumbFetcher */
    public static class b implements kh {
        private static final String[] b = {C0201.m82(22304)};
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.kh
        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, C0201.m82(22305), new String[]{lastPathSegment}, null);
        }
    }

    public jh(Uri uri, lh lhVar) {
        this.a = uri;
        this.b = lhVar;
    }

    private static jh c(Context context, Uri uri, kh khVar) {
        return new jh(uri, new lh(c.c(context).j().g(), khVar, c.c(context).e(), context.getContentResolver()));
    }

    public static jh f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static jh g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream d = this.b.d(this.a);
        int a2 = d != null ? this.b.a(this.a) : -1;
        return a2 != -1 ? new yg(d, a2) : d;
    }

    @Override // defpackage.vg
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.vg
    public void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.vg
    public void cancel() {
    }

    @Override // defpackage.vg
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // defpackage.vg
    public void e(g gVar, vg.a<? super InputStream> aVar) {
        try {
            InputStream h = h();
            this.c = h;
            aVar.f(h);
        } catch (FileNotFoundException e) {
            String r1 = C0201.m82(24610);
            if (Log.isLoggable(r1, 3)) {
                Log.d(r1, C0201.m82(24611), e);
            }
            aVar.c(e);
        }
    }
}
