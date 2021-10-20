package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class mcs extends mcj {
    private int a;
    private Bitmap b;

    public mcs(int i) {
        this.a = i;
    }

    @Override // com.huawei.hms.maps.mcj
    public final Bitmap a(Context context) {
        Bitmap bitmap;
        Drawable drawable = context.getResources().getDrawable(this.a);
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = mcm.a.b(context);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        this.b = bitmap;
        return bitmap;
    }
}
