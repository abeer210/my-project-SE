package defpackage;

import android.content.Context;
import androidx.core.util.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: ce  reason: default package */
/* compiled from: NetworkCache */
public class ce {
    private final Context a;

    public ce(Context context) {
        this.a = context.getApplicationContext();
    }

    private static String b(String str, be beVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(7958));
        sb.append(str.replaceAll(C0201.m82(7959), C0201.m82(7960)));
        sb.append(z ? beVar.b() : beVar.a);
        return sb.toString();
    }

    private File c(String str) throws FileNotFoundException {
        File file = new File(d(), b(str, be.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(d(), b(str, be.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File d() {
        File file = new File(this.a.getCacheDir(), C0201.m82(7961));
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public d<be, InputStream> a(String str) {
        be beVar;
        try {
            File c = c(str);
            if (c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(c);
            if (c.getAbsolutePath().endsWith(C0201.m82(7962))) {
                beVar = be.ZIP;
            } else {
                beVar = be.JSON;
            }
            wf.a(C0201.m82(7963) + str + C0201.m82(7964) + c.getAbsolutePath());
            return new d<>(beVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public void e(String str, be beVar) {
        File file = new File(d(), b(str, beVar, true));
        File file2 = new File(file.getAbsolutePath().replace(C0201.m82(7965), C0201.m82(7966)));
        boolean renameTo = file.renameTo(file2);
        wf.a(C0201.m82(7967) + file2 + C0201.m82(7968));
        if (!renameTo) {
            wf.c(C0201.m82(7969) + file.getAbsolutePath() + C0201.m82(7970) + file2.getAbsolutePath() + C0201.m82(7971));
        }
    }

    /* JADX INFO: finally extract failed */
    public File f(String str, InputStream inputStream, be beVar) throws IOException {
        File file = new File(d(), b(str, beVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
