package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: j7  reason: default package */
/* compiled from: AnimatedVectorDrawableCompat */
public class j7 extends o7 implements Animatable {
    private b b;
    private Context c;
    private ArgbEvaluator d;
    public final Drawable.Callback e;

    /* renamed from: j7$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            j7.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            j7.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            j7.this.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j7$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    public static class b extends Drawable.ConstantState {
        public int a;
        public p7 b;
        public AnimatorSet c;
        public ArrayList<Animator> d;
        public r0<Animator, String> e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                p7 p7Var = bVar.b;
                if (p7Var != null) {
                    Drawable.ConstantState constantState = p7Var.getConstantState();
                    if (resources != null) {
                        this.b = (p7) constantState.newDrawable(resources);
                    } else {
                        this.b = (p7) constantState.newDrawable();
                    }
                    p7 p7Var2 = this.b;
                    p7Var2.mutate();
                    p7 p7Var3 = p7Var2;
                    this.b = p7Var3;
                    p7Var3.setCallback(callback);
                    this.b.setBounds(bVar.b.getBounds());
                    this.b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new r0<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.e.get(animator);
                        clone.setTarget(this.b.d(str));
                        this.d.add(clone);
                        this.e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException(C0201.m82(16054));
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException(C0201.m82(16055));
        }
    }

    public j7() {
        this(null, null, null);
    }

    public static j7 a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        j7 j7Var = new j7(context);
        j7Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return j7Var;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.b.b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        b bVar = this.b;
        if (bVar.d == null) {
            bVar.d = new ArrayList<>();
            this.b.e = new r0<>();
        }
        this.b.d.add(animator);
        this.b.e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if (C0201.m82(21079).equals(propertyName) || C0201.m82(21080).equals(propertyName)) {
                if (this.d == null) {
                    this.d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.d);
            }
        }
    }

    @Override // defpackage.o7
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.b.b.draw(canvas);
        if (this.b.c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.b.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.b.b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.a.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.b.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.b.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.b.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (C0201.m82(21081).equals(name)) {
                    TypedArray k = m1.k(resources, theme, attributeSet, h7.e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p7 b2 = p7.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.e);
                        p7 p7Var = this.b.b;
                        if (p7Var != null) {
                            p7Var.setCallback(null);
                        }
                        this.b.b = b2;
                    }
                    k.recycle();
                } else if (C0201.m82(21082).equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, h7.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.c;
                        if (context != null) {
                            b(string, l7.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException(C0201.m82(21083));
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.b.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.b.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.b.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.b.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.b.setBounds(rect);
        }
    }

    @Override // defpackage.o7
    public boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.b.b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.b.b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.b.b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.b.b.setAutoMirrored(z);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i);
        } else {
            this.b.b.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.b.b.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.b.b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.b.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.b.c.isStarted()) {
            this.b.c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.c.end();
        }
    }

    private j7(Context context) {
        this(context, null, null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: j7$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class c extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            j7 j7Var = new j7();
            Drawable newDrawable = this.a.newDrawable();
            j7Var.a = newDrawable;
            newDrawable.setCallback(j7Var.e);
            return j7Var;
        }

        public Drawable newDrawable(Resources resources) {
            j7 j7Var = new j7();
            Drawable newDrawable = this.a.newDrawable(resources);
            j7Var.a = newDrawable;
            newDrawable.setCallback(j7Var.e);
            return j7Var;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            j7 j7Var = new j7();
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            j7Var.a = newDrawable;
            newDrawable.setCallback(j7Var.e);
            return j7Var;
        }
    }

    private j7(Context context, b bVar, Resources resources) {
        this.d = null;
        this.e = new a();
        this.c = context;
        if (bVar != null) {
            this.b = bVar;
        } else {
            this.b = new b(context, bVar, this.e, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
