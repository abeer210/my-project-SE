package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: ClearTextEndIconDelegate */
public class a extends e {
    private final TextWatcher d = new C0071a();
    private final TextInputLayout.f e = new b();
    private AnimatorSet f;
    private ValueAnimator g;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* compiled from: ClearTextEndIconDelegate */
    class C0071a implements TextWatcher {
        public C0071a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.a.getSuffixText() == null) {
                a.this.h(a.k(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class b implements TextInputLayout.f {

        /* renamed from: com.google.android.material.textfield.a$b$a  reason: collision with other inner class name */
        /* compiled from: ClearTextEndIconDelegate */
        class View$OnFocusChangeListenerC0072a implements View.OnFocusChangeListener {
            public View$OnFocusChangeListenerC0072a() {
            }

            public void onFocusChange(View view, boolean z) {
                boolean z2 = true;
                boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
                a aVar = a.this;
                if (!z3 || !z) {
                    z2 = false;
                }
                aVar.h(z2);
            }
        }

        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.k(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC0072a());
            editText.removeTextChangedListener(a.this.d);
            editText.addTextChangedListener(a.this.d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                a.this.a.getEditText().setText((CharSequence) null);
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        public void onAnimationStart(Animator animator) {
            a.this.a.setEndIconVisible(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate */
    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.a.setEndIconVisible(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.c.setScaleX(floatValue);
            a.this.c.setScaleY(floatValue);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h(boolean z) {
        boolean z2 = this.a.J() == z;
        if (z) {
            this.g.cancel();
            this.f.start();
            if (z2) {
                this.f.end();
                return;
            }
            return;
        }
        this.f.cancel();
        this.g.start();
        if (z2) {
            this.g.end();
        }
    }

    private ValueAnimator i(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(yv1.a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }

    private ValueAnimator j() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(yv1.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new g());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static boolean k(Editable editable) {
        return editable.length() > 0;
    }

    private void l() {
        ValueAnimator j = j();
        ValueAnimator i = i(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f = animatorSet;
        animatorSet.playTogether(j, i);
        this.f.addListener(new d());
        ValueAnimator i2 = i(1.0f, 0.0f);
        this.g = i2;
        i2.addListener(new e());
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        this.a.setEndIconDrawable(n.d(this.b, qv1.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(vv1.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new c());
        this.a.e(this.e);
        l();
    }

    @Override // com.google.android.material.textfield.e
    public void c(boolean z) {
        if (this.a.getSuffixText() != null) {
            h(z);
        }
    }
}
