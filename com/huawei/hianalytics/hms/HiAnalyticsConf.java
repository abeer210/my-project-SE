package com.huawei.hianalytics.hms;

import android.content.Context;
import com.huawei.hianalytics.ab.bc.cd.ab.cd;
import com.huawei.hianalytics.ab.bc.ef.ab;
import com.huawei.hianalytics.ab.bc.kl.fg;
import com.huawei.hianalytics.ab.fg.bc;
import vigqyno.C0201;

public class HiAnalyticsConf {

    public static class Builder {
        public String appid;
        public Context mContext;
        public cd maintData;
        public cd operData;

        public Builder(Context context) {
            if (context != null) {
                this.mContext = context.getApplicationContext();
            }
            this.operData = new cd();
            this.maintData = new cd();
        }

        public void create() {
            Context context = this.mContext;
            String r1 = C0201.m82(30192);
            if (context == null) {
                ab.bc(r1, C0201.m82(30193));
                return;
            }
            ab.cd(r1, C0201.m82(30194));
            com.huawei.hianalytics.ab.fg.cd cdVar = new com.huawei.hianalytics.ab.fg.cd(C0201.m82(30195));
            cdVar.cd(new cd(this.operData));
            cdVar.bc(new cd(this.maintData));
            com.huawei.hianalytics.ab.fg.ab.bc().ab(this.mContext);
            bc.ab().ab(this.mContext);
            ab.cd().ab(cdVar);
            com.huawei.hianalytics.ab.fg.ab.bc().bc(this.appid);
        }

        public void refresh(boolean z) {
            String r0 = C0201.m82(30196);
            ab.cd(r0, C0201.m82(30197));
            cd cdVar = new cd(this.maintData);
            cd cdVar2 = new cd(this.operData);
            com.huawei.hianalytics.ab.fg.cd bc = ab.cd().bc();
            if (bc == null) {
                ab.ef(r0, C0201.m82(30198));
                return;
            }
            bc.ab(1, cdVar);
            bc.ab(0, cdVar2);
            if (this.appid != null) {
                com.huawei.hianalytics.ab.fg.ab.bc().bc(this.appid);
            }
            if (z) {
                com.huawei.hianalytics.ab.fg.ab.bc().ab(C0201.m82(30199));
            }
        }

        public Builder setAndroidId(String str) {
            ab.cd(C0201.m82(30200), C0201.m82(30201));
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(30202), str, 4096)) {
                str = C0201.m82(30203);
            }
            this.operData.ef().ab(str);
            this.maintData.ef().ab(str);
            return this;
        }

        public Builder setAppID(String str) {
            ab.cd(C0201.m82(30204), C0201.m82(30205));
            this.appid = str;
            return this;
        }

        public Builder setChannel(String str) {
            ab.cd(C0201.m82(30206), C0201.m82(30207));
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(30208), str, 256)) {
                str = C0201.m82(30209);
            }
            this.operData.ab(str);
            this.maintData.ab(str);
            return this;
        }

        public Builder setCollectURL(int i, String str) {
            cd cdVar;
            String r1 = C0201.m82(30211);
            ab.cd(r1, C0201.m82(30210) + i);
            if (!fg.bc(str)) {
                str = C0201.m82(30212);
            }
            if (i == 0) {
                cdVar = this.operData;
            } else if (i != 1) {
                ab.fg(r1, C0201.m82(30213));
                return this;
            } else {
                cdVar = this.maintData;
            }
            cdVar.bc(str);
            return this;
        }

        @Deprecated
        public Builder setEnableAndroidID(boolean z) {
            ab.cd(C0201.m82(30214), C0201.m82(30215));
            this.operData.ef().ab(z);
            this.maintData.ef().ab(z);
            return this;
        }

        @Deprecated
        public Builder setEnableImei(boolean z) {
            ab.cd(C0201.m82(30216), C0201.m82(30217));
            this.operData.ef().bc(z);
            this.maintData.ef().bc(z);
            return this;
        }

        public Builder setEnableMccMnc(boolean z) {
            ab.cd(C0201.m82(30218), C0201.m82(30219));
            this.operData.bc(z);
            this.maintData.bc(z);
            return this;
        }

        @Deprecated
        public Builder setEnableSN(boolean z) {
            ab.cd(C0201.m82(30220), C0201.m82(30221));
            this.operData.ef().cd(z);
            this.maintData.ef().cd(z);
            return this;
        }

        @Deprecated
        public Builder setEnableUDID(boolean z) {
            ab.cd(C0201.m82(30222), C0201.m82(30223));
            this.operData.ef().de(z);
            this.maintData.ef().de(z);
            return this;
        }

        public Builder setEnableUUID(boolean z) {
            ab.ab(C0201.m82(30224), C0201.m82(30225));
            this.operData.de(z);
            this.maintData.de(z);
            return this;
        }

        public Builder setIMEI(String str) {
            ab.cd(C0201.m82(30226), C0201.m82(30227));
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(30228), str, 4096)) {
                str = C0201.m82(30229);
            }
            this.operData.ef().bc(str);
            this.maintData.ef().bc(str);
            return this;
        }

        public Builder setSDKPkgName(String str) {
            ab.ab(C0201.m82(30230), C0201.m82(30231));
            if (com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(30232), str, C0201.m82(30233))) {
                this.operData.cd(str);
                this.maintData.cd(str);
            }
            return this;
        }

        public Builder setSN(String str) {
            ab.cd(C0201.m82(30234), C0201.m82(30235));
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(30236), str, 4096)) {
                str = C0201.m82(30237);
            }
            this.operData.ef().de(str);
            this.maintData.ef().de(str);
            return this;
        }

        public Builder setUDID(String str) {
            ab.cd(C0201.m82(30238), C0201.m82(30239));
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(30240), str, 4096)) {
                str = C0201.m82(30241);
            }
            this.operData.ef().cd(str);
            this.maintData.ef().cd(str);
            return this;
        }
    }
}
