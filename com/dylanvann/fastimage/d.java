package com.dylanvann.fastimage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.a;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

/* compiled from: FastImageRequestListener */
public class d implements zn<Drawable> {
    private String a;

    public d(String str) {
        this.a = str;
    }

    private static WritableMap c(Drawable drawable) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(C0201.m82(19274), drawable.getIntrinsicWidth());
        writableNativeMap.putInt(C0201.m82(19275), drawable.getIntrinsicHeight());
        return writableNativeMap;
    }

    @Override // defpackage.zn
    public boolean a(ci ciVar, Object obj, no<Drawable> noVar, boolean z) {
        b.d(this.a);
        if (!(noVar instanceof jo)) {
            return false;
        }
        h hVar = (h) ((jo) noVar).j();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((k0) hVar.getContext()).getJSModule(RCTEventEmitter.class);
        int id = hVar.getId();
        rCTEventEmitter.receiveEvent(id, C0201.m82(19276), new WritableNativeMap());
        rCTEventEmitter.receiveEvent(id, C0201.m82(19277), new WritableNativeMap());
        return false;
    }

    /* renamed from: d */
    public boolean b(Drawable drawable, Object obj, no<Drawable> noVar, a aVar, boolean z) {
        if (!(noVar instanceof jo)) {
            return false;
        }
        h hVar = (h) ((jo) noVar).j();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((k0) hVar.getContext()).getJSModule(RCTEventEmitter.class);
        int id = hVar.getId();
        rCTEventEmitter.receiveEvent(id, C0201.m82(19278), c(drawable));
        rCTEventEmitter.receiveEvent(id, C0201.m82(19279), new WritableNativeMap());
        return false;
    }
}
