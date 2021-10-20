package com.huawei.updatesdk.fileprovider;

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
import com.huawei.updatesdk.a.a.b.a.a.a;
import java.io.File;
import java.io.FileNotFoundException;
import vigqyno.C0201;

public class UpdateSdkFileProvider extends ContentProvider {
    public static final String AUTHORITIES_SUFFIX = null;
    private static final String[] COLUMNS = {C0201.m82(3314), C0201.m82(3315)};
    private static final String TAG = null;
    private static a mWStrategy;
    private String authority;

    static {
        C0201.m83(UpdateSdkFileProvider.class, 591);
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static synchronized a createWiseDistPathStrategy(Context context, String str) {
        a aVar;
        synchronized (UpdateSdkFileProvider.class) {
            if (mWStrategy == null) {
                mWStrategy = new b(str);
                if (context.getFilesDir() != null) {
                    mWStrategy.a(C0201.m82(3317), buildPath(context.getFilesDir(), C0201.m82(3316)));
                }
            }
            aVar = mWStrategy;
        }
        return aVar;
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        createWiseDistPathStrategy(context, str);
        return mWStrategy.a(file);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException(C0201.m82(3319));
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority;
            this.authority = str;
            createWiseDistPathStrategy(context, str);
        } else {
            throw new SecurityException(C0201.m82(3318));
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException(C0201.m82(3320));
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        if (uri != null && !TextUtils.isEmpty(uri.toString())) {
            String uri2 = uri.toString();
            String r0 = C0201.m82(3321);
            if (uri2.endsWith(r0) && (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(r0)) != null) {
                return mimeTypeFromExtension;
            }
        }
        return C0201.m82(3322);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(C0201.m82(3323));
    }

    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (uri == null || uri.getAuthority() == null || !uri.getAuthority().equals(this.authority)) {
            return null;
        }
        File a = mWStrategy.a(uri);
        if (a.getName().endsWith(C0201.m82(3324))) {
            return ParcelFileDescriptor.open(a, 268435456);
        }
        a.b(C0201.m82(3325), C0201.m82(3326));
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = mWStrategy.a(uri);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            String r3 = C0201.m82(3327);
            if (r3.equals(str3)) {
                strArr3[i2] = r3;
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else {
                String r32 = C0201.m82(3328);
                if (r32.equals(str3)) {
                    strArr3[i2] = r32;
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(a.length());
                }
            }
            i2 = i;
        }
        String[] copyOf = copyOf(strArr3, i2);
        Object[] copyOf2 = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(C0201.m82(3329));
    }
}
