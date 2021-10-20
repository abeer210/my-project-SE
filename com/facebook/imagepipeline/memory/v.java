package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;

/* compiled from: MemoryChunkPool */
public abstract class v extends a<u> {
    private final int[] j;

    public v(m60 m60, g0 g0Var, h0 h0Var) {
        super(m60, g0Var, h0Var);
        SparseIntArray sparseIntArray = g0Var.c;
        this.j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                n();
                return;
            }
        }
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
    public abstract u b(int i);

    /* renamed from: w */
    public void f(u uVar) {
        z50.g(uVar);
        uVar.close();
    }

    /* renamed from: x */
    public int j(u uVar) {
        z50.g(uVar);
        return uVar.a();
    }

    public int y() {
        return this.j[0];
    }

    /* renamed from: z */
    public boolean p(u uVar) {
        z50.g(uVar);
        return !uVar.isClosed();
    }
}
