package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: pt0  reason: default package */
public final class pt0 extends kt0<Boolean> {
    public pt0(ut0 ut0, String str, Boolean bool) {
        super(ut0, str, bool, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final Boolean f(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.b, false));
        } catch (ClassCastException e) {
            String r0 = C0201.m82(15682);
            String valueOf = String.valueOf(this.b);
            Log.e(C0201.m82(15683), valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0), e);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.kt0
    public final /* synthetic */ Boolean m(String str) {
        if (f01.c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (f01.d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append(C0201.m82(15684));
        sb.append(str2);
        sb.append(C0201.m82(15685));
        sb.append(str);
        Log.e(C0201.m82(15686), sb.toString());
        return null;
    }
}
