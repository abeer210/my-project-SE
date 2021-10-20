package com.huawei.hms.update.provider;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.io.IOException;
import vigqyno.C0201;

/* compiled from: ContentUriHelper */
public class a {
    private Context a;
    private String b;

    private static String a(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    private static File b(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalFile();
        } catch (IOException unused) {
            return null;
        }
    }

    private String c(String str) {
        int indexOf;
        String a2;
        String a3 = a();
        if (a3 == null || (indexOf = str.indexOf(47, 1)) < 0) {
            return null;
        }
        if (C0201.m82(34481).equals(Uri.decode(str.substring(1, indexOf))) && (a2 = a(new File(a3, Uri.decode(str.substring(indexOf + 1))))) != null && a2.startsWith(a3)) {
            return a2;
        }
        return null;
    }

    private String b(String str) {
        int i;
        String a2 = a();
        if (a2 == null || !str.startsWith(a2)) {
            return null;
        }
        if (a2.endsWith(C0201.m82(34479))) {
            i = a2.length();
        } else {
            i = a2.length() + 1;
        }
        return Uri.encode(C0201.m82(34480)) + '/' + str.substring(i);
    }

    public void a(Context context) {
        if (this.a == null) {
            Checker.checkNonNull(context, C0201.m82(34483));
            this.a = context;
        }
    }

    public File a(String str) {
        String a2 = a();
        if (a2 == null) {
            return null;
        }
        return b(new File(a2, str));
    }

    private String a() {
        String str;
        Context context = (Context) Checker.assertNonNull(this.a, C0201.m82(34478));
        synchronized (this) {
            if (this.b == null) {
                if (context.getExternalCacheDir() != null) {
                    this.b = a(context.getExternalCacheDir());
                } else {
                    this.b = a(context.getFilesDir());
                }
            }
            str = this.b;
        }
        return str;
    }

    public Uri a(File file, String str) {
        String b2;
        String a2 = a(file);
        if (a2 == null || (b2 = b(a2)) == null) {
            return null;
        }
        return new Uri.Builder().scheme(C0201.m82(34482)).authority(str).encodedPath(b2).build();
    }

    public File a(Uri uri) {
        String c;
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null || (c = c(encodedPath)) == null) {
            return null;
        }
        return b(new File(c));
    }
}
