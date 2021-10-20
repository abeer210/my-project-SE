package com.facebook.react.bridge;

import androidx.core.util.Pools$SimplePool;
import vigqyno.C0201;

public class DynamicFromArray implements Dynamic {
    private static final Pools$SimplePool<DynamicFromArray> sPool = new Pools$SimplePool<>(10);
    private ReadableArray mArray;
    private int mIndex = -1;

    private DynamicFromArray() {
    }

    public static DynamicFromArray create(ReadableArray readableArray, int i) {
        DynamicFromArray b = sPool.b();
        if (b == null) {
            b = new DynamicFromArray();
        }
        b.mArray = readableArray;
        b.mIndex = i;
        return b;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getArray(this.mIndex);
        }
        throw new IllegalStateException(C0201.m82(7404));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getBoolean(this.mIndex);
        }
        throw new IllegalStateException(C0201.m82(7405));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getDouble(this.mIndex);
        }
        throw new IllegalStateException(C0201.m82(7406));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getInt(this.mIndex);
        }
        throw new IllegalStateException(C0201.m82(7407));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getMap(this.mIndex);
        }
        throw new IllegalStateException(C0201.m82(7408));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getString(this.mIndex);
        }
        throw new IllegalStateException(C0201.m82(7409));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getType(this.mIndex);
        }
        throw new IllegalStateException(C0201.m82(7410));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.isNull(this.mIndex);
        }
        throw new IllegalStateException(C0201.m82(7411));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.mArray = null;
        this.mIndex = -1;
        sPool.a(this);
    }
}
