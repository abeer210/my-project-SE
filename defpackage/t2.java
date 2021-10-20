package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: t2  reason: default package */
/* compiled from: GestureDetectorCompat */
public final class t2 {
    private final a a;

    /* access modifiers changed from: package-private */
    /* renamed from: t2$a */
    /* compiled from: GestureDetectorCompat */
    public interface a {
        boolean a(MotionEvent motionEvent);

        void b(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    /* renamed from: t2$b */
    /* compiled from: GestureDetectorCompat */
    static class b implements a {
        private static final int v = ViewConfiguration.getLongPressTimeout();
        private static final int w = ViewConfiguration.getTapTimeout();
        private static final int x = ViewConfiguration.getDoubleTapTimeout();
        private int a;
        private int b;
        private int c;
        private int d;
        private final Handler e;
        public final GestureDetector.OnGestureListener f;
        public GestureDetector.OnDoubleTapListener g;
        public boolean h;
        public boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        public MotionEvent m;
        private MotionEvent n;
        private boolean o;
        private float p;
        private float q;
        private float r;
        private float s;
        private boolean t;
        private VelocityTracker u;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.e = new a(handler);
            } else {
                this.e = new a();
            }
            this.f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                b((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            f(context);
        }

        private void c() {
            this.e.removeMessages(1);
            this.e.removeMessages(2);
            this.e.removeMessages(3);
            this.u.recycle();
            this.u = null;
            this.o = false;
            this.h = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }

        private void d() {
            this.e.removeMessages(1);
            this.e.removeMessages(2);
            this.e.removeMessages(3);
            this.o = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }

        private void f(Context context) {
            if (context == null) {
                throw new IllegalArgumentException(C0201.m82(7618));
            } else if (this.f != null) {
                this.t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.a = scaledTouchSlop * scaledTouchSlop;
                this.b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException(C0201.m82(7617));
            }
        }

        private boolean g(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) x)) {
                return false;
            }
            int x2 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x2 * x2) + (y * y) < this.b) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        @Override // defpackage.t2.a
        public boolean a(MotionEvent motionEvent) {
            boolean z;
            MotionEvent motionEvent2;
            MotionEvent motionEvent3;
            boolean z2;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.u == null) {
                this.u = VelocityTracker.obtain();
            }
            this.u.addMovement(motionEvent);
            int i2 = action & 255;
            boolean z3 = i2 == 6;
            int actionIndex = z3 ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    f2 += motionEvent.getX(i3);
                    f3 += motionEvent.getY(i3);
                }
            }
            float f4 = (float) (z3 ? pointerCount - 1 : pointerCount);
            float f5 = f2 / f4;
            float f6 = f3 / f4;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.h = false;
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    if (this.o) {
                        z2 = this.g.onDoubleTapEvent(motionEvent) | false;
                    } else {
                        if (this.j) {
                            this.e.removeMessages(3);
                            this.j = false;
                        } else if (this.k) {
                            boolean onSingleTapUp = this.f.onSingleTapUp(motionEvent);
                            if (this.i && (onDoubleTapListener = this.g) != null) {
                                onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                            }
                            z2 = onSingleTapUp;
                        } else {
                            VelocityTracker velocityTracker = this.u;
                            int pointerId = motionEvent.getPointerId(0);
                            velocityTracker.computeCurrentVelocity(C0188.f18, (float) this.d);
                            float yVelocity = velocityTracker.getYVelocity(pointerId);
                            float xVelocity = velocityTracker.getXVelocity(pointerId);
                            if (Math.abs(yVelocity) > ((float) this.c) || Math.abs(xVelocity) > ((float) this.c)) {
                                z2 = this.f.onFling(this.m, motionEvent, xVelocity, yVelocity);
                            }
                        }
                        z2 = false;
                    }
                    MotionEvent motionEvent4 = this.n;
                    if (motionEvent4 != null) {
                        motionEvent4.recycle();
                    }
                    this.n = obtain;
                    VelocityTracker velocityTracker2 = this.u;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.u = null;
                    }
                    this.o = false;
                    this.i = false;
                    this.e.removeMessages(1);
                    this.e.removeMessages(2);
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        c();
                        return false;
                    } else if (i2 == 5) {
                        this.p = f5;
                        this.r = f5;
                        this.q = f6;
                        this.s = f6;
                        d();
                        return false;
                    } else if (i2 != 6) {
                        return false;
                    } else {
                        this.p = f5;
                        this.r = f5;
                        this.q = f6;
                        this.s = f6;
                        this.u.computeCurrentVelocity(C0188.f18, (float) this.d);
                        int actionIndex2 = motionEvent.getActionIndex();
                        int pointerId2 = motionEvent.getPointerId(actionIndex2);
                        float xVelocity2 = this.u.getXVelocity(pointerId2);
                        float yVelocity2 = this.u.getYVelocity(pointerId2);
                        for (int i4 = 0; i4 < pointerCount; i4++) {
                            if (i4 != actionIndex2) {
                                int pointerId3 = motionEvent.getPointerId(i4);
                                if ((this.u.getXVelocity(pointerId3) * xVelocity2) + (this.u.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                    this.u.clear();
                                    return false;
                                }
                            }
                        }
                        return false;
                    }
                } else if (this.j) {
                    return false;
                } else {
                    float f7 = this.p - f5;
                    float f8 = this.q - f6;
                    if (this.o) {
                        return false | this.g.onDoubleTapEvent(motionEvent);
                    }
                    if (this.k) {
                        int i5 = (int) (f5 - this.r);
                        int i6 = (int) (f6 - this.s);
                        int i7 = (i5 * i5) + (i6 * i6);
                        if (i7 > this.a) {
                            z2 = this.f.onScroll(this.m, motionEvent, f7, f8);
                            this.p = f5;
                            this.q = f6;
                            this.k = false;
                            this.e.removeMessages(3);
                            this.e.removeMessages(1);
                            this.e.removeMessages(2);
                        } else {
                            z2 = false;
                        }
                        if (i7 > this.a) {
                            this.l = false;
                        }
                    } else if (Math.abs(f7) < 1.0f && Math.abs(f8) < 1.0f) {
                        return false;
                    } else {
                        boolean onScroll = this.f.onScroll(this.m, motionEvent, f7, f8);
                        this.p = f5;
                        this.q = f6;
                        return onScroll;
                    }
                }
                return z2;
            }
            if (this.g != null) {
                boolean hasMessages = this.e.hasMessages(3);
                if (hasMessages) {
                    this.e.removeMessages(3);
                }
                MotionEvent motionEvent5 = this.m;
                if (motionEvent5 == null || (motionEvent3 = this.n) == null || !hasMessages || !g(motionEvent5, motionEvent3, motionEvent)) {
                    this.e.sendEmptyMessageDelayed(3, (long) x);
                } else {
                    this.o = true;
                    z = this.g.onDoubleTap(this.m) | false | this.g.onDoubleTapEvent(motionEvent);
                    this.p = f5;
                    this.r = f5;
                    this.q = f6;
                    this.s = f6;
                    motionEvent2 = this.m;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.m = MotionEvent.obtain(motionEvent);
                    this.k = true;
                    this.l = true;
                    this.h = true;
                    this.j = false;
                    this.i = false;
                    if (this.t) {
                        this.e.removeMessages(2);
                        this.e.sendEmptyMessageAtTime(2, this.m.getDownTime() + ((long) w) + ((long) v));
                    }
                    this.e.sendEmptyMessageAtTime(1, this.m.getDownTime() + ((long) w));
                    return z | this.f.onDown(motionEvent);
                }
            }
            z = false;
            this.p = f5;
            this.r = f5;
            this.q = f6;
            this.s = f6;
            motionEvent2 = this.m;
            if (motionEvent2 != null) {
            }
            this.m = MotionEvent.obtain(motionEvent);
            this.k = true;
            this.l = true;
            this.h = true;
            this.j = false;
            this.i = false;
            if (this.t) {
            }
            this.e.sendEmptyMessageAtTime(1, this.m.getDownTime() + ((long) w));
            return z | this.f.onDown(motionEvent);
        }

        @Override // defpackage.t2.a
        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.g = onDoubleTapListener;
        }

        public void e() {
            this.e.removeMessages(3);
            this.i = false;
            this.j = true;
            this.f.onLongPress(this.m);
        }

        /* renamed from: t2$b$a */
        /* compiled from: GestureDetectorCompat */
        private class a extends Handler {
            public a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    b bVar = b.this;
                    bVar.f.onShowPress(bVar.m);
                } else if (i == 2) {
                    b.this.e();
                } else if (i == 3) {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.m);
                    } else {
                        bVar2.i = true;
                    }
                } else {
                    throw new RuntimeException(C0201.m82(9421) + message);
                }
            }

            public a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* renamed from: t2$c */
    /* compiled from: GestureDetectorCompat */
    static class c implements a {
        private final GestureDetector a;

        public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // defpackage.t2.a
        public boolean a(MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }

        @Override // defpackage.t2.a
        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public t2(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }

    public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.a.b(onDoubleTapListener);
    }

    public t2(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.a = new c(context, onGestureListener, handler);
        } else {
            this.a = new b(context, onGestureListener, handler);
        }
    }
}
