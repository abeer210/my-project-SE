package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: wk  reason: default package */
/* compiled from: BitmapImageDecoderResourceDecoder */
public final class wk extends qk<Bitmap> {
    private final qi b = new ri();

    @Override // defpackage.qk
    public hi<Bitmap> c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        String r7 = C0201.m82(15159);
        if (Log.isLoggable(r7, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(15160));
            sb.append(decodeBitmap.getWidth());
            String r1 = C0201.m82(15161);
            sb.append(r1);
            sb.append(decodeBitmap.getHeight());
            sb.append(C0201.m82(15162));
            sb.append(i);
            sb.append(r1);
            sb.append(i2);
            sb.append(C0201.m82(15163));
            Log.v(r7, sb.toString());
        }
        return new xk(decodeBitmap, this.b);
    }
}
