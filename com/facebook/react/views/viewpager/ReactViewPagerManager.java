package com.facebook.react.views.viewpager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "AndroidViewPager")
public class ReactViewPagerManager extends ViewGroupManager<d> implements dl0<d> {
    public static final int COMMAND_SET_PAGE = 0;
    public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 0;
    public static final String REACT_CLASS = null;
    private final y0<d> mDelegate = new cl0(this);

    static {
        C0201.m83(ReactViewPagerManager.class, 521);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e.e(C0201.m82(9920), 1, C0201.m82(9921), 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<d> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(9922);
        return e.f(C0201.m82(9926), e.d(r0, C0201.m82(9923)), C0201.m82(9927), e.d(r0, C0201.m82(9924)), C0201.m82(9928), e.d(r0, C0201.m82(9925)));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(9929);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void setInitialPage(d dVar, int i) {
    }

    public void setKeyboardDismissMode(d dVar, String str) {
    }

    public void setPage(d dVar, int i) {
    }

    public void setPageWithoutAnimation(d dVar, int i) {
    }

    public void addView(d dVar, View view, int i) {
        dVar.X(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    public View getChildAt(d dVar, int i) {
        return dVar.Y(i);
    }

    public int getChildCount(d dVar) {
        return dVar.getViewCountInAdapter();
    }

    public void removeViewAt(d dVar, int i) {
        dVar.Z(i);
    }

    @xj0(defaultInt = 0, name = "pageMargin")
    public void setPageMargin(d dVar, int i) {
        dVar.setPageMargin((int) q.c((float) i));
    }

    @xj0(defaultBoolean = false, name = "peekEnabled")
    public void setPeekEnabled(d dVar, boolean z) {
        dVar.setClipToPadding(!z);
    }

    @xj0(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(d dVar, boolean z) {
        dVar.setScrollEnabled(z);
    }

    public void receiveCommand(d dVar, int i, ReadableArray readableArray) {
        yh0.c(dVar);
        yh0.c(readableArray);
        if (i == 1) {
            dVar.a0(readableArray.getInt(0), true);
        } else if (i == 2) {
            dVar.a0(readableArray.getInt(0), false);
        } else {
            throw new IllegalArgumentException(String.format(C0201.m82(9930), Integer.valueOf(i), ReactViewPagerManager.class.getSimpleName()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    public void receiveCommand(d dVar, String str, ReadableArray readableArray) {
        char c;
        yh0.c(dVar);
        yh0.c(readableArray);
        int hashCode = str.hashCode();
        if (hashCode != -445763635) {
            if (hashCode == 1984860689 && str.equals(C0201.m82(9931))) {
                c = 0;
                if (c == 0) {
                    dVar.a0(readableArray.getInt(0), true);
                    return;
                } else if (c == 1) {
                    dVar.a0(readableArray.getInt(0), false);
                    return;
                } else {
                    throw new IllegalArgumentException(String.format(C0201.m82(9933), str, ReactViewPagerManager.class.getSimpleName()));
                }
            }
        } else if (str.equals(C0201.m82(9932))) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }
}
