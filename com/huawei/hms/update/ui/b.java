package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: AbstractDialog */
public abstract class b {
    private AlertDialog a;
    private a b;

    private static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(C0201.m82(35416), null, null);
    }

    public abstract AlertDialog a();

    public void b() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    public void c() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void d() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void e() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public Activity f() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public int g() {
        return (a(f()) == 0 || Build.VERSION.SDK_INT < 16) ? 3 : 0;
    }

    public void a(a aVar) {
        this.b = aVar;
        if (f() == null || f().isFinishing()) {
            HMSLog.e(C0201.m82(35417), C0201.m82(35418));
            return;
        }
        AlertDialog a2 = a();
        this.a = a2;
        a2.setCanceledOnTouchOutside(false);
        this.a.setOnCancelListener(new DialogInterface.OnCancelListener() {
            /* class com.huawei.hms.update.ui.b.AnonymousClass1 */

            public void onCancel(DialogInterface dialogInterface) {
                b.this.d();
            }
        });
        this.a.show();
    }
}
