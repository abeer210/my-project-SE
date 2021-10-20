package defpackage;

import android.content.SharedPreferences;

/* renamed from: h71  reason: default package */
public final /* synthetic */ class h71 implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final e71 a;

    public h71(e71 e71) {
        this.a = e71;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.b(sharedPreferences, str);
    }
}
