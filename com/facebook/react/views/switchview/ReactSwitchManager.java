package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import vigqyno.C0201;

public class ReactSwitchManager extends SimpleViewManager<a> implements bl0<a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = null;
    private final y0<a> mDelegate = new al0(this);

    /* access modifiers changed from: package-private */
    public static class a implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) ((ReactContext) compoundButton.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().v(new b(compoundButton.getId(), z));
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends i implements m {
        private int a;
        private int b;
        private boolean c;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private void b() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.m
        public long a(p pVar, float f, n nVar, float f2, n nVar2) {
            if (!this.c) {
                a aVar = new a(getThemedContext());
                aVar.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.a = aVar.getMeasuredWidth();
                this.b = aVar.getMeasuredHeight();
                this.c = true;
            }
            return o.b(this.a, this.b);
        }

        private b() {
            b();
        }
    }

    static {
        C0201.m83(ReactSwitchManager.class, 470);
    }

    private static void setValueInternal(a aVar, boolean z) {
        aVar.setOnCheckedChangeListener(null);
        aVar.n(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(26649);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.uimanager.SimpleViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, n nVar, float f2, n nVar2, int[] iArr) {
        a aVar = new a(context);
        aVar.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return o.a(q.a((float) aVar.getMeasuredWidth()), q.a((float) aVar.getMeasuredHeight()));
    }

    public void setNativeValue(a aVar, boolean z) {
    }

    public void addEventEmitters(k0 k0Var, a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.SimpleViewManager
    public i createShadowNodeInstance() {
        return new b(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        a aVar = new a(k0Var);
        aVar.setShowText(false);
        return aVar;
    }

    public void receiveCommand(a aVar, String str, ReadableArray readableArray) {
        boolean z = false;
        if (((str.hashCode() == -669744680 && str.equals(C0201.m82(26650))) ? (char) 0 : 65535) == 0) {
            if (readableArray != null && readableArray.getBoolean(0)) {
                z = true;
            }
            setValueInternal(aVar, z);
        }
    }

    @xj0(defaultBoolean = false, name = "disabled")
    public void setDisabled(a aVar, boolean z) {
        aVar.setEnabled(!z);
    }

    @xj0(defaultBoolean = true, name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @xj0(name = "on")
    public void setOn(a aVar, boolean z) {
        setValueInternal(aVar, z);
    }

    @xj0(customType = "Color", name = "thumbColor")
    public void setThumbColor(a aVar, Integer num) {
        aVar.o(num);
    }

    @xj0(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @xj0(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(a aVar, Integer num) {
        aVar.r(num);
    }

    @xj0(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(a aVar, Integer num) {
        aVar.s(num);
    }

    @xj0(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(a aVar, Integer num) {
        aVar.p(num);
    }

    @xj0(name = "value")
    public void setValue(a aVar, boolean z) {
        setValueInternal(aVar, z);
    }
}
