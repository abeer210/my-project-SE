package com.facebook.react.views.drawer;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import defpackage.j4;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "AndroidDrawerLayout")
public class ReactDrawerLayoutManager extends ViewGroupManager<a> implements tk0<a> {
    public static final int CLOSE_DRAWER = 0;
    public static final int OPEN_DRAWER = 0;
    public static final String REACT_CLASS = null;
    private final y0<a> mDelegate = new sk0(this);

    public static class a implements j4.d {
        private final j4 a;
        private final d b;

        public a(j4 j4Var, d dVar) {
            this.a = j4Var;
            this.b = dVar;
        }

        @Override // defpackage.j4.d
        public void d(View view) {
            this.b.v(new kl0(this.a.getId()));
        }

        @Override // defpackage.j4.d
        public void e(View view) {
            this.b.v(new jl0(this.a.getId()));
        }

        @Override // defpackage.j4.d
        public void f(int i) {
            this.b.v(new ml0(this.a.getId(), i));
        }

        @Override // defpackage.j4.d
        public void h(View view, float f) {
            this.b.v(new ll0(this.a.getId(), f));
        }
    }

    static {
        C0201.m83(ReactDrawerLayoutManager.class, 339);
    }

    private void setDrawerPositionInternal(a aVar, String str) {
        if (str.equals(C0201.m82(31684))) {
            aVar.Y(8388611);
        } else if (str.equals(C0201.m82(31685))) {
            aVar.Y(8388613);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(31686) + str);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e.e(C0201.m82(31690), 1, C0201.m82(31691), 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(31692);
        return e.g(C0201.m82(31697), e.d(r0, C0201.m82(31693)), C0201.m82(31698), e.d(r0, C0201.m82(31694)), C0201.m82(31699), e.d(r0, C0201.m82(31695)), C0201.m82(31700), e.d(r0, C0201.m82(31696)));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return e.d(C0201.m82(31703), e.e(C0201.m82(31701), 8388611, C0201.m82(31702), 8388613));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(31704);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void setDrawerBackgroundColor(a aVar, Integer num) {
    }

    public void setKeyboardDismissMode(a aVar, String str) {
    }

    public void setStatusBarBackgroundColor(a aVar, Integer num) {
    }

    public void addEventEmitters(k0 k0Var, a aVar) {
        aVar.a(new a(aVar, ((UIManagerModule) k0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    public void addView(a aVar, View view, int i) {
        if (getChildCount(aVar) >= 2) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(31689));
        } else if (i == 0 || i == 1) {
            aVar.addView(view, i);
            aVar.Z();
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(31687) + i + C0201.m82(31688));
        }
    }

    public void closeDrawer(a aVar) {
        aVar.W();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    public void openDrawer(a aVar) {
        aVar.X();
    }

    @xj0(name = "drawerLockMode")
    public void setDrawerLockMode(a aVar, String str) {
        if (str == null || C0201.m82(31707).equals(str)) {
            aVar.setDrawerLockMode(0);
        } else if (C0201.m82(31708).equals(str)) {
            aVar.setDrawerLockMode(1);
        } else if (C0201.m82(31709).equals(str)) {
            aVar.setDrawerLockMode(2);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(31710) + str);
        }
    }

    public void setDrawerPosition(a aVar, String str) {
        if (str == null) {
            aVar.Y(8388611);
        } else {
            setDrawerPositionInternal(aVar, str);
        }
    }

    @xj0(defaultFloat = Float.NaN, name = "drawerWidth")
    public void setDrawerWidth(a aVar, float f) {
        int i;
        if (Float.isNaN(f)) {
            i = -1;
        } else {
            i = Math.round(q.c(f));
        }
        aVar.a0(i);
    }

    public void setElevation(a aVar, float f) {
        aVar.setDrawerElevation(q.c(f));
    }

    public void receiveCommand(a aVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            aVar.X();
        } else if (i == 2) {
            aVar.W();
        }
    }

    @xj0(name = "drawerPosition")
    public void setDrawerPosition(a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.Y(8388611);
        } else if (dynamic.getType() == ReadableType.Number) {
            int asInt = dynamic.asInt();
            if (8388611 == asInt || 8388613 == asInt) {
                aVar.Y(asInt);
                return;
            }
            throw new JSApplicationIllegalArgumentException(C0201.m82(31711) + asInt);
        } else if (dynamic.getType() == ReadableType.String) {
            setDrawerPositionInternal(aVar, dynamic.asString());
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(31712));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    public void receiveCommand(a aVar, String str, ReadableArray readableArray) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -258774775) {
            if (hashCode == -83186725 && str.equals(C0201.m82(31705))) {
                c = 0;
                if (c == 0) {
                    aVar.X();
                    return;
                } else if (c == 1) {
                    aVar.W();
                    return;
                } else {
                    return;
                }
            }
        } else if (str.equals(C0201.m82(31706))) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    public void setDrawerWidth(a aVar, Float f) {
        aVar.a0(f == null ? -1 : Math.round(q.c(f.floatValue())));
    }
}
