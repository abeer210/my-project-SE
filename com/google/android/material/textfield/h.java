package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PasswordToggleEndIconDelegate */
public class h extends e {
    private final TextWatcher d = new a();
    private final TextInputLayout.f e = new b();
    private final TextInputLayout.g f = new c(this);

    /* compiled from: PasswordToggleEndIconDelegate */
    class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            h hVar = h.this;
            hVar.c.setChecked(!hVar.g());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            h hVar = h.this;
            hVar.c.setChecked(!hVar.g());
            editText.removeTextChangedListener(h.this.d);
            editText.addTextChangedListener(h.this.d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class c implements TextInputLayout.g {
        public c(h hVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                EditText editText = h.this.a.getEditText();
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    if (h.this.g()) {
                        editText.setTransformationMethod(null);
                    } else {
                        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    editText.setSelection(selectionEnd);
                    w30.h();
                }
            } finally {
                w30.h();
            }
        }
    }

    public h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean g() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        this.a.setEndIconDrawable(n.d(this.b, qv1.design_password_eye));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(vv1.password_toggle_content_description));
        this.a.setEndIconOnClickListener(new d());
        this.a.e(this.e);
        this.a.f(this.f);
    }
}
