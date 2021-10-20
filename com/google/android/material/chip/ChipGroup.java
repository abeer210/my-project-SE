package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.g;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class ChipGroup extends com.google.android.material.internal.c {
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private d h;
    private final b i;
    private e j;
    private int k;
    private boolean l;

    /* access modifiers changed from: private */
    public class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.l) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.g) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.k == -1 || ChipGroup.this.k == id || !ChipGroup.this.f)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.l(chipGroup.k, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.k == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.l(compoundButton.getId(), true);
                    ChipGroup.this.setCheckedId(compoundButton.getId());
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i, int i2) {
            super(i, i2);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i);
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener a;

        private e() {
        }

        public void onChildViewAdded(View view, View view2) {
            int i;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.chipGroupStyle);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.l = true;
            ((Chip) findViewById).setChecked(z);
            this.l = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCheckedId(int i2) {
        this.k = i2;
        d dVar = this.h;
        if (dVar != null && this.f) {
            dVar.a(this, i2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.k;
                if (i3 != -1 && this.f) {
                    l(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // com.google.android.material.internal.c
    public boolean b() {
        return super.b();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f) {
            return this.k;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.d;
    }

    public int getChipSpacingVertical() {
        return this.e;
    }

    public void k() {
        this.l = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.l = false;
        setCheckedId(-1);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.k;
        if (i2 != -1) {
            l(i2, true);
            setCheckedId(this.k);
        }
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.d != i2) {
            this.d = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.e != i2) {
            this.e = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException(C0201.m82(35211));
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException(C0201.m82(35212));
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException(C0201.m82(35213));
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.h = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.g = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException(C0201.m82(35214));
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException(C0201.m82(35215));
    }

    @Override // com.google.android.material.internal.c
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f != z) {
            this.f = z;
            k();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new b();
        this.j = new e();
        this.k = -1;
        this.l = false;
        TypedArray h2 = g.h(context, attributeSet, xv1.ChipGroup, i2, wv1.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = h2.getDimensionPixelOffset(xv1.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(h2.getDimensionPixelOffset(xv1.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(h2.getDimensionPixelOffset(xv1.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(h2.getBoolean(xv1.ChipGroup_singleLine, false));
        setSingleSelection(h2.getBoolean(xv1.ChipGroup_singleSelection, false));
        setSelectionRequired(h2.getBoolean(xv1.ChipGroup_selectionRequired, false));
        int resourceId = h2.getResourceId(xv1.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.k = resourceId;
        }
        h2.recycle();
        super.setOnHierarchyChangeListener(this.j);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
