package com.RNFetchBlob.Utils;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.RNFetchBlob.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import vigqyno.C0201;

/* compiled from: PathResolver */
public class a {
    private static String a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        query.moveToFirst();
        int columnIndex = query.getColumnIndex(C0201.m82(31794));
        if (columnIndex < 0) {
            return null;
        }
        String string = query.getString(columnIndex);
        query.close();
        return string;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    public static String b(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        Exception e;
        Cursor cursor;
        String r0 = C0201.m82(31795);
        Cursor cursor2 = null;
        r7 = null;
        String str2 = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{r0}, str, strArr, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(cursor.getColumnIndexOrThrow(r0));
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return str2;
        } catch (Exception e3) {
            e = e3;
            cursor = null;
            e.printStackTrace();
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @TargetApi(19)
    public static String c(Context context, Uri uri) {
        String a;
        boolean z = Build.VERSION.SDK_INT >= 19;
        String r3 = C0201.m82(31796);
        Uri uri2 = null;
        if (z && DocumentsContract.isDocumentUri(context, uri)) {
            boolean e = e(uri);
            String r5 = C0201.m82(31797);
            if (e) {
                String[] split = DocumentsContract.getDocumentId(uri).split(r5);
                if (C0201.m82(31798).equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + C0201.m82(31799) + split[1];
                }
            } else if (d(uri)) {
                try {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId == null || !documentId.startsWith(C0201.m82(31800))) {
                        return b(context, ContentUris.withAppendedId(Uri.parse(C0201.m82(31801)), Long.valueOf(documentId).longValue()), null, null);
                    }
                    return Uri.parse(documentId).getPath();
                } catch (Exception unused) {
                    return null;
                }
            } else if (g(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(r5);
                String str = split2[0];
                if (C0201.m82(31802).equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (C0201.m82(31803).equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (C0201.m82(31804).equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return b(context, uri2, C0201.m82(31805), new String[]{split2[1]});
            } else if (!r3.equalsIgnoreCase(uri.getScheme())) {
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (!(openInputStream == null || (a = a(context.getContentResolver(), uri)) == null)) {
                        File file = new File(context.getCacheDir(), a);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (openInputStream.read(bArr) > 0) {
                            fileOutputStream.write(bArr);
                        }
                        fileOutputStream.close();
                        openInputStream.close();
                        return file.getAbsolutePath();
                    }
                } catch (Exception e2) {
                    h.a(e2.toString());
                    return null;
                }
            } else if (f(uri)) {
                return uri.getLastPathSegment();
            } else {
                return b(context, uri, null, null);
            }
        } else if (r3.equalsIgnoreCase(uri.getScheme())) {
            if (f(uri)) {
                return uri.getLastPathSegment();
            }
            return b(context, uri, null, null);
        } else if (C0201.m82(31806).equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static boolean d(Uri uri) {
        return C0201.m82(31807).equals(uri.getAuthority());
    }

    public static boolean e(Uri uri) {
        return C0201.m82(31808).equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return C0201.m82(31809).equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return C0201.m82(31810).equals(uri.getAuthority());
    }
}
