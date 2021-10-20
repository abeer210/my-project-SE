package com.facebook.imagepipeline.memory;

/* compiled from: BitmapCounterProvider */
public class c {
    public static final int a = b();
    private static int b = 384;
    private static volatile b c;

    public static b a() {
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new b(b, a);
                }
            }
        }
        return c;
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
