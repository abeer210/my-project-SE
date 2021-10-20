package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;
import vigqyno.C0201;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentState */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Bundle j;
    public final boolean k;
    public final int l;
    public Bundle m;
    public Fragment n;

    /* compiled from: FragmentState */
    static class a implements Parcelable.Creator<m> {
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    public m(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.mWho;
        this.c = fragment.mFromLayout;
        this.d = fragment.mFragmentId;
        this.e = fragment.mContainerId;
        this.f = fragment.mTag;
        this.g = fragment.mRetainInstance;
        this.h = fragment.mRemoving;
        this.i = fragment.mDetached;
        this.j = fragment.mArguments;
        this.k = fragment.mHidden;
        this.l = fragment.mMaxState.ordinal();
    }

    public Fragment a(ClassLoader classLoader, g gVar) {
        if (this.n == null) {
            Bundle bundle = this.j;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            Fragment a2 = gVar.a(classLoader, this.a);
            this.n = a2;
            a2.setArguments(this.j);
            Bundle bundle2 = this.m;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.n.mSavedFragmentState = this.m;
            } else {
                this.n.mSavedFragmentState = new Bundle();
            }
            Fragment fragment = this.n;
            fragment.mWho = this.b;
            fragment.mFromLayout = this.c;
            fragment.mRestored = true;
            fragment.mFragmentId = this.d;
            fragment.mContainerId = this.e;
            fragment.mTag = this.f;
            fragment.mRetainInstance = this.g;
            fragment.mRemoving = this.h;
            fragment.mDetached = this.i;
            fragment.mHidden = this.k;
            fragment.mMaxState = d.b.values()[this.l];
            if (j.K) {
                Log.v(C0201.m82(18558), C0201.m82(18557) + this.n);
            }
        }
        return this.n;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(C0201.m82(18559));
        sb.append(this.a);
        sb.append(C0201.m82(18560));
        sb.append(this.b);
        sb.append(C0201.m82(18561));
        if (this.c) {
            sb.append(C0201.m82(18562));
        }
        if (this.e != 0) {
            sb.append(C0201.m82(18563));
            sb.append(Integer.toHexString(this.e));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(C0201.m82(18564));
            sb.append(this.f);
        }
        if (this.g) {
            sb.append(C0201.m82(18565));
        }
        if (this.h) {
            sb.append(C0201.m82(18566));
        }
        if (this.i) {
            sb.append(C0201.m82(18567));
        }
        if (this.k) {
            sb.append(C0201.m82(18568));
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.l);
    }

    public m(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        boolean z = true;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.k = parcel.readInt() == 0 ? false : z;
        this.m = parcel.readBundle();
        this.l = parcel.readInt();
    }
}
