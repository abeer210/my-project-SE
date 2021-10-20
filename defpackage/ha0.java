package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: ha0  reason: default package */
/* compiled from: GestureDetector */
public class ha0 {
    public a a;
    public final float b;
    public boolean c;
    public boolean d;
    public long e;
    public float f;
    public float g;

    /* renamed from: ha0$a */
    /* compiled from: GestureDetector */
    public interface a {
        boolean d();
    }

    public ha0(Context context) {
        this.b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static ha0 c(Context context) {
        return new ha0(context);
    }

    public void a() {
        this.a = null;
        e();
    }

    public boolean b() {
        return this.c;
    }

    public boolean d(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c = true;
            this.d = true;
            this.e = motionEvent.getEventTime();
            this.f = motionEvent.getX();
            this.g = motionEvent.getY();
        } else if (action == 1) {
            this.c = false;
            if (Math.abs(motionEvent.getX() - this.f) > this.b || Math.abs(motionEvent.getY() - this.g) > this.b) {
                this.d = false;
            }
            if (this.d && motionEvent.getEventTime() - this.e <= ((long) ViewConfiguration.getLongPressTimeout()) && (aVar = this.a) != null) {
                aVar.d();
            }
            this.d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.c = false;
                this.d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f) > this.b || Math.abs(motionEvent.getY() - this.g) > this.b) {
            this.d = false;
        }
        return true;
    }

    public void e() {
        this.c = false;
        this.d = false;
    }

    public void f(a aVar) {
        this.a = aVar;
    }
}
