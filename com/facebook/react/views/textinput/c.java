package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.k;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.views.text.l;
import com.facebook.react.views.text.q;
import com.facebook.react.views.text.t;
import com.facebook.react.views.text.y;
import com.facebook.react.views.text.z;
import com.facebook.react.views.view.e;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

/* compiled from: ReactEditText */
public class c extends k {
    private static final KeyListener J = QwertyKeyListener.getInstanceForFullKeyboard();
    private String A = null;
    private int B = -1;
    private int C = -1;
    private boolean D = false;
    private boolean E = false;
    private e F;
    public JavaOnlyMap G = null;
    public j0 H = null;
    public boolean I = false;
    private final InputMethodManager d;
    public boolean e;
    private int f;
    private int g;
    public int h;
    private ArrayList<TextWatcher> i;
    private C0050c j;
    private int k;
    public boolean l;
    private Boolean m;
    private boolean n;
    private String o;
    private p p;
    private a q;
    private o u;
    private final b v;
    private boolean w = false;
    private boolean x = false;
    private y y;
    private boolean z = false;

    /* access modifiers changed from: package-private */
    /* compiled from: ReactEditText */
    public class a extends r2 {
        public a() {
        }

        @Override // defpackage.r2
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 16) {
                return c.this.u();
            }
            return super.j(view, i, bundle);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ReactEditText */
    public static class b implements KeyListener {
        private int a = 0;

        public void a(int i) {
            this.a = i;
        }

        public void clearMetaKeyState(View view, Editable editable, int i) {
            c.J.clearMetaKeyState(view, editable, i);
        }

        public int getInputType() {
            return this.a;
        }

        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return c.J.onKeyDown(view, editable, i, keyEvent);
        }

        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return c.J.onKeyOther(view, editable, keyEvent);
        }

        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return c.J.onKeyUp(view, editable, i, keyEvent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.textinput.c$c  reason: collision with other inner class name */
    /* compiled from: ReactEditText */
    public class C0050c implements TextWatcher {
        private C0050c() {
        }

        public void afterTextChanged(Editable editable) {
            c cVar = c.this;
            if (!cVar.e && cVar.i != null) {
                Iterator it = c.this.i.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).afterTextChanged(editable);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c cVar = c.this;
            if (!cVar.e && cVar.i != null) {
                Iterator it = c.this.i.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c cVar = c.this;
            if (!cVar.e && cVar.i != null) {
                Iterator it = c.this.i.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            c.this.s();
        }

        public /* synthetic */ C0050c(c cVar, a aVar) {
            this();
        }
    }

    public c(Context context) {
        super(context);
        setFocusableInTouchMode(false);
        this.F = new e(this);
        Object systemService = context.getSystemService(C0201.m82(9391));
        yh0.c(systemService);
        this.d = (InputMethodManager) systemService;
        this.f = getGravity() & 8388615;
        this.g = getGravity() & 112;
        this.h = 0;
        this.e = false;
        this.m = null;
        this.n = false;
        this.i = null;
        this.j = null;
        this.k = getInputType();
        this.v = new b();
        this.u = null;
        this.y = new y();
        e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 <= 27) {
            setLayerType(1, null);
        }
        k3.h0(this, new a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    private void B() {
        String str = this.o;
        int i2 = 4;
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals(C0201.m82(9398))) {
                        c = 3;
                        break;
                    }
                    break;
                case -906336856:
                    if (str.equals(C0201.m82(9397))) {
                        c = 4;
                        break;
                    }
                    break;
                case 3304:
                    if (str.equals(C0201.m82(9396))) {
                        c = 0;
                        break;
                    }
                    break;
                case 3089282:
                    if (str.equals(C0201.m82(9395))) {
                        c = 6;
                        break;
                    }
                    break;
                case 3377907:
                    if (str.equals(C0201.m82(9394))) {
                        c = 1;
                        break;
                    }
                    break;
                case 3387192:
                    if (str.equals(C0201.m82(9393))) {
                        c = 2;
                        break;
                    }
                    break;
                case 3526536:
                    if (str.equals(C0201.m82(9392))) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i2 = 2;
                    break;
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 7;
                    break;
                case 4:
                    i2 = 3;
                    break;
            }
            if (!this.n) {
                setImeOptions(33554432 | i2);
                return;
            } else {
                setImeOptions(i2);
                return;
            }
        }
        i2 = 6;
        if (!this.n) {
        }
    }

    private C0050c getTextWatcherDelegator() {
        if (this.j == null) {
            this.j = new C0050c(this, null);
        }
        return this.j;
    }

    private boolean l() {
        return (getInputType() & 144) != 0;
    }

    private void m(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (int i2 = 0; i2 < spans.length; i2++) {
            if (spans[i2] instanceof l) {
                getText().removeSpan(spans[i2]);
            }
            if ((getText().getSpanFlags(spans[i2]) & 33) == 33) {
                Object obj = spans[i2];
                int spanStart = getText().getSpanStart(spans[i2]);
                int spanEnd = getText().getSpanEnd(spans[i2]);
                int spanFlags = getText().getSpanFlags(spans[i2]);
                getText().removeSpan(spans[i2]);
                if (v(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s() {
        a aVar = this.q;
        if (aVar != null) {
            aVar.a();
        }
        z();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean u() {
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            A();
        }
        return requestFocus;
    }

    private static boolean v(Editable editable, SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        if (i2 > spannableStringBuilder.length() || i3 > spannableStringBuilder.length()) {
            return false;
        }
        while (i2 < i3) {
            if (editable.charAt(i2) != spannableStringBuilder.charAt(i2)) {
                return false;
            }
            i2++;
        }
        return true;
    }

    private void z() {
        if (this.H == null) {
            ReactContext c = q0.c(this);
            ((UIManagerModule) c.getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), new k(this));
        }
    }

    public boolean A() {
        return this.d.showSoftInput(this, 0);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.i == null) {
            this.i = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.i.add(textWatcher);
    }

    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        i();
    }

    public void e() {
        setTextSize(0, (float) this.y.c());
        if (Build.VERSION.SDK_INT >= 21) {
            float d2 = this.y.d();
            if (!Float.isNaN(d2)) {
                setLetterSpacing(d2);
            }
        }
    }

    public boolean f(int i2) {
        return i2 >= this.h;
    }

    public void g() {
        clearFocus();
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.m;
        if (bool == null) {
            return !k();
        }
        return bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.n;
    }

    public String getReturnKeyType() {
        return this.o;
    }

    public int getStagedInputType() {
        return this.k;
    }

    public void h() {
        if (getInputType() != this.k) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.k);
            setSelection(selectionStart, selectionEnd);
        }
    }

    public void i() {
        this.d.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.l) {
            Editable text = getText();
            for (z zVar : (z[]) text.getSpans(0, text.length(), z.class)) {
                if (zVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public boolean isLayoutRequested() {
        return false;
    }

    public int j() {
        int i2 = this.h + 1;
        this.h = i2;
        return i2;
    }

    public boolean k() {
        return (getInputType() & 131072) != 0;
    }

    public void n(int i2, int i3, int i4) {
        if (f(i2) && i3 != -1 && i4 != -1) {
            setSelection(i3, i4);
        }
    }

    public void o(q qVar) {
        if ((!l() || !TextUtils.equals(getText(), qVar.k())) && f(qVar.c())) {
            ReadableMap readableMap = qVar.m;
            if (readableMap != null) {
                this.G = JavaOnlyMap.deepClone(readableMap);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.k());
            m(spannableStringBuilder);
            this.l = qVar.b();
            this.I = true;
            if (qVar.k().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.I = false;
            if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != qVar.m()) {
                setBreakStrategy(qVar.m());
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l) {
            Editable text = getText();
            for (z zVar : (z[]) text.getSpans(0, text.length(), z.class)) {
                zVar.c();
            }
        }
        if (this.D && !this.E) {
            u();
        }
        this.E = true;
    }

    @Override // androidx.appcompat.widget.k
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext c = q0.c(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.x) {
            onCreateInputConnection = new d(onCreateInputConnection, c, this);
        }
        if (k() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.l) {
            Editable text = getText();
            for (z zVar : (z[]) text.getSpans(0, text.length(), z.class)) {
                zVar.d();
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.l) {
            Editable text = getText();
            for (z zVar : (z[]) text.getSpans(0, text.length(), z.class)) {
                zVar.e();
            }
        }
    }

    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        p pVar;
        super.onFocusChanged(z2, i2, rect);
        if (z2 && (pVar = this.p) != null) {
            pVar.a(getSelectionStart(), getSelectionEnd());
        }
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 66 || k()) {
            return super.onKeyUp(i2, keyEvent);
        }
        i();
        return true;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        s();
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        o oVar = this.u;
        if (oVar != null) {
            oVar.a(i2, i3, i4, i5);
        }
    }

    public void onSelectionChanged(int i2, int i3) {
        super.onSelectionChanged(i2, i3);
        if (this.p != null && hasFocus()) {
            this.p.a(i2, i3);
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.l) {
            Editable text = getText();
            for (z zVar : (z[]) text.getSpans(0, text.length(), z.class)) {
                zVar.f();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.w = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.w) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.w = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p(q qVar) {
        this.e = true;
        o(qVar);
        this.e = false;
    }

    public void q(q qVar) {
        o(qVar);
    }

    public void r() {
        if (this.z) {
            this.z = false;
            setTypeface(t.a(getTypeface(), this.C, this.B, this.A, getContext().getAssets()));
        }
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.i;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.i.isEmpty()) {
                this.i = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public boolean requestFocus(int i2, Rect rect) {
        return isFocused();
    }

    public void setAllowFontScaling(boolean z2) {
        if (this.y.b() != z2) {
            this.y.m(z2);
            e();
        }
    }

    public void setAutoFocus(boolean z2) {
        this.D = z2;
    }

    public void setBackgroundColor(int i2) {
        this.F.b(i2);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.m = bool;
    }

    public void setBorderRadius(float f2) {
        this.F.d(f2);
    }

    public void setBorderStyle(String str) {
        this.F.f(str);
    }

    public void setContentSizeWatcher(a aVar) {
        this.q = aVar;
    }

    public void setDisableFullscreenUI(boolean z2) {
        this.n = z2;
        B();
    }

    public void setFontFamily(String str) {
        this.A = str;
        this.z = true;
    }

    public void setFontSize(float f2) {
        this.y.n(f2);
        e();
    }

    public void setFontStyle(String str) {
        int b2 = t.b(str);
        if (b2 != this.C) {
            this.C = b2;
            this.z = true;
        }
    }

    public void setFontWeight(String str) {
        int d2 = t.d(str);
        if (d2 != this.B) {
            this.B = d2;
            this.z = true;
        }
    }

    public void setGravityHorizontal(int i2) {
        if (i2 == 0) {
            i2 = this.f;
        }
        setGravity(i2 | (getGravity() & -8 & -8388616));
    }

    public void setGravityVertical(int i2) {
        if (i2 == 0) {
            i2 = this.g;
        }
        setGravity(i2 | (getGravity() & -113));
    }

    public void setInputType(int i2) {
        super.setTypeface(super.getTypeface());
        if (i2 == 32 && Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.startsWith(C0201.m82(9399))) {
            i2 = 1;
        }
        super.setInputType(i2);
        this.k = i2;
        if (k()) {
            setSingleLine(false);
        }
        this.v.a(i2);
        setKeyListener(this.v);
    }

    public void setLetterSpacingPt(float f2) {
        this.y.p(f2);
        e();
    }

    public void setMaxFontSizeMultiplier(float f2) {
        if (f2 != this.y.k()) {
            this.y.r(f2);
            e();
        }
    }

    public void setOnKeyPress(boolean z2) {
        this.x = z2;
    }

    public void setReturnKeyType(String str) {
        this.o = str;
        B();
    }

    public void setScrollWatcher(o oVar) {
        this.u = oVar;
    }

    public void setSelection(int i2, int i3) {
        super.setSelection(i2, i3);
    }

    public void setSelectionWatcher(p pVar) {
        this.p = pVar;
    }

    public void setStagedInputType(int i2) {
        this.k = i2;
    }

    public void t() {
        u();
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (this.l) {
            Editable text = getText();
            for (z zVar : (z[]) text.getSpans(0, text.length(), z.class)) {
                if (zVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void w(int i2, float f2, float f3) {
        this.F.c(i2, f2, f3);
    }

    public void x(float f2, int i2) {
        this.F.e(f2, i2);
    }

    public void y(int i2, float f2) {
        this.F.g(i2, f2);
    }
}
