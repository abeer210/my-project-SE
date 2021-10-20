package com.huawei.hms.support.api.a.b;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.o;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.locationavailability.GetLocationAvailabilityResponse;
import com.huawei.hms.utils.JsonUtil;
import vigqyno.C0201;

/* compiled from: GetLocationAvailabilityTaskApiCall */
public class f extends b<o, LocationAvailability> {
    public f(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* renamed from: a */
    public void doExecute(o oVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<LocationAvailability> taskCompletionSource) {
        String r5 = C0201.m82(4954);
        try {
            b.b(r5, this.a, C0201.m82(4955));
            if (responseErrorCode != null) {
                LocationAvailability locationAvailability = null;
                if (responseErrorCode.getErrorCode() == 0) {
                    locationAvailability = ((GetLocationAvailabilityResponse) JsonUtil.jsonToEntity(str, new GetLocationAvailabilityResponse())).getLocationAvailability();
                }
                com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, locationAvailability);
                return;
            }
            throw new ApiException(new Status(10000, a.a(10000)));
        } catch (Exception unused) {
            b.d(r5, this.a, C0201.m82(4956));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
        }
    }
}
