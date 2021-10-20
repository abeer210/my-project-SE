package com.huawei.hms.ui;

import android.content.Context;
import com.huawei.hms.utils.ResourceLoaderUtil;
import vigqyno.C0201;

public abstract class AbstractPromptDialog extends AbstractDialog {
    @Override // com.huawei.hms.ui.AbstractDialog
    public String onGetNegativeButtonString(Context context) {
        return null;
    }

    @Override // com.huawei.hms.ui.AbstractDialog
    public String onGetTitleString(Context context) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context);
        }
        return ResourceLoaderUtil.getString(C0201.m82(27087));
    }
}
