package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper */
public class f {
    private final TextPaint a = new TextPaint(1);
    private final gx1 b = new a();
    private float c;
    private boolean d = true;
    private WeakReference<b> e = new WeakReference<>(null);
    private ex1 f;

    /* compiled from: TextDrawableHelper */
    class a extends gx1 {
        public a() {
        }

        @Override // defpackage.gx1
        public void a(int i) {
            f.this.d = true;
            b bVar = (b) f.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.gx1
        public void b(Typeface typeface, boolean z) {
            if (!z) {
                f.this.d = true;
                b bVar = (b) f.this.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: TextDrawableHelper */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public f(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public ex1 d() {
        return this.f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.c;
        }
        float c2 = c(str);
        this.c = c2;
        this.d = false;
        return c2;
    }

    public void g(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void h(ex1 ex1, Context context) {
        if (this.f != ex1) {
            this.f = ex1;
            if (ex1 != null) {
                ex1.j(context, this.a, this.b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                ex1.i(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.d = z;
    }

    public void j(Context context) {
        this.f.i(context, this.a, this.b);
    }
}
