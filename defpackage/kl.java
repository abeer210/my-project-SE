package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: kl  reason: default package */
/* compiled from: HardwareConfigState */
public final class kl {
    private static final File f = new File(C0201.m82(27442));
    private static volatile kl g;
    private final boolean a = d();
    private final int b;
    private final int c;
    private int d;
    private boolean e = true;

    public kl() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = 20000;
            this.c = 0;
            return;
        }
        this.b = C0188.f17;
        this.c = 128;
    }

    public static kl a() {
        if (g == null) {
            synchronized (kl.class) {
                if (g == null) {
                    g = new kl();
                }
            }
        }
        return g;
    }

    private synchronized boolean b() {
        boolean z = true;
        int i = this.d + 1;
        this.d = i;
        if (i >= 50) {
            this.d = 0;
            int length = f.list().length;
            if (length >= this.b) {
                z = false;
            }
            this.e = z;
            if (!z && Log.isLoggable(C0201.m82(27443), 5)) {
                String r0 = C0201.m82(27444);
                Log.w(r0, C0201.m82(27445) + length + C0201.m82(27446) + this.b);
            }
        }
        return this.e;
    }

    private static boolean d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = Build.MODEL.substring(0, 7);
        char c2 = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals(C0201.m82(27453))) {
                    c2 = 6;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals(C0201.m82(27452))) {
                    c2 = 5;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals(C0201.m82(27451))) {
                    c2 = 4;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals(C0201.m82(27450))) {
                    c2 = 2;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals(C0201.m82(27449))) {
                    c2 = 3;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals(C0201.m82(27448))) {
                    c2 = 1;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals(C0201.m82(27447))) {
                    c2 = 0;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (Build.VERSION.SDK_INT != 26) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public boolean c(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (!z || !this.a || Build.VERSION.SDK_INT < 26 || z2 || i < (i3 = this.c) || i2 < i3 || !b()) {
            return false;
        }
        return true;
    }

    @TargetApi(26)
    public boolean e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean c2 = c(i, i2, z, z2);
        if (c2) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c2;
    }
}
