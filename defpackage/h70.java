package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.net.MalformedURLException;
import java.net.URL;
import vigqyno.C0201;

/* renamed from: h70  reason: default package */
/* compiled from: UriUtil */
public class h70 {
    private static final Uri a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, C0201.m82(10544));

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    public static String a(ContentResolver contentResolver, Uri uri) {
        Throwable th;
        int columnIndex;
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        String str = null;
        if (h(uri)) {
            try {
                Cursor query = contentResolver.query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndex = query.getColumnIndex(C0201.m82(10545))) != -1) {
                            str = query.getString(columnIndex);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
                if (query == null) {
                    return str;
                }
                query.close();
                return str;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else if (i(uri)) {
            return uri.getPath();
        } else {
            return null;
        }
    }

    public static String b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri c(int i) {
        return new Uri.Builder().scheme(C0201.m82(10546)).path(String.valueOf(i)).build();
    }

    public static boolean d(Uri uri) {
        return C0201.m82(10547).equals(b(uri));
    }

    public static boolean e(Uri uri) {
        return C0201.m82(10548).equals(b(uri));
    }

    public static boolean f(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean g(Uri uri) {
        if (h(uri)) {
            return C0201.m82(10549).equals(uri.getAuthority()) && !uri.getPath().startsWith(a.getPath());
        }
    }

    public static boolean h(Uri uri) {
        return C0201.m82(10550).equals(b(uri));
    }

    public static boolean i(Uri uri) {
        return C0201.m82(10551).equals(b(uri));
    }

    public static boolean j(Uri uri) {
        return C0201.m82(10552).equals(b(uri));
    }

    public static boolean k(Uri uri) {
        String b = b(uri);
        return C0201.m82(10553).equals(b) || C0201.m82(10554).equals(b);
    }

    public static boolean l(Uri uri) {
        return C0201.m82(10555).equals(b(uri));
    }

    public static URL m(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
