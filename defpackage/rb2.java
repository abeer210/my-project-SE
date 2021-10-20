package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import vigqyno.C0201;

/* renamed from: rb2  reason: default package */
public final class rb2 {
    public static String a(InputStream inputStream, String str) throws UnsupportedEncodingException, IOException {
        StringWriter stringWriter = new StringWriter();
        c(new InputStreamReader(inputStream, str), stringWriter);
        return stringWriter.toString();
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.e(C0201.m82(4035), C0201.m82(4036));
            }
        }
    }

    public static void c(Reader reader, Writer writer) throws IOException {
        d(reader, writer, new char[4096]);
    }

    public static void d(Reader reader, Writer writer, char[] cArr) throws IOException {
        while (true) {
            int read = reader.read(cArr);
            if (-1 != read) {
                writer.write(cArr, 0, read);
            } else {
                return;
            }
        }
    }
}
