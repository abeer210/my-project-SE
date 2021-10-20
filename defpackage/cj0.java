package defpackage;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/* renamed from: cj0  reason: default package */
/* compiled from: OkHttpCallUtil */
public class cj0 {
    public static void a(OkHttpClient okHttpClient, Object obj) {
        for (Call call : okHttpClient.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
                return;
            }
        }
        for (Call call2 : okHttpClient.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
                return;
            }
        }
    }
}
