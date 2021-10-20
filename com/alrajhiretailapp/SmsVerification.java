package com.alrajhiretailapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.api.Status;
import vigqyno.C0201;

public class SmsVerification extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int SMS_CONSENT_REQUEST = 0;
    public BroadcastReceiver broadcastReceiver = null;
    private String message = null;
    private Promise myPromise = null;
    private final ReactApplicationContext reactContext;

    /* access modifiers changed from: package-private */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (C0201.m82(35601).equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (((Status) extras.get(C0201.m82(35602))).o() == 0) {
                    try {
                        SmsVerification.this.reactContext.startActivityForResult((Intent) extras.getParcelable(C0201.m82(35603)), 2, null);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
    }

    static {
        C0201.m83(SmsVerification.class, 658);
    }

    public SmsVerification(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(27018);
    }

    @ReactMethod
    public void getOTPCode(Promise promise) {
        try {
            this.myPromise = promise;
            if (this.broadcastReceiver == null) {
                registerBroadcastReceiver();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            this.message = intent.getStringExtra(C0201.m82(27019));
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(27020), this.message);
            this.myPromise.resolve(createMap);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void registerBroadcastReceiver() {
        if (this.broadcastReceiver == null) {
            this.broadcastReceiver = new a();
            this.reactContext.registerReceiver(this.broadcastReceiver, new IntentFilter(C0201.m82(27021)));
            eo0.a(this.reactContext).t(null);
        }
    }

    @ReactMethod
    public void unRegisterBroadcastReceiver() {
        BroadcastReceiver broadcastReceiver2 = this.broadcastReceiver;
        if (broadcastReceiver2 != null) {
            this.reactContext.unregisterReceiver(broadcastReceiver2);
            this.broadcastReceiver = null;
            this.message = null;
        }
    }
}
