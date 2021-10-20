package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ig  reason: default package */
/* compiled from: AHNotification */
public class ig implements Parcelable {
    public static final Parcelable.Creator<ig> CREATOR = new a();
    private String a;
    private int b;
    private int c;
    private int d;
    private boolean e;

    /* renamed from: ig$a */
    /* compiled from: AHNotification */
    static class a implements Parcelable.Creator<ig> {
        /* renamed from: a */
        public ig createFromParcel(Parcel parcel) {
            return new ig(parcel, null);
        }

        /* renamed from: b */
        public ig[] newArray(int i) {
            return new ig[i];
        }
    }

    /* renamed from: ig$b */
    /* compiled from: AHNotification */
    public static class b {
        private String a;
        private int b;
        private int c;
        private int d = -1;
        private boolean e = false;

        public b a(boolean z) {
            this.e = z;
            return this;
        }

        public ig b() {
            ig igVar = new ig();
            igVar.a = this.a;
            igVar.b = this.b;
            igVar.c = this.c;
            igVar.d = this.d;
            igVar.e = this.e;
            return igVar;
        }

        public b c(Integer num) {
            if (num == null) {
                return this;
            }
            this.c = num.intValue();
            return this;
        }

        public b d(int i) {
            this.d = i;
            return this;
        }

        public b e(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ ig(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static List<ig> f(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new ig());
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public int g() {
        return this.c;
    }

    public String h() {
        String str = this.a;
        return str == null ? C0201.m82(21894) : str;
    }

    public int i() {
        return this.d;
    }

    public int j() {
        return this.b;
    }

    public boolean k() {
        return !TextUtils.isEmpty(this.a);
    }

    public boolean l() {
        return (this.a == null && this.d == -1) ? false : true;
    }

    public boolean m() {
        return TextUtils.isEmpty(this.a) && this.d >= 0;
    }

    public boolean n() {
        return TextUtils.isEmpty(this.a) && this.d <= 0;
    }

    public void o(boolean z) {
        this.e = z;
    }

    public boolean p() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public ig() {
        this.d = -1;
        this.e = false;
    }

    private ig(Parcel parcel) {
        this.d = -1;
        this.e = false;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
