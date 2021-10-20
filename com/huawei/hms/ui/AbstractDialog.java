package com.huawei.hms.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

public abstract class AbstractDialog {
    private Activity a;
    private AlertDialog b;
    private Callback c;

    public interface Callback {
        void onCancel(AbstractDialog abstractDialog);

        void onDoWork(AbstractDialog abstractDialog);
    }

    private static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(C0201.m82(37111), null, null);
    }

    public void cancel() {
        AlertDialog alertDialog = this.b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    public void dismiss() {
        AlertDialog alertDialog = this.b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void fireCancel() {
        Callback callback = this.c;
        if (callback != null) {
            callback.onCancel(this);
        }
    }

    public void fireDoWork() {
        Callback callback = this.c;
        if (callback != null) {
            callback.onDoWork(this);
        }
    }

    public Activity getActivity() {
        return this.a;
    }

    public int getDialogThemeId() {
        return (a(this.a) == 0 || Build.VERSION.SDK_INT < 16) ? 3 : 0;
    }

    public AlertDialog onCreateDialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), getDialogThemeId());
        String onGetTitleString = onGetTitleString(activity);
        if (onGetTitleString != null) {
            builder.setTitle(onGetTitleString);
        }
        String onGetMessageString = onGetMessageString(activity);
        if (onGetMessageString != null) {
            builder.setMessage(onGetMessageString);
        }
        String onGetPositiveButtonString = onGetPositiveButtonString(activity);
        if (onGetPositiveButtonString != null) {
            builder.setPositiveButton(onGetPositiveButtonString, new DialogInterface.OnClickListener() {
                /* class com.huawei.hms.ui.AbstractDialog.AnonymousClass1 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    AbstractDialog.this.fireDoWork();
                }
            });
        }
        String onGetNegativeButtonString = onGetNegativeButtonString(activity);
        if (onGetNegativeButtonString != null) {
            builder.setNegativeButton(onGetNegativeButtonString, new DialogInterface.OnClickListener() {
                /* class com.huawei.hms.ui.AbstractDialog.AnonymousClass2 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    AbstractDialog.this.cancel();
                }
            });
        }
        return builder.create();
    }

    public abstract String onGetMessageString(Context context);

    public abstract String onGetNegativeButtonString(Context context);

    public abstract String onGetPositiveButtonString(Context context);

    public abstract String onGetTitleString(Context context);

    public void setMessage(CharSequence charSequence) {
        AlertDialog alertDialog = this.b;
        if (alertDialog != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        AlertDialog alertDialog = this.b;
        if (alertDialog != null) {
            alertDialog.setTitle(charSequence);
        }
    }

    public void show(Activity activity, Callback callback) {
        this.a = activity;
        this.c = callback;
        if (activity == null || activity.isFinishing()) {
            HMSLog.e(C0201.m82(37112), C0201.m82(37113));
            return;
        }
        AlertDialog onCreateDialog = onCreateDialog(this.a);
        this.b = onCreateDialog;
        onCreateDialog.setCanceledOnTouchOutside(false);
        this.b.setOnCancelListener(new DialogInterface.OnCancelListener() {
            /* class com.huawei.hms.ui.AbstractDialog.AnonymousClass3 */

            public void onCancel(DialogInterface dialogInterface) {
                AbstractDialog.this.fireCancel();
            }
        });
        this.b.setOnKeyListener(new DialogInterface.OnKeyListener() {
            /* class com.huawei.hms.ui.AbstractDialog.AnonymousClass4 */

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (4 != i || keyEvent.getAction() != 1) {
                    return false;
                }
                AbstractDialog.this.cancel();
                return true;
            }
        });
        this.b.show();
    }
}
