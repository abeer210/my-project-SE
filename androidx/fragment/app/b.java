package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.d;
import java.util.ArrayList;
import vigqyno.C0201;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: BackStackState */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int[] a;
    public final ArrayList<String> b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final CharSequence l;
    public final ArrayList<String> m;
    public final ArrayList<String> n;
    public final boolean o;

    /* compiled from: BackStackState */
    static class a implements Parcelable.Creator<b> {
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.a = new int[(size * 5)];
        if (aVar.h) {
            this.b = new ArrayList<>(size);
            this.c = new int[size];
            this.d = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                n.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.a[i3] = aVar2.a;
                ArrayList<String> arrayList = this.b;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.a;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.e;
                iArr[i7] = aVar2.f;
                this.c[i2] = aVar2.g.ordinal();
                this.d[i2] = aVar2.h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.e = aVar.f;
            this.f = aVar.g;
            this.g = aVar.i;
            this.h = aVar.t;
            this.i = aVar.j;
            this.j = aVar.k;
            this.k = aVar.l;
            this.l = aVar.m;
            this.m = aVar.n;
            this.n = aVar.o;
            this.o = aVar.p;
            return;
        }
        throw new IllegalStateException(C0201.m82(19672));
    }

    public a a(j jVar) {
        a aVar = new a(jVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.a.length) {
            n.a aVar2 = new n.a();
            int i4 = i2 + 1;
            aVar2.a = this.a[i2];
            if (j.K) {
                Log.v(C0201.m82(19676), C0201.m82(19673) + aVar + C0201.m82(19674) + i3 + C0201.m82(19675) + this.a[i4]);
            }
            String str = this.b.get(i3);
            if (str != null) {
                aVar2.b = jVar.g.get(str);
            } else {
                aVar2.b = null;
            }
            aVar2.g = d.b.values()[this.c[i3]];
            aVar2.h = d.b.values()[this.d[i3]];
            int[] iArr = this.a;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.e = i10;
            int i11 = iArr[i9];
            aVar2.f = i11;
            aVar.b = i6;
            aVar.c = i8;
            aVar.d = i10;
            aVar.e = i11;
            aVar.c(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f = this.e;
        aVar.g = this.f;
        aVar.i = this.g;
        aVar.t = this.h;
        aVar.h = true;
        aVar.j = this.i;
        aVar.k = this.j;
        aVar.l = this.k;
        aVar.m = this.l;
        aVar.n = this.m;
        aVar.o = this.n;
        aVar.p = this.o;
        aVar.h(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }
}
