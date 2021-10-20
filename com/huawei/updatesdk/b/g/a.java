package com.huawei.updatesdk.b.g;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.huawei.updatesdk.service.otaupdate.g;
import vigqyno.C0201;

public class a {
    private b a;
    private Context b;
    private String c;
    private CharSequence d;
    private AlertDialog e;
    private AlertDialog.Builder f;
    private DialogInterface.OnShowListener g;
    private DialogInterface.OnDismissListener h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.b.g.a$a  reason: collision with other inner class name */
    public class DialogInterface$OnShowListenerC0115a implements DialogInterface.OnShowListener {

        /* renamed from: com.huawei.updatesdk.b.g.a$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC0116a implements View.OnClickListener {
            public View$OnClickListenerC0116a() {
            }

            public void onClick(View view) {
                w30.g(view);
                try {
                    if (a.this.a != null) {
                        a.this.a.a();
                    }
                } finally {
                    w30.h();
                }
            }
        }

        /* renamed from: com.huawei.updatesdk.b.g.a$a$b */
        class b implements View.OnClickListener {
            public b() {
            }

            public void onClick(View view) {
                w30.g(view);
                try {
                    if (a.this.a != null) {
                        a.this.a.b();
                    }
                } finally {
                    w30.h();
                }
            }
        }

        public DialogInterface$OnShowListenerC0115a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            AlertDialog alertDialog = (AlertDialog) dialogInterface;
            alertDialog.getButton(-1).setOnClickListener(new View$OnClickListenerC0116a());
            Button button = alertDialog.getButton(-2);
            if (button != null) {
                button.setOnClickListener(new b());
            }
            if (a.this.g != null) {
                a.this.g.onShow(dialogInterface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (a.this.h != null) {
                a.this.h.onDismiss(dialogInterface);
            }
        }
    }

    public enum c {
        CONFIRM,
        CANCEL
    }

    public interface d {
        void a();
    }

    public a(Context context, String str, CharSequence charSequence) {
        this.b = context;
        this.c = str;
        this.d = charSequence;
        this.f = com.huawei.updatesdk.a.a.c.h.b.g() ? new AlertDialog.Builder(context) : ((context.getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(context, 16974546) : new AlertDialog.Builder(context, 16974545);
        this.f.setTitle(this.c);
        this.f.setPositiveButton(g.e(context, C0201.m82(24688)), (DialogInterface.OnClickListener) null);
        this.f.setNegativeButton(g.e(context, C0201.m82(24689)), (DialogInterface.OnClickListener) null);
        this.f.setMessage(this.d);
    }

    public static a a(Context context, String str, CharSequence charSequence) {
        return (!(context instanceof Activity) || !((Activity) context).isFinishing()) ? new a(context, str, charSequence) : new c(context, str, charSequence);
    }

    public void a() {
        try {
            if (this.e != null) {
                this.e.dismiss();
                this.e = null;
            }
        } catch (IllegalArgumentException unused) {
            com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(24690), C0201.m82(24691));
        }
    }

    public void a(int i, int i2) {
        if (com.huawei.updatesdk.b.f.a.d().a() >= 11) {
            Button button = null;
            AlertDialog alertDialog = this.e;
            if (alertDialog != null) {
                button = alertDialog.getButton(-1);
            }
            if (button != null) {
                button.setBackgroundResource(i);
                button.setTextColor(this.b.getResources().getColor(i2));
            }
        }
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.h = onDismissListener;
    }

    public void a(DialogInterface.OnKeyListener onKeyListener) {
        AlertDialog alertDialog = this.e;
        if (alertDialog != null) {
            alertDialog.setOnKeyListener(onKeyListener);
        }
    }

    public void a(DialogInterface.OnShowListener onShowListener) {
        this.g = onShowListener;
    }

    public void a(View view) {
        ImageView imageView;
        if (this.f != null) {
            if (com.huawei.updatesdk.b.f.a.d().a() >= 17 && (imageView = (ImageView) view.findViewById(g.c(view.getContext(), C0201.m82(24692)))) != null) {
                imageView.setVisibility(8);
            }
            this.f.setMessage((CharSequence) null);
            this.f.setView(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019  */
    public void a(c cVar, String str) {
        Button button;
        int i;
        AlertDialog alertDialog = this.e;
        if (alertDialog != null) {
            if (cVar == c.CONFIRM) {
                i = -1;
            } else if (cVar == c.CANCEL) {
                i = -2;
            } else {
                button = null;
                if (button == null) {
                    button.setText(str);
                    button.setAllCaps(true);
                    return;
                }
                return;
            }
            button = alertDialog.getButton(i);
            if (button == null) {
            }
        }
    }

    public void a(d dVar) {
        Context context = this.b;
        if (context != null && !((Activity) context).isFinishing()) {
            boolean b2 = b();
            String r1 = C0201.m82(24693);
            if (!b2) {
                try {
                    AlertDialog create = this.f.create();
                    this.e = create;
                    create.setCanceledOnTouchOutside(false);
                    this.e.setOnShowListener(new DialogInterface$OnShowListenerC0115a());
                    this.e.setOnDismissListener(new b());
                    this.e.show();
                    this.e.getButton(-1).requestFocus();
                } catch (Exception e2) {
                    if (dVar != null) {
                        dVar.a();
                    }
                    com.huawei.updatesdk.a.a.b.a.a.a.a(r1, C0201.m82(24694), e2);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(C0201.m82(24695));
                sb.append(this.b);
                sb.append(C0201.m82(24696));
                Context context2 = this.b;
                sb.append(context2 == null ? C0201.m82(24697) : Boolean.valueOf(((Activity) context2).isFinishing()));
                com.huawei.updatesdk.a.a.b.a.a.a.b(r1, sb.toString());
            }
        } else if (dVar != null) {
            dVar.a();
        }
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public void a(boolean z) {
        AlertDialog alertDialog = this.e;
        if (alertDialog != null) {
            alertDialog.setCancelable(z);
        }
    }

    public boolean b() {
        AlertDialog alertDialog = this.e;
        return alertDialog != null && alertDialog.isShowing();
    }

    public void c() {
        AlertDialog.Builder builder = this.f;
        if (builder != null) {
            builder.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        }
    }
}
