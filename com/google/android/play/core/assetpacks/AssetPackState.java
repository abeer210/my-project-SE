package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import vigqyno.C0201;

public abstract class AssetPackState {
    public static AssetPackState a(Bundle bundle, String str, x0 x0Var, y yVar) {
        return b(str, yVar.a(bundle.getInt(jz1.a(C0201.m82(31067), str)), str), bundle.getInt(jz1.a(C0201.m82(31068), str)), bundle.getLong(jz1.a(C0201.m82(31069), str)), bundle.getLong(jz1.a(C0201.m82(31070), str)), x0Var.c(str));
    }

    public static AssetPackState b(String str, int i, int i2, long j, long j2, double d) {
        return new g0(str, i, i2, j, j2, (int) Math.rint(100.0d * d));
    }

    public abstract long c();

    public abstract int d();

    public abstract String e();

    public abstract int f();

    public abstract long g();

    public abstract int h();
}
