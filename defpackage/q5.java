package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* renamed from: q5  reason: default package */
/* compiled from: GhostViewHolder */
public class q5 extends FrameLayout {
    private ViewGroup a;
    private boolean b = true;

    public q5(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.a = viewGroup;
        viewGroup.setTag(z5.ghost_view_holder, this);
        q6.b(this.a).c(this);
    }

    public static q5 b(ViewGroup viewGroup) {
        return (q5) viewGroup.getTag(z5.ghost_view_holder);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            d(((s5) getChildAt(i2)).c, arrayList2);
            if (f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Build.VERSION.SDK_INT < 21 || view.getZ() == view2.getZ()) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(q6.a(viewGroup, i));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    public void a(s5 s5Var) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(s5Var.c, arrayList);
        int c = c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(s5Var);
        } else {
            addView(s5Var, c);
        }
    }

    public void g() {
        if (this.b) {
            q6.b(this.a).d(this);
            q6.b(this.a).c(this);
            return;
        }
        throw new IllegalStateException(C0201.m82(35986));
    }

    public void onViewAdded(View view) {
        if (this.b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException(C0201.m82(35987));
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.a.setTag(z5.ghost_view_holder, null);
            q6.b(this.a).d(this);
            this.b = false;
        }
    }
}
