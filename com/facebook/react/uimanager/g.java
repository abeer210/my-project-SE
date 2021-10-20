package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* compiled from: IllegalViewOperationException */
public class g extends JSApplicationCausedNativeException {
    private View a;

    public g(String str) {
        super(str);
    }

    public g(String str, View view, Throwable th) {
        super(str, th);
        this.a = view;
    }
}
