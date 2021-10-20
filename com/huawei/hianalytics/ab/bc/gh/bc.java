package com.huawei.hianalytics.ab.bc.gh;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.bc.ef.ab;
import vigqyno.C0201;

public class bc {
    private static bc cd;
    private String ab;
    private String bc;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        if (fg() != false) goto L_0x0051;
     */
    private String ab(String str) {
        String a = fg() ? yb2.a(C0201.m82(17298), str) : C0201.m82(17299);
        if (TextUtils.isEmpty(a)) {
            ab.cd(C0201.m82(17300), C0201.m82(17301));
            a = com.huawei.hianalytics.ab.bc.ab.ab.ab(str, ef());
            if (TextUtils.isEmpty(a)) {
                a = zb2.e(16);
                cd(bc(a));
            } else if (fg()) {
                cd(bc(a));
            }
            ab.cd();
        }
        return a;
    }

    private String bc(String str) {
        return fg() ? yb2.d(C0201.m82(17302), str) : com.huawei.hianalytics.ab.bc.ab.ab.bc(str, ef());
    }

    private String cd() {
        String ab2 = com.huawei.hianalytics.ab.bc.ij.ab.ab(com.huawei.hianalytics.ab.ab.bc.fg(), C0201.m82(17303), C0201.m82(17304), C0201.m82(17305));
        if (!TextUtils.isEmpty(ab2)) {
            return ab(ab2);
        }
        String e = zb2.e(16);
        cd(bc(e));
        return e;
    }

    private boolean cd(String str) {
        String r0 = C0201.m82(17306);
        ab.cd(r0, C0201.m82(17307));
        if (TextUtils.isEmpty(str)) {
            ab.cd(r0, C0201.m82(17308));
            return false;
        }
        Context fg = com.huawei.hianalytics.ab.ab.bc.fg();
        String r1 = C0201.m82(17309);
        com.huawei.hianalytics.ab.bc.ij.ab.bc(fg, r1, C0201.m82(17310), str);
        com.huawei.hianalytics.ab.bc.ij.ab.bc(com.huawei.hianalytics.ab.ab.bc.fg(), r1, C0201.m82(17311), System.currentTimeMillis());
        return true;
    }

    public static bc de() {
        if (cd == null) {
            gh();
        }
        return cd;
    }

    private String ef() {
        if (TextUtils.isEmpty(this.bc)) {
            this.bc = new ab().ab();
        }
        return this.bc;
    }

    private boolean fg() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private static synchronized void gh() {
        synchronized (bc.class) {
            if (cd == null) {
                cd = new bc();
            }
        }
    }

    public String ab() {
        if (TextUtils.isEmpty(this.ab)) {
            this.ab = cd();
        }
        return this.ab;
    }

    public void bc() {
        String e = zb2.e(16);
        if (cd(bc(e))) {
            this.ab = e;
        }
    }
}
