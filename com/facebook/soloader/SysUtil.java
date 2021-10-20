package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.soloader.i;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import vigqyno.C0201;

public final class SysUtil {

    /* access modifiers changed from: private */
    @d
    @TargetApi(21)
    public static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @d
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            try {
                Os.posix_fallocate(fileDescriptor, 0, j);
            } catch (ErrnoException e) {
                int i = e.errno;
                if (i != OsConstants.EOPNOTSUPP && i != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @d
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (Os.readlink(C0201.m82(1641)).contains(C0201.m82(1642))) {
                    treeSet.add(i.b.AARCH64.toString());
                    treeSet.add(i.b.X86_64.toString());
                } else {
                    treeSet.add(i.b.ARM.toString());
                    treeSet.add(i.b.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                Log.e(C0201.m82(1644), String.format(C0201.m82(1643), Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }
    }

    public static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    public static void b(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    b(file2);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            throw new IOException(C0201.m82(37414) + file);
        }
    }

    public static void c(FileDescriptor fileDescriptor, long j) throws IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
        }
    }

    public static int d(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        throw r1;
     */
    public static void e(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    e(file2);
                }
                return;
            }
            throw new IOException(C0201.m82(37415) + file);
        } else if (!file.getPath().endsWith(C0201.m82(37416))) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, C0201.m82(37417));
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        }
    }

    public static int f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static String[] g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return LollipopSysdeps.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    public static void h(File file) throws IOException {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(C0201.m82(37418) + file);
        }
    }
}
