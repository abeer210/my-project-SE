package com.huawei.hms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.a.a.a.a;
import com.huawei.hms.a.a.a.b;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import vigqyno.C0201;

public class SmsRetriever {
    public static final String EXTRA_SMS_MESSAGE = null;
    public static final String EXTRA_STATUS = null;
    public static final String SMS_RETRIEVED_ACTION = null;
    private static final Api<a> a = new Api<>(C0201.m82(27009));
    private static final b b = new b();

    static {
        C0201.m83(SmsRetriever.class, 556);
    }

    private SmsRetriever() {
    }

    public static SmsRetrieverClient getClient(Activity activity) {
        return new SmsRetrieverClient(activity, a, (a) null, (AbstractClientBuilder) b);
    }

    public static SmsRetrieverClient getClient(Context context) {
        return new SmsRetrieverClient(context, a, (a) null, b);
    }
}
