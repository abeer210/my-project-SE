package com.facebook.react.uimanager;

import com.facebook.yoga.a;
import com.facebook.yoga.b;
import com.facebook.yoga.c;
import com.facebook.yoga.g;
import com.facebook.yoga.h;
import com.facebook.yoga.i;
import com.facebook.yoga.j;
import com.facebook.yoga.k;
import com.facebook.yoga.l;
import com.facebook.yoga.m;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.s;
import com.facebook.yoga.t;
import com.facebook.yoga.v;
import com.facebook.yoga.w;
import java.util.ArrayList;
import java.util.Arrays;
import vigqyno.C0201;

/* compiled from: ReactShadowNodeImpl */
public class b0 implements a0<b0> {
    private static final c sYogaConfig = d0.a();
    private ArrayList<b0> mChildren;
    private final i0 mDefaultPadding = new i0(0.0f);
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    private b0 mLayoutParent;
    private ArrayList<b0> mNativeChildren;
    private b0 mNativeParent;
    private boolean mNodeUpdated = true;
    private final float[] mPadding = new float[9];
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private b0 mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private k0 mThemedContext;
    private int mTotalNativeChildren = 0;
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private p mYogaNode;

    public b0() {
        if (!isVirtual()) {
            p b = d1.a().b();
            b = b == null ? q.a(sYogaConfig) : b;
            this.mYogaNode = b;
            b.D(this);
            Arrays.fill(this.mPadding, Float.NaN);
            return;
        }
        this.mYogaNode = null;
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(C0201.m82(14408));
        }
        sb.append(C0201.m82(14409));
        sb.append(getClass().getSimpleName());
        sb.append(C0201.m82(14410));
        sb.append(getViewClass());
        sb.append(C0201.m82(14411));
        sb.append(getReactTag());
        if (this.mYogaNode != null) {
            sb.append(C0201.m82(14412));
            sb.append(getScreenX());
            sb.append(C0201.m82(14413));
            sb.append(getScreenY());
            sb.append(C0201.m82(14414));
            sb.append(getLayoutWidth());
            sb.append(C0201.m82(14415));
            sb.append(getLayoutHeight());
            sb.append(C0201.m82(14416));
        } else {
            sb.append(C0201.m82(14417));
        }
        sb.append(C0201.m82(14418));
        if (getChildCount() != 0) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                getChildAt(i3).getHierarchyInfoWithIndentation(sb, i + 1);
            }
        }
    }

    private int getTotalNativeNodeContributionToParent() {
        l nativeKind = getNativeKind();
        if (nativeKind == l.NONE) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind == l.LEAF) {
            return 1 + this.mTotalNativeChildren;
        }
        return 1;
    }

    private void updateNativeChildrenCountInParent(int i) {
        if (getNativeKind() != l.PARENT) {
            for (b0 parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i;
                if (parent.getNativeKind() == l.PARENT) {
                    return;
                }
            }
        }
    }

    private void updatePadding() {
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 5) {
                if (g.a(this.mPadding[i]) && g.a(this.mPadding[6]) && g.a(this.mPadding[8])) {
                    this.mYogaNode.h0(j.b(i), this.mDefaultPadding.b(i));
                }
            } else if (i == 1 || i == 3) {
                if (g.a(this.mPadding[i]) && g.a(this.mPadding[7]) && g.a(this.mPadding[8])) {
                    this.mYogaNode.h0(j.b(i), this.mDefaultPadding.b(i));
                }
            } else if (g.a(this.mPadding[i])) {
                this.mYogaNode.h0(j.b(i), this.mDefaultPadding.b(i));
            }
            if (this.mPaddingIsPercent[i]) {
                this.mYogaNode.i0(j.b(i), this.mPadding[i]);
            } else {
                this.mYogaNode.h0(j.b(i), this.mPadding[i]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.a0
    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.a0
    public Iterable<? extends a0> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // com.facebook.react.uimanager.a0
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.c();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // com.facebook.react.uimanager.a0
    public boolean dispatchUpdates(float f, float f2, v0 v0Var, n nVar) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(v0Var);
        }
        boolean z = false;
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f3 = f + layoutX;
            int round = Math.round(f3);
            float f4 = f2 + layoutY;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + getLayoutWidth());
            int round4 = Math.round(f4 + getLayoutHeight());
            int round5 = Math.round(layoutX);
            int round6 = Math.round(layoutY);
            int i = round3 - round;
            int i2 = round4 - round2;
            if (!(round5 == this.mScreenX && round6 == this.mScreenY && i == this.mScreenWidth && i2 == this.mScreenHeight)) {
                z = true;
            }
            this.mScreenX = round5;
            this.mScreenY = round6;
            this.mScreenWidth = i;
            this.mScreenHeight = i2;
            if (z) {
                if (nVar != null) {
                    nVar.l(this);
                } else {
                    v0Var.S(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight());
                }
            }
        }
        return z;
    }

    @Override // com.facebook.react.uimanager.a0
    public void dispose() {
        p pVar = this.mYogaNode;
        if (pVar != null) {
            pVar.v();
            d1.a().a(this.mYogaNode);
        }
    }

    @Override // com.facebook.react.uimanager.a0
    public final int getChildCount() {
        ArrayList<b0> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.a0
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    public String getHierarchyInfo() {
        StringBuilder sb = new StringBuilder();
        getHierarchyInfoWithIndentation(sb, 0);
        return sb.toString();
    }

    public final h getLayoutDirection() {
        return this.mYogaNode.e();
    }

    @Override // com.facebook.react.uimanager.a0
    public final float getLayoutHeight() {
        return this.mYogaNode.f();
    }

    @Override // com.facebook.react.uimanager.a0
    public final float getLayoutWidth() {
        return this.mYogaNode.i();
    }

    @Override // com.facebook.react.uimanager.a0
    public final float getLayoutX() {
        return this.mYogaNode.j();
    }

    @Override // com.facebook.react.uimanager.a0
    public final float getLayoutY() {
        return this.mYogaNode.l();
    }

    @Override // com.facebook.react.uimanager.a0
    public final int getNativeChildCount() {
        ArrayList<b0> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.a0
    public l getNativeKind() {
        if (isVirtual() || isLayoutOnly()) {
            return l.NONE;
        }
        return hoistNativeChildren() ? l.LEAF : l.PARENT;
    }

    public final float getPadding(int i) {
        return this.mYogaNode.g(j.b(i));
    }

    @Override // com.facebook.react.uimanager.a0
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.a0
    public final int getRootTag() {
        yh0.a(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.a0
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.a0
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.a0
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.a0
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.a0
    public final v getStyleHeight() {
        return this.mYogaNode.d();
    }

    public final v getStylePadding(int i) {
        return this.mYogaNode.m(j.b(i));
    }

    @Override // com.facebook.react.uimanager.a0
    public final v getStyleWidth() {
        return this.mYogaNode.n();
    }

    @Override // com.facebook.react.uimanager.a0
    public final k0 getThemedContext() {
        k0 k0Var = this.mThemedContext;
        yh0.c(k0Var);
        return k0Var;
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.a0
    public final String getViewClass() {
        String str = this.mViewClassName;
        yh0.c(str);
        return str;
    }

    @Override // com.facebook.react.uimanager.a0
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    public final boolean hasNewLayout() {
        p pVar = this.mYogaNode;
        return pVar != null && pVar.o();
    }

    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.a0
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    public boolean hoistNativeChildren() {
        return false;
    }

    public final boolean isDirty() {
        p pVar = this.mYogaNode;
        return pVar != null && pVar.q();
    }

    @Override // com.facebook.react.uimanager.a0
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    public boolean isMeasureDefined() {
        return this.mYogaNode.s();
    }

    @Override // com.facebook.react.uimanager.a0
    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    public final void markLayoutSeen() {
        p pVar = this.mYogaNode;
        if (pVar != null) {
            pVar.t();
        }
    }

    @Override // com.facebook.react.uimanager.a0
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public void markUpdated() {
        if (!this.mNodeUpdated) {
            this.mNodeUpdated = true;
            b0 parent = getParent();
            if (parent != null) {
                parent.markUpdated();
            }
        }
    }

    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.a0
    public void onBeforeLayout(n nVar) {
    }

    public void onCollectExtraUpdates(v0 v0Var) {
    }

    @Override // com.facebook.react.uimanager.a0
    public final void removeAllNativeChildren() {
        ArrayList<b0> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.a0
    public void removeAndDisposeAllChildren() {
        if (getChildCount() != 0) {
            int i = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (this.mYogaNode != null && !isYogaLeafNode()) {
                    this.mYogaNode.u(childCount);
                }
                b0 childAt = getChildAt(childCount);
                childAt.mParent = null;
                i += childAt.getTotalNativeNodeContributionToParent();
                childAt.dispose();
            }
            ArrayList<b0> arrayList = this.mChildren;
            yh0.c(arrayList);
            arrayList.clear();
            markUpdated();
            this.mTotalNativeChildren -= i;
            updateNativeChildrenCountInParent(-i);
        }
    }

    public void setAlignContent(a aVar) {
        this.mYogaNode.w(aVar);
    }

    public void setAlignItems(a aVar) {
        this.mYogaNode.x(aVar);
    }

    public void setAlignSelf(a aVar) {
        this.mYogaNode.y(aVar);
    }

    public void setBaselineFunction(b bVar) {
        this.mYogaNode.B(bVar);
    }

    public void setBorder(int i, float f) {
        this.mYogaNode.C(j.b(i), f);
    }

    public void setDefaultPadding(int i, float f) {
        this.mDefaultPadding.d(i, f);
        updatePadding();
    }

    public void setDisplay(i iVar) {
        this.mYogaNode.G(iVar);
    }

    public void setFlex(float f) {
        this.mYogaNode.I(f);
    }

    public void setFlexBasis(float f) {
        this.mYogaNode.J(f);
    }

    public void setFlexBasisAuto() {
        this.mYogaNode.K();
    }

    public void setFlexBasisPercent(float f) {
        this.mYogaNode.L(f);
    }

    public void setFlexDirection(k kVar) {
        this.mYogaNode.M(kVar);
    }

    public void setFlexGrow(float f) {
        this.mYogaNode.N(f);
    }

    public void setFlexShrink(float f) {
        this.mYogaNode.O(f);
    }

    public void setFlexWrap(w wVar) {
        this.mYogaNode.r0(wVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public final void setIsLayoutOnly(boolean z) {
        boolean z2 = true;
        yh0.b(getParent() == null, C0201.m82(14428));
        yh0.b(this.mNativeParent == null, C0201.m82(14429));
        if (getNativeChildCount() != 0) {
            z2 = false;
        }
        yh0.b(z2, C0201.m82(14430));
        this.mIsLayoutOnly = z;
    }

    public void setJustifyContent(l lVar) {
        this.mYogaNode.S(lVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public void setLayoutDirection(h hVar) {
        this.mYogaNode.F(hVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public void setLocalData(Object obj) {
    }

    public void setMargin(int i, float f) {
        this.mYogaNode.T(j.b(i), f);
    }

    public void setMarginAuto(int i) {
        this.mYogaNode.U(j.b(i));
    }

    public void setMarginPercent(int i, float f) {
        this.mYogaNode.V(j.b(i), f);
    }

    public void setMeasureFunction(m mVar) {
        this.mYogaNode.a0(mVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public void setMeasureSpecs(int i, int i2) {
        this.mWidthMeasureSpec = Integer.valueOf(i);
        this.mHeightMeasureSpec = Integer.valueOf(i2);
    }

    public void setOverflow(s sVar) {
        this.mYogaNode.f0(sVar);
    }

    public void setPadding(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = false;
        updatePadding();
    }

    public void setPaddingPercent(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = !g.a(f);
        updatePadding();
    }

    public void setPosition(int i, float f) {
        this.mYogaNode.j0(j.b(i), f);
    }

    public void setPositionPercent(int i, float f) {
        this.mYogaNode.l0(j.b(i), f);
    }

    public void setPositionType(t tVar) {
        this.mYogaNode.m0(tVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public void setReactTag(int i) {
        this.mReactTag = i;
    }

    @Override // com.facebook.react.uimanager.a0
    public final void setRootTag(int i) {
        this.mRootTag = i;
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.mShouldNotifyOnLayout = z;
    }

    public void setStyleAspectRatio(float f) {
        this.mYogaNode.z(f);
    }

    @Override // com.facebook.react.uimanager.a0
    public void setStyleHeight(float f) {
        this.mYogaNode.P(f);
    }

    public void setStyleHeightAuto() {
        this.mYogaNode.Q();
    }

    public void setStyleHeightPercent(float f) {
        this.mYogaNode.R(f);
    }

    public void setStyleMaxHeight(float f) {
        this.mYogaNode.W(f);
    }

    public void setStyleMaxHeightPercent(float f) {
        this.mYogaNode.X(f);
    }

    public void setStyleMaxWidth(float f) {
        this.mYogaNode.Y(f);
    }

    public void setStyleMaxWidthPercent(float f) {
        this.mYogaNode.Z(f);
    }

    public void setStyleMinHeight(float f) {
        this.mYogaNode.b0(f);
    }

    public void setStyleMinHeightPercent(float f) {
        this.mYogaNode.c0(f);
    }

    public void setStyleMinWidth(float f) {
        this.mYogaNode.d0(f);
    }

    public void setStyleMinWidthPercent(float f) {
        this.mYogaNode.e0(f);
    }

    @Override // com.facebook.react.uimanager.a0
    public void setStyleWidth(float f) {
        this.mYogaNode.n0(f);
    }

    public void setStyleWidthAuto() {
        this.mYogaNode.o0();
    }

    public void setStyleWidthPercent(float f) {
        this.mYogaNode.p0(f);
    }

    @Override // com.facebook.react.uimanager.a0
    public void setThemedContext(k0 k0Var) {
        this.mThemedContext = k0Var;
    }

    @Override // com.facebook.react.uimanager.a0
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.a0
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return C0201.m82(14431) + this.mViewClassName + C0201.m82(14432) + getReactTag() + C0201.m82(14433);
    }

    @Override // com.facebook.react.uimanager.a0
    public final void updateProperties(c0 c0Var) {
        z0.f(this, c0Var);
        onAfterUpdateTransaction();
    }

    public void addChildAt(b0 b0Var, int i) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i, b0Var);
        b0Var.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            p pVar = b0Var.mYogaNode;
            if (pVar != null) {
                this.mYogaNode.a(pVar, i);
            } else {
                throw new RuntimeException(C0201.m82(14419) + b0Var.toString() + C0201.m82(14420) + toString() + C0201.m82(14421));
            }
        }
        markUpdated();
        int totalNativeNodeContributionToParent = b0Var.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    public final void addNativeChildAt(b0 b0Var, int i) {
        boolean z = true;
        yh0.a(getNativeKind() == l.PARENT);
        if (b0Var.getNativeKind() == l.NONE) {
            z = false;
        }
        yh0.a(z);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i, b0Var);
        b0Var.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.a0
    public void calculateLayout(float f, float f2) {
        this.mYogaNode.b(f, f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 getChildAt(int i) {
        ArrayList<b0> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException(C0201.m82(14422) + i + C0201.m82(14423));
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 getLayoutParent() {
        b0 b0Var = this.mLayoutParent;
        return b0Var != null ? b0Var : getNativeParent();
    }

    public final int getNativeOffsetForChild(b0 b0Var) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            b0 childAt = getChildAt(i);
            if (b0Var == childAt) {
                z = true;
                break;
            }
            i2 += childAt.getTotalNativeNodeContributionToParent();
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException(C0201.m82(14424) + b0Var.getReactTag() + C0201.m82(14425) + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 getParent() {
        return this.mParent;
    }

    public final int indexOf(b0 b0Var) {
        ArrayList<b0> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(b0Var);
    }

    public final int indexOfNativeChild(b0 b0Var) {
        yh0.c(this.mNativeChildren);
        return this.mNativeChildren.indexOf(b0Var);
    }

    public boolean isDescendantOf(b0 b0Var) {
        for (b0 parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == b0Var) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.a0
    public b0 removeChildAt(int i) {
        ArrayList<b0> arrayList = this.mChildren;
        if (arrayList != null) {
            b0 remove = arrayList.remove(i);
            remove.mParent = null;
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.u(i);
            }
            markUpdated();
            int totalNativeNodeContributionToParent = remove.getTotalNativeNodeContributionToParent();
            this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
            updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException(C0201.m82(14426) + i + C0201.m82(14427));
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 removeNativeChildAt(int i) {
        yh0.c(this.mNativeChildren);
        b0 remove = this.mNativeChildren.remove(i);
        remove.mNativeParent = null;
        return remove;
    }

    public final void setLayoutParent(b0 b0Var) {
        this.mLayoutParent = b0Var;
    }
}
