package net.alhazmy13.hijridatepicker.time;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

/* compiled from: Timepoint */
public class g implements Parcelable, Comparable<g> {
    public static final Parcelable.Creator<g> CREATOR = new a();
    private int a;
    private int b;
    private int c;

    /* compiled from: Timepoint */
    static class a implements Parcelable.Creator<g> {
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        /* renamed from: b */
        public g[] newArray(int i) {
            return new g[i];
        }
    }

    /* compiled from: Timepoint */
    public enum b {
        HOUR,
        MINUTE,
        SECOND
    }

    public g(g gVar) {
        this(gVar.a, gVar.b, gVar.c);
    }

    /* renamed from: b */
    public int compareTo(g gVar) {
        return hashCode() - gVar.hashCode();
    }

    public boolean d() {
        return this.a < 12;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return !d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass() && hashCode() == ((g) obj).hashCode()) {
            return true;
        }
        return false;
    }

    public void f() {
        int i = this.a;
        if (i >= 12) {
            this.a = i % 12;
        }
    }

    public void g() {
        int i = this.a;
        if (i < 12) {
            this.a = (i + 12) % 24;
        }
    }

    public int getHour() {
        return this.a;
    }

    public int getMinute() {
        return this.b;
    }

    public int getSecond() {
        return this.c;
    }

    public int h() {
        return (this.a * 3600) + (this.b * 60) + this.c;
    }

    public int hashCode() {
        return h();
    }

    public String toString() {
        return C0201.m82(19950) + this.a + C0201.m82(19951) + this.b + C0201.m82(19952) + this.c + C0201.m82(19953);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public g(int i, int i2, int i3) {
        this.a = i % 24;
        this.b = i2 % 60;
        this.c = i3 % 60;
    }

    public g(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
