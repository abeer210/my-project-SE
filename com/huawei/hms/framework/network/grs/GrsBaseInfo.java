package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.a.c;
import com.huawei.hms.framework.network.grs.b.b;
import com.huawei.hms.framework.network.grs.local.model.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import vigqyno.C0201;

public class GrsBaseInfo implements Cloneable {
    private static final String TAG = null;
    private String androidVersion;
    private String appName;
    private String countrySource;
    private String deviceModel;
    private String issueCountry;
    private String regCountry;
    private String romVersion;
    private String serCountry;
    private String uid;
    private String versionName;

    public @interface CountryCodeSource {
        public static final String APP = null;
        public static final String LOCALE_INFO = null;
        public static final String NETWORK_COUNTRY = null;
        public static final String SIM_COUNTRY = null;
        public static final String UNKNOWN = null;
        public static final String VENDOR_COUNTRY = null;

        static {
            C0201.m83(CountryCodeSource.class, 479);
        }
    }

    static {
        C0201.m83(GrsBaseInfo.class, 669);
    }

    public GrsBaseInfo() {
    }

    public GrsBaseInfo(Context context) {
        this.issueCountry = GrsApp.getInstance().getIssueCountryCode(context);
    }

    private StringBuffer getStringBuffer(StringBuffer stringBuffer, boolean z, Context context) {
        String androidVersion2 = getAndroidVersion();
        boolean isEmpty = TextUtils.isEmpty(androidVersion2);
        String r2 = C0201.m82(9955);
        String r3 = C0201.m82(9956);
        if (!isEmpty) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r2);
            }
            stringBuffer.append(C0201.m82(9957));
            stringBuffer.append(r3);
            stringBuffer.append(androidVersion2);
        }
        String romVersion2 = getRomVersion();
        if (!TextUtils.isEmpty(romVersion2)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r2);
            }
            stringBuffer.append(C0201.m82(9958));
            stringBuffer.append(r3);
            stringBuffer.append(romVersion2);
        }
        String deviceModel2 = getDeviceModel();
        if (!TextUtils.isEmpty(deviceModel2)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r2);
            }
            stringBuffer.append(C0201.m82(9959));
            stringBuffer.append(r3);
            stringBuffer.append(deviceModel2);
        }
        String b = new c(context).b();
        if (!TextUtils.isEmpty(b) && !z) {
            try {
                String encode = URLEncoder.encode(b, C0201.m82(9960));
                if (!TextUtils.isEmpty(stringBuffer.toString())) {
                    stringBuffer.append(r2);
                }
                stringBuffer.append(C0201.m82(9961));
                stringBuffer.append(r3);
                stringBuffer.append(encode);
            } catch (UnsupportedEncodingException e) {
                Logger.e(TAG, C0201.m82(9962), e);
            }
        }
        String countrySource2 = getCountrySource();
        if (!TextUtils.isEmpty(countrySource2)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r2);
            }
            stringBuffer.append(C0201.m82(9963));
            stringBuffer.append(r3);
            stringBuffer.append(countrySource2);
        }
        return stringBuffer;
    }

    private boolean isEqual(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return (str == null || str2 == null || !str.equals(str2)) ? false : true;
    }

    @Override // java.lang.Object
    public GrsBaseInfo clone() {
        return (GrsBaseInfo) super.clone();
    }

    public boolean compare(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GrsBaseInfo.class != obj.getClass() || !(obj instanceof GrsBaseInfo)) {
            return false;
        }
        GrsBaseInfo grsBaseInfo = (GrsBaseInfo) obj;
        return isEqual(this.serCountry, grsBaseInfo.serCountry) && isEqual(this.versionName, grsBaseInfo.versionName) && isEqual(this.appName, grsBaseInfo.appName) && isEqual(this.uid, grsBaseInfo.uid) && isEqual(this.regCountry, grsBaseInfo.regCountry) && isEqual(this.issueCountry, grsBaseInfo.issueCountry) && isEqual(this.androidVersion, grsBaseInfo.androidVersion) && isEqual(this.romVersion, grsBaseInfo.romVersion) && isEqual(this.deviceModel, grsBaseInfo.deviceModel) && isEqual(this.countrySource, grsBaseInfo.countrySource);
    }

    public GrsBaseInfo copy() {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setAppName(this.appName);
        grsBaseInfo.setSerCountry(this.serCountry);
        grsBaseInfo.setRegCountry(this.regCountry);
        grsBaseInfo.setIssueCountry(this.issueCountry);
        grsBaseInfo.setCountrySource(this.countrySource);
        grsBaseInfo.setAndroidVersion(this.androidVersion);
        grsBaseInfo.setDeviceModel(this.deviceModel);
        grsBaseInfo.setRomVersion(this.romVersion);
        grsBaseInfo.setUid(this.uid);
        grsBaseInfo.setVersionName(this.versionName);
        return grsBaseInfo;
    }

    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getCountrySource() {
        return this.countrySource;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getGrsParasKey(boolean z, boolean z2, Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        a a = b.a(context.getPackageName(), this).a();
        String a2 = a != null ? a.a() : C0201.m82(9964);
        String appName2 = getAppName();
        if (!TextUtils.isEmpty(appName2) && TextUtils.isEmpty(a2)) {
            stringBuffer.append(C0201.m82(9965));
            stringBuffer.append(C0201.m82(9966));
            stringBuffer.append(appName2);
        }
        String grsReqParamJoint = getGrsReqParamJoint(z, z2, a2, context);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(C0201.m82(9967));
            }
            stringBuffer.append(grsReqParamJoint);
        }
        return stringBuffer.toString();
    }

    public String getGrsReqParamJoint(boolean z, boolean z2, String str, Context context) {
        String a;
        StringBuffer stringBuffer = new StringBuffer();
        boolean equals = C0201.m82(9968).equals(str);
        String r2 = C0201.m82(9969);
        if (equals) {
            Logger.v(TAG, C0201.m82(9970));
        } else {
            boolean isEmpty = TextUtils.isEmpty(str);
            String r3 = C0201.m82(9971);
            if (!isEmpty) {
                stringBuffer.append(r3);
                stringBuffer.append(r2);
            } else if (!TextUtils.isEmpty(getAppName())) {
                stringBuffer.append(r3);
                stringBuffer.append(r2);
                str = getAppName();
            }
            stringBuffer.append(str);
        }
        String versionName2 = getVersionName();
        boolean isEmpty2 = TextUtils.isEmpty(versionName2);
        String r32 = C0201.m82(9972);
        if (!isEmpty2) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r32);
            }
            stringBuffer.append(C0201.m82(9973));
            stringBuffer.append(r2);
            stringBuffer.append(versionName2);
        }
        String uid2 = getUid();
        if (!TextUtils.isEmpty(uid2)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r32);
            }
            stringBuffer.append(C0201.m82(9974));
            stringBuffer.append(r2);
            if (z) {
                a = com.huawei.hms.framework.network.grs.d.b.b(uid2);
            } else if (z2) {
                a = com.huawei.hms.framework.network.grs.d.b.a(uid2);
            } else {
                stringBuffer.append(uid2);
            }
            stringBuffer.append(a);
        }
        String regCountry2 = getRegCountry();
        boolean isEmpty3 = TextUtils.isEmpty(regCountry2);
        String r1 = C0201.m82(9975);
        if (!isEmpty3 && !r1.equals(regCountry2)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r32);
            }
            stringBuffer.append(C0201.m82(9976));
            stringBuffer.append(r2);
            stringBuffer.append(regCountry2);
        }
        String serCountry2 = getSerCountry();
        if (!TextUtils.isEmpty(serCountry2) && !r1.equals(serCountry2)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r32);
            }
            stringBuffer.append(C0201.m82(9977));
            stringBuffer.append(r2);
            stringBuffer.append(serCountry2);
        }
        String issueCountry2 = getIssueCountry();
        if (!TextUtils.isEmpty(issueCountry2) && !r1.equals(issueCountry2)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(r32);
            }
            stringBuffer.append(C0201.m82(9978));
            stringBuffer.append(r2);
            stringBuffer.append(issueCountry2);
        }
        return getStringBuffer(stringBuffer, z2, context).toString();
    }

    public String getIssueCountry() {
        return this.issueCountry;
    }

    public String getRegCountry() {
        return this.regCountry;
    }

    public String getRomVersion() {
        return this.romVersion;
    }

    public String getSerCountry() {
        return this.serCountry;
    }

    public String getUid() {
        return this.uid;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setAndroidVersion(String str) {
        this.androidVersion = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setCountrySource(String str) {
        this.countrySource = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    @Deprecated
    public void setIssueCountry(String str) {
        this.issueCountry = str;
    }

    public void setRegCountry(String str) {
        this.regCountry = str;
    }

    public void setRomVersion(String str) {
        this.romVersion = str;
    }

    public void setSerCountry(String str) {
        this.serCountry = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public int uniqueCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.appName);
        String r1 = C0201.m82(9979);
        sb.append(r1);
        sb.append(this.serCountry);
        sb.append(r1);
        sb.append(this.regCountry);
        sb.append(r1);
        sb.append(this.issueCountry);
        return sb.toString().hashCode();
    }
}
