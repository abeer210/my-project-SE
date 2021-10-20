package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.huawei.hms.common.internal.Preconditions;
import vigqyno.C0201;

public class ErrorDialogFragment extends DialogFragment {
    private DialogInterface.OnCancelListener myCancelLister = null;
    private Dialog myDialog = null;

    public static ErrorDialogFragment newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.myCancelLister;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.myDialog == null) {
            setShowsDialog(false);
        }
        return this.myDialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Preconditions.checkNotNull(fragmentManager, C0201.m82(33436));
        super.show(fragmentManager, str);
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        Preconditions.checkNotNull(dialog, C0201.m82(33435));
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        errorDialogFragment.myDialog = dialog;
        dialog.setOnCancelListener(null);
        errorDialogFragment.myDialog.setOnDismissListener(null);
        if (onCancelListener != null) {
            errorDialogFragment.myCancelLister = onCancelListener;
        }
        return errorDialogFragment;
    }
}
