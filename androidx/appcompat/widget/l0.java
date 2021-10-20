package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* compiled from: MenuPopupWindow */
public class l0 extends j0 implements k0 {
    private static Method M;
    private k0 L;

    /* compiled from: MenuPopupWindow */
    public static class a extends f0 {
        public final int o;
        public final int p;
        private k0 q;
        private MenuItem u;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.o = 22;
                this.p = 21;
                return;
            }
            this.o = 21;
            this.p = 22;
        }

        @Override // androidx.appcompat.widget.f0
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            f fVar;
            int pointToPosition;
            int i2;
            if (this.q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (f) adapter;
                }
                i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.u;
                if (menuItem != iVar) {
                    g b = fVar.b();
                    if (menuItem != null) {
                        this.q.h(b, menuItem);
                    }
                    this.u = iVar;
                    if (iVar != null) {
                        this.q.e(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.p) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((f) getAdapter()).b().e(false);
                return true;
            }
        }

        public void setHoverListener(k0 k0Var) {
            this.q = k0Var;
        }

        @Override // android.widget.AbsListView, androidx.appcompat.widget.f0
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                M = PopupWindow.class.getDeclaredMethod(C0201.m82(17209), Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(C0201.m82(17210), C0201.m82(17211));
        }
    }

    public l0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.H.setEnterTransition((Transition) obj);
        }
    }

    public void S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.H.setExitTransition((Transition) obj);
        }
    }

    public void T(k0 k0Var) {
        this.L = k0Var;
    }

    public void U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = M;
            if (method != null) {
                try {
                    method.invoke(this.H, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i(C0201.m82(17212), C0201.m82(17213));
                }
            }
        } else {
            this.H.setTouchModal(z);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void e(g gVar, MenuItem menuItem) {
        k0 k0Var = this.L;
        if (k0Var != null) {
            k0Var.e(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void h(g gVar, MenuItem menuItem) {
        k0 k0Var = this.L;
        if (k0Var != null) {
            k0Var.h(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.j0
    public f0 s(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
