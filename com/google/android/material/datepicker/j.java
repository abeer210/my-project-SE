package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/* compiled from: MonthAdapter */
public class j extends BaseAdapter {
    public static final int e = o.k().getMaximum(4);
    public final i a;
    public final d<?> b;
    public c c;
    public final a d;

    public j(i iVar, d<?> dVar, a aVar) {
        this.a = iVar;
        this.b = dVar;
        this.d = aVar;
    }

    private void e(Context context) {
        if (this.c == null) {
            this.c = new c(context);
        }
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.a.e();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.a.e() || i > h()) {
            return null;
        }
        return Long.valueOf(this.a.f(i(i)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* renamed from: d */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        Long c2;
        e(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(tv1.mtrl_calendar_day, viewGroup, false);
        }
        int b2 = i - b();
        if (b2 >= 0) {
            i iVar = this.a;
            if (b2 < iVar.f) {
                int i2 = b2 + 1;
                textView.setTag(iVar);
                textView.setText(String.valueOf(i2));
                long f = this.a.f(i2);
                if (this.a.d == i.k().d) {
                    textView.setContentDescription(e.a(f));
                } else {
                    textView.setContentDescription(e.c(f));
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
                c2 = getItem(i);
                if (c2 != null) {
                    return textView;
                }
                if (this.d.a().F0(c2.longValue())) {
                    textView.setEnabled(true);
                    for (Long l : this.b.P0()) {
                        if (o.a(c2.longValue()) == o.a(l.longValue())) {
                            this.c.b.d(textView);
                            return textView;
                        }
                    }
                    if (o.i().getTimeInMillis() == c2.longValue()) {
                        this.c.c.d(textView);
                        return textView;
                    }
                    this.c.a.d(textView);
                    return textView;
                }
                textView.setEnabled(false);
                this.c.g.d(textView);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        c2 = getItem(i);
        if (c2 != null) {
        }
    }

    public boolean f(int i) {
        return i % this.a.e == 0;
    }

    public boolean g(int i) {
        return (i + 1) % this.a.e == 0;
    }

    public int getCount() {
        return this.a.f + b();
    }

    public long getItemId(int i) {
        return (long) (i / this.a.e);
    }

    public int h() {
        return (this.a.e() + this.a.f) - 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public int i(int i) {
        return (i - this.a.e()) + 1;
    }

    public boolean j(int i) {
        return i >= b() && i <= h();
    }
}
