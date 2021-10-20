package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* renamed from: dp2  reason: default package */
/* compiled from: TitleBar */
public class dp2 extends Toolbar {
    private ll2 S;
    private View T;
    private ge2 U;
    private ge2 V;
    private Boolean W;
    private Boolean a0;

    public dp2(Context context) {
        super(context);
        Boolean bool = Boolean.FALSE;
        this.W = bool;
        this.a0 = bool;
        getMenu();
    }

    private void Q() {
        View view = this.T;
        if (view != null) {
            zj2.m(view);
            this.T = null;
        }
    }

    private void R() {
        setNavigationIcon((Drawable) null);
        ll2 ll2 = this.S;
        if (ll2 != null) {
            ll2.q();
            this.S = null;
        }
    }

    private void T() {
        setSubtitle((CharSequence) null);
    }

    private void U() {
        setTitle((CharSequence) null);
    }

    private void W(View view) {
        if (view instanceof ActionMenuView) {
            ((ViewGroup) view).setClipChildren(false);
        }
    }

    private void setLeftButton(ll2 ll2) {
        this.S = ll2;
        xj2.j(Y(), new zo2(this));
        ll2.k0(this);
    }

    public void P(ge2 ge2, TextView textView) {
        if (!tj2.a(textView.getText())) {
            boolean z = true;
            if (textView.getParent().getLayoutDirection() != 1) {
                z = false;
            }
            if (ge2 == ge2.Center) {
                textView.setX(((float) (getWidth() - textView.getWidth())) / 2.0f);
            } else if (this.S != null) {
                textView.setX((float) (z ? (getWidth() - textView.getWidth()) - getContentInsetStartWithNavigation() : getContentInsetStartWithNavigation()));
            } else {
                textView.setX(z ? (float) ((getWidth() - textView.getWidth()) - xj2.b(getContext(), 16)) : (float) xj2.b(getContext(), 16));
            }
        }
    }

    public void S() {
        if (getMenu().size() > 0) {
            getMenu().clear();
        }
    }

    public boolean V(MenuItem menuItem, int i) {
        return (menuItem == null || getMenu().findItem(menuItem.getItemId()) == null || menuItem.getOrder() != i) ? false : true;
    }

    public TextView X() {
        List d = zj2.d(this, TextView.class, new ap2(this));
        if (d.isEmpty()) {
            return null;
        }
        return (TextView) d.get(0);
    }

    public TextView Y() {
        List d = zj2.d(this, TextView.class, new cp2(this));
        if (d.isEmpty()) {
            return null;
        }
        return (TextView) d.get(0);
    }

    public MenuItem Z(int i) {
        return getMenu().getItem(i);
    }

    public /* synthetic */ boolean a0(TextView textView) {
        return textView.getText().equals(getSubtitle());
    }

    public /* synthetic */ boolean b0(TextView textView) {
        return textView.getText().equals(getTitle());
    }

    public /* synthetic */ void d0(TextView textView) {
        P(this.U, textView);
    }

    public void e0(int i) {
        getMenu().removeItem(i);
    }

    public List<MenuItem> getRightButtons() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getRightButtonsCount(); i++) {
            arrayList.add(i, Z(i));
        }
        return arrayList;
    }

    public int getRightButtonsCount() {
        return getMenu().size();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.W.booleanValue()) {
            TextView Y = Y();
            if (Y != null) {
                P(this.U, Y);
            }
            this.W = Boolean.FALSE;
        }
        if (z || this.a0.booleanValue()) {
            TextView X = X();
            if (X != null) {
                P(this.V, X);
            }
            this.a0 = Boolean.FALSE;
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        W(view);
    }

    public void setBackButton(ll2 ll2) {
        setLeftButton(ll2);
    }

    public void setBackgroundColor(uf2 uf2) {
        if (uf2.f()) {
            setBackgroundColor(((Integer) uf2.d()).intValue());
        }
    }

    public void setComponent(View view) {
        if (this.T != view) {
            U();
            T();
            this.T = view;
            addView(view);
        }
    }

    public void setHeight(int i) {
        int b = xj2.b(getContext(), i);
        if (b != getLayoutParams().height) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = b;
            setLayoutParams(layoutParams);
        }
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        qj2.d(zj2.b(this, ActionMenuView.class), new bp2(i));
    }

    public void setLeftButtons(List<ll2> list) {
        if (list != null) {
            if (list.isEmpty()) {
                R();
                return;
            }
            if (list.size() > 1) {
                Log.w(C0201.m82(19405), C0201.m82(19406));
            }
            setLeftButton(list.get(0));
        }
    }

    public void setOverflowButtonColor(int i) {
        Drawable overflowIcon;
        ActionMenuView actionMenuView = (ActionMenuView) zj2.b(this, ActionMenuView.class);
        if (actionMenuView != null && (overflowIcon = actionMenuView.getOverflowIcon()) != null) {
            overflowIcon.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        super.setSubtitle(charSequence);
        this.a0 = Boolean.TRUE;
    }

    public void setSubtitleAlignment(ge2 ge2) {
        this.V = ge2;
    }

    public void setSubtitleFontSize(double d) {
        TextView X = X();
        if (X != null) {
            X.setTextSize((float) d);
        }
    }

    public void setSubtitleTypeface(Typeface typeface) {
        TextView X = X();
        if (X != null) {
            X.setTypeface(typeface);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        Q();
        super.setTitle(charSequence);
        this.W = Boolean.TRUE;
    }

    public void setTitleAlignment(ge2 ge2) {
        this.U = ge2;
    }

    public void setTitleFontSize(double d) {
        TextView Y = Y();
        if (Y != null) {
            Y.setTextSize((float) d);
        }
    }

    public void setTitleTypeface(Typeface typeface) {
        TextView Y = Y();
        if (Y != null) {
            Y.setTypeface(typeface);
        }
    }

    public void setTopMargin(int i) {
        int b = xj2.b(getContext(), i);
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            if (marginLayoutParams.topMargin != b) {
                marginLayoutParams.topMargin = b;
                setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public String getTitle() {
        return super.getTitle() == null ? C0201.m82(19404) : (String) super.getTitle();
    }
}
