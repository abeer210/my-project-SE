package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import vigqyno.C0201;

public class PlayCoreDialogWrapperActivity extends Activity {
    private ResultReceiver a;

    public static void a(Context context) {
        ty1.a(context.getPackageManager(), new ComponentName(context.getPackageName(), C0201.m82(24178)), 1);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.a) != null) {
            if (i2 == -1) {
                bundle = new Bundle();
                i3 = 1;
            } else if (i2 == 0) {
                bundle = new Bundle();
                i3 = 2;
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        String r0 = C0201.m82(24179);
        if (bundle == null) {
            this.a = (ResultReceiver) getIntent().getParcelableExtra(r0);
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get(C0201.m82(24180))).getIntentSender(), 0, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.a;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.a = (ResultReceiver) bundle.getParcelable(r0);
        }
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

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable(C0201.m82(24181), this.a);
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
