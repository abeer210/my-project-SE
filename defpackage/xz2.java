package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import vigqyno.C0201;

/* renamed from: xz2  reason: default package */
/* compiled from: RNFileUtils */
public class xz2 {
    public static File a(File file) throws IOException {
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        throw new IOException(C0201.m82(12094) + file + C0201.m82(12095));
    }

    public static String b(File file, String str) throws IOException {
        a(file);
        String uuid = UUID.randomUUID().toString();
        return file + File.separator + uuid + str;
    }

    public static Uri c(File file) {
        return Uri.fromFile(file);
    }
}
