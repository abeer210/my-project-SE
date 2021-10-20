package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: fh  reason: default package */
/* compiled from: StreamAssetPathFetcher */
public class fh extends tg<InputStream> {
    public fh(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.vg
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
