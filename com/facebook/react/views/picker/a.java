package com.facebook.react.views.picker;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.w;
import java.util.List;

/* compiled from: ReactPicker */
public class a extends w {
    private int j = 0;
    private c k;
    private List<c> l;
    private List<c> m;
    private Integer n;
    private Integer o;
    private Integer p;
    private final AdapterView.OnItemSelectedListener q = new C0049a();
    private final Runnable u = new b();

    /* renamed from: com.facebook.react.views.picker.a$a  reason: collision with other inner class name */
    /* compiled from: ReactPicker */
    class C0049a implements AdapterView.OnItemSelectedListener {
        public C0049a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            w30.n(view, i);
            try {
                if (a.this.k != null) {
                    a.this.k.a(i);
                }
            } finally {
                w30.o();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (a.this.k != null) {
                a.this.k.a(-1);
            }
        }
    }

    /* compiled from: ReactPicker */
    class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            aVar.measure(View.MeasureSpec.makeMeasureSpec(aVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(a.this.getHeight(), 1073741824));
            a aVar2 = a.this;
            aVar2.layout(aVar2.getLeft(), a.this.getTop(), a.this.getRight(), a.this.getBottom());
        }
    }

    /* compiled from: ReactPicker */
    public interface c {
        void a(int i);
    }

    public a(Context context, int i) {
        super(context, i);
        this.j = i;
    }

    public void d() {
        setOnItemSelectedListener(null);
        b bVar = (b) getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        List<c> list = this.m;
        if (!(list == null || list == this.l)) {
            this.l = list;
            this.m = null;
            if (bVar == null) {
                bVar = new b(getContext(), this.l);
                setAdapter((SpinnerAdapter) bVar);
            } else {
                bVar.clear();
                bVar.addAll(this.l);
                bVar.notifyDataSetChanged();
            }
        }
        Integer num = this.n;
        if (!(num == null || num.intValue() == selectedItemPosition)) {
            setSelection(this.n.intValue(), false);
            this.n = null;
        }
        Integer num2 = this.o;
        if (!(num2 == null || bVar == null || num2 == bVar.b())) {
            bVar.e(this.o);
            this.o = null;
        }
        Integer num3 = this.p;
        if (!(num3 == null || bVar == null || num3 == bVar.a())) {
            bVar.d(this.p);
            this.p = null;
        }
        setOnItemSelectedListener(this.q);
    }

    public int getMode() {
        return this.j;
    }

    public c getOnSelectListener() {
        return this.k;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.q);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.u);
    }

    public void setImmediateSelection(int i) {
        if (i != getSelectedItemPosition()) {
            setOnItemSelectedListener(null);
            setSelection(i, false);
            setOnItemSelectedListener(this.q);
        }
    }

    public void setOnSelectListener(c cVar) {
        this.k = cVar;
    }

    public void setStagedBackgroundColor(Integer num) {
        this.p = num;
    }

    public void setStagedItems(List<c> list) {
        this.m = list;
    }

    public void setStagedPrimaryTextColor(Integer num) {
        this.o = num;
    }

    public void setStagedSelection(int i) {
        this.n = Integer.valueOf(i);
    }
}
