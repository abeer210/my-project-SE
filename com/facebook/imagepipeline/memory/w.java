package com.facebook.imagepipeline.memory;

/* compiled from: MemoryChunkUtil */
public class w {
    public static int a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    public static void b(int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        z50.b(i4 >= 0);
        z50.b(i >= 0);
        z50.b(i3 >= 0);
        z50.b(i + i4 <= i5);
        if (i3 + i4 > i2) {
            z = false;
        }
        z50.b(z);
    }
}
