package defpackage;

import android.util.Log;
import vigqyno.C0201;

/* renamed from: b71  reason: default package */
public final class b71 extends y61<Long> {
    public b71(f71 f71, String str, Long l) {
        super(f71, str, l, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final Long j(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String n = super.n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 25 + String.valueOf(valueOf).length());
        sb.append(C0201.m82(19793));
        sb.append(n);
        sb.append(C0201.m82(19794));
        sb.append(valueOf);
        Log.e(C0201.m82(19795), sb.toString());
        return null;
    }
}
