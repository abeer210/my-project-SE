package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import vigqyno.C0201;

public final class mck extends mcj {
    private String a;
    private Bitmap b;

    public mck(String str) {
        mco.a(C0201.m82(29758), C0201.m82(29757).concat(String.valueOf(str)));
        this.a = str;
    }

    @Override // com.huawei.hms.maps.mcj
    public final Bitmap a(Context context) {
        String str;
        String r0 = C0201.m82(29759);
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(context.getAssets().open(this.a));
            this.b = bitmap;
            return bitmap;
        } catch (IOException e) {
            str = C0201.m82(29761) + e.toString();
            mco.d(r0, str);
            return bitmap;
        } catch (OutOfMemoryError unused) {
            str = C0201.m82(29760);
            mco.d(r0, str);
            return bitmap;
        }
    }
}
