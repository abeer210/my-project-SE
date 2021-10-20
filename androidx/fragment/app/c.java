package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import vigqyno.C0201;

/* compiled from: DialogFragment */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler a;
    private Runnable b = new a();
    public int c = 0;
    public int d = 0;
    public boolean e = true;
    public boolean f = true;
    public int g = -1;
    public Dialog h;
    public boolean i;
    public boolean j;
    public boolean k;

    /* compiled from: DialogFragment */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.h;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    public void A(boolean z) {
        this.f = z;
    }

    public void B(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void C(i iVar, String str) {
        this.j = false;
        this.k = true;
        n a2 = iVar.a();
        a2.b(this, str);
        a2.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        if (this.f) {
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.h.setContentView(view);
                } else {
                    throw new IllegalStateException(C0201.m82(19709));
                }
            }
            d activity = getActivity();
            if (activity != null) {
                this.h.setOwnerActivity(activity);
            }
            this.h.setCancelable(this.e);
            this.h.setOnCancelListener(this);
            this.h.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle(C0201.m82(19710))) != null) {
                this.h.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.k) {
            this.j = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new Handler();
        this.f = this.mContainerId == 0;
        if (bundle != null) {
            this.c = bundle.getInt(C0201.m82(19711), 0);
            this.d = bundle.getInt(C0201.m82(19712), 0);
            this.e = bundle.getBoolean(C0201.m82(19713), true);
            this.f = bundle.getBoolean(C0201.m82(19714), this.f);
            this.g = bundle.getInt(C0201.m82(19715), -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.h;
        if (dialog != null) {
            this.i = true;
            dialog.setOnDismissListener(null);
            this.h.dismiss();
            if (!this.j) {
                onDismiss(this.h);
            }
            this.h = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.k && !this.j) {
            this.j = true;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.i) {
            u(true, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.f) {
            return super.onGetLayoutInflater(bundle);
        }
        Dialog y = y(bundle);
        this.h = y;
        String r0 = C0201.m82(19716);
        if (y == null) {
            return (LayoutInflater) this.mHost.f().getSystemService(r0);
        }
        B(y, this.c);
        return (LayoutInflater) this.h.getContext().getSystemService(r0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.h;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle(C0201.m82(19717), onSaveInstanceState);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(C0201.m82(19718), i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt(C0201.m82(19719), i3);
        }
        boolean z = this.e;
        if (!z) {
            bundle.putBoolean(C0201.m82(19720), z);
        }
        boolean z2 = this.f;
        if (!z2) {
            bundle.putBoolean(C0201.m82(19721), z2);
        }
        int i4 = this.g;
        if (i4 != -1) {
            bundle.putInt(C0201.m82(19722), i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.h;
        if (dialog != null) {
            this.i = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.h;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void t() {
        u(false, false);
    }

    public void u(boolean z, boolean z2) {
        if (!this.j) {
            this.j = true;
            this.k = false;
            Dialog dialog = this.h;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.h.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.a.getLooper()) {
                        onDismiss(this.h);
                    } else {
                        this.a.post(this.b);
                    }
                }
            }
            this.i = true;
            if (this.g >= 0) {
                requireFragmentManager().g(this.g, 1);
                this.g = -1;
                return;
            }
            n a2 = requireFragmentManager().a();
            a2.g(this);
            if (z) {
                a2.e();
            } else {
                a2.d();
            }
        }
    }

    public Dialog v() {
        return this.h;
    }

    public int w() {
        return this.d;
    }

    public boolean x() {
        return this.e;
    }

    public Dialog y(Bundle bundle) {
        return new Dialog(requireContext(), w());
    }

    public void z(boolean z) {
        this.e = z;
        Dialog dialog = this.h;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }
}
