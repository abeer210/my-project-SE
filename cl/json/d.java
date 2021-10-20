package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import vigqyno.C0201;

/* compiled from: ShareFile */
public class d {
    private final ReactApplicationContext a;
    private String b;
    private Uri c;
    private String d;
    private String e;

    public d(String str, String str2, String str3, ReactApplicationContext reactApplicationContext) {
        this(str, str3, reactApplicationContext);
        this.d = str2;
        this.e = str3;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return b.d(this.a, uri);
    }

    private boolean e() {
        if (this.c.getScheme() == null || !this.c.getScheme().equals(C0201.m82(13684))) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = this.c.toString().substring(5).toCharArray();
        for (char c2 : charArray) {
            if (c2 == ';') {
                break;
            }
            sb.append(c2);
        }
        this.d = sb.toString();
        return true;
    }

    private boolean g() {
        if (this.c.getScheme() == null || (!this.c.getScheme().equals(C0201.m82(13685)) && !this.c.getScheme().equals(C0201.m82(13686)))) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        String a2 = a(this.c.toString());
        this.d = a2;
        if (a2 == null) {
            String b2 = b(this.c);
            if (b2 == null) {
                return false;
            }
            this.d = a(b2);
        }
        if (this.d == null) {
            this.d = C0201.m82(13687);
        }
        return true;
    }

    public String c() {
        String str = this.d;
        return str == null ? C0201.m82(13688) : str;
    }

    public Uri d() {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(c());
        if (e()) {
            String substring = this.c.toString().substring(this.d.length() + 5 + 8);
            String str = this.e;
            if (str == null) {
                str = System.nanoTime() + C0201.m82(13689);
            }
            try {
                File file = new File(this.a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists()) {
                    if (!file.mkdirs()) {
                        throw new IOException(C0201.m82(13690) + file.getAbsolutePath());
                    }
                }
                File file2 = new File(file, str + C0201.m82(13691) + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(substring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return b.a(this.a, file2);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } else {
            if (g()) {
                Uri parse = Uri.parse(this.b);
                if (parse.getPath() == null) {
                    return null;
                }
                return b.a(this.a, new File(parse.getPath()));
            }
            return null;
        }
    }

    public boolean f() {
        return e() || g();
    }

    public d(String str, String str2, ReactApplicationContext reactApplicationContext) {
        this.b = str;
        this.c = Uri.parse(str);
        this.a = reactApplicationContext;
        this.e = str2;
    }
}
