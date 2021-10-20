package com.huawei.hms.support.api.hwid;

import com.huawei.hms.api.Api;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;
import vigqyno.C0201;

public class HuaweiId {
    public static final Scope HUAEWEIID_BASE_SCOPE = new Scope(C0201.m82(8664));
    public static final HuaweiIdApi HuaweiIdApi = new HuaweiIdApiImpl();
    public static final Api<HuaweiIdSignInOptions> SIGN_IN_API = new Api<>(C0201.m82(8663), a);
    private static final Api.Options<HuaweiIdSignInOptions> a = new Api.Options<HuaweiIdSignInOptions>() {
        /* class com.huawei.hms.support.api.hwid.HuaweiId.AnonymousClass1 */

        /* renamed from: a */
        public List<Scope> getScopeList(HuaweiIdSignInOptions huaweiIdSignInOptions) {
            return huaweiIdSignInOptions.getScopeList();
        }

        /* renamed from: b */
        public List<PermissionInfo> getPermissionInfoList(HuaweiIdSignInOptions huaweiIdSignInOptions) {
            return huaweiIdSignInOptions.getPermissionInfos();
        }
    };
}
