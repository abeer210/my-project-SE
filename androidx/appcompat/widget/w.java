package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.p;
import vigqyno.C0201;

/* compiled from: AppCompatSpinner */
public class w extends Spinner implements j3 {
    private static final int[] i = {16843505};
    private final e a;
    private final Context b;
    private h0 c;
    private SpinnerAdapter d;
    private final boolean e;
    private g f;
    public int g;
    public final Rect h;

    /* compiled from: AppCompatSpinner */
    class a extends h0 {
        public final /* synthetic */ e j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, e eVar) {
            super(view);
            this.j = eVar;
        }

        @Override // androidx.appcompat.widget.h0
        public p b() {
            return this.j;
        }

        @Override // androidx.appcompat.widget.h0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (w.this.getInternalPopup().b()) {
                return true;
            }
            w.this.b();
            return true;
        }
    }

    /* compiled from: AppCompatSpinner */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().b()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    class c implements g, DialogInterface.OnClickListener {
        public androidx.appcompat.app.b a;
        private ListAdapter b;
        private CharSequence c;

        public c() {
        }

        @Override // androidx.appcompat.widget.w.g
        public boolean b() {
            androidx.appcompat.app.b bVar = this.a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.w.g
        public void c(Drawable drawable) {
            Log.e(C0201.m82(20244), C0201.m82(20245));
        }

        @Override // androidx.appcompat.widget.w.g
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.a;
            if (bVar != null) {
                bVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.w.g
        public void f(int i) {
            Log.e(C0201.m82(20246), C0201.m82(20247));
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence g() {
            return this.c;
        }

        @Override // androidx.appcompat.widget.w.g
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.w.g
        public void k(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void l(int i) {
            Log.e(C0201.m82(20248), C0201.m82(20249));
        }

        @Override // androidx.appcompat.widget.w.g
        public void m(int i) {
            Log.e(C0201.m82(20250), C0201.m82(20251));
        }

        @Override // androidx.appcompat.widget.w.g
        public void n(int i, int i2) {
            if (this.b != null) {
                b.a aVar = new b.a(w.this.getPopupContext());
                CharSequence charSequence = this.c;
                if (charSequence != null) {
                    aVar.l(charSequence);
                }
                aVar.k(this.b, w.this.getSelectedItemPosition(), this);
                androidx.appcompat.app.b a2 = aVar.a();
                this.a = a2;
                ListView g = a2.g();
                if (Build.VERSION.SDK_INT >= 17) {
                    g.setTextDirection(i);
                    g.setTextAlignment(i2);
                }
                this.a.show();
            }
        }

        @Override // androidx.appcompat.widget.w.g
        public int o() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            w.this.setSelection(i);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i, this.b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.w.g
        public void p(ListAdapter listAdapter) {
            this.b = listAdapter;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: AppCompatSpinner */
    public static class d implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof t0) {
                t0 t0Var = (t0) spinnerAdapter;
                if (t0Var.getDropDownViewTheme() == null) {
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    class e extends j0 implements g {
        private CharSequence L;
        public ListAdapter M;
        private final Rect N = new Rect();
        private int O;

        /* compiled from: AppCompatSpinner */
        class a implements AdapterView.OnItemClickListener {
            public final /* synthetic */ w a;

            public a(w wVar) {
                this.a = wVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w30.l(view, i);
                try {
                    w.this.setSelection(i);
                    if (w.this.getOnItemClickListener() != null) {
                        w.this.performItemClick(view, i, e.this.M.getItemId(i));
                    }
                    e.this.dismiss();
                } finally {
                    w30.m();
                }
            }
        }

        /* compiled from: AppCompatSpinner */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.U(w.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.S();
                e.super.a();
            }
        }

        /* compiled from: AppCompatSpinner */
        class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            D(w.this);
            J(true);
            O(0);
            L(new a(w.this));
        }

        public void S() {
            int i;
            Drawable i2 = i();
            int i3 = 0;
            if (i2 != null) {
                i2.getPadding(w.this.h);
                i3 = d1.b(w.this) ? w.this.h.right : -w.this.h.left;
            } else {
                Rect rect = w.this.h;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i4 = wVar.g;
            if (i4 == -2) {
                int a2 = wVar.a((SpinnerAdapter) this.M, i());
                int i5 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = w.this.h;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a2 > i6) {
                    a2 = i6;
                }
                F(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i4);
            }
            if (d1.b(w.this)) {
                i = i3 + (((width - paddingRight) - z()) - T());
            } else {
                i = i3 + paddingLeft + T();
            }
            f(i);
        }

        public int T() {
            return this.O;
        }

        public boolean U(View view) {
            return k3.M(view) && view.getGlobalVisibleRect(this.N);
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence g() {
            return this.L;
        }

        @Override // androidx.appcompat.widget.w.g
        public void k(CharSequence charSequence) {
            this.L = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void m(int i) {
            this.O = i;
        }

        @Override // androidx.appcompat.widget.w.g
        public void n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            S();
            I(2);
            super.a();
            ListView j = j();
            j.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                j.setTextDirection(i);
                j.setTextAlignment(i2);
            }
            P(w.this.getSelectedItemPosition());
            if (!b2 && (viewTreeObserver = w.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                K(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.w.g, androidx.appcompat.widget.j0
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.M = listAdapter;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatSpinner */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public boolean a;

        /* compiled from: AppCompatSpinner */
        static class a implements Parcelable.Creator<f> {
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : 0);
        }

        public f(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatSpinner */
    public interface g {
        boolean b();

        void c(Drawable drawable);

        int d();

        void dismiss();

        void f(int i);

        CharSequence g();

        Drawable i();

        void k(CharSequence charSequence);

        void l(int i);

        void m(int i);

        void n(int i, int i2);

        int o();

        void p(ListAdapter listAdapter);
    }

    public w(Context context, int i2) {
        this(context, null, defpackage.d.spinnerStyle, i2);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.h);
        Rect rect = this.h;
        return i3 + rect.left + rect.right;
    }

    public void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f.n(getTextDirection(), getTextAlignment());
        } else {
            this.f.n(-1, -1);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar.d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar.o();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f != null) {
            return this.g;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final g getInternalPopup() {
        return this.f;
    }

    public Drawable getPopupBackground() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar.i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.b;
    }

    public CharSequence getPrompt() {
        g gVar = this.f;
        return gVar != null ? gVar.g() : super.getPrompt();
    }

    @Override // defpackage.j3
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // defpackage.j3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f;
        if (gVar != null && gVar.b()) {
            this.f.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f;
        fVar.a = gVar != null && gVar.b();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.c;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        g gVar = this.f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.a;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f;
        if (gVar != null) {
            gVar.m(i2);
            this.f.f(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f;
        if (gVar != null) {
            gVar.l(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f;
        if (gVar != null) {
            gVar.c(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(n.d(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f;
        if (gVar != null) {
            gVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // defpackage.j3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // defpackage.j3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, defpackage.d.spinnerStyle);
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            this.f.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r12 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r12 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    public w(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) {
        super(context, attributeSet, i2);
        Throwable th;
        TypedArray typedArray;
        Exception e2;
        this.h = new Rect();
        x0 u = x0.u(context, attributeSet, m.Spinner, i2, 0);
        this.a = new e(this);
        if (theme != null) {
            this.b = new y(context, theme);
        } else {
            int n = u.n(m.Spinner_popupTheme, 0);
            if (n != 0) {
                this.b = new y(context, n);
            } else {
                this.b = context;
            }
        }
        TypedArray typedArray2 = null;
        if (i3 == -1) {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, i, i2, 0);
                try {
                    i3 = typedArray.hasValue(0) ? typedArray.getInt(0, 0) : i3;
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        Log.i(C0201.m82(25939), C0201.m82(25940), e2);
                    } catch (Throwable th2) {
                        th = th2;
                        typedArray2 = typedArray;
                        if (typedArray2 != null) {
                            typedArray2.recycle();
                        }
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
                typedArray = null;
                Log.i(C0201.m82(25939), C0201.m82(25940), e2);
            } catch (Throwable th3) {
                th = th3;
                if (typedArray2 != null) {
                }
                throw th;
            }
        }
        if (i3 == 0) {
            c cVar = new c();
            this.f = cVar;
            cVar.k(u.o(m.Spinner_android_prompt));
        } else if (i3 == 1) {
            e eVar = new e(this.b, attributeSet, i2);
            x0 u2 = x0.u(this.b, attributeSet, m.Spinner, i2, 0);
            this.g = u2.m(m.Spinner_android_dropDownWidth, -2);
            eVar.c(u2.g(m.Spinner_android_popupBackground));
            eVar.k(u.o(m.Spinner_android_prompt));
            u2.v();
            this.f = eVar;
            this.c = new a(this, eVar);
        }
        CharSequence[] q = u.q(m.Spinner_android_entries);
        if (q != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, q);
            arrayAdapter.setDropDownViewResource(j.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        u.v();
        this.e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.a.e(attributeSet, i2);
    }
}
