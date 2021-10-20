package com.huawei.hms.support.api.a.b;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.location.LocationSettingsResult;
import com.huawei.hms.location.LocationSettingsStates;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.o;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: CheckLocationSettingsTaskApiCall */
public class c extends b<o, LocationSettingsResponse> {
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;

    static {
        C0201.m83(c.class, 14);
    }

    public c(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* renamed from: a */
    public void doExecute(o oVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<LocationSettingsResponse> taskCompletionSource) {
        LocationSettingsResponse locationSettingsResponse;
        Status status;
        String str2 = f;
        String str3 = g;
        String str4 = e;
        String str5 = b;
        String str6 = h;
        try {
            b.b(str6, this.a, c);
            if (responseErrorCode != null) {
                Status status2 = null;
                LocationSettingsStates locationSettingsStates = null;
                if (responseErrorCode.getErrorCode() == 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has(str5)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(str5);
                        Parcelable parcelable = responseErrorCode.getParcelable();
                        PendingIntent pendingIntent = (parcelable == null || !(parcelable instanceof PendingIntent)) ? null : (PendingIntent) parcelable;
                        int i2 = -100;
                        if (jSONObject2.has(str3)) {
                            i2 = jSONObject2.getInt(str3);
                        }
                        String str7 = d;
                        if (jSONObject2.has(str2)) {
                            str7 = jSONObject2.getString(str2);
                        }
                        status = new Status(i2, str7, pendingIntent);
                    } else {
                        status = null;
                    }
                    if (jSONObject.has(str4)) {
                        locationSettingsStates = new LocationSettingsStates();
                        JsonUtil.jsonToEntity(jSONObject.getJSONObject(str4).toString(), locationSettingsStates);
                    }
                    LocationSettingsResult locationSettingsResult = new LocationSettingsResult();
                    locationSettingsResult.setLocationSettingsStates(locationSettingsStates);
                    locationSettingsResult.setStatus(status);
                    status2 = status;
                    locationSettingsResponse = new LocationSettingsResponse(locationSettingsResult);
                } else {
                    locationSettingsResponse = null;
                }
                if (status2 == null || status2.getStatusCode() != 6) {
                    com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, locationSettingsResponse);
                } else {
                    taskCompletionSource.setException(new ResolvableApiException(status2));
                }
            } else {
                throw new ApiException(new Status(10000, a.a(10000)));
            }
        } catch (Exception unused) {
            b.d(str6, this.a, i);
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
        }
    }
}
