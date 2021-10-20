package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.d;
import java.util.Calendar;
import vigqyno.C0201;

public final class MaterialCalendarGridView extends GridView {
    private final Calendar a;

    class a extends r2 {
        public a() {
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            w3Var.b0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().h());
        } else if (i == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public j getAdapter() {
        return (j) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        j b = getAdapter();
        d<?> dVar = b.b;
        c cVar = b.c;
        Long c = b.getItem(b.b());
        Long c2 = b.getItem(b.h());
        for (d<Long, Long> dVar2 : dVar.x()) {
            F f = dVar2.a;
            if (f != null) {
                if (dVar2.b == null) {
                    continue;
                } else {
                    long longValue = f.longValue();
                    long longValue2 = dVar2.b.longValue();
                    if (!d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < c.longValue()) {
                            i2 = b.b();
                            if (b.f(i2)) {
                                i = 0;
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.a.setTimeInMillis(longValue);
                            i2 = b.a(materialCalendarGridView.a.get(5));
                            i = c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = b.h();
                            if (b.g(i4)) {
                                i3 = getWidth();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            }
                        } else {
                            materialCalendarGridView.a.setTimeInMillis(longValue2);
                            i4 = b.a(materialCalendarGridView.a.get(5));
                            i3 = c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + cVar.a.c()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - cVar.a.b()), cVar.h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void setSelection(int i) {
        if (i < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = o.k();
        if (h.D(getContext())) {
            setNextFocusLeftId(rv1.cancel_button);
            setNextFocusRightId(rv1.confirm_button);
        }
        k3.h0(this, new a());
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof j) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format(C0201.m82(35075), MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
        }
    }
}
