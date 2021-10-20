package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import vigqyno.C0201;

public final class n2 {
    private static final Pattern a = Pattern.compile(C0201.m82(3540));

    public static List<File> a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(m2.a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            int length = listFiles.length;
            File[] fileArr2 = new File[length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split(C0201.m82(3541))[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new t0(C0201.m82(3542));
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains(C0201.m82(3543))) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    r2 c = new k0(fileInputStream).c();
                    if (c.d() != null) {
                        File file5 = new File(file, c.d());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new t0(String.format(C0201.m82(3544), file5.getCanonicalPath()));
                        }
                    } else {
                        throw new t0(C0201.m82(3545));
                    }
                } catch (Throwable th) {
                    ez1.a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
