package com.huawei.hms.framework.network.grs.d;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

public class c {
    private static final String a = null;

    static {
        C0201.m83(c.class, 577);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r8 = com.huawei.hms.framework.network.grs.d.c.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        com.huawei.hms.framework.common.Logger.w(r8, vigqyno.C0201.m82(27239), r7);
        a(r2);
        a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        a((java.io.OutputStream) r2);
        a((java.io.InputStream) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        throw r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0046 */
    public static String a(String str, Context context) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(27237);
        if (isEmpty) {
            return r1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream open = context.getAssets().open(str);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = open.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                String str2 = new String(byteArrayOutputStream.toByteArray(), C0201.m82(27238));
                a((OutputStream) byteArrayOutputStream);
                a(open);
                return str2;
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Logger.e(a, C0201.m82(27240), e);
            }
        }
    }

    public static void a(InputStream inputStream) {
        a((Closeable) inputStream);
    }

    public static void a(OutputStream outputStream) {
        a((Closeable) outputStream);
    }
}
