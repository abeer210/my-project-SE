package net.alhazmy13.hijridatepicker.date.hijri;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import net.alhazmy13.hijridatepicker.d;
import net.alhazmy13.hijridatepicker.date.hijri.c;
import net.alhazmy13.hijridatepicker.f;
import vigqyno.C0201;

/* compiled from: YearPickerView */
public class i extends ListView implements AdapterView.OnItemClickListener, c.AbstractC0158c {
    private final a a;
    private b b;
    private int c;
    private int d;
    private TextViewWithCircularIndicator e;

    /* access modifiers changed from: package-private */
    /* compiled from: YearPickerView */
    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void run() {
            i.this.setSelectionFromTop(this.a, this.b);
            i.this.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: YearPickerView */
    public final class b extends BaseAdapter {
        private final int a;
        private final int b;

        public b(int i, int i2) {
            if (i <= i2) {
                this.a = i;
                this.b = i2;
                return;
            }
            throw new IllegalArgumentException(C0201.m82(10658));
        }

        public int getCount() {
            return (this.b - this.a) + 1;
        }

        public Object getItem(int i) {
            return Integer.valueOf(this.a + i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            TextViewWithCircularIndicator textViewWithCircularIndicator;
            if (view != null) {
                textViewWithCircularIndicator = (TextViewWithCircularIndicator) view;
            } else {
                textViewWithCircularIndicator = (TextViewWithCircularIndicator) LayoutInflater.from(viewGroup.getContext()).inflate(f.hdp_mdtp_hijri_year_label_text_view, viewGroup, false);
                textViewWithCircularIndicator.d(i.this.a.k(), i.this.a.l());
            }
            int i2 = this.a + i;
            boolean z = i.this.a.q().b == i2;
            textViewWithCircularIndicator.setText(String.format(i.this.a.r(), C0201.m82(10659), Integer.valueOf(i2)));
            textViewWithCircularIndicator.b(z);
            textViewWithCircularIndicator.requestLayout();
            if (z) {
                i.this.e = textViewWithCircularIndicator;
            }
            return textViewWithCircularIndicator;
        }
    }

    public i(Context context, a aVar) {
        super(context);
        this.a = aVar;
        aVar.n(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources resources = context.getResources();
        this.c = resources.getDimensionPixelOffset(d.mdtp_date_picker_view_animator_height);
        this.d = resources.getDimensionPixelOffset(d.mdtp_year_label_height);
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(this.d / 3);
        e();
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        a();
    }

    private static int d(TextView textView) {
        return Integer.valueOf(textView.getText().toString()).intValue();
    }

    private void e() {
        b bVar = new b(this.a.p(), this.a.o());
        this.b = bVar;
        setAdapter((ListAdapter) bVar);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.c.AbstractC0158c
    public void a() {
        this.b.notifyDataSetChanged();
        f(this.a.q().b - this.a.p());
    }

    public void f(int i) {
        g(i, (this.c / 2) - (this.d / 2));
    }

    public void g(int i, int i2) {
        post(new a(i, i2));
    }

    public int getFirstPositionOffset() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return childAt.getTop();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4096) {
            accessibilityEvent.setFromIndex(0);
            accessibilityEvent.setToIndex(0);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        w30.l(view, i);
        try {
            this.a.a();
            TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) view;
            if (textViewWithCircularIndicator != null) {
                if (textViewWithCircularIndicator != this.e) {
                    if (this.e != null) {
                        this.e.b(false);
                        this.e.requestLayout();
                    }
                    textViewWithCircularIndicator.b(true);
                    textViewWithCircularIndicator.requestLayout();
                    this.e = textViewWithCircularIndicator;
                }
                this.a.m(d(textViewWithCircularIndicator));
                this.b.notifyDataSetChanged();
            }
        } finally {
            w30.m();
        }
    }
}
