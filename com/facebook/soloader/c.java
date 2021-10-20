package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import vigqyno.C0201;

/* compiled from: DirectorySoSource */
public class c extends l {
    public final File a;
    public final int b;

    public c(File file, int i) {
        this.a = file;
        this.b = i;
    }

    private static String[] d(File file) throws IOException {
        if (SoLoader.a) {
            Api18TraceUtils.a(C0201.m82(19796), file.getName(), C0201.m82(19797));
        }
        try {
            return i.a(file);
        } finally {
            if (SoLoader.a) {
                Api18TraceUtils.b();
            }
        }
    }

    private void e(File file, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] d = d(file);
        Log.d(C0201.m82(19799), C0201.m82(19798) + Arrays.toString(d));
        for (String str : d) {
            if (!str.startsWith(C0201.m82(19800))) {
                SoLoader.l(str, (i | 1) & -3, threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.l
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return f(str, i, this.a, threadPolicy);
    }

    @Override // com.facebook.soloader.l
    public File c(String str) throws IOException {
        File file = new File(this.a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public int f(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        boolean exists = file2.exists();
        String r2 = C0201.m82(19801);
        if (!exists) {
            Log.d(r2, str + C0201.m82(19802) + file.getCanonicalPath());
            return 0;
        }
        Log.d(r2, str + C0201.m82(19803) + file.getCanonicalPath());
        if ((i & 1) == 0 || (this.b & 2) == 0) {
            if ((this.b & 1) != 0) {
                e(file2, i, threadPolicy);
            } else {
                Log.d(r2, C0201.m82(19805) + str);
            }
            try {
                SoLoader.b.a(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains(C0201.m82(19806))) {
                    Log.d(r2, C0201.m82(19807));
                    return 3;
                }
                throw e;
            }
        } else {
            Log.d(r2, str + C0201.m82(19804));
            return 2;
        }
    }

    @Override // com.facebook.soloader.l
    public String toString() {
        String str;
        try {
            str = String.valueOf(this.a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.a.getName();
        }
        return getClass().getName() + C0201.m82(19808) + str + C0201.m82(19809) + this.b + ']';
    }
}
