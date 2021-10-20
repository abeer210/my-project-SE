package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;

public abstract class mcj {
    private Bitmap a;

    public abstract Bitmap a(Context context);

    public final Bitmap b(Context context) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = a(context);
                }
            }
        }
        return this.a;
    }
}
