package com.reactcommunity.rndatetimepicker;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: MinuteIntervalSnappableTimePickerDialog */
public class b extends TimePickerDialog {
    private TimePicker a;
    private int b;
    private j c;
    private final TimePickerDialog.OnTimeSetListener d;
    private Handler e = new Handler();
    private Runnable f;
    private Context g;

    /* access modifiers changed from: package-private */
    /* compiled from: MinuteIntervalSnappableTimePickerDialog */
    public class a implements Runnable {
        public final /* synthetic */ TimePicker a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ EditText d;

        public a(TimePicker timePicker, int i, int i2, EditText editText) {
            this.a = timePicker;
            this.b = i;
            this.c = i2;
            this.d = editText;
        }

        public void run() {
            if (b.this.i()) {
                this.a.setCurrentHour(Integer.valueOf(this.b));
                this.a.setCurrentMinute(Integer.valueOf(this.c));
                EditText editText = this.d;
                editText.setSelection(editText.getText().length());
                return;
            }
            this.a.setCurrentHour(Integer.valueOf(this.b));
            this.a.setCurrentMinute(0);
            this.a.setCurrentMinute(Integer.valueOf(this.c));
        }
    }

    public b(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, int i3, boolean z, j jVar) {
        super(context, onTimeSetListener, i, i2, z);
        this.b = i3;
        this.d = onTimeSetListener;
        this.c = jVar;
        this.g = context;
    }

    private void b(String str) {
        if (f()) {
            throw new RuntimeException(str);
        }
    }

    private void c(TimePicker timePicker, int i, int i2) {
        b(C0201.m82(36161));
        a aVar = new a(timePicker, i, i2, (EditText) timePicker.findFocus());
        this.f = aVar;
        this.e.postDelayed(aVar, 500);
    }

    private int d() {
        return e(this.a.getCurrentMinute().intValue());
    }

    private int e(int i) {
        return this.c == j.SPINNER ? i * this.b : i;
    }

    private boolean f() {
        return this.c == j.SPINNER;
    }

    public static boolean g(int i) {
        return i >= 1 && i <= 30 && 60 % i == 0;
    }

    private boolean h(int i) {
        b(C0201.m82(36162));
        return m() && i != l(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean i() {
        View findViewById = findViewById(this.g.getResources().getIdentifier(C0201.m82(36163), C0201.m82(36164), C0201.m82(36165)));
        return findViewById != null && findViewById.hasFocus();
    }

    @SuppressLint({"DefaultLocale"})
    private void j() {
        NumberPicker numberPicker = (NumberPicker) findViewById(this.g.getResources().getIdentifier(C0201.m82(36166), C0201.m82(36167), C0201.m82(36168)));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue((60 / this.b) - 1);
        ArrayList arrayList = new ArrayList(60 / this.b);
        int i = 0;
        while (i < 60) {
            arrayList.add(String.format(C0201.m82(36169), Integer.valueOf(i)));
            i += this.b;
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    private void k() {
        TimePicker timePicker = (TimePicker) findViewById(this.g.getResources().getIdentifier(C0201.m82(36170), C0201.m82(36171), C0201.m82(36172)));
        this.a = timePicker;
        int intValue = timePicker.getCurrentMinute().intValue();
        if (f()) {
            j();
            this.a.setCurrentMinute(Integer.valueOf(l(intValue) / this.b));
            return;
        }
        this.a.setCurrentMinute(Integer.valueOf(l(intValue)));
    }

    private int l(int i) {
        int round = Math.round(((float) i) / ((float) this.b));
        int i2 = this.b;
        int i3 = round * i2;
        return i3 == 60 ? i3 - i2 : i3;
    }

    private boolean m() {
        return this.b != 1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            k();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.a == null || i != -1 || !m()) {
            super.onClick(dialogInterface, i);
            return;
        }
        int intValue = this.a.getCurrentHour().intValue();
        int d2 = d();
        if (!f()) {
            d2 = l(d2);
        }
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.d;
        if (onTimeSetListener != null) {
            onTimeSetListener.onTimeSet(this.a, intValue, d2);
        }
    }

    public void onDetachedFromWindow() {
        this.e.removeCallbacks(this.f);
        super.onDetachedFromWindow();
    }

    public void onTimeChanged(TimePicker timePicker, int i, int i2) {
        int e2 = e(i2);
        this.e.removeCallbacks(this.f);
        if (f() || !h(e2)) {
            super.onTimeChanged(timePicker, i, i2);
        } else {
            c(timePicker, i, l(e2));
        }
    }

    public void updateTime(int i, int i2) {
        if (!m()) {
            super.updateTime(i, i2);
        } else if (f()) {
            super.updateTime(i, l(d()) / this.b);
        } else {
            super.updateTime(i, l(i2));
        }
    }

    public b(Context context, int i, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i2, int i3, int i4, boolean z, j jVar) {
        super(context, i, onTimeSetListener, i2, i3, z);
        this.b = i4;
        this.d = onTimeSetListener;
        this.c = jVar;
        this.g = context;
    }
}
