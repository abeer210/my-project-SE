package defpackage;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* renamed from: wo0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class wo0 extends DialogFragment {
    private Dialog a = null;
    private DialogInterface.OnCancelListener b = null;

    public static wo0 a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        wo0 wo0 = new wo0();
        u.l(dialog, C0201.m82(36993));
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        wo0.a = dialog2;
        if (onCancelListener != null) {
            wo0.b = onCancelListener;
        }
        return wo0;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.a == null) {
            setShowsDialog(false);
        }
        return this.a;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
