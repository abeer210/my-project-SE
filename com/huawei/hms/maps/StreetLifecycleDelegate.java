package com.huawei.hms.maps;

import com.huawei.hms.feature.dynamic.LifecycleDelegate;

@Deprecated
public interface StreetLifecycleDelegate extends LifecycleDelegate {
    void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback);
}
