package com.huawei.hms.framework.network.grs.local.model;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.CreateFileUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.SystemPropUtils;
import java.util.Locale;
import vigqyno.C0201;

public class CountryCodeBean {
    private static final String ANDRIOD_SYSTEMPROP = null;
    private static final int COUNTRYCODE_SIZE = 0;
    private static final String LOCALE_COUNTRYSYSTEMPROP = null;
    private static final String LOCALE_REGION_COUNTRYSYSTEMPROP = null;
    private static final String SPECIAL_COUNTRYCODE_CN = null;
    private static final String SPECIAL_COUNTRYCODE_EU = null;
    private static final String SPECIAL_COUNTRYCODE_LA = null;
    private static final String TAG = null;
    private static final String VENDORCOUNTRY_SYSTEMPROP = null;
    private String countryCode = this.countryCode.toUpperCase(Locale.ENGLISH);
    private String countrySource;

    static {
        C0201.m83(CountryCodeBean.class, 456);
    }

    public CountryCodeBean(Context context, boolean z) {
        String r0 = C0201.m82(13999);
        this.countrySource = r0;
        this.countryCode = r0;
        init(context, z);
    }

    private void checkCodeLenth() {
        String str = this.countryCode;
        if (str == null || str.length() != 2) {
            String r0 = C0201.m82(14000);
            this.countryCode = r0;
            this.countrySource = r0;
        }
    }

    private void getLocaleCountryCode() {
        if (CreateFileUtil.isPVersion()) {
            getRegionSettingCountryCode();
        } else {
            getProductCountryCode();
        }
        this.countrySource = C0201.m82(14001);
    }

    private void getProductCountryCode() {
        int lastIndexOf;
        String r0 = C0201.m82(14002);
        String r1 = C0201.m82(14003);
        String r2 = C0201.m82(14004);
        String r3 = C0201.m82(14005);
        this.countryCode = SystemPropUtils.getProperty(r0, r1, r2, r3);
        String str = TAG;
        Logger.i(str, C0201.m82(14006) + this.countryCode);
        if (TextUtils.isEmpty(this.countryCode) || r3.equals(this.countryCode)) {
            String property = SystemPropUtils.getProperty(r0, C0201.m82(14007), r2, r3);
            if (!TextUtils.isEmpty(property) && (lastIndexOf = property.lastIndexOf(C0201.m82(14008))) != -1) {
                this.countryCode = property.substring(lastIndexOf + 1);
                String str2 = TAG;
                Logger.i(str2, C0201.m82(14009) + this.countryCode);
            }
        }
        if (!C0201.m82(14010).equalsIgnoreCase(this.countryCode)) {
            this.countryCode = r3;
        }
    }

    private void getRegionSettingCountryCode() {
        this.countryCode = Locale.getDefault().getCountry();
        String str = TAG;
        Logger.i(str, C0201.m82(14011) + this.countryCode);
        if (TextUtils.isEmpty(this.countryCode)) {
            this.countryCode = C0201.m82(14012);
        }
    }

    private void getSimCountryCode(Context context) {
        getSimCountryCode(context, false);
    }

    private void getSimCountryCode(Context context, boolean z) {
        StringBuilder sb;
        String str;
        String str2;
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService(C0201.m82(14013));
        if (telephonyManager != null) {
            if (!z || telephonyManager.getPhoneType() == 2) {
                this.countryCode = telephonyManager.getSimCountryIso();
                this.countrySource = C0201.m82(14016);
                str = TAG;
                sb = new StringBuilder();
                str2 = C0201.m82(14017);
            } else {
                this.countryCode = telephonyManager.getNetworkCountryIso();
                this.countrySource = C0201.m82(14014);
                str = TAG;
                sb = new StringBuilder();
                str2 = C0201.m82(14015);
            }
            sb.append(str2);
            sb.append(this.countryCode);
            Logger.i(str, sb.toString());
        }
        checkCodeLenth();
    }

    private void getVendorCountryCode() {
        this.countrySource = C0201.m82(14018);
        String r0 = C0201.m82(14019);
        String r1 = C0201.m82(14020);
        String r2 = C0201.m82(14021);
        String r3 = C0201.m82(14022);
        this.countryCode = SystemPropUtils.getProperty(r0, r1, r2, r3);
        String str = TAG;
        Logger.i(str, C0201.m82(14023) + this.countryCode);
        if (!C0201.m82(14024).equalsIgnoreCase(this.countryCode)) {
            if (!C0201.m82(14025).equalsIgnoreCase(this.countryCode)) {
                checkCodeLenth();
                return;
            }
        }
        this.countryCode = r3;
        this.countrySource = r3;
    }

    private void init(Context context, boolean z) {
        if (context != null) {
            try {
                getVendorCountryCode();
                if (isCodeValidate()) {
                    Logger.i(TAG, C0201.m82(14026));
                    return;
                }
                getSimCountryCode(context);
                if (isCodeValidate()) {
                    Logger.i(TAG, C0201.m82(14027));
                    return;
                }
                getLocaleCountryCode();
                if (isCodeValidate()) {
                    Logger.i(TAG, C0201.m82(14028));
                }
            } catch (Exception unused) {
                Logger.w(TAG, C0201.m82(14029));
            }
        } else {
            throw new NullPointerException(C0201.m82(14030));
        }
    }

    private boolean isCodeValidate() {
        return !C0201.m82(14031).equals(this.countryCode);
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountrySource() {
        return this.countrySource;
    }
}
