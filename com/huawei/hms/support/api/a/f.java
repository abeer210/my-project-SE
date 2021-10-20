package com.huawei.hms.support.api.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.huawei.hms.support.api.a.a.c.b;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* compiled from: LocationClientBuilder */
public class f extends AbstractClientBuilder<o, r> {

    /* access modifiers changed from: private */
    /* compiled from: LocationClientBuilder */
    public static class a implements BaseHmsClient.ConnectionCallbacks {
        private static volatile AtomicInteger a = new AtomicInteger(0);
        private Context b;
        private BaseHmsClient.ConnectionCallbacks c;
        private Handler d;

        public a(Context context, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
            this.b = context;
            this.c = connectionCallbacks;
        }

        private void d() {
            String r1 = C0201.m82(29466);
            HMSLog.i(r1, C0201.m82(29465) + a);
            b();
            if (a.intValue() == 0) {
                this.d.sendEmptyMessageDelayed(1001, 300);
                a.addAndGet(1);
                return;
            }
            HMSLog.e(r1, C0201.m82(29467));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void e() {
            String r0 = C0201.m82(29468);
            try {
                List<b> b2 = com.huawei.hms.support.api.a.a.c.a.a().b();
                if (com.huawei.hms.support.api.a.c.a.a(b2)) {
                    HMSLog.i(r0, C0201.m82(29469));
                    return;
                }
                HMSLog.i(r0, C0201.m82(29470) + b2.size());
                FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.b);
                for (b bVar : b2) {
                    com.huawei.hms.support.api.a.c.b.b(r0, bVar.a(), C0201.m82(29471));
                    if (bVar.d() != null && bVar.b() != null) {
                        LocationRequest b3 = bVar.b();
                        com.huawei.hms.support.api.a.a.b.a.a().a(1);
                        if (b3.getPriority() == 200) {
                            com.huawei.hms.support.api.a.c.b.b(r0, bVar.a(), C0201.m82(29472));
                            a(fusedLocationProviderClient.requestLocationUpdatesEx(bVar.b(), bVar.d(), bVar.e()), bVar.d(), (PendingIntent) null);
                        } else {
                            com.huawei.hms.support.api.a.c.b.b(r0, bVar.a(), C0201.m82(29473));
                            a(fusedLocationProviderClient.requestLocationUpdates(bVar.b(), bVar.d(), bVar.e()), bVar.d(), (PendingIntent) null);
                        }
                    } else if (bVar.c() != null) {
                        com.huawei.hms.support.api.a.a.b.a.a().a(1);
                        a(fusedLocationProviderClient.requestLocationUpdates(bVar.b(), bVar.c()), (LocationCallback) null, bVar.c());
                    } else {
                        com.huawei.hms.support.api.a.c.b.c(r0, bVar.a(), C0201.m82(29474));
                    }
                }
            } catch (Exception unused) {
                HMSLog.e(r0, C0201.m82(29475));
            }
        }

        private void f() {
            boolean b2 = com.huawei.hms.support.api.a.a.b.a.a().b();
            String r1 = C0201.m82(29476);
            if (b2) {
                HMSLog.i(r1, C0201.m82(29477));
                d();
                return;
            }
            HMSLog.i(r1, C0201.m82(29478));
            com.huawei.hms.support.api.a.a.b.a.a().a(2);
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i(C0201.m82(29480), C0201.m82(29479) + com.huawei.hms.support.api.a.a.b.a.a().d());
            BaseHmsClient.ConnectionCallbacks connectionCallbacks = this.c;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnected();
            }
            if (com.huawei.hms.support.api.a.a.b.a.a().d() == 2) {
                com.huawei.hms.support.api.a.a.b.a.a().a(0);
                d();
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.i(C0201.m82(29482), C0201.m82(29481) + i);
            BaseHmsClient.ConnectionCallbacks connectionCallbacks = this.c;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnectionSuspended(i);
            }
            f();
        }

        private void b() {
            if (this.d == null) {
                HandlerThread handlerThread = new HandlerThread(C0201.m82(29462));
                handlerThread.start();
                this.d = new Handler(handlerThread.getLooper(), new Handler.Callback() {
                    /* class com.huawei.hms.support.api.a.f.a.AnonymousClass1 */

                    public boolean handleMessage(Message message) {
                        int i = message.what;
                        if (i == 1001) {
                            a.this.e();
                            a.this.d.removeMessages(1002);
                            a.this.d.sendEmptyMessageDelayed(1002, 3000);
                            return false;
                        } else if (i != 1002) {
                            return false;
                        } else {
                            a.this.c();
                            return false;
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void c() {
            if (com.huawei.hms.support.api.a.a.b.a.a().d() == 1) {
                a.set(0);
                com.huawei.hms.support.api.a.a.b.a.a().a(2);
                HMSLog.e(C0201.m82(29463), C0201.m82(29464));
            }
        }

        private void a(Task<Void> task, final LocationCallback locationCallback, final PendingIntent pendingIntent) {
            task.addOnSuccessListener(new OnSuccessListener<Void>() {
                /* class com.huawei.hms.support.api.a.f.a.AnonymousClass3 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    HMSLog.i(C0201.m82(5436), C0201.m82(5437));
                    a.this.d.removeMessages(1002);
                    a.a.set(0);
                    com.huawei.hms.support.api.a.a.b.a.a().a(0);
                }
            }).addOnFailureListener(new OnFailureListener() {
                /* class com.huawei.hms.support.api.a.f.a.AnonymousClass2 */

                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    HMSLog.e(C0201.m82(5508), C0201.m82(5509));
                    a.this.d.removeMessages(1002);
                    a.this.a((a) exc, (Exception) locationCallback, (LocationCallback) pendingIntent);
                    a.a.set(0);
                    com.huawei.hms.support.api.a.a.b.a.a().a(2);
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a(Exception exc, LocationCallback locationCallback, PendingIntent pendingIntent) {
            String r0 = C0201.m82(29455);
            try {
                if (exc instanceof ApiException) {
                    int statusCode = ((ApiException) exc).getStatusCode();
                    if (statusCode == 10000 || statusCode == 10102 || statusCode == 10803) {
                        if (locationCallback != null) {
                            LocationAvailability locationAvailability = new LocationAvailability();
                            locationAvailability.setLocationStatus(1001);
                            locationCallback.onLocationAvailability(locationAvailability);
                            HMSLog.e(r0, C0201.m82(29457));
                        }
                        if (pendingIntent != null) {
                            Intent intent = new Intent();
                            LocationAvailability locationAvailability2 = new LocationAvailability();
                            locationAvailability2.setLocationStatus(1001);
                            intent.putExtra(C0201.m82(29458), locationAvailability2);
                            pendingIntent.send(this.b, 0, intent);
                            HMSLog.e(r0, C0201.m82(29459));
                        }
                    } else if (statusCode == 907135004) {
                        HMSLog.e(r0, C0201.m82(29456));
                        f();
                    }
                } else {
                    HMSLog.e(r0, C0201.m82(29460));
                }
            } catch (Exception unused) {
                HMSLog.e(r0, C0201.m82(29461));
            }
        }
    }

    /* renamed from: a */
    public o buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new o(context, clientSettings, onConnectionFailedListener, new a(context, connectionCallbacks));
    }
}
