package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class m2 implements FilenameFilter {
    public static final FilenameFilter a = new m2();

    private m2() {
    }

    public final boolean accept(File file, String str) {
        return n2.a.matcher(str).matches();
    }
}
