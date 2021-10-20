package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: qs2  reason: default package */
/* compiled from: PDFObjectStreamParser */
public class qs2 extends ms2 {
    private List<dr2> c = null;
    private final fr2 d;

    public qs2(fr2 fr2, wq2 wq2) throws IOException {
        super(new ps2(fr2.B1()));
        this.b = wq2;
        this.d = fr2;
    }

    public List<dr2> I() {
        return this.c;
    }

    public void J() throws IOException {
        try {
            int F0 = this.d.F0(C0201.m82(6361));
            ArrayList arrayList = new ArrayList(F0);
            this.c = new ArrayList(F0);
            for (int i = 0; i < F0; i++) {
                B();
                arrayList.add(Long.valueOf((long) C()));
            }
            int i2 = 0;
            while (true) {
                tq2 u = u();
                if (u == null) {
                    break;
                }
                dr2 dr2 = new dr2(u);
                dr2.E(0);
                int size = arrayList.size();
                String r6 = C0201.m82(6362);
                if (i2 >= size) {
                    Log.e(r6, C0201.m82(6363) + F0);
                    break;
                }
                dr2.g0(((Long) arrayList.get(i2)).longValue());
                this.c.add(dr2);
                Log.d(r6, C0201.m82(6364) + dr2);
                if (!this.a.j() && this.a.peek() == 101) {
                    A();
                }
                i2++;
            }
        } finally {
            this.a.close();
        }
    }
}
