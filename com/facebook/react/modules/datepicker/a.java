package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.c;
import java.util.Calendar;
import java.util.Locale;
import vigqyno.C0201;

@SuppressLint({"ValidFragment"})
/* compiled from: DatePickerDialogFragment */
public class a extends c {
    private DatePickerDialog.OnDateSetListener l;
    private DialogInterface.OnDismissListener m;

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.modules.datepicker.a$a  reason: collision with other inner class name */
    /* compiled from: DatePickerDialogFragment */
    public static /* synthetic */ class C0043a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            iArr[b.CALENDAR.ordinal()] = 1;
            a[b.SPINNER.ordinal()] = 2;
            try {
                a[b.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x011b  */
    public static Dialog D(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        c cVar;
        Calendar instance = Calendar.getInstance();
        if (bundle != null) {
            String r1 = C0201.m82(35409);
            if (bundle.containsKey(r1)) {
                instance.setTimeInMillis(bundle.getLong(r1));
            }
        }
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        b bVar = b.DEFAULT;
        c cVar2 = null;
        if (bundle != null) {
            String r4 = C0201.m82(35410);
            if (bundle.getString(r4, null) != null) {
                bVar = b.valueOf(bundle.getString(r4).toUpperCase(Locale.US));
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int i4 = C0043a.a[bVar.ordinal()];
            if (i4 == 1) {
                cVar = new c(context, context.getResources().getIdentifier(C0201.m82(35411), C0201.m82(35412), context.getPackageName()), onDateSetListener, i, i2, i3);
            } else if (i4 == 2) {
                cVar = new c(context, 16973939, onDateSetListener, i, i2, i3);
                cVar.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } else if (i4 == 3) {
                cVar = new c(context, onDateSetListener, i, i2, i3);
            }
            cVar2 = cVar;
        } else {
            c cVar3 = new c(context, onDateSetListener, i, i2, i3);
            int i5 = C0043a.a[bVar.ordinal()];
            if (i5 == 1) {
                cVar3.getDatePicker().setCalendarViewShown(true);
                cVar3.getDatePicker().setSpinnersShown(false);
            } else if (i5 == 2) {
                cVar3.getDatePicker().setCalendarViewShown(false);
            }
            cVar2 = cVar3;
        }
        DatePicker datePicker = cVar2.getDatePicker();
        if (bundle != null) {
            String r5 = C0201.m82(35413);
            if (bundle.containsKey(r5)) {
                instance.setTimeInMillis(bundle.getLong(r5));
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                datePicker.setMinDate(instance.getTimeInMillis());
                if (bundle != null) {
                    String r52 = C0201.m82(35414);
                    if (bundle.containsKey(r52)) {
                        instance.setTimeInMillis(bundle.getLong(r52));
                        instance.set(11, 23);
                        instance.set(12, 59);
                        instance.set(13, 59);
                        instance.set(14, 999);
                        datePicker.setMaxDate(instance.getTimeInMillis());
                    }
                }
                return cVar2;
            }
        }
        datePicker.setMinDate(-2208988800001L);
        if (bundle != null) {
        }
        return cVar2;
    }

    public void E(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.l = onDateSetListener;
    }

    public void F(DialogInterface.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
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
