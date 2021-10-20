package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import vigqyno.C0188;

/* compiled from: AbsActionBarView */
public abstract class a extends ViewGroup {
    public final C0009a a;
    public final Context b;
    public ActionMenuView c;
    public c d;
    public int e;
    public p3 f;
    private boolean g;
    private boolean h;

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    public class C0009a implements q3 {
        private boolean a = false;
        public int b;

        public C0009a() {
        }

        @Override // defpackage.q3
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.q3
        public void b(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.f = null;
                a.super.setVisibility(this.b);
            }
        }

        @Override // defpackage.q3
        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        public C0009a d(p3 p3Var, int i) {
            a.this.f = p3Var;
            this.b = i;
            return this;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, C0188.f23), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public p3 f(int i, long j) {
        p3 p3Var = this.f;
        if (p3Var != null) {
            p3Var.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            p3 c2 = k3.c(this);
            c2.a(1.0f);
            c2.d(j);
            C0009a aVar = this.a;
            aVar.d(c2, i);
            c2.f(aVar);
            return c2;
        }
        p3 c3 = k3.c(this);
        c3.a(0.0f);
        c3.d(j);
        C0009a aVar2 = this.a;
        aVar2.d(c3, i);
        c3.f(aVar2);
        return c3;
    }

    public int getAnimatedVisibility() {
        if (this.f != null) {
            return this.a.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, m.ActionBar, d.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(m.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.d;
        if (cVar != null) {
            cVar.E(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            p3 p3Var = this.f;
            if (p3Var != null) {
                p3Var.b();
            }
            super.setVisibility(i);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new C0009a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(d.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
