package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;
import vigqyno.C0201;

/* compiled from: FpsDebugFrameCallback */
public class b extends a.AbstractC0040a {
    private com.facebook.react.modules.core.a b;
    private final ReactContext c;
    private final UIManagerModule d;
    private final a e;
    private boolean f = false;
    private long g = -1;
    private long h = -1;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private boolean m = false;
    private TreeMap<Long, C0044b> n;

    /* access modifiers changed from: package-private */
    /* compiled from: FpsDebugFrameCallback */
    public class a implements Runnable {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public void run() {
            b.this.b = com.facebook.react.modules.core.a.d();
            b.this.b.e(this.a);
        }
    }

    /* renamed from: com.facebook.react.modules.debug.b$b  reason: collision with other inner class name */
    /* compiled from: FpsDebugFrameCallback */
    public static class C0044b {
        public final int a;
        public final int b;
        public final int c;
        public final double d;
        public final double e;
        public final int f;

        public C0044b(int i, int i2, int i3, int i4, double d2, double d3, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = d2;
            this.e = d3;
            this.f = i5;
        }
    }

    public b(ReactContext reactContext) {
        this.c = reactContext;
        this.d = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.e = new a();
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0040a
    public void a(long j2) {
        if (!this.f) {
            if (this.g == -1) {
                this.g = j2;
            }
            long j3 = this.h;
            this.h = j2;
            if (this.e.e(j3, j2)) {
                this.l++;
            }
            this.i++;
            int e2 = e();
            if ((e2 - this.j) - 1 >= 4) {
                this.k++;
            }
            if (this.m) {
                yh0.c(this.n);
                this.n.put(Long.valueOf(System.currentTimeMillis()), new C0044b(i(), j(), e2, this.k, f(), h(), k()));
            }
            this.j = e2;
            com.facebook.react.modules.core.a aVar = this.b;
            if (aVar != null) {
                aVar.e(this);
            }
        }
    }

    public int e() {
        double k2 = (double) k();
        Double.isNaN(k2);
        return (int) ((k2 / 16.9d) + 1.0d);
    }

    public double f() {
        if (this.h == this.g) {
            return 0.0d;
        }
        double i2 = (double) i();
        Double.isNaN(i2);
        double d2 = (double) (this.h - this.g);
        Double.isNaN(d2);
        return (i2 * 1.0E9d) / d2;
    }

    public C0044b g(long j2) {
        yh0.d(this.n, C0201.m82(1742));
        Map.Entry<Long, C0044b> floorEntry = this.n.floorEntry(Long.valueOf(j2));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }

    public double h() {
        if (this.h == this.g) {
            return 0.0d;
        }
        double j2 = (double) j();
        Double.isNaN(j2);
        double d2 = (double) (this.h - this.g);
        Double.isNaN(d2);
        return (j2 * 1.0E9d) / d2;
    }

    public int i() {
        return this.i - 1;
    }

    public int j() {
        return this.l - 1;
    }

    public int k() {
        double d2 = (double) this.h;
        double d3 = (double) this.g;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return ((int) (d2 - d3)) / 1000000;
    }

    public void l() {
        this.f = false;
        this.c.getCatalystInstance().addBridgeIdleDebugListener(this.e);
        this.d.setViewHierarchyUpdateDebugListener(this.e);
        UiThreadUtil.runOnUiThread(new a(this));
    }

    public void m() {
        this.n = new TreeMap<>();
        this.m = true;
        l();
    }

    public void n() {
        this.f = true;
        this.c.getCatalystInstance().removeBridgeIdleDebugListener(this.e);
        this.d.setViewHierarchyUpdateDebugListener(null);
    }
}
