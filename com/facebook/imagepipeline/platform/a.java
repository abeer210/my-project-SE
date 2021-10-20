package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import androidx.core.util.f;
import com.facebook.imagepipeline.memory.d;

@TargetApi(21)
/* compiled from: ArtDecoder */
public class a extends b {
    public a(d dVar, int i, f fVar) {
        super(dVar, i, fVar);
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int e(int i, int i2, BitmapFactory.Options options) {
        return com.facebook.imageutils.a.d(i, i2, options.inPreferredConfig);
    }
}
