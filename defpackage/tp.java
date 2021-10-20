package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: tp  reason: default package */
/* compiled from: JpegMetadataReader */
public class tp {
    public static final Iterable<wp> a = Arrays.asList(new gx(), new ax(), new sw(), new vw(), new vs(), new m10(), new iw(), new u00(), new q00(), new ow(), new ds(), new dx(), new fx());

    public static void a(wr wrVar, InputStream inputStream, Iterable<wp> iterable) throws up, IOException {
        if (iterable == null) {
            iterable = a;
        }
        HashSet hashSet = new HashSet();
        for (wp wpVar : iterable) {
            for (yp ypVar : wpVar.b()) {
                hashSet.add(ypVar);
            }
        }
        b(wrVar, iterable, xp.a(new pr(inputStream), hashSet));
    }

    public static void b(wr wrVar, Iterable<wp> iterable, vp vpVar) {
        for (wp wpVar : iterable) {
            for (yp ypVar : wpVar.b()) {
                wpVar.a(vpVar.e(ypVar), wrVar, ypVar);
            }
        }
    }

    public static wr c(InputStream inputStream) throws up, IOException {
        return d(inputStream, null);
    }

    public static wr d(InputStream inputStream, Iterable<wp> iterable) throws up, IOException {
        wr wrVar = new wr();
        a(wrVar, inputStream, iterable);
        return wrVar;
    }
}
