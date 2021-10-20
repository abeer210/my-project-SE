package com.google.android.play.core.assetpacks;

public final class t0 extends RuntimeException {
    public final int a;

    public t0(String str) {
        super(str);
        this.a = -1;
    }

    public t0(String str, int i) {
        super(str);
        this.a = i;
    }

    public t0(String str, Exception exc) {
        super(str, exc);
        this.a = -1;
    }

    public t0(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
