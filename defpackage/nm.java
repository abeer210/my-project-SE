package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import vigqyno.C0201;

/* renamed from: nm  reason: default package */
/* compiled from: StreamGifDecoder */
public class nm implements k<InputStream, gm> {
    private final List<ImageHeaderParser> a;
    private final k<ByteBuffer, gm> b;
    private final ni c;

    public nm(List<ImageHeaderParser> list, k<ByteBuffer, gm> kVar, ni niVar) {
        this.a = list;
        this.b = kVar;
        this.c = niVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            String r1 = C0201.m82(33638);
            if (!Log.isLoggable(r1, 5)) {
                return null;
            }
            Log.w(r1, C0201.m82(33639), e);
            return null;
        }
    }

    /* renamed from: c */
    public hi<gm> b(InputStream inputStream, int i, int i2, i iVar) throws IOException {
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(e), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) throws IOException {
        return !((Boolean) iVar.c(mm.b)).booleanValue() && f.e(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
