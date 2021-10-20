package defpackage;

import java.util.ArrayDeque;

/* renamed from: dl2  reason: default package */
/* compiled from: ChildControllersRegistry */
public class dl2 {
    private ArrayDeque<cl2> a = new ArrayDeque<>();

    private boolean a(cl2 cl2) {
        return ((Boolean) qj2.c(this.a.peek(), Boolean.FALSE, new ek2(cl2))).booleanValue();
    }

    public void c(cl2 cl2) {
        this.a.remove(cl2);
    }

    public void d(cl2 cl2) {
        this.a.push(cl2);
    }

    public void e(cl2 cl2) {
        if (a(cl2)) {
            this.a.pop();
            if (!this.a.isEmpty()) {
                this.a.peek().n0();
                return;
            }
            return;
        }
        this.a.remove(cl2);
    }
}
