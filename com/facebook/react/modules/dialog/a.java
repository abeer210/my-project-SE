package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.facebook.react.modules.dialog.DialogModule;
import vigqyno.C0201;

/* compiled from: AlertFragment */
public class a extends c implements DialogInterface.OnClickListener {
    private final DialogModule.b l;

    public a() {
        this.l = null;
    }

    public static Dialog D(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString(C0201.m82(1727)));
        String r0 = C0201.m82(1728);
        if (bundle.containsKey(r0)) {
            title.setPositiveButton(bundle.getString(r0), onClickListener);
        }
        String r02 = C0201.m82(1729);
        if (bundle.containsKey(r02)) {
            title.setNegativeButton(bundle.getString(r02), onClickListener);
        }
        String r03 = C0201.m82(1730);
        if (bundle.containsKey(r03)) {
            title.setNeutralButton(bundle.getString(r03), onClickListener);
        }
        String r04 = C0201.m82(1731);
        if (bundle.containsKey(r04)) {
            title.setMessage(bundle.getString(r04));
        }
        String r05 = C0201.m82(1732);
        if (bundle.containsKey(r05)) {
            title.setItems(bundle.getCharSequenceArray(r05), onClickListener);
        }
        return title.create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        DialogModule.b bVar = this.l;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i);
        }
    }

    @Override // androidx.fragment.app.c
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.l;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog y(Bundle bundle) {
        return D(getActivity(), getArguments(), this);
    }

    @SuppressLint({"ValidFragment"})
    public a(DialogModule.b bVar, Bundle bundle) {
        this.l = bVar;
        setArguments(bundle);
    }
}
