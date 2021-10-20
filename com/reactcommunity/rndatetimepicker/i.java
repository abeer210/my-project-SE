package com.reactcommunity.rndatetimepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.c;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: RNTimePickerDialogFragment */
public class i extends c {
    private static DialogInterface.OnClickListener o;
    private TimePickerDialog l;
    private TimePickerDialog.OnTimeSetListener m;
    private DialogInterface.OnDismissListener n;

    /* access modifiers changed from: package-private */
    /* compiled from: RNTimePickerDialogFragment */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[j.values().length];
            a = iArr;
            iArr[j.CLOCK.ordinal()] = 1;
            a[j.SPINNER.ordinal()] = 2;
        }
    }

    public static TimePickerDialog D(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        TimePickerDialog E = E(bundle, context, onTimeSetListener);
        if (bundle != null) {
            String r3 = C0201.m82(36815);
            if (bundle.containsKey(r3)) {
                E.setButton(-3, bundle.getString(r3), o);
            }
        }
        return E;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    public static TimePickerDialog E(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        int i;
        j jVar;
        boolean z;
        int i2;
        c cVar = new c(bundle);
        int b = cVar.b();
        int c = cVar.c();
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        if (bundle != null) {
            String r3 = C0201.m82(36816);
            if (b.g(bundle.getInt(r3))) {
                i = bundle.getInt(r3);
                jVar = j.DEFAULT;
                if (bundle != null) {
                    String r6 = C0201.m82(36817);
                    if (bundle.getString(r6, null) != null) {
                        jVar = j.valueOf(bundle.getString(r6).toUpperCase(Locale.US));
                    }
                }
                z = bundle == null ? bundle.getBoolean(C0201.m82(36818), DateFormat.is24HourFormat(context)) : is24HourFormat;
                if (Build.VERSION.SDK_INT >= 21 || ((i2 = a.a[jVar.ordinal()]) != 1 && i2 != 2)) {
                    return new h(context, onTimeSetListener, b, c, i, z, jVar);
                }
                return new h(context, context.getResources().getIdentifier(jVar == j.CLOCK ? C0201.m82(36819) : C0201.m82(36820), C0201.m82(36821), context.getPackageName()), onTimeSetListener, b, c, i, z, jVar);
            }
        }
        i = 1;
        jVar = j.DEFAULT;
        if (bundle != null) {
        }
        if (bundle == null) {
        }
        if (Build.VERSION.SDK_INT >= 21) {
        }
        return new h(context, onTimeSetListener, b, c, i, z, jVar);
    }

    public void F(DialogInterface.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    public void G(DialogInterface.OnClickListener onClickListener) {
        o = onClickListener;
    }

    public void H(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.m = onTimeSetListener;
    }

    public void I(Bundle bundle) {
        c cVar = new c(bundle);
        this.l.updateTime(cVar.b(), cVar.c());
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
        TimePickerDialog D = D(getArguments(), getActivity(), this.m);
        this.l = D;
        return D;
    }
}
