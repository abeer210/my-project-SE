package com.huawei.hms.framework.common;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import vigqyno.C0201;

public class IoUtils {
    private static final int BUFF_SIZE = 0;
    private static final int MAX_SIZE = 0;
    private static final String TAG = null;

    static {
        C0201.m83(IoUtils.class, 327);
    }

    private IoUtils() {
    }

    public static void close(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static void closeSecure(Closeable closeable) {
        String r0 = C0201.m82(2328);
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Logger.w(r0, C0201.m82(2329), e);
            }
        } else {
            Logger.w(r0, C0201.m82(2330));
        }
    }

    public static void closeSecure(InputStream inputStream) {
        closeSecure((Closeable) inputStream);
    }

    public static void closeSecure(OutputStream outputStream) {
        closeSecure((Closeable) outputStream);
    }

    public static void closeSecure(Reader reader) {
        closeSecure((Closeable) reader);
    }

    public static void closeSecure(Writer writer) {
        closeSecure((Closeable) writer);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            if (j <= 16777216) {
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } else {
                throw new IOException(C0201.m82(2331));
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
