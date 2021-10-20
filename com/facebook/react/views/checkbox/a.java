package com.facebook.react.views.checkbox;

import android.content.Context;
import androidx.appcompat.widget.g;

/* compiled from: ReactCheckBox */
public class a extends g {
    private boolean d = true;

    public a(Context context) {
        super(context);
    }

    public void b(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.d = true;
    }

    public void setChecked(boolean z) {
        if (this.d) {
            this.d = false;
            super.setChecked(z);
        }
    }
}
