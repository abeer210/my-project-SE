package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: qe1  reason: default package */
public interface qe1 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(jh1 jh1) throws RemoteException;

    void getAppInstanceId(jh1 jh1) throws RemoteException;

    void getCachedAppInstanceId(jh1 jh1) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, jh1 jh1) throws RemoteException;

    void getCurrentScreenClass(jh1 jh1) throws RemoteException;

    void getCurrentScreenName(jh1 jh1) throws RemoteException;

    void getDeepLink(jh1 jh1) throws RemoteException;

    void getGmpAppId(jh1 jh1) throws RemoteException;

    void getMaxUserProperties(String str, jh1 jh1) throws RemoteException;

    void getTestFlag(jh1 jh1, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, jh1 jh1) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(yq0 yq0, qh1 qh1, long j) throws RemoteException;

    void isDataCollectionEnabled(jh1 jh1) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, jh1 jh1, long j) throws RemoteException;

    void logHealthData(int i, String str, yq0 yq0, yq0 yq02, yq0 yq03) throws RemoteException;

    void onActivityCreated(yq0 yq0, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(yq0 yq0, long j) throws RemoteException;

    void onActivityPaused(yq0 yq0, long j) throws RemoteException;

    void onActivityResumed(yq0 yq0, long j) throws RemoteException;

    void onActivitySaveInstanceState(yq0 yq0, jh1 jh1, long j) throws RemoteException;

    void onActivityStarted(yq0 yq0, long j) throws RemoteException;

    void onActivityStopped(yq0 yq0, long j) throws RemoteException;

    void performAction(Bundle bundle, jh1 jh1, long j) throws RemoteException;

    void registerOnMeasurementEventListener(kh1 kh1) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(yq0 yq0, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setEventInterceptor(kh1 kh1) throws RemoteException;

    void setInstanceIdProvider(oh1 oh1) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, yq0 yq0, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(kh1 kh1) throws RemoteException;
}
