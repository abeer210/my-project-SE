package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

/* compiled from: ShareFiles */
public class e {
    private final ReactApplicationContext a;
    private ArrayList<Uri> b;
    private ArrayList<String> c;
    private String d;

    public e(ReadableArray readableArray, ArrayList<String> arrayList, String str, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, reactApplicationContext);
        this.d = str;
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

    private boolean e(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(C0201.m82(13593))) {
            return false;
        }
        String substring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(C0201.m82(13594)));
        String str = this.d;
        if (str == null) {
            this.d = substring;
            return true;
        }
        if (!str.equalsIgnoreCase(substring)) {
            String str2 = this.d;
            String r2 = C0201.m82(13595);
            if (str2.split(r2)[0].equalsIgnoreCase(substring.split(r2)[0])) {
                this.d = this.d.split(r2)[0].concat(C0201.m82(13596));
                return true;
            }
        }
        if (this.d.equalsIgnoreCase(substring)) {
            return true;
        }
        this.d = C0201.m82(13597);
        return true;
    }

    private boolean g(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(C0201.m82(13598))) {
            if (!C0201.m82(13599).equals(uri.getScheme())) {
                return false;
            }
        }
        String a2 = a(uri.toString());
        if (a2 == null) {
            a2 = a(b(uri));
        }
        String r6 = C0201.m82(13600);
        if (a2 == null) {
            a2 = r6;
        }
        String str = this.d;
        if (str == null) {
            this.d = a2;
            return true;
        }
        if (!str.equalsIgnoreCase(a2)) {
            String str2 = this.d;
            String r3 = C0201.m82(13601);
            if (str2.split(r3)[0].equalsIgnoreCase(a2.split(r3)[0])) {
                this.d = this.d.split(r3)[0].concat(C0201.m82(13602));
                return true;
            }
        }
        if (this.d.equalsIgnoreCase(a2)) {
            return true;
        }
        this.d = r6;
        return true;
    }

    public String c() {
        String str = this.d;
        return str == null ? C0201.m82(13603) : str;
    }

    public ArrayList<Uri> d() {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i = 0; i < this.b.size(); i++) {
            Uri uri = this.b.get(i);
            if (e(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(C0201.m82(13604))));
                String substring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(C0201.m82(13605)) + 8);
                String str = this.c.size() >= i + 1 ? this.c.get(i) : System.currentTimeMillis() + C0201.m82(13606) + extensionFromMimeType;
                try {
                    File file = new File(this.a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists()) {
                        if (!file.mkdirs()) {
                            throw new IOException(C0201.m82(13607) + file.getAbsolutePath());
                        }
                    }
                    File file2 = new File(file, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(Base64.decode(substring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(b.a(this.a, file2));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (g(uri) && uri.getPath() != null) {
                if (this.c.size() >= i + 1) {
                    arrayList.add(b.a(this.a, new File(uri.getPath(), this.c.get(i))));
                } else {
                    arrayList.add(b.a(this.a, new File(uri.getPath())));
                }
            }
        }
        return arrayList;
    }

    public boolean f() {
        Iterator<Uri> it = this.b.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Uri next = it.next();
            if (e(next) || g(next)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                break;
            }
        }
        return z;
    }

    public e(ReadableArray readableArray, ArrayList<String> arrayList, ReactApplicationContext reactApplicationContext) {
        this.b = new ArrayList<>();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                this.b.add(Uri.parse(string));
            }
        }
        this.c = arrayList;
        this.a = reactApplicationContext;
    }
}
