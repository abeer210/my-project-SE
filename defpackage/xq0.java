package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.f;
import defpackage.zq0;
import java.util.LinkedList;

/* renamed from: xq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class xq0<T extends zq0> {
    private T a;
    private Bundle b;
    private LinkedList<a> c;
    private final br0<T> d = new cr0(this);

    /* access modifiers changed from: private */
    /* renamed from: xq0$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface a {
        void a(zq0 zq0);

        int getState();
    }

    public static void g(FrameLayout frameLayout) {
        yo0 q = yo0.q();
        Context context = frameLayout.getContext();
        int i = q.i(context);
        String d2 = f.d(context, i);
        String c2 = f.c(context, i);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d2);
        linearLayout.addView(textView);
        Intent d3 = q.d(context, i, null);
        if (d3 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c2);
            linearLayout.addView(button);
            button.setOnClickListener(new er0(context, d3));
        }
    }

    private final void k(Bundle bundle, a aVar) {
        T t = this.a;
        if (t != null) {
            aVar.a(t);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.d);
    }

    private final void m(int i) {
        while (!this.c.isEmpty() && this.c.getLast().getState() >= i) {
            this.c.removeLast();
        }
    }

    public abstract void a(br0<T> br0);

    public T b() {
        return this.a;
    }

    public void c(Bundle bundle) {
        k(bundle, new dr0(this, bundle));
    }

    public void d() {
        T t = this.a;
        if (t != null) {
            t.onDestroy();
        } else {
            m(1);
        }
    }

    public void e() {
        T t = this.a;
        if (t != null) {
            t.onPause();
        } else {
            m(5);
        }
    }

    public void f() {
        k(null, new fr0(this));
    }
}
