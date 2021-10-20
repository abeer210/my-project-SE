package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

/* renamed from: zx1  reason: default package */
/* compiled from: ExtendableSavedState */
public class zx1 extends f4 {
    public static final Parcelable.Creator<zx1> CREATOR = new a();
    public final x0<String, Bundle> c;

    /* renamed from: zx1$a */
    /* compiled from: ExtendableSavedState */
    static class a implements Parcelable.ClassLoaderCreator<zx1> {
        /* renamed from: a */
        public zx1 createFromParcel(Parcel parcel) {
            return new zx1(parcel, null, null);
        }

        /* renamed from: b */
        public zx1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new zx1(parcel, classLoader, null);
        }

        /* renamed from: c */
        public zx1[] newArray(int i) {
            return new zx1[i];
        }
    }

    public /* synthetic */ zx1(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return C0201.m82(36543) + Integer.toHexString(System.identityHashCode(this)) + C0201.m82(36544) + this.c + C0201.m82(36545);
    }

    @Override // defpackage.f4
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.c.i(i2);
            bundleArr[i2] = this.c.m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public zx1(Parcelable parcelable) {
        super(parcelable);
        this.c = new x0<>();
    }

    private zx1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.c = new x0<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.c.put(strArr[i], bundleArr[i]);
        }
    }
}
