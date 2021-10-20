package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.Map;
import vigqyno.C0201;

public class GrsClient {
    private d grsClientGlobal;

    public GrsClient(Context context, GrsBaseInfo grsBaseInfo) {
        if (context == null || grsBaseInfo == null) {
            throw new NullPointerException(C0201.m82(35348));
        }
        this.grsClientGlobal = e.a(grsBaseInfo, context);
    }

    public void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        this.grsClientGlobal.a(str, str2, iQueryUrlCallBack);
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        this.grsClientGlobal.a(str, iQueryUrlsCallBack);
    }

    public void clearSp() {
        this.grsClientGlobal.a();
    }

    public boolean forceExpire() {
        return this.grsClientGlobal.b();
    }

    public String synGetGrsUrl(String str, String str2) {
        return this.grsClientGlobal.a(str, str2);
    }

    public Map<String, String> synGetGrsUrls(String str) {
        return this.grsClientGlobal.a(str);
    }
}
