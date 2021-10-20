package defpackage;

import android.content.Context;
import defpackage.dj;
import java.io.File;
import vigqyno.C0201;

/* renamed from: fj  reason: default package */
/* compiled from: InternalCacheDiskCacheFactory */
public final class fj extends dj {

    /* renamed from: fj$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class a implements dj.a {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // defpackage.dj.a
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public fj(Context context) {
        this(context, C0201.m82(15124), 262144000);
    }

    public fj(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
