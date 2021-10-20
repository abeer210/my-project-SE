package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;

/* compiled from: NoEndIconDelegate */
public class g extends e {
    public g(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        this.a.setEndIconOnClickListener(null);
        this.a.setEndIconDrawable((Drawable) null);
        this.a.setEndIconContentDescription((CharSequence) null);
    }
}
