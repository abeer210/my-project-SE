package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import vigqyno.C0201;

/* compiled from: CalendarConstraints */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0067a();
    private final i a;
    private final i b;
    private final i c;
    private final b d;
    private final int e;
    private final int f;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* compiled from: CalendarConstraints */
    static class C0067a implements Parcelable.Creator<a> {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (b) parcel.readParcelable(b.class.getClassLoader()), null);
        }

        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    /* compiled from: CalendarConstraints */
    public interface b extends Parcelable {
        boolean F0(long j);
    }

    public /* synthetic */ a(i iVar, i iVar2, i iVar3, b bVar, C0067a aVar) {
        this(iVar, iVar2, iVar3, bVar);
    }

    public b a() {
        return this.d;
    }

    public i b() {
        return this.b;
    }

    public int c() {
        return this.f;
    }

    public i d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public i e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b) || !this.c.equals(aVar.c) || !this.d.equals(aVar.d)) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }

    private a(i iVar, i iVar2, i iVar3, b bVar) {
        this.a = iVar;
        this.b = iVar2;
        this.c = iVar3;
        this.d = bVar;
        if (iVar.compareTo(iVar3) > 0) {
            throw new IllegalArgumentException(C0201.m82(10500));
        } else if (iVar3.compareTo(iVar2) <= 0) {
            this.f = iVar.j(iVar2) + 1;
            this.e = (iVar2.d - iVar.d) + 1;
        } else {
            throw new IllegalArgumentException(C0201.m82(10499));
        }
    }
}
