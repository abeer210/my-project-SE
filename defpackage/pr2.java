package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: pr2  reason: default package */
/* compiled from: Filter */
public abstract class pr2 {
    public static vq2 b(vq2 vq2, int i) {
        tq2 q0 = vq2.q0(ar2.C, ar2.E);
        if (q0 instanceof vq2) {
            return (vq2) q0;
        }
        if (q0 instanceof sq2) {
            sq2 sq2 = (sq2) q0;
            if (i < sq2.size()) {
                return (vq2) sq2.E(i);
            }
        } else if (q0 != null) {
            Log.e(C0201.m82(11154), C0201.m82(11153) + q0.getClass().getName());
        }
        return new vq2();
    }

    public abstract or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException;
}
