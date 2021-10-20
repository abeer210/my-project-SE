package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import com.facebook.react.views.modal.d;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "RCTModalHostView")
public class ReactModalHostManager extends ViewGroupManager<d> implements fl0<d> {
    public static final String REACT_CLASS = null;
    private final y0<d> mDelegate = new el0(this);

    /* access modifiers changed from: package-private */
    public class a implements d.c {
        public final /* synthetic */ com.facebook.react.uimanager.events.d a;
        public final /* synthetic */ d b;

        public a(ReactModalHostManager reactModalHostManager, com.facebook.react.uimanager.events.d dVar, d dVar2) {
            this.a = dVar;
            this.b = dVar2;
        }

        @Override // com.facebook.react.views.modal.d.c
        public void a(DialogInterface dialogInterface) {
            this.a.v(new e(this.b.getId()));
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements DialogInterface.OnShowListener {
        public final /* synthetic */ com.facebook.react.uimanager.events.d a;
        public final /* synthetic */ d b;

        public b(ReactModalHostManager reactModalHostManager, com.facebook.react.uimanager.events.d dVar, d dVar2) {
            this.a = dVar;
            this.b = dVar2;
        }

        public void onShow(DialogInterface dialogInterface) {
            this.a.v(new f(this.b.getId()));
        }
    }

    static {
        C0201.m83(ReactModalHostManager.class, 466);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<d> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e.b a2 = e.a();
        String r1 = C0201.m82(36217);
        a2.b(C0201.m82(36219), e.d(r1, C0201.m82(36218)));
        a2.b(C0201.m82(36221), e.d(r1, C0201.m82(36220)));
        return a2.a();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(36222);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends i> getShadowNodeClass() {
        return b.class;
    }

    public void setAnimated(d dVar, boolean z) {
    }

    public void setIdentifier(d dVar, int i) {
    }

    public void setPresentationStyle(d dVar, String str) {
    }

    public void setSupportedOrientations(d dVar, ReadableArray readableArray) {
    }

    public void addEventEmitters(k0 k0Var, d dVar) {
        com.facebook.react.uimanager.events.d eventDispatcher = ((UIManagerModule) k0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        dVar.setOnRequestCloseListener(new a(this, eventDispatcher, dVar));
        dVar.setOnShowListener(new b(this, eventDispatcher, dVar));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    public void onAfterUpdateTransaction(d dVar) {
        super.onAfterUpdateTransaction((View) dVar);
        dVar.d();
    }

    public void onDropViewInstance(d dVar) {
        super.onDropViewInstance((View) dVar);
        dVar.c();
    }

    @xj0(name = "animationType")
    public void setAnimationType(d dVar, String str) {
        if (str != null) {
            dVar.setAnimationType(str);
        }
    }

    @xj0(name = "hardwareAccelerated")
    public void setHardwareAccelerated(d dVar, boolean z) {
        dVar.setHardwareAccelerated(z);
    }

    @xj0(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(d dVar, boolean z) {
        dVar.setStatusBarTranslucent(z);
    }

    @xj0(name = "transparent")
    public void setTransparent(d dVar, boolean z) {
        dVar.setTransparent(z);
    }

    public Object updateState(d dVar, c0 c0Var, j0 j0Var) {
        Point a2 = a.a(dVar.getContext());
        dVar.f(j0Var, a2.x, a2.y);
        return null;
    }
}
