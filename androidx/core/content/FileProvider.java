package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

public class FileProvider extends ContentProvider {
    private static final String[] b = {C0201.m82(20667), C0201.m82(20668)};
    private static final File c = new File(C0201.m82(20669));
    private static HashMap<String, a> d = new HashMap<>();
    private a a;

    /* access modifiers changed from: package-private */
    public interface a {
        File a(Uri uri);

        Uri b(File file);
    }

    /* access modifiers changed from: package-private */
    public static class b implements a {
        private final String a;
        private final HashMap<String, File> b = new HashMap<>();

        public b(String str) {
            this.a = str;
        }

        @Override // androidx.core.content.FileProvider.a
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException(C0201.m82(32759));
                } catch (IOException unused) {
                    throw new IllegalArgumentException(C0201.m82(32760) + file2);
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(32761) + uri);
            }
        }

        @Override // androidx.core.content.FileProvider.a
        public Uri b(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    String r2 = C0201.m82(32762);
                    if (path2.endsWith(r2)) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme(C0201.m82(32763)).authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(str, r2)).build();
                }
                throw new IllegalArgumentException(C0201.m82(32764) + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException(C0201.m82(32765) + file);
            }
        }

        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.b.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    throw new IllegalArgumentException(C0201.m82(32766) + file, e);
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(32767));
            }
        }
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static a d(Context context, String str) {
        a aVar;
        synchronized (d) {
            aVar = d.get(str);
            if (aVar == null) {
                try {
                    aVar = g(context, str);
                    d.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException(C0201.m82(20671), e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException(C0201.m82(20670), e2);
                }
            }
        }
        return aVar;
    }

    public static Uri e(Context context, String str, File file) {
        return d(context, str).b(file);
    }

    private static int f(String str) {
        if (C0201.m82(20672).equals(str)) {
            return 268435456;
        }
        if (C0201.m82(20673).equals(str) || C0201.m82(20674).equals(str)) {
            return 738197504;
        }
        if (C0201.m82(20675).equals(str)) {
            return 704643072;
        }
        if (C0201.m82(20676).equals(str)) {
            return 939524096;
        }
        if (C0201.m82(20677).equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(C0201.m82(20678) + str);
    }

    private static a g(Context context, String str) throws IOException, XmlPullParserException {
        b bVar = new b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), C0201.m82(20679));
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return bVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, C0201.m82(20680));
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, C0201.m82(20681));
                        if (C0201.m82(20682).equals(name)) {
                            file = c;
                        } else if (C0201.m82(20683).equals(name)) {
                            file = context.getFilesDir();
                        } else if (C0201.m82(20684).equals(name)) {
                            file = context.getCacheDir();
                        } else if (C0201.m82(20685).equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if (C0201.m82(20686).equals(name)) {
                            File[] h = b.h(context, null);
                            if (h.length > 0) {
                                file = h[0];
                            }
                        } else if (C0201.m82(20687).equals(name)) {
                            File[] g = b.g(context);
                            if (g.length > 0) {
                                file = g[0];
                            }
                        } else if (Build.VERSION.SDK_INT >= 21 && C0201.m82(20688).equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file != null) {
                            bVar.c(attributeValue, a(file, attributeValue2));
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(20689));
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(20690) + str);
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException(C0201.m82(20692));
        } else if (providerInfo.grantUriPermissions) {
            this.a = d(context, providerInfo.authority);
        } else {
            throw new SecurityException(C0201.m82(20691));
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.a.a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File a2 = this.a.a(uri);
        int lastIndexOf = a2.getName().lastIndexOf(46);
        return (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1))) == null) ? C0201.m82(20693) : mimeTypeFromExtension;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(C0201.m82(20694));
    }

    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.a.a(uri), f(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a2 = this.a.a(uri);
        if (strArr == null) {
            strArr = b;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            String r3 = C0201.m82(20695);
            if (r3.equals(str3)) {
                strArr3[i2] = r3;
                i = i2 + 1;
                objArr[i2] = a2.getName();
            } else {
                String r32 = C0201.m82(20696);
                if (r32.equals(str3)) {
                    strArr3[i2] = r32;
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(a2.length());
                }
            }
            i2 = i;
        }
        String[] c2 = c(strArr3, i2);
        Object[] b2 = b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(c2, 1);
        matrixCursor.addRow(b2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(C0201.m82(20697));
    }
}
