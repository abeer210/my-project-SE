package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.memory.q;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import vigqyno.C0201;

@TargetApi(19)
/* compiled from: KitKatPurgeableDecoder */
public class d extends DalvikPurgeableDecoder {
    private final q c;

    public d(q qVar) {
        this.c = qVar;
    }

    private static void i(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap d(v60<q60> v60, BitmapFactory.Options options) {
        q60 w = v60.w();
        int size = w.size();
        v60<byte[]> a = this.c.a(size);
        try {
            byte[] w2 = a.w();
            w.f(0, w2, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(w2, 0, size, options);
            z50.h(decodeByteArray, C0201.m82(5294));
            return decodeByteArray;
        } finally {
            v60.s(a);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap e(v60<q60> v60, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.f(v60, i) ? null : DalvikPurgeableDecoder.b;
        q60 w = v60.w();
        z50.b(i <= w.size());
        int i2 = i + 2;
        v60<byte[]> a = this.c.a(i2);
        try {
            byte[] w2 = a.w();
            w.f(0, w2, 0, i);
            if (bArr != null) {
                i(w2, i);
                i = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(w2, 0, i, options);
            z50.h(decodeByteArray, C0201.m82(5295));
            return decodeByteArray;
        } finally {
            v60.s(a);
        }
    }
}
