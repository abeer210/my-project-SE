package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileInputStream;
import java.io.IOException;
import vigqyno.C0201;

public final class mcn extends mcj {
    private String a;
    private Bitmap b;

    public mcn(String str) {
        this.a = str;
    }

    @Override // com.huawei.hms.maps.mcj
    public final Bitmap a(Context context) {
        StringBuilder sb;
        String r0 = C0201.m82(30926);
        String r1 = C0201.m82(30927);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = context.openFileInput(this.a);
            this.b = BitmapFactory.decodeStream(fileInputStream);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e = e;
                    sb = new StringBuilder(r0);
                }
            }
        } catch (IOException e2) {
            mco.d(r1, C0201.m82(30929) + e2.toString());
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder(r0);
                }
            }
        } catch (OutOfMemoryError unused) {
            mco.d(r1, C0201.m82(30928));
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    e = e4;
                    sb = new StringBuilder(r0);
                }
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    mco.a(r1, r0 + e5.toString());
                }
            }
            throw th;
        }
        return this.b;
        sb.append(e.toString());
        mco.a(r1, sb.toString());
        return this.b;
    }
}
