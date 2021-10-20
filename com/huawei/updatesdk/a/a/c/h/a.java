package com.huawei.updatesdk.a.a.c.h;

import android.content.Context;
import com.huawei.updatesdk.a.a.c.e;
import java.util.ArrayList;
import java.util.Set;
import vigqyno.C0201;

public class a extends com.huawei.updatesdk.a.b.d.c.b {
    private String abis_;
    private String deviceFeatures_;
    private int dpi_;
    private String preferLan_;

    public static class b {
        private final Context a;
        private boolean b;
        private Set<String> c;
        private String[] d;
        private boolean e;

        public b(Context context) {
            this.a = context;
        }

        private String b() {
            ArrayList arrayList = new ArrayList(b.d(this.a));
            Set<String> set = this.c;
            if (set != null) {
                for (String str : set) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            boolean z = this.e;
            String r2 = C0201.m82(30865);
            return z ? e.a(b.a(arrayList, this.d), r2) : e.a(arrayList, r2);
        }

        public b a(boolean z) {
            this.b = z;
            return this;
        }

        public a a() {
            a aVar = new a();
            aVar.abis_ = e.a(b.e(), C0201.m82(30866));
            aVar.dpi_ = Integer.parseInt(b.f(this.a));
            aVar.preferLan_ = b();
            if (this.b) {
                aVar.deviceFeatures_ = b.a(this.a);
            }
            return aVar;
        }
    }

    private a() {
    }
}
