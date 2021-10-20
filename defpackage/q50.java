package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: q50  reason: default package */
/* compiled from: FileUtils */
public class q50 {

    /* renamed from: q50$a */
    /* compiled from: FileUtils */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: q50$b */
    /* compiled from: FileUtils */
    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* renamed from: q50$c */
    /* compiled from: FileUtils */
    public static class c extends FileNotFoundException {
        public c(String str) {
            super(str);
        }
    }

    /* renamed from: q50$d */
    /* compiled from: FileUtils */
    public static class d extends IOException {
        public d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static void a(File file) throws a {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) throws d {
        z50.g(file);
        z50.g(file2);
        file2.delete();
        if (!file.renameTo(file2)) {
            Throwable th = null;
            if (file2.exists()) {
                th = new b(file2.getAbsolutePath());
            } else if (!file.getParentFile().exists()) {
                th = new c(file.getAbsolutePath());
            } else if (!file.exists()) {
                th = new FileNotFoundException(file.getAbsolutePath());
            }
            throw new d(C0201.m82(21109) + file.getAbsolutePath() + C0201.m82(21110) + file2.getAbsolutePath(), th);
        }
    }
}
