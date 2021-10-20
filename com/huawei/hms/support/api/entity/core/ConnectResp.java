package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

public class ConnectResp implements IMessageEntity {
    @Packed
    public List<Integer> protocolVersion = Arrays.asList(1, 2);
    @Packed
    public String sessionId;

    public String toString() {
        StringBuilder sb = new StringBuilder(C0201.m82(13813));
        for (Integer num : this.protocolVersion) {
            sb.append(num);
            sb.append(',');
        }
        return sb.toString();
    }
}
