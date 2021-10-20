package com.huawei.hms.rn.location.backend.interfaces;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.content.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class HMSProvider {
    private ActivityHolder activityHolder;
    private Context ctx;
    private EventSender eventSender;
    private PermissionHandler permissionHandler;
    public Map<Integer, PendingIntent> requests = new HashMap();

    public HMSProvider(Context context) {
        this.ctx = context;
    }

    public PendingIntent buildPendingIntent(int i, String str) {
        Intent intent = new Intent();
        intent.setPackage(getActivity().getApplicationContext().getPackageName());
        intent.setAction(str);
        PendingIntent broadcast = PendingIntent.getBroadcast(getActivity().getApplicationContext(), i, intent, 134217728);
        this.requests.put(Integer.valueOf(i), broadcast);
        return broadcast;
    }

    public Activity getActivity() {
        ActivityHolder activityHolder2 = this.activityHolder;
        if (activityHolder2 == null) {
            return null;
        }
        return activityHolder2.getActivity();
    }

    public abstract JSONObject getConstants() throws JSONException;

    public Context getContext() {
        return this.ctx;
    }

    public EventSender getEventSender() {
        return this.eventSender;
    }

    public PermissionHandler getPermissionHandler() {
        return this.permissionHandler;
    }

    public boolean hasPermission(String str) {
        if (Build.VERSION.SDK_INT < 23 || c.c(getContext(), str) == 0) {
            return true;
        }
        return false;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        return false;
    }

    public void requestPermission(int i, String str) {
        requestPermissions(i, new String[]{str});
    }

    public void requestPermissions(int i, String[] strArr) {
        getPermissionHandler().requestPermissions(i, strArr);
    }

    public void setActivityHolder(ActivityHolder activityHolder2) {
        this.activityHolder = activityHolder2;
    }

    public void setEventSender(EventSender eventSender2) {
        this.eventSender = eventSender2;
    }

    public void setPermissionHandler(PermissionHandler permissionHandler2) {
        this.permissionHandler = permissionHandler2;
    }
}
