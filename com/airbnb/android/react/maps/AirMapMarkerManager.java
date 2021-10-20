package com.airbnb.android.react.maps;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.o;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

public class AirMapMarkerManager extends ViewGroupManager<g> {
    private static final int ANIMATE_MARKER_TO_COORDINATE = 0;
    private static final int HIDE_INFO_WINDOW = 0;
    private static final int REDRAW = 0;
    private static final int SHOW_INFO_WINDOW = 0;
    private Map<String, a> sharedIcons = new ConcurrentHashMap();

    public static class a {
        private com.google.android.gms.maps.model.a a;
        private Bitmap b;
        private Map<g, Boolean> c = new WeakHashMap();
        private boolean d = false;

        public synchronized void a(g gVar) {
            this.c.put(gVar, Boolean.TRUE);
            if (this.a != null) {
                gVar.y(this.a, this.b);
            }
        }

        public synchronized boolean b() {
            return this.c.isEmpty();
        }

        public synchronized void c(g gVar) {
            this.c.remove(gVar);
        }

        public synchronized boolean d() {
            if (this.d) {
                return false;
            }
            this.d = true;
            return true;
        }

        public synchronized void e(com.google.android.gms.maps.model.a aVar, Bitmap bitmap) {
            this.a = aVar;
            this.b = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (!this.c.isEmpty()) {
                for (Map.Entry<g, Boolean> entry : this.c.entrySet()) {
                    if (entry.getKey() != null) {
                        entry.getKey().y(aVar, bitmap);
                    }
                }
            }
        }
    }

    static {
        C0201.m83(AirMapMarkerManager.class, 367);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e.g(C0201.m82(20736), 1, C0201.m82(20737), 2, C0201.m82(20738), 3, C0201.m82(20739), 4);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(20740);
        Map d = e.d(r0, C0201.m82(20741));
        Map d2 = e.d(r0, C0201.m82(20742));
        String r1 = C0201.m82(20743);
        Map d3 = e.d(r0, r1);
        String r12 = C0201.m82(20744);
        Map d4 = e.d(r0, r12);
        String r13 = C0201.m82(20745);
        Map h = e.h(C0201.m82(20746), d, C0201.m82(20747), d2, C0201.m82(20748), d3, C0201.m82(20749), d4, C0201.m82(20750), e.d(r0, r13));
        h.putAll(e.f(C0201.m82(20751), e.d(r0, r1), C0201.m82(20752), e.d(r0, r12), C0201.m82(20753), e.d(r0, r13)));
        return h;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(20754);
    }

    public a getSharedIcon(String str) {
        a aVar = this.sharedIcons.get(str);
        if (aVar == null) {
            synchronized (this) {
                aVar = this.sharedIcons.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.sharedIcons.put(str, aVar);
                }
            }
        }
        return aVar;
    }

    public void removeSharedIconIfEmpty(String str) {
        a aVar = this.sharedIcons.get(str);
        if (aVar != null && !aVar.b()) {
            synchronized (this) {
                a aVar2 = this.sharedIcons.get(str);
                if (aVar2 != null && !aVar2.b()) {
                    this.sharedIcons.remove(str);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018  */
    @xj0(name = "anchor")
    public void setAnchor(g gVar, ReadableMap readableMap) {
        double d;
        double d2;
        if (readableMap != null) {
            String r0 = C0201.m82(20757);
            if (readableMap.hasKey(r0)) {
                d = readableMap.getDouble(r0);
                if (readableMap != null) {
                    String r2 = C0201.m82(20758);
                    if (readableMap.hasKey(r2)) {
                        d2 = readableMap.getDouble(r2);
                        gVar.w(d, d2);
                    }
                }
                d2 = 1.0d;
                gVar.w(d, d2);
            }
        }
        d = 0.5d;
        if (readableMap != null) {
        }
        d2 = 1.0d;
        gVar.w(d, d2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018  */
    @xj0(name = "calloutAnchor")
    public void setCalloutAnchor(g gVar, ReadableMap readableMap) {
        double d;
        double d2;
        if (readableMap != null) {
            String r0 = C0201.m82(20759);
            if (readableMap.hasKey(r0)) {
                d = readableMap.getDouble(r0);
                if (readableMap != null) {
                    String r2 = C0201.m82(20760);
                    if (readableMap.hasKey(r2)) {
                        d2 = readableMap.getDouble(r2);
                        gVar.x(d, d2);
                    }
                }
                d2 = 0.0d;
                gVar.x(d, d2);
            }
        }
        d = 0.5d;
        if (readableMap != null) {
        }
        d2 = 0.0d;
        gVar.x(d, d2);
    }

    @xj0(name = "coordinate")
    public void setCoordinate(g gVar, ReadableMap readableMap) {
        gVar.setCoordinate(readableMap);
    }

    @xj0(name = "description")
    public void setDescription(g gVar, String str) {
        gVar.setSnippet(str);
    }

    @xj0(defaultBoolean = false, name = "draggable")
    public void setDraggable(g gVar, boolean z) {
        gVar.setDraggable(z);
    }

    @xj0(defaultBoolean = false, name = "flat")
    public void setFlat(g gVar, boolean z) {
        gVar.setFlat(z);
    }

    @xj0(name = "icon")
    public void setIcon(g gVar, String str) {
        gVar.setImage(str);
    }

    @xj0(name = "identifier")
    public void setIdentifier(g gVar, String str) {
        gVar.setIdentifier(str);
    }

    @xj0(name = "image")
    public void setImage(g gVar, String str) {
        gVar.setImage(str);
    }

    @xj0(defaultFloat = 0.0f, name = "rotation")
    public void setMarkerRotation(g gVar, float f) {
        gVar.setRotation(f);
    }

    @xj0(customType = "Color", defaultInt = -65536, name = "pinColor")
    public void setPinColor(g gVar, int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        gVar.setMarkerHue(fArr[0]);
    }

    @xj0(name = "title")
    public void setTitle(g gVar, String str) {
        gVar.setTitle(str);
    }

    @xj0(defaultBoolean = true, name = "tracksViewChanges")
    public void setTracksViewChanges(g gVar, boolean z) {
        gVar.setTracksViewChanges(z);
    }

    public void addView(g gVar, View view, int i) {
        if (view instanceof a) {
            gVar.setCalloutView((a) view);
            return;
        }
        super.addView((ViewGroup) gVar, view, i);
        gVar.A(true);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new u();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(k0 k0Var) {
        return new g(k0Var, this);
    }

    public void receiveCommand(g gVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            ((o) gVar.getFeature()).r();
        } else if (i == 2) {
            ((o) gVar.getFeature()).d();
        } else if (i == 3) {
            ReadableMap map = readableArray.getMap(0);
            gVar.o(new LatLng(Double.valueOf(map.getDouble(C0201.m82(20756))).doubleValue(), Double.valueOf(map.getDouble(C0201.m82(20755))).doubleValue()), Integer.valueOf(readableArray.getInt(1)));
        } else if (i == 4) {
            gVar.C();
        }
    }

    public void removeViewAt(g gVar, int i) {
        super.removeViewAt((ViewGroup) gVar, i);
        gVar.A(true);
    }

    @xj0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(g gVar, float f) {
        super.setOpacity((View) gVar, f);
        gVar.setOpacity(f);
    }

    @xj0(defaultFloat = 0.0f, name = "zIndex")
    public void setZIndex(g gVar, float f) {
        super.setZIndex((View) gVar, f);
        gVar.setZIndex(Math.round(f));
    }

    public void updateExtraData(g gVar, Object obj) {
        HashMap hashMap = (HashMap) obj;
        gVar.z((int) ((Float) hashMap.get(C0201.m82(20761))).floatValue(), (int) ((Float) hashMap.get(C0201.m82(20762))).floatValue());
    }
}
