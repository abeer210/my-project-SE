package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.i;
import androidx.fragment.app.d;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.l1;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.common.api.internal.p1;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.l;
import vigqyno.C0201;

/* renamed from: yo0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class yo0 extends zo0 {
    private static final Object d = new Object();
    private static final yo0 e = new yo0();
    public static final int f = zo0.a;
    private String c;

    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: yo0$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class a extends et0 {
        private final Context a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append(C0201.m82(15719));
                sb.append(i);
                Log.w(C0201.m82(15720), sb.toString());
                return;
            }
            int i2 = yo0.this.i(this.a);
            if (yo0.this.m(i2)) {
                yo0.this.t(this.a, i2);
            }
        }
    }

    private final String C() {
        String str;
        synchronized (d) {
            str = this.c;
        }
        return str;
    }

    public static yo0 q() {
        return e;
    }

    public static Dialog u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(f.d(activity, 18));
        builder.setPositiveButton(C0201.m82(23914), (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        x(activity, create, C0201.m82(23915), onCancelListener);
        return create;
    }

    public static Dialog v(Context context, int i, g gVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if (C0201.m82(23916).equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(f.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c2 = f.c(context, i);
        if (c2 != null) {
            builder.setPositiveButton(c2, gVar);
        }
        String g = f.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        return builder.create();
    }

    public static void x(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof d) {
            gp0.D(dialog, onCancelListener).C(((d) activity).p(), str);
            return;
        }
        wo0.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void z(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            y(context);
        } else if (pendingIntent != null) {
            String f2 = f.f(context, i);
            String e2 = f.e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(C0201.m82(23919));
            i.d dVar = new i.d(context);
            dVar.A(true);
            dVar.h(true);
            dVar.q(f2);
            i.c cVar = new i.c();
            cVar.g(e2);
            dVar.N(cVar);
            if (com.google.android.gms.common.util.i.b(context)) {
                u.n(l.f());
                dVar.J(context.getApplicationInfo().icon);
                dVar.E(2);
                if (com.google.android.gms.common.util.i.c(context)) {
                    dVar.a(lo0.common_full_open_on_phone, resources.getString(mo0.common_open_on_phone), pendingIntent);
                } else {
                    dVar.o(pendingIntent);
                }
            } else {
                dVar.J(17301642);
                dVar.P(resources.getString(mo0.common_google_play_services_notification_ticker));
                dVar.U(System.currentTimeMillis());
                dVar.o(pendingIntent);
                dVar.p(e2);
            }
            if (l.i()) {
                u.n(l.i());
                String C = C();
                if (C == null) {
                    C = C0201.m82(23920);
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(C);
                    String b = f.b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(C, b, 4));
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                dVar.k(C);
            }
            Notification d2 = dVar.d();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                dp0.d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, d2);
        } else if (i == 6) {
            Log.w(C0201.m82(23917), C0201.m82(23918));
        }
    }

    public final boolean A(Activity activity, j jVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog v = v(activity, i, g.b(jVar, d(activity, i, C0201.m82(23921)), 2), onCancelListener);
        if (v == null) {
            return false;
        }
        x(activity, v, C0201.m82(23922), onCancelListener);
        return true;
    }

    public final boolean B(Context context, vo0 vo0, int i) {
        PendingIntent p = p(context, vo0);
        if (p == null) {
            return false;
        }
        z(context, vo0.o(), null, GoogleApiActivity.a(context, p, i));
        return true;
    }

    @Override // defpackage.zo0
    public Intent d(Context context, int i, String str) {
        return super.d(context, i, str);
    }

    @Override // defpackage.zo0
    public PendingIntent e(Context context, int i, int i2) {
        return super.e(context, i, i2);
    }

    @Override // defpackage.zo0
    public final String g(int i) {
        return super.g(i);
    }

    @Override // defpackage.zo0
    public int i(Context context) {
        return super.i(context);
    }

    @Override // defpackage.zo0
    public int j(Context context, int i) {
        return super.j(context, i);
    }

    @Override // defpackage.zo0
    public final boolean m(int i) {
        return super.m(i);
    }

    public Dialog o(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return v(activity, i, g.a(activity, d(activity, i, C0201.m82(23923)), i2), onCancelListener);
    }

    public PendingIntent p(Context context, vo0 vo0) {
        if (vo0.s()) {
            return vo0.r();
        }
        return e(context, vo0.o(), 0);
    }

    public zs1<Void> r(Activity activity) {
        int i = f;
        u.f(C0201.m82(23924));
        int j = j(activity, i);
        if (j == 0) {
            return ct1.d(null);
        }
        p1 r = p1.r(activity);
        r.n(new vo0(j, null), 0);
        return r.q();
    }

    public boolean s(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o = o(activity, i, i2, onCancelListener);
        if (o == null) {
            return false;
        }
        x(activity, o, C0201.m82(23925), onCancelListener);
        return true;
    }

    public void t(Context context, int i) {
        z(context, i, null, f(context, i, 0, C0201.m82(23926)));
    }

    public final m1 w(Context context, l1 l1Var) {
        IntentFilter intentFilter = new IntentFilter(C0201.m82(23927));
        intentFilter.addDataScheme(C0201.m82(23928));
        m1 m1Var = new m1(l1Var);
        context.registerReceiver(m1Var, intentFilter);
        m1Var.b(context);
        if (l(context, C0201.m82(23929))) {
            return m1Var;
        }
        l1Var.a();
        m1Var.a();
        return null;
    }

    public final void y(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
