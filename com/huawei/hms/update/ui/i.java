package com.huawei.hms.update.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;
import vigqyno.C0201;

/* compiled from: InstallConfirm */
public class i extends b {
    private String a = ResourceLoaderUtil.getString(C0201.m82(35652));

    @Override // com.huawei.hms.update.ui.b
    public AlertDialog a() {
        int stringId = ResourceLoaderUtil.getStringId(C0201.m82(35653));
        int stringId2 = ResourceLoaderUtil.getStringId(C0201.m82(35654));
        AlertDialog.Builder builder = new AlertDialog.Builder(f(), g());
        builder.setMessage(f().getString(stringId, new Object[]{this.a}));
        builder.setPositiveButton(stringId2, new DialogInterface.OnClickListener() {
            /* class com.huawei.hms.update.ui.i.AnonymousClass1 */

            public void onClick(DialogInterface dialogInterface, int i) {
                i.this.e();
            }
        });
        builder.setNegativeButton(ResourceLoaderUtil.getStringId(C0201.m82(35655)), new DialogInterface.OnClickListener() {
            /* class com.huawei.hms.update.ui.i.AnonymousClass2 */

            public void onClick(DialogInterface dialogInterface, int i) {
                i.this.b();
            }
        });
        return builder.create();
    }

    public void a(String str) {
        this.a = str;
    }
}
