package com.levelasquez.androidopensettings;

import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import vigqyno.C0201;

public class AndroidOpenSettings extends ReactContextBaseJavaModule {
    private ReactContext reactContext;

    public AndroidOpenSettings(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void accessibilitySettings() {
        Intent intent = new Intent(C0201.m82(5896));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void airplaneModeSettings() {
        Intent intent = new Intent(C0201.m82(5897));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void apnSettings() {
        Intent intent = new Intent(C0201.m82(5898));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void appDetailsSettings() {
        Intent intent = new Intent(C0201.m82(5899));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.setData(Uri.parse(C0201.m82(5900) + this.reactContext.getPackageName()));
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void appNotificationSettings() {
        Intent intent = new Intent(C0201.m82(5901));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.putExtra(C0201.m82(5902), this.reactContext.getPackageName());
        intent.putExtra(C0201.m82(5903), this.reactContext.getApplicationInfo().uid);
        intent.putExtra(C0201.m82(5904), this.reactContext.getPackageName());
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void applicationSettings() {
        Intent intent = new Intent(C0201.m82(5905));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void bluetoothSettings() {
        Intent intent = new Intent(C0201.m82(5906));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void dateSettings() {
        Intent intent = new Intent(C0201.m82(5907));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void deviceInfoSettings() {
        Intent intent = new Intent(C0201.m82(5908));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void displaySettings() {
        Intent intent = new Intent(C0201.m82(5909));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void generalSettings() {
        Intent intent = new Intent(C0201.m82(5910));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(5911);
    }

    @ReactMethod
    public void homeSettings() {
        Intent intent = new Intent(C0201.m82(5912));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void inputMethodSettings() {
        Intent intent = new Intent(C0201.m82(5913));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void internalStorageSettings() {
        Intent intent = new Intent(C0201.m82(5914));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void localeSettings() {
        Intent intent = new Intent(C0201.m82(5915));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void locationSourceSettings() {
        Intent intent = new Intent(C0201.m82(5916));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void memoryCardSettings() {
        Intent intent = new Intent(C0201.m82(5917));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void securitySettings() {
        Intent intent = new Intent(C0201.m82(5918));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void wifiSettings() {
        Intent intent = new Intent(C0201.m82(5919));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void wirelessSettings() {
        Intent intent = new Intent(C0201.m82(5920));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }
}
