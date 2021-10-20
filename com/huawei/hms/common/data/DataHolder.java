package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final String TAG = null;
    public static final String TYPE_BOOLEAN = null;
    public static final String TYPE_BYTE_ARRAY = null;
    public static final String TYPE_DOUBLE = null;
    public static final String TYPE_FLOAT = null;
    public static final String TYPE_INT = null;
    public static final String TYPE_LONG = null;
    public static final String TYPE_STRING = null;
    private static final Builder builder = new DataHolderBuilderCreator(new String[0], null);
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;

    public static class Builder {
        private String[] builderColumns;
        private final ArrayList<HashMap<String, Object>> dataCollectionList;
        private final String type;
        private final HashMap<Object, Integer> typeAndDataCollectionCountMapping;

        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
        public Builder setDataForContentValuesHashMap(HashMap<String, Object> hashMap) {
            int i;
            Object obj;
            Preconditions.checkNotNull(hashMap, C0201.m82(36831));
            String str = this.type;
            boolean z = false;
            if (!(str == null || (obj = hashMap.get(str)) == null)) {
                Integer num = this.typeAndDataCollectionCountMapping.get(obj);
                if (num != null) {
                    i = num.intValue();
                    z = true;
                    if (!z) {
                        this.dataCollectionList.remove(i);
                        this.dataCollectionList.add(i, hashMap);
                    } else {
                        this.dataCollectionList.add(hashMap);
                    }
                    return this;
                }
                this.typeAndDataCollectionCountMapping.put(obj, Integer.valueOf(this.dataCollectionList.size()));
            }
            i = 0;
            if (!z) {
            }
            return this;
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, C0201.m82(36832));
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(hashMap);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, C0201.m82(36830));
            this.builderColumns = strArr;
            this.dataCollectionList = new ArrayList<>();
            this.type = str;
            this.typeAndDataCollectionCountMapping = new HashMap<>();
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1);
        }

        public Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    static {
        C0201.m83(DataHolder.class, 230);
    }

    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    private void checkAvailable(String str, int i) {
        String str2;
        Bundle bundle = this.columnsBundle;
        if (bundle == null || !bundle.containsKey(str)) {
            str2 = C0201.m82(30360) + str;
        } else if (isClosed()) {
            str2 = C0201.m82(30357);
        } else if (i < 0 || i >= this.dataCount) {
            str2 = C0201.m82(30359) + i;
        } else {
            str2 = C0201.m82(30358);
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(builder, i, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, i, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            String r2 = C0201.m82(30361);
            HMSLog.e(r2, C0201.m82(30362) + th.getMessage());
            return new CursorWindow[0];
        } finally {
            hMSCursorWrapper.close();
        }
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder2, int i, List list) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        CursorWindow cursorWindow = new CursorWindow((String) null);
        cursorWindow.setNumColumns(builder2.builderColumns.length);
        arrayList.add(cursorWindow);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            try {
                boolean allocRow = cursorWindow.allocRow();
                String r6 = C0201.m82(30363);
                if (!allocRow) {
                    HMSLog.d(r6, C0201.m82(30364));
                    cursorWindow = new CursorWindow((String) null);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder2.builderColumns.length);
                    if (!cursorWindow.allocRow()) {
                        HMSLog.e(r6, C0201.m82(30365));
                        return arrayList;
                    }
                    arrayList.add(cursorWindow);
                }
                HashMap hashMap = (HashMap) list.get(i2);
                boolean z = true;
                int i3 = 0;
                while (i3 < builder2.builderColumns.length && (z = putValue(cursorWindow, hashMap.get(builder2.builderColumns[i3]), i2, i3))) {
                    i3++;
                }
                if (!z) {
                    HMSLog.d(r6, C0201.m82(30366) + i2);
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow2 = new CursorWindow((String) null);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(builder2.builderColumns.length);
                    arrayList.add(cursorWindow2);
                    break;
                }
                i2++;
            } catch (RuntimeException e) {
                Iterator<CursorWindow> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                throw e;
            }
        }
        return arrayList;
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i, int i2) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i < i2 && hMSCursorWrapper.moveToPosition(i)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i);
                hMSCursorWrapper.fillWindow(i, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i, int i2) throws IllegalArgumentException {
        if (obj == null) {
            return cursorWindow.putNull(i, i2);
        }
        if (obj instanceof Boolean) {
            return cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i, i2);
        } else if (obj instanceof Integer) {
            return cursorWindow.putLong((long) ((Integer) obj).intValue(), i, i2);
        } else {
            if (obj instanceof Long) {
                return cursorWindow.putLong(((Long) obj).longValue(), i, i2);
            }
            if (obj instanceof Float) {
                return cursorWindow.putDouble((double) ((Float) obj).floatValue(), i, i2);
            }
            if (obj instanceof Double) {
                return cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
            }
            if (obj instanceof String) {
                return cursorWindow.putString((String) obj, i, i2);
            }
            if (obj instanceof byte[]) {
                return cursorWindow.putBlob((byte[]) obj, i, i2);
            }
            throw new IllegalArgumentException(C0201.m82(30367) + obj);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.mClosed) {
            for (CursorWindow cursorWindow : this.cursorWindows) {
                cursorWindow.close();
            }
            this.mClosed = true;
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.columns;
            if (i2 >= strArr.length) {
                break;
            }
            this.columnsBundle.putInt(strArr[i2], i2);
            i2++;
        }
        this.perCursorCounts = new int[this.cursorWindows.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.cursorWindows;
            if (i < cursorWindowArr.length) {
                this.perCursorCounts[i] = i3;
                i3 = cursorWindowArr[i].getStartPosition() + this.cursorWindows[i].getNumRows();
                i++;
            } else {
                this.dataCount = i3;
                return;
            }
        }
    }

    public final void copyToBuffer(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i);
        this.cursorWindows[i2].copyStringToBuffer(i, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    @Override // java.lang.Object
    public final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object getValue(String str, int i, int i2, String str2) {
        char c;
        boolean z = true;
        switch (str2.hashCode()) {
            case -1092271849:
                if (str2.equals(C0201.m82(30374))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -870070237:
                if (str2.equals(C0201.m82(30373))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -675993238:
                if (str2.equals(C0201.m82(30372))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 445002870:
                if (str2.equals(C0201.m82(30371))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 519136353:
                if (str2.equals(C0201.m82(30370))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 878975158:
                if (str2.equals(C0201.m82(30369))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1300508295:
                if (str2.equals(C0201.m82(30368))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                checkAvailable(str, i);
                return Integer.valueOf(this.cursorWindows[i2].getInt(i, this.columnsBundle.getInt(str)));
            case 1:
                checkAvailable(str, i);
                return Long.valueOf(this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)));
            case 2:
                checkAvailable(str, i);
                return this.cursorWindows[i2].getString(i, this.columnsBundle.getInt(str));
            case 3:
                checkAvailable(str, i);
                if (this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)) != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                checkAvailable(str, i);
                return Float.valueOf(this.cursorWindows[i2].getFloat(i, this.columnsBundle.getInt(str)));
            case 5:
                checkAvailable(str, i);
                return Double.valueOf(this.cursorWindows[i2].getDouble(i, this.columnsBundle.getInt(str)));
            case 6:
                checkAvailable(str, i);
                return this.cursorWindows[i2].getBlob(i, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i) {
        int i2 = 0;
        Preconditions.checkArgument(i >= 0 || i < this.dataCount, C0201.m82(30375) + i);
        while (true) {
            int[] iArr = this.perCursorCounts;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.perCursorCounts.length ? i2 - 1 : i2;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i, int i2) {
        checkAvailable(str, i);
        return this.cursorWindows[i2].getType(i, this.columnsBundle.getInt(str)) == 0;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, C0188.f18, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i2;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        Preconditions.checkNotNull(strArr, C0201.m82(30355));
        Preconditions.checkNotNull(strArr, C0201.m82(30356));
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    private static CursorWindow[] getCursorWindows(Builder builder2, int i) {
        if (builder2.builderColumns.length == 0) {
            return new CursorWindow[0];
        }
        if (i < 0 || i >= builder2.dataCollectionList.size()) {
            i = builder2.dataCollectionList.size();
        }
        ArrayList<CursorWindow> iterCursorWindow = iterCursorWindow(builder2, i, builder2.dataCollectionList.subList(0, i));
        return (CursorWindow[]) iterCursorWindow.toArray(new CursorWindow[iterCursorWindow.size()]);
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i, bundle);
    }

    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i, bundle);
    }

    private DataHolder(Builder builder2, int i, Bundle bundle) {
        this(builder2.builderColumns, getCursorWindows(builder2, -1), i, (Bundle) null);
    }

    private DataHolder(Builder builder2, int i, Bundle bundle, int i2) {
        this(builder2.builderColumns, getCursorWindows(builder2, -1), i, bundle);
    }
}
