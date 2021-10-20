package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.ServiceDiscovery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: tb2  reason: default package */
public class tb2 {
    private Context a;

    /* access modifiers changed from: private */
    /* renamed from: tb2$b */
    public static class b implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private b() {
        }

        /* renamed from: a */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    public tb2(Context context) {
        this.a = context;
    }

    private <T extends com.huawei.agconnect.core.b> T a(String str) {
        String str2;
        String str3;
        StringBuilder sb;
        String r0 = C0201.m82(29581);
        String r1 = C0201.m82(29582);
        try {
            Class<?> cls = Class.forName(str);
            if (com.huawei.agconnect.core.b.class.isAssignableFrom(cls)) {
                return (T) ((com.huawei.agconnect.core.b) Class.forName(str).newInstance());
            }
            Log.e(r1, cls + C0201.m82(29583));
            return null;
        } catch (ClassNotFoundException e) {
            str2 = C0201.m82(29584) + e.getMessage();
            Log.e(r1, str2);
            return null;
        } catch (InstantiationException e2) {
            sb = new StringBuilder();
            sb.append(r0);
            str3 = e2.getLocalizedMessage();
            sb.append(str3);
            str2 = sb.toString();
            Log.e(r1, str2);
            return null;
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append(r0);
            str3 = e3.getLocalizedMessage();
            sb.append(str3);
            str2 = sb.toString();
            Log.e(r1, str2);
            return null;
        }
    }

    private List<String> c() {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        Bundle d = d();
        if (d == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap(10);
        for (String str : d.keySet()) {
            if (C0201.m82(29585).equals(d.getString(str))) {
                String[] split = str.split(C0201.m82(29586));
                int length = split.length;
                String r8 = C0201.m82(29587);
                if (length == 2) {
                    try {
                        hashMap.put(split[0], Integer.valueOf(split[1]));
                    } catch (NumberFormatException e) {
                        sb = new StringBuilder();
                        sb.append(C0201.m82(29588));
                        str = e.getMessage();
                    }
                } else if (split.length == 1) {
                    hashMap.put(split[0], Integer.valueOf((int) C0188.f18));
                } else {
                    sb = new StringBuilder();
                    sb.append(C0201.m82(29589));
                    sb.append(str);
                    Log.e(r8, sb.toString());
                }
            }
        }
        ArrayList<Map.Entry> arrayList2 = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList2, new b());
        for (Map.Entry entry : arrayList2) {
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    private Bundle d() {
        String r0 = C0201.m82(29590);
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(this.a, ServiceDiscovery.class), 128);
            if (serviceInfo != null) {
                return serviceInfo.metaData;
            }
            Log.e(r0, C0201.m82(29591));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(r0, C0201.m82(29592) + e.getLocalizedMessage());
        }
    }

    public List<com.huawei.agconnect.core.a> b() {
        String r0 = C0201.m82(29593);
        Log.i(r0, C0201.m82(29594));
        List<String> c = c();
        ArrayList arrayList = new ArrayList();
        for (String str : c) {
            com.huawei.agconnect.core.b a2 = a(str);
            if (a2 != null) {
                a2.initialize(this.a);
                List<com.huawei.agconnect.core.a> a3 = a2.a(this.a);
                if (a3 != null) {
                    arrayList.addAll(a3);
                }
            }
        }
        Log.i(r0, C0201.m82(29595) + Integer.valueOf(arrayList.size()));
        return arrayList;
    }
}
