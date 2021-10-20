package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

@zh0
public abstract class YogaNodeJNIBase extends p implements Cloneable {
    private YogaNodeJNIBase a;
    @zh0
    private float[] arr;
    private List<YogaNodeJNIBase> b;
    private m c;
    private b d;
    public long e;
    private Object f;
    private boolean g;
    @zh0
    private int mLayoutDirection;

    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[j.values().length];
            a = iArr;
            iArr[j.LEFT.ordinal()] = 1;
            a[j.TOP.ordinal()] = 2;
            a[j.RIGHT.ordinal()] = 3;
            a[j.BOTTOM.ordinal()] = 4;
            a[j.START.ordinal()] = 5;
            try {
                a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.g = true;
        if (j != 0) {
            this.e = j;
            return;
        }
        throw new IllegalStateException(C0201.m82(1401));
    }

    @zh0
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.b;
        if (list != null) {
            list.remove(i);
            this.b.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.a = this;
            return yogaNodeJNIBase.e;
        }
        throw new IllegalStateException(C0201.m82(1402));
    }

    private static v w0(long j) {
        return new v(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    @Override // com.facebook.yoga.p
    public void B(b bVar) {
        this.d = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.e, bVar != null);
    }

    @Override // com.facebook.yoga.p
    public void C(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.e, jVar.d(), f2);
    }

    @Override // com.facebook.yoga.p
    public void D(Object obj) {
        this.f = obj;
    }

    @Override // com.facebook.yoga.p
    public void F(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.e, hVar.d());
    }

    @Override // com.facebook.yoga.p
    public void G(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.e, iVar.b());
    }

    @Override // com.facebook.yoga.p
    public void I(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void J(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void K() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.e);
    }

    @Override // com.facebook.yoga.p
    public void L(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void M(k kVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.e, kVar.b());
    }

    @Override // com.facebook.yoga.p
    public void N(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void O(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void P(float f2) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void Q() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.e);
    }

    @Override // com.facebook.yoga.p
    public void R(float f2) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void S(l lVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.e, lVar.b());
    }

    @Override // com.facebook.yoga.p
    public void T(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.e, jVar.d(), f2);
    }

    @Override // com.facebook.yoga.p
    public void U(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.e, jVar.d());
    }

    @Override // com.facebook.yoga.p
    public void V(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.e, jVar.d(), f2);
    }

    @Override // com.facebook.yoga.p
    public void W(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void X(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void Y(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void Z(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public void a(p pVar, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) pVar;
        if (yogaNodeJNIBase.a == null) {
            if (this.b == null) {
                this.b = new ArrayList(4);
            }
            this.b.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.a = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.e, yogaNodeJNIBase.e, i);
            return;
        }
        throw new IllegalStateException(C0201.m82(1403));
    }

    @Override // com.facebook.yoga.p
    public void a0(m mVar) {
        this.c = mVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.e, mVar != null);
    }

    @Override // com.facebook.yoga.p
    public void b(float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i)).b;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].e;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.e, f2, f3, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.p
    public void b0(float f2) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.e, f2);
    }

    @zh0
    public final float baseline(float f2, float f3) {
        return this.d.a(this, f2, f3);
    }

    @Override // com.facebook.yoga.p
    public void c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.e);
    }

    @Override // com.facebook.yoga.p
    public void c0(float f2) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public v d() {
        return w0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.e));
    }

    @Override // com.facebook.yoga.p
    public void d0(float f2) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public h e() {
        float[] fArr = this.arr;
        return h.b(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.p
    public void e0(float f2) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public float f() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void f0(s sVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.e, sVar.b());
    }

    @Override // com.facebook.yoga.p
    public float g(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        if ((((int) fArr[0]) & 2) != 2) {
            return 0.0f;
        }
        if ((((int) fArr[0]) & 1) != 1) {
            i = 4;
        }
        int i2 = 10 - i;
        switch (a.a[jVar.ordinal()]) {
            case 1:
                return this.arr[i2];
            case 2:
                return this.arr[i2 + 1];
            case 3:
                return this.arr[i2 + 2];
            case 4:
                return this.arr[i2 + 3];
            case 5:
                return e() == h.RTL ? this.arr[i2 + 2] : this.arr[i2];
            case 6:
                return e() == h.RTL ? this.arr[i2] : this.arr[i2 + 2];
            default:
                throw new IllegalArgumentException(C0201.m82(1404));
        }
    }

    @Override // com.facebook.yoga.p
    public void h0(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.e, jVar.d(), f2);
    }

    @Override // com.facebook.yoga.p
    public float i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void i0(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.e, jVar.d(), f2);
    }

    @Override // com.facebook.yoga.p
    public float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void j0(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.e, jVar.d(), f2);
    }

    @Override // com.facebook.yoga.p
    public float l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void l0(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.e, jVar.d(), f2);
    }

    @Override // com.facebook.yoga.p
    public v m(j jVar) {
        return w0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.e, jVar.d()));
    }

    @Override // com.facebook.yoga.p
    public void m0(t tVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.e, tVar.b());
    }

    @zh0
    public final long measure(float f2, int i, float f3, int i2) {
        if (s()) {
            return this.c.a(this, f2, n.b(i), f3, n.b(i2));
        }
        throw new RuntimeException(C0201.m82(1405));
    }

    @Override // com.facebook.yoga.p
    public v n() {
        return w0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.e));
    }

    @Override // com.facebook.yoga.p
    public void n0(float f2) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public boolean o() {
        float[] fArr = this.arr;
        if (fArr == null) {
            return this.g;
        }
        if ((((int) fArr[0]) & 16) == 16) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.yoga.p
    public void o0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.e);
    }

    @Override // com.facebook.yoga.p
    public void p0(float f2) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.e, f2);
    }

    @Override // com.facebook.yoga.p
    public boolean q() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.e);
    }

    @Override // com.facebook.yoga.p
    public void r0(w wVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.e, wVar.b());
    }

    @Override // com.facebook.yoga.p
    public boolean s() {
        return this.c != null;
    }

    @Override // com.facebook.yoga.p
    public void t() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = (float) (((int) fArr[0]) & -17);
        }
        this.g = false;
    }

    @Override // com.facebook.yoga.p
    public void v() {
        this.c = null;
        this.d = null;
        this.arr = null;
        this.g = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.e);
    }

    /* renamed from: v0 */
    public YogaNodeJNIBase u(int i) {
        List<YogaNodeJNIBase> list = this.b;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i);
            remove.a = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.e, remove.e);
            return remove;
        }
        throw new IllegalStateException(C0201.m82(1406));
    }

    @Override // com.facebook.yoga.p
    public void w(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.e, aVar.b());
    }

    @Override // com.facebook.yoga.p
    public void x(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.e, aVar.b());
    }

    @Override // com.facebook.yoga.p
    public void y(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.e, aVar.b());
    }

    @Override // com.facebook.yoga.p
    public void z(float f2) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.e, f2);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    public YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).a));
    }
}
