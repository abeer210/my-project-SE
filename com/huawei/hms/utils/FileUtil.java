package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import vigqyno.C0201;

public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = null;
    public static final String LOCAL_REPORT_FILE_CONFIG = null;
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 0;
    private static boolean a;
    private static ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    static {
        C0201.m83(FileUtil.class, 653);
    }

    public static boolean verifyHash(String str, File file) {
        byte[] digest = SHA256.digest(file);
        if (digest == null || !HEX.encodeHexString(digest, true).equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static void writeFile(final File file, final String str, final long j) {
        b.execute(new Runnable() {
            /* class com.huawei.hms.utils.FileUtil.AnonymousClass1 */

            public void run() {
                Throwable th;
                IOException e;
                File file = file;
                String r1 = C0201.m82(26742);
                if (file == null) {
                    HMSLog.e(r1, C0201.m82(26743));
                    return;
                }
                File parentFile = file.getParentFile();
                if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
                    HMSLog.e(r1, C0201.m82(26748));
                    return;
                }
                RandomAccessFile randomAccessFile = null;
                try {
                    long length = file.length();
                    long j = j;
                    String r6 = C0201.m82(26744);
                    if (length > j) {
                        String canonicalPath = file.getCanonicalPath();
                        if (!file.delete()) {
                            HMSLog.e(r1, C0201.m82(26745));
                        }
                        randomAccessFile = new RandomAccessFile(new File(canonicalPath), r6);
                    } else {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, r6);
                        try {
                            randomAccessFile2.seek(length);
                            randomAccessFile = randomAccessFile2;
                        } catch (IOException e2) {
                            e = e2;
                            randomAccessFile = randomAccessFile2;
                            try {
                                HMSLog.e(r1, C0201.m82(26747), e);
                                IOUtils.closeQuietly(randomAccessFile);
                            } catch (Throwable th2) {
                                th = th2;
                                IOUtils.closeQuietly(randomAccessFile);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            randomAccessFile = randomAccessFile2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    }
                    randomAccessFile.writeBytes(str + System.getProperty(C0201.m82(26746)));
                } catch (IOException e3) {
                    e = e3;
                    HMSLog.e(r1, C0201.m82(26747), e);
                    IOUtils.closeQuietly(randomAccessFile);
                }
                IOUtils.closeQuietly(randomAccessFile);
            }
        });
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j, int i) {
        if (file != null && file.isFile() && file.exists()) {
            if (!a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.e(C0201.m82(4888), C0201.m82(4889));
                }
                a = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String r1 = C0201.m82(4890);
            sb.append(r1);
            sb.append(j);
            sb.append(r1);
            sb.append(i);
            writeFile(file2, sb.toString(), 10240);
        }
    }
}
