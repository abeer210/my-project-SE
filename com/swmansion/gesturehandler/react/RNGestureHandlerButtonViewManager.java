package com.swmansion.gesturehandler.react;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import vigqyno.C0201;

public class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> {

    /* access modifiers changed from: package-private */
    public static class a extends ViewGroup {
        public static TypedValue i = new TypedValue();
        public static a j;
        public static View.OnClickListener k = new View$OnClickListenerC0129a();
        public int a = 0;
        public Integer b;
        public Integer c;
        public boolean d = false;
        public boolean e = false;
        public float f = 0.0f;
        public boolean g = false;
        public long h = 0;

        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a  reason: collision with other inner class name */
        static class View$OnClickListenerC0129a implements View.OnClickListener {
            public void onClick(View view) {
                w30.g(view);
                try {
                } finally {
                    w30.h();
                }
            }
        }

        public a(Context context) {
            super(context);
            setOnClickListener(k);
            setClickable(true);
            setFocusable(true);
            this.g = true;
        }

        private Drawable b(Drawable drawable) {
            Integer num;
            Integer num2 = this.b;
            if (num2 != null && Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{num2.intValue()}));
            }
            if (Build.VERSION.SDK_INT >= 23 && (num = this.c) != null && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) q.c((float) num.intValue()));
            }
            return drawable;
        }

        private Drawable c() {
            int i2 = Build.VERSION.SDK_INT;
            getContext().getTheme().resolveAttribute(d(getContext(), (!this.e || i2 < 21) ? C0201.m82(18320) : C0201.m82(18319)), i, true);
            if (i2 >= 21) {
                return getResources().getDrawable(i.resourceId, getContext().getTheme());
            }
            return getResources().getDrawable(i.resourceId);
        }

        @TargetApi(21)
        private static int d(Context context, String str) {
            SoftAssertions.assertNotNull(str);
            if (C0201.m82(18321).equals(str)) {
                return 16843534;
            }
            if (C0201.m82(18322).equals(str)) {
                return 16843868;
            }
            return context.getResources().getIdentifier(str, C0201.m82(18323), C0201.m82(18324));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void j() {
            if (this.g) {
                this.g = false;
                if (this.a == 0) {
                    setBackground(null);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    setForeground(null);
                }
                if (this.d && Build.VERSION.SDK_INT >= 23) {
                    Drawable c2 = c();
                    b(c2);
                    setForeground(c2);
                    int i2 = this.a;
                    if (i2 != 0) {
                        setBackgroundColor(i2);
                    }
                } else if (this.a == 0 && this.b == null) {
                    setBackground(c());
                } else {
                    PaintDrawable paintDrawable = new PaintDrawable(this.a);
                    Drawable c3 = c();
                    float f2 = this.f;
                    if (f2 != 0.0f) {
                        paintDrawable.setCornerRadius(f2);
                        if (Build.VERSION.SDK_INT >= 21 && (c3 instanceof RippleDrawable)) {
                            PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                            paintDrawable2.setCornerRadius(this.f);
                            ((RippleDrawable) c3).setDrawableByLayerId(16908334, paintDrawable2);
                        }
                    }
                    b(c3);
                    setBackground(new LayerDrawable(new Drawable[]{paintDrawable, c3}));
                }
            }
        }

        public void dispatchDrawableHotspotChanged(float f2, float f3) {
        }

        public void drawableHotspotChanged(float f2, float f3) {
            a aVar = j;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f2, f3);
            }
        }

        public void e(float f2) {
            this.f = f2 * getResources().getDisplayMetrics().density;
            this.g = true;
        }

        public void f(Integer num) {
            this.b = num;
            this.g = true;
        }

        public void g(Integer num) {
            this.c = num;
            this.g = true;
        }

        public void h(boolean z) {
            this.e = z;
        }

        public void i(boolean z) {
            this.d = z;
            this.g = true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            long eventTime = motionEvent.getEventTime();
            long j2 = this.h;
            if (j2 == eventTime && j2 != 0) {
                return false;
            }
            this.h = eventTime;
            return super.onTouchEvent(motionEvent);
        }

        public void setBackgroundColor(int i2) {
            this.a = i2;
            this.g = true;
        }

        public void setPressed(boolean z) {
            if (z && j == null) {
                j = this;
            }
            if (!z || j == this) {
                super.setPressed(z);
            }
            if (!z && j == this) {
                j = null;
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(27032);
    }

    @xj0(name = "borderless")
    public void setBorderless(a aVar, boolean z) {
        aVar.h(z);
    }

    @xj0(name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @xj0(name = "foreground")
    @TargetApi(23)
    public void setForeground(a aVar, boolean z) {
        aVar.i(z);
    }

    @xj0(name = "rippleColor")
    public void setRippleColor(a aVar, Integer num) {
        aVar.f(num);
    }

    @xj0(name = "rippleRadius")
    public void setRippleRadius(a aVar, Integer num) {
        aVar.g(num);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    public void onAfterUpdateTransaction(a aVar) {
        aVar.j();
    }

    @xj0(name = "borderRadius")
    public void setBorderRadius(a aVar, float f) {
        aVar.e(f);
    }
}
