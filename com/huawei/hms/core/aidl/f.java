package com.huawei.hms.core.aidl;

import android.os.Bundle;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: MessageCodecV2 */
public class f extends e {
    @Override // com.huawei.hms.core.aidl.e
    public List<Object> a(Type type, Bundle bundle) throws InstantiationException, IllegalAccessException {
        int i = bundle.getInt(C0201.m82(22192));
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = bundle.get(C0201.m82(22193) + i2);
            if (obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Serializable)) {
                arrayList.add(obj);
            } else if (!(obj instanceof Bundle)) {
                continue;
            } else {
                Bundle bundle2 = (Bundle) obj;
                int i3 = bundle2.getInt(C0201.m82(22194), -1);
                if (i3 == 1) {
                    throw new InstantiationException(C0201.m82(22196));
                } else if (i3 == 0) {
                    arrayList.add(a(bundle2, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
                } else {
                    throw new InstantiationException(C0201.m82(22195));
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.core.aidl.e
    public void a(String str, List list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(C0201.m82(22197), 1);
        bundle2.putInt(C0201.m82(22198), list.size());
        for (int i = 0; i < list.size(); i++) {
            a(C0201.m82(22199) + i, list.get(i), bundle2);
        }
        bundle.putBundle(str, bundle2);
    }
}
