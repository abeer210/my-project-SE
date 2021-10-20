package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class o0 {
    private static final Uri a;
    private static final Uri b;

    static {
        Uri parse = Uri.parse(C0201.m82(14099));
        a = parse;
        b = parse.buildUpon().appendPath(C0201.m82(14100)).appendPath(C0201.m82(14101)).build();
    }

    public static Intent a(String str, String str2) {
        Intent intent = new Intent(C0201.m82(14102));
        Uri.Builder appendQueryParameter = Uri.parse(C0201.m82(14103)).buildUpon().appendQueryParameter(C0201.m82(14104), str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter(C0201.m82(14105), str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage(C0201.m82(14106));
        intent.addFlags(524288);
        return intent;
    }

    public static Intent b(String str) {
        Uri fromParts = Uri.fromParts(C0201.m82(14107), str, null);
        Intent intent = new Intent(C0201.m82(14108));
        intent.setData(fromParts);
        return intent;
    }

    public static Intent c() {
        Intent intent = new Intent(C0201.m82(14109));
        intent.setPackage(C0201.m82(14110));
        return intent;
    }
}
