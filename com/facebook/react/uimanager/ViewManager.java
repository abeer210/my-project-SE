package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.a0;
import com.facebook.yoga.n;
import java.util.Map;
import vigqyno.C0201;

public abstract class ViewManager<T extends View, C extends a0> extends BaseJavaModule {
    private final T createView(k0 k0Var, tj0 tj0) {
        return createView(k0Var, null, null, tj0);
    }

    public void addEventEmitters(k0 k0Var, T t) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException(C0201.m82(25155));
    }

    public abstract T createViewInstance(k0 k0Var);

    public T createViewInstance(k0 k0Var, c0 c0Var, j0 j0Var) {
        Object updateState;
        T createViewInstance = createViewInstance(k0Var);
        addEventEmitters(k0Var, createViewInstance);
        if (c0Var != null) {
            updateProperties(createViewInstance, c0Var);
        }
        if (!(j0Var == null || (updateState = updateState(createViewInstance, c0Var, j0Var)) == null)) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public y0<T> getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return z0.e(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, n nVar, float f2, n nVar2, int[] iArr) {
        return 0;
    }

    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
    }

    @Deprecated
    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public void receiveCommand(T t, String str, ReadableArray readableArray) {
    }

    public void setPadding(T t, int i, int i2, int i3, int i4) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public Object updateLocalData(T t, c0 c0Var, c0 c0Var2) {
        return null;
    }

    public void updateProperties(T t, c0 c0Var) {
        y0<T> delegate;
        if (!dj0.c || (delegate = getDelegate()) == null) {
            z0.g(this, t, c0Var);
        } else {
            z0.h(delegate, t, c0Var);
        }
        onAfterUpdateTransaction(t);
    }

    public Object updateState(T t, c0 c0Var, j0 j0Var) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    public T createView(k0 k0Var, c0 c0Var, j0 j0Var, tj0 tj0) {
        T createViewInstance = createViewInstance(k0Var, c0Var, j0Var);
        if (createViewInstance instanceof wj0) {
            ((wj0) createViewInstance).setOnInterceptTouchEventListener(tj0);
        }
        return createViewInstance;
    }
}
