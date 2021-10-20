package com.huawei.hianalytics.ab.bc.kl;

import com.huawei.hianalytics.ab.bc.ef.ab;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.Deflater;
import vigqyno.C0201;

public final class de {
    public static String ab(File file) {
        Throwable th;
        String r0 = C0201.m82(26975);
        String r1 = C0201.m82(26976);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                ab abVar = new ab(1024);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    abVar.ab(bArr, read);
                }
                if (abVar.bc() == 0) {
                    ab((Closeable) fileInputStream2);
                    return r1;
                }
                String str = new String(abVar.ab(), C0201.m82(26977));
                ab((Closeable) fileInputStream2);
                return str;
            } catch (FileNotFoundException unused) {
                fileInputStream = fileInputStream2;
                ab.fg(r0, C0201.m82(26979));
                ab((Closeable) fileInputStream);
                return r1;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                try {
                    ab.fg(r0, C0201.m82(26978));
                    ab((Closeable) fileInputStream);
                    return r1;
                } catch (Throwable th2) {
                    th = th2;
                    ab((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                ab((Closeable) fileInputStream);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            ab.fg(r0, C0201.m82(26979));
            ab((Closeable) fileInputStream);
            return r1;
        } catch (IOException unused4) {
            ab.fg(r0, C0201.m82(26978));
            ab((Closeable) fileInputStream);
            return r1;
        }
    }

    public static String ab(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toString(C0201.m82(26980));
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            ab((Closeable) byteArrayOutputStream);
        }
    }

    public static void ab(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                ab.fg(C0201.m82(26981), C0201.m82(26982));
            }
        }
    }

    public static void ab(File file, String str) {
        Throwable th;
        FileOutputStream fileOutputStream;
        String str2;
        String r0 = C0201.m82(26983);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(str.getBytes(C0201.m82(26984)));
                fileOutputStream.flush();
            } catch (FileNotFoundException unused) {
                fileOutputStream2 = fileOutputStream;
            } catch (IOException unused2) {
                fileOutputStream2 = fileOutputStream;
                try {
                    str2 = C0201.m82(26985);
                    ab.fg(r0, str2);
                    fileOutputStream = fileOutputStream2;
                    ab((Closeable) fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    ab((Closeable) fileOutputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                ab((Closeable) fileOutputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            str2 = C0201.m82(26986);
            ab.fg(r0, str2);
            fileOutputStream = fileOutputStream2;
            ab((Closeable) fileOutputStream);
        } catch (IOException unused4) {
            str2 = C0201.m82(26985);
            ab.fg(r0, str2);
            fileOutputStream = fileOutputStream2;
            ab((Closeable) fileOutputStream);
        }
        ab((Closeable) fileOutputStream);
    }

    private static void ab(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                ab.fg(C0201.m82(26987), C0201.m82(26988));
            }
        }
    }

    public static void ab(HttpURLConnection httpURLConnection) {
        String r0 = C0201.m82(26989);
        try {
            w30.a(httpURLConnection).close();
        } catch (Exception unused) {
            ab.fg(r0, C0201.m82(26990));
        }
        httpURLConnection.disconnect();
        ab.ab(r0, C0201.m82(26991));
    }

    public static byte[] ab(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        ab((OutputStream) byteArrayOutputStream);
        return byteArray;
    }
}
