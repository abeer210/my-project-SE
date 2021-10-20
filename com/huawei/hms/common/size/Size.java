package com.huawei.hms.common.size;

import vigqyno.C0201;

public class Size {
    private final int height;
    private final int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static Size parseSize(String str) {
        try {
            int indexOf = str.indexOf(C0201.m82(7487));
            if (indexOf < 0) {
                indexOf = str.indexOf(C0201.m82(7488));
            }
            return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException(C0201.m82(7489));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width == size.width && this.height == size.height) {
            return true;
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final String toString() {
        int i = this.width;
        int i2 = this.height;
        return C0201.m82(7490) + i + C0201.m82(7491) + i2;
    }
}
