package com.shazam.android.widget.text.reflow;

import android.graphics.Rect;

public class Run {
    private final Rect a;
    private final boolean b;
    private final Rect c;
    private final boolean d;

    public Run(Rect rect, boolean z, Rect rect2, boolean z2) {
        this.a = rect;
        this.b = z;
        this.c = rect2;
        this.d = z2;
    }

    public Rect a() {
        return this.c;
    }

    public Rect b() {
        return this.a;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.b;
    }
}
