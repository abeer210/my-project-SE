package com.huawei.hms.framework.network.grs;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.restclient.hianalytics.RCEventListener;
import com.huawei.hms.framework.network.restclient.hwhttp.Interceptor;
import com.huawei.hms.framework.network.restclient.hwhttp.RealInterceptorChain;
import com.huawei.hms.framework.network.restclient.hwhttp.Request;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.plugin.PluginInterceptor;
import com.huawei.hms.framework.network.restclient.hwhttp.url.HttpUrl;
import vigqyno.C0201;

public class f implements PluginInterceptor {
    private static final String a = null;

    static {
        C0201.m83(f.class, 547);
    }

    public Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request();
        String url = request.getUrl().getUrl();
        if (!GrsManager.isGRSSchema(url)) {
            return realInterceptorChain.proceed(request);
        }
        Logger.v(a, C0201.m82(14537));
        RCEventListener rCEventListener = realInterceptorChain.getRCEventListener();
        rCEventListener.convertGrsStart(url);
        String parseGrs = GrsManager.getInstance().parseGrs(url);
        Request build = request.newBuilder().url(new HttpUrl(parseGrs)).build();
        Logger.v(a, C0201.m82(14538), build.toString());
        rCEventListener.convertGrsEnd(parseGrs);
        return realInterceptorChain.proceed(build);
    }

    public String pluginName() {
        return f.class.getSimpleName();
    }
}
