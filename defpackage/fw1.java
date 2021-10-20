package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: fw1  reason: default package */
/* compiled from: MotionSpec */
public class fw1 {
    private final x0<String, gw1> a = new x0<>();
    private final x0<String, PropertyValuesHolder[]> b = new x0<>();

    private static void a(fw1 fw1, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            fw1.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            fw1.i(objectAnimator.getPropertyName(), gw1.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException(C0201.m82(15721) + animator);
    }

    public static fw1 b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static fw1 c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e) {
            Log.w(C0201.m82(15723), C0201.m82(15722) + Integer.toHexString(i), e);
            return null;
        }
    }

    private static fw1 d(List<Animator> list) {
        fw1 fw1 = new fw1();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(fw1, list.get(i));
        }
        return fw1;
    }

    public gw1 e(String str) {
        if (g(str)) {
            return this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw1)) {
            return false;
        }
        return this.a.equals(((fw1) obj).a);
    }

    public long f() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            gw1 m = this.a.m(i);
            j = Math.max(j, m.c() + m.d());
        }
        return j;
    }

    public boolean g(String str) {
        return this.a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str, gw1 gw1) {
        this.a.put(str, gw1);
    }

    public String toString() {
        return '\n' + fw1.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + C0201.m82(15724) + this.a + C0201.m82(15725);
    }
}
