package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import vigqyno.C0201;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    private final String a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    private final void b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
        sb.append(C0201.m82(35328));
        sb.append(str);
        sb.append(C0201.m82(35329));
        try {
            startActivity(new Intent(C0201.m82(35330)).setData(Uri.parse(sb.toString())).setPackage(C0201.m82(35331)));
        } catch (ActivityNotFoundException e) {
            new gy1(PlayCoreMissingSplitsActivity.class.getName()).d(e, C0201.m82(35332), str);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            b(getPackageName());
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle(C0201.m82(35333)).setCancelable(false).setNeutralButton(C0201.m82(35334), this);
        boolean a = uy1.a(this);
        String r1 = C0201.m82(35335);
        if (a) {
            String a2 = a();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 91);
            sb.append(r1);
            sb.append(a2);
            sb.append(C0201.m82(35336));
            neutralButton.setMessage(sb.toString()).setPositiveButton(C0201.m82(35337), this);
        } else {
            String a3 = a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 87);
            sb2.append(r1);
            sb2.append(a3);
            sb2.append(C0201.m82(35338));
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
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
