package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: vp  reason: default package */
/* compiled from: JpegSegmentData */
public class vp {
    private final HashMap<Byte, List<byte[]>> a = new HashMap<>(10);

    private List<byte[]> b(byte b) {
        if (this.a.containsKey(Byte.valueOf(b))) {
            return this.a.get(Byte.valueOf(b));
        }
        ArrayList arrayList = new ArrayList();
        this.a.put(Byte.valueOf(b), arrayList);
        return arrayList;
    }

    private List<byte[]> c(byte b) {
        return this.a.get(Byte.valueOf(b));
    }

    public void a(byte b, byte[] bArr) {
        b(b).add(bArr);
    }

    public Iterable<byte[]> d(byte b) {
        List<byte[]> c = c(b);
        return c == null ? new ArrayList() : c;
    }

    public Iterable<byte[]> e(yp ypVar) {
        return d(ypVar.a);
    }
}
