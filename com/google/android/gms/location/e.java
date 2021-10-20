package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class e {
    private final int a;
    private final int b;
    private final List<b> c;
    private final Location d;

    private e(int i, int i2, List<b> list, Location location) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = location;
    }

    public static e a(Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(C0201.m82(35664), -1);
        int intExtra2 = intent.getIntExtra(C0201.m82(35665), -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i = intExtra2;
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra(C0201.m82(35666));
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                arrayList.add(m21.o((byte[]) obj));
            }
        }
        return new e(intExtra, i, arrayList, (Location) intent.getParcelableExtra(C0201.m82(35667)));
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public List<b> d() {
        return this.c;
    }

    public boolean e() {
        return this.a != -1;
    }
}
