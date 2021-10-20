package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class f extends ip0 {
    public static final Parcelable.Creator<f> CREATOR = new j0();
    private final List<m21> a;
    private final int b;
    private final String c;

    public static final class a {
        private final List<m21> a = new ArrayList();
        private int b = 5;
        private String c = C0201.m82(8847);

        public final a a(b bVar) {
            u.l(bVar, C0201.m82(8848));
            u.b(bVar instanceof m21, C0201.m82(8849));
            this.a.add((m21) bVar);
            return this;
        }

        public final a b(List<b> list) {
            if (list != null && !list.isEmpty()) {
                for (b bVar : list) {
                    if (bVar != null) {
                        a(bVar);
                    }
                }
            }
            return this;
        }

        public final f c() {
            u.b(!this.a.isEmpty(), C0201.m82(8850));
            return new f(this.a, this.b, this.c);
        }

        public final a d(int i) {
            this.b = i & 7;
            return this;
        }
    }

    public f(List<m21> list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public List<b> o() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return arrayList;
    }

    public int p() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(35502));
        sb.append(C0201.m82(35503));
        sb.append(this.a);
        int i = this.b;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(C0201.m82(35504));
        sb2.append(i);
        sb2.append(C0201.m82(35505));
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.c);
        int length = valueOf.length();
        String r3 = C0201.m82(35506);
        sb.append(length != 0 ? r3.concat(valueOf) : new String(r3));
        sb.append(C0201.m82(35507));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.y(parcel, 1, this.a, false);
        kp0.n(parcel, 2, p());
        kp0.u(parcel, 3, this.c, false);
        kp0.b(parcel, a2);
    }
}
