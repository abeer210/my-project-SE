package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: lambda */
public final /* synthetic */ class p implements JSONMapper {
    public static final /* synthetic */ p a = new p();

    private /* synthetic */ p() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        JSONObject jSONObject;
        return new LocationSettingsRequest.Builder().addAllLocationRequests(PlatformUtils.mapJSONArray(jSONObject.getJSONArray(C0201.m82(22488)), LocationUtils.FROM_JSON_OBJECT_TO_LOCATION_REQUEST)).setAlwaysShow(jSONObject.getBoolean(C0201.m82(22489))).setNeedBle(((JSONObject) obj).getBoolean(C0201.m82(22490))).build();
    }
}
