package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: sg  reason: default package */
/* compiled from: AssetFileDescriptorLocalUriFetcher */
public final class sg extends dh<AssetFileDescriptor> {
    public sg(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.vg
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: g */
    public void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* renamed from: h */
    public AssetFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, C0201.m82(5376));
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(C0201.m82(5377) + uri);
    }
}
