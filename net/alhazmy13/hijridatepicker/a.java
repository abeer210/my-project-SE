package net.alhazmy13.hijridatepicker;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import vigqyno.C0201;

/* compiled from: HapticFeedbackController */
public class a {
    private final Context a;
    private final ContentObserver b = new C0156a(null);
    private Vibrator c;
    private boolean d;
    private long e;

    /* renamed from: net.alhazmy13.hijridatepicker.a$a  reason: collision with other inner class name */
    /* compiled from: HapticFeedbackController */
    class C0156a extends ContentObserver {
        public C0156a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            a aVar = a.this;
            aVar.d = a.d(aVar.a);
        }
    }

    public a(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: private */
    public static boolean d(Context context) {
        return Settings.System.getInt(context.getContentResolver(), C0201.m82(27161), 0) == 1;
    }

    private boolean e(Context context) {
        return context.getPackageManager().checkPermission(C0201.m82(27162), context.getPackageName()) == 0;
    }

    public void f() {
        if (e(this.a)) {
            this.c = (Vibrator) this.a.getSystemService(C0201.m82(27163));
        }
        this.d = d(this.a);
        this.a.getContentResolver().registerContentObserver(Settings.System.getUriFor(C0201.m82(27164)), false, this.b);
    }

    public void g() {
        this.c = null;
        this.a.getContentResolver().unregisterContentObserver(this.b);
    }

    public void h() {
        if (this.c != null && this.d) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e >= 125) {
                this.c.vibrate(50);
                this.e = uptimeMillis;
            }
        }
    }
}
