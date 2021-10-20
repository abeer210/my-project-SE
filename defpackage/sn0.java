package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;

/* renamed from: sn0  reason: default package */
/* compiled from: DisplayOrientationDetector */
public abstract class sn0 {
    public static final SparseIntArray e;
    private final OrientationEventListener a;
    public Display b;
    private int c = 0;
    private int d = 0;

    /* renamed from: sn0$a */
    /* compiled from: DisplayOrientationDetector */
    class a extends OrientationEventListener {
        private int a = -1;

        public a(Context context) {
            super(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        public void onOrientationChanged(int i) {
            int i2;
            boolean z;
            int rotation;
            if (i != -1 && sn0.this.b != null) {
                boolean z2 = false;
                if (i <= 315 && i >= 45) {
                    if (i > 45 && i < 135) {
                        i2 = 90;
                        z = true;
                        if (sn0.this.d != i2) {
                        }
                        rotation = sn0.this.b.getRotation();
                        if (this.a == rotation) {
                        }
                        if (!z) {
                        }
                    } else if (i > 135 && i < 225) {
                        i2 = 180;
                        z = true;
                        if (sn0.this.d != i2) {
                        }
                        rotation = sn0.this.b.getRotation();
                        if (this.a == rotation) {
                        }
                        if (!z) {
                        }
                    } else if (i > 225 && i < 315) {
                        i2 = 270;
                        z = true;
                        if (sn0.this.d != i2) {
                            sn0.this.d = i2;
                            z2 = true;
                        }
                        rotation = sn0.this.b.getRotation();
                        if (this.a == rotation) {
                            this.a = rotation;
                        } else {
                            z = z2;
                        }
                        if (!z) {
                            sn0.this.d(sn0.e.get(rotation));
                            return;
                        }
                        return;
                    }
                }
                i2 = 0;
                z = true;
                if (sn0.this.d != i2) {
                }
                rotation = sn0.this.b.getRotation();
                if (this.a == rotation) {
                }
                if (!z) {
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(0, 0);
        e.put(1, 90);
        e.put(2, 180);
        e.put(3, 270);
    }

    public sn0(Context context) {
        this.a = new a(context);
    }

    public void c() {
        this.a.disable();
        this.b = null;
    }

    public void d(int i) {
        this.c = i;
        g(i, this.d);
    }

    public void e(Display display) {
        this.b = display;
        this.a.enable();
        d(e.get(display.getRotation()));
    }

    public int f() {
        return this.c;
    }

    public abstract void g(int i, int i2);
}
