package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: sg1  reason: default package */
public final class sg1 extends a51 implements qe1 {
    public sg1(IBinder iBinder) {
        super(iBinder, C0201.m82(8481));
    }

    @Override // defpackage.qe1
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeLong(j);
        W3(23, U3);
    }

    @Override // defpackage.qe1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.d(U3, bundle);
        W3(9, U3);
    }

    @Override // defpackage.qe1
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeLong(j);
        W3(24, U3);
    }

    @Override // defpackage.qe1
    public final void generateEventId(jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        W3(22, U3);
    }

    @Override // defpackage.qe1
    public final void getAppInstanceId(jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        W3(20, U3);
    }

    @Override // defpackage.qe1
    public final void getCachedAppInstanceId(jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        W3(19, U3);
    }

    @Override // defpackage.qe1
    public final void getConditionalUserProperties(String str, String str2, jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.c(U3, jh1);
        W3(10, U3);
    }

    @Override // defpackage.qe1
    public final void getCurrentScreenClass(jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        W3(17, U3);
    }

    @Override // defpackage.qe1
    public final void getCurrentScreenName(jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        W3(16, U3);
    }

    @Override // defpackage.qe1
    public final void getDeepLink(jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        W3(41, U3);
    }

    @Override // defpackage.qe1
    public final void getGmpAppId(jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        W3(21, U3);
    }

    @Override // defpackage.qe1
    public final void getMaxUserProperties(String str, jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        m71.c(U3, jh1);
        W3(6, U3);
    }

    @Override // defpackage.qe1
    public final void getTestFlag(jh1 jh1, int i) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        U3.writeInt(i);
        W3(38, U3);
    }

    @Override // defpackage.qe1
    public final void getUserProperties(String str, String str2, boolean z, jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.a(U3, z);
        m71.c(U3, jh1);
        W3(5, U3);
    }

    @Override // defpackage.qe1
    public final void initForTests(Map map) throws RemoteException {
        Parcel U3 = U3();
        U3.writeMap(map);
        W3(37, U3);
    }

    @Override // defpackage.qe1
    public final void initialize(yq0 yq0, qh1 qh1, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        m71.d(U3, qh1);
        U3.writeLong(j);
        W3(1, U3);
    }

    @Override // defpackage.qe1
    public final void isDataCollectionEnabled(jh1 jh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, jh1);
        W3(40, U3);
    }

    @Override // defpackage.qe1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.d(U3, bundle);
        m71.a(U3, z);
        m71.a(U3, z2);
        U3.writeLong(j);
        W3(2, U3);
    }

    @Override // defpackage.qe1
    public final void logEventAndBundle(String str, String str2, Bundle bundle, jh1 jh1, long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.d(U3, bundle);
        m71.c(U3, jh1);
        U3.writeLong(j);
        W3(3, U3);
    }

    @Override // defpackage.qe1
    public final void logHealthData(int i, String str, yq0 yq0, yq0 yq02, yq0 yq03) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        U3.writeString(str);
        m71.c(U3, yq0);
        m71.c(U3, yq02);
        m71.c(U3, yq03);
        W3(33, U3);
    }

    @Override // defpackage.qe1
    public final void onActivityCreated(yq0 yq0, Bundle bundle, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        m71.d(U3, bundle);
        U3.writeLong(j);
        W3(27, U3);
    }

    @Override // defpackage.qe1
    public final void onActivityDestroyed(yq0 yq0, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        U3.writeLong(j);
        W3(28, U3);
    }

    @Override // defpackage.qe1
    public final void onActivityPaused(yq0 yq0, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        U3.writeLong(j);
        W3(29, U3);
    }

    @Override // defpackage.qe1
    public final void onActivityResumed(yq0 yq0, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        U3.writeLong(j);
        W3(30, U3);
    }

    @Override // defpackage.qe1
    public final void onActivitySaveInstanceState(yq0 yq0, jh1 jh1, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        m71.c(U3, jh1);
        U3.writeLong(j);
        W3(31, U3);
    }

    @Override // defpackage.qe1
    public final void onActivityStarted(yq0 yq0, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        U3.writeLong(j);
        W3(25, U3);
    }

    @Override // defpackage.qe1
    public final void onActivityStopped(yq0 yq0, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        U3.writeLong(j);
        W3(26, U3);
    }

    @Override // defpackage.qe1
    public final void performAction(Bundle bundle, jh1 jh1, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, bundle);
        m71.c(U3, jh1);
        U3.writeLong(j);
        W3(32, U3);
    }

    @Override // defpackage.qe1
    public final void registerOnMeasurementEventListener(kh1 kh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, kh1);
        W3(35, U3);
    }

    @Override // defpackage.qe1
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeLong(j);
        W3(12, U3);
    }

    @Override // defpackage.qe1
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, bundle);
        U3.writeLong(j);
        W3(8, U3);
    }

    @Override // defpackage.qe1
    public final void setCurrentScreen(yq0 yq0, String str, String str2, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, yq0);
        U3.writeString(str);
        U3.writeString(str2);
        U3.writeLong(j);
        W3(15, U3);
    }

    @Override // defpackage.qe1
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel U3 = U3();
        m71.a(U3, z);
        W3(39, U3);
    }

    @Override // defpackage.qe1
    public final void setEventInterceptor(kh1 kh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, kh1);
        W3(34, U3);
    }

    @Override // defpackage.qe1
    public final void setInstanceIdProvider(oh1 oh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, oh1);
        W3(18, U3);
    }

    @Override // defpackage.qe1
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel U3 = U3();
        m71.a(U3, z);
        U3.writeLong(j);
        W3(11, U3);
    }

    @Override // defpackage.qe1
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeLong(j);
        W3(13, U3);
    }

    @Override // defpackage.qe1
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeLong(j);
        W3(14, U3);
    }

    @Override // defpackage.qe1
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeLong(j);
        W3(7, U3);
    }

    @Override // defpackage.qe1
    public final void setUserProperty(String str, String str2, yq0 yq0, boolean z, long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.c(U3, yq0);
        m71.a(U3, z);
        U3.writeLong(j);
        W3(4, U3);
    }

    @Override // defpackage.qe1
    public final void unregisterOnMeasurementEventListener(kh1 kh1) throws RemoteException {
        Parcel U3 = U3();
        m71.c(U3, kh1);
        W3(36, U3);
    }
}
