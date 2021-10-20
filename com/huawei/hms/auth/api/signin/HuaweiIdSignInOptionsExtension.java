package com.huawei.hms.auth.api.signin;

import android.os.Bundle;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;
import vigqyno.C0201;

public interface HuaweiIdSignInOptionsExtension {
    public static final int FITNESS = 0;
    public static final int GAMES = 0;

    static {
        C0201.m83(HuaweiIdSignInOptionsExtension.class, 122);
    }

    int getExtensionType();

    List<Scope> getImpliedScopes();

    Bundle toBundle();
}
