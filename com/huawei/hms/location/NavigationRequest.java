package com.huawei.hms.location;

import android.os.Parcel;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class NavigationRequest implements IMessageEntity {
    public static final int IS_SUPPORT_EX = 0;
    public static final int OVERPASS = 0;
    @Packed
    private Map<String, String> extras;
    @Packed
    private int type;

    static {
        C0201.m83(NavigationRequest.class, 602);
    }

    public NavigationRequest(int i) {
        this.type = i;
    }

    public Map<String, String> getExtras() {
        return this.extras;
    }

    public int getType() {
        return this.type;
    }

    public void setExtras(Map<String, String> map) {
        this.extras = map;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return C0201.m82(35265) + this.type + '}';
    }

    public NavigationRequest(Parcel parcel) {
        this.type = parcel.readInt();
        HashMap hashMap = new HashMap();
        this.extras = hashMap;
        parcel.readMap(hashMap, NavigationRequest.class.getClassLoader());
    }
}
