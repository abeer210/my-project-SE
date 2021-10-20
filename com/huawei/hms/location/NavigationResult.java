package com.huawei.hms.location;

import android.os.Bundle;
import android.os.Parcel;
import com.huawei.hms.support.api.entity.location.common.LocationBaseResponse;
import java.util.HashMap;
import java.util.Map;

public class NavigationResult extends LocationBaseResponse {
    private Map<String, Object> extras;
    private int possibility = -1;
    private int state = -1;

    public NavigationResult() {
    }

    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    public final int getPossibility() {
        return this.possibility;
    }

    public final int getState() {
        return this.state;
    }

    public void setExtras(Map<String, Object> map) {
        this.extras = map;
    }

    public void setPossibility(int i) {
        this.possibility = i;
    }

    public void setState(int i) {
        this.state = i;
    }

    public NavigationResult(Parcel parcel) {
        this.state = parcel.readInt();
        this.possibility = parcel.readInt();
        this.extras = new HashMap();
        Bundle readBundle = parcel.readBundle(NavigationResult.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                Object obj = readBundle.get(str);
                if (obj != null) {
                    this.extras.put(str, obj);
                }
            }
        }
    }
}
