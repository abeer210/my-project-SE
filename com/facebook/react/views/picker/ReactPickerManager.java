package com.facebook.react.views.picker;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.picker.a;
import vigqyno.C0201;

public abstract class ReactPickerManager extends SimpleViewManager<a> {

    /* access modifiers changed from: private */
    public static class a implements a.c {
        private final a a;
        private final d b;

        public a(a aVar, d dVar) {
            this.a = aVar;
            this.b = dVar;
        }

        @Override // com.facebook.react.views.picker.a.c
        public void a(int i) {
            this.b.v(new ql0(this.a.getId(), i));
        }
    }

    @xj0(customType = "Color", name = "color")
    public void setColor(a aVar, Integer num) {
        aVar.setStagedPrimaryTextColor(num);
    }

    @xj0(defaultBoolean = true, name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @xj0(name = "items")
    public void setItems(a aVar, ReadableArray readableArray) {
        aVar.setStagedItems(c.a(readableArray));
    }

    @xj0(name = "prompt")
    public void setPrompt(a aVar, String str) {
        aVar.setPrompt(str);
    }

    @xj0(name = "selected")
    public void setSelected(a aVar, int i) {
        aVar.setStagedSelection(i);
    }

    public void addEventEmitters(k0 k0Var, a aVar) {
        aVar.setOnSelectListener(new a(aVar, ((UIManagerModule) k0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    public void onAfterUpdateTransaction(a aVar) {
        super.onAfterUpdateTransaction((View) aVar);
        aVar.d();
    }

    public void receiveCommand(a aVar, String str, ReadableArray readableArray) {
        if (((str.hashCode() == -729039331 && str.equals(C0201.m82(34841))) ? (char) 0 : 65535) == 0 && readableArray != null) {
            aVar.setImmediateSelection(readableArray.getInt(0));
        }
    }
}
