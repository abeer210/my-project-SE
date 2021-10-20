package com.huawei.hms.rn.map;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.v0;
import com.huawei.hms.rn.map.logger.HMSLogger;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class HMSInfoWindowView extends LinearLayout {
    private static final String REACT_CLASS = HMSInfoWindowView.class.getSimpleName();
    private static final String TAG = HMSInfoWindowView.class.getSimpleName();
    public int height;
    public int width;

    public static class Manager extends ViewGroupManager<HMSInfoWindowView> {
        private HMSLogger logger;

        public Manager(Context context) {
            this.logger = HMSLogger.getInstance(context);
        }

        @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
        public String getName() {
            return C0201.m82(33807);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public i createShadowNodeInstance() {
            return new SizeLayoutShadowNode();
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public HMSInfoWindowView createViewInstance(k0 k0Var) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(33806);
            hMSLogger.startMethodExecutionTimer(r1);
            HMSInfoWindowView hMSInfoWindowView = new HMSInfoWindowView(k0Var);
            this.logger.sendSingleEvent(r1);
            return hMSInfoWindowView;
        }

        public void updateExtraData(HMSInfoWindowView hMSInfoWindowView, Object obj) {
            Map map = (Map) obj;
            hMSInfoWindowView.width = ((Integer) map.get(C0201.m82(33808))).intValue();
            hMSInfoWindowView.height = ((Integer) map.get(C0201.m82(33809))).intValue();
        }
    }

    public static class SizeLayoutShadowNode extends i {
        @Override // com.facebook.react.uimanager.b0
        public void onCollectExtraUpdates(v0 v0Var) {
            super.onCollectExtraUpdates(v0Var);
            HashMap hashMap = new HashMap();
            hashMap.put(C0201.m82(24182), Integer.valueOf((int) getLayoutWidth()));
            hashMap.put(C0201.m82(24183), Integer.valueOf((int) getLayoutHeight()));
            v0Var.R(getReactTag(), hashMap);
        }
    }

    public HMSInfoWindowView(Context context) {
        super(context);
    }

    public void addView(View view) {
        super.addView(view);
    }
}
