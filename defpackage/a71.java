package defpackage;

import android.util.Log;
import vigqyno.C0201;

/* renamed from: a71  reason: default package */
public final class a71 extends y61<Boolean> {
    public a71(f71 f71, String str, Boolean bool) {
        super(f71, str, bool, null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.y61
    public final /* synthetic */ Boolean j(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (l61.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (l61.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String n = super.n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 28 + String.valueOf(valueOf).length());
        sb.append(C0201.m82(21638));
        sb.append(n);
        sb.append(C0201.m82(21639));
        sb.append(valueOf);
        Log.e(C0201.m82(21640), sb.toString());
        return null;
    }
}
