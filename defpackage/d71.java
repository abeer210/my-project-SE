package defpackage;

import android.util.Log;
import vigqyno.C0201;

/* renamed from: d71  reason: default package */
public final class d71 extends y61<Double> {
    public d71(f71 f71, String str, Double d) {
        super(f71, str, d, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final Double j(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String n = super.n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 27 + String.valueOf(valueOf).length());
        sb.append(C0201.m82(102));
        sb.append(n);
        sb.append(C0201.m82(103));
        sb.append(valueOf);
        Log.e(C0201.m82(104), sb.toString());
        return null;
    }
}
