package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import vigqyno.C0201;

@pj0(name = "Clipboard")
public class ClipboardModule extends ContextBaseJavaModule {
    public static final String NAME = null;

    static {
        C0201.m83(ClipboardModule.class, 638);
    }

    public ClipboardModule(Context context) {
        super(context);
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService(C0201.m82(15137));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(15138);
    }

    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            String r2 = C0201.m82(15139);
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                promise.resolve(r2);
                return;
            }
            ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
            promise.resolve(r2 + ((Object) itemAt.getText()));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void setString(String str) {
        getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
    }
}
