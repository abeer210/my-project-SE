package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: pl2  reason: default package */
/* compiled from: YellowBoxDelegate.kt */
public class pl2 {
    private ViewGroup a;
    private boolean b;
    private final ArrayList<View> c;
    private final Context d;
    private final ql2 e;

    /* renamed from: pl2$a */
    /* compiled from: View.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ pl2 b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;

        public a(View view, pl2 pl2, View view2, View view3) {
            this.a = view;
            this.b = pl2;
            this.c = view2;
            this.d = view3;
        }

        public final void run() {
            if (this.b.e.b(this.c, this.d)) {
                this.b.d(this.c);
            }
        }
    }

    public pl2(Context context, ql2 ql2) {
        ow2.c(context, C0201.m82(36306));
        ow2.c(ql2, C0201.m82(36307));
        this.d = context;
        this.e = ql2;
        this.c = new ArrayList<>();
    }

    public final void b() {
        this.b = true;
        if (true ^ this.c.isEmpty()) {
            for (T t : this.c) {
                ViewGroup viewGroup = this.a;
                if (viewGroup != null) {
                    viewGroup.addView(t);
                }
            }
        }
    }

    public void c(View view, View view2) {
        ow2.c(view, C0201.m82(36308));
        if (dj2.a(this.d) && view2 != null) {
            ow2.b(h3.a(view2, new a(view2, this, view, view2)), C0201.m82(36309));
        }
    }

    public final void d(View view) {
        ow2.c(view, C0201.m82(36310));
        if (!this.b) {
            ViewGroup viewGroup = (ViewGroup) view;
            this.a = viewGroup;
            int childCount = viewGroup.getChildCount();
            for (int i = 1; i < childCount; i++) {
                this.c.add(n3.a(viewGroup, i));
                viewGroup.removeView(n3.a(viewGroup, i));
                viewGroup.addView(new View(this.d), i);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public pl2(Context context) {
        this(context, new ql2());
        ow2.c(context, C0201.m82(36305));
    }
}
