package com.huawei.hms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
import vigqyno.C0201;

public final class DataBufferUtils {
    public static final int ARGS_BUNDLE = 0;
    public static final int ARGS_COLUMN = 0;
    public static final int ARGS_CURSOR = 0;
    public static final int ARGS_STATUS = 0;
    public static final int ARGS_VERSION = 0;
    public static final String NEXT_PAGE = null;
    public static final String PREV_PAGE = null;

    static {
        C0201.m83(DataBufferUtils.class, 397);
    }

    private DataBufferUtils() {
    }

    private static boolean containKey(Bundle bundle, String str) {
        return (bundle == null || bundle.getString(str) == null) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.ArrayList<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(DataBuffer<E> dataBuffer) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        for (E e : dataBuffer) {
            arrayList.add(e.freeze());
        }
        dataBuffer.release();
        return arrayList;
    }

    public static boolean hasData(DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    public static boolean hasNextPage(DataBuffer<?> dataBuffer) {
        return containKey(dataBuffer.getMetadata(), C0201.m82(35494));
    }

    public static boolean hasPrevPage(DataBuffer<?> dataBuffer) {
        return containKey(dataBuffer.getMetadata(), C0201.m82(35495));
    }
}
