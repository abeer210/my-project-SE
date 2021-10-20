package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TimePicker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import vigqyno.C0201;

/* compiled from: RNDismissableTimePickerDialog */
public class h extends b {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;

    static {
        C0201.m83(h.class, 113);
    }

    public h(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, int i3, boolean z, j jVar) {
        super(context, onTimeSetListener, i, i2, i3, z, jVar);
        n(context, i, i2, z, jVar);
    }

    private void n(Context context, int i, int i2, boolean z, j jVar) {
        if (Build.VERSION.SDK_INT == 24 && jVar == j.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName(a).getField(b).get(null), 16843933, 0).recycle();
                TimePicker timePicker = (TimePicker) k.a(TimePickerDialog.class, TimePicker.class, f).get(this);
                Field a2 = k.a(TimePicker.class, Class.forName(c), e);
                Object obj = a2.get(timePicker);
                Class<?> cls = Class.forName(d);
                if (obj.getClass() != cls) {
                    a2.set(timePicker, null);
                    timePicker.removeAllViews();
                    Constructor<?> constructor = cls.getConstructor(TimePicker.class, Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE);
                    constructor.setAccessible(true);
                    a2.set(timePicker, constructor.newInstance(timePicker, context, null, 16843933, 0));
                    timePicker.setIs24HourView(Boolean.valueOf(z));
                    timePicker.setCurrentHour(Integer.valueOf(i));
                    timePicker.setCurrentMinute(Integer.valueOf(i2));
                    timePicker.setOnTimeChangedListener(this);
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public void onStop() {
        if (Build.VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }

    public h(Context context, int i, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i2, int i3, int i4, boolean z, j jVar) {
        super(context, i, onTimeSetListener, i2, i3, i4, z, jVar);
        n(context, i2, i3, z, jVar);
    }
}
