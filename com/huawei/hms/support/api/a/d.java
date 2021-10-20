package com.huawei.hms.support.api.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.location.ActivityConversionInfo;
import com.huawei.hms.location.ActivityConversionRequest;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.support.api.a.a.a.c;
import com.huawei.hms.support.api.a.b.h;
import com.huawei.hms.support.api.a.b.i;
import com.huawei.hms.support.api.a.b.l;
import com.huawei.hms.support.api.a.b.m;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.activityrecognition.RequestActivityConversionRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.utils.JsonUtil;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: LocationArClientImpl */
public class d extends HuaweiApi<r> implements b {
    private static final c a = new c();
    private static final Api<r> b = new Api<>(C0201.m82(4835));

    public d(Activity activity, r rVar) {
        super(activity, (Api) b, (Api.ApiOptions) rVar, (AbstractClientBuilder) a);
    }

    @Override // com.huawei.hms.support.api.a.b
    public Task<Void> a(long j, PendingIntent pendingIntent) {
        String uuid = UUID.randomUUID().toString();
        String r1 = C0201.m82(4841);
        b.b(r1, uuid, C0201.m82(4842));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (pendingIntent != null) {
            try {
                a(uuid);
                if (j >= 0) {
                    c cVar = new c();
                    cVar.a(pendingIntent);
                    cVar.a(uuid);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0201.m82(4843), j);
                    jSONObject.put(C0201.m82(4844), uuid);
                    m mVar = new m(C0201.m82(4845), jSONObject.toString(), cVar);
                    mVar.setParcelable(pendingIntent);
                    return doWrite(mVar);
                }
                throw new ApiException(new Status(10802, a.a(10802)));
            } catch (ApiException e) {
                b.d(r1, uuid, C0201.m82(4847) + e.getMessage());
                taskCompletionSource.setException(e);
                return taskCompletionSource.getTask();
            } catch (Exception unused) {
                b.d(r1, uuid, C0201.m82(4846));
                taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
                return taskCompletionSource.getTask();
            }
        } else {
            throw new ApiException(new Status(10801, a.a(10801)));
        }
    }

    @Override // com.huawei.hms.support.api.a.b
    public Task<Void> b(PendingIntent pendingIntent) {
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        String r2 = C0201.m82(4859);
        b.b(r2, tid, C0201.m82(4860));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (pendingIntent != null) {
            try {
                com.huawei.hms.support.api.a.a.a.a aVar = new com.huawei.hms.support.api.a.a.a.a();
                aVar.a(pendingIntent);
                com.huawei.hms.support.api.a.a.a.a aVar2 = (com.huawei.hms.support.api.a.a.a.a) com.huawei.hms.support.api.a.a.a.b.a().b(aVar);
                if (aVar2 != null) {
                    b.d(r2, tid, C0201.m82(4861));
                    tid = aVar2.a();
                }
                locationBaseRequest.setTid(tid);
                aVar.a(tid);
                h hVar = new h(C0201.m82(4862), JsonUtil.createJsonString(locationBaseRequest), aVar);
                hVar.setParcelable(pendingIntent);
                return doWrite(hVar);
            } catch (ApiException e) {
                b.d(r2, tid, C0201.m82(4864) + e.getMessage());
                taskCompletionSource.setException(e);
                return taskCompletionSource.getTask();
            } catch (Exception unused) {
                b.d(r2, tid, C0201.m82(4863));
                taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
                return taskCompletionSource.getTask();
            }
        } else {
            throw new ApiException(new Status(10801, a.a(10801)));
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 50000301;
    }

    public d(Context context, r rVar) {
        super(context, b, rVar, a);
    }

    @Override // com.huawei.hms.support.api.a.b
    public Task<Void> a(PendingIntent pendingIntent) {
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        String r2 = C0201.m82(4848);
        b.b(r2, tid, C0201.m82(4849));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (pendingIntent != null) {
            try {
                c cVar = new c();
                cVar.a(pendingIntent);
                c cVar2 = (c) com.huawei.hms.support.api.a.a.a.d.a().b(cVar);
                if (cVar2 != null) {
                    b.d(r2, tid, C0201.m82(4850));
                    tid = cVar2.a();
                }
                locationBaseRequest.setTid(tid);
                cVar.a(tid);
                i iVar = new i(C0201.m82(4851), JsonUtil.createJsonString(locationBaseRequest), cVar);
                iVar.setParcelable(pendingIntent);
                return doWrite(iVar);
            } catch (ApiException e) {
                b.d(r2, tid, C0201.m82(4853) + e.getMessage());
                taskCompletionSource.setException(e);
                return taskCompletionSource.getTask();
            } catch (Exception unused) {
                b.d(r2, tid, C0201.m82(4852));
                taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
                return taskCompletionSource.getTask();
            }
        } else {
            throw new ApiException(new Status(10801, a.a(10801)));
        }
    }

    @Override // com.huawei.hms.support.api.a.b
    public Task<Void> a(ActivityConversionRequest activityConversionRequest, PendingIntent pendingIntent) {
        RequestActivityConversionRequest requestActivityConversionRequest = new RequestActivityConversionRequest(getContext());
        String tid = requestActivityConversionRequest.getTid();
        String r2 = C0201.m82(4854);
        b.b(r2, tid, C0201.m82(4855));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (activityConversionRequest == null || pendingIntent == null) {
            throw new ApiException(new Status(10801, a.a(10801)));
        }
        try {
            a(tid);
            List<ActivityConversionInfo> activityConversions = activityConversionRequest.getActivityConversions();
            if (!com.huawei.hms.support.api.a.c.a.a(activityConversions)) {
                for (ActivityConversionInfo activityConversionInfo : activityConversions) {
                    int conversionType = activityConversionInfo.getConversionType();
                    int activityType = activityConversionInfo.getActivityType();
                    if (conversionType != 0) {
                        if (conversionType != 1) {
                            throw new ApiException(new Status(10802, a.a(10802)));
                        }
                    }
                    if (!ActivityIdentificationData.isValidType(activityType)) {
                        throw new ApiException(new Status(10802, a.a(10802)));
                    }
                }
            }
            com.huawei.hms.support.api.a.a.a.a aVar = new com.huawei.hms.support.api.a.a.a.a();
            aVar.a(pendingIntent);
            aVar.a(tid);
            requestActivityConversionRequest.setActivityConversions(activityConversionRequest.getActivityConversions());
            l lVar = new l(C0201.m82(4856), JsonUtil.createJsonString(requestActivityConversionRequest), aVar);
            lVar.setParcelable(pendingIntent);
            return doWrite(lVar);
        } catch (ApiException e) {
            b.d(r2, tid, C0201.m82(4858));
            taskCompletionSource.setException(e);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            b.d(r2, tid, C0201.m82(4857));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
            return taskCompletionSource.getTask();
        }
    }

    private void a(String str) throws ApiException {
        int i = Build.VERSION.SDK_INT;
        String r1 = C0201.m82(4836);
        if (i <= 28) {
            if (!com.huawei.hms.support.api.a.c.d.a(getContext(), C0201.m82(4837))) {
                b.d(r1, str, C0201.m82(4838));
                throw new ApiException(new Status(10803, a.a(10803)));
            }
        } else if (!com.huawei.hms.support.api.a.c.d.a(getContext(), C0201.m82(4839))) {
            b.d(r1, str, C0201.m82(4840));
            throw new ApiException(new Status(10803, a.a(10803)));
        }
    }
}
