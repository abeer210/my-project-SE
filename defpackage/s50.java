package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import vigqyno.C0201;

/* renamed from: s50  reason: default package */
/* compiled from: Closeables */
public final class s50 {
    public static final Logger a = Logger.getLogger(s50.class.getName());

    private s50() {
    }

    public static void a(Closeable closeable, boolean z) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (z) {
                    a.log(Level.WARNING, C0201.m82(5883), (Throwable) e);
                    return;
                }
                throw e;
            }
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
