package defpackage;

import android.graphics.Bitmap;
import vigqyno.C0201;

/* renamed from: oi  reason: default package */
/* compiled from: AttributeStrategy */
public class oi implements xi {
    private final b a = new b();
    private final ti<a, Bitmap> b = new ti<>();

    /* access modifiers changed from: package-private */
    /* renamed from: oi$a */
    /* compiled from: AttributeStrategy */
    public static class a implements yi {
        private final b a;
        private int b;
        private int c;
        private Bitmap.Config d;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.yi
        public void a() {
            this.a.c(this);
        }

        public void b(int i, int i2, Bitmap.Config config) {
            this.b = i;
            this.c = i2;
            this.d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.b * 31) + this.c) * 31;
            Bitmap.Config config = this.d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return oi.f(this.b, this.c, this.d);
        }
    }

    /* renamed from: oi$b */
    /* compiled from: AttributeStrategy */
    static class b extends pi<a> {
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i, int i2, Bitmap.Config config) {
            a aVar = (a) b();
            aVar.b(i, i2, config);
            return aVar;
        }
    }

    public static String f(int i, int i2, Bitmap.Config config) {
        return C0201.m82(35467) + i + C0201.m82(35468) + i2 + C0201.m82(35469) + config;
    }

    private static String g(Bitmap bitmap) {
        return f(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // defpackage.xi
    public String a(int i, int i2, Bitmap.Config config) {
        return f(i, i2, config);
    }

    @Override // defpackage.xi
    public int b(Bitmap bitmap) {
        return fp.g(bitmap);
    }

    @Override // defpackage.xi
    public void c(Bitmap bitmap) {
        this.b.d(this.a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // defpackage.xi
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return this.b.a(this.a.e(i, i2, config));
    }

    @Override // defpackage.xi
    public String e(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // defpackage.xi
    public Bitmap removeLast() {
        return this.b.f();
    }

    public String toString() {
        return C0201.m82(35470) + this.b;
    }
}
