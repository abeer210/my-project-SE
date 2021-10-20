package com.huawei.hianalytics.ab.bc.de;

import android.text.TextUtils;
import com.huawei.hianalytics.ab.ab.cd;
import com.huawei.hianalytics.ab.bc.cd.bc.de;
import com.huawei.hianalytics.ab.bc.kl.bc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import vigqyno.C0188;
import vigqyno.C0201;

public class ab {
    private List<de> ab;
    private String bc;
    private String cd;
    private String de;

    public ab(List<de> list, String str, String str2, String str3) {
        this.ab = list;
        this.bc = str;
        this.cd = str2;
        this.de = str3;
    }

    private void ab(List<de> list, String str, String str2) {
        if (!list.isEmpty()) {
            int size = (list.size() / C0188.f21) + 1;
            for (int i = 0; i < size; i++) {
                int i2 = i * C0188.f21;
                List<de> subList = list.subList(i2, Math.min(list.size(), i2 + C0188.f21));
                String replace = UUID.randomUUID().toString().replace(C0201.m82(37271), C0201.m82(37272));
                long currentTimeMillis = System.currentTimeMillis();
                long ab2 = ((long) cd.ab(str2, str)) * 86400000;
                ArrayList arrayList = new ArrayList();
                for (de deVar : subList) {
                    if (!bc.ab(deVar.bc(), currentTimeMillis, ab2)) {
                        arrayList.add(deVar);
                    }
                }
                if (arrayList.size() > 0) {
                    new bc(str2, str, this.de, arrayList, replace).ab();
                } else {
                    com.huawei.hianalytics.ab.bc.ef.ab.ef(C0201.m82(37273), C0201.m82(37274));
                }
            }
        }
    }

    public void ab() {
        Object obj = this.cd;
        String r1 = C0201.m82(37275);
        if (r1.equals(obj)) {
            List<de> arrayList = new ArrayList<>();
            List<de> arrayList2 = new ArrayList<>();
            List<de> arrayList3 = new ArrayList<>();
            List<de> arrayList4 = new ArrayList<>();
            Iterator<de> it = this.ab.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String r7 = C0201.m82(37276);
                String r8 = C0201.m82(37277);
                String r9 = C0201.m82(37278);
                String r10 = C0201.m82(37279);
                if (hasNext) {
                    de next = it.next();
                    String cd2 = next.cd();
                    if (TextUtils.isEmpty(cd2) || r10.equals(cd2)) {
                        arrayList4.add(next);
                    } else if (r9.equals(cd2)) {
                        arrayList.add(next);
                    } else if (r8.equals(cd2)) {
                        arrayList2.add(next);
                    } else if (r7.equals(cd2)) {
                        arrayList3.add(next);
                    }
                } else {
                    ab(arrayList4, r10, r1);
                    ab(arrayList, r9, r1);
                    ab(arrayList2, r8, r1);
                    ab(arrayList3, r7, r1);
                    return;
                }
            }
        } else {
            ab(this.ab, this.cd, this.bc);
        }
    }
}
