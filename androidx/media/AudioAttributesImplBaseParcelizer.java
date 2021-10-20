package androidx.media;

import androidx.versionedparcelable.a;

public final class AudioAttributesImplBaseParcelizer {
    public static c read(a aVar) {
        c cVar = new c();
        cVar.a = aVar.p(cVar.a, 1);
        cVar.b = aVar.p(cVar.b, 2);
        cVar.c = aVar.p(cVar.c, 3);
        cVar.d = aVar.p(cVar.d, 4);
        return cVar;
    }

    public static void write(c cVar, a aVar) {
        aVar.x(false, false);
        aVar.F(cVar.a, 1);
        aVar.F(cVar.b, 2);
        aVar.F(cVar.c, 3);
        aVar.F(cVar.d, 4);
    }
}
