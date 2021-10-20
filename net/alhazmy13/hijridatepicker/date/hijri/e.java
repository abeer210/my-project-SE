package net.alhazmy13.hijridatepicker.date.hijri;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import net.alhazmy13.hijridatepicker.c;
import net.alhazmy13.hijridatepicker.date.hijri.d;
import net.alhazmy13.hijridatepicker.g;
import net.alhazmy13.hijridatepicker.i;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: MonthView */
public abstract class e extends View {
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    public static int M;
    public static int N;
    public static int O;
    public static int P;
    private boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    private int H = 0;
    public a a;
    public int b = 0;
    private String c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    private final StringBuilder h;
    public int i;
    public int j;
    public int k;
    public int l = I;
    public boolean m = false;
    public int n = -1;
    public int o = -1;
    public int p = 1;
    public int q = 7;
    public int u = 7;
    private final in0 v;
    public final in0 w;
    private final a x;
    public int y = 6;
    public b z;

    /* access modifiers changed from: protected */
    /* compiled from: MonthView */
    public class a extends g4 {
        private final Rect q = new Rect();
        private final in0 r = new in0(e.this.a.getTimeZone(), e.this.a.r());

        public a(View view) {
            super(view);
        }

        @Override // defpackage.g4
        public int C(float f, float f2) {
            int i = e.this.i(f, f2);
            return i >= 0 ? i : C0188.f23;
        }

        @Override // defpackage.g4
        public void D(List<Integer> list) {
            for (int i = 1; i <= e.this.u; i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // defpackage.g4
        public boolean M(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            e.this.n(i);
            return true;
        }

        @Override // defpackage.g4
        public void O(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(b0(i));
        }

        @Override // defpackage.g4
        public void Q(int i, w3 w3Var) {
            a0(i, this.q);
            w3Var.d0(b0(i));
            w3Var.V(this.q);
            w3Var.a(16);
            if (i == e.this.n) {
                w3Var.u0(true);
            }
        }

        public void Z() {
            int A = A();
            if (A != Integer.MIN_VALUE) {
                b(e.this).e(A, 128, null);
            }
        }

        public void a0(int i, Rect rect) {
            e eVar = e.this;
            int i2 = eVar.b;
            int monthHeaderSize = eVar.getMonthHeaderSize();
            e eVar2 = e.this;
            int i3 = eVar2.l;
            int i4 = (eVar2.k - (eVar2.b * 2)) / eVar2.q;
            int h = (i - 1) + eVar2.h();
            int i5 = e.this.q;
            int i6 = i2 + ((h % i5) * i4);
            int i7 = monthHeaderSize + ((h / i5) * i3);
            rect.set(i6, i7, i4 + i6, i3 + i7);
        }

        public CharSequence b0(int i) {
            in0 in0 = this.r;
            e eVar = e.this;
            in0.set(eVar.j, eVar.i, i);
            CharSequence format = DateFormat.format(C0201.m82(4891), this.r.getTimeInMillis());
            e eVar2 = e.this;
            if (i != eVar2.n) {
                return format;
            }
            return eVar2.getContext().getString(g.mdtp_item_is_selected, format);
        }

        public void c0(int i) {
            b(e.this).e(i, 64, null);
        }
    }

    /* compiled from: MonthView */
    public interface b {
        void a(e eVar, d.a aVar);
    }

    static {
        C0201.m83(e.class, 513);
    }

    public e(Context context, AttributeSet attributeSet, a aVar) {
        super(context, attributeSet);
        boolean z2 = false;
        this.a = aVar;
        Resources resources = context.getResources();
        this.w = new in0(this.a.getTimeZone(), this.a.r());
        this.v = new in0(this.a.getTimeZone(), this.a.r());
        resources.getString(g.mdtp_day_of_week_label_typeface);
        this.c = resources.getString(g.mdtp_sans_serif);
        a aVar2 = this.a;
        if (aVar2 != null && aVar2.l()) {
            z2 = true;
        }
        if (z2) {
            this.B = androidx.core.content.b.d(context, c.mdtp_date_picker_text_normal_dark_theme);
            this.D = androidx.core.content.b.d(context, c.mdtp_date_picker_month_day_dark_theme);
            this.G = androidx.core.content.b.d(context, c.mdtp_date_picker_text_disabled_dark_theme);
            this.F = androidx.core.content.b.d(context, c.mdtp_date_picker_text_highlighted_dark_theme);
        } else {
            this.B = androidx.core.content.b.d(context, c.mdtp_date_picker_text_normal);
            this.D = androidx.core.content.b.d(context, c.mdtp_date_picker_month_day);
            this.G = androidx.core.content.b.d(context, c.mdtp_date_picker_text_disabled);
            this.F = androidx.core.content.b.d(context, c.mdtp_date_picker_text_highlighted);
        }
        this.C = androidx.core.content.b.d(context, c.mdtp_white);
        this.E = this.a.k();
        androidx.core.content.b.d(context, c.mdtp_white);
        this.h = new StringBuilder(50);
        new Formatter(this.h, this.a.r());
        L = resources.getDimensionPixelSize(net.alhazmy13.hijridatepicker.d.mdtp_day_number_size);
        M = resources.getDimensionPixelSize(net.alhazmy13.hijridatepicker.d.mdtp_month_label_size);
        N = resources.getDimensionPixelSize(net.alhazmy13.hijridatepicker.d.mdtp_month_day_label_text_size);
        O = resources.getDimensionPixelOffset(net.alhazmy13.hijridatepicker.d.mdtp_month_list_item_header_height);
        P = resources.getDimensionPixelSize(net.alhazmy13.hijridatepicker.d.mdtp_day_number_select_circle_radius);
        this.l = (resources.getDimensionPixelOffset(net.alhazmy13.hijridatepicker.d.mdtp_date_picker_view_animator_height) - getMonthHeaderSize()) / 6;
        a monthViewTouchHelper = getMonthViewTouchHelper();
        this.x = monthViewTouchHelper;
        k3.h0(this, monthViewTouchHelper);
        k3.q0(this, 1);
        this.A = true;
        l();
    }

    private int b() {
        int h2 = h();
        int i2 = this.u;
        int i3 = this.q;
        return ((h2 + i2) / i3) + ((h2 + i2) % i3 > 0 ? 1 : 0);
    }

    private String getMonthAndYearString() {
        String str;
        Locale r = this.a.r();
        if (Build.VERSION.SDK_INT < 18) {
            str = getContext().getResources().getString(g.mdtp_date_v1_monthyear);
        } else {
            str = DateFormat.getBestDateTimePattern(r, C0201.m82(20288));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, r);
        simpleDateFormat.setTimeZone(this.a.getTimeZone());
        simpleDateFormat.applyLocalizedPattern(str);
        this.h.setLength(0);
        return this.v.getDisplayName(2, 2, r) + C0201.m82(20289) + this.v.get(1);
    }

    private String k(in0 in0) {
        Locale r = this.a.r();
        if (Build.VERSION.SDK_INT >= 18) {
            return new SimpleDateFormat(C0201.m82(20296), r).format(in0.getTime());
        }
        String format = new SimpleDateFormat(C0201.m82(20290), r).format(in0.getTime());
        String substring = format.toUpperCase(r).substring(0, 1);
        if (r.equals(Locale.CHINA) || r.equals(Locale.CHINESE) || r.equals(Locale.SIMPLIFIED_CHINESE) || r.equals(Locale.TRADITIONAL_CHINESE)) {
            int length = format.length();
            substring = format.substring(length - 1, length);
        }
        if (r.getLanguage().equals(C0201.m82(20291)) || r.getLanguage().equals(C0201.m82(20292))) {
            if (this.w.get(7) != 7) {
                int length2 = format.length();
                substring = format.substring(length2 - 2, length2 - 1);
            } else {
                substring = format.toUpperCase(r).substring(0, 1);
            }
        }
        if (r.getLanguage().equals(C0201.m82(20293))) {
            substring = format.toLowerCase().substring(0, 2);
        }
        return (!r.getLanguage().equals(C0201.m82(20294)) || in0.get(7) != 4) ? substring : C0201.m82(20295);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void n(int i2) {
        if (!this.a.j(this.j, this.i, i2)) {
            b bVar = this.z;
            if (bVar != null) {
                bVar.a(this, new d.a(this.j, this.i, i2));
            }
            this.x.X(i2, 1);
        }
    }

    private boolean q(int i2, in0 in0) {
        if (this.j == in0.get(1) && this.i == in0.get(2) && i2 == in0.get(5)) {
            return true;
        }
        return false;
    }

    public void c() {
        this.x.Z();
    }

    public abstract void d(Canvas canvas, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.x.v(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public void e(Canvas canvas) {
        int monthHeaderSize = getMonthHeaderSize() - (N / 2);
        int i2 = (this.k - (this.b * 2)) / (this.q * 2);
        int i3 = 0;
        while (true) {
            int i4 = this.q;
            if (i3 < i4) {
                int i5 = (((i3 * 2) + 1) * i2) + this.b;
                this.w.set(7, (this.p + i3) % i4);
                canvas.drawText(k(this.w), (float) i5, (float) monthHeaderSize, this.g);
                i3++;
            } else {
                return;
            }
        }
    }

    public void f(Canvas canvas) {
        int monthHeaderSize = (((this.l + L) / 2) - K) + getMonthHeaderSize();
        float f2 = ((float) (this.k - (this.b * 2))) / (((float) this.q) * 2.0f);
        int i2 = monthHeaderSize;
        int h2 = h();
        for (int i3 = 1; i3 <= this.u; i3++) {
            int i4 = (int) ((((float) ((h2 * 2) + 1)) * f2) + ((float) this.b));
            int i5 = this.l;
            float f3 = (float) i4;
            int i6 = i2 - (((L + i5) / 2) - K);
            d(canvas, this.j, this.i, i3, i4, i2, (int) (f3 - f2), (int) (f3 + f2), i6, i6 + i5);
            h2++;
            if (h2 == this.q) {
                i2 += this.l;
                h2 = 0;
            }
        }
    }

    public void g(Canvas canvas) {
        canvas.drawText(getMonthAndYearString(), (float) ((this.k + (this.b * 2)) / 2), (float) ((getMonthHeaderSize() - N) / 2), this.e);
    }

    public d.a getAccessibilityFocus() {
        int A2 = this.x.A();
        if (A2 >= 0) {
            return new d.a(this.j, this.i, A2);
        }
        return null;
    }

    public int getMonth() {
        return this.i;
    }

    public int getMonthHeaderSize() {
        return O;
    }

    public a getMonthViewTouchHelper() {
        return new a(this);
    }

    public int getYear() {
        return this.j;
    }

    public int h() {
        int i2 = this.H;
        if (i2 < this.p) {
            i2 += this.q;
        }
        return i2 - this.p;
    }

    public int i(float f2, float f3) {
        int j2 = j(f2, f3);
        if (j2 < 1 || j2 > this.u) {
            return -1;
        }
        return j2;
    }

    public int j(float f2, float f3) {
        int i2 = this.b;
        float f4 = (float) i2;
        if (f2 < f4 || f2 > ((float) (this.k - i2))) {
            return -1;
        }
        return (((int) (((f2 - f4) * ((float) this.q)) / ((float) ((this.k - i2) - this.b)))) - h()) + 1 + ((((int) (f3 - ((float) getMonthHeaderSize()))) / this.l) * this.q);
    }

    public void l() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setFakeBoldText(true);
        this.e.setAntiAlias(true);
        this.e.setTextSize((float) M);
        this.e.setTypeface(Typeface.create(this.c, 1));
        this.e.setColor(this.B);
        this.e.setTextAlign(Paint.Align.CENTER);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setTextLocale(this.a.r());
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setFakeBoldText(true);
        this.f.setAntiAlias(true);
        this.f.setColor(this.E);
        this.f.setTextAlign(Paint.Align.CENTER);
        this.f.setStyle(Paint.Style.FILL);
        this.f.setAlpha(255);
        Paint paint3 = new Paint();
        this.g = paint3;
        paint3.setAntiAlias(true);
        this.g.setTextSize((float) N);
        this.g.setColor(this.D);
        this.g.setTypeface(i.a(getContext(), C0201.m82(20297)));
        this.g.setStyle(Paint.Style.FILL);
        this.g.setTextAlign(Paint.Align.CENTER);
        this.g.setFakeBoldText(true);
        this.g.setTextLocale(this.a.r());
        Paint paint4 = new Paint();
        this.d = paint4;
        paint4.setAntiAlias(true);
        this.d.setTextSize((float) L);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setTextAlign(Paint.Align.CENTER);
        this.d.setFakeBoldText(false);
        this.d.setTextLocale(this.a.r());
    }

    public boolean m(int i2, int i3, int i4) {
        return this.a.d(i2, i3, i4);
    }

    public boolean o(d.a aVar) {
        int i2;
        if (aVar.b != this.j || aVar.c != this.i || (i2 = aVar.d) > this.u) {
            return false;
        }
        this.x.c0(i2);
        return true;
    }

    public void onDraw(Canvas canvas) {
        g(canvas);
        e(canvas);
        f(canvas);
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.MeasureSpec.getSize(i2), (this.l * this.y) + getMonthHeaderSize() + 5);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.k = i2;
        this.x.F();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        if (motionEvent.getAction() == 1 && (i2 = i(motionEvent.getX(), motionEvent.getY())) >= 0) {
            n(i2);
        }
        return true;
    }

    public void p() {
        this.y = 6;
        requestLayout();
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (!this.A) {
            super.setAccessibilityDelegate(accessibilityDelegate);
        }
    }

    public void setDatePickerController(a aVar) {
        this.a = aVar;
    }

    public void setMonthParams(HashMap<String, Integer> hashMap) {
        String r0 = C0201.m82(20298);
        boolean containsKey = hashMap.containsKey(r0);
        String r2 = C0201.m82(20299);
        if (containsKey || hashMap.containsKey(r2)) {
            setTag(hashMap);
            String r1 = C0201.m82(20301);
            if (hashMap.containsKey(r1)) {
                int intValue = hashMap.get(r1).intValue();
                this.l = intValue;
                int i2 = J;
                if (intValue < i2) {
                    this.l = i2;
                }
            }
            String r12 = C0201.m82(20302);
            if (hashMap.containsKey(r12)) {
                this.n = hashMap.get(r12).intValue();
            }
            this.i = hashMap.get(r0).intValue();
            this.j = hashMap.get(r2).intValue();
            in0 in0 = new in0(this.a.getTimeZone(), this.a.r());
            int i3 = 0;
            this.m = false;
            this.o = -1;
            this.v.set(2, this.i);
            this.v.set(1, this.j);
            this.v.set(5, 1);
            this.H = this.v.get(7);
            String r22 = C0201.m82(20303);
            if (hashMap.containsKey(r22)) {
                this.p = hashMap.get(r22).intValue();
            } else {
                this.p = this.v.getFirstDayOfWeek();
            }
            this.u = in0.e(this.v.get(1), this.v.get(2));
            while (i3 < this.u) {
                i3++;
                if (q(i3, in0)) {
                    this.m = true;
                    this.o = i3;
                }
            }
            this.y = b();
            this.x.F();
            return;
        }
        throw new InvalidParameterException(C0201.m82(20300));
    }

    public void setOnDayClickListener(b bVar) {
        this.z = bVar;
    }

    public void setSelectedDay(int i2) {
        this.n = i2;
    }
}
