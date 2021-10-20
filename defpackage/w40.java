package defpackage;

import java.io.IOException;
import java.util.Collection;

/* renamed from: w40  reason: default package */
/* compiled from: DiskStorage */
public interface w40 {

    /* renamed from: w40$a */
    /* compiled from: DiskStorage */
    public interface a {
        long a();

        String t();

        long u();
    }

    /* renamed from: w40$b */
    /* compiled from: DiskStorage */
    public interface b {
        boolean a();

        void b(s40 s40, Object obj) throws IOException;

        h40 c(Object obj) throws IOException;
    }

    void a() throws IOException;

    boolean b();

    void c();

    b d(String str, Object obj) throws IOException;

    boolean e(String str, Object obj) throws IOException;

    h40 f(String str, Object obj) throws IOException;

    Collection<a> g() throws IOException;

    long h(a aVar) throws IOException;

    long remove(String str) throws IOException;
}
