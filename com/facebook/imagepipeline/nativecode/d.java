package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import com.facebook.soloader.SoLoader;
import vigqyno.C0201;

/* compiled from: NativeJpegTranscoderSoLoader */
public class d {
    private static boolean a;

    public static synchronized void a() {
        synchronized (d.class) {
            if (!a) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        SoLoader.j(C0201.m82(32688));
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                SoLoader.j(C0201.m82(32689));
                a = true;
            }
        }
    }
}
