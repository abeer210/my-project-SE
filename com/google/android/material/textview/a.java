package com.google.android.material.textview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.j0;
import com.google.android.material.textfield.TextInputLayout;
import vigqyno.C0201;

/* compiled from: MaterialAutoCompleteTextView */
public class a extends d {
    private final j0 d;
    private final AccessibilityManager e;

    /* renamed from: com.google.android.material.textview.a$a  reason: collision with other inner class name */
    /* compiled from: MaterialAutoCompleteTextView */
    class C0075a implements AdapterView.OnItemClickListener {
        public C0075a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object obj;
            w30.l(view, i);
            if (i < 0) {
                try {
                    obj = a.this.d.v();
                } catch (Throwable th) {
                    w30.m();
                    throw th;
                }
            } else {
                obj = a.this.getAdapter().getItem(i);
            }
            a.this.d(obj);
            AdapterView.OnItemClickListener onItemClickListener = a.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view != null) {
                    if (i < 0) {
                    }
                    onItemClickListener.onItemClick(a.this.d.j(), view, i, j);
                }
                view = a.this.d.y();
                i = a.this.d.x();
                j = a.this.d.w();
                onItemClickListener.onItemClick(a.this.d.j(), view, i, j);
            }
            a.this.d.dismiss();
            w30.m();
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.autoCompleteTextViewStyle);
    }

    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.material.textview.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private <T extends ListAdapter & Filterable> void d(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    public CharSequence getHint() {
        TextInputLayout c = c();
        if (c == null || !c.N()) {
            return super.getHint();
        }
        return c.getHint();
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.d.p(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.e) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.d.a();
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = (AccessibilityManager) context.getSystemService(C0201.m82(10244));
        j0 j0Var = new j0(getContext());
        this.d = j0Var;
        j0Var.J(true);
        this.d.D(this);
        this.d.I(2);
        this.d.p(getAdapter());
        this.d.L(new C0075a());
    }
}
