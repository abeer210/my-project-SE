package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: e2  reason: default package */
/* compiled from: ParcelableCompat */
public final class e2 {

    /* renamed from: e2$a */
    /* compiled from: ParcelableCompat */
    static class a<T> implements Parcelable.ClassLoaderCreator<T> {
        private final f2<T> a;

        public a(f2<T> f2Var) {
            this.a = f2Var;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(f2<T> f2Var) {
        return new a(f2Var);
    }
}
