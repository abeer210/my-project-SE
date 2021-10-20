package com.huawei.hms.common.parcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import vigqyno.C0201;

public class ParcelWrite {
    private static final int a = 0;
    private Parcel b;

    static {
        C0201.m83(ParcelWrite.class, 722);
    }

    public ParcelWrite(Parcel parcel) {
        this.b = parcel;
    }

    private int a(int i) {
        this.b.writeInt(i | -65536);
        this.b.writeInt(0);
        return this.b.dataPosition();
    }

    private void a(int i, int i2) {
        if (i2 >= 65535) {
            this.b.writeInt(i | -65536);
            this.b.writeInt(i2);
            return;
        }
        this.b.writeInt(i | (i2 << 16));
    }

    private <T extends Parcelable> void a(T t, int i) {
        int dataPosition = this.b.dataPosition();
        this.b.writeInt(1);
        int dataPosition2 = this.b.dataPosition();
        t.writeToParcel(this.b, i);
        int dataPosition3 = this.b.dataPosition();
        this.b.setDataPosition(dataPosition);
        this.b.writeInt(dataPosition3 - dataPosition2);
        this.b.setDataPosition(dataPosition3);
    }

    private void b(int i) {
        int dataPosition = this.b.dataPosition();
        this.b.setDataPosition(i - 4);
        this.b.writeInt(dataPosition - i);
        this.b.setDataPosition(dataPosition);
    }

    public int beginObjectHeader() {
        return a(65262);
    }

    public void finishObjectHeader(int i) {
        b(i);
    }

    public void writeBigDecimal(int i, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal != null) {
            int a2 = a(i);
            this.b.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            this.b.writeInt(bigDecimal.scale());
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeBigDecimalArray(int i, BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr != null) {
            int a2 = a(i);
            int length = bigDecimalArr.length;
            this.b.writeInt(length);
            for (int i2 = 0; i2 < length; i2++) {
                this.b.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
                this.b.writeInt(bigDecimalArr[i2].scale());
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeBigInteger(int i, BigInteger bigInteger, boolean z) {
        if (bigInteger != null) {
            int a2 = a(i);
            this.b.writeByteArray(bigInteger.toByteArray());
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeBigIntegerArray(int i, BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr != null) {
            int a2 = a(i);
            int length = bigIntegerArr.length;
            this.b.writeInt(length);
            for (BigInteger bigInteger : bigIntegerArr) {
                this.b.writeByteArray(bigInteger.toByteArray());
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeBoolean(int i, boolean z) {
        a(i, 4);
        this.b.writeInt(z ? 1 : 0);
    }

    public void writeBooleanArray(int i, boolean[] zArr, boolean z) {
        if (zArr != null) {
            int a2 = a(i);
            this.b.writeBooleanArray(zArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeBooleanList(int i, List<Boolean> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            int size = list.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(list.get(i2).booleanValue() ? 1 : 0);
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeBooleanObject(int i, Boolean bool) {
        writeBooleanObject(i, bool, false);
    }

    public void writeBooleanObject(int i, Boolean bool, boolean z) {
        if (bool != null) {
            a(i, 4);
            this.b.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeBundle(int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int a2 = a(i);
            this.b.writeBundle(bundle);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeByte(int i, byte b2) {
        a(i, 4);
        this.b.writeInt(b2);
    }

    public void writeByteArray(int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int a2 = a(i);
            this.b.writeByteArray(bArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeByteArrayArray(int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            int a2 = a(i);
            int length = bArr.length;
            this.b.writeInt(length);
            for (byte[] bArr2 : bArr) {
                this.b.writeByteArray(bArr2);
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeByteArraySparseArray(int i, SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a2 = a(i);
            int size = sparseArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseArray.keyAt(i2));
                this.b.writeByteArray(sparseArray.valueAt(i2));
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeChar(int i, char c) {
        a(i, 4);
        this.b.writeInt(c);
    }

    public void writeCharArray(int i, char[] cArr, boolean z) {
        if (cArr != null) {
            int a2 = a(i);
            this.b.writeCharArray(cArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeDouble(int i, double d) {
        a(i, 8);
        this.b.writeDouble(d);
    }

    public void writeDoubleArray(int i, double[] dArr, boolean z) {
        if (dArr != null) {
            int a2 = a(i);
            this.b.writeDoubleArray(dArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeDoubleList(int i, List<Double> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            int size = list.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeDouble(list.get(i2).doubleValue());
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeDoubleObject(int i, Double d, boolean z) {
        if (d != null) {
            a(i, 8);
            this.b.writeDouble(d.doubleValue());
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeDoubleSparseArray(int i, SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a2 = a(i);
            int size = sparseArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseArray.keyAt(i2));
                this.b.writeDouble(sparseArray.valueAt(i2).doubleValue());
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeFloat(int i, float f) {
        a(i, 4);
        this.b.writeFloat(f);
    }

    public void writeFloatArray(int i, float[] fArr, boolean z) {
        if (fArr != null) {
            int a2 = a(i);
            this.b.writeFloatArray(fArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeFloatList(int i, List<Float> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            int size = list.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeFloat(list.get(i2).floatValue());
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeFloatObject(int i, Float f, boolean z) {
        if (f != null) {
            a(i, 4);
            this.b.writeFloat(f.floatValue());
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeFloatSparseArray(int i, SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a2 = a(i);
            int size = sparseArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseArray.keyAt(i2));
                this.b.writeFloat(sparseArray.valueAt(i2).floatValue());
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeIBinder(int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int a2 = a(i);
            this.b.writeStrongBinder(iBinder);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeIBinderArray(int i, IBinder[] iBinderArr, boolean z) {
        if (iBinderArr != null) {
            int a2 = a(i);
            this.b.writeBinderArray(iBinderArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeIBinderList(int i, List<IBinder> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            this.b.writeBinderList(list);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeIBinderSparseArray(int i, SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a2 = a(i);
            int size = sparseArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseArray.keyAt(i2));
                this.b.writeStrongBinder(sparseArray.valueAt(i2));
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeInt(int i, int i2) {
        a(i, 4);
        this.b.writeInt(i2);
    }

    public void writeIntArray(int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int a2 = a(i);
            this.b.writeIntArray(iArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeIntegerList(int i, List<Integer> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            int size = list.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(list.get(i2).intValue());
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeIntegerObject(int i, Integer num, boolean z) {
        if (num != null) {
            a(i, 4);
            this.b.writeInt(num.intValue());
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeList(int i, List list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            this.b.writeList(list);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeLong(int i, long j) {
        a(i, 8);
        this.b.writeLong(j);
    }

    public void writeLongArray(int i, long[] jArr, boolean z) {
        if (jArr != null) {
            int a2 = a(i);
            this.b.writeLongArray(jArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeLongList(int i, List<Long> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            int size = list.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeLong(list.get(i2).longValue());
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeLongObject(int i, Long l, boolean z) {
        if (l != null) {
            a(i, 8);
            this.b.writeLong(l.longValue());
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeParcel(int i, Parcel parcel, boolean z) {
        if (parcel != null) {
            int a2 = a(i);
            this.b.appendFrom(parcel, 0, parcel.dataSize());
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeParcelArray(int i, Parcel[] parcelArr, boolean z) {
        if (parcelArr != null) {
            int a2 = a(i);
            int length = parcelArr.length;
            this.b.writeInt(length);
            for (Parcel parcel : parcelArr) {
                if (parcel != null) {
                    this.b.writeInt(parcel.dataSize());
                    this.b.appendFrom(parcel, 0, parcel.dataSize());
                } else {
                    this.b.writeInt(0);
                }
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeParcelList(int i, List<Parcel> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            int size = list.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcel parcel = list.get(i2);
                if (parcel != null) {
                    this.b.writeInt(parcel.dataSize());
                    this.b.appendFrom(parcel, 0, parcel.dataSize());
                } else {
                    this.b.writeInt(0);
                }
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeParcelSparseArray(int i, SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a2 = a(i);
            int size = sparseArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseArray.keyAt(i2));
                Parcel valueAt = sparseArray.valueAt(i2);
                if (valueAt != null) {
                    this.b.writeInt(valueAt.dataSize());
                    this.b.appendFrom(valueAt, 0, valueAt.dataSize());
                } else {
                    this.b.writeInt(0);
                }
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeParcelable(int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int a2 = a(i);
            parcelable.writeToParcel(this.b, i2);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeShort(int i, short s) {
        a(i, 4);
        this.b.writeInt(s);
    }

    public void writeSparseBooleanArray(int i, SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray != null) {
            int a2 = a(i);
            this.b.writeSparseBooleanArray(sparseBooleanArray);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeSparseIntArray(int i, SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray != null) {
            int a2 = a(i);
            int size = sparseIntArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseIntArray.keyAt(i2));
                this.b.writeInt(sparseIntArray.valueAt(i2));
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeSparseLongArray(int i, SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray != null) {
            int a2 = a(i);
            int size = sparseLongArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseLongArray.keyAt(i2));
                this.b.writeLong(sparseLongArray.valueAt(i2));
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeString(int i, String str, boolean z) {
        if (str != null) {
            int a2 = a(i);
            this.b.writeString(str);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeStringArray(int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int a2 = a(i);
            this.b.writeStringArray(strArr);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeStringList(int i, List<String> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            this.b.writeStringList(list);
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public void writeStringSparseArray(int i, SparseArray<String> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a2 = a(i);
            int size = sparseArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseArray.keyAt(i2));
                this.b.writeString(sparseArray.valueAt(i2));
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public <T extends Parcelable> void writeTypedArray(int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int a2 = a(i);
            int length = tArr.length;
            this.b.writeInt(length);
            for (T t : tArr) {
                if (t == null) {
                    this.b.writeInt(0);
                } else {
                    a(t, i2);
                }
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public <T extends Parcelable> void writeTypedList(int i, List<T> list, boolean z) {
        if (list != null) {
            int a2 = a(i);
            int size = list.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    this.b.writeInt(0);
                } else {
                    a(t, 0);
                }
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }

    public <T extends Parcelable> void writeTypedSparseArray(int i, SparseArray<T> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a2 = a(i);
            int size = sparseArray.size();
            this.b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.b.writeInt(sparseArray.keyAt(i2));
                T valueAt = sparseArray.valueAt(i2);
                if (valueAt == null) {
                    this.b.writeInt(0);
                } else {
                    a(valueAt, 0);
                }
            }
            b(a2);
        } else if (z) {
            a(i, 0);
        }
    }
}
