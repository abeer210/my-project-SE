package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;
import vigqyno.C0201;

public class AutoLifecycleFragment extends Fragment {
    private static final String TAG = null;
    private final SparseArray<ClientInfo> mAutoClientInfoMap = new SparseArray<>();
    private boolean mStarted;

    /* access modifiers changed from: private */
    public class ClientInfo {
        public final HuaweiApiClient apiClient;
        public final int clientId;

        public ClientInfo(int i, HuaweiApiClient huaweiApiClient) {
            this.apiClient = huaweiApiClient;
            this.clientId = i;
        }

        public void stopAutoManage() {
            this.apiClient.disconnect();
        }
    }

    static {
        C0201.m83(AutoLifecycleFragment.class, 528);
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        String r0 = C0201.m82(24285);
        Preconditions.checkMainThread(C0201.m82(24286));
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag(r0);
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, r0).commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e) {
            throw new IllegalStateException(C0201.m82(24287), e);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
        this.mStarted = true;
        for (int i = 0; i < this.mAutoClientInfoMap.size(); i++) {
            this.mAutoClientInfoMap.valueAt(i).apiClient.connect((Activity) null);
        }
    }

    public void onStop() {
        super.onStop();
        this.mStarted = false;
        for (int i = 0; i < this.mAutoClientInfoMap.size(); i++) {
            this.mAutoClientInfoMap.valueAt(i).apiClient.disconnect();
        }
    }

    public void startAutoMange(int i, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, C0201.m82(24288));
        boolean z = this.mAutoClientInfoMap.indexOfKey(i) < 0;
        Preconditions.checkState(z, C0201.m82(24289) + i);
        this.mAutoClientInfoMap.put(i, new ClientInfo(i, huaweiApiClient));
        if (this.mStarted) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i) {
        ClientInfo clientInfo = this.mAutoClientInfoMap.get(i);
        this.mAutoClientInfoMap.remove(i);
        if (clientInfo != null) {
            clientInfo.stopAutoManage();
        }
    }
}
