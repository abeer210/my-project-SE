package com.huawei.hms.rn.map.utils;

import android.content.Context;
import com.huawei.hms.maps.model.Tile;
import com.huawei.hms.maps.model.TileProvider;
import java.util.HashMap;

/* compiled from: lambda */
public final /* synthetic */ class a implements TileProvider {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a(HashMap hashMap, Context context) {
        this.a = hashMap;
        this.b = context;
    }

    @Override // com.huawei.hms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        return ReactUtils.a(this.a, this.b, i, i2, i3);
    }
}
