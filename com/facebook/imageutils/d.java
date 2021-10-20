package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* compiled from: StreamProcessor */
public class d {
    public static int a(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i2 = (read & 255) << (i4 * 8);
                } else {
                    i3 <<= 8;
                    i2 = read & 255;
                }
                i3 |= i2;
            } else {
                throw new IOException(C0201.m82(10384));
            }
        }
        return i3;
    }
}
