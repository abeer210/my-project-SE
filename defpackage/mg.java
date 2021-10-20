package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: mg  reason: default package */
/* compiled from: Util */
public final class mg {
    public static final Charset a = Charset.forName(C0201.m82(31083));

    static {
        Charset.forName(C0201.m82(31084));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(C0201.m82(31085) + file2);
                }
            }
            return;
        }
        throw new IOException(C0201.m82(31086) + file);
    }
}
