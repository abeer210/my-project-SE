package defpackage;

import defpackage.ob0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: pb0  reason: default package */
/* compiled from: ImageFormatChecker */
public class pb0 {
    private static pb0 d;
    private int a;
    private List<ob0.a> b;
    private final ob0.a c = new mb0();

    private pb0() {
        f();
    }

    public static ob0 b(InputStream inputStream) throws IOException {
        return d().a(inputStream);
    }

    public static ob0 c(InputStream inputStream) {
        try {
            return b(inputStream);
        } catch (IOException e) {
            e60.a(e);
            throw null;
        }
    }

    public static synchronized pb0 d() {
        pb0 pb0;
        synchronized (pb0.class) {
            if (d == null) {
                d = new pb0();
            }
            pb0 = d;
        }
        return pb0;
    }

    private static int e(int i, InputStream inputStream, byte[] bArr) throws IOException {
        z50.g(inputStream);
        z50.g(bArr);
        z50.b(bArr.length >= i);
        if (!inputStream.markSupported()) {
            return r50.b(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return r50.b(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    private void f() {
        this.a = this.c.a();
        List<ob0.a> list = this.b;
        if (list != null) {
            for (ob0.a aVar : list) {
                this.a = Math.max(this.a, aVar.a());
            }
        }
    }

    public ob0 a(InputStream inputStream) throws IOException {
        z50.g(inputStream);
        int i = this.a;
        byte[] bArr = new byte[i];
        int e = e(i, inputStream, bArr);
        ob0 b2 = this.c.b(bArr, e);
        if (!(b2 == null || b2 == ob0.b)) {
            return b2;
        }
        List<ob0.a> list = this.b;
        if (list != null) {
            for (ob0.a aVar : list) {
                ob0 b3 = aVar.b(bArr, e);
                if (!(b3 == null || b3 == ob0.b)) {
                    return b3;
                }
            }
        }
        return ob0.b;
    }
}
