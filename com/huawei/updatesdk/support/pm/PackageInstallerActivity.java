package com.huawei.updatesdk.support.pm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.updatesdk.a.b.c.b;
import com.huawei.updatesdk.b.d.a;
import com.huawei.updatesdk.fileprovider.UpdateSdkFileProvider;
import java.io.File;
import vigqyno.C0188;
import vigqyno.C0201;

public class PackageInstallerActivity extends Activity {
    private Intent a(Context context, String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || str.contains(C0201.m82(7280)) || str.contains(C0201.m82(7281)) || str.contains(C0201.m82(7282)) || str.contains(C0201.m82(7283)) || str.contains(C0201.m82(7284))) {
            throw new IllegalArgumentException(C0201.m82(7287));
        }
        Intent intent = new Intent();
        intent.setAction(C0201.m82(7285));
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            uri = UpdateSdkFileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + C0201.m82(7286), new File(str));
        } else {
            uri = Uri.fromFile(new File(str));
        }
        intent.setData(uri);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1000 == i) {
            if (i2 == 0) {
                a.a(7, 0);
            } else {
                int i3 = -10004;
                if (intent != null) {
                    i3 = b.a(intent).a(C0201.m82(7288), -10004);
                }
                if (!(i3 == 0 || i3 == 1)) {
                    a.a(4, i3);
                }
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        String r8;
        w30.i(this);
        requestWindowFeature(1);
        com.huawei.updatesdk.a.a.c.h.b.d().a(getWindow());
        super.onCreate(bundle);
        Intent intent = getIntent();
        String r1 = C0201.m82(7289);
        if (intent == null) {
            finish();
            r8 = C0201.m82(7290);
        } else {
            b a = b.a(intent);
            String a2 = a.a(C0201.m82(7291));
            String a3 = a.a(C0201.m82(7292));
            if (TextUtils.isEmpty(a2)) {
                a.a(4, -3);
                finish();
                r8 = C0201.m82(7293);
            } else {
                try {
                    Intent a4 = a(this, a2);
                    a4.putExtra(C0201.m82(7294), true);
                    a4.putExtra(C0201.m82(7295), true);
                    com.huawei.updatesdk.a.a.b.a.a.a.c(r1, C0201.m82(7296) + a2 + C0201.m82(7297) + a3 + C0201.m82(7298) + getTaskId());
                    startActivityForResult(a4, C0188.f18);
                    return;
                } catch (Exception unused) {
                    com.huawei.updatesdk.a.a.b.a.a.a.b(r1, C0201.m82(7299));
                    a.a(4, -2);
                    finish();
                    return;
                }
            }
        }
        com.huawei.updatesdk.a.a.b.a.a.a.b(r1, r8);
    }

    public void onDestroy() {
        w30.k(this);
        finishActivity(C0188.f18);
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
