package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;

/* compiled from: GenericByteArrayPool */
public class r extends a<byte[]> implements k60 {
    private final int[] j;

    public r(m60 m60, g0 g0Var, h0 h0Var) {
        super(m60, g0Var, h0Var);
        SparseIntArray sparseIntArray = g0Var.c;
        this.j = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.j[i] = sparseIntArray.keyAt(i);
        }
        n();
    }

    @Override // com.facebook.imagepipeline.memory.a
    public int i(int i) {
        if (i > 0) {
            int[] iArr = this.j;
            for (int i2 : iArr) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new a.b(Integer.valueOf(i));
    }

    @Override // com.facebook.imagepipeline.memory.a
    public int k(int i) {
        return i;
    }

    /* renamed from: v */
    public byte[] b(int i) {
        return new byte[i];
    }

    /* renamed from: w */
    public void f(byte[] bArr) {
        z50.g(bArr);
    }

    /* renamed from: x */
    public int j(byte[] bArr) {
        z50.g(bArr);
        return bArr.length;
    }
}
