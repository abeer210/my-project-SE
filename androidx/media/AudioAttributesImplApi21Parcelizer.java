package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

public final class AudioAttributesImplApi21Parcelizer {
    public static b read(a aVar) {
        b bVar = new b();
        bVar.a = (AudioAttributes) aVar.r(bVar.a, 1);
        bVar.b = aVar.p(bVar.b, 2);
        return bVar;
    }

    public static void write(b bVar, a aVar) {
        aVar.x(false, false);
        aVar.H(bVar.a, 1);
        aVar.F(bVar.b, 2);
    }
}
