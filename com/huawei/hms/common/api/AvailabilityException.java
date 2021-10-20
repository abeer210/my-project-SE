package com.huawei.hms.common.api;

import com.huawei.hms.api.Api;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

public class AvailabilityException extends Exception {
    private String TAG = C0201.m82(27992);
    private String message = null;

    private ConnectionResult generateConnectionResult(int i) {
        String str = this.TAG;
        HMSLog.i(str, C0201.m82(27993) + i);
        setMessage(i);
        return new ConnectionResult(i);
    }

    private void setMessage(int i) {
        if (i == 0) {
            this.message = C0201.m82(27999);
        } else if (i == 1) {
            this.message = C0201.m82(27998);
        } else if (i == 2) {
            this.message = C0201.m82(27997);
        } else if (i == 3) {
            this.message = C0201.m82(27996);
        } else if (i != 21) {
            this.message = C0201.m82(27994);
        } else {
            this.message = C0201.m82(27995);
        }
    }

    public ConnectionResult getConnectionResult(HuaweiApiCallable huaweiApiCallable) {
        if (huaweiApiCallable == null || huaweiApiCallable.getHuaweiApi() == null) {
            HMSLog.e(this.TAG, C0201.m82(28001));
            return generateConnectionResult(8);
        }
        return generateConnectionResult(HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(huaweiApiCallable.getHuaweiApi().getContext(), 30000000));
    }

    public String getMessage() {
        return this.message;
    }

    public ConnectionResult getConnectionResult(HuaweiApi<? extends Api.ApiOptions> huaweiApi) {
        if (huaweiApi == null) {
            HMSLog.e(this.TAG, C0201.m82(28000));
            return generateConnectionResult(8);
        }
        return generateConnectionResult(HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(huaweiApi.getContext(), 30000000));
    }
}
