package com.huawei.updatesdk.b.d;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.updatesdk.a.b.c.b;
import com.huawei.updatesdk.b.c.c;
import com.huawei.updatesdk.support.pm.PackageInstallerActivity;
import java.io.File;
import vigqyno.C0201;

public class a {
    public static void a(int i, int i2) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt(C0201.m82(1593), i);
        bundle.putInt(C0201.m82(1594), i2);
        intent.putExtras(bundle);
        c.b().c(b.a(intent));
    }

    public static void a(Context context, String str, String str2) {
        a(3, 1);
        File file = new File(str);
        boolean exists = file.exists();
        String r3 = C0201.m82(1595);
        if (!exists || !file.isFile() || file.length() <= 0) {
            com.huawei.updatesdk.a.a.b.a.a.a.b(r3, C0201.m82(1599) + str);
            a(4, -10003);
            return;
        }
        Intent intent = new Intent(context, PackageInstallerActivity.class);
        intent.putExtra(C0201.m82(1596), str);
        intent.putExtra(C0201.m82(1597), str2);
        if (!(context instanceof Activity)) {
            intent.setFlags(402653184);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            a(4, -10002);
            com.huawei.updatesdk.a.a.b.a.a.a.a(r3, C0201.m82(1598), e);
        }
    }
}
