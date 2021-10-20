package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class c extends Exception {
    private final r0<b<?>, vo0> a;

    public c(r0<b<?>, vo0> r0Var) {
        this.a = r0Var;
    }

    public vo0 a(e<? extends a.d> eVar) {
        b<? extends a.d> b = eVar.b();
        u.b(this.a.get(b) != null, C0201.m82(2770));
        return this.a.get(b);
    }

    public final r0<b<?>, vo0> b() {
        return this.a;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (b<?> bVar : this.a.keySet()) {
            vo0 vo0 = this.a.get(bVar);
            if (vo0.u()) {
                z = false;
            }
            String a2 = bVar.a();
            String valueOf = String.valueOf(vo0);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a2);
            sb.append(C0201.m82(2771));
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append(C0201.m82(2772));
        } else {
            sb2.append(C0201.m82(2773));
        }
        sb2.append(TextUtils.join(C0201.m82(2774), arrayList));
        return sb2.toString();
    }
}
