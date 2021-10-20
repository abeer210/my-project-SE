package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* compiled from: DismissableDatePickerDialog */
public class c extends DatePickerDialog {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;

    static {
        C0201.m83(c.class, 109);
    }

    public c(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, onDateSetListener, i, i2, i3);
        b(context, i, i2, i3);
    }

    private static Field a(Class cls, Class cls2, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            return null;
        }
    }

    private void b(Context context, int i, int i2, int i3) {
        String str = b;
        if (Build.VERSION.SDK_INT == 24) {
            try {
                Class<?> cls = Class.forName(g);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, (int[]) cls.getField(e).get(null), 16843612, 0);
                int i4 = obtainStyledAttributes.getInt(cls.getField(a).getInt(null), 2);
                obtainStyledAttributes.recycle();
                if (i4 == 2) {
                    DatePicker datePicker = (DatePicker) a(DatePickerDialog.class, DatePicker.class, f).get(this);
                    Field a2 = a(DatePicker.class, Class.forName(str), c);
                    Object obj = a2.get(datePicker);
                    if (obj.getClass() != Class.forName(str)) {
                        a2.set(datePicker, null);
                        datePicker.removeAllViews();
                        Method declaredMethod = DatePicker.class.getDeclaredMethod(d, Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE);
                        declaredMethod.setAccessible(true);
                        a2.set(datePicker, declaredMethod.invoke(datePicker, context, null, 16843612, 0));
                        datePicker.setCalendarViewShown(false);
                        datePicker.init(i, i2, i3, this);
                    }
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

    public c(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        b(context, i2, i3, i4);
    }
}
