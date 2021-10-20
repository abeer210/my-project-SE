package com.huawei.hms.support.api.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.support.api.a.b.e;
import com.huawei.hms.support.api.a.b.f;
import com.huawei.hms.support.api.a.b.k;
import com.huawei.hms.support.api.a.b.n;
import com.huawei.hms.support.api.a.b.o;
import com.huawei.hms.support.api.a.b.p;
import com.huawei.hms.support.api.a.b.q;
import com.huawei.hms.support.api.a.b.r;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.c.c;
import com.huawei.hms.support.api.a.c.d;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.checksettings.CheckLocationSettingsRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.entity.location.lastlocation.GetLastLocationRequest;
import com.huawei.hms.support.api.entity.location.mock.SetMockLocationRequest;
import com.huawei.hms.support.api.entity.location.mock.SetMockModeRequest;
import com.huawei.hms.support.api.entity.location.updates.RemoveLocationUpdatesRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: LocationClientImpl */
public class g extends HuaweiApi<r> implements e {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    private static final f a = new f();
    private static final Api<r> b = new Api<>(C0201.m82(4732));
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private String c = C0201.m82(4733);

    static {
        C0201.m83(g.class, 15);
    }

    public g(Activity activity, r rVar) {
        super(activity, (Api) b, (Api.ApiOptions) rVar, (AbstractClientBuilder) a);
        d();
    }

    private void d() {
        try {
            this.c = ib2.a(getContext()).c(C0201.m82(4735));
        } catch (Exception unused) {
            HMSLog.e(C0201.m82(4736), C0201.m82(4737));
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Location> a() {
        String r0 = C0201.m82(4738);
        String r1 = C0201.m82(4739);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            b.b(r1, tid, C0201.m82(4740));
            String reportEntry = HiAnalyticsClient.reportEntry(getContext(), r0, 50000301);
            if (d.a(getContext())) {
                return doWrite(new e(r0, JsonUtil.createJsonString(locationBaseRequest), locationBaseRequest.getTid(), reportEntry));
            }
            throw new ApiException(new Status(10803, a.a(10803)));
        } catch (ApiException e2) {
            b.d(r1, tid, C0201.m82(4742) + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r1, tid, C0201.m82(4741));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Void> b() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(new ApiException(new Status(10806, a.a(10806))));
        return taskCompletionSource.getTask();
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<LocationAvailability> c() {
        String r0 = C0201.m82(4786);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            b.b(r0, tid, C0201.m82(4787));
            if (d.a(getContext())) {
                return doWrite(new f(C0201.m82(4788), JsonUtil.createJsonString(locationBaseRequest), tid));
            }
            throw new ApiException(new Status(10803, a.a(10803)));
        } catch (ApiException e2) {
            b.d(r0, tid, C0201.m82(4790) + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r0, tid, C0201.m82(4789));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 50000301;
    }

    public g(Context context, r rVar) {
        super(context, b, rVar, a);
        d();
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Void> b(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        String str;
        String str2 = l;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = new RequestLocationUpdatesRequest(getContext());
        String tid = requestLocationUpdatesRequest.getTid();
        try {
            b.b(str2, tid, y);
            if (locationRequest == null || locationCallback == null) {
                throw new ApiException(new Status(10801, a.a(10801)));
            } else if (locationRequest.getNumUpdates() > 0) {
                if (locationRequest.getPriority() == 200) {
                    locationRequest.setNeedAddress(false);
                }
                if (looper == null) {
                    looper = Looper.myLooper();
                }
                if (d.a(getContext())) {
                    locationRequest.putExtras(e, this.c);
                    com.huawei.hms.support.api.a.a.c.b bVar = new com.huawei.hms.support.api.a.a.c.b(locationRequest, null, locationCallback, looper, tid);
                    com.huawei.hms.support.api.a.a.c.b bVar2 = (com.huawei.hms.support.api.a.a.c.b) com.huawei.hms.support.api.a.a.c.a.a().b(bVar);
                    String str3 = w;
                    if (bVar2 != null) {
                        b.b(str2, tid, x + bVar2.f() + str3 + bVar2.a());
                        str = bVar2.f();
                        bVar.b(str);
                    } else {
                        str = tid;
                    }
                    com.huawei.hms.support.api.a.a.c.a.a().d(bVar);
                    requestLocationUpdatesRequest.setUuid(str);
                    requestLocationUpdatesRequest.setLocationRequest(locationRequest);
                    String reportEntry = HiAnalyticsClient.reportEntry(getContext(), z, 50000301);
                    String createJsonString = JsonUtil.createJsonString(requestLocationUpdatesRequest);
                    b.b(str2, tid, o + requestLocationUpdatesRequest.getUuid() + str3 + requestLocationUpdatesRequest.getTid() + j + 50000301);
                    return doWrite(new n(f, createJsonString, tid, bVar, looper, reportEntry));
                }
                throw new ApiException(new Status(10803, a.a(10803)));
            } else {
                throw new ApiException(new Status(10802, a.a(10802)));
            }
        } catch (ApiException e2) {
            b.d(str2, tid, u + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(str2, tid, A);
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<HWLocation> a(LocationRequest locationRequest) {
        String r0 = C0201.m82(4770);
        String r1 = C0201.m82(4771);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetLastLocationRequest getLastLocationRequest = new GetLastLocationRequest(getContext(), locationRequest.getNeedAddress(), locationRequest.getLanguage(), locationRequest.getCountryCode());
        String tid = getLastLocationRequest.getTid();
        try {
            b.b(r1, tid, C0201.m82(4772));
            String reportEntry = HiAnalyticsClient.reportEntry(getContext(), r0, 50000301);
            if (d.a(getContext())) {
                return doWrite(new com.huawei.hms.support.api.a.b.d(r0, JsonUtil.createJsonString(getLastLocationRequest), getLastLocationRequest.getTid(), reportEntry));
            }
            throw new ApiException(new Status(10803, a.a(10803)));
        } catch (ApiException e2) {
            b.d(r1, tid, C0201.m82(4774) + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r1, tid, C0201.m82(4773));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Void> a(boolean z2) {
        String r0 = C0201.m82(4780);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        String tid = new LocationBaseRequest(getContext()).getTid();
        try {
            b.b(r0, tid, C0201.m82(4781));
            if (!d.a(getContext()) || !d.a(getContext().getPackageName(), getContext())) {
                b.d(r0, tid, C0201.m82(4783));
                throw new ApiException(new Status(10803, a.a(10803)));
            }
            SetMockModeRequest setMockModeRequest = new SetMockModeRequest(getContext());
            setMockModeRequest.setMockMode(z2);
            return doWrite(new r(C0201.m82(4782), JsonUtil.createJsonString(setMockModeRequest), tid));
        } catch (ApiException e2) {
            b.d(r0, tid, C0201.m82(4785) + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r0, tid, C0201.m82(4784));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Void> a(Location location) {
        String r0 = C0201.m82(4752);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        SetMockLocationRequest setMockLocationRequest = new SetMockLocationRequest(getContext());
        String tid = setMockLocationRequest.getTid();
        try {
            b.b(r0, tid, C0201.m82(4753));
            if (location == null) {
                throw new ApiException(new Status(10801, a.a(10801)));
            } else if (!d.a(getContext()) || !d.a(getContext().getPackageName(), getContext())) {
                throw new ApiException(new Status(10803, a.a(10803)));
            } else {
                setMockLocationRequest.setPackageName(getContext().getPackageName());
                setMockLocationRequest.setMockLocation(location);
                JSONObject a2 = c.a(setMockLocationRequest.getMockLocation());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0201.m82(4754), a2);
                jSONObject.put(C0201.m82(4755), setMockLocationRequest.getPackageName());
                jSONObject.put(C0201.m82(4756), setMockLocationRequest.getTid());
                return doWrite(new q(C0201.m82(4757), jSONObject.toString(), tid));
            }
        } catch (ApiException e2) {
            b.d(r0, tid, C0201.m82(4759) + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r0, tid, C0201.m82(4758));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Void> a(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        String str;
        String str2 = m;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = new RequestLocationUpdatesRequest(getContext());
        String tid = requestLocationUpdatesRequest.getTid();
        try {
            b.b(str2, tid, d);
            if (locationRequest == null || locationCallback == null) {
                throw new ApiException(new Status(10801, a.a(10801)));
            } else if (locationRequest.getNumUpdates() > 0) {
                if (looper == null) {
                    looper = Looper.myLooper();
                }
                if (d.a(getContext())) {
                    if (locationRequest.getPriority() == 200) {
                        locationRequest.setPriority(100);
                    }
                    com.huawei.hms.support.api.a.a.c.b bVar = new com.huawei.hms.support.api.a.a.c.b(locationRequest, null, locationCallback, looper, tid);
                    com.huawei.hms.support.api.a.a.c.b bVar2 = (com.huawei.hms.support.api.a.a.c.b) com.huawei.hms.support.api.a.a.c.a.a().b(bVar);
                    if (bVar2 != null) {
                        b.b(str2, tid, q + bVar2.a());
                        str = bVar2.f();
                        bVar.b(str);
                    } else {
                        str = tid;
                    }
                    com.huawei.hms.support.api.a.a.c.a.a().d(bVar);
                    requestLocationUpdatesRequest.setUuid(str);
                    requestLocationUpdatesRequest.setLocationRequest(locationRequest);
                    String reportEntry = HiAnalyticsClient.reportEntry(getContext(), n, 50000301);
                    String createJsonString = JsonUtil.createJsonString(requestLocationUpdatesRequest);
                    b.b(str2, tid, r + str + v + requestLocationUpdatesRequest.getTid() + k + 50000301);
                    return doWrite(new o(D, createJsonString, tid, bVar, looper, reportEntry));
                }
                throw new ApiException(new Status(10803, a.a(10803)));
            } else {
                throw new ApiException(new Status(10802, a.a(10802)));
            }
        } catch (ApiException e2) {
            b.d(str2, tid, F);
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(str2, tid, t);
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Void> a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        String str = C;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = new RequestLocationUpdatesRequest(getContext());
        String tid = requestLocationUpdatesRequest.getTid();
        try {
            b.b(str, tid, i);
            if (locationRequest == null || pendingIntent == null) {
                throw new ApiException(new Status(10801, a.a(10801)));
            } else if (locationRequest.getNumUpdates() <= 0) {
                throw new ApiException(new Status(10802, a.a(10802)));
            } else if (d.a(getContext())) {
                if (locationRequest.getPriority() == 200) {
                    locationRequest.setPriority(100);
                }
                requestLocationUpdatesRequest.setLocationRequest(locationRequest);
                com.huawei.hms.support.api.a.a.c.b bVar = new com.huawei.hms.support.api.a.a.c.b(locationRequest, pendingIntent, null, null, tid);
                com.huawei.hms.support.api.a.a.c.a.a().d(bVar);
                p pVar = new p(B, JsonUtil.createJsonString(requestLocationUpdatesRequest), tid, bVar, HiAnalyticsClient.reportEntry(getContext(), g, 50000301));
                pVar.setParcelable(pendingIntent);
                b.b(str, tid, h + requestLocationUpdatesRequest.getTid() + E + 50000301);
                return doWrite(pVar);
            } else {
                throw new ApiException(new Status(10803, a.a(10803)));
            }
        } catch (ApiException e2) {
            b.d(str, tid, s + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(str, tid, p);
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Void> a(LocationCallback locationCallback) {
        String r0 = C0201.m82(4760);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RemoveLocationUpdatesRequest removeLocationUpdatesRequest = new RemoveLocationUpdatesRequest(getContext());
        String tid = removeLocationUpdatesRequest.getTid();
        try {
            b.b(r0, tid, C0201.m82(4761));
            if (locationCallback == null) {
                throw new ApiException(new Status(10801, a.a(10801)));
            } else if (d.a(getContext())) {
                com.huawei.hms.support.api.a.a.c.b bVar = (com.huawei.hms.support.api.a.a.c.b) com.huawei.hms.support.api.a.a.c.a.a().b(new com.huawei.hms.support.api.a.a.c.b(null, null, locationCallback, null, tid));
                if (bVar != null) {
                    String a2 = bVar.a();
                    removeLocationUpdatesRequest.setTid(a2);
                    removeLocationUpdatesRequest.setUuid(bVar.f());
                    String createJsonString = JsonUtil.createJsonString(removeLocationUpdatesRequest);
                    String reportEntry = HiAnalyticsClient.reportEntry(getContext(), C0201.m82(4762), 50000301);
                    b.b(r0, a2, C0201.m82(4763) + removeLocationUpdatesRequest.getUuid() + C0201.m82(4764) + removeLocationUpdatesRequest.getTid() + C0201.m82(4765) + 50000301);
                    return doWrite(new k(C0201.m82(4766), createJsonString, a2, bVar, reportEntry));
                }
                b.d(r0, tid, C0201.m82(4767));
                throw new ApiException(new Status(10804, a.a(10804)));
            } else {
                throw new ApiException(new Status(10803, a.a(10803)));
            }
        } catch (ApiException e2) {
            b.d(r0, tid, C0201.m82(4769) + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r0, tid, C0201.m82(4768));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<Void> a(PendingIntent pendingIntent) {
        String r0 = C0201.m82(4743);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            b.b(r0, tid, C0201.m82(4744));
            if (pendingIntent == null) {
                throw new ApiException(new Status(10801, a.a(10801)));
            } else if (d.a(getContext())) {
                com.huawei.hms.support.api.a.a.c.b bVar = (com.huawei.hms.support.api.a.a.c.b) com.huawei.hms.support.api.a.a.c.a.a().b(new com.huawei.hms.support.api.a.a.c.b(null, pendingIntent, null, null, tid));
                if (bVar != null) {
                    String a2 = bVar.a();
                    locationBaseRequest.setTid(a2);
                    k kVar = new k(C0201.m82(4746), JsonUtil.createJsonString(locationBaseRequest), a2, bVar, HiAnalyticsClient.reportEntry(getContext(), C0201.m82(4745), 50000301));
                    kVar.setParcelable(pendingIntent);
                    b.b(r0, a2, C0201.m82(4747) + locationBaseRequest.getTid() + C0201.m82(4748) + 50000301);
                    return doWrite(kVar);
                }
                b.d(r0, tid, C0201.m82(4749));
                throw new ApiException(new Status(10805, a.a(10805)));
            } else {
                throw new ApiException(new Status(10803, a.a(10803)));
            }
        } catch (ApiException e2) {
            b.d(r0, tid, C0201.m82(4751) + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r0, tid, C0201.m82(4750));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.api.a.e
    public Task<LocationSettingsResponse> a(LocationSettingsRequest locationSettingsRequest) {
        String r0 = C0201.m82(4775);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        CheckLocationSettingsRequest checkLocationSettingsRequest = new CheckLocationSettingsRequest(getContext());
        String tid = checkLocationSettingsRequest.getTid();
        try {
            b.b(r0, tid, C0201.m82(4776));
            if (locationSettingsRequest != null) {
                checkLocationSettingsRequest.setLocationSettingsRequest(locationSettingsRequest);
                return doWrite(new com.huawei.hms.support.api.a.b.c(C0201.m82(4777), JsonUtil.createJsonString(checkLocationSettingsRequest), tid));
            }
            throw new ApiException(new Status(10801, a.a(10801)));
        } catch (ApiException e2) {
            b.d(r0, tid, C0201.m82(4779) + e2.getMessage());
            taskCompletionSource.setException(e2);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r0, tid, C0201.m82(4778));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }
}
