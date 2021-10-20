package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import vigqyno.C0201;

/* compiled from: MaterialCalendar */
public final class g<S> extends m<S> {
    public static final Object l = C0201.m82(14087);
    public static final Object m = C0201.m82(14088);
    public static final Object n = C0201.m82(14089);
    public static final Object o = C0201.m82(14090);
    private int b;
    private d<S> c;
    private a d;
    private i e;
    private k f;
    private c g;
    private RecyclerView h;
    private RecyclerView i;
    private View j;
    private View k;

    /* access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar */
    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        public void run() {
            g.this.i.smoothScrollToPosition(this.a);
        }
    }

    /* compiled from: MaterialCalendar */
    class b extends r2 {
        public b(g gVar) {
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            w3Var.b0(null);
        }
    }

    /* compiled from: MaterialCalendar */
    class c extends n {
        public final /* synthetic */ int I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void M1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = g.this.i.getWidth();
                iArr[1] = g.this.i.getWidth();
                return;
            }
            iArr[0] = g.this.i.getHeight();
            iArr[1] = g.this.i.getHeight();
        }
    }

    /* compiled from: MaterialCalendar */
    class d implements l {
        public d() {
        }

        @Override // com.google.android.material.datepicker.g.l
        public void a(long j) {
            if (g.this.d.a().F0(j)) {
                g.this.c.a1(j);
                Iterator<l<S>> it = g.this.a.iterator();
                while (it.hasNext()) {
                    it.next().a((S) g.this.c.S0());
                }
                g.this.i.getAdapter().h();
                if (g.this.h != null) {
                    g.this.h.getAdapter().h();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar */
    public class e extends RecyclerView.n {
        private final Calendar a = o.k();
        private final Calendar b = o.k();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i;
            if ((recyclerView.getAdapter() instanceof p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                p pVar = (p) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.d<Long, Long> dVar : g.this.c.x()) {
                    F f = dVar.a;
                    if (!(f == null || dVar.b == null)) {
                        this.a.setTimeInMillis(f.longValue());
                        this.b.setTimeInMillis(dVar.b.longValue());
                        int w = pVar.w(this.a.get(1));
                        int w2 = pVar.w(this.b.get(1));
                        View C = gridLayoutManager.C(w);
                        View C2 = gridLayoutManager.C(w2);
                        int X2 = w / gridLayoutManager.X2();
                        int X22 = w2 / gridLayoutManager.X2();
                        int i2 = X2;
                        while (i2 <= X22) {
                            View C3 = gridLayoutManager.C(gridLayoutManager.X2() * i2);
                            if (C3 != null) {
                                int top = C3.getTop() + g.this.g.d.c();
                                int bottom = C3.getBottom() - g.this.g.d.b();
                                int left = i2 == X2 ? C.getLeft() + (C.getWidth() / 2) : 0;
                                if (i2 == X22) {
                                    i = C2.getLeft() + (C2.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, g.this.g.h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar */
    public class f extends r2 {
        public f() {
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            String str;
            super.g(view, w3Var);
            if (g.this.k.getVisibility() == 0) {
                str = g.this.getString(vv1.mtrl_picker_toggle_to_year_selection);
            } else {
                str = g.this.getString(vv1.mtrl_picker_toggle_to_day_selection);
            }
            w3Var.j0(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$g  reason: collision with other inner class name */
    /* compiled from: MaterialCalendar */
    public class C0068g extends RecyclerView.t {
        public final /* synthetic */ k a;
        public final /* synthetic */ MaterialButton b;

        public C0068g(k kVar, MaterialButton materialButton) {
            this.a = kVar;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = g.this.H().Z1();
            } else {
                i3 = g.this.H().c2();
            }
            g.this.e = this.a.v(i3);
            this.b.setText(this.a.w(i3));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar */
    public class h implements View.OnClickListener {
        public h() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                g.this.L();
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar */
    public class i implements View.OnClickListener {
        public final /* synthetic */ k a;

        public i(k kVar) {
            this.a = kVar;
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                int Z1 = g.this.H().Z1() + 1;
                if (Z1 < g.this.i.getAdapter().c()) {
                    g.this.J(this.a.v(Z1));
                }
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar */
    public class j implements View.OnClickListener {
        public final /* synthetic */ k a;

        public j(k kVar) {
            this.a = kVar;
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                int c2 = g.this.H().c2() - 1;
                if (c2 >= 0) {
                    g.this.J(this.a.v(c2));
                }
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar */
    public enum k {
        DAY,
        YEAR
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar */
    public interface l {
        void a(long j);
    }

    private void A(View view, k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(rv1.month_navigation_fragment_toggle);
        materialButton.setTag(o);
        k3.h0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(rv1.month_navigation_previous);
        materialButton2.setTag(m);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(rv1.month_navigation_next);
        materialButton3.setTag(n);
        this.j = view.findViewById(rv1.mtrl_calendar_year_selector_frame);
        this.k = view.findViewById(rv1.mtrl_calendar_day_selector_frame);
        K(k.DAY);
        materialButton.setText(this.e.g());
        this.i.addOnScrollListener(new C0068g(kVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(kVar));
        materialButton2.setOnClickListener(new j(kVar));
    }

    private RecyclerView.n B() {
        return new e();
    }

    public static int G(Context context) {
        return context.getResources().getDimensionPixelSize(pv1.mtrl_calendar_day_height);
    }

    private void I(int i2) {
        this.i.post(new a(i2));
    }

    public a C() {
        return this.d;
    }

    public c D() {
        return this.g;
    }

    public i E() {
        return this.e;
    }

    public d<S> F() {
        return this.c;
    }

    public LinearLayoutManager H() {
        return (LinearLayoutManager) this.i.getLayoutManager();
    }

    public void J(i iVar) {
        k kVar = (k) this.i.getAdapter();
        int x = kVar.x(iVar);
        int x2 = x - kVar.x(this.e);
        boolean z = true;
        boolean z2 = Math.abs(x2) > 3;
        if (x2 <= 0) {
            z = false;
        }
        this.e = iVar;
        if (z2 && z) {
            this.i.scrollToPosition(x - 3);
            I(x);
        } else if (z2) {
            this.i.scrollToPosition(x + 3);
            I(x);
        } else {
            I(x);
        }
    }

    public void K(k kVar) {
        this.f = kVar;
        if (kVar == k.YEAR) {
            this.h.getLayoutManager().x1(((p) this.h.getAdapter()).w(this.e.d));
            this.j.setVisibility(0);
            this.k.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.j.setVisibility(8);
            this.k.setVisibility(0);
            J(this.e);
        }
    }

    public void L() {
        k kVar = this.f;
        if (kVar == k.YEAR) {
            K(k.DAY);
        } else if (kVar == k.DAY) {
            K(k.YEAR);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt(C0201.m82(14091));
        this.c = (d) bundle.getParcelable(C0201.m82(14092));
        this.d = (a) bundle.getParcelable(C0201.m82(14093));
        this.e = (i) bundle.getParcelable(C0201.m82(14094));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.g = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        i e2 = this.d.e();
        if (h.D(contextThemeWrapper)) {
            i3 = tv1.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i3 = tv1.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(rv1.mtrl_calendar_days_of_week);
        k3.h0(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new f());
        gridView.setNumColumns(e2.e);
        gridView.setEnabled(false);
        this.i = (RecyclerView) inflate.findViewById(rv1.mtrl_calendar_months);
        this.i.setLayoutManager(new c(getContext(), i2, false, i2));
        this.i.setTag(l);
        k kVar = new k(contextThemeWrapper, this.c, this.d, new d());
        this.i.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(sv1.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(rv1.mtrl_calendar_year_selector_frame);
        this.h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.h.setAdapter(new p(this));
            this.h.addItemDecoration(B());
        }
        if (inflate.findViewById(rv1.month_navigation_fragment_toggle) != null) {
            A(inflate, kVar);
        }
        if (!h.D(contextThemeWrapper)) {
            new androidx.recyclerview.widget.h().b(this.i);
        }
        this.i.scrollToPosition(kVar.x(this.e));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(C0201.m82(14095), this.b);
        bundle.putParcelable(C0201.m82(14096), this.c);
        bundle.putParcelable(C0201.m82(14097), this.d);
        bundle.putParcelable(C0201.m82(14098), this.e);
    }
}
