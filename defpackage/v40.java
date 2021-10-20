package defpackage;

import android.content.Context;
import java.io.File;
import vigqyno.C0201;

/* renamed from: v40  reason: default package */
/* compiled from: DiskCacheConfig */
public class v40 {
    private final int a;
    private final String b;
    private final c60<File> c;
    private final long d;
    private final long e;
    private final long f;
    private final a50 g;
    private final j40 h;
    private final l40 i;
    private final f50 j;
    private final Context k;
    private final boolean l;

    /* renamed from: v40$b */
    /* compiled from: DiskCacheConfig */
    public static class b {
        private int a;
        private String b;
        private c60<File> c;
        private long d;
        private long e;
        private long f;
        private a50 g;
        private j40 h;
        private l40 i;
        private f50 j;
        private boolean k;
        private final Context l;

        /* renamed from: v40$b$a */
        /* compiled from: DiskCacheConfig */
        class a implements c60<File> {
            public a() {
            }

            /* renamed from: a */
            public File get() {
                return b.this.l.getApplicationContext().getCacheDir();
            }
        }

        public v40 m() {
            z50.j((this.c == null && this.l == null) ? false : true, C0201.m82(17367));
            if (this.c == null && this.l != null) {
                this.c = new a();
            }
            return new v40(this);
        }

        private b(Context context) {
            this.a = 1;
            this.b = C0201.m82(17366);
            this.d = 41943040;
            this.e = 10485760;
            this.f = 2097152;
            this.g = new u40();
            this.l = context;
        }
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String a() {
        return this.b;
    }

    public c60<File> b() {
        return this.c;
    }

    public j40 c() {
        return this.h;
    }

    public l40 d() {
        return this.i;
    }

    public Context e() {
        return this.k;
    }

    public long f() {
        return this.d;
    }

    public f50 g() {
        return this.j;
    }

    public a50 h() {
        return this.g;
    }

    public boolean i() {
        return this.l;
    }

    public long j() {
        return this.e;
    }

    public long k() {
        return this.f;
    }

    public int l() {
        return this.a;
    }

    private v40(b bVar) {
        j40 j40;
        l40 l40;
        f50 f50;
        this.a = bVar.a;
        String str = bVar.b;
        z50.g(str);
        this.b = str;
        c60<File> c60 = bVar.c;
        z50.g(c60);
        this.c = c60;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        a50 a50 = bVar.g;
        z50.g(a50);
        this.g = a50;
        if (bVar.h == null) {
            j40 = p40.b();
        } else {
            j40 = bVar.h;
        }
        this.h = j40;
        if (bVar.i == null) {
            l40 = q40.i();
        } else {
            l40 = bVar.i;
        }
        this.i = l40;
        if (bVar.j == null) {
            f50 = g50.b();
        } else {
            f50 = bVar.j;
        }
        this.j = f50;
        this.k = bVar.l;
        this.l = bVar.k;
    }
}
