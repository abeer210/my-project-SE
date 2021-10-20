package com.huawei.hianalytics.ab.fg;

import android.content.Context;
import com.huawei.hianalytics.ab.bc.kl.cd;
import vigqyno.C0201;

public final class ab {
    private static ab bc;
    private static final Object cd = new Object();
    private Context ab;

    private ab() {
    }

    public static ab bc() {
        if (bc == null) {
            cd();
        }
        return bc;
    }

    private static synchronized void cd() {
        synchronized (ab.class) {
            if (bc == null) {
                bc = new ab();
            }
        }
    }

    public void ab() {
        String r0 = C0201.m82(34857);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r0, C0201.m82(34858));
        if (this.ab == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(34859));
            return;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r0, C0201.m82(34860));
        com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, C0201.m82(34861), new String[0]);
        com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, C0201.m82(34862), new String[0]);
    }

    public void ab(Context context) {
        synchronized (cd) {
            if (this.ab != null) {
                com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(34863), C0201.m82(34864));
                return;
            }
            this.ab = context;
            com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc().ab(this.ab);
            com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc().fg(context.getPackageName());
            com.huawei.hianalytics.ab.cd.bc.ab.ab().ab(context);
        }
    }

    public void ab(String str) {
        Context context = this.ab;
        String r1 = C0201.m82(34865);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(34866));
            return;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(34867));
        com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, str);
    }

    public void bc(String str) {
        String r0 = C0201.m82(34868);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r0, C0201.m82(34869));
        Context context = this.ab;
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r0, C0201.m82(34870));
            return;
        }
        com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc().ef(cd.ab(C0201.m82(34871), str, C0201.m82(34872), context.getPackageName()));
    }
}
