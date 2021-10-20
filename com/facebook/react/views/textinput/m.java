package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.text.h;
import com.facebook.react.views.text.q;
import com.facebook.react.views.text.s;
import com.facebook.react.views.view.b;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import vigqyno.C0201;

@TargetApi(23)
/* compiled from: ReactTextInputShadowNode */
public class m extends h implements com.facebook.yoga.m {
    private int D;
    private EditText E;
    private k F;
    private String G;
    private String H;
    private int I;
    private int J;

    public m(s sVar) {
        super(sVar);
        this.D = -1;
        this.G = null;
        this.H = null;
        this.I = -1;
        this.J = -1;
        this.i = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        g();
    }

    private void g() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.m
    public long a(p pVar, float f, n nVar, float f2, n nVar2) {
        int i;
        EditText editText = this.E;
        yh0.c(editText);
        EditText editText2 = editText;
        k kVar = this.F;
        if (kVar != null) {
            kVar.a(editText2);
        } else {
            editText2.setTextSize(0, (float) this.b.c());
            int i2 = this.g;
            if (i2 != -1) {
                editText2.setLines(i2);
            }
            if (Build.VERSION.SDK_INT >= 23 && editText2.getBreakStrategy() != (i = this.i)) {
                editText2.setBreakStrategy(i);
            }
        }
        editText2.setHint(e());
        editText2.measure(b.a(f, nVar), b.a(f2, nVar2));
        return o.b(editText2.getMeasuredWidth(), editText2.getMeasuredHeight());
    }

    public EditText d() {
        return new EditText(getThemedContext());
    }

    public String e() {
        return this.H;
    }

    public String f() {
        return this.G;
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.react.uimanager.b0
    public void onCollectExtraUpdates(v0 v0Var) {
        super.onCollectExtraUpdates(v0Var);
        if (this.D != -1) {
            v0Var.R(getReactTag(), new q(c(this, f(), false, null), this.D, this.B, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.h, this.i, this.k, this.I, this.J));
        }
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public void setLocalData(Object obj) {
        yh0.a(obj instanceof k);
        this.F = (k) obj;
        dirty();
    }

    @xj0(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.D = i;
    }

    @Override // com.facebook.react.uimanager.b0
    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        markUpdated();
    }

    @xj0(name = "placeholder")
    public void setPlaceholder(String str) {
        this.H = str;
        markUpdated();
    }

    @xj0(name = "selection")
    public void setSelection(ReadableMap readableMap) {
        this.J = -1;
        this.I = -1;
        if (readableMap != null) {
            String r0 = C0201.m82(9886);
            if (readableMap.hasKey(r0)) {
                String r1 = C0201.m82(9887);
                if (readableMap.hasKey(r1)) {
                    this.I = readableMap.getInt(r0);
                    this.J = readableMap.getInt(r1);
                    markUpdated();
                }
            }
        }
    }

    @xj0(name = "text")
    public void setText(String str) {
        this.G = str;
        if (str != null) {
            if (this.I > str.length()) {
                this.I = str.length();
            }
            if (this.J > str.length()) {
                this.J = str.length();
            }
        } else {
            this.I = -1;
            this.J = -1;
        }
        markUpdated();
    }

    @Override // com.facebook.react.views.text.h
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (str == null || C0201.m82(9888).equals(str)) {
                this.i = 0;
            } else if (C0201.m82(9889).equals(str)) {
                this.i = 1;
            } else if (C0201.m82(9890).equals(str)) {
                this.i = 2;
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(9891) + str);
            }
        }
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public void setThemedContext(k0 k0Var) {
        super.setThemedContext(k0Var);
        EditText d = d();
        setDefaultPadding(4, (float) k3.B(d));
        setDefaultPadding(1, (float) d.getPaddingTop());
        setDefaultPadding(5, (float) k3.A(d));
        setDefaultPadding(3, (float) d.getPaddingBottom());
        this.E = d;
        d.setPadding(0, 0, 0, 0);
        this.E.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public m() {
        this(null);
    }
}
