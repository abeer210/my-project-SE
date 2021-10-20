package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

/* renamed from: f4  reason: default package */
/* compiled from: AbsSavedState */
public abstract class f4 implements Parcelable {
    public static final Parcelable.Creator<f4> CREATOR = new b();
    public static final f4 b = new a();
    private final Parcelable a;

    /* renamed from: f4$a */
    /* compiled from: AbsSavedState */
    static class a extends f4 {
        public a() {
            super((a) null);
        }
    }

    /* renamed from: f4$b */
    /* compiled from: AbsSavedState */
    static class b implements Parcelable.ClassLoaderCreator<f4> {
        /* renamed from: a */
        public f4 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: b */
        public f4 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return f4.b;
            }
            throw new IllegalStateException(C0201.m82(23012));
        }

        /* renamed from: c */
        public f4[] newArray(int i) {
            return new f4[i];
        }
    }

    public /* synthetic */ f4(a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    private f4() {
        this.a = null;
    }

    public f4(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(10734));
    }

    public f4(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? b : readParcelable;
    }
}
