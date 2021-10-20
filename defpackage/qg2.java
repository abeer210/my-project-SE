package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: qg2  reason: default package */
/* compiled from: InterpolationParser */
public class qg2 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    public static yf2 a(JSONObject jSONObject, String str) {
        char c;
        String optString = jSONObject.optString(str, C0201.m82(23800));
        int hashCode = optString.hashCode();
        if (hashCode != -1354466595) {
            if (hashCode != -1263948740) {
                if (hashCode == 475910905 && optString.equals(C0201.m82(23801))) {
                    c = 1;
                    if (c != 0) {
                        return yf2.DECELERATE;
                    }
                    if (c == 1) {
                        return yf2.ACCELERATE_DECELERATE;
                    }
                    if (c != 2) {
                        return yf2.DEFAULT;
                    }
                    return yf2.ACCELERATE;
                }
            } else if (optString.equals(C0201.m82(23802))) {
                c = 0;
                if (c != 0) {
                }
            }
        } else if (optString.equals(C0201.m82(23803))) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}
