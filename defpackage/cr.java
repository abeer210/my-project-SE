package defpackage;

/* renamed from: cr  reason: default package */
/* compiled from: ByteConvert */
public class cr {
    public static int a(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280);
    }
}
