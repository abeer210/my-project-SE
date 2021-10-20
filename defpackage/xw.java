package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import vigqyno.C0201;

/* renamed from: xw  reason: default package */
/* compiled from: HuffmanTablesDirectory */
public class xw extends tr {
    public static final HashMap<Integer, String> f;
    public final List<a> e = new ArrayList(4);

    /* renamed from: xw$a */
    /* compiled from: HuffmanTablesDirectory */
    public static class a {
        private final byte[] a;

        /* renamed from: xw$a$a  reason: collision with other inner class name */
        /* compiled from: HuffmanTablesDirectory */
        public enum EnumC0227a {
            DC,
            AC,
            UNKNOWN;

            public static EnumC0227a b(int i) {
                if (i == 0) {
                    return DC;
                }
                if (i != 1) {
                    return UNKNOWN;
                }
                return AC;
            }
        }

        public a(EnumC0227a aVar, int i, byte[] bArr, byte[] bArr2) {
            if (bArr == null) {
                throw new IllegalArgumentException(C0201.m82(33599));
            } else if (bArr2 != null) {
                this.a = bArr2;
                int length = bArr2.length;
            } else {
                throw new IllegalArgumentException(C0201.m82(33598));
            }
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f = hashMap;
        hashMap.put(1, C0201.m82(18442));
    }

    public xw() {
        E(new ww(this));
    }

    public List<a> V() {
        return this.e;
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(18443);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return f;
    }
}
