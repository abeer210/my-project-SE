package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;
import vigqyno.C0201;

/* compiled from: LogCatNode */
public class d implements b {
    private b a;

    @Override // com.huawei.hms.base.log.b
    public void a(Context context, String str) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.b
    public void a(String str, int i, String str2, String str3) {
        Log.println(i, C0201.m82(33336) + str2, str3);
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(str, i, str2, str3);
        }
    }
}
