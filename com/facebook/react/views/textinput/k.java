package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* compiled from: ReactTextInputLocalData */
public final class k {
    private final SpannableStringBuilder a;
    private final float b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final CharSequence g;

    public k(EditText editText) {
        this.a = new SpannableStringBuilder(editText.getText());
        this.b = editText.getTextSize();
        this.e = editText.getInputType();
        this.g = editText.getHint();
        this.c = editText.getMinLines();
        this.d = editText.getMaxLines();
        if (Build.VERSION.SDK_INT >= 23) {
            this.f = editText.getBreakStrategy();
        } else {
            this.f = 0;
        }
    }

    public void a(EditText editText) {
        editText.setText(this.a);
        editText.setTextSize(0, this.b);
        editText.setMinLines(this.c);
        editText.setMaxLines(this.d);
        editText.setInputType(this.e);
        editText.setHint(this.g);
        if (Build.VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.f);
        }
    }
}
