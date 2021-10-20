package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import com.facebook.react.views.view.d;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: zj2  reason: default package */
/* compiled from: ViewUtils */
public class zj2 {

    /* renamed from: zj2$a */
    /* compiled from: ViewUtils */
    public interface a<T> {
        boolean k(T t);
    }

    public static boolean a(View view, View view2) {
        return view.getWidth() == view2.getWidth() && view.getHeight() == view2.getHeight();
    }

    public static <T extends View> T b(ViewGroup viewGroup, Class<T> cls) {
        T t;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            T t2 = (T) viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(t2.getClass())) {
                return t2;
            }
            if ((t2 instanceof ViewGroup) && (t = (T) b((ViewGroup) t2, cls)) != null && cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    public static <T> List<T> c(ViewGroup viewGroup, Class<T> cls) {
        return d(viewGroup, cls, si2.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: zj2$a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> d(ViewGroup viewGroup, Class cls, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass()) && aVar.k(childAt)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: zj2$a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> e(ViewGroup viewGroup, Class cls, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(e((ViewGroup) childAt, cls, aVar));
            }
            if (cls.isAssignableFrom(childAt.getClass()) && aVar.k(childAt)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static int f(View view) {
        if (view.getBackground() instanceof d) {
            return ((d) view.getBackground()).j();
        }
        throw new RuntimeException(view.getBackground().getClass().getSimpleName() + C0201.m82(4791));
    }

    public static int g(View view) {
        if (view.getLayoutParams() == null) {
            return 0;
        }
        return view.getLayoutParams().height < 0 ? view.getHeight() : view.getLayoutParams().height;
    }

    public static int h(View view) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            return -1;
        }
        return ((ViewGroup) parent).indexOfChild(view);
    }

    public static Point i(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static boolean j(View view) {
        return ((Boolean) qj2.c(view, Boolean.FALSE, ti2.a)).booleanValue();
    }

    public static /* synthetic */ boolean k(Object obj) {
        return true;
    }

    public static /* synthetic */ Boolean l(View view) {
        return Boolean.valueOf(view.getVisibility() == 0);
    }

    public static void m(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewManager) parent).removeView(view);
        }
    }
}
