package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.core.util.f;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imageutils.a;

@TargetApi(26)
/* compiled from: OreoDecoder */
public class e extends b {
    public e(d dVar, int i, f fVar) {
        super(dVar, i, fVar);
    }

    private static boolean g(BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) ? false : true;
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int e(int i, int i2, BitmapFactory.Options options) {
        if (g(options)) {
            return i * i2 * 8;
        }
        return a.d(i, i2, options.inPreferredConfig);
    }
}
