package com.google.android.gms.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public abstract class d0 implements c0 {
    private final int b;
    private final int c;

    public d0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public abstract URL a(int i, int i2, int i3);

    @Override // com.google.android.gms.maps.model.c0
    public final z getTile(int i, int i2, int i3) {
        URL a = a(i, i2, i3);
        if (a == null) {
            return c0.a;
        }
        try {
            int i4 = this.b;
            int i5 = this.c;
            InputStream openStream = a.openStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openStream.read(bArr);
                if (read == -1) {
                    return new z(i4, i5, byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
