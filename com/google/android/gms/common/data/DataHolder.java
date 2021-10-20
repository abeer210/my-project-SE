package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import vigqyno.C0188;
import vigqyno.C0201;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class DataHolder extends ip0 implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();
    private final int a;
    private final String[] b;
    private Bundle c;
    private final CursorWindow[] d;
    private final int e;
    private final Bundle f;
    private int[] g;
    private boolean h = false;
    private boolean i = true;

    static {
        new a(new String[0], null);
    }

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.a = i2;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i3;
        this.f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                for (int i2 = 0; i2 < this.d.length; i2++) {
                    this.d[i2].close();
                }
            }
        }
    }

    @Override // java.lang.Object
    public final void finalize() throws Throwable {
        try {
            if (this.i && this.d.length > 0 && !isClosed()) {
                close();
                String r0 = C0201.m82(19810);
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append(C0201.m82(19811));
                sb.append(obj);
                sb.append(C0201.m82(19812));
                Log.e(r0, sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle getMetadata() {
        return this.f;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.h;
        }
        return z;
    }

    public final int o() {
        return this.e;
    }

    public final void p() {
        this.c = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.b;
            if (i3 >= strArr.length) {
                break;
            }
            this.c.putInt(strArr[i3], i3);
            i3++;
        }
        this.g = new int[this.d.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.d;
            if (i2 < cursorWindowArr.length) {
                this.g[i2] = i4;
                i4 += this.d[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
                i2++;
            } else {
                return;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.v(parcel, 1, this.b, false);
        kp0.x(parcel, 2, this.d, i2, false);
        kp0.n(parcel, 3, o());
        kp0.e(parcel, 4, getMetadata(), false);
        kp0.n(parcel, C0188.f18, this.a);
        kp0.b(parcel, a2);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a {
        private a(String[] strArr, String str) {
            u.k(strArr);
            new ArrayList();
            new HashMap();
        }

        public /* synthetic */ a(String[] strArr, String str, a aVar) {
            this(strArr, null);
        }
    }
}
