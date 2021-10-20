package com.huawei.hms.maps.model;

import vigqyno.C0201;

public interface TileProvider {
    public static final int DEFAULT_HEIGHT = 0;
    public static final int DEFAULT_WIDTH = 0;
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    static {
        C0201.m83(TileProvider.class, 505);
    }

    Tile getTile(int i, int i2, int i3);
}
