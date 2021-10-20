package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: jp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class jp0 {

    /* renamed from: jp0$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        public a(String str, Parcel parcel) {
            super(r2.toString());
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(C0201.m82(16117));
            sb.append(dataPosition);
            sb.append(C0201.m82(16118));
            sb.append(dataSize);
        }
    }

    public static int A(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void B(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A(parcel, i));
    }

    public static int C(Parcel parcel) {
        int t = t(parcel);
        int A = A(parcel, t);
        int dataPosition = parcel.dataPosition();
        if (l(t) != 20293) {
            String r2 = C0201.m82(10288);
            String valueOf = String.valueOf(Integer.toHexString(t));
            throw new a(valueOf.length() != 0 ? r2.concat(valueOf) : new String(r2), parcel);
        }
        int i = A + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append(C0201.m82(10289));
        sb.append(dataPosition);
        sb.append(C0201.m82(10290));
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    private static void D(Parcel parcel, int i, int i2) {
        int A = A(parcel, i);
        if (A != i2) {
            String hexString = Integer.toHexString(A);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append(C0201.m82(10291));
            sb.append(i2);
            sb.append(C0201.m82(10292));
            sb.append(A);
            sb.append(C0201.m82(10293));
            sb.append(hexString);
            sb.append(C0201.m82(10294));
            throw new a(sb.toString(), parcel);
        }
    }

    private static void E(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append(C0201.m82(10295));
            sb.append(i3);
            sb.append(C0201.m82(10296));
            sb.append(i2);
            sb.append(C0201.m82(10297));
            sb.append(hexString);
            sb.append(C0201.m82(10298));
            throw new a(sb.toString(), parcel);
        }
    }

    public static Bundle a(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + A);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + A);
        return createIntArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A);
        return createFromParcel;
    }

    public static String f(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A);
        return readString;
    }

    public static String[] g(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + A);
        return createStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A);
        return createStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A);
        return tArr;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append(C0201.m82(10299));
            sb.append(i);
            throw new a(sb.toString(), parcel);
        }
    }

    public static int l(int i) {
        return i & 65535;
    }

    public static boolean m(Parcel parcel, int i) {
        D(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i) {
        int A = A(parcel, i);
        if (A == 0) {
            return null;
        }
        E(parcel, i, A, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte o(Parcel parcel, int i) {
        D(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double p(Parcel parcel, int i) {
        D(parcel, i, 8);
        return parcel.readDouble();
    }

    public static Double q(Parcel parcel, int i) {
        int A = A(parcel, i);
        if (A == 0) {
            return null;
        }
        E(parcel, i, A, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float r(Parcel parcel, int i) {
        D(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i) {
        int A = A(parcel, i);
        if (A == 0) {
            return null;
        }
        E(parcel, i, A, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int t(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder u(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A);
        return readStrongBinder;
    }

    public static int v(Parcel parcel, int i) {
        D(parcel, i, 4);
        return parcel.readInt();
    }

    public static void w(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + A);
        }
    }

    public static long x(Parcel parcel, int i) {
        D(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long y(Parcel parcel, int i) {
        int A = A(parcel, i);
        if (A == 0) {
            return null;
        }
        E(parcel, i, A, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short z(Parcel parcel, int i) {
        D(parcel, i, 4);
        return (short) parcel.readInt();
    }
}
