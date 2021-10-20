package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* renamed from: tr2  reason: default package */
/* compiled from: LZWFilter */
public class tr2 extends pr2 {
    public static final String a = null;
    public static final String b = null;

    static {
        C0201.m83(tr2.class, 68);
    }

    private int c(int i, int i2) {
        if (i >= 2048 - i2) {
            return 12;
        }
        if (i >= 1024 - i2) {
            return 11;
        }
        return i >= 512 - i2 ? 10 : 9;
    }

    private List<byte[]> d() {
        ArrayList arrayList = new ArrayList(4096);
        for (int i = 0; i < 256; i++) {
            arrayList.add(new byte[]{(byte) (i & 255)});
        }
        arrayList.add(null);
        arrayList.add(null);
        return arrayList;
    }

    private void e(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        List<byte[]> arrayList = new ArrayList<>();
        qq2 qq2 = new qq2(inputStream);
        loop0:
        while (true) {
            long j = -1;
            int i2 = 9;
            while (true) {
                try {
                    long i3 = qq2.i(i2);
                    if (i3 == 257) {
                        break loop0;
                    } else if (i3 == 256) {
                        break;
                    } else {
                        if (i3 < ((long) arrayList.size())) {
                            byte[] bArr = arrayList.get((int) i3);
                            byte b2 = bArr[0];
                            outputStream.write(bArr);
                            if (j != -1) {
                                byte[] bArr2 = arrayList.get((int) j);
                                byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length + 1);
                                copyOf[bArr2.length] = b2;
                                arrayList.add(copyOf);
                            }
                        } else {
                            byte[] bArr3 = arrayList.get((int) j);
                            byte[] copyOf2 = Arrays.copyOf(bArr3, bArr3.length + 1);
                            copyOf2[bArr3.length] = bArr3[0];
                            outputStream.write(copyOf2);
                            arrayList.add(copyOf2);
                        }
                        i2 = c(arrayList.size(), i);
                        j = i3;
                    }
                } catch (EOFException unused) {
                    Log.w(a, b);
                }
            }
            arrayList = d();
        }
        outputStream.flush();
    }

    @Override // defpackage.pr2
    public or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException {
        int i2;
        int i3;
        vq2 b2 = pr2.b(vq2, i);
        if (b2 != null) {
            int s0 = b2.s0(ar2.j0);
            int t0 = b2.t0(ar2.F, 1);
            if (t0 == 0 || t0 == 1) {
                i2 = s0;
                i3 = t0;
            } else {
                i2 = s0;
                i3 = 1;
            }
        } else {
            i3 = 1;
            i2 = -1;
        }
        if (i2 > 1) {
            int min = Math.min(b2.t0(ar2.q, 1), 32);
            int t02 = b2.t0(ar2.j, 8);
            int t03 = b2.t0(ar2.v, 1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e(inputStream, byteArrayOutputStream, i3);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ur2.a(i2, min, t02, t03, byteArrayInputStream, outputStream);
            outputStream.flush();
            byteArrayOutputStream.reset();
            byteArrayInputStream.reset();
        } else {
            e(inputStream, outputStream, i3);
        }
        return new or2(vq2);
    }
}
