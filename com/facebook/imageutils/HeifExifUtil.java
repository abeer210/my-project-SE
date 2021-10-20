package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import com.facebook.soloader.d;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

public class HeifExifUtil {

    /* access modifiers changed from: private */
    @d
    public static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        public static int a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt(C0201.m82(34918), 1);
            } catch (IOException e) {
                f60.d(C0201.m82(34919), C0201.m82(34920), e);
                return 0;
            }
        }
    }

    public static int a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.a(inputStream);
        }
        f60.b(C0201.m82(25953), C0201.m82(25954));
        return 0;
    }
}
