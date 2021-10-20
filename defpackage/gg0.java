package defpackage;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.imageutils.c;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: gg0  reason: default package */
/* compiled from: LocalExifThumbnailProducer */
public class gg0 implements eh0<af0> {
    private final Executor a;
    private final r60 b;
    private final ContentResolver c;

    /* renamed from: gg0$a */
    /* compiled from: LocalExifThumbnailProducer */
    class a extends yg0<af0> {
        public final /* synthetic */ ih0 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sf0 sf0, ug0 ug0, String str, String str2, ih0 ih0) {
            super(sf0, ug0, str, str2);
            this.f = ih0;
        }

        /* renamed from: j */
        public void b(af0 af0) {
            af0.h(af0);
        }

        /* renamed from: k */
        public Map<String, String> i(af0 af0) {
            return w50.b(C0201.m82(30507), Boolean.toString(af0 != null));
        }

        /* renamed from: l */
        public af0 c() throws Exception {
            ExifInterface g2 = gg0.this.g(this.f.q());
            if (g2 == null || !g2.hasThumbnail()) {
                return null;
            }
            return gg0.this.e(gg0.this.b.b(g2.getThumbnail()), g2);
        }
    }

    /* renamed from: gg0$b */
    /* compiled from: LocalExifThumbnailProducer */
    class b extends mf0 {
        public final /* synthetic */ yg0 a;

        public b(gg0 gg0, yg0 yg0) {
            this.a = yg0;
        }

        @Override // defpackage.tg0
        public void a() {
            this.a.a();
        }
    }

    public gg0(Executor executor, r60 r60, ContentResolver contentResolver) {
        this.a = executor;
        this.b = r60;
        this.c = contentResolver;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private af0 e(q60 q60, ExifInterface exifInterface) {
        Pair<Integer, Integer> a2 = com.facebook.imageutils.a.a(new s60(q60));
        int h = h(exifInterface);
        int i = -1;
        int intValue = a2 != null ? ((Integer) a2.first).intValue() : -1;
        if (a2 != null) {
            i = ((Integer) a2.second).intValue();
        }
        v60 B = v60.B(q60);
        try {
            af0 af0 = new af0(B);
            v60.s(B);
            af0.T(nb0.a);
            af0.U(h);
            af0.Z(intValue);
            af0.R(i);
            return af0;
        } catch (Throwable th) {
            v60.s(B);
            throw th;
        }
    }

    private int h(ExifInterface exifInterface) {
        return c.a(Integer.parseInt(exifInterface.getAttribute(C0201.m82(10662))));
    }

    @Override // defpackage.eh0
    public boolean a(rd0 rd0) {
        return fh0.b(512, 512, rd0);
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        a aVar = new a(sf0, sg0.f(), C0201.m82(10663), sg0.t(), sg0.c());
        sg0.d(new b(this, aVar));
        this.a.execute(aVar);
    }

    public boolean f(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    public ExifInterface g(Uri uri) {
        String a2 = h70.a(this.c, uri);
        try {
            if (f(a2)) {
                return new ExifInterface(a2);
            }
            return null;
        } catch (IOException unused) {
            return null;
        } catch (StackOverflowError unused2) {
            f60.e(gg0.class, C0201.m82(10664));
            return null;
        }
    }
}
