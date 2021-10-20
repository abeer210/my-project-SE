package com.huawei.hms.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;
import vigqyno.C0201;

public final class mby {
    public static IBinder a(IBinder iBinder, String str, int i, IBinder iBinder2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeStrongBinder(iBinder2);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static IBinder a(IBinder iBinder, String str, int i, IBinder iBinder2, Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeStrongBinder(iBinder2);
            if (parcelable != null) {
                obtain.writeInt(1);
                parcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static IBinder a(IBinder iBinder, String str, int i, Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            if (parcelable != null) {
                obtain.writeInt(1);
                parcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static LatLngBounds a(IBinder iBinder, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    public static Number a(IBinder iBinder, String str, int i, int i2, Parcelable... parcelableArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable != null) {
                    obtain.writeInt(1);
                    parcelable.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            if (i2 == 0) {
                Integer valueOf = Integer.valueOf(obtain2.readInt());
                obtain2.recycle();
                obtain.recycle();
                return valueOf;
            } else if (i2 == 1) {
                Float valueOf2 = Float.valueOf(obtain2.readFloat());
                obtain2.recycle();
                obtain.recycle();
                return valueOf2;
            } else if (i2 == 2) {
                Double valueOf3 = Double.valueOf(obtain2.readDouble());
                obtain2.recycle();
                obtain.recycle();
                return valueOf3;
            } else if (i2 != 3) {
                Log.e(C0201.m82(31061), C0201.m82(31062).concat(String.valueOf(i2)));
                obtain2.recycle();
                obtain.recycle();
                return null;
            } else {
                Byte valueOf4 = Byte.valueOf(obtain2.readByte());
                obtain2.recycle();
                obtain.recycle();
                return valueOf4;
            }
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public static void a(IBinder iBinder, IBinder iBinder2, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeStrongBinder(iBinder);
            iBinder2.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, IBinder... iBinderArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            for (IBinder iBinder2 : iBinderArr) {
                obtain.writeStrongBinder(iBinder2);
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, Parcelable... parcelableArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable != null) {
                    obtain.writeInt(1);
                    parcelable.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, Number... numberArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            for (Number number : numberArr) {
                a(obtain, number);
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    private static void a(Parcel parcel, Number number) {
        if (number instanceof Integer) {
            parcel.writeInt(number.intValue());
        } else if (number instanceof Float) {
            parcel.writeFloat(number.floatValue());
        } else if (number instanceof Double) {
            parcel.writeDouble(number.doubleValue());
        } else if (number instanceof Byte) {
            parcel.writeByte(number.byteValue());
        } else {
            Log.e(C0201.m82(31064), C0201.m82(31063) + number.toString());
        }
    }

    public static void a(String str, IBinder iBinder, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str2);
            obtain.writeString(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void a(List<LatLng> list, IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeTypedList(list);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void a(boolean z, IBinder iBinder, String str, int i) {
        a(iBinder, str, i, Integer.valueOf(z ? 1 : 0));
    }

    public static boolean a(IBinder iBinder, String str, int i) {
        return b(iBinder, str, i) != 0;
    }

    public static boolean a(IBinder iBinder, String str, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeInt(z ? 1 : 0);
            boolean z2 = false;
            iBinder.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z2 = true;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static boolean a(IInterface iInterface, IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeStrongBinder(iInterface != null ? iInterface.asBinder() : null);
            boolean z = false;
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static int b(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void b(List<PatternItem> list, IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeTypedList(list);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static float c(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readFloat();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static String d(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static LatLng e(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? LatLng.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static List<LatLng> f(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(LatLng.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static List<PatternItem> g(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(PatternItem.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void h(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static IBinder i(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
