package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class k {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
