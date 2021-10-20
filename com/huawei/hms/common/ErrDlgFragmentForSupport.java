package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.huawei.hms.common.internal.Preconditions;
import vigqyno.C0201;

public class ErrDlgFragmentForSupport extends DialogFragment {
    private DialogInterface.OnCancelListener listener = null;
    private Dialog log = null;

    public static ErrDlgFragmentForSupport newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.listener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.log == null) {
            setShowsDialog(false);
        }
        return this.log;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Preconditions.checkNotNull(fragmentManager, C0201.m82(33800));
        super.show(fragmentManager, str);
    }

    public static ErrDlgFragmentForSupport newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        Preconditions.checkNotNull(dialog, C0201.m82(33799));
        ErrDlgFragmentForSupport errDlgFragmentForSupport = new ErrDlgFragmentForSupport();
        errDlgFragmentForSupport.log = dialog;
        dialog.setOnCancelListener(null);
        errDlgFragmentForSupport.log.setOnDismissListener(null);
        errDlgFragmentForSupport.listener = onCancelListener;
        return errDlgFragmentForSupport;
    }
}
