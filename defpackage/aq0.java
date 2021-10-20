package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.d;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: aq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class aq0 {
    private static final Object a = new Object();
    private static volatile aq0 b;

    private aq0() {
        List list = Collections.EMPTY_LIST;
    }

    public static aq0 b() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new aq0();
                }
            }
        }
        return b;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = d.b(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w(C0201.m82(2871), C0201.m82(2872));
        return false;
    }
}
