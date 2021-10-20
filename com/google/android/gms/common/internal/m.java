package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class m {
    private final SparseIntArray a = new SparseIntArray();
    private zo0 b;

    public m(zo0 zo0) {
        u.k(zo0);
        this.b = zo0;
    }

    public void a() {
        this.a.clear();
    }

    public int b(Context context, a.f fVar) {
        u.k(context);
        u.k(fVar);
        int i = 0;
        if (!fVar.o()) {
            return 0;
        }
        int p = fVar.p();
        int i2 = this.a.get(p, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.a.keyAt(i3);
            if (keyAt > p && this.a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.b.j(context, p);
        }
        this.a.put(p, i);
        return i;
    }
}
