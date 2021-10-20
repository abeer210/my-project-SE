package com.facebook.react.views.swiperefresh;

import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.y0;
import defpackage.g5;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "AndroidSwipeRefreshLayout")
public class SwipeRefreshLayoutManager extends ViewGroupManager<a> implements zk0<a> {
    public static final String REACT_CLASS = null;
    private final y0<a> mDelegate = new yk0(this);

    /* access modifiers changed from: package-private */
    public class a implements g5.j {
        public final /* synthetic */ k0 a;
        public final /* synthetic */ a b;

        public a(SwipeRefreshLayoutManager swipeRefreshLayoutManager, k0 k0Var, a aVar) {
            this.a = k0Var;
            this.b = aVar;
        }

        @Override // defpackage.g5.j
        public void a() {
            w30.y();
            try {
                d b2 = q0.b(this.a, this.b.getId());
                if (b2 != null) {
                    b2.v(new b(this.b.getId()));
                }
            } finally {
                w30.z();
            }
        }
    }

    static {
        C0201.m83(SwipeRefreshLayoutManager.class, 365);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e.b a2 = e.a();
        a2.b(C0201.m82(8505), e.d(C0201.m82(8503), C0201.m82(8504)));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return e.d(C0201.m82(8508), e.e(C0201.m82(8506), 1, C0201.m82(8507), 0));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(8509);
    }

    public void setNativeRefreshing(a aVar, boolean z) {
    }

    public void addEventEmitters(k0 k0Var, a aVar) {
        aVar.setOnRefreshListener(new a(this, k0Var, aVar));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    public void receiveCommand(a aVar, String str, ReadableArray readableArray) {
        if (((str.hashCode() == 513968928 && str.equals(C0201.m82(8510))) ? (char) 0 : 65535) == 0 && readableArray != null) {
            setRefreshing(aVar, readableArray.getBoolean(0));
        }
    }

    @xj0(customType = "ColorArray", name = "colors")
    public void setColors(a aVar, ReadableArray readableArray) {
        if (readableArray != null) {
            int[] iArr = new int[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                if (readableArray.getType(i) == ReadableType.Map) {
                    iArr[i] = ColorPropConverter.getColor(readableArray.getMap(i), aVar.getContext()).intValue();
                } else {
                    iArr[i] = readableArray.getInt(i);
                }
            }
            aVar.setColorSchemeColors(iArr);
            return;
        }
        aVar.setColorSchemeColors(new int[0]);
    }

    @xj0(defaultBoolean = true, name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @xj0(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(a aVar, Integer num) {
        aVar.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @xj0(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(a aVar, float f) {
        aVar.setProgressViewOffset(f);
    }

    @xj0(name = "refreshing")
    public void setRefreshing(a aVar, boolean z) {
        aVar.setRefreshing(z);
    }

    public void setSize(a aVar, int i) {
        aVar.setSize(i);
    }

    @xj0(name = "size")
    public void setSize(a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.setSize(1);
        } else if (dynamic.getType() == ReadableType.Number) {
            aVar.setSize(dynamic.asInt());
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.equals(C0201.m82(8511))) {
                aVar.setSize(1);
            } else if (asString.equals(C0201.m82(8512))) {
                aVar.setSize(0);
            } else {
                throw new IllegalArgumentException(C0201.m82(8513) + asString);
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(8514));
        }
    }
}
