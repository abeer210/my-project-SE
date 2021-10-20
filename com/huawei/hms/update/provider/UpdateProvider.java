package com.huawei.hms.update.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import vigqyno.C0201;

public class UpdateProvider extends ContentProvider {
    public static final String AUTHORITIES_SUFFIX = null;
    private static final String[] a = {C0201.m82(6386), C0201.m82(6387)};
    private static a b = new a();

    static {
        C0201.m83(UpdateProvider.class, 707);
    }

    private static int a(String str) {
        if (C0201.m82(6388).equals(str)) {
            return 268435456;
        }
        if (C0201.m82(6389).equals(str) || C0201.m82(6390).equals(str)) {
            return 738197504;
        }
        if (C0201.m82(6391).equals(str)) {
            return 704643072;
        }
        if (C0201.m82(6392).equals(str)) {
            return 939524096;
        }
        if (C0201.m82(6393).equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(C0201.m82(6394) + str);
    }

    public static File getLocalFile(Context context, String str) {
        b.a(context.getApplicationContext());
        return b.a(str);
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        b.a(context.getApplicationContext());
        return b.a(file, str);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException(C0201.m82(6396));
        } else if (!providerInfo.grantUriPermissions) {
            throw new SecurityException(C0201.m82(6395));
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        b.a(getContext().getApplicationContext());
        return b.a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        Context context = getContext();
        String r1 = C0201.m82(6397);
        if (context == null) {
            return r1;
        }
        b.a(getContext().getApplicationContext());
        String name = b.a(uri).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(lastIndexOf + 1));
            if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
                return mimeTypeFromExtension;
            }
        }
        return r1;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(C0201.m82(6398));
    }

    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        b.a(getContext().getApplicationContext());
        return ParcelFileDescriptor.open(b.a(uri), a(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        b.a(getContext().getApplicationContext());
        File a2 = b.a(uri);
        if (strArr == null) {
            strArr = a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            String r3 = C0201.m82(6399);
            if (r3.equals(str3)) {
                strArr3[i2] = r3;
                i = i2 + 1;
                objArr[i2] = a2.getName();
            } else {
                String r32 = C0201.m82(6400);
                if (r32.equals(str3)) {
                    strArr3[i2] = r32;
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(a2.length());
                }
            }
            i2 = i;
        }
        String[] a3 = a(strArr3, i2);
        Object[] a4 = a(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(a3, 1);
        matrixCursor.addRow(a4);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(C0201.m82(6401));
    }

    private static String[] a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static Object[] a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }
}
