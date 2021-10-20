package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.r;
import com.facebook.yoga.g;
import java.util.Locale;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "RCTView")
public class ReactViewManager extends ReactClippingViewManager<f> {
    private static final int CMD_HOTSPOT_UPDATE = 0;
    private static final int CMD_SET_PRESSED = 0;
    private static final String HOTSPOT_UPDATE_KEY = null;
    public static final String REACT_CLASS = null;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    class a implements View.OnClickListener {
        public final /* synthetic */ f a;

        public a(ReactViewManager reactViewManager, f fVar) {
            this.a = fVar;
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                ((UIManagerModule) ((ReactContext) this.a.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().v(new g(this.a.getId()));
            } finally {
                w30.h();
            }
        }
    }

    static {
        C0201.m83(ReactViewManager.class, 164);
    }

    private void handleHotspotUpdate(f fVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(31258));
        } else if (Build.VERSION.SDK_INT >= 21) {
            fVar.drawableHotspotChanged(q.b(readableArray.getDouble(0)), q.b(readableArray.getDouble(1)));
        }
    }

    private void handleSetPressed(f fVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(31259));
        }
        fVar.setPressed(readableArray.getBoolean(0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e.e(C0201.m82(31260), 1, C0201.m82(31261), 2);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(31262);
    }

    @xj0(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(f fVar, int i) {
        fVar.setNextFocusDownId(i);
    }

    @xj0(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(f fVar, int i) {
        fVar.setNextFocusForwardId(i);
    }

    @xj0(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(f fVar, int i) {
        fVar.setNextFocusLeftId(i);
    }

    @xj0(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(f fVar, int i) {
        fVar.setNextFocusRightId(i);
    }

    @xj0(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(f fVar, int i) {
        fVar.setNextFocusUpId(i);
    }

    @xj0(name = "accessible")
    public void setAccessible(f fVar, boolean z) {
        fVar.setFocusable(z);
    }

    @xj0(name = "backfaceVisibility")
    public void setBackfaceVisibility(f fVar, String str) {
        fVar.setBackfaceVisibility(str);
    }

    @yj0(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(f fVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        fVar.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(f fVar, int i, float f) {
        if (!g.a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!g.a(f)) {
            f = q.c(f);
        }
        if (i == 0) {
            fVar.setBorderRadius(f);
        } else {
            fVar.setBorderRadius(f, i - 1);
        }
    }

    @xj0(name = "borderStyle")
    public void setBorderStyle(f fVar, String str) {
        fVar.setBorderStyle(str);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(f fVar, int i, float f) {
        if (!g.a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!g.a(f)) {
            f = q.c(f);
        }
        fVar.setBorderWidth(SPACING_TYPES[i], f);
    }

    @xj0(name = "collapsable")
    public void setCollapsable(f fVar, boolean z) {
    }

    @xj0(name = "focusable")
    public void setFocusable(f fVar, boolean z) {
        if (z) {
            fVar.setOnClickListener(new a(this, fVar));
            fVar.setFocusable(true);
            return;
        }
        fVar.setOnClickListener(null);
        fVar.setClickable(false);
    }

    @xj0(name = "hitSlop")
    public void setHitSlop(f fVar, ReadableMap readableMap) {
        if (readableMap == null) {
            fVar.setHitSlopRect(null);
            return;
        }
        String r1 = C0201.m82(31265);
        int i = 0;
        int b = readableMap.hasKey(r1) ? (int) q.b(readableMap.getDouble(r1)) : 0;
        String r2 = C0201.m82(31266);
        int b2 = readableMap.hasKey(r2) ? (int) q.b(readableMap.getDouble(r2)) : 0;
        String r4 = C0201.m82(31267);
        int b3 = readableMap.hasKey(r4) ? (int) q.b(readableMap.getDouble(r4)) : 0;
        String r5 = C0201.m82(31268);
        if (readableMap.hasKey(r5)) {
            i = (int) q.b(readableMap.getDouble(r5));
        }
        fVar.setHitSlopRect(new Rect(b, b2, b3, i));
    }

    @xj0(name = "nativeBackgroundAndroid")
    public void setNativeBackground(f fVar, ReadableMap readableMap) {
        fVar.setTranslucentBackgroundDrawable(readableMap == null ? null : c.a(fVar.getContext(), readableMap));
    }

    @xj0(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(f fVar, ReadableMap readableMap) {
        fVar.setForeground(readableMap == null ? null : c.a(fVar.getContext(), readableMap));
    }

    @xj0(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(f fVar, boolean z) {
        fVar.setNeedsOffscreenAlphaCompositing(z);
    }

    @xj0(name = "overflow")
    public void setOverflow(f fVar, String str) {
        fVar.setOverflow(str);
    }

    @xj0(name = "pointerEvents")
    public void setPointerEvents(f fVar, String str) {
        if (str == null) {
            fVar.setPointerEvents(r.AUTO);
        } else {
            fVar.setPointerEvents(r.valueOf(str.toUpperCase(Locale.US).replace(C0201.m82(31269), C0201.m82(31270))));
        }
    }

    @xj0(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(f fVar, boolean z) {
        if (z) {
            fVar.setFocusable(true);
            fVar.setFocusableInTouchMode(true);
            fVar.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(k0 k0Var) {
        return new f(k0Var);
    }

    public void setOpacity(f fVar, float f) {
        fVar.setOpacityIfPossible(f);
    }

    public void setTransform(f fVar, ReadableArray readableArray) {
        super.setTransform((View) fVar, readableArray);
        fVar.setBackfaceVisibilityDependantOpacity();
    }

    public void receiveCommand(f fVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            handleHotspotUpdate(fVar, readableArray);
        } else if (i == 2) {
            handleSetPressed(fVar, readableArray);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    public void receiveCommand(f fVar, String str, ReadableArray readableArray) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1639565984) {
            if (hashCode == -399823752 && str.equals(C0201.m82(31263))) {
                c = 0;
                if (c == 0) {
                    handleHotspotUpdate(fVar, readableArray);
                    return;
                } else if (c == 1) {
                    handleSetPressed(fVar, readableArray);
                    return;
                } else {
                    return;
                }
            }
        } else if (str.equals(C0201.m82(31264))) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }
}
