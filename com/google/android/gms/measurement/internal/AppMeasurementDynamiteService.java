package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import vigqyno.C0201;

@DynamiteApi
public class AppMeasurementDynamiteService extends hh1 {
    public o4 a = null;
    private Map<Integer, t5> b = new r0();

    class a implements t5 {
        private kh1 a;

        public a(kh1 kh1) {
            this.a = kh1;
        }

        @Override // com.google.android.gms.measurement.internal.t5
        public final void b(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.b(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.e().H().a(C0201.m82(25441), e);
            }
        }
    }

    class b implements q5 {
        private kh1 a;

        public b(kh1 kh1) {
            this.a = kh1;
        }

        @Override // com.google.android.gms.measurement.internal.q5
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.b(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.e().H().a(C0201.m82(27735), e);
            }
        }
    }

    private final void U3(jh1 jh1, String str) {
        this.a.T().T(jh1, str);
    }

    private final void V3() {
        if (this.a == null) {
            throw new IllegalStateException(C0201.m82(17168));
        }
    }

    @Override // defpackage.qe1
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        V3();
        this.a.K().v(str, j);
    }

    @Override // defpackage.qe1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        V3();
        this.a.L().B(str, str2, bundle);
    }

    @Override // defpackage.qe1
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        V3();
        this.a.K().w(str, j);
    }

    @Override // defpackage.qe1
    public void generateEventId(jh1 jh1) throws RemoteException {
        V3();
        this.a.T().D(jh1, this.a.T().s0());
    }

    @Override // defpackage.qe1
    public void getAppInstanceId(jh1 jh1) throws RemoteException {
        V3();
        this.a.c().y(new e6(this, jh1));
    }

    @Override // defpackage.qe1
    public void getCachedAppInstanceId(jh1 jh1) throws RemoteException {
        V3();
        U3(jh1, this.a.L().s0());
    }

    @Override // defpackage.qe1
    public void getConditionalUserProperties(String str, String str2, jh1 jh1) throws RemoteException {
        V3();
        this.a.c().y(new b9(this, jh1, str, str2));
    }

    @Override // defpackage.qe1
    public void getCurrentScreenClass(jh1 jh1) throws RemoteException {
        V3();
        U3(jh1, this.a.L().D());
    }

    @Override // defpackage.qe1
    public void getCurrentScreenName(jh1 jh1) throws RemoteException {
        V3();
        U3(jh1, this.a.L().E());
    }

    @Override // defpackage.qe1
    public void getDeepLink(jh1 jh1) throws RemoteException {
        V3();
        v5 L = this.a.L();
        L.j();
        boolean F = L.g().F(null, l.B0);
        String r2 = C0201.m82(17169);
        if (!F) {
            L.m().T(jh1, r2);
        } else if (L.f().z.a() > 0) {
            L.m().T(jh1, r2);
        } else {
            L.f().z.b(L.b().a());
            L.a.i(jh1);
        }
    }

    @Override // defpackage.qe1
    public void getGmpAppId(jh1 jh1) throws RemoteException {
        V3();
        U3(jh1, this.a.L().F());
    }

    @Override // defpackage.qe1
    public void getMaxUserProperties(String str, jh1 jh1) throws RemoteException {
        V3();
        this.a.L();
        u.g(str);
        this.a.T().C(jh1, 25);
    }

    @Override // defpackage.qe1
    public void getTestFlag(jh1 jh1, int i) throws RemoteException {
        V3();
        if (i == 0) {
            this.a.T().T(jh1, this.a.L().v0());
        } else if (i == 1) {
            this.a.T().D(jh1, this.a.L().w0().longValue());
        } else if (i == 2) {
            y8 T = this.a.T();
            double doubleValue = this.a.L().y0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(C0201.m82(17170), doubleValue);
            try {
                jh1.q2(bundle);
            } catch (RemoteException e) {
                T.a.e().H().a(C0201.m82(17171), e);
            }
        } else if (i == 3) {
            this.a.T().C(jh1, this.a.L().x0().intValue());
        } else if (i == 4) {
            this.a.T().G(jh1, this.a.L().u0().booleanValue());
        }
    }

    @Override // defpackage.qe1
    public void getUserProperties(String str, String str2, boolean z, jh1 jh1) throws RemoteException {
        V3();
        this.a.c().y(new e7(this, jh1, str, str2, z));
    }

    @Override // defpackage.qe1
    public void initForTests(Map map) throws RemoteException {
        V3();
    }

    @Override // defpackage.qe1
    public void initialize(yq0 yq0, qh1 qh1, long j) throws RemoteException {
        Context context = (Context) ar0.V3(yq0);
        o4 o4Var = this.a;
        if (o4Var == null) {
            this.a = o4.g(context, qh1);
        } else {
            o4Var.e().H().d(C0201.m82(17172));
        }
    }

    @Override // defpackage.qe1
    public void isDataCollectionEnabled(jh1 jh1) throws RemoteException {
        V3();
        this.a.c().y(new a9(this, jh1));
    }

    @Override // defpackage.qe1
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        V3();
        this.a.L().J(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.qe1
    public void logEventAndBundle(String str, String str2, Bundle bundle, jh1 jh1, long j) throws RemoteException {
        Bundle bundle2;
        V3();
        u.g(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        String r1 = C0201.m82(17173);
        String r5 = C0201.m82(17174);
        bundle2.putString(r1, r5);
        this.a.c().y(new f8(this, jh1, new j(str2, new i(bundle), r5, j), str));
    }

    @Override // defpackage.qe1
    public void logHealthData(int i, String str, yq0 yq0, yq0 yq02, yq0 yq03) throws RemoteException {
        Object obj;
        Object obj2;
        V3();
        Object obj3 = null;
        if (yq0 == null) {
            obj = null;
        } else {
            obj = ar0.V3(yq0);
        }
        if (yq02 == null) {
            obj2 = null;
        } else {
            obj2 = ar0.V3(yq02);
        }
        if (yq03 != null) {
            obj3 = ar0.V3(yq03);
        }
        this.a.e().A(i, true, false, str, obj, obj2, obj3);
    }

    @Override // defpackage.qe1
    public void onActivityCreated(yq0 yq0, Bundle bundle, long j) throws RemoteException {
        V3();
        o6 o6Var = this.a.L().c;
        if (o6Var != null) {
            this.a.L().t0();
            o6Var.onActivityCreated((Activity) ar0.V3(yq0), bundle);
        }
    }

    @Override // defpackage.qe1
    public void onActivityDestroyed(yq0 yq0, long j) throws RemoteException {
        V3();
        o6 o6Var = this.a.L().c;
        if (o6Var != null) {
            this.a.L().t0();
            o6Var.onActivityDestroyed((Activity) ar0.V3(yq0));
        }
    }

    @Override // defpackage.qe1
    public void onActivityPaused(yq0 yq0, long j) throws RemoteException {
        V3();
        o6 o6Var = this.a.L().c;
        if (o6Var != null) {
            this.a.L().t0();
            o6Var.onActivityPaused((Activity) ar0.V3(yq0));
        }
    }

    @Override // defpackage.qe1
    public void onActivityResumed(yq0 yq0, long j) throws RemoteException {
        V3();
        o6 o6Var = this.a.L().c;
        if (o6Var != null) {
            this.a.L().t0();
            o6Var.onActivityResumed((Activity) ar0.V3(yq0));
        }
    }

    @Override // defpackage.qe1
    public void onActivitySaveInstanceState(yq0 yq0, jh1 jh1, long j) throws RemoteException {
        V3();
        o6 o6Var = this.a.L().c;
        Bundle bundle = new Bundle();
        if (o6Var != null) {
            this.a.L().t0();
            o6Var.onActivitySaveInstanceState((Activity) ar0.V3(yq0), bundle);
        }
        try {
            jh1.q2(bundle);
        } catch (RemoteException e) {
            this.a.e().H().a(C0201.m82(17175), e);
        }
    }

    @Override // defpackage.qe1
    public void onActivityStarted(yq0 yq0, long j) throws RemoteException {
        V3();
        o6 o6Var = this.a.L().c;
        if (o6Var != null) {
            this.a.L().t0();
            o6Var.onActivityStarted((Activity) ar0.V3(yq0));
        }
    }

    @Override // defpackage.qe1
    public void onActivityStopped(yq0 yq0, long j) throws RemoteException {
        V3();
        o6 o6Var = this.a.L().c;
        if (o6Var != null) {
            this.a.L().t0();
            o6Var.onActivityStopped((Activity) ar0.V3(yq0));
        }
    }

    @Override // defpackage.qe1
    public void performAction(Bundle bundle, jh1 jh1, long j) throws RemoteException {
        V3();
        jh1.q2(null);
    }

    @Override // defpackage.qe1
    public void registerOnMeasurementEventListener(kh1 kh1) throws RemoteException {
        V3();
        t5 t5Var = this.b.get(Integer.valueOf(kh1.a1()));
        if (t5Var == null) {
            t5Var = new a(kh1);
            this.b.put(Integer.valueOf(kh1.a1()), t5Var);
        }
        this.a.L().S(t5Var);
    }

    @Override // defpackage.qe1
    public void resetAnalyticsData(long j) throws RemoteException {
        V3();
        this.a.L().K(j);
    }

    @Override // defpackage.qe1
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        V3();
        if (bundle == null) {
            this.a.e().E().d(C0201.m82(17176));
        } else {
            this.a.L().M(bundle, j);
        }
    }

    @Override // defpackage.qe1
    public void setCurrentScreen(yq0 yq0, String str, String str2, long j) throws RemoteException {
        V3();
        this.a.O().G((Activity) ar0.V3(yq0), str, str2);
    }

    @Override // defpackage.qe1
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        V3();
        this.a.L().f0(z);
    }

    @Override // defpackage.qe1
    public void setEventInterceptor(kh1 kh1) throws RemoteException {
        V3();
        v5 L = this.a.L();
        b bVar = new b(kh1);
        L.h();
        L.x();
        L.c().y(new y5(L, bVar));
    }

    @Override // defpackage.qe1
    public void setInstanceIdProvider(oh1 oh1) throws RemoteException {
        V3();
    }

    @Override // defpackage.qe1
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        V3();
        this.a.L().N(z);
    }

    @Override // defpackage.qe1
    public void setMinimumSessionDuration(long j) throws RemoteException {
        V3();
        this.a.L().O(j);
    }

    @Override // defpackage.qe1
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        V3();
        this.a.L().P(j);
    }

    @Override // defpackage.qe1
    public void setUserId(String str, long j) throws RemoteException {
        V3();
        this.a.L().d0(null, C0201.m82(17177), str, true, j);
    }

    @Override // defpackage.qe1
    public void setUserProperty(String str, String str2, yq0 yq0, boolean z, long j) throws RemoteException {
        V3();
        this.a.L().d0(str, str2, ar0.V3(yq0), z, j);
    }

    @Override // defpackage.qe1
    public void unregisterOnMeasurementEventListener(kh1 kh1) throws RemoteException {
        V3();
        t5 remove = this.b.remove(Integer.valueOf(kh1.a1()));
        if (remove == null) {
            remove = new a(kh1);
        }
        this.a.L().h0(remove);
    }
}
