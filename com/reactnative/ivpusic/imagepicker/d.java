package com.reactnative.ivpusic.imagepicker;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* compiled from: RealPathUtil */
public class d {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    private static String a(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        String r0 = C0201.m82(2642);
        String r1 = C0201.m82(2643);
        Cursor cursor = null;
        String str2 = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{r0, r1}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex(r0);
                        if (columnIndex > -1) {
                            str2 = query.getString(columnIndex);
                        }
                        if (str2 != null) {
                            String string = query.getString(columnIndex);
                            if (query != null) {
                                query.close();
                            }
                            return string;
                        }
                        String absolutePath = h(context, query.getString(query.getColumnIndexOrThrow(r1)), uri).getAbsolutePath();
                        if (query != null) {
                            query.close();
                        }
                        return absolutePath;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
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
            }
            throw th;
        }
    }

    @TargetApi(19)
    private static String b(Context context, String str) {
        String absolutePath;
        int indexOf;
        File[] externalCacheDirs = context.getExternalCacheDirs();
        if (externalCacheDirs == null) {
            return null;
        }
        for (File file : externalCacheDirs) {
            if (file != null && (absolutePath = file.getAbsolutePath()) != null && (indexOf = absolutePath.indexOf(str)) != -1) {
                return absolutePath.substring(0, indexOf) + str;
            }
        }
        return null;
    }

    @TargetApi(19)
    public static String c(Context context, Uri uri) throws IOException {
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT == 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if (!C0201.m82(2652).equalsIgnoreCase(uri.getScheme())) {
                if (C0201.m82(2653).equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            } else if (f(uri)) {
                return uri.getLastPathSegment();
            } else {
                return a(context, uri, null, null);
            }
        } else {
            boolean e = e(uri);
            String r4 = C0201.m82(2644);
            if (e) {
                String documentId = DocumentsContract.getDocumentId(uri);
                String[] split = documentId.split(r4);
                boolean equalsIgnoreCase = C0201.m82(2645).equalsIgnoreCase(split[0]);
                String r5 = C0201.m82(2646);
                if (equalsIgnoreCase) {
                    return Environment.getExternalStorageDirectory() + r5 + split[1];
                }
                int indexOf = documentId.indexOf(58, 1);
                String substring = documentId.substring(0, indexOf);
                String substring2 = documentId.substring(indexOf + 1);
                String b = b(context, substring);
                if (b != null) {
                    String str = b + r5 + substring2;
                    File file = new File(str);
                    if (!file.exists() || !file.canRead()) {
                        return null;
                    }
                    return str;
                }
            } else if (d(uri)) {
                return a(context, ContentUris.withAppendedId(Uri.parse(C0201.m82(2647)), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
            } else if (g(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(r4);
                String str2 = split2[0];
                if (C0201.m82(2648).equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (C0201.m82(2649).equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (C0201.m82(2650).equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return a(context, uri2, C0201.m82(2651), new String[]{split2[1]});
            }
        }
        return null;
    }

    private static boolean d(Uri uri) {
        return C0201.m82(2654).equals(uri.getAuthority());
    }

    private static boolean e(Uri uri) {
        return C0201.m82(2655).equals(uri.getAuthority());
    }

    private static boolean f(Uri uri) {
        return C0201.m82(2656).equals(uri.getAuthority());
    }

    private static boolean g(Uri uri) {
        return C0201.m82(2657).equals(uri.getAuthority());
    }

    private static File h(Context context, String str, Uri uri) {
        String str2 = context.getCacheDir() + C0201.m82(2658);
        new File(str2).mkdir();
        File file = new File(new File(str2), str.substring(str.lastIndexOf(47) + 1));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            while (true) {
                int read = openInputStream.read(bArr, 0, 8192);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            openInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }
}
