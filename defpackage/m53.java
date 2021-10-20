package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: m53  reason: default package */
/* compiled from: CMSUtils */
public class m53 {
    private static final Set<String> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(C0201.m82(10284));
        a.add(C0201.m82(10285));
        a.add(c43.a.u());
        a.add(d43.j.u());
        a.add(d43.j.u());
        a.add(d43.Q.u());
    }

    private static e33 a(l03 l03) throws h53 {
        String r0 = C0201.m82(10286);
        try {
            return e33.i(l03.s());
        } catch (IOException e) {
            throw new h53(C0201.m82(10287), e);
        } catch (ClassCastException e2) {
            throw new h53(r0, e2);
        } catch (IllegalArgumentException e3) {
            throw new h53(r0, e3);
        }
    }

    public static e33 b(byte[] bArr) throws h53 {
        return a(new l03(bArr));
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        return sb3.b(inputStream);
    }
}
