package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: oc2  reason: default package */
public abstract class oc2 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                pc2.e(C0201.m82(28320), C0201.m82(28321));
            }
        }
    }

    public static void b(OutputStream outputStream) {
        a(outputStream);
    }

    public static void c(InputStream inputStream) {
        a(inputStream);
    }
}
