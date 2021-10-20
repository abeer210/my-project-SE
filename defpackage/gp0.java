package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.i;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* renamed from: gp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class gp0 extends c {
    private Dialog l = null;
    private DialogInterface.OnCancelListener m = null;

    public static gp0 D(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        gp0 gp0 = new gp0();
        u.l(dialog, C0201.m82(31779));
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        gp0.l = dialog2;
        if (onCancelListener != null) {
            gp0.m = onCancelListener;
        }
        return gp0;
    }

    @Override // androidx.fragment.app.c
    public void C(i iVar, String str) {
        super.C(iVar, str);
    }

    @Override // androidx.fragment.app.c
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.m;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog y(Bundle bundle) {
        if (this.l == null) {
            A(false);
        }
        return this.l;
    }
}
