package com.huawei.updatesdk.service.otaupdate;

import com.huawei.updatesdk.a.b.d.c.c;
import com.huawei.updatesdk.a.b.d.c.d;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class f {
    private static String a;
    private static b b;

    /* access modifiers changed from: private */
    public static class b implements com.huawei.updatesdk.a.b.d.c.a {
        private b() {
        }

        @Override // com.huawei.updatesdk.a.b.d.c.a
        public void a(c cVar, d dVar) {
        }

        @Override // com.huawei.updatesdk.a.b.d.c.a
        public void b(c cVar, d dVar) {
            List<ApkUpgradeInfo> list;
            if (dVar instanceof com.huawei.updatesdk.service.appmgr.bean.b) {
                com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) dVar;
                if (dVar.d() == 0 && dVar.e() == 0) {
                    ArrayList<ApkUpgradeInfo> arrayList = bVar.list_;
                    if ((arrayList != null && arrayList.size() != 0) || ((list = bVar.notRcmList_) != null && list.size() != 0)) {
                        ApkUpgradeInfo b = f.b(bVar.list_);
                        if (f.b != null) {
                            f.b.a(b);
                        }
                    } else if (f.b != null) {
                        f.b.a(dVar.d());
                    }
                } else if (f.b != null) {
                    f.b.b(dVar.d());
                }
            } else if (f.b != null) {
                f.b.a(dVar.d());
            }
        }
    }

    static {
        C0201.m83(f.class, 741);
    }

    public static void a(b bVar) {
        b = bVar;
    }

    public static void a(String str) {
        a = str;
        com.huawei.updatesdk.service.appmgr.bean.a n = com.huawei.updatesdk.service.appmgr.bean.a.n(str);
        n.a(h.g().e() ? 34 : 0);
        com.huawei.updatesdk.b.e.a.b.a(n, new b());
    }

    /* access modifiers changed from: private */
    public static ApkUpgradeInfo b(List<ApkUpgradeInfo> list) {
        if (list == null) {
            return null;
        }
        for (ApkUpgradeInfo apkUpgradeInfo : list) {
            String str = a;
            if (str != null && str.equals(apkUpgradeInfo.getPackage_())) {
                return apkUpgradeInfo;
            }
        }
        return null;
    }
}
