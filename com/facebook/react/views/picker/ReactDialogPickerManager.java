package com.facebook.react.views.picker;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import vigqyno.C0201;

@pj0(name = "AndroidDialogPicker")
public class ReactDialogPickerManager extends ReactPickerManager implements rk0<a> {
    public static final String REACT_CLASS = null;
    private final y0<a> mDelegate = new qk0(this);

    static {
        C0201.m83(ReactDialogPickerManager.class, 514);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(2308);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, java.lang.Integer] */
    @Override // defpackage.rk0
    @xj0(customType = "Color", name = "color")
    public /* bridge */ /* synthetic */ void setColor(a aVar, Integer num) {
        super.setColor(aVar, num);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, boolean] */
    @Override // defpackage.rk0
    @xj0(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(a aVar, boolean z) {
        super.setEnabled(aVar, z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, com.facebook.react.bridge.ReadableArray] */
    @Override // defpackage.rk0
    @xj0(name = "items")
    public /* bridge */ /* synthetic */ void setItems(a aVar, ReadableArray readableArray) {
        super.setItems(aVar, readableArray);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, java.lang.String] */
    @Override // defpackage.rk0
    @xj0(name = "prompt")
    public /* bridge */ /* synthetic */ void setPrompt(a aVar, String str) {
        super.setPrompt(aVar, str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, int] */
    @Override // defpackage.rk0
    @xj0(name = "selected")
    public /* bridge */ /* synthetic */ void setSelected(a aVar, int i) {
        super.setSelected(aVar, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        return new a(k0Var, 0);
    }

    public void setBackgroundColor(a aVar, Integer num) {
        aVar.setStagedBackgroundColor(num);
    }
}
