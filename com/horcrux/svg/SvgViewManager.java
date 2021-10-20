package com.horcrux.svg;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.f;
import vigqyno.C0201;

public class SvgViewManager extends ReactViewManager {
    private static final String REACT_CLASS = null;
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();
    private static final SparseArray<e0> mTagToSvgView = new SparseArray<>();

    static {
        C0201.m83(SvgViewManager.class, 573);
    }

    public static e0 getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    public static void setSvgView(int i, e0 e0Var) {
        mTagToSvgView.put(i, e0Var);
        Runnable runnable = mTagToRunnable.get(i);
        if (runnable != null) {
            runnable.run();
            mTagToRunnable.delete(i);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(22228);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @xj0(name = "align")
    public void setAlign(e0 e0Var, String str) {
        e0Var.setAlign(str);
    }

    @xj0(name = "bbHeight")
    public void setBbHeight(e0 e0Var, Dynamic dynamic) {
        e0Var.setBbHeight(dynamic);
    }

    @xj0(name = "bbWidth")
    public void setBbWidth(e0 e0Var, Dynamic dynamic) {
        e0Var.setBbWidth(dynamic);
    }

    @xj0(name = "color")
    public void setColor(e0 e0Var, Integer num) {
        e0Var.setTintColor(num);
    }

    @xj0(name = "meetOrSlice")
    public void setMeetOrSlice(e0 e0Var, int i) {
        e0Var.setMeetOrSlice(i);
    }

    @xj0(name = "minX")
    public void setMinX(e0 e0Var, float f) {
        e0Var.setMinX(f);
    }

    @xj0(name = "minY")
    public void setMinY(e0 e0Var, float f) {
        e0Var.setMinY(f);
    }

    @xj0(name = "tintColor")
    public void setTintColor(e0 e0Var, Integer num) {
        e0Var.setTintColor(num);
    }

    @xj0(name = "vbHeight")
    public void setVbHeight(e0 e0Var, float f) {
        e0Var.setVbHeight(f);
    }

    @xj0(name = "vbWidth")
    public void setVbWidth(e0 e0Var, float f) {
        e0Var.setVbWidth(f);
    }

    public void onDropViewInstance(f fVar) {
        super.onDropViewInstance((View) fVar);
        mTagToSvgView.remove(fVar.getId());
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public e0 createViewInstance(k0 k0Var) {
        return new e0(k0Var);
    }

    public void updateExtraData(f fVar, Object obj) {
        super.updateExtraData((ViewGroup) fVar, obj);
        fVar.invalidate();
    }
}
