package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: gy1  reason: default package */
public final class gy1 {
    private final String a;

    public gy1(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append(C0201.m82(18012));
        sb.append(myUid);
        sb.append(C0201.m82(18013));
        sb.append(myPid);
        sb.append(C0201.m82(18014));
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final int a(int i, String str, Object[] objArr) {
        String r0 = C0201.m82(18015);
        if (Log.isLoggable(r0, i)) {
            return Log.i(r0, b(this.a, str, objArr));
        }
        return 0;
    }

    private static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                String r2 = C0201.m82(18016);
                Log.e(C0201.m82(18017), valueOf.length() != 0 ? r2.concat(valueOf) : new String(r2), e);
                String join = TextUtils.join(C0201.m82(18018), objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(C0201.m82(18019));
                sb.append(join);
                sb.append(C0201.m82(18020));
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(C0201.m82(18021));
        sb2.append(str2);
        return sb2.toString();
    }

    public final void c(String str, Object... objArr) {
        a(3, str, objArr);
    }

    public final void d(Throwable th, String str, Object... objArr) {
        String r0 = C0201.m82(18022);
        if (Log.isLoggable(r0, 6)) {
            Log.e(r0, b(this.a, str, objArr), th);
        }
    }

    public final void e(String str, Object... objArr) {
        a(6, str, objArr);
    }

    public final void f(String str, Object... objArr) {
        a(4, str, objArr);
    }

    public final void g(String str, Object... objArr) {
        a(5, str, objArr);
    }
}
