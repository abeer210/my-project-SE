package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Preconditions;
import java.util.Iterator;
import vigqyno.C0201;

public class DBInnerIter<O> implements Iterator<O> {
    public final DataBuffer<O> dataBuffer;
    public int index = -1;

    public DBInnerIter(DataBuffer<O> dataBuffer2) {
        Preconditions.checkNotNull(dataBuffer2, C0201.m82(29334));
        this.dataBuffer = dataBuffer2;
    }

    public boolean hasNext() {
        return this.index + 1 < this.dataBuffer.getCount();
    }

    @Override // java.util.Iterator
    public O next() {
        if (!hasNext()) {
            return null;
        }
        DataBuffer<O> dataBuffer2 = this.dataBuffer;
        int i = this.index + 1;
        this.index = i;
        return dataBuffer2.get(i);
    }
}
