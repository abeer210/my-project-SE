package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: c  reason: default package */
/* compiled from: ResultReceiver */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final Handler a = null;
    public b b;

    /* renamed from: c$a */
    /* compiled from: ResultReceiver */
    static class a implements Parcelable.Creator<c> {
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    /* renamed from: c$b */
    /* compiled from: ResultReceiver */
    class b extends b.a {
        public b() {
        }

        @Override // defpackage.b
        public void Q3(int i, Bundle bundle) {
            c cVar = c.this;
            Handler handler = cVar.a;
            if (handler != null) {
                handler.post(new RunnableC0028c(i, bundle));
            } else {
                cVar.a(i, bundle);
            }
        }
    }

    /* renamed from: c$c  reason: collision with other inner class name */
    /* compiled from: ResultReceiver */
    class RunnableC0028c implements Runnable {
        public final int a;
        public final Bundle b;

        public RunnableC0028c(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        public void run() {
            c.this.a(this.a, this.b);
        }
    }

    public c(Parcel parcel) {
        this.b = b.a.i(parcel.readStrongBinder());
    }

    public void a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new b();
            }
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
