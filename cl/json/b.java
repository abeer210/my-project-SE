package cl.json;

import android.app.Application;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: RNSharePathUtil */
public class b {
    private static final ArrayList<String> a = new ArrayList<>();

    public static Uri a(ReactContext reactContext, File file) {
        b(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if (!TextUtils.isEmpty(authority) && a.contains(authority)) {
            return Uri.fromFile(file);
        }
        if (file.getAbsolutePath().startsWith(C0201.m82(13111))) {
            return Uri.fromFile(file);
        }
        Uri uri = null;
        for (int i = 0; i < a.size(); i++) {
            try {
                uri = FileProvider.e(reactContext, a.get(i), file);
                if (uri != null) {
                    break;
                }
            } catch (Exception e) {
                PrintStream printStream = System.out;
                printStream.println(C0201.m82(13112) + e.getMessage());
            }
        }
        return uri;
    }

    public static void b(ReactContext reactContext) {
        if (a.size() == 0) {
            Application application = (Application) reactContext.getApplicationContext();
            if (application instanceof c) {
                a.add(((c) application).b());
            }
            ArrayList<String> arrayList = a;
            arrayList.add(reactContext.getPackageName() + C0201.m82(13113));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    public static String c(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        String r0 = C0201.m82(13114);
        Cursor cursor = null;
        try {
            Cursor K = new t4(context, uri, new String[]{r0}, str, strArr, null).G();
            if (K != null) {
                try {
                    if (K.moveToFirst()) {
                        String string = K.getString(K.getColumnIndexOrThrow(r0));
                        if (K != null) {
                            K.close();
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = K;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (K != null) {
                K.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public static String d(Context context, Uri uri) {
        int i = Build.VERSION.SDK_INT;
        String r1 = C0201.m82(13115);
        Uri uri2 = null;
        if (i < 19 || !DocumentsContract.isDocumentUri(context, uri)) {
            if (!C0201.m82(13128).equalsIgnoreCase(uri.getScheme())) {
                if (C0201.m82(13129).equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            } else if (g(uri)) {
                return uri.getLastPathSegment();
            } else {
                return r1 + c(context, uri, null, null);
            }
        } else {
            boolean f = f(uri);
            String r3 = C0201.m82(13116);
            String r4 = C0201.m82(13117);
            if (f) {
                String[] split = DocumentsContract.getDocumentId(uri).split(r4);
                String str = split[0];
                boolean equalsIgnoreCase = C0201.m82(13118).equalsIgnoreCase(str);
                String r5 = C0201.m82(13119);
                if (equalsIgnoreCase || C0201.m82(13120).equalsIgnoreCase(str)) {
                    return r1 + context.getExternalCacheDir() + r5 + split[1];
                } else if (r3.equalsIgnoreCase(str)) {
                    return r1 + split[1];
                } else if (!TextUtils.isEmpty(str)) {
                    return r1 + C0201.m82(13121) + str + r5 + split[1];
                }
            } else if (e(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                String r0 = C0201.m82(13122);
                if (documentId.startsWith(r0)) {
                    return r1 + documentId.replaceFirst(r0, r1);
                }
                Uri withAppendedId = ContentUris.withAppendedId(Uri.parse(C0201.m82(13123)), Long.valueOf(documentId).longValue());
                return r1 + c(context, withAppendedId, null, null);
            } else if (h(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(r4);
                String str2 = split2[0];
                if (C0201.m82(13124).equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (C0201.m82(13125).equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (C0201.m82(13126).equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                } else if (r3.equalsIgnoreCase(str2)) {
                    return r1 + split2[1];
                }
                String[] strArr = {split2[1]};
                return r1 + c(context, uri2, C0201.m82(13127), strArr);
            }
        }
        return null;
    }

    public static boolean e(Uri uri) {
        return C0201.m82(13130).equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return C0201.m82(13131).equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return C0201.m82(13132).equals(uri.getAuthority());
    }

    public static boolean h(Uri uri) {
        return C0201.m82(13133).equals(uri.getAuthority());
    }
}
