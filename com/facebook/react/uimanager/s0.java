package com.facebook.react.uimanager;

import com.facebook.react.common.e;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: UIManagerModuleConstantsHelper */
public class s0 {
    public static Map<String, Object> a(UIManagerModule.g gVar) {
        Map<String, Object> b = r0.b();
        b.put(C0201.m82(14197), gVar.a());
        b.put(C0201.m82(14198), Boolean.TRUE);
        return b;
    }

    public static Map<String, Object> b(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> b = r0.b();
        Map<? extends String, ? extends Object> a = r0.a();
        Map<? extends String, ? extends Object> c = r0.c();
        if (map != null) {
            map.putAll(a);
        }
        if (map2 != null) {
            map2.putAll(c);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            b.AbstractC0053b a2 = b.a(0, C0201.m82(14199));
            a2.b(C0201.m82(14200), name);
            a2.b(C0201.m82(14201), Boolean.FALSE);
            a2.c();
            try {
                Map<String, Object> c2 = c(viewManager, null, null, map, map2);
                if (!c2.isEmpty()) {
                    b.put(name, c2);
                }
            } finally {
                b.b(0);
            }
        }
        b.put(C0201.m82(14202), a);
        b.put(C0201.m82(14203), c);
        return b;
    }

    public static Map<String, Object> c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap b = e.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        String r2 = C0201.m82(14204);
        if (exportedCustomBubblingEventTypeConstants != null) {
            e(map3, exportedCustomBubblingEventTypeConstants);
            e(exportedCustomBubblingEventTypeConstants, map);
            b.put(r2, exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            b.put(r2, map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        String r6 = C0201.m82(14205);
        if (exportedCustomDirectEventTypeConstants != null) {
            e(map4, exportedCustomDirectEventTypeConstants);
            e(exportedCustomDirectEventTypeConstants, map2);
            b.put(r6, exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            b.put(r6, map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            b.put(C0201.m82(14206), exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            b.put(C0201.m82(14207), commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            b.put(C0201.m82(14208), nativeProps);
        }
        return b;
    }

    public static Map<String, Object> d() {
        return e.e(C0201.m82(14209), r0.a(), C0201.m82(14210), r0.c());
    }

    private static void e(Map map, Map map2) {
        if (!(map == null || map2 == null || map2.isEmpty())) {
            for (Object obj : map2.keySet()) {
                Object obj2 = map2.get(obj);
                Object obj3 = map.get(obj);
                if (obj3 == null || !(obj2 instanceof Map) || !(obj3 instanceof Map)) {
                    map.put(obj, obj2);
                } else {
                    e((Map) obj3, (Map) obj2);
                }
            }
        }
    }
}
