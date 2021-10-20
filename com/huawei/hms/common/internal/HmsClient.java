package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import vigqyno.C0201;

public abstract class HmsClient extends BaseHmsClient implements AnyClient {
    private static final String TAG = null;

    static {
        C0201.m83(HmsClient.class, 615);
    }

    public HmsClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        super(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }

    @Override // com.huawei.hms.common.internal.AnyClient
    public void post(IMessageEntity iMessageEntity, String str, AnyClient.CallBack callBack) {
        String r0 = C0201.m82(13822);
        if (callBack == null) {
            HMSLog.e(r0, C0201.m82(13823));
        } else if (!(iMessageEntity instanceof RequestHeader) || str == null) {
            HMSLog.e(r0, C0201.m82(13827));
            callBack.onCallback(new ResponseHeader(1, 907135000, C0201.m82(13828)), new JSONObject().toString());
        } else if (!isConnected()) {
            HMSLog.e(r0, C0201.m82(13824));
            callBack.onCallback(new ResponseHeader(1, 907135001, C0201.m82(13825)), new JSONObject().toString());
        } else {
            RequestHeader requestHeader = (RequestHeader) iMessageEntity;
            HMSLog.i(r0, C0201.m82(13826) + requestHeader);
            Activity cpActivity = getClientSettings().getCpActivity();
            (cpActivity == null ? new BaseAdapter(this) : new BaseAdapter(this, cpActivity)).baseRequest(requestHeader.toJson(), str, requestHeader.getParcelable(), new BaseAdapterCallBack(this, callBack));
        }
    }

    public void updateSessionId(String str) {
        if (TextUtils.isEmpty(this.sessionId)) {
            this.sessionId = str;
        }
    }

    private static class BaseAdapterCallBack implements BaseAdapter.BaseCallBack {
        private final AnyClient.CallBack callback;
        private final WeakReference<HmsClient> hmsClient;

        public BaseAdapterCallBack(HmsClient hmsClient2, AnyClient.CallBack callBack) {
            this.callback = callBack;
            this.hmsClient = new WeakReference<>(hmsClient2);
        }

        private void doCallback(String str, String str2) {
            ResponseHeader responseHeader = new ResponseHeader();
            if (responseHeader.fromJson(str)) {
                HMSLog.i(C0201.m82(30672), C0201.m82(30671) + responseHeader);
                updateSessionId(responseHeader.getSessionId());
                this.callback.onCallback(responseHeader, str2);
                return;
            }
            this.callback.onCallback(new ResponseHeader(1, 907135000, C0201.m82(30673)), new JSONObject().toString());
        }

        private void updateSessionId(String str) {
            HmsClient hmsClient2 = this.hmsClient.get();
            if (hmsClient2 != null) {
                hmsClient2.updateSessionId(str);
            }
        }

        @Override // com.huawei.hms.adapter.BaseAdapter.BaseCallBack
        public void onComplete(String str, String str2, Parcelable parcelable) {
            if (parcelable == null) {
                doCallback(str, str2);
            } else {
                doCallback(str, str2, parcelable);
            }
        }

        @Override // com.huawei.hms.adapter.BaseAdapter.BaseCallBack
        public void onError(String str) {
            ResponseHeader responseHeader = new ResponseHeader();
            if (responseHeader.fromJson(str)) {
                HMSLog.i(C0201.m82(30678), C0201.m82(30677) + responseHeader);
                updateSessionId(responseHeader.getSessionId());
                this.callback.onCallback(responseHeader, new JSONObject().toString());
                return;
            }
            this.callback.onCallback(new ResponseHeader(1, 907135000, C0201.m82(30679)), new JSONObject().toString());
        }

        private void doCallback(String str, String str2, Parcelable parcelable) {
            ResponseHeader responseHeader = new ResponseHeader();
            if (responseHeader.fromJson(str)) {
                responseHeader.setParcelable(parcelable);
                HMSLog.i(C0201.m82(30675), C0201.m82(30674) + responseHeader);
                updateSessionId(responseHeader.getSessionId());
                this.callback.onCallback(responseHeader, str2);
                return;
            }
            this.callback.onCallback(new ResponseHeader(1, 907135000, C0201.m82(30676)), new JSONObject().toString());
        }
    }
}
