package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: tj0  reason: default package */
/* compiled from: JSResponderHandler */
public class tj0 implements uj0 {
    private volatile int a = -1;
    private ViewParent b;

    private void c() {
        ViewParent viewParent = this.b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.b = null;
        }
    }

    @Override // defpackage.uj0
    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.a;
        if (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) {
            return false;
        }
        return true;
    }

    public void b() {
        this.a = -1;
        c();
    }

    public void d(int i, ViewParent viewParent) {
        this.a = i;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.b = viewParent;
        }
    }
}
