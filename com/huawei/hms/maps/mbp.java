package com.huawei.hms.maps;

import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.StreetViewPanoramaCamera;
import com.huawei.hms.maps.model.StreetViewPanoramaLocation;
import com.huawei.hms.maps.model.StreetViewPanoramaOrientation;

public interface mbp extends IInterface {
    StreetViewPanoramaCamera a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    IObjectWrapper f();

    StreetViewPanoramaOrientation g();

    StreetViewPanoramaLocation h();
}
