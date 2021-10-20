package com.facebook.react.uimanager;

import com.facebook.react.uimanager.a0;
import com.facebook.yoga.h;
import com.facebook.yoga.v;

/* compiled from: ReactShadowNode */
public interface a0<T extends a0> {
    void addChildAt(T t, int i);

    void addNativeChildAt(T t, int i);

    void calculateLayout();

    void calculateLayout(float f, float f2);

    Iterable<? extends a0> calculateLayoutOnChildren();

    void dirty();

    boolean dispatchUpdates(float f, float f2, v0 v0Var, n nVar);

    void dispose();

    T getChildAt(int i);

    int getChildCount();

    Integer getHeightMeasureSpec();

    float getLayoutHeight();

    T getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    l getNativeKind();

    int getNativeOffsetForChild(T t);

    T getNativeParent();

    T getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    v getStyleHeight();

    v getStyleWidth();

    k0 getThemedContext();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasUpdates();

    int indexOf(T t);

    int indexOfNativeChild(T t);

    boolean isDescendantOf(T t);

    boolean isLayoutOnly();

    boolean isVirtual();

    void markUpdateSeen();

    void onBeforeLayout(n nVar);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    T removeChildAt(int i);

    T removeNativeChildAt(int i);

    void setIsLayoutOnly(boolean z);

    void setLayoutDirection(h hVar);

    void setLayoutParent(T t);

    void setLocalData(Object obj);

    void setMeasureSpecs(int i, int i2);

    void setReactTag(int i);

    void setRootTag(int i);

    void setStyleHeight(float f);

    void setStyleWidth(float f);

    void setThemedContext(k0 k0Var);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(c0 c0Var);
}
