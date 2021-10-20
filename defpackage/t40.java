package defpackage;

import android.os.Environment;
import defpackage.j40;
import defpackage.q50;
import defpackage.w40;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* renamed from: t40  reason: default package */
/* compiled from: DefaultDiskStorage */
public class t40 implements w40 {
    private static final Class<?> f = t40.class;
    public static final long g = TimeUnit.MINUTES.toMillis(30);
    private final File a;
    private final boolean b;
    private final File c;
    private final j40 d;
    private final com.facebook.common.time.a e = com.facebook.common.time.c.a();

    /* access modifiers changed from: private */
    /* renamed from: t40$b */
    /* compiled from: DefaultDiskStorage */
    public class b implements p50 {
        private final List<w40.a> a;

        private b() {
            this.a = new ArrayList();
        }

        @Override // defpackage.p50
        public void a(File file) {
            d u = t40.this.u(file);
            if (u != null && u.a == C0201.m82(14901)) {
                this.a.add(new c(u.b, file));
            }
        }

        @Override // defpackage.p50
        public void b(File file) {
        }

        @Override // defpackage.p50
        public void c(File file) {
        }

        public List<w40.a> d() {
            return Collections.unmodifiableList(this.a);
        }
    }

    /* renamed from: t40$c */
    /* compiled from: DefaultDiskStorage */
    static class c implements w40.a {
        private final String a;
        private final i40 b;
        private long c;
        private long d;

        @Override // defpackage.w40.a
        public long a() {
            if (this.c < 0) {
                this.c = this.b.size();
            }
            return this.c;
        }

        public i40 b() {
            return this.b;
        }

        @Override // defpackage.w40.a
        public String t() {
            return this.a;
        }

        @Override // defpackage.w40.a
        public long u() {
            if (this.d < 0) {
                this.d = this.b.c().lastModified();
            }
            return this.d;
        }

        private c(String str, File file) {
            z50.g(file);
            z50.g(str);
            this.a = str;
            this.b = i40.b(file);
            this.c = -1;
            this.d = -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t40$d */
    /* compiled from: DefaultDiskStorage */
    public static class d {
        public final String a;
        public final String b;

        public static d b(File file) {
            String s;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (s = t40.s(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (s.equals(C0201.m82(15052))) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new d(s, substring);
        }

        public File a(File file) throws IOException {
            return File.createTempFile(this.b + C0201.m82(15053), C0201.m82(15054), file);
        }

        public String c(String str) {
            return str + File.separator + this.b + this.a;
        }

        public String toString() {
            return this.a + C0201.m82(15055) + this.b + C0201.m82(15056);
        }

        private d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* renamed from: t40$e */
    /* compiled from: DefaultDiskStorage */
    private static class e extends IOException {
        public e(long j, long j2) {
            super(C0201.m82(15017) + j + C0201.m82(15018) + j2);
        }
    }

    /* renamed from: t40$f */
    /* compiled from: DefaultDiskStorage */
    class f implements w40.b {
        private final String a;
        public final File b;

        public f(String str, File file) {
            this.a = str;
            this.b = file;
        }

        @Override // defpackage.w40.b
        public boolean a() {
            return !this.b.exists() || this.b.delete();
        }

        /* JADX INFO: finally extract failed */
        @Override // defpackage.w40.b
        public void b(s40 s40, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.b);
                try {
                    t50 t50 = new t50(fileOutputStream);
                    s40.a(t50);
                    t50.flush();
                    long a2 = t50.a();
                    fileOutputStream.close();
                    if (this.b.length() != a2) {
                        throw new e(a2, this.b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                t40.this.d.a(j40.a.WRITE_UPDATE_FILE_NOT_FOUND, t40.f, C0201.m82(13811), e);
                throw e;
            }
        }

        @Override // defpackage.w40.b
        public h40 c(Object obj) throws IOException {
            j40.a aVar;
            File q = t40.this.q(this.a);
            try {
                q50.b(this.b, q);
                if (q.exists()) {
                    q.setLastModified(t40.this.e.now());
                }
                return i40.b(q);
            } catch (q50.d e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    aVar = j40.a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof q50.c) {
                    aVar = j40.a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    aVar = j40.a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    aVar = j40.a.WRITE_RENAME_FILE_OTHER;
                }
                t40.this.d.a(aVar, t40.f, C0201.m82(13812), e);
                throw e;
            }
        }
    }

    /* renamed from: t40$g */
    /* compiled from: DefaultDiskStorage */
    private class g implements p50 {
        private boolean a;

        private g() {
        }

        private boolean d(File file) {
            d u = t40.this.u(file);
            boolean z = false;
            if (u == null) {
                return false;
            }
            String str = u.a;
            if (str == C0201.m82(13737)) {
                return e(file);
            }
            if (str == C0201.m82(13738)) {
                z = true;
            }
            z50.i(z);
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > t40.this.e.now() - t40.g;
        }

        @Override // defpackage.p50
        public void a(File file) {
            if (!this.a || !d(file)) {
                file.delete();
            }
        }

        @Override // defpackage.p50
        public void b(File file) {
            if (!this.a && file.equals(t40.this.c)) {
                this.a = true;
            }
        }

        @Override // defpackage.p50
        public void c(File file) {
            if (!t40.this.a.equals(file) && !this.a) {
                file.delete();
            }
            if (this.a && file.equals(t40.this.c)) {
                this.a = false;
            }
        }
    }

    public t40(File file, int i, j40 j40) {
        z50.g(file);
        this.a = file;
        this.b = y(file, j40);
        this.c = new File(this.a, x(i));
        this.d = j40;
        B();
    }

    private boolean A(String str, boolean z) {
        File q = q(str);
        boolean exists = q.exists();
        if (z && exists) {
            q.setLastModified(this.e.now());
        }
        return exists;
    }

    private void B() {
        boolean z = true;
        if (this.a.exists()) {
            if (!this.c.exists()) {
                o50.b(this.a);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                q50.a(this.c);
            } catch (q50.a unused) {
                j40 j40 = this.d;
                j40.a aVar = j40.a.WRITE_CREATE_DIR;
                Class<?> cls = f;
                j40.a(aVar, cls, C0201.m82(35779) + this.c, null);
            }
        }
    }

    private long p(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static String s(String str) {
        String r0 = C0201.m82(35780);
        if (r0.equals(str)) {
            return r0;
        }
        String r02 = C0201.m82(35781);
        if (r02.equals(str)) {
            return r02;
        }
        return null;
    }

    private String t(String str) {
        d dVar = new d(C0201.m82(35782), str);
        return dVar.c(w(dVar.b));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private d u(File file) {
        d b2 = d.b(file);
        if (b2 == null) {
            return null;
        }
        if (v(b2.b).equals(file.getParentFile())) {
            return b2;
        }
        return null;
    }

    private File v(String str) {
        return new File(w(str));
    }

    private String w(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.c + File.separator + valueOf;
    }

    public static String x(int i) {
        return String.format(null, C0201.m82(35784), C0201.m82(35783), 100, Integer.valueOf(i));
    }

    private static boolean y(File file, j40 j40) {
        IOException e2;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            try {
                try {
                    return file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException e3) {
                    e2 = e3;
                    j40.a aVar = j40.a.OTHER;
                    Class<?> cls = f;
                    j40.a(aVar, cls, C0201.m82(35785) + ((String) null), e2);
                    return false;
                }
            } catch (IOException e4) {
                e2 = e4;
                j40.a aVar2 = j40.a.OTHER;
                Class<?> cls2 = f;
                j40.a(aVar2, cls2, C0201.m82(35785) + ((String) null), e2);
                return false;
            }
        } catch (Exception e5) {
            j40.a(j40.a.OTHER, f, C0201.m82(35786), e5);
            return false;
        }
    }

    private void z(File file, String str) throws IOException {
        try {
            q50.a(file);
        } catch (q50.a e2) {
            this.d.a(j40.a.WRITE_CREATE_DIR, f, str, e2);
            throw e2;
        }
    }

    @Override // defpackage.w40
    public void a() {
        o50.a(this.a);
    }

    @Override // defpackage.w40
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.w40
    public void c() {
        o50.c(this.a, new g());
    }

    @Override // defpackage.w40
    public w40.b d(String str, Object obj) throws IOException {
        d dVar = new d(C0201.m82(35787), str);
        File v = v(dVar.b);
        boolean exists = v.exists();
        String r2 = C0201.m82(35788);
        if (!exists) {
            z(v, r2);
        }
        try {
            return new f(str, dVar.a(v));
        } catch (IOException e2) {
            this.d.a(j40.a.WRITE_CREATE_TEMPFILE, f, r2, e2);
            throw e2;
        }
    }

    @Override // defpackage.w40
    public boolean e(String str, Object obj) {
        return A(str, false);
    }

    @Override // defpackage.w40
    public h40 f(String str, Object obj) {
        File q = q(str);
        if (!q.exists()) {
            return null;
        }
        q.setLastModified(this.e.now());
        return i40.b(q);
    }

    @Override // defpackage.w40
    public long h(w40.a aVar) {
        return p(((c) aVar).b().c());
    }

    public File q(String str) {
        return new File(t(str));
    }

    /* renamed from: r */
    public List<w40.a> g() throws IOException {
        b bVar = new b();
        o50.c(this.c, bVar);
        return bVar.d();
    }

    @Override // defpackage.w40
    public long remove(String str) {
        return p(q(str));
    }
}
