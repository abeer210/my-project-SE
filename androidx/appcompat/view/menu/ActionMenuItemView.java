package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.z;
import androidx.appcompat.widget.z0;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {
    public i e;
    private CharSequence f;
    private Drawable g;
    public g.b h;
    private h0 i;
    public b j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    private class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.h0
        public p b() {
            b bVar = ActionMenuItemView.this.j;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.h0
        public boolean c() {
            p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.h;
            if (bVar == null || !bVar.a(actionMenuItemView.e) || (b = b()) == null || !b.b()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void j() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f);
        if (this.g != null && (!this.e.B() || (!this.k && !this.l))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f : null);
        CharSequence contentDescription = this.e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.e.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.e.getTitle();
            }
            z0.a(this, charSequence2);
            return;
        }
        z0.a(this, tooltipText);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return h();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return h() && this.e.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean e() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void f(i iVar, int i2) {
        this.e = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.i == null) {
            this.i = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.e;
    }

    public boolean h() {
        return !TextUtils.isEmpty(getText());
    }

    public void onClick(View view) {
        w30.g(view);
        try {
            if (this.h != null) {
                this.h.a(this.e);
            }
        } finally {
            w30.h();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k = i();
        j();
    }

    @Override // androidx.appcompat.widget.z
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean h2 = h();
        if (h2 && (i4 = this.n) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.m) : this.m;
        if (mode != 1073741824 && this.m > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!h2 && this.g != null) {
            super.setPadding((getMeasuredWidth() - this.g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (!this.e.hasSubMenu() || (h0Var = this.i) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.l != z) {
            this.l = z;
            i iVar = this.e;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.o;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            int i3 = this.o;
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        j();
    }

    public void setItemInvoker(g.b bVar) {
        this.h = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.n = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f = charSequence;
        j();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.k = i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ActionMenuItemView, i2, 0);
        this.m = obtainStyledAttributes.getDimensionPixelSize(m.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.n = -1;
        setSaveEnabled(false);
    }
}
