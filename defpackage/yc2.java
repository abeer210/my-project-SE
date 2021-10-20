package defpackage;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import java.io.File;
import vigqyno.C0201;

/* renamed from: yc2  reason: default package */
/* compiled from: RealPathUtil */
public class yc2 {
    public static Uri a(Context context, File file) {
        if (Build.VERSION.SDK_INT < 21) {
            return Uri.fromFile(file);
        }
        try {
            return FileProvider.e(context, context.getApplicationContext().getPackageName() + C0201.m82(30786), file);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    public static String b(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        String r0 = C0201.m82(30787);
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{r0}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow(r0));
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static String c(Context context, Uri uri) {
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), uri.getLastPathSegment());
        if (file.exists()) {
            return file.toString();
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public static String d(Context context, Uri uri) {
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT >= 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if (!C0201.m82(30796).equalsIgnoreCase(uri.getScheme())) {
                if (C0201.m82(30797).equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            } else if (h(uri)) {
                return uri.getLastPathSegment();
            } else {
                if (g(context, uri)) {
                    return c(context, uri);
                }
                return b(context, uri, null, null);
            }
        } else {
            boolean f = f(uri);
            String r4 = C0201.m82(30788);
            if (f) {
                String[] split = DocumentsContract.getDocumentId(uri).split(r4);
                if (C0201.m82(30789).equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + C0201.m82(30790) + split[1];
                }
            } else if (e(uri)) {
                return b(context, ContentUris.withAppendedId(Uri.parse(C0201.m82(30791)), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
            } else if (i(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(r4);
                String str = split2[0];
                if (C0201.m82(30792).equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (C0201.m82(30793).equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (C0201.m82(30794).equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return b(context, uri2, C0201.m82(30795), new String[]{split2[1]});
            }
        }
        return null;
    }

    public static boolean e(Uri uri) {
        return C0201.m82(30798).equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return C0201.m82(30799).equals(uri.getAuthority());
    }

    public static boolean g(Context context, Uri uri) {
        return (context.getPackageName() + C0201.m82(30800)).equals(uri.getAuthority());
    }

    public static boolean h(Uri uri) {
        return C0201.m82(30801).equals(uri.getAuthority());
    }

    public static boolean i(Uri uri) {
        return C0201.m82(30802).equals(uri.getAuthority());
    }
}
