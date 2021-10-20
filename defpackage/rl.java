package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import defpackage.fl;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: rl  reason: default package */
/* compiled from: StreamBitmapDecoder */
public class rl implements k<InputStream, Bitmap> {
    private final fl a;
    private final ni b;

    /* access modifiers changed from: package-private */
    /* renamed from: rl$a */
    /* compiled from: StreamBitmapDecoder */
    public static class a implements fl.b {
        private final pl a;
        private final yo b;

        public a(pl plVar, yo yoVar) {
            this.a = plVar;
            this.b = yoVar;
        }

        @Override // defpackage.fl.b
        public void a(qi qiVar, Bitmap bitmap) throws IOException {
            IOException a2 = this.b.a();
            if (a2 != null) {
                if (bitmap != null) {
                    qiVar.c(bitmap);
                }
                throw a2;
            }
        }

        @Override // defpackage.fl.b
        public void b() {
            this.a.c();
        }
    }

    public rl(fl flVar, ni niVar) {
        this.a = flVar;
        this.b = niVar;
    }

    /* renamed from: c */
    public hi<Bitmap> b(InputStream inputStream, int i, int i2, i iVar) throws IOException {
        pl plVar;
        boolean z;
        if (inputStream instanceof pl) {
            plVar = (pl) inputStream;
            z = false;
        } else {
            plVar = new pl(inputStream, this.b);
            z = true;
        }
        yo c = yo.c(plVar);
        try {
            return this.a.g(new cp(c), i, i2, iVar, new a(plVar, c));
        } finally {
            c.h();
            if (z) {
                plVar.h();
            }
        }
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        return this.a.p(inputStream);
    }
}
