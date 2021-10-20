package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.g;
import com.facebook.react.uimanager.events.i;
import vigqyno.C0201;

/* compiled from: JSTouchDispatcher */
public class h {
    private int a = -1;
    private final float[] b = new float[2];
    private boolean c = false;
    private long d = Long.MIN_VALUE;
    private final ViewGroup e;
    private final com.facebook.react.uimanager.events.h f = new com.facebook.react.uimanager.events.h();

    public h(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    private void a(MotionEvent motionEvent, d dVar) {
        if (this.a == -1) {
            f60.A(C0201.m82(22466), C0201.m82(22467));
            return;
        }
        yh0.b(!this.c, C0201.m82(22468));
        yh0.c(dVar);
        int i = this.a;
        i iVar = i.CANCEL;
        long j = this.d;
        float[] fArr = this.b;
        dVar.v(g.q(i, iVar, motionEvent, j, fArr[0], fArr[1], this.f));
    }

    private int b(MotionEvent motionEvent) {
        return l0.b(motionEvent.getX(), motionEvent.getY(), this.e, this.b, null);
    }

    public void c(MotionEvent motionEvent, d dVar) {
        int action = motionEvent.getAction() & 255;
        String r3 = C0201.m82(22469);
        if (action == 0) {
            if (this.a != -1) {
                f60.i(r3, C0201.m82(22470));
            }
            this.c = false;
            this.d = motionEvent.getEventTime();
            int b2 = b(motionEvent);
            this.a = b2;
            i iVar = i.START;
            long j = this.d;
            float[] fArr = this.b;
            dVar.v(g.q(b2, iVar, motionEvent, j, fArr[0], fArr[1], this.f));
        } else if (!this.c) {
            int i = this.a;
            if (i == -1) {
                f60.i(r3, C0201.m82(22471));
            } else if (action == 1) {
                b(motionEvent);
                int i2 = this.a;
                i iVar2 = i.END;
                long j2 = this.d;
                float[] fArr2 = this.b;
                dVar.v(g.q(i2, iVar2, motionEvent, j2, fArr2[0], fArr2[1], this.f));
                this.a = -1;
                this.d = Long.MIN_VALUE;
            } else if (action == 2) {
                b(motionEvent);
                int i3 = this.a;
                i iVar3 = i.MOVE;
                long j3 = this.d;
                float[] fArr3 = this.b;
                dVar.v(g.q(i3, iVar3, motionEvent, j3, fArr3[0], fArr3[1], this.f));
            } else if (action == 5) {
                i iVar4 = i.START;
                long j4 = this.d;
                float[] fArr4 = this.b;
                dVar.v(g.q(i, iVar4, motionEvent, j4, fArr4[0], fArr4[1], this.f));
            } else if (action == 6) {
                i iVar5 = i.END;
                long j5 = this.d;
                float[] fArr5 = this.b;
                dVar.v(g.q(i, iVar5, motionEvent, j5, fArr5[0], fArr5[1], this.f));
            } else if (action == 3) {
                if (this.f.c(motionEvent.getDownTime())) {
                    a(motionEvent, dVar);
                } else {
                    f60.i(r3, C0201.m82(22472));
                }
                this.a = -1;
                this.d = Long.MIN_VALUE;
            } else {
                f60.A(r3, C0201.m82(22473) + action + C0201.m82(22474) + this.a);
            }
        }
    }

    public void d(MotionEvent motionEvent, d dVar) {
        if (!this.c) {
            a(motionEvent, dVar);
            this.c = true;
            this.a = -1;
        }
    }
}
