package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: lambda */
public final /* synthetic */ class k implements JSONMapper {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        JSONObject jSONObject;
        return LocationRequest.create().setPriority(jSONObject.getInt(C0201.m82(22477))).setInterval((long) jSONObject.getDouble(C0201.m82(22478))).setNumUpdates(jSONObject.getInt(C0201.m82(22479))).setFastestInterval((long) jSONObject.getDouble(C0201.m82(22480))).setExpirationTime((long) jSONObject.getDouble(C0201.m82(22481))).setExpirationDuration((long) jSONObject.getDouble(C0201.m82(22482))).setSmallestDisplacement((float) ((long) jSONObject.getDouble(C0201.m82(22483)))).setMaxWaitTime((long) jSONObject.getDouble(C0201.m82(22484))).setNeedAddress(jSONObject.getBoolean(C0201.m82(22485))).setLanguage(jSONObject.getString(C0201.m82(22486))).setCountryCode(((JSONObject) obj).getString(C0201.m82(22487)));
    }
}
