package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hu2  reason: default package */
/* compiled from: AspectRatio */
public class hu2 implements Parcelable {
    public static final Parcelable.Creator<hu2> CREATOR = new a();
    private final String a;
    private final float b;
    private final float c;

    /* renamed from: hu2$a */
    /* compiled from: AspectRatio */
    static class a implements Parcelable.Creator<hu2> {
        /* renamed from: a */
        public hu2 createFromParcel(Parcel parcel) {
            return new hu2(parcel);
        }

        /* renamed from: b */
        public hu2[] newArray(int i) {
            return new hu2[i];
        }
    }

    public hu2(String str, float f, float f2) {
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    public String a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }

    public hu2(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }
}
