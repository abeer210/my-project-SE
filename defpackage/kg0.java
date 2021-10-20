package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: kg0  reason: default package */
/* compiled from: LocalVideoThumbnailProducer */
public class kg0 implements rg0<v60<ye0>> {
    private final Executor a;
    private final ContentResolver b;

    /* renamed from: kg0$a */
    /* compiled from: LocalVideoThumbnailProducer */
    class a extends yg0<v60<ye0>> {
        public final /* synthetic */ ug0 f;
        public final /* synthetic */ String g;
        public final /* synthetic */ ih0 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sf0 sf0, ug0 ug0, String str, String str2, ug0 ug02, String str3, ih0 ih0) {
            super(sf0, ug0, str, str2);
            this.f = ug02;
            this.g = str3;
            this.h = ih0;
        }

        @Override // defpackage.yg0, defpackage.m50
        public void e(Exception exc) {
            super.e(exc);
            this.f.e(this.g, C0201.m82(7531), false);
        }

        /* renamed from: j */
        public void b(v60<ye0> v60) {
            v60.s(v60);
        }

        /* renamed from: k */
        public Map<String, String> i(v60<ye0> v60) {
            return w50.b(C0201.m82(7532), String.valueOf(v60 != null));
        }

        /* renamed from: l */
        public v60<ye0> c() throws Exception {
            String str;
            Bitmap bitmap;
            try {
                str = kg0.this.i(this.h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                bitmap = ThumbnailUtils.createVideoThumbnail(str, kg0.g(this.h));
            } else {
                bitmap = kg0.h(kg0.this.b, this.h.q());
            }
            if (bitmap == null) {
                return null;
            }
            return v60.B(new ze0(bitmap, qc0.b(), cf0.d, 0));
        }

        /* renamed from: m */
        public void f(v60<ye0> v60) {
            super.f(v60);
            this.f.e(this.g, C0201.m82(7533), v60 != null);
        }
    }

    /* renamed from: kg0$b */
    /* compiled from: LocalVideoThumbnailProducer */
    class b extends mf0 {
        public final /* synthetic */ yg0 a;

        public b(kg0 kg0, yg0 yg0) {
            this.a = yg0;
        }

        @Override // defpackage.tg0
        public void a() {
            this.a.a();
        }
    }

    public kg0(Executor executor, ContentResolver contentResolver) {
        this.a = executor;
        this.b = contentResolver;
    }

    /* access modifiers changed from: private */
    public static int g(ih0 ih0) {
        return (ih0.i() > 96 || ih0.h() > 96) ? 1 : 3;
    }

    /* access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) {
        if (Build.VERSION.SDK_INT >= 10) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, C0201.m82(21712));
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                return mediaMetadataRetriever.getFrameAtTime(-1);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c A[SYNTHETIC, Splitter:B:14:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    private String i(ih0 ih0) {
        String[] strArr;
        String str;
        Uri uri;
        Cursor query;
        Uri q = ih0.q();
        if (h70.i(q)) {
            return ih0.p().getPath();
        }
        if (h70.h(q)) {
            if (Build.VERSION.SDK_INT >= 19) {
                if (C0201.m82(21713).equals(q.getAuthority())) {
                    String documentId = DocumentsContract.getDocumentId(q);
                    Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    String[] strArr2 = {documentId.split(C0201.m82(21714))[1]};
                    str = C0201.m82(21715);
                    uri = uri2;
                    strArr = strArr2;
                    ContentResolver contentResolver = this.b;
                    String r12 = C0201.m82(21716);
                    query = contentResolver.query(uri, new String[]{r12}, str, strArr, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                return query.getString(query.getColumnIndexOrThrow(r12));
                            }
                        } finally {
                            if (query != null) {
                                query.close();
                            }
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                }
            }
            uri = q;
            str = null;
            strArr = null;
            ContentResolver contentResolver2 = this.b;
            String r122 = C0201.m82(21716);
            query = contentResolver2.query(uri, new String[]{r122}, str, strArr, null);
            if (query != null) {
            }
            if (query != null) {
            }
        }
        return null;
    }

    @Override // defpackage.rg0
    public void b(sf0<v60<ye0>> sf0, sg0 sg0) {
        ug0 f = sg0.f();
        String t = sg0.t();
        a aVar = new a(sf0, f, C0201.m82(21717), t, f, t, sg0.c());
        sg0.d(new b(this, aVar));
        this.a.execute(aVar);
    }
}
