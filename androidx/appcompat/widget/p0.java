package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;
import vigqyno.C0201;

/* compiled from: ScrollingTabContainerView */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public Runnable a;
    private c b;
    public i0 c;
    private Spinner d;
    private boolean e;
    public int f;
    public int g;
    private int h;
    private int i;

    /* access modifiers changed from: package-private */
    /* compiled from: ScrollingTabContainerView */
    public class a implements Runnable {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        public void run() {
            p0.this.smoothScrollTo(this.a.getLeft() - ((p0.this.getWidth() - this.a.getWidth()) / 2), 0);
            p0.this.a = null;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView */
    public class b extends BaseAdapter {
        public b() {
        }

        public int getCount() {
            return p0.this.c.getChildCount();
        }

        public Object getItem(int i) {
            return ((d) p0.this.c.getChildAt(i)).b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i), true);
            }
            ((d) view).a((a.c) getItem(i));
            return view;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                ((d) view).b().e();
                int childCount = p0.this.c.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = p0.this.c.getChildAt(i);
                    childAt.setSelected(childAt == view);
                }
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView */
    public class d extends LinearLayout {
        private final int[] a;
        private a.c b;
        private TextView c;
        private ImageView d;
        private View e;

        public d(Context context, a.c cVar, boolean z) {
            super(context, null, defpackage.d.actionBarTabStyle);
            int[] iArr = {16842964};
            this.a = iArr;
            this.b = cVar;
            x0 u = x0.u(context, null, iArr, defpackage.d.actionBarTabStyle, 0);
            if (u.r(0)) {
                setBackgroundDrawable(u.g(0));
            }
            u.v();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.b = cVar;
            c();
        }

        public a.c b() {
            return this.b;
        }

        public void c() {
            a.c cVar = this.b;
            View b2 = cVar.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.e = b2;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.e;
            if (view != null) {
                removeView(view);
                this.e = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.d == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.d = oVar;
                }
                this.d.setImageDrawable(c2);
                this.d.setVisibility(0);
            } else {
                ImageView imageView2 = this.d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.c == null) {
                    z zVar = new z(getContext(), null, defpackage.d.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.c = zVar;
                }
                this.c.setText(d2);
                this.c.setVisibility(0);
            } else {
                TextView textView2 = this.c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            z0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0201.m82(7619));
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0201.m82(7620));
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (p0.this.f > 0 && getMeasuredWidth() > (i3 = p0.this.f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, defpackage.d.actionDropDownStyle);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.d == null) {
                this.d = b();
            }
            removeView(this.c);
            addView(this.d, new ViewGroup.LayoutParams(-2, -1));
            if (this.d.getAdapter() == null) {
                this.d.setAdapter((SpinnerAdapter) new b());
            }
            Runnable runnable = this.a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.a = null;
            }
            this.d.setSelection(this.i);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.d);
        addView(this.c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.d.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.c.getChildAt(i2);
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.a = aVar;
        post(aVar);
    }

    public d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
        } else {
            dVar.setFocusable(true);
            if (this.b == null) {
                this.b = new c();
            }
            dVar.setOnClickListener(this.b);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v b2 = v.b(getContext());
        setContentHeight(b2.f());
        this.g = b2.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
        w30.n(view, i2);
        try {
            ((d) view).b().e();
        } finally {
            w30.o();
        }
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f = -1;
        } else {
            if (childCount > 2) {
                this.f = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.f = View.MeasureSpec.getSize(i2) / 2;
            }
            this.f = Math.min(this.f, this.g);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        if (z2 || !this.e) {
            z = false;
        }
        if (z) {
            this.c.measure(0, makeMeasureSpec);
            if (this.c.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.i);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.e = z;
    }

    public void setContentHeight(int i2) {
        this.h = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.i = i2;
        int childCount = this.c.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.c.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.d;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
