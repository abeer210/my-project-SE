package com.eddieowens.services;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.f;
import com.google.android.gms.location.b;
import com.google.android.gms.location.e;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class BoundaryEventJobIntentService extends f {
    private boolean j(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C0201.m82(9724))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    private void k(Context context, String str, ArrayList<String> arrayList) {
        Intent intent = new Intent(C0201.m82(9725));
        String r1 = C0201.m82(9726);
        intent.putExtra(r1, str);
        String r2 = C0201.m82(9727);
        intent.putExtra(r2, arrayList);
        Bundle bundle = new Bundle();
        bundle.putString(r1, str);
        bundle.putStringArrayList(C0201.m82(9728), intent.getStringArrayListExtra(r2));
        Intent intent2 = new Intent(context, BoundaryEventHeadlessTaskService.class);
        intent2.putExtras(bundle);
        if (Build.VERSION.SDK_INT < 26 || j(context)) {
            context.startService(intent2);
            di0.acquireWakeLockNow(context);
            return;
        }
        context.startForegroundService(intent2);
    }

    @Override // androidx.core.app.f
    public void g(Intent intent) {
        String r0 = C0201.m82(9729);
        Log.i(r0, C0201.m82(9730));
        e a = e.a(intent);
        Log.i(r0, C0201.m82(9731) + a.c());
        if (a.e()) {
            Log.e(r0, C0201.m82(9732) + g40.a(a.b()));
            return;
        }
        int c = a.c();
        if (c == 1) {
            Log.i(r0, C0201.m82(9735));
            ArrayList<String> arrayList = new ArrayList<>();
            for (b bVar : a.d()) {
                arrayList.add(bVar.a());
            }
            k(getApplicationContext(), C0201.m82(9736), arrayList);
        } else if (c == 2) {
            Log.i(r0, C0201.m82(9733));
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (b bVar2 : a.d()) {
                arrayList2.add(bVar2.a());
            }
            k(getApplicationContext(), C0201.m82(9734), arrayList2);
        }
    }
}
