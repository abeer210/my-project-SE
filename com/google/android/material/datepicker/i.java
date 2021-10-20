package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import vigqyno.C0201;

/* compiled from: Month */
public final class i implements Comparable<i>, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    private final Calendar a;
    private final String b = o.n().format(this.a.getTime());
    public final int c;
    public final int d = this.a.get(1);
    public final int e = this.a.getMaximum(7);
    public final int f = this.a.getActualMaximum(5);

    /* compiled from: Month */
    static class a implements Parcelable.Creator<i> {
        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            return i.d(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    private i(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d2 = o.d(calendar);
        this.a = d2;
        this.c = d2.get(2);
        this.a.getTimeInMillis();
    }

    public static i d(int i, int i2) {
        Calendar k = o.k();
        k.set(1, i);
        k.set(2, i2);
        return new i(k);
    }

    public static i k() {
        return new i(o.i());
    }

    /* renamed from: b */
    public int compareTo(i iVar) {
        return this.a.compareTo(iVar.a);
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        int firstDayOfWeek = this.a.get(7) - this.a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.e : firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.c == iVar.c && this.d == iVar.d) {
            return true;
        }
        return false;
    }

    public long f(int i) {
        Calendar d2 = o.d(this.a);
        d2.set(5, i);
        return d2.getTimeInMillis();
    }

    public String g() {
        return this.b;
    }

    public long h() {
        return this.a.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public i i(int i) {
        Calendar d2 = o.d(this.a);
        d2.add(2, i);
        return new i(d2);
    }

    public int j(i iVar) {
        if (this.a instanceof GregorianCalendar) {
            return ((iVar.d - this.d) * 12) + (iVar.c - this.c);
        }
        throw new IllegalArgumentException(C0201.m82(13814));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
    }
}
