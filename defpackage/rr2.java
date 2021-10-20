package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import vigqyno.C0201;

/* renamed from: rr2  reason: default package */
/* compiled from: FlateFilter */
public final class rr2 extends pr2 {
    private static void c(InputStream inputStream, OutputStream outputStream) throws IOException, DataFormatException {
        byte[] bArr = new byte[2048];
        int read = inputStream.read(bArr);
        if (read > 0) {
            Inflater inflater = new Inflater();
            inflater.setInput(bArr, 0, read);
            byte[] bArr2 = new byte[2048];
            while (true) {
                int inflate = inflater.inflate(bArr2);
                if (inflate == 0) {
                    if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                        break;
                    }
                    inflater.setInput(bArr, 0, inputStream.read(bArr));
                } else {
                    outputStream.write(bArr2, 0, inflate);
                }
            }
        }
        outputStream.flush();
    }

    @Override // defpackage.pr2
    public or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException {
        vq2 b = pr2.b(vq2, i);
        int s0 = b != null ? b.s0(ar2.j0) : -1;
        if (s0 > 1) {
            try {
                int min = Math.min(b.t0(ar2.q, 1), 32);
                int t0 = b.t0(ar2.j, 8);
                int t02 = b.t0(ar2.v, 1);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                c(inputStream, byteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                ur2.a(s0, min, t0, t02, byteArrayInputStream, outputStream);
                outputStream.flush();
                byteArrayOutputStream.reset();
                byteArrayInputStream.reset();
            } catch (DataFormatException e) {
                Log.e(C0201.m82(35674), C0201.m82(35675));
                throw new IOException(e);
            }
        } else {
            c(inputStream, outputStream);
        }
        return new or2(vq2);
    }
}
