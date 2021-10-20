package com.huawei.hms.rn.location.backend.providers;

import android.os.Looper;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.rn.location.backend.interfaces.TriMapper;

/* compiled from: lambda */
public final /* synthetic */ class a implements TriMapper {
    public final /* synthetic */ FusedLocationProviderClient a;

    public /* synthetic */ a(FusedLocationProviderClient fusedLocationProviderClient) {
        this.a = fusedLocationProviderClient;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.TriMapper
    public final Object map(Object obj, Object obj2, Object obj3) {
        return this.a.requestLocationUpdates((LocationRequest) obj, (LocationCallback) obj2, (Looper) obj3);
    }
}
