package defpackage;

import android.net.Uri;

/* renamed from: ad0  reason: default package */
/* compiled from: DefaultCacheKeyFactory */
public class ad0 implements wc0 {
    private static ad0 a;

    public static synchronized ad0 f() {
        ad0 ad0;
        synchronized (ad0.class) {
            if (a == null) {
                a = new ad0();
            }
            ad0 = a;
        }
        return ad0;
    }

    @Override // defpackage.wc0
    public m40 a(ih0 ih0, Object obj) {
        Uri q = ih0.q();
        e(q);
        return new tc0(q.toString(), ih0.m(), ih0.o(), ih0.d(), null, null, obj);
    }

    @Override // defpackage.wc0
    public m40 b(ih0 ih0, Uri uri, Object obj) {
        e(uri);
        return new r40(uri.toString());
    }

    @Override // defpackage.wc0
    public m40 c(ih0 ih0, Object obj) {
        String str;
        m40 m40;
        kh0 g = ih0.g();
        if (g != null) {
            m40 c = g.c();
            str = g.getClass().getName();
            m40 = c;
        } else {
            m40 = null;
            str = null;
        }
        Uri q = ih0.q();
        e(q);
        return new tc0(q.toString(), ih0.m(), ih0.o(), ih0.d(), m40, str, obj);
    }

    @Override // defpackage.wc0
    public m40 d(ih0 ih0, Object obj) {
        return b(ih0, ih0.q(), obj);
    }

    public Uri e(Uri uri) {
        return uri;
    }
}
