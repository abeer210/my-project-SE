package com.huawei.hianalytics.ab.bc.hi;

import java.util.Calendar;
import java.util.UUID;
import vigqyno.C0201;

public class bc {
    private long ab = 1800000;
    private volatile boolean bc = false;
    private ab cd = null;

    /* access modifiers changed from: package-private */
    public class ab {
        public String ab = UUID.randomUUID().toString().replace(C0201.m82(36102), C0201.m82(36103));
        public boolean bc;
        private long cd;

        public ab(long j) {
            this.ab += C0201.m82(36104) + j;
            this.cd = j;
            this.bc = true;
            bc.this.bc = false;
        }

        private boolean ab(long j, long j2) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j2);
            return (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) ? false : true;
        }

        private void bc(long j) {
            com.huawei.hianalytics.ab.bc.ef.ab.cd(C0201.m82(36105), C0201.m82(36106));
            String uuid = UUID.randomUUID().toString();
            this.ab = uuid;
            this.ab = uuid.replace(C0201.m82(36107), C0201.m82(36108));
            this.ab += C0201.m82(36109) + j;
            this.cd = j;
            this.bc = true;
        }

        private boolean bc(long j, long j2) {
            return j2 - j >= bc.this.ab;
        }

        public void ab(long j) {
            if (bc.this.bc) {
                bc.this.bc = false;
                bc(j);
            } else if (bc(this.cd, j) || ab(this.cd, j)) {
                bc(j);
            } else {
                this.cd = j;
                this.bc = false;
            }
        }
    }

    public void ab() {
        this.cd = null;
        this.bc = false;
    }

    public void ab(long j) {
        ab abVar = this.cd;
        if (abVar == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.cd(C0201.m82(28527), C0201.m82(28528));
            this.cd = new ab(j);
            return;
        }
        abVar.ab(j);
    }

    public String bc() {
        ab abVar = this.cd;
        if (abVar != null) {
            return abVar.ab;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(28529), C0201.m82(28530));
        return C0201.m82(28531);
    }

    public boolean cd() {
        ab abVar = this.cd;
        if (abVar != null) {
            return abVar.bc;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(28532), C0201.m82(28533));
        return false;
    }
}
