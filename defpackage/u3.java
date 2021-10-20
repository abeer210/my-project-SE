package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import vigqyno.C0201;

/* renamed from: u3  reason: default package */
/* compiled from: AccessibilityClickableSpanCompat */
public final class u3 extends ClickableSpan {
    private final int a;
    private final w3 b;
    private final int c;

    public u3(int i, w3 w3Var, int i2) {
        this.a = i;
        this.b = w3Var;
        this.c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(C0201.m82(6143), this.a);
        this.b.P(this.c, bundle);
    }
}
