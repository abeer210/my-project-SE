package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.g;
import vigqyno.C0201;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    private int a = 0;

    public static PendingIntent a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, b(context, pendingIntent, i, true), 134217728);
    }

    public static Intent b(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra(C0201.m82(29148), pendingIntent);
        intent.putExtra(C0201.m82(29149), i);
        intent.putExtra(C0201.m82(29150), z);
        return intent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra(C0201.m82(29151), true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                g m = g.m(this);
                if (i2 == -1) {
                    m.B();
                } else if (i2 == 0) {
                    m.h(new vo0(13, null), getIntent().getIntExtra(C0201.m82(29152), -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt(C0201.m82(29153));
        }
        if (this.a != 1) {
            Bundle extras = getIntent().getExtras();
            String r1 = C0201.m82(29154);
            if (extras == null) {
                Log.e(r1, C0201.m82(29155));
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get(C0201.m82(29156));
            Integer num = (Integer) extras.get(C0201.m82(29157));
            if (pendingIntent == null && num == null) {
                Log.e(r1, C0201.m82(29158));
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.a = 1;
                } catch (IntentSender.SendIntentException e) {
                    Log.e(r1, C0201.m82(29159), e);
                    finish();
                }
            } else {
                yo0.q().s(this, num.intValue(), 2, this);
                this.a = 1;
            }
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

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(C0201.m82(29160), this.a);
        super.onSaveInstanceState(bundle);
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
