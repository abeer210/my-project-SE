package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;

/* compiled from: SmoothCalendarLayoutManager */
public class n extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager */
    class a extends g {
        public a(n nVar, Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public n(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.p(i);
        J1(aVar);
    }
}
