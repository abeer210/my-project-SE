package com.merryjs.PhotoViewer;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.k0;
import java.util.ArrayList;
import java.util.Map;
import vigqyno.C0201;

public class MerryPhotoViewManager extends SimpleViewManager<d> {
    public static final String REACT_CLASS = null;
    private Context context;

    class a extends b {
        public a(MerryPhotoViewManager merryPhotoViewManager) {
        }
    }

    static {
        C0201.m83(MerryPhotoViewManager.class, 285);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e.b a2 = e.a();
        String r1 = C0201.m82(2513);
        String r2 = C0201.m82(2514);
        a2.b(r2, e.d(r1, r2));
        String r22 = C0201.m82(2515);
        a2.b(r22, e.d(r1, r22));
        return a2.a();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(2516);
    }

    @xj0(name = "data")
    public void setData(d dVar, ReadableArray readableArray) {
        String r0 = C0201.m82(2517);
        String r1 = C0201.m82(2518);
        String r2 = C0201.m82(2519);
        String r3 = C0201.m82(2520);
        String r4 = C0201.m82(2521);
        b[] bVarArr = new b[0];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            try {
                a aVar = new a(this);
                ReadableMap map = readableArray.getMap(i);
                if (map.hasKey(r4)) {
                    aVar.a = map.getMap(r4);
                }
                if (map.hasKey(r3)) {
                    aVar.c = map.getString(r3);
                }
                if (map.hasKey(r2)) {
                    aVar.e = map.getInt(r2);
                }
                if (map.hasKey(r1)) {
                    aVar.b = map.getString(r1);
                }
                if (map.hasKey(r0)) {
                    aVar.d = map.getInt(r0);
                }
                arrayList.add(aVar);
            } catch (Exception e) {
                Log.e(C0201.m82(2522), e.toString());
            }
        }
        dVar.j((b[]) arrayList.toArray(bVarArr));
    }

    @xj0(defaultBoolean = false, name = "hideCloseButton")
    public void setHideCloseButton(d dVar, Boolean bool) {
        dVar.k(bool.booleanValue());
    }

    @xj0(defaultBoolean = false, name = "hideShareButton")
    public void setHideShareButton(d dVar, Boolean bool) {
        dVar.l(bool.booleanValue());
    }

    @xj0(name = "hideStatusBar")
    public void setHideStatusBar(d dVar, Boolean bool) {
        dVar.m(bool.booleanValue());
    }

    @xj0(defaultBoolean = false, name = "hideTitle")
    public void setHideTitle(d dVar, Boolean bool) {
        dVar.n(bool.booleanValue());
    }

    @xj0(name = "initial")
    public void setInitial(d dVar, int i) {
        dVar.o(i);
    }

    @xj0(name = "shareText")
    public void setShareText(d dVar, String str) {
        dVar.p(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    public void onAfterUpdateTransaction(d dVar) {
        super.onAfterUpdateTransaction((View) dVar);
        dVar.b();
    }

    public void onDropViewInstance(d dVar) {
        super.onDropViewInstance((View) dVar);
    }
}
