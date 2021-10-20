package com.reactcommunity.rndatetimepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.c;
import java.util.Calendar;
import java.util.Locale;
import vigqyno.C0201;

@SuppressLint({"ValidFragment"})
/* compiled from: RNDatePickerDialogFragment */
public class d extends c {
    private static DialogInterface.OnClickListener o;
    private DatePickerDialog l;
    private DatePickerDialog.OnDateSetListener m;
    private DialogInterface.OnDismissListener n;

    /* access modifiers changed from: package-private */
    /* compiled from: RNDatePickerDialogFragment */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            iArr[e.CALENDAR.ordinal()] = 1;
            a[e.SPINNER.ordinal()] = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    public static DatePickerDialog D(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog E = E(bundle, context, onDateSetListener);
        if (bundle != null) {
            String r9 = C0201.m82(36278);
            if (bundle.containsKey(r9)) {
                E.setButton(-3, bundle.getString(r9), o);
            }
        }
        DatePicker datePicker = E.getDatePicker();
        if (bundle != null) {
            String r5 = C0201.m82(36279);
            if (bundle.containsKey(r5)) {
                instance.setTimeInMillis(bundle.getLong(r5));
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                datePicker.setMinDate(instance.getTimeInMillis());
                if (bundle != null) {
                    String r52 = C0201.m82(36280);
                    if (bundle.containsKey(r52)) {
                        instance.setTimeInMillis(bundle.getLong(r52));
                        instance.set(11, 23);
                        instance.set(12, 59);
                        instance.set(13, 59);
                        instance.set(14, 999);
                        datePicker.setMaxDate(instance.getTimeInMillis());
                    }
                }
                return E;
            }
        }
        datePicker.setMinDate(-2208988800001L);
        if (bundle != null) {
        }
        return E;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    public static DatePickerDialog E(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        e eVar;
        c cVar = new c(bundle);
        int f = cVar.f();
        int d = cVar.d();
        int a2 = cVar.a();
        e eVar2 = e.DEFAULT;
        if (bundle != null) {
            String r3 = C0201.m82(36281);
            if (bundle.getString(r3, null) != null) {
                eVar = e.valueOf(bundle.getString(r3).toUpperCase(Locale.US));
                if (Build.VERSION.SDK_INT < 21) {
                    int i = a.a[eVar.ordinal()];
                    if (i != 1 && i != 2) {
                        return new g(context, onDateSetListener, f, d, a2, eVar);
                    }
                    return new g(context, context.getResources().getIdentifier(eVar == e.CALENDAR ? C0201.m82(36282) : C0201.m82(36283), C0201.m82(36284), context.getPackageName()), onDateSetListener, f, d, a2, eVar);
                }
                g gVar = new g(context, onDateSetListener, f, d, a2, eVar);
                int i2 = a.a[eVar.ordinal()];
                if (i2 == 1) {
                    gVar.getDatePicker().setCalendarViewShown(true);
                    gVar.getDatePicker().setSpinnersShown(false);
                } else if (i2 == 2) {
                    gVar.getDatePicker().setCalendarViewShown(false);
                }
                return gVar;
            }
        }
        eVar = eVar2;
        if (Build.VERSION.SDK_INT < 21) {
        }
    }

    public void F(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.m = onDateSetListener;
    }

    public void G(DialogInterface.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    public void H(DialogInterface.OnClickListener onClickListener) {
        o = onClickListener;
    }

    public void I(Bundle bundle) {
        c cVar = new c(bundle);
        this.l.updateDate(cVar.f(), cVar.d(), cVar.a());
    }

    @Override // androidx.fragment.app.c
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog y(Bundle bundle) {
        DatePickerDialog D = D(getArguments(), getActivity(), this.m);
        this.l = D;
        return D;
    }
}
