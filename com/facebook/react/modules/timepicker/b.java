package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.c;
import java.util.Calendar;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: TimePickerDialogFragment */
public class b extends c {
    private TimePickerDialog.OnTimeSetListener l;
    private DialogInterface.OnDismissListener m;

    public static Dialog D(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(12);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        c cVar = c.DEFAULT;
        if (bundle != null) {
            String r9 = C0201.m82(36878);
            if (bundle.getString(r9, null) != null) {
                cVar = c.valueOf(bundle.getString(r9).toUpperCase(Locale.US));
            }
        }
        if (bundle != null) {
            i = bundle.getInt(C0201.m82(36879), instance.get(11));
            i2 = bundle.getInt(C0201.m82(36880), instance.get(12));
            is24HourFormat = bundle.getBoolean(C0201.m82(36881), DateFormat.is24HourFormat(context));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            c cVar2 = c.CLOCK;
            String r1 = C0201.m82(36882);
            if (cVar == cVar2) {
                return new a(context, context.getResources().getIdentifier(C0201.m82(36883), r1, context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            } else if (cVar == c.SPINNER) {
                return new a(context, context.getResources().getIdentifier(C0201.m82(36884), r1, context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
        }
        return new a(context, onTimeSetListener, i, i2, is24HourFormat);
    }

    public void E(DialogInterface.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    public void F(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.l = onTimeSetListener;
    }

    @Override // androidx.fragment.app.c
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog y(Bundle bundle) {
        return D(getArguments(), getActivity(), this.l);
    }
}
