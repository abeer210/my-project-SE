package defpackage;

import android.view.ViewGroup;

/* renamed from: b6  reason: default package */
/* compiled from: Scene */
public class b6 {
    private ViewGroup a;
    private Runnable b;

    public static b6 b(ViewGroup viewGroup) {
        return (b6) viewGroup.getTag(z5.transition_current_scene);
    }

    public static void c(ViewGroup viewGroup, b6 b6Var) {
        viewGroup.setTag(z5.transition_current_scene, b6Var);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) == this && (runnable = this.b) != null) {
            runnable.run();
        }
    }
}
