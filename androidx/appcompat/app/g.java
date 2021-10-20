package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.v2;
import defpackage.w;

/* compiled from: AppCompatDialog */
public class g extends Dialog implements d {
    private e a;
    private final v2.a b = new a();

    /* compiled from: AppCompatDialog */
    class a implements v2.a {
        public a() {
        }

        @Override // defpackage.v2.a
        public boolean j(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i) {
        super(context, b(context, i));
        e a2 = a();
        a2.E(b(context, i));
        a2.q(null);
    }

    private static int b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.a == null) {
            this.a = e.f(this, this);
        }
        return this.a;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i) {
        return a().y(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v2.e(this.b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public void e(w wVar) {
    }

    @Override // androidx.appcompat.app.d
    public void f(w wVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().g(i);
    }

    @Override // androidx.appcompat.app.d
    public w h(w.a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        a().m();
    }

    public void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().q(bundle);
    }

    public void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().A(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().F(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().F(getContext().getString(i));
    }
}
