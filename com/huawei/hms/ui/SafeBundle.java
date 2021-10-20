package com.huawei.hms.ui;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.huawei.hms.base.ui.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import vigqyno.C0201;

public class SafeBundle {
    private final Bundle a;

    public SafeBundle() {
        this(new Bundle());
    }

    public void clear() {
        try {
            this.a.clear();
        } catch (Exception unused) {
            a.a(C0201.m82(11645), C0201.m82(11646));
        }
    }

    public boolean containsKey(String str) {
        try {
            return this.a.containsKey(str);
        } catch (Exception unused) {
            a.a(C0201.m82(11647), C0201.m82(11648));
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.a.get(str);
        } catch (Exception e) {
            a.a(C0201.m82(11650), C0201.m82(11649) + e.getMessage(), true);
            return null;
        }
    }

    public IBinder getBinder(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                return this.a.getBinder(str);
            }
            return null;
        } catch (Exception e) {
            a.a(C0201.m82(11652), C0201.m82(11651) + e.getMessage(), true);
            return null;
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean[] getBooleanArray(String str) {
        try {
            return this.a.getBooleanArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11656), C0201.m82(11655) + e.getMessage(), true);
            return new boolean[0];
        }
    }

    public boolean[] getBooleanArrayReturnNotNull(String str) {
        try {
            boolean[] booleanArray = this.a.getBooleanArray(str);
            return booleanArray == null ? new boolean[0] : booleanArray;
        } catch (Exception e) {
            a.a(C0201.m82(11658), C0201.m82(11657) + e.getMessage(), true);
            return new boolean[0];
        }
    }

    public Bundle getBundle() {
        return this.a;
    }

    public Bundle getBundleReturnNotNull(String str) {
        try {
            Bundle bundle = this.a.getBundle(str);
            return bundle == null ? new Bundle() : bundle;
        } catch (Exception e) {
            a.a(C0201.m82(11662), C0201.m82(11661) + e.getMessage(), true);
            return new Bundle();
        }
    }

    public byte getByte(String str) {
        try {
            return this.a.getByte(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public byte[] getByteArray(String str) {
        try {
            return this.a.getByteArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11666), C0201.m82(11665) + e.getMessage(), true);
            return new byte[0];
        }
    }

    public byte[] getByteArrayReturnNotNull(String str) {
        try {
            byte[] byteArray = this.a.getByteArray(str);
            return byteArray == null ? new byte[0] : byteArray;
        } catch (Exception e) {
            a.a(C0201.m82(11668), C0201.m82(11667) + e.getMessage(), true);
            return new byte[0];
        }
    }

    public char getChar(String str) {
        try {
            return this.a.getChar(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public char[] getCharArray(String str) {
        try {
            return this.a.getCharArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11672), C0201.m82(11671) + e.getMessage(), true);
            return new char[0];
        }
    }

    public char[] getCharArrayReturnNotNull(String str) {
        try {
            char[] charArray = this.a.getCharArray(str);
            return charArray == null ? new char[0] : charArray;
        } catch (Exception e) {
            a.a(C0201.m82(11674), C0201.m82(11673) + e.getMessage(), true);
            return new char[0];
        }
    }

    public CharSequence getCharSequence(String str) {
        try {
            return this.a.getCharSequence(str);
        } catch (Exception unused) {
            return C0201.m82(11675);
        }
    }

    public CharSequence[] getCharSequenceArray(String str) {
        try {
            return this.a.getCharSequenceArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11679), C0201.m82(11678) + e.getMessage(), true);
            return new CharSequence[0];
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(String str) {
        try {
            return this.a.getCharSequenceArrayList(str);
        } catch (Exception e) {
            a.a(C0201.m82(11681), C0201.m82(11680) + e.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayListReturnNotNull(String str) {
        try {
            ArrayList<CharSequence> charSequenceArrayList = this.a.getCharSequenceArrayList(str);
            return charSequenceArrayList == null ? new ArrayList<>() : charSequenceArrayList;
        } catch (Exception e) {
            a.a(C0201.m82(11683), C0201.m82(11682) + e.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public CharSequence[] getCharSequenceArrayReturnNotNull(String str) {
        try {
            CharSequence[] charSequenceArray = this.a.getCharSequenceArray(str);
            return charSequenceArray == null ? new CharSequence[0] : charSequenceArray;
        } catch (Exception e) {
            a.a(C0201.m82(11685), C0201.m82(11684) + e.getMessage(), true);
            return new CharSequence[0];
        }
    }

    public CharSequence getCharSequenceReturnNotNull(String str) {
        CharSequence charSequence;
        String r0 = C0201.m82(11686);
        try {
            charSequence = this.a.getCharSequence(str);
        } catch (Exception e) {
            a.a(C0201.m82(11688), C0201.m82(11687) + e.getMessage(), true);
            charSequence = r0;
        }
        return TextUtils.isEmpty(charSequence) ? r0 : charSequence;
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double[] getDoubleArray(String str) {
        try {
            return this.a.getDoubleArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11695), C0201.m82(11694) + e.getMessage(), true);
            return new double[0];
        }
    }

    public double[] getDoubleArrayReturnNotNull(String str) {
        try {
            double[] doubleArray = this.a.getDoubleArray(str);
            return doubleArray == null ? new double[0] : doubleArray;
        } catch (Exception e) {
            a.a(C0201.m82(11697), C0201.m82(11696) + e.getMessage(), true);
            return new double[0];
        }
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        try {
            return this.a.getFloatArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11701), C0201.m82(11700) + e.getMessage(), true);
            return new float[0];
        }
    }

    public float[] getFloatArrayReturnNotNull(String str) {
        try {
            float[] floatArray = this.a.getFloatArray(str);
            return floatArray == null ? new float[0] : floatArray;
        } catch (Exception e) {
            a.a(C0201.m82(11703), C0201.m82(11702) + e.getMessage(), true);
            return new float[0];
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int[] getIntArray(String str) {
        try {
            return this.a.getIntArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11707), C0201.m82(11706) + e.getMessage(), true);
            return new int[0];
        }
    }

    public int[] getIntArrayReturnNotNull(String str) {
        try {
            int[] intArray = this.a.getIntArray(str);
            return intArray == null ? new int[0] : intArray;
        } catch (Exception e) {
            a.a(C0201.m82(11709), C0201.m82(11708) + e.getMessage(), true);
            return new int[0];
        }
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        try {
            return this.a.getIntegerArrayList(str);
        } catch (Exception e) {
            a.a(C0201.m82(11711), C0201.m82(11710) + e.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<Integer> getIntegerArrayListReturnNotNull(String str) {
        try {
            ArrayList<Integer> integerArrayList = this.a.getIntegerArrayList(str);
            return integerArrayList == null ? new ArrayList<>() : integerArrayList;
        } catch (Exception e) {
            a.a(C0201.m82(11713), C0201.m82(11712) + e.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public long[] getLongArray(String str) {
        try {
            return this.a.getLongArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11717), C0201.m82(11716) + e.getMessage(), true);
            return new long[0];
        }
    }

    public long[] getLongArrayReturnNotNull(String str) {
        try {
            long[] longArray = this.a.getLongArray(str);
            return longArray == null ? new long[0] : longArray;
        } catch (Exception e) {
            a.a(C0201.m82(11719), C0201.m82(11718) + e.getMessage(), true);
            return new long[0];
        }
    }

    public <T extends Parcelable> T getParcelable(String str) {
        try {
            return (T) this.a.getParcelable(str);
        } catch (Exception e) {
            a.a(C0201.m82(11721), C0201.m82(11720) + e.getMessage(), true);
            return null;
        }
    }

    public Parcelable[] getParcelableArray(String str) {
        try {
            return this.a.getParcelableArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11723), C0201.m82(11722) + e.getMessage(), true);
            return new Parcelable[0];
        }
    }

    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String str) {
        try {
            return this.a.getParcelableArrayList(str);
        } catch (Exception e) {
            a.a(C0201.m82(11725), C0201.m82(11724) + e.getMessage(), true);
            return null;
        }
    }

    public Parcelable[] getParcelableArrayReturnNotNull(String str) {
        try {
            Parcelable[] parcelableArray = this.a.getParcelableArray(str);
            return parcelableArray == null ? new Parcelable[0] : parcelableArray;
        } catch (Exception e) {
            a.a(C0201.m82(11727), C0201.m82(11726) + e.getMessage(), true);
            return new Parcelable[0];
        }
    }

    public Object getReturnNotNull(String str) {
        try {
            Object obj = this.a.get(str);
            return obj == null ? new Object() : obj;
        } catch (Exception e) {
            a.a(C0201.m82(11729), C0201.m82(11728) + e.getMessage(), true);
            return new Object();
        }
    }

    public Serializable getSerializable(String str) {
        try {
            return this.a.getSerializable(str);
        } catch (Exception e) {
            a.a(C0201.m82(11731), C0201.m82(11730) + e.getMessage(), true);
            return null;
        }
    }

    public short getShort(String str) {
        try {
            return this.a.getShort(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public short[] getShortArray(String str) {
        try {
            return this.a.getShortArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11735), C0201.m82(11734) + e.getMessage(), true);
            return new short[0];
        }
    }

    public short[] getShortArrayReturnNotNull(String str) {
        try {
            short[] shortArray = this.a.getShortArray(str);
            return shortArray == null ? new short[0] : shortArray;
        } catch (Exception e) {
            a.a(C0201.m82(11737), C0201.m82(11736) + e.getMessage(), true);
            return new short[0];
        }
    }

    public Size getSize(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return this.a.getSize(str);
            }
            return null;
        } catch (Exception e) {
            a.a(C0201.m82(11739), C0201.m82(11738) + e.getMessage(), true);
            return null;
        }
    }

    public SizeF getSizeF(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return this.a.getSizeF(str);
            }
            return null;
        } catch (Exception e) {
            a.a(C0201.m82(11741), C0201.m82(11740) + e.getMessage(), true);
            return null;
        }
    }

    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String str) {
        try {
            return this.a.getSparseParcelableArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11743), C0201.m82(11742) + e.getMessage(), true);
            return null;
        }
    }

    public String getString(String str) {
        try {
            return this.a.getString(str);
        } catch (Exception e) {
            a.a(C0201.m82(11745), C0201.m82(11744) + e.getMessage(), true);
            return C0201.m82(11746);
        }
    }

    public String[] getStringArray(String str) {
        try {
            return this.a.getStringArray(str);
        } catch (Exception e) {
            a.a(C0201.m82(11750), C0201.m82(11749) + e.getMessage(), true);
            return new String[0];
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        try {
            return this.a.getStringArrayList(str);
        } catch (Exception e) {
            a.a(C0201.m82(11752), C0201.m82(11751) + e.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<String> getStringArrayListReturnNotNull(String str) {
        try {
            ArrayList<String> stringArrayList = this.a.getStringArrayList(str);
            return stringArrayList == null ? new ArrayList<>() : stringArrayList;
        } catch (Exception e) {
            a.a(C0201.m82(11754), C0201.m82(11753) + e.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public String[] getStringArrayReturnNotNull(String str) {
        try {
            String[] stringArray = this.a.getStringArray(str);
            return stringArray == null ? new String[0] : stringArray;
        } catch (Exception e) {
            a.a(C0201.m82(11756), C0201.m82(11755) + e.getMessage(), true);
            return new String[0];
        }
    }

    public String getStringReturnNotNull(String str) {
        String str2;
        String r0 = C0201.m82(11757);
        try {
            str2 = this.a.getString(str);
        } catch (Exception e) {
            a.a(C0201.m82(11759), C0201.m82(11758) + e.getMessage(), true);
            str2 = r0;
        }
        return TextUtils.isEmpty(str2) ? r0 : str2;
    }

    public boolean isEmpty() {
        try {
            return this.a.isEmpty();
        } catch (Exception unused) {
            a.a(C0201.m82(11762), C0201.m82(11763));
            return true;
        }
    }

    public Set<String> keySet() {
        try {
            return this.a.keySet();
        } catch (Exception unused) {
            a.a(C0201.m82(11764), C0201.m82(11765));
            return null;
        }
    }

    public SafeBundle putAll(Bundle bundle) {
        if (bundle != null) {
            try {
                this.a.putAll(bundle);
            } catch (Exception unused) {
                a.a(C0201.m82(11766), C0201.m82(11767));
            }
        }
        return this;
    }

    public SafeBundle putBinder(String str, IBinder iBinder) {
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                this.a.putBinder(str, iBinder);
            }
        } catch (Exception e) {
            a.a(C0201.m82(11769), C0201.m82(11768) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putBoolean(String str, boolean z) {
        try {
            this.a.putBoolean(str, z);
        } catch (Exception e) {
            a.a(C0201.m82(11771), C0201.m82(11770) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putBooleanArray(String str, boolean[] zArr) {
        try {
            this.a.putBooleanArray(str, zArr);
        } catch (Exception e) {
            a.a(C0201.m82(11773), C0201.m82(11772) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putBundle(String str, Bundle bundle) {
        try {
            this.a.putBundle(str, bundle);
        } catch (Exception e) {
            a.a(C0201.m82(11775), C0201.m82(11774) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putByte(String str, byte b) {
        try {
            this.a.putByte(str, b);
        } catch (Exception e) {
            a.a(C0201.m82(11777), C0201.m82(11776) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putByteArray(String str, byte[] bArr) {
        try {
            this.a.putByteArray(str, bArr);
        } catch (Exception e) {
            a.a(C0201.m82(11779), C0201.m82(11778) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putChar(String str, char c) {
        try {
            this.a.putChar(str, c);
        } catch (Exception e) {
            a.a(C0201.m82(11781), C0201.m82(11780) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putCharArray(String str, char[] cArr) {
        try {
            this.a.putCharArray(str, cArr);
        } catch (Exception e) {
            a.a(C0201.m82(11783), C0201.m82(11782) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putCharSequence(String str, CharSequence charSequence) {
        try {
            this.a.putCharSequence(str, charSequence);
        } catch (Exception e) {
            a.a(C0201.m82(11785), C0201.m82(11784) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putCharSequenceArray(String str, CharSequence[] charSequenceArr) {
        try {
            this.a.putCharSequenceArray(str, charSequenceArr);
        } catch (Exception e) {
            a.a(C0201.m82(11787), C0201.m82(11786) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putCharSequenceArrayList(String str, ArrayList<CharSequence> arrayList) {
        try {
            this.a.putCharSequenceArrayList(str, arrayList);
        } catch (Exception e) {
            a.a(C0201.m82(11789), C0201.m82(11788) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putDouble(String str, double d) {
        try {
            this.a.putDouble(str, d);
        } catch (Exception e) {
            a.a(C0201.m82(11791), C0201.m82(11790) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putDoubleArray(String str, double[] dArr) {
        try {
            this.a.putDoubleArray(str, dArr);
        } catch (Exception e) {
            a.a(C0201.m82(11793), C0201.m82(11792) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putFloat(String str, float f) {
        try {
            this.a.putFloat(str, f);
        } catch (Exception e) {
            a.a(C0201.m82(11795), C0201.m82(11794) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putFloatArray(String str, float[] fArr) {
        try {
            this.a.putFloatArray(str, fArr);
        } catch (Exception e) {
            a.a(C0201.m82(11797), C0201.m82(11796) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putInt(String str, int i) {
        try {
            this.a.putInt(str, i);
        } catch (Exception e) {
            a.a(C0201.m82(11799), C0201.m82(11798) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putIntArray(String str, int[] iArr) {
        try {
            this.a.putIntArray(str, iArr);
        } catch (Exception e) {
            a.a(C0201.m82(11801), C0201.m82(11800) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        try {
            this.a.putIntegerArrayList(str, arrayList);
        } catch (Exception e) {
            a.a(C0201.m82(11803), C0201.m82(11802) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putLong(String str, long j) {
        try {
            this.a.putLong(str, j);
        } catch (Exception e) {
            a.a(C0201.m82(11805), C0201.m82(11804) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putLongArray(String str, long[] jArr) {
        try {
            this.a.putLongArray(str, jArr);
        } catch (Exception e) {
            a.a(C0201.m82(11807), C0201.m82(11806) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putParcelable(String str, Parcelable parcelable) {
        try {
            this.a.putParcelable(str, parcelable);
        } catch (Exception e) {
            a.a(C0201.m82(11809), C0201.m82(11808) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putParcelableArray(String str, Parcelable[] parcelableArr) {
        try {
            this.a.putParcelableArray(str, parcelableArr);
        } catch (Exception e) {
            a.a(C0201.m82(11811), C0201.m82(11810) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putParcelableArrayList(String str, ArrayList<? extends Parcelable> arrayList) {
        try {
            this.a.putParcelableArrayList(str, arrayList);
        } catch (Exception e) {
            a.a(C0201.m82(11813), C0201.m82(11812) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putSerializable(String str, Serializable serializable) {
        try {
            this.a.putSerializable(str, serializable);
        } catch (Exception e) {
            a.a(C0201.m82(11815), C0201.m82(11814) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putShort(String str, short s) {
        try {
            this.a.putShort(str, s);
        } catch (Exception e) {
            a.a(C0201.m82(11817), C0201.m82(11816) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putShortArray(String str, short[] sArr) {
        try {
            this.a.putShortArray(str, sArr);
        } catch (Exception e) {
            a.a(C0201.m82(11819), C0201.m82(11818) + e.getMessage(), true);
        }
        return this;
    }

    @TargetApi(21)
    public SafeBundle putSize(String str, Size size) {
        try {
            this.a.putSize(str, size);
        } catch (Exception e) {
            a.a(C0201.m82(11821), C0201.m82(11820) + e.getMessage(), true);
        }
        return this;
    }

    @TargetApi(21)
    public SafeBundle putSizeF(String str, SizeF sizeF) {
        try {
            this.a.putSizeF(str, sizeF);
        } catch (Exception e) {
            a.a(C0201.m82(11823), C0201.m82(11822) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putSparseParcelableArray(String str, SparseArray<? extends Parcelable> sparseArray) {
        try {
            this.a.putSparseParcelableArray(str, sparseArray);
        } catch (Exception e) {
            a.a(C0201.m82(11825), C0201.m82(11824) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putString(String str, String str2) {
        try {
            this.a.putString(str, str2);
        } catch (Exception e) {
            a.a(C0201.m82(11827), C0201.m82(11826) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putStringArray(String str, String[] strArr) {
        try {
            this.a.putStringArray(str, strArr);
        } catch (Exception e) {
            a.a(C0201.m82(11829), C0201.m82(11828) + e.getMessage(), true);
        }
        return this;
    }

    public SafeBundle putStringArrayList(String str, ArrayList<String> arrayList) {
        try {
            this.a.putStringArrayList(str, arrayList);
        } catch (Exception e) {
            a.a(C0201.m82(11831), C0201.m82(11830) + e.getMessage(), true);
        }
        return this;
    }

    public void remove(String str) {
        try {
            this.a.remove(str);
        } catch (Exception unused) {
            a.a(C0201.m82(11832), C0201.m82(11833));
        }
    }

    public int size() {
        try {
            return this.a.size();
        } catch (Exception unused) {
            a.a(C0201.m82(11834), C0201.m82(11835));
            return 0;
        }
    }

    public String toString() {
        return this.a.toString();
    }

    public SafeBundle(Bundle bundle) {
        this.a = bundle == null ? new Bundle() : bundle;
    }

    public boolean getBoolean(String str, boolean z) {
        try {
            return this.a.getBoolean(str, z);
        } catch (Exception e) {
            a.a(C0201.m82(11654), C0201.m82(11653) + e.getMessage(), true);
            return z;
        }
    }

    public Bundle getBundle(String str) {
        try {
            return this.a.getBundle(str);
        } catch (Exception e) {
            a.a(C0201.m82(11660), C0201.m82(11659) + e.getMessage(), true);
            return null;
        }
    }

    public byte getByte(String str, byte b) {
        try {
            return this.a.getByte(str, b).byteValue();
        } catch (Exception e) {
            a.a(C0201.m82(11664), C0201.m82(11663) + e.getMessage(), true);
            return b;
        }
    }

    public char getChar(String str, char c) {
        try {
            return this.a.getChar(str, c);
        } catch (Exception e) {
            a.a(C0201.m82(11670), C0201.m82(11669) + e.getMessage(), true);
            return c;
        }
    }

    public CharSequence getCharSequence(String str, CharSequence charSequence) {
        try {
            return this.a.getCharSequence(str, charSequence);
        } catch (Exception e) {
            a.a(C0201.m82(11677), C0201.m82(11676) + e.getMessage(), true);
            return charSequence;
        }
    }

    public double getDouble(String str, double d) {
        try {
            return this.a.getDouble(str, d);
        } catch (Exception e) {
            a.a(C0201.m82(11693), C0201.m82(11692) + e.getMessage(), true);
            return d;
        }
    }

    public float getFloat(String str, float f) {
        try {
            return this.a.getFloat(str, f);
        } catch (Exception e) {
            a.a(C0201.m82(11699), C0201.m82(11698) + e.getMessage(), true);
            return f;
        }
    }

    public int getInt(String str, int i) {
        try {
            return this.a.getInt(str, i);
        } catch (Exception e) {
            a.a(C0201.m82(11705), C0201.m82(11704) + e.getMessage(), true);
            return i;
        }
    }

    public long getLong(String str, long j) {
        try {
            return this.a.getLong(str, j);
        } catch (Exception e) {
            a.a(C0201.m82(11715), C0201.m82(11714) + e.getMessage(), true);
            return j;
        }
    }

    public short getShort(String str, short s) {
        try {
            return this.a.getShort(str, s);
        } catch (Exception e) {
            a.a(C0201.m82(11733), C0201.m82(11732) + e.getMessage(), true);
            return s;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (Exception e) {
            a.a(C0201.m82(11748), C0201.m82(11747) + e.getMessage(), true);
            return str2;
        }
    }

    public CharSequence getCharSequenceReturnNotNull(String str, CharSequence charSequence) {
        try {
            CharSequence charSequence2 = this.a.getCharSequence(str, charSequence);
            return charSequence2 == null ? C0201.m82(11689) : charSequence2;
        } catch (Exception e) {
            a.a(C0201.m82(11691), C0201.m82(11690) + e.getMessage(), true);
            return charSequence;
        }
    }

    public String getStringReturnNotNull(String str, String str2) {
        try {
            String string = this.a.getString(str, str2);
            return string == null ? str2 : string;
        } catch (Exception e) {
            a.a(C0201.m82(11761), C0201.m82(11760) + e.getMessage(), true);
            return str2;
        }
    }
}
