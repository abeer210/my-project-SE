package com.huawei.hms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.Preconditions;
import vigqyno.C0201;

public class DataBufferRef {
    public final DataHolder mDataHolder;
    public int mDataRow;
    private int windowIndex;

    public DataBufferRef(DataHolder dataHolder, int i) {
        Preconditions.checkNotNull(dataHolder, C0201.m82(5801));
        this.mDataHolder = dataHolder;
        getWindowIndex(i);
    }

    public void copyToBuffer(String str, CharArrayBuffer charArrayBuffer) {
        this.mDataHolder.copyToBuffer(str, this.mDataRow, this.windowIndex, charArrayBuffer);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DataBufferRef)) {
            return false;
        }
        DataBufferRef dataBufferRef = (DataBufferRef) obj;
        if (dataBufferRef.mDataRow == this.mDataRow && dataBufferRef.windowIndex == this.windowIndex && dataBufferRef.mDataHolder == this.mDataHolder) {
            return true;
        }
        return false;
    }

    public boolean getBoolean(String str) {
        Object value = this.mDataHolder.getValue(str, this.mDataRow, this.windowIndex, C0201.m82(5802));
        if (value != null) {
            return ((Boolean) value).booleanValue();
        }
        return false;
    }

    public byte[] getByteArray(String str) {
        Object value = this.mDataHolder.getValue(str, this.mDataRow, this.windowIndex, C0201.m82(5803));
        if (value != null) {
            return (byte[]) value;
        }
        return null;
    }

    public int getDataRow() {
        return this.mDataRow;
    }

    public double getDouble(String str) {
        Object value = this.mDataHolder.getValue(str, this.mDataRow, this.windowIndex, C0201.m82(5804));
        if (value != null) {
            return ((Double) value).doubleValue();
        }
        return -1.0d;
    }

    public float getFloat(String str) {
        Object value = this.mDataHolder.getValue(str, this.mDataRow, this.windowIndex, C0201.m82(5805));
        if (value != null) {
            return ((Float) value).floatValue();
        }
        return -1.0f;
    }

    public int getInteger(String str) {
        Object value = this.mDataHolder.getValue(str, this.mDataRow, this.windowIndex, C0201.m82(5806));
        if (value != null) {
            return ((Integer) value).intValue();
        }
        return -1;
    }

    public long getLong(String str) {
        Object value = this.mDataHolder.getValue(str, this.mDataRow, this.windowIndex, C0201.m82(5807));
        if (value != null) {
            return ((Long) value).longValue();
        }
        return -1;
    }

    public String getString(String str) {
        Object value = this.mDataHolder.getValue(str, this.mDataRow, this.windowIndex, C0201.m82(5808));
        return value != null ? (String) value : C0201.m82(5809);
    }

    public final void getWindowIndex(int i) {
        Preconditions.checkArgument(i >= 0 && i < this.mDataHolder.getCount(), C0201.m82(5810));
        this.mDataRow = i;
        this.windowIndex = this.mDataHolder.getWindowIndex(i);
    }

    public boolean hasColumn(String str) {
        return this.mDataHolder.hasColumn(str);
    }

    public boolean hasNull(String str) {
        return this.mDataHolder.hasNull(str, this.mDataRow, this.windowIndex);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mDataRow), Integer.valueOf(this.windowIndex), this.mDataHolder);
    }

    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    public Uri parseUri(String str) {
        String str2 = (String) this.mDataHolder.getValue(str, this.mDataRow, this.windowIndex, C0201.m82(5811));
        if (str2 == null) {
            return null;
        }
        return Uri.parse(str2);
    }
}
