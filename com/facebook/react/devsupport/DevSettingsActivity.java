package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class DevSettingsActivity extends PreferenceActivity {
    public void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(ki0.catalyst_settings_title));
        addPreferencesFromResource(mi0.rn_dev_preferences);
    }

    public /* synthetic */ void onDestroy() {
        w30.k(this);
        super.onDestroy();
    }

    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    public /* synthetic */ void onStop() {
        w30.D(this);
        super.onStop();
    }
}
