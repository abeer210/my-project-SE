package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.ReadableMap;

/* compiled from: ReactNetworkImageRequest */
public class a extends ih0 {
    private final ReadableMap s;

    public a(jh0 jh0, ReadableMap readableMap) {
        super(jh0);
        this.s = readableMap;
    }

    public static a w(jh0 jh0, ReadableMap readableMap) {
        return new a(jh0, readableMap);
    }

    public ReadableMap x() {
        return this.s;
    }
}
