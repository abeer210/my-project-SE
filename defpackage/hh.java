package defpackage;

import java.io.File;

/* renamed from: hh  reason: default package */
/* compiled from: FileService */
public class hh {
    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
