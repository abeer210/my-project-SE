package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

/* renamed from: ln0  reason: default package */
/* compiled from: AspectRatio */
public class ln0 implements Comparable<ln0>, Parcelable {
    public static final Parcelable.Creator<ln0> CREATOR = new a();
    private static final y0<y0<ln0>> c = new y0<>(16);
    private final int a;
    private final int b;

    /* renamed from: ln0$a */
    /* compiled from: AspectRatio */
    static class a implements Parcelable.Creator<ln0> {
        /* renamed from: a */
        public ln0 createFromParcel(Parcel parcel) {
            return ln0.i(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public ln0[] newArray(int i) {
            return new ln0[i];
        }
    }

    private ln0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private static int d(int i, int i2) {
        while (true) {
            i = i2;
            if (i == 0) {
                return i;
            }
            i2 = i % i;
        }
    }

    public static ln0 i(int i, int i2) {
        int d = d(i, i2);
        int i3 = i / d;
        int i4 = i2 / d;
        y0<ln0> e = c.e(i3);
        if (e == null) {
            ln0 ln0 = new ln0(i3, i4);
            y0<ln0> y0Var = new y0<>();
            y0Var.l(i4, ln0);
            c.l(i3, y0Var);
            return ln0;
        }
        ln0 e2 = e.e(i4);
        if (e2 != null) {
            return e2;
        }
        ln0 ln02 = new ln0(i3, i4);
        e.l(i4, ln02);
        return ln02;
    }

    public static ln0 j(String str) {
        int indexOf = str.indexOf(58);
        String r1 = C0201.m82(30701);
        if (indexOf != -1) {
            try {
                return i(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(r1 + str, e);
            }
        } else {
            throw new IllegalArgumentException(r1 + str);
        }
    }

    /* renamed from: b */
    public int compareTo(ln0 ln0) {
        if (equals(ln0)) {
            return 0;
        }
        return k() - ln0.k() > 0.0f ? 1 : -1;
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
        if (!(obj instanceof ln0)) {
            return false;
        }
        ln0 ln0 = (ln0) obj;
        if (this.a == ln0.a && this.b == ln0.b) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.b;
    }

    public ln0 g() {
        return i(this.b, this.a);
    }

    public boolean h(un0 un0) {
        int d = d(un0.e(), un0.d());
        return this.a == un0.e() / d && this.b == un0.d() / d;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public float k() {
        return ((float) this.a) / ((float) this.b);
    }

    public String toString() {
        return this.a + C0201.m82(30702) + this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
