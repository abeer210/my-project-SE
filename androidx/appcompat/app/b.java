package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog */
public class b extends g implements DialogInterface {
    public final AlertController c = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {
        private final AlertController.f a;
        private final int b;

        public a(Context context) {
            this(context, b.i(context, 0));
        }

        public b a() {
            b bVar = new b(this.a.a, this.b);
            this.a.a(bVar.c);
            bVar.setCancelable(this.a.r);
            if (this.a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.a.s);
            bVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.a.r = z;
            return this;
        }

        public a e(View view) {
            this.a.g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a k(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a l(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a m(View view) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, b.i(context, i)));
            this.b = i;
        }
    }

    public b(Context context, int i) {
        super(context, i(context, i));
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView g() {
        return this.c.d();
    }

    @Override // androidx.appcompat.app.g
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.c.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.c.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog, androidx.appcompat.app.g
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.c.q(charSequence);
    }
}
