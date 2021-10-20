package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: kp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class kp0 {
    private static <T extends Parcelable> void A(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static void B(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    private static void C(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    public static int a(Parcel parcel) {
        return z(parcel, 20293);
    }

    public static void b(Parcel parcel, int i) {
        B(parcel, i);
    }

    public static void c(Parcel parcel, int i, boolean z) {
        C(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            C(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int z2 = z(parcel, i);
            parcel.writeBundle(bundle);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void f(Parcel parcel, int i, byte b) {
        C(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void g(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int z2 = z(parcel, i);
            parcel.writeByteArray(bArr);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void h(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            int z2 = z(parcel, i);
            int length = bArr.length;
            parcel.writeInt(length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void i(Parcel parcel, int i, double d) {
        C(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void j(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            C(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void k(Parcel parcel, int i, float f) {
        C(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void l(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            C(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void m(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int z2 = z(parcel, i);
            parcel.writeStrongBinder(iBinder);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void n(Parcel parcel, int i, int i2) {
        C(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void o(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int z2 = z(parcel, i);
            parcel.writeIntArray(iArr);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void p(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int z2 = z(parcel, i);
            parcel.writeList(list);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void q(Parcel parcel, int i, long j) {
        C(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void r(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            C(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void s(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int z2 = z(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void t(Parcel parcel, int i, short s) {
        C(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void u(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int z2 = z(parcel, i);
            parcel.writeString(str);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void v(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int z2 = z(parcel, i);
            parcel.writeStringArray(strArr);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static void w(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int z2 = z(parcel, i);
            parcel.writeStringList(list);
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void x(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int z2 = z(parcel, i);
            int length = tArr.length;
            parcel.writeInt(length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    A(parcel, t, i2);
                }
            }
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void y(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int z2 = z(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    A(parcel, t, 0);
                }
            }
            B(parcel, z2);
        } else if (z) {
            C(parcel, i, 0);
        }
    }

    private static int z(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
}
