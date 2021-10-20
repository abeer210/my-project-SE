package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: ta  reason: default package */
/* compiled from: LPaint */
public class ta extends Paint {
    public ta() {
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public ta(int i) {
        super(i);
    }

    public ta(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public ta(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
