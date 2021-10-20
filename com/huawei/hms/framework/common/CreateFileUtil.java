package com.huawei.hms.framework.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.android.os.BuildEx;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import vigqyno.C0201;

public class CreateFileUtil {
    private static final String BUILDEX_NAME = null;
    private static final String EXTERNAL_FILE_NAME = null;
    private static final String EXTERNAL_INPUTSTREAM_NAME = null;
    private static final String EXTERNAL_OUTPUTSTREAM_NAME = null;
    private static final String RANDOM_ACCESS_FILE_NAME = null;
    private static final String TAG = null;

    static {
        C0201.m83(CreateFileUtil.class, 418);
    }

    private static boolean checkCompatible(String str) {
        try {
            tryLoadClass(str);
            return true;
        } catch (Exception unused) {
            Logger.w(C0201.m82(13910), str + C0201.m82(13909));
            return false;
        }
    }

    public static void deleteSecure(File file) {
        if (file != null && file.exists() && !file.delete()) {
            Logger.w(C0201.m82(13911), C0201.m82(13912));
        }
    }

    public static void deleteSecure(String str) {
        if (!TextUtils.isEmpty(str)) {
            deleteSecure(newFile(str));
        }
    }

    public static String getCacheDirPath(Context context) {
        if (context == null) {
            return C0201.m82(13913);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            context = context.createDeviceProtectedStorageContext();
        }
        return context.getCacheDir().getPath();
    }

    public static String getCanonicalPath(String str) {
        String str2;
        Throwable e;
        String r0 = C0201.m82(13914);
        try {
            return newFile(str).getCanonicalPath();
        } catch (IOException e2) {
            e = e2;
            str2 = C0201.m82(13917);
        } catch (SecurityException e3) {
            e = e3;
            str2 = C0201.m82(13916);
        } catch (Exception e4) {
            e = e4;
            str2 = C0201.m82(13915);
        }
        Logger.w(r0, str2, e);
        return str;
    }

    public static boolean isPVersion() {
        return checkCompatible(C0201.m82(13918)) && BuildEx.VERSION.EMUI_SDK_INT >= 17;
    }

    public static File newFile(String str) {
        if (str == null) {
            return null;
        }
        return isPVersion() ? checkCompatible(C0201.m82(13919)) ? new ExternalStorageFile(str) : new File(str) : new File(str);
    }

    public static FileInputStream newFileInputStream(String str) {
        if (str != null) {
            return isPVersion() ? checkCompatible(C0201.m82(13920)) ? new ExternalStorageFileInputStream(str) : new FileInputStream(str) : new FileInputStream(str);
        }
        Logger.w(C0201.m82(13921), C0201.m82(13922));
        throw new FileNotFoundException(C0201.m82(13923));
    }

    public static FileOutputStream newFileOutputStream(File file) {
        if (file != null) {
            return isPVersion() ? checkCompatible(C0201.m82(13924)) ? new ExternalStorageFileOutputStream(file) : new FileOutputStream(file) : new FileOutputStream(file);
        }
        Logger.e(C0201.m82(13925), C0201.m82(13926));
        throw new FileNotFoundException(C0201.m82(13927));
    }

    public static RandomAccessFile newRandomAccessFile(String str, String str2) {
        if (str != null) {
            return isPVersion() ? checkCompatible(C0201.m82(13928)) ? new ExternalStorageRandomAccessFile(str, str2) : new RandomAccessFile(str, str2) : new RandomAccessFile(str, str2);
        }
        Logger.w(C0201.m82(13929), C0201.m82(13930));
        throw new FileNotFoundException(C0201.m82(13931));
    }

    private static void tryLoadClass(String str) {
        ClassLoader classLoader = CreateFileUtil.class.getClassLoader();
        if (classLoader != null) {
            classLoader.loadClass(str);
            return;
        }
        throw new ClassNotFoundException(C0201.m82(13932));
    }
}
