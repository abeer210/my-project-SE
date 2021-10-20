package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* renamed from: lj  reason: default package */
/* compiled from: RuntimeCompat */
public final class lj {

    /* access modifiers changed from: package-private */
    /* renamed from: lj$a */
    /* compiled from: RuntimeCompat */
    public class a implements FilenameFilter {
        public final /* synthetic */ Pattern a;

        public a(Pattern pattern) {
            this.a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.a.matcher(str).matches();
        }
    }

    public static int a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    private static int b() {
        File[] fileArr;
        String r0 = C0201.m82(29139);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File(C0201.m82(29140)).listFiles(new a(Pattern.compile(C0201.m82(29141))));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
