package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import vigqyno.C0201;

/* renamed from: wi2  reason: default package */
/* compiled from: ButtonPresenter */
public class wi2 {
    private tf2 a;

    public wi2(tf2 tf2) {
        this.a = tf2;
    }

    public SpannableString a() {
        SpannableString spannableString = new SpannableString((CharSequence) this.a.d.e(C0201.m82(24323)));
        spannableString.setSpan(new xi2(this.a), 0, this.a.d.g(), 34);
        return spannableString;
    }

    public void b(Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }
}
