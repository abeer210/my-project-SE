package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: il  reason: default package */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class il implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, ni niVar) throws IOException {
        int k = new k4(inputStream).k(C0201.m82(22219), 1);
        if (k == 0) {
            return -1;
        }
        return k;
    }
}
