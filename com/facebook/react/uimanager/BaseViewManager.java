package com.facebook.react.uimanager;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public abstract class BaseViewManager<T extends View, C extends i> extends ViewManager<T, C> implements b<T> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = ((float) Math.sqrt(5.0d));
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 0;
    private static final String STATE_BUSY = null;
    private static final String STATE_CHECKED = null;
    private static final String STATE_EXPANDED = null;
    private static final String STATE_MIXED = null;
    private static j.a sMatrixDecompositionContext = new j.a();
    public static final Map<String, Integer> sStateDescription;
    private static double[] sTransformDecompositionArray = new double[16];

    static {
        C0201.m83(BaseViewManager.class, 435);
        HashMap hashMap = new HashMap();
        sStateDescription = hashMap;
        hashMap.put(C0201.m82(19957), Integer.valueOf(ki0.state_busy_description));
        sStateDescription.put(C0201.m82(19958), Integer.valueOf(ki0.state_expanded_description));
        sStateDescription.put(C0201.m82(19959), Integer.valueOf(ki0.state_collapsed_description));
    }

    private void logUnsupportedPropertyWarning(String str) {
        f60.C(C0201.m82(19960), C0201.m82(19961), getName(), str);
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(q.c(0.0f));
        view.setTranslationY(q.c(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    private static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        throw new IllegalStateException(C0201.m82(19962) + f);
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        sMatrixDecompositionContext.a();
        m0.b(readableArray, sTransformDecompositionArray);
        j.k(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(q.c(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.d[0])));
        view.setTranslationY(q.c(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.d[1])));
        view.setRotation(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.e[2]));
        view.setRotationX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.e[0]));
        view.setRotationY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.e[1]));
        view.setScaleX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.b[0]));
        view.setScaleY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.b[1]));
        double[] dArr = sMatrixDecompositionContext.a;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = -1.0f / f;
            float f3 = c.e().density;
            view.setCameraDistance(sanitizeFloatPropertyValue(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    private void updateViewAccessibility(T t) {
        s.o(t);
    }

    private void updateViewContentDescription(T t) {
        Dynamic dynamic;
        String str = (String) t.getTag(ii0.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t.getTag(ii0.accessibility_state);
        String str2 = (String) t.getTag(ii0.accessibility_hint);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t.getTag(ii0.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(C0201.m82(19963)) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(C0201.m82(19964))) {
                    arrayList.add(t.getContext().getString(ki0.state_mixed_description));
                } else if (nextKey.equals(C0201.m82(19965)) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t.getContext().getString(ki0.state_busy_description));
                } else if (nextKey.equals(C0201.m82(19966)) && dynamic2.getType() == ReadableType.Boolean) {
                    arrayList.add(t.getContext().getString(dynamic2.asBoolean() ? ki0.state_expanded_description : ki0.state_collapsed_description));
                }
            }
        }
        if (readableMap2 != null) {
            String r0 = C0201.m82(19967);
            if (readableMap2.hasKey(r0) && (dynamic = readableMap2.getDynamic(r0)) != null && dynamic.getType() == ReadableType.String) {
                arrayList.add(dynamic.asString());
            }
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (arrayList.size() > 0) {
            t.setContentDescription(TextUtils.join(C0201.m82(19968), arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e.b a = e.a();
        a.b(C0201.m82(19971), e.d(C0201.m82(19969), C0201.m82(19970)));
        return a.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray != null) {
            t.setTag(ii0.accessibility_actions, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "accessibilityHint")
    public void setAccessibilityHint(T t, String str) {
        t.setTag(ii0.accessibility_hint, str);
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t, String str) {
        t.setTag(ii0.accessibility_label, str);
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t, String str) {
        if (str == null || str.equals(C0201.m82(19972))) {
            k3.j0(t, 0);
        } else if (str.equals(C0201.m82(19973))) {
            k3.j0(t, 1);
        } else if (str.equals(C0201.m82(19974))) {
            k3.j0(t, 2);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "accessibilityRole")
    public void setAccessibilityRole(T t, String str) {
        if (str != null) {
            t.setTag(ii0.accessibility_role, s.c.b(str));
        }
    }

    @xj0(name = "accessibilityValue")
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        if (readableMap != null) {
            t.setTag(ii0.accessibility_value, readableMap);
            if (readableMap.hasKey(C0201.m82(19975))) {
                updateViewContentDescription(t);
            }
        }
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning(C0201.m82(19976));
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomRightRadius(T t, float f) {
        logUnsupportedPropertyWarning(C0201.m82(19977));
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderRadius(T t, float f) {
        logUnsupportedPropertyWarning(C0201.m82(19978));
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning(C0201.m82(19979));
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopRightRadius(T t, float f) {
        logUnsupportedPropertyWarning(C0201.m82(19980));
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "elevation")
    public void setElevation(T t, float f) {
        k3.o0(t, q.c(f));
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t, String str) {
        if (str == null || str.equals(C0201.m82(19981))) {
            k3.q0(t, 0);
        } else if (str.equals(C0201.m82(19982))) {
            k3.q0(t, 1);
        } else if (str.equals(C0201.m82(19983))) {
            k3.q0(t, 2);
        } else if (str.equals(C0201.m82(19984))) {
            k3.q0(t, 4);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "nativeID")
    public void setNativeId(T t, String str) {
        t.setTag(ii0.view_tag_native_id, str);
        pk0.e(t);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "rotation")
    @Deprecated
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "testID")
    public void setTestId(T t, String str) {
        t.setTag(ii0.react_test_id, str);
        t.setTag(str);
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "transform")
    public void setTransform(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t, float f) {
        t.setTranslationX(q.c(f));
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t, float f) {
        t.setTranslationY(q.c(f));
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "accessibilityState")
    public void setViewState(T t, ReadableMap readableMap) {
        if (readableMap != null) {
            t.setTag(ii0.accessibility_state, readableMap);
            t.setSelected(false);
            t.setEnabled(true);
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (!nextKey.equals(C0201.m82(19985)) && !nextKey.equals(C0201.m82(19986))) {
                    String r3 = C0201.m82(19987);
                    if (!nextKey.equals(r3) || readableMap.getType(r3) != ReadableType.String) {
                        if (Build.VERSION.SDK_INT >= 21 && t.isAccessibilityFocused()) {
                            t.sendAccessibilityEvent(1);
                        }
                    }
                }
                updateViewContentDescription(t);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.b
    @xj0(name = "zIndex")
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent instanceof e0) {
            ((e0) parent).updateDrawingOrder();
        }
    }
}
