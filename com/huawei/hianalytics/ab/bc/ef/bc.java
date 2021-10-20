package com.huawei.hianalytics.ab.bc.ef;

import android.util.Log;
import com.huawei.hianalytics.ab.gh.ab;
import vigqyno.C0201;

public class bc {
    private boolean ab = false;
    private int bc = 4;

    private static String ab() {
        return C0201.m82(4917) + ab.ab();
    }

    public void ab(int i) {
        Log.i(C0201.m82(4921), '\n' + C0201.m82(4918) + ab() + C0201.m82(4919) + C0201.m82(4920));
        this.bc = i;
        this.ab = true;
    }

    public void ab(int i, String str, String str2) {
        if (i == 3) {
            Log.d(str, str2);
        } else if (i == 5) {
            Log.w(str, str2);
        } else if (i != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public void bc(int i, String str, String str2) {
        ab(i, C0201.m82(4923), str + C0201.m82(4922) + str2);
    }

    public boolean bc(int i) {
        return this.ab && i >= this.bc;
    }
}
