package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public class MediaBrowserCompat$ItemReceiver extends c {
    private final String c;
    private final b d;

    @Override // defpackage.c
    public void a(int i, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.d.a(this.c);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.d.b((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.d.a(this.c);
        }
    }
}
