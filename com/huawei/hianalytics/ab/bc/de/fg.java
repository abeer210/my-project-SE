package com.huawei.hianalytics.ab.bc.de;

import android.text.TextUtils;
import com.huawei.hianalytics.ab.ab.bc;
import com.huawei.hianalytics.ab.bc.kl.de;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

public class fg {
    private static fg bc = new fg();
    private ab ab = new ab();

    /* access modifiers changed from: package-private */
    public class ab {
        public String ab;
        public String bc;
        public String cd;
        public long de = 0;

        public ab() {
        }

        public void ab(long j) {
            fg.this.ab.de = j;
        }

        public void ab(String str) {
            fg.this.ab.cd = str;
        }

        public void bc(String str) {
            fg.this.ab.ab = str;
        }

        public void cd(String str) {
            fg.this.ab.bc = str;
        }
    }

    public static fg ef() {
        return bc;
    }

    private String fg() {
        Throwable th;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = bc.fg().getResources().getAssets().open(C0201.m82(26679));
            try {
                String ab2 = de.ab(inputStream);
                de.ab((Closeable) inputStream);
                return ab2;
            } catch (IOException unused) {
                try {
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(26680), C0201.m82(26681));
                    de.ab((Closeable) inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    de.ab((Closeable) inputStream2);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            inputStream = null;
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(26680), C0201.m82(26681));
            de.ab((Closeable) inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            de.ab((Closeable) inputStream2);
            throw th;
        }
    }

    public String ab() {
        return this.ab.cd;
    }

    public long bc() {
        return this.ab.de;
    }

    public String cd() {
        return this.ab.bc;
    }

    public void de() {
        long bc2 = bc();
        if (bc2 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String fg = fg();
            if (TextUtils.isEmpty(fg)) {
                com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(26682), C0201.m82(26683));
                return;
            }
            String e = zb2.e(16);
            String ab2 = com.huawei.hianalytics.ab.bc.ab.bc.ab(fg, e);
            this.ab.bc(fg);
            this.ab.ab(currentTimeMillis);
            this.ab.cd(e);
            this.ab.ab(ab2);
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis2 - bc2 > 43200000) {
            String str = this.ab.ab;
            String e2 = zb2.e(16);
            String ab3 = com.huawei.hianalytics.ab.bc.ab.bc.ab(str, e2);
            this.ab.ab(currentTimeMillis2);
            this.ab.cd(e2);
            this.ab.ab(ab3);
        }
    }
}
