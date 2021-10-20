package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentManagerState */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();
    public ArrayList<m> a;
    public ArrayList<String> b;
    public b[] c;
    public String d = null;
    public int e;

    /* compiled from: FragmentManagerState */
    static class a implements Parcelable.Creator<k> {
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    public k() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }

    public k(Parcel parcel) {
        this.a = parcel.createTypedArrayList(m.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }
}
