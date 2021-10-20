package defpackage;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import defpackage.p;

@SuppressLint({"RestrictedAPI"})
/* renamed from: r  reason: default package */
/* compiled from: StateListDrawable */
public class r extends p {
    private a m;
    private boolean n;

    /* access modifiers changed from: package-private */
    /* renamed from: r$a */
    /* compiled from: StateListDrawable */
    public static class a extends p.c {
        public int[][] J;

        public a(a aVar, r rVar, Resources resources) {
            super(aVar, rVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()][];
            }
        }

        public int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h = h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new r(this, null);
        }

        @Override // defpackage.p.c
        public void o(int i, int i2) {
            super.o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.J, 0, iArr, 0, i);
            this.J = iArr;
        }

        @Override // defpackage.p.c
        public void r() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int z(int[] iArr, Drawable drawable) {
            int a = a(drawable);
            this.J[a] = iArr;
            return a;
        }

        public Drawable newDrawable(Resources resources) {
            return new r(this, resources);
        }
    }

    public r(a aVar, Resources resources) {
        h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // defpackage.p
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.p
    public void h(p.c cVar) {
        super.h(cVar);
        if (cVar instanceof a) {
            this.m = (a) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* renamed from: j */
    public a b() {
        return new a(this.m, this, null);
    }

    public int[] k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // defpackage.p
    public Drawable mutate() {
        if (!this.n) {
            super.mutate();
            if (this == this) {
                this.m.r();
                this.n = true;
            }
        }
        return this;
    }

    @Override // defpackage.p
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.m.A(iArr);
        if (A < 0) {
            A = this.m.A(StateSet.WILD_CARD);
        }
        return g(A) || onStateChange;
    }

    public r(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }
}
