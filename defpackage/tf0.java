package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: tf0  reason: default package */
/* compiled from: DataFetchProducer */
public class tf0 extends hg0 {
    public tf0(r60 r60) {
        super(h50.a(), r60);
    }

    public static byte[] g(String str) {
        z50.b(str.substring(0, 5).equals(C0201.m82(37478)));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        return Uri.decode(substring).getBytes();
    }

    public static boolean h(String str) {
        String r0 = C0201.m82(37479);
        if (!str.contains(r0)) {
            return false;
        }
        String[] split = str.split(r0);
        return split[split.length - 1].equals(C0201.m82(37480));
    }

    @Override // defpackage.hg0
    public af0 d(ih0 ih0) throws IOException {
        byte[] g = g(ih0.q().toString());
        return c(new ByteArrayInputStream(g), g.length);
    }

    @Override // defpackage.hg0
    public String f() {
        return C0201.m82(37481);
    }
}
