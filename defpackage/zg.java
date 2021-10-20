package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: zg  reason: default package */
/* compiled from: FileDescriptorAssetPathFetcher */
public class zg extends tg<ParcelFileDescriptor> {
    public zg(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.vg
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: g */
    public void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* renamed from: h */
    public ParcelFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
