package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: z60  reason: default package */
/* compiled from: StatFsHelper */
public class z60 {
    private static z60 h;
    private static final long i = TimeUnit.MINUTES.toMillis(2);
    private volatile StatFs a = null;
    private volatile File b;
    private volatile StatFs c = null;
    private volatile File d;
    private long e;
    private final Lock f = new ReentrantLock();
    private volatile boolean g = false;

    /* renamed from: z60$a */
    /* compiled from: StatFsHelper */
    public enum a {
        INTERNAL,
        EXTERNAL
    }

    public static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (!this.g) {
            this.f.lock();
            try {
                if (!this.g) {
                    this.b = Environment.getDataDirectory();
                    this.d = Environment.getExternalStorageDirectory();
                    g();
                    this.g = true;
                }
            } finally {
                this.f.unlock();
            }
        }
    }

    public static synchronized z60 d() {
        z60 z60;
        synchronized (z60.class) {
            if (h == null) {
                h = new z60();
            }
            z60 = h;
        }
        return z60;
    }

    private void e() {
        if (this.f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.e > i) {
                    g();
                }
            } finally {
                this.f.unlock();
            }
        }
    }

    private void g() {
        this.a = h(this.a, this.b);
        this.c = h(this.c, this.d);
        this.e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = a(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                e60.a(th);
                throw null;
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long c(a aVar) {
        long j;
        long j2;
        b();
        e();
        StatFs statFs = aVar == a.INTERNAL ? this.a : this.c;
        if (statFs == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    public boolean f(a aVar, long j) {
        b();
        long c2 = c(aVar);
        return c2 <= 0 || c2 < j;
    }
}
