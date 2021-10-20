package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imageutils.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: fg0  reason: default package */
/* compiled from: LocalContentUriThumbnailFetchProducer */
public class fg0 extends hg0 implements eh0<af0> {
    private static final Class<?> d = fg0.class;
    private static final String[] e;
    private static final String[] f;
    private static final Rect g = new Rect(0, 0, 512, 384);
    private static final Rect h = new Rect(0, 0, 96, 96);
    private final ContentResolver c;

    static {
        String r0 = C0201.m82(23118);
        String r1 = C0201.m82(23119);
        e = new String[]{r0, r1};
        f = new String[]{r1};
    }

    public fg0(Executor executor, r60 r60, ContentResolver contentResolver) {
        super(executor, r60);
        this.c = contentResolver;
    }

    private af0 g(Uri uri, rd0 rd0) throws IOException {
        af0 j;
        Cursor query = this.c.query(uri, e, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex(C0201.m82(23120)));
            if (rd0 == null || (j = j(rd0, query.getInt(query.getColumnIndex(C0201.m82(23121))))) == null) {
                query.close();
                return null;
            }
            j.U(i(string));
            query.close();
            return j;
        } finally {
            query.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str != null) {
            try {
                return c.a(new ExifInterface(str).getAttributeInt(C0201.m82(23122), 1));
            } catch (IOException e2) {
                f60.h(d, e2, C0201.m82(23123), str);
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    private af0 j(rd0 rd0, int i) throws IOException {
        Throwable th;
        int k = k(rd0);
        Cursor cursor = null;
        if (k == 0) {
            return null;
        }
        try {
            Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, (long) i, k, f);
            if (queryMiniThumbnail == null) {
                if (queryMiniThumbnail != null) {
                    queryMiniThumbnail.close();
                }
                return null;
            }
            try {
                queryMiniThumbnail.moveToFirst();
                if (queryMiniThumbnail.getCount() > 0) {
                    String string = queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex(C0201.m82(23124)));
                    if (new File(string).exists()) {
                        af0 e2 = e(new FileInputStream(string), h(string));
                        if (queryMiniThumbnail != null) {
                            queryMiniThumbnail.close();
                        }
                        return e2;
                    }
                }
                if (queryMiniThumbnail != null) {
                    queryMiniThumbnail.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = queryMiniThumbnail;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    private static int k(rd0 rd0) {
        if (fh0.b(h.width(), h.height(), rd0)) {
            return 3;
        }
        return fh0.b(g.width(), g.height(), rd0) ? 1 : 0;
    }

    @Override // defpackage.eh0
    public boolean a(rd0 rd0) {
        return fh0.b(g.width(), g.height(), rd0);
    }

    @Override // defpackage.hg0
    public af0 d(ih0 ih0) throws IOException {
        af0 g2;
        Uri q = ih0.q();
        if (!h70.f(q) || (g2 = g(q, ih0.m())) == null) {
            return null;
        }
        return g2;
    }

    @Override // defpackage.hg0
    public String f() {
        return C0201.m82(23125);
    }
}
