package com.huawei.hms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import vigqyno.C0201;

public final class AccountPicker {
    public static final String CHOOSE_ACCOUNT = null;
    public static final int CUSTOM_THEME_ACCOUNT_CHIPS = 0;
    public static final int CUSTOM_THEME_GAMES = 0;
    public static final int CUSTOM_THEME_NONE = 0;
    public static final String EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING = null;
    public static final String EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE = null;
    public static final String EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY = null;
    public static final String EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST = null;
    public static final String EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY = null;
    public static final String EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT = null;
    public static final String EXTRA_DESCRIPTION_TEXT_OVERRIDE = null;
    public static final String EXTRA_HOSTED_DOMAIN_FILTER = null;
    public static final String EXTRA_IS_ACCOUNT_CHIPS_ACCOUNT_PICKER = null;
    public static final String EXTRA_OVERRIDE_CUSTOM_THEME = null;
    public static final String EXTRA_OVERRIDE_THEME = null;
    public static final String EXTRA_REAL_CLIENT_PACKAGE = null;
    public static final String EXTRA_SELECTED_ACCOUNT = null;
    public static final String EXTRA_SET_HMS_CORE_ACCOUNT = null;
    private static final String HMS_PACKAGE = null;
    public static final int THEME_DEFAULT = 0;
    public static final int THEME_LIGHT = 0;

    static {
        C0201.m83(AccountPicker.class, 138);
    }

    private AccountPicker() {
    }

    public static Intent newChooseAccountIntent(Account account, ArrayList<Account> arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle) {
        Intent intent = new Intent();
        intent.setAction(C0201.m82(24708));
        intent.setPackage(C0201.m82(24709));
        intent.putExtra(C0201.m82(24710), arrayList);
        intent.putExtra(C0201.m82(24711), strArr);
        intent.putExtra(C0201.m82(24712), bundle);
        intent.putExtra(C0201.m82(24713), account);
        intent.putExtra(C0201.m82(24714), z);
        intent.putExtra(C0201.m82(24715), str);
        intent.putExtra(C0201.m82(24716), str2);
        intent.putExtra(C0201.m82(24717), strArr2);
        intent.putExtra(C0201.m82(24718), false);
        intent.putExtra(C0201.m82(24719), 0);
        intent.putExtra(C0201.m82(24720), 0);
        return intent;
    }
}
