package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.vision.L;
import defpackage.no0;
import vigqyno.C0201;

@Keep
public class VisionClearcutLogger {
    private final no0 zzbw;
    private boolean zzbx = true;

    public VisionClearcutLogger(Context context) {
        this.zzbw = new no0(context, C0201.m82(4272), null);
    }

    public final void zzb(int i, oj1 oj1) {
        int f = oj1.f();
        byte[] bArr = new byte[f];
        hp1.d(oj1, bArr, 0, f);
        if (i < 0 || i > 3) {
            StringBuilder sb = new StringBuilder(31);
            sb.append(C0201.m82(4276));
            sb.append(i);
            String sb2 = sb.toString();
            Object[] objArr = new Object[0];
            if (L.isLoggable(4)) {
                Log.i(C0201.m82(4277), String.format(sb2, objArr));
                return;
            }
            return;
        }
        try {
            if (this.zzbx) {
                no0.a a = this.zzbw.a(bArr);
                a.b(i);
                a.a();
                return;
            }
            oj1 oj12 = new oj1();
            try {
                hp1.b(oj12, bArr);
                L.zzc(C0201.m82(4273), oj12.toString());
            } catch (Exception e) {
                L.zza(e, C0201.m82(4274), new Object[0]);
            }
        } catch (Exception e2) {
            qi1.a(e2);
            L.zza(e2, C0201.m82(4275), new Object[0]);
        }
    }
}
