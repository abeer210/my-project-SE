package defpackage;

import java.io.ByteArrayOutputStream;
import vigqyno.C0201;

/* renamed from: qb3  reason: default package */
/* compiled from: Hex */
public class qb3 {
    private static final ob3 a = new rb3();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new nb3(C0201.m82(7394) + e.getMessage(), e);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new pb3(C0201.m82(7395) + e.getMessage(), e);
        }
    }

    public static String d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static String e(byte[] bArr, int i, int i2) {
        return mb3.b(c(bArr, i, i2));
    }
}
