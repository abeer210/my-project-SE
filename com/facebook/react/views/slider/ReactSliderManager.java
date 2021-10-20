package com.facebook.react.views.slider;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.e;
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
import defpackage.w3;
import java.util.Map;
import vigqyno.C0201;

public class ReactSliderManager extends SimpleViewManager<a> implements hl0<a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = null;
    private static final int STYLE = 0;
    public static b sAccessibilityDelegate = new b();
    private final y0<a> mDelegate = new gl0(this);

    /* access modifiers changed from: package-private */
    public static class a implements SeekBar.OnSeekBarChangeListener {
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().v(new b(seekBar.getId(), ((a) seekBar).b(i), z));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().v(new c(seekBar.getId(), ((a) seekBar).b(seekBar.getProgress())));
        }
    }

    /* access modifiers changed from: protected */
    public static class b extends r2 {
        private static boolean n(int i) {
            return i == w3.a.i.b() || i == w3.a.j.b() || i == w3.a.n.b();
        }

        @Override // defpackage.r2
        public boolean j(View view, int i, Bundle bundle) {
            if (n(i)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch((SeekBar) view);
            }
            boolean j = super.j(view, i, bundle);
            if (n(i)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch((SeekBar) view);
            }
            return j;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends i implements m {
        private int a;
        private int b;
        private boolean c;

        public /* synthetic */ c(a aVar) {
            this();
        }

        private void b() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.m
        public long a(p pVar, float f, n nVar, float f2, n nVar2) {
            if (!this.c) {
                a aVar = new a(getThemedContext(), null, 16842875);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.a = aVar.getMeasuredWidth();
                this.b = aVar.getMeasuredHeight();
                this.c = true;
            }
            return o.b(this.a, this.b);
        }

        private c() {
            b();
        }
    }

    static {
        C0201.m83(ReactSliderManager.class, 356);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e.d(C0201.m82(21944), e.d(C0201.m82(21942), C0201.m82(21943)));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(21945);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.uimanager.SimpleViewManager
    public Class getShadowNodeClass() {
        return c.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, n nVar, float f2, n nVar2, int[] iArr) {
        a aVar = new a(context, null, 16842875);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return o.a(q.a((float) aVar.getMeasuredWidth()), q.a((float) aVar.getMeasuredHeight()));
    }

    public void setDisabled(a aVar, boolean z) {
    }

    public void setMaximumTrackImage(a aVar, ReadableMap readableMap) {
    }

    public void setMinimumTrackImage(a aVar, ReadableMap readableMap) {
    }

    public void setThumbImage(a aVar, ReadableMap readableMap) {
    }

    public void setTrackImage(a aVar, ReadableMap readableMap) {
    }

    public void addEventEmitters(k0 k0Var, a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.SimpleViewManager
    public i createShadowNodeInstance() {
        return new c(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        a aVar = new a(k0Var, null, 16842875);
        k3.h0(aVar, sAccessibilityDelegate);
        return aVar;
    }

    @xj0(defaultBoolean = true, name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @xj0(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @xj0(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(a aVar, double d) {
        aVar.setMaxValue(d);
    }

    @xj0(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @xj0(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(a aVar, double d) {
        aVar.setMinValue(d);
    }

    @xj0(defaultDouble = 0.0d, name = "step")
    public void setStep(a aVar, double d) {
        aVar.setStep(d);
    }

    public void setTestID(a aVar, String str) {
        super.setTestId(aVar, str);
    }

    @xj0(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(a aVar, Integer num) {
        if (num == null) {
            aVar.getThumb().clearColorFilter();
        } else {
            aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @xj0(defaultDouble = 0.0d, name = "value")
    public void setValue(a aVar, double d) {
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
