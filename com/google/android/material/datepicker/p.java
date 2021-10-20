package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import java.util.Calendar;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: YearGridAdapter */
public class p extends RecyclerView.g<b> {
    private final g<?> c;

    /* access modifiers changed from: package-private */
    /* compiled from: YearGridAdapter */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                p.this.c.J(i.d(this.a, p.this.c.E().c));
                p.this.c.K(g.k.DAY);
            } finally {
                w30.h();
            }
        }
    }

    /* compiled from: YearGridAdapter */
    public static class b extends RecyclerView.d0 {
        public final TextView t;

        public b(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    public p(g<?> gVar) {
        this.c = gVar;
    }

    private View.OnClickListener v(int i) {
        return new a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.c.C().f();
    }

    public int w(int i) {
        return i - this.c.C().e().d;
    }

    public int x(int i) {
        return this.c.C().e().d + i;
    }

    /* renamed from: y */
    public void j(b bVar, int i) {
        int x = x(i);
        String string = bVar.t.getContext().getString(vv1.mtrl_picker_navigate_to_year_description);
        bVar.t.setText(String.format(Locale.getDefault(), C0201.m82(15016), Integer.valueOf(x)));
        bVar.t.setContentDescription(String.format(string, Integer.valueOf(x)));
        c D = this.c.D();
        Calendar i2 = o.i();
        b bVar2 = i2.get(1) == x ? D.f : D.d;
        for (Long l : this.c.F().P0()) {
            i2.setTimeInMillis(l.longValue());
            if (i2.get(1) == x) {
                bVar2 = D.e;
            }
        }
        bVar2.d(bVar.t);
        bVar.t.setOnClickListener(v(x));
    }

    /* renamed from: z */
    public b l(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(tv1.mtrl_calendar_year, viewGroup, false));
    }
}
