package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g53  reason: default package */
/* compiled from: CMSEnvelopedHelper */
public class g53 {

    /* renamed from: g53$a */
    /* compiled from: CMSEnvelopedHelper */
    static class a implements k53 {
        private j53 a;

        public a(o43 o43, j53 j53) {
            this.a = j53;
        }

        @Override // defpackage.k53
        public InputStream a() throws IOException, h53 {
            return this.a.a();
        }
    }

    public static d63 a(x03 x03, o43 o43, k53 k53) {
        return b(x03, o43, k53, null);
    }

    public static d63 b(x03 x03, o43 o43, k53 k53, c53 c53) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != x03.size(); i++) {
            c(arrayList, v33.i(x03.u(i)), o43, k53, c53);
        }
        return new d63(arrayList);
    }

    private static void c(List list, v33 v33, o43 o43, k53 k53, c53 c53) {
        g03 g = v33.g();
        if (g instanceof m33) {
            list.add(new v53((m33) g, o43, k53, c53));
        } else if (g instanceof j33) {
            list.add(new p53((j33) g, o43, k53, c53));
        } else if (g instanceof l33) {
            s53.h(list, (l33) g, o43, k53, c53);
        } else if (g instanceof s33) {
            list.add(new z53((s33) g, o43, k53, c53));
        }
    }
}
