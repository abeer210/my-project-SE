package com.bumptech.glide.load;

import java.io.IOException;
import vigqyno.C0201;

/* compiled from: HttpException */
public final class e extends IOException {
    public e(int i) {
        this(C0201.m82(23796) + i, i);
    }

    public e(String str) {
        this(str, -1);
    }

    public e(String str, int i) {
        this(str, i, null);
    }

    public e(String str, int i, Throwable th) {
        super(str, th);
    }
}
