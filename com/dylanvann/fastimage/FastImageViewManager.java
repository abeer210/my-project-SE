package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import vigqyno.C0201;

public class FastImageViewManager extends SimpleViewManager<h> implements c {
    private static final String REACT_CLASS = null;
    private static final String REACT_ON_LOAD_START_EVENT = null;
    private static final String REACT_ON_PROGRESS_EVENT = null;
    private static final Map<String, List<h>> VIEWS_FOR_URLS = new WeakHashMap();
    private k requestManager = null;

    static {
        C0201.m83(FastImageViewManager.class, 520);
    }

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof k0)) {
            return null;
        }
        Context baseContext = ((k0) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (!(baseContext instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        if (baseContext2 instanceof Activity) {
            return (Activity) baseContext2;
        }
        return null;
    }

    private static boolean isActivityDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
            return false;
        } else if (activity.isDestroyed() || activity.isFinishing() || activity.isChangingConfigurations()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    private static boolean isValidContextForGlide(Context context) {
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            return false;
        }
        return !isActivityDestroyed(activityFromContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e.b a = e.a();
        String r1 = C0201.m82(33440);
        String r2 = C0201.m82(33441);
        a.b(r2, e.d(r1, r2));
        String r22 = C0201.m82(33442);
        a.b(r22, e.d(r1, r22));
        String r23 = C0201.m82(33443);
        a.b(r23, e.d(r1, r23));
        String r24 = C0201.m82(33444);
        a.b(r24, e.d(r1, r24));
        String r25 = C0201.m82(33445);
        a.b(r25, e.d(r1, r25));
        return a.a();
    }

    @Override // com.dylanvann.fastimage.c
    public float getGranularityPercentage() {
        return 0.5f;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(33446);
    }

    @Override // com.dylanvann.fastimage.c
    public void onProgress(String str, long j, long j2) {
        List<h> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (h hVar : list) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt(C0201.m82(33447), (int) j);
                writableNativeMap.putInt(C0201.m82(33448), (int) j2);
                ((RCTEventEmitter) ((k0) hVar.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(hVar.getId(), C0201.m82(33449), writableNativeMap);
            }
        }
    }

    @xj0(name = "resizeMode")
    public void setResizeMode(h hVar, String str) {
        hVar.setScaleType(f.f(str));
    }

    @xj0(name = "source")
    public void setSrc(h hVar, ReadableMap readableMap) {
        if (readableMap != null) {
            String r0 = C0201.m82(33450);
            if (readableMap.hasKey(r0) && !isNullOrEmpty(readableMap.getString(r0))) {
                e c = f.c(hVar.getContext(), readableMap);
                sj g = c.g();
                hVar.a = g;
                k kVar = this.requestManager;
                if (kVar != null) {
                    kVar.l(hVar);
                }
                String h = g.h();
                b.c(h, this);
                List<h> list = VIEWS_FOR_URLS.get(h);
                if (list != null && !list.contains(hVar)) {
                    list.add(hVar);
                } else if (list == null) {
                    VIEWS_FOR_URLS.put(h, new ArrayList(Collections.singletonList(hVar)));
                }
                k0 k0Var = (k0) hVar.getContext();
                ((RCTEventEmitter) k0Var.getJSModule(RCTEventEmitter.class)).receiveEvent(hVar.getId(), C0201.m82(33451), new WritableNativeMap());
                k kVar2 = this.requestManager;
                if (kVar2 != null) {
                    kVar2.q(c.i()).a(f.d(k0Var, c, readableMap)).E0(new d(h)).C0(hVar);
                    return;
                }
                return;
            }
        }
        k kVar3 = this.requestManager;
        if (kVar3 != null) {
            kVar3.l(hVar);
        }
        sj sjVar = hVar.a;
        if (sjVar != null) {
            b.d(sjVar.h());
        }
        hVar.setImageDrawable(null);
    }

    @xj0(customType = "Color", name = "tintColor")
    public void setTintColor(h hVar, Integer num) {
        if (num == null) {
            hVar.clearColorFilter();
        } else {
            hVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(k0 k0Var) {
        if (isValidContextForGlide(k0Var)) {
            this.requestManager = c.t(k0Var);
        }
        return new h(k0Var);
    }

    public void onDropViewInstance(h hVar) {
        k kVar = this.requestManager;
        if (kVar != null) {
            kVar.l(hVar);
        }
        sj sjVar = hVar.a;
        if (sjVar != null) {
            String sjVar2 = sjVar.toString();
            b.d(sjVar2);
            List<h> list = VIEWS_FOR_URLS.get(sjVar2);
            if (list != null) {
                list.remove(hVar);
                if (list.size() == 0) {
                    VIEWS_FOR_URLS.remove(sjVar2);
                }
            }
        }
        super.onDropViewInstance((View) hVar);
    }
}
