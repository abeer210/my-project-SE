package com.huawei.hms.support.api.a.b;

import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;

/* compiled from: BaseTaskApiCall */
public abstract class b<ClientT extends AnyClient, ResultT> extends TaskApiCall<ClientT, ResultT> {
    public final String a;

    public b(String str, String str2, String str3) {
        super(str, str2);
        this.a = str3;
    }

    public b(String str, String str2, String str3, String str4) {
        super(str, str2, str4);
        this.a = str3;
    }
}
