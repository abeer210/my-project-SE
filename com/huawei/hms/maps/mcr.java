package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import vigqyno.C0201;

public final class mcr extends mcj {
    private String a;
    private Bitmap b;

    public mcr(String str) {
        this.a = str;
    }

    private static Bitmap a(String str) {
        String r0 = C0201.m82(30680);
        mco.a(r0, C0201.m82(30681));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = 5;
        try {
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            mco.d(r0, C0201.m82(30682));
            return null;
        }
    }

    @Override // com.huawei.hms.maps.mcj
    public final Bitmap a(Context context) {
        Bitmap a2 = a(this.a);
        this.b = a2;
        return a2;
    }
}
