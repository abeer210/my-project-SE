package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

/* renamed from: un0  reason: default package */
/* compiled from: Size */
public class un0 implements Comparable<un0>, Parcelable {
    public static final Parcelable.Creator<un0> CREATOR = new a();
    private final int a;
    private final int b;

    /* renamed from: un0$a */
    /* compiled from: Size */
    static class a implements Parcelable.Creator<un0> {
        /* renamed from: a */
        public un0 createFromParcel(Parcel parcel) {
            return new un0(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public un0[] newArray(int i) {
            return new un0[i];
        }
    }

    public un0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static un0 f(String str) {
        int indexOf = str.indexOf(120);
        String r1 = C0201.m82(5469);
        if (indexOf != -1) {
            try {
                return new un0(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(r1 + str, e);
            }
        } else {
            throw new IllegalArgumentException(r1 + str);
        }
    }

    /* renamed from: b */
    public int compareTo(un0 un0) {
        return (this.a * this.b) - (un0.a * un0.b);
    }

    public int d() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un0)) {
            return false;
        }
        un0 un0 = (un0) obj;
        if (this.a == un0.a && this.b == un0.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.a + C0201.m82(5470) + this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
