package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import java.util.Calendar;
import vigqyno.C0201;

/* compiled from: RNDate */
public class c {
    private Calendar a = Calendar.getInstance();

    public c(Bundle bundle) {
        if (bundle != null) {
            String r0 = C0201.m82(36325);
            if (bundle.containsKey(r0)) {
                e(bundle.getLong(r0));
            }
        }
    }

    public int a() {
        return this.a.get(5);
    }

    public int b() {
        return this.a.get(11);
    }

    public int c() {
        return this.a.get(12);
    }

    public int d() {
        return this.a.get(2);
    }

    public void e(long j) {
        this.a.setTimeInMillis(j);
    }

    public int f() {
        return this.a.get(1);
    }
}
