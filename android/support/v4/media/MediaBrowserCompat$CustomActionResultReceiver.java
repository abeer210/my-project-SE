package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

public class MediaBrowserCompat$CustomActionResultReceiver extends c {
    private final String c;
    private final Bundle d;
    private final a e;

    @Override // defpackage.c
    public void a(int i, Bundle bundle) {
        if (this.e != null) {
            MediaSessionCompat.a(bundle);
            if (i == -1) {
                this.e.a(this.c, this.d, bundle);
            } else if (i == 0) {
                this.e.c(this.c, this.d, bundle);
            } else if (i != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.d + ", resultData=" + bundle + ")");
            } else {
                this.e.b(this.c, this.d, bundle);
            }
        }
    }
}
