package com.huawei.hianalytics.ab.cd.bc;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.bc.cd.ab.de;
import com.huawei.hianalytics.ab.cd.ab.ab;
import vigqyno.C0201;

public abstract class bc {
    private ab ab(int i, Context context) {
        String str;
        if (i != 0) {
            str = fg();
            if (!TextUtils.isEmpty(str)) {
                return new ab(com.huawei.hianalytics.ab.cd.ab.bc.UDID, str);
            }
        } else {
            str = C0201.m82(24084);
        }
        if ((i & 2) != 0) {
            str = bc(context);
            if (!TextUtils.isEmpty(str)) {
                return new ab(com.huawei.hianalytics.ab.cd.ab.bc.IMEI, str);
            }
        }
        if ((i & 1) == 0) {
            return new ab(com.huawei.hianalytics.ab.cd.ab.bc.EMPTY, str);
        }
        return new ab(com.huawei.hianalytics.ab.cd.ab.bc.SN, cd(context));
    }

    private ab bc(int i, Context context) {
        String str;
        if ((i & 4) != 0 && (i & 1) != 0) {
            return new ab(com.huawei.hianalytics.ab.cd.ab.bc.UDID, ab(cd(context)));
        }
        if ((i & 1) != 0) {
            str = cd(context);
            if (!TextUtils.isEmpty(str)) {
                return new ab(com.huawei.hianalytics.ab.cd.ab.bc.SN, str);
            }
        } else {
            str = C0201.m82(24085);
        }
        if ((i & 2) == 0) {
            return new ab(com.huawei.hianalytics.ab.cd.ab.bc.EMPTY, str);
        }
        return new ab(com.huawei.hianalytics.ab.cd.ab.bc.IMEI, bc(context));
    }

    private String bc(Context context) {
        de bc = com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc();
        if (TextUtils.isEmpty(bc.ik())) {
            bc.gh(cd.fg(context));
        }
        return bc.ik();
    }

    private String cd(Context context) {
        de bc = com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc();
        if (TextUtils.isEmpty(bc.a())) {
            bc.kl(cd.hi(context));
        }
        return bc.a();
    }

    private boolean ef() {
        de bc = com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc();
        if (TextUtils.isEmpty(bc.fg())) {
            bc.de(com.huawei.hianalytics.ab.bc.bc.ab.ab());
        }
        return !TextUtils.isEmpty(bc.fg());
    }

    private String fg() {
        de bc = com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc();
        if (TextUtils.isEmpty(bc.b())) {
            bc.lm(cd.cd());
        }
        return bc.b();
    }

    public ab ab(Context context) {
        ab abVar;
        String cd = cd();
        if (!TextUtils.isEmpty(cd)) {
            return new ab(com.huawei.hianalytics.ab.cd.ab.bc.UDID, cd);
        }
        String ab = ab();
        if (!TextUtils.isEmpty(ab)) {
            return new ab(com.huawei.hianalytics.ab.cd.ab.bc.IMEI, ab);
        }
        boolean ef = ef();
        String bc = bc();
        if (TextUtils.isEmpty(bc)) {
            return ef ? ab(de(), context) : bc(de(), context);
        }
        if (ef) {
            com.huawei.hianalytics.ab.cd.ab.bc bcVar = com.huawei.hianalytics.ab.cd.ab.bc.SN;
            return abVar;
        }
        abVar = new ab(com.huawei.hianalytics.ab.cd.ab.bc.UDID, ab(bc));
        return abVar;
    }

    public abstract String ab();

    public abstract String ab(String str);

    public abstract String bc();

    public abstract String cd();

    public abstract int de();
}
