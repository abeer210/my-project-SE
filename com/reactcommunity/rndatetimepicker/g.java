package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* compiled from: RNDismissableDatePickerDialog */
public class g extends DatePickerDialog {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;

    static {
        C0201.m83(g.class, 114);
    }

    public g(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3, e eVar) {
        super(context, onDateSetListener, i, i2, i3);
        a(context, i, i2, i3, eVar);
    }

    private void a(Context context, int i, int i2, int i3, e eVar) {
        String str = b;
        if (Build.VERSION.SDK_INT == 24 && eVar == e.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName(d).getField(c).get(null), 16843612, 0).recycle();
                DatePicker datePicker = (DatePicker) k.a(DatePickerDialog.class, DatePicker.class, a).get(this);
                Field a2 = k.a(DatePicker.class, Class.forName(str), e);
                Object obj = a2.get(datePicker);
                if (obj.getClass() != Class.forName(str)) {
                    a2.set(datePicker, null);
                    datePicker.removeAllViews();
                    Method declaredMethod = DatePicker.class.getDeclaredMethod(f, Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    a2.set(datePicker, declaredMethod.invoke(datePicker, context, null, 16843612, 0));
                    datePicker.setCalendarViewShown(false);
                    datePicker.init(i, i2, i3, this);
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

    public g(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4, e eVar) {
        super(context, i, onDateSetListener, i2, i3, i4);
        a(context, i2, i3, i4, eVar);
    }
}
