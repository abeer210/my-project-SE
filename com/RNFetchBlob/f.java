package com.RNFetchBlob;

/* compiled from: RNFetchBlobProgressConfig */
public class f {
    private long a = 0;
    private int b = 0;
    private int c = -1;
    private int d = -1;
    private boolean e = false;

    /* compiled from: RNFetchBlobProgressConfig */
    enum a {
        Upload,
        Download
    }

    public f(boolean z, int i, int i2, a aVar) {
        a aVar2 = a.Download;
        this.e = z;
        this.d = i;
        this.c = i2;
    }

    public boolean a(float f) {
        int i = this.c;
        boolean z = false;
        boolean z2 = i <= 0 || f <= 0.0f || Math.floor((double) (f * ((float) i))) > ((double) this.b);
        if (System.currentTimeMillis() - this.a > ((long) this.d) && this.e && z2) {
            z = true;
        }
        if (z) {
            this.b++;
            this.a = System.currentTimeMillis();
        }
        return z;
    }
}
