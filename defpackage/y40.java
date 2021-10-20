package defpackage;

import defpackage.j40;
import defpackage.q50;
import defpackage.w40;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import vigqyno.C0201;

/* renamed from: y40  reason: default package */
/* compiled from: DynamicDefaultDiskStorage */
public class y40 implements w40 {
    private static final Class<?> f = y40.class;
    private final int a;
    private final c60<File> b;
    private final String c;
    private final j40 d;
    public volatile a e = new a(null, null);

    /* access modifiers changed from: package-private */
    /* renamed from: y40$a */
    /* compiled from: DynamicDefaultDiskStorage */
    public static class a {
        public final w40 a;
        public final File b;

        public a(File file, w40 w40) {
            this.a = w40;
            this.b = file;
        }
    }

    public y40(int i, c60<File> c60, String str, j40 j40) {
        this.a = i;
        this.d = j40;
        this.b = c60;
        this.c = str;
    }

    private void j() throws IOException {
        File file = new File(this.b.get(), this.c);
        i(file);
        this.e = new a(file, new t40(file, this.a, this.d));
    }

    private boolean m() {
        File file;
        a aVar = this.e;
        return aVar.a == null || (file = aVar.b) == null || !file.exists();
    }

    @Override // defpackage.w40
    public void a() throws IOException {
        l().a();
    }

    @Override // defpackage.w40
    public boolean b() {
        try {
            return l().b();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.w40
    public void c() {
        try {
            l().c();
        } catch (IOException e2) {
            f60.f(f, C0201.m82(30), e2);
        }
    }

    @Override // defpackage.w40
    public w40.b d(String str, Object obj) throws IOException {
        return l().d(str, obj);
    }

    @Override // defpackage.w40
    public boolean e(String str, Object obj) throws IOException {
        return l().e(str, obj);
    }

    @Override // defpackage.w40
    public h40 f(String str, Object obj) throws IOException {
        return l().f(str, obj);
    }

    @Override // defpackage.w40
    public Collection<w40.a> g() throws IOException {
        return l().g();
    }

    @Override // defpackage.w40
    public long h(w40.a aVar) throws IOException {
        return l().h(aVar);
    }

    public void i(File file) throws IOException {
        try {
            q50.a(file);
            f60.a(f, C0201.m82(31), file.getAbsolutePath());
        } catch (q50.a e2) {
            this.d.a(j40.a.WRITE_CREATE_DIR, f, C0201.m82(32), e2);
            throw e2;
        }
    }

    public void k() {
        if (this.e.a != null && this.e.b != null) {
            o50.b(this.e.b);
        }
    }

    public synchronized w40 l() throws IOException {
        w40 w40;
        if (m()) {
            k();
            j();
        }
        w40 = this.e.a;
        z50.g(w40);
        return w40;
    }

    @Override // defpackage.w40
    public long remove(String str) throws IOException {
        return l().remove(str);
    }
}
