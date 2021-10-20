package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;

public class AHTextView extends z {
    private Integer e;

    public AHTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void h() {
        if (this.e == null) {
            this.e = Integer.valueOf(getCurrentTextColor());
        }
    }

    public void setTextColor(Integer num) {
        h();
        if (num == null) {
            super.setTextColor(this.e.intValue());
        } else {
            super.setTextColor(num.intValue());
        }
    }
}
