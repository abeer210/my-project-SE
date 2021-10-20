package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: MediaDescriptionCompatApi23 */
public class e {

    /* access modifiers changed from: package-private */
    /* compiled from: MediaDescriptionCompatApi23 */
    public static class a {
        public static void a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
