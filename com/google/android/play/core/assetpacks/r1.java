package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;
import vigqyno.C0201;

public final /* synthetic */ class r1 implements FilenameFilter {
    private final String a;

    public r1(String str) {
        this.a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.a).concat(C0201.m82(32824))) && str.endsWith(C0201.m82(32825));
    }
}
