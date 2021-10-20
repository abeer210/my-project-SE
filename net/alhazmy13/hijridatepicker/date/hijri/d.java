package net.alhazmy13.hijridatepicker.date.hijri;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import net.alhazmy13.hijridatepicker.date.hijri.e;
import vigqyno.C0201;

/* compiled from: MonthAdapter */
public abstract class d extends BaseAdapter implements e.b {
    private final Context a;
    public final a b;
    private a c;

    public d(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
        c();
        f(this.b.q());
    }

    private boolean d(int i, int i2) {
        a aVar = this.c;
        return aVar.b == i && aVar.c == i2;
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.e.b
    public void a(e eVar, a aVar) {
        if (aVar != null) {
            e(aVar);
        }
    }

    public abstract e b(Context context);

    public void c() {
        this.c = new a(System.currentTimeMillis(), this.b.getTimeZone());
    }

    public void e(a aVar) {
        this.b.a();
        this.b.f(aVar.b, aVar.c, aVar.d);
        f(aVar);
    }

    public void f(a aVar) {
        this.c = aVar;
        notifyDataSetChanged();
    }

    public int getCount() {
        in0 i = this.b.i();
        in0 s = this.b.s();
        return (((i.get(1) * 12) + i.get(2)) - ((s.get(1) * 12) + s.get(2))) + 1;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    @SuppressLint({"NewApi"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        e eVar;
        HashMap<String, Integer> hashMap;
        int i2 = -1;
        if (view != null) {
            eVar = (e) view;
            hashMap = (HashMap) eVar.getTag();
        } else {
            eVar = b(this.a);
            eVar.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            eVar.setClickable(true);
            eVar.setOnDayClickListener(this);
            hashMap = null;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.clear();
        int i3 = (this.b.s().get(2) + i) % 12;
        int p = ((i + this.b.s().get(2)) / 12) + this.b.p();
        if (d(p, i3)) {
            i2 = this.c.d;
        }
        eVar.p();
        hashMap.put(C0201.m82(20316), Integer.valueOf(i2));
        hashMap.put(C0201.m82(20317), Integer.valueOf(p));
        hashMap.put(C0201.m82(20318), Integer.valueOf(i3));
        hashMap.put(C0201.m82(20319), Integer.valueOf(this.b.c()));
        eVar.setMonthParams(hashMap);
        eVar.invalidate();
        return eVar;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* compiled from: MonthAdapter */
    public static class a {
        private in0 a;
        public int b;
        public int c;
        public int d;
        public TimeZone e;

        public a(TimeZone timeZone) {
            this.e = timeZone;
            c(System.currentTimeMillis());
        }

        private void c(long j) {
            if (this.a == null) {
                this.a = new in0(this.e, Locale.getDefault());
            }
            this.a.setTimeInMillis(j);
            this.c = this.a.get(2);
            this.b = this.a.get(1);
            this.d = this.a.get(5);
        }

        public void a(a aVar) {
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
        }

        public void b(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public a(long j, TimeZone timeZone) {
            this.e = timeZone;
            c(j);
        }

        public a(in0 in0, TimeZone timeZone) {
            this.e = timeZone;
            this.b = in0.get(1);
            this.c = in0.get(2);
            this.d = in0.get(5);
        }

        public a(int i, int i2, int i3) {
            b(i, i2, i3);
        }
    }
}
