package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.internal.b;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

/* renamed from: p12  reason: default package */
public class p12 implements o12 {
    private static volatile o12 b;
    private final AppMeasurement a;

    private p12(AppMeasurement appMeasurement) {
        u.k(appMeasurement);
        this.a = appMeasurement;
        new ConcurrentHashMap();
    }

    public static o12 c(l12 l12, Context context, v12 v12) {
        u.k(l12);
        u.k(context);
        u.k(v12);
        u.k(context.getApplicationContext());
        if (b == null) {
            synchronized (p12.class) {
                if (b == null) {
                    Bundle bundle = new Bundle(1);
                    if (l12.u()) {
                        v12.b(j12.class, r12.a, q12.a);
                        bundle.putBoolean(C0201.m82(24321), l12.t());
                    }
                    b = new p12(AppMeasurement.b(context, bundle));
                }
            }
        }
        return b;
    }

    public static final /* synthetic */ void d(s12 s12) {
        boolean z = ((j12) s12.a()).a;
        synchronized (p12.class) {
            ((p12) b).a.d(z);
        }
    }

    @Override // defpackage.o12
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (b.c(str) && b.a(str2, bundle) && b.b(str, str2, bundle)) {
            this.a.logEventInternal(str, str2, bundle);
        }
    }

    @Override // defpackage.o12
    public void b(String str, String str2, Object obj) {
        if (b.c(str) && b.d(str, str2)) {
            this.a.a(str, str2, obj);
        }
    }
}
