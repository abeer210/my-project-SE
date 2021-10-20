package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: qt0  reason: default package */
public final class qt0 extends kt0<String> {
    public qt0(ut0 ut0, String str, String str2) {
        super(ut0, str, str2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final String f(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.b, null);
        } catch (ClassCastException e) {
            String r1 = C0201.m82(13681);
            String valueOf = String.valueOf(this.b);
            Log.e(C0201.m82(13682), valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1), e);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.kt0
    public final /* synthetic */ String m(String str) {
        return str;
    }
}
