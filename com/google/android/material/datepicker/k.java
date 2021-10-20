package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import vigqyno.C0201;

/* compiled from: MonthsPagerAdapter */
public class k extends RecyclerView.g<b> {
    private final a c;
    private final d<?> d;
    private final g.l e;
    private final int f;

    /* access modifiers changed from: package-private */
    /* compiled from: MonthsPagerAdapter */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            w30.l(view, i);
            try {
                if (this.a.getAdapter().j(i)) {
                    k.this.e.a(this.a.getAdapter().getItem(i).longValue());
                }
            } finally {
                w30.m();
            }
        }
    }

    /* compiled from: MonthsPagerAdapter */
    public static class b extends RecyclerView.d0 {
        public final TextView t;
        public final MaterialCalendarGridView u;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(rv1.month_title);
            this.t = textView;
            k3.i0(textView, true);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(rv1.month_grid);
            if (!z) {
                this.t.setVisibility(8);
            }
        }
    }

    public k(Context context, d<?> dVar, a aVar, g.l lVar) {
        i e2 = aVar.e();
        i b2 = aVar.b();
        i d2 = aVar.d();
        if (e2.compareTo(d2) > 0) {
            throw new IllegalArgumentException(C0201.m82(13899));
        } else if (d2.compareTo(b2) <= 0) {
            this.f = (j.e * g.G(context)) + (h.D(context) ? g.G(context) : 0);
            this.c = aVar;
            this.d = dVar;
            this.e = lVar;
            s(true);
        } else {
            throw new IllegalArgumentException(C0201.m82(13898));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.c.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long d(int i) {
        return this.c.e().i(i).h();
    }

    public i v(int i) {
        return this.c.e().i(i);
    }

    public CharSequence w(int i) {
        return v(i).g();
    }

    public int x(i iVar) {
        return this.c.e().j(iVar);
    }

    /* renamed from: y */
    public void j(b bVar, int i) {
        i i2 = this.c.e().i(i);
        bVar.t.setText(i2.g());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(rv1.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !i2.equals(materialCalendarGridView.getAdapter().a)) {
            j jVar = new j(i2, this.d, this.c);
            materialCalendarGridView.setNumColumns(i2.e);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: z */
    public b l(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(tv1.mtrl_calendar_month_labeled, viewGroup, false);
        if (!h.D(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f));
        return new b(linearLayout, true);
    }
}
