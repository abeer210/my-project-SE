package defpackage;

import java.io.File;

/* renamed from: o50  reason: default package */
/* compiled from: FileTree */
public class o50 {
    public static boolean a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= b(file2);
            }
        }
        return z;
    }

    public static boolean b(File file) {
        if (file.isDirectory()) {
            a(file);
        }
        return file.delete();
    }

    public static void c(File file, p50 p50) {
        p50.b(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    c(file2, p50);
                } else {
                    p50.a(file2);
                }
            }
        }
        p50.c(file);
    }
}
