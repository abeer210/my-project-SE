package defpackage;

import android.util.Log;
import com.google.android.gms.common.internal.l;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: zp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class zp0 {
    private final String a;
    private final String b;
    private final int c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public zp0(String str, String... strArr) {
        this(str, r8);
        String str2;
        if (strArr.length == 0) {
            str2 = C0201.m82(19351);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(C0201.m82(19352));
                }
                sb.append(str3);
            }
            sb.append(']');
            sb.append(' ');
            str2 = sb.toString();
        }
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.a, c(str, objArr));
    }

    public String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public boolean d(int i) {
        return this.c <= i;
    }

    private zp0(String str, String str2) {
        this.b = str2;
        this.a = str;
        new l(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }
}
