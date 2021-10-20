package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.vision.b;
import java.nio.ByteBuffer;

/* renamed from: b03  reason: default package */
/* compiled from: RNFrameFactory */
public class b03 {
    public static a03 a(Bitmap bitmap) {
        b.a aVar = new b.a();
        aVar.b(bitmap);
        return new a03(aVar.a(), new vz2(bitmap.getWidth(), bitmap.getHeight()));
    }

    public static a03 b(byte[] bArr, int i, int i2, int i3) {
        b.a aVar = new b.a();
        aVar.c(ByteBuffer.wrap(bArr), i, i2, 17);
        if (i3 == 90) {
            aVar.d(1);
        } else if (i3 == 180) {
            aVar.d(2);
        } else if (i3 != 270) {
            aVar.d(0);
        } else {
            aVar.d(3);
        }
        return new a03(aVar.a(), new vz2(i, i2, i3));
    }
}
