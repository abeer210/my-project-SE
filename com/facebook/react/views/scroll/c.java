package com.facebook.react.views.scroll;

import android.content.Context;
import android.widget.HorizontalScrollView;
import com.facebook.react.modules.i18nmanager.a;
import com.facebook.react.views.view.f;

/* compiled from: ReactHorizontalScrollContainerView */
public class c extends f {
    private int a;
    private int b = 0;

    public c(Context context) {
        super(context);
        this.a = a.d().g(context) ? 1 : 0;
    }

    @Override // com.facebook.react.views.view.f
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo((horizontalScrollView.getScrollX() + getWidth()) - this.b, horizontalScrollView.getScrollY());
        }
        this.b = getWidth();
    }
}
