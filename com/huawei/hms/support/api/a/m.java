package com.huawei.hms.support.api.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.CommonStatusCodes;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.location.GeofenceRequest;
import com.huawei.hms.support.api.a.b.j;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.c.d;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.entity.location.fence.AddGeofencesRequest;
import com.huawei.hms.support.api.entity.location.fence.RemoveGeofencesRequest;
import com.huawei.hms.utils.JsonUtil;
import java.util.List;
import vigqyno.C0201;

/* compiled from: LocationGeofenceClientImpl */
public class m extends HuaweiApi<r> implements k {
    private static final l a = new l();
    private static final Api<r> b = new Api<>(C0201.m82(35134));

    public m(Activity activity, r rVar) {
        super(activity, (Api) b, (Api.ApiOptions) rVar, (AbstractClientBuilder) a);
    }

    @Override // com.huawei.hms.support.api.a.k
    public Task<Void> a(GeofenceRequest geofenceRequest, PendingIntent pendingIntent) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AddGeofencesRequest addGeofencesRequest = new AddGeofencesRequest(getContext());
        String tid = addGeofencesRequest.getTid();
        if (geofenceRequest == null || pendingIntent == null) {
            throw new ApiException(new Status(10801, a.a(10801)));
        }
        try {
            if (d.b(getContext())) {
                addGeofencesRequest.setGeofencingRequest(geofenceRequest);
                com.huawei.hms.support.api.a.b.a aVar = new com.huawei.hms.support.api.a.b.a(C0201.m82(35139), JsonUtil.createJsonString(addGeofencesRequest), tid);
                aVar.setParcelable(pendingIntent);
                return doWrite(aVar);
            }
            throw new ApiException(new Status(10204, CommonStatusCodes.getStatusCodeString(10204)));
        } catch (ApiException e) {
            b.d(C0201.m82(35141), tid, C0201.m82(35140) + e.getMessage());
            taskCompletionSource.setException(e);
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 50000301;
    }

    public m(Context context, r rVar) {
        super(context, b, rVar, a);
    }

    @Override // com.huawei.hms.support.api.a.k
    public Task<Void> a(List<String> list) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RemoveGeofencesRequest removeGeofencesRequest = new RemoveGeofencesRequest(getContext());
        String tid = removeGeofencesRequest.getTid();
        if (list != null) {
            try {
                if (list.size() != 0) {
                    removeGeofencesRequest.setGeofenceRequestIds(list);
                    return doWrite(new j(C0201.m82(35142), JsonUtil.createJsonString(removeGeofencesRequest), tid));
                }
            } catch (ApiException e) {
                b.d(C0201.m82(35144), tid, C0201.m82(35143) + e.getMessage());
                taskCompletionSource.setException(e);
                return taskCompletionSource.getTask();
            }
        }
        throw new ApiException(new Status(10801, a.a(10801)));
    }

    @Override // com.huawei.hms.support.api.a.k
    public Task<Void> a(PendingIntent pendingIntent) {
        long currentTimeMillis = System.currentTimeMillis();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        String r5 = C0201.m82(35135);
        String r6 = C0201.m82(35136);
        if (pendingIntent != null) {
            try {
                j jVar = new j(C0201.m82(35137), JsonUtil.createJsonString(locationBaseRequest), tid);
                jVar.setParcelable(pendingIntent);
                Task<Void> doWrite = doWrite(jVar);
                long currentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                long j = currentTimeMillis2 - currentTimeMillis;
                sb.append(j);
                b.b(r6, tid, sb.toString());
                Log.i(r6, r5 + j);
                return doWrite;
            } catch (ApiException e) {
                b.d(r6, tid, C0201.m82(35138) + e.getMessage());
                taskCompletionSource.setException(e);
                long currentTimeMillis3 = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r5);
                long j2 = currentTimeMillis3 - currentTimeMillis;
                sb2.append(j2);
                b.b(r6, tid, sb2.toString());
                Log.i(r6, r5 + j2);
                return taskCompletionSource.getTask();
            }
        } else {
            throw new ApiException(new Status(10801, a.a(10801)));
        }
    }
}
