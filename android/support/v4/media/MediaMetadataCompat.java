package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();
    public static final r0<String, Integer> c;
    public final Bundle a;
    private Object b;

    static class a implements Parcelable.Creator<MediaMetadataCompat> {
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        r0<String, Integer> r0Var = new r0<>();
        c = r0Var;
        r0Var.put("android.media.metadata.TITLE", 1);
        c.put("android.media.metadata.ARTIST", 1);
        c.put("android.media.metadata.DURATION", 0);
        c.put("android.media.metadata.ALBUM", 1);
        c.put("android.media.metadata.AUTHOR", 1);
        c.put("android.media.metadata.WRITER", 1);
        c.put("android.media.metadata.COMPOSER", 1);
        c.put("android.media.metadata.COMPILATION", 1);
        c.put("android.media.metadata.DATE", 1);
        c.put("android.media.metadata.YEAR", 0);
        c.put("android.media.metadata.GENRE", 1);
        c.put("android.media.metadata.TRACK_NUMBER", 0);
        c.put("android.media.metadata.NUM_TRACKS", 0);
        c.put("android.media.metadata.DISC_NUMBER", 0);
        c.put("android.media.metadata.ALBUM_ARTIST", 1);
        c.put("android.media.metadata.ART", 2);
        c.put("android.media.metadata.ART_URI", 1);
        c.put("android.media.metadata.ALBUM_ART", 2);
        c.put("android.media.metadata.ALBUM_ART_URI", 1);
        c.put("android.media.metadata.USER_RATING", 3);
        c.put("android.media.metadata.RATING", 3);
        c.put("android.media.metadata.DISPLAY_TITLE", 1);
        c.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c.put("android.media.metadata.DISPLAY_ICON", 2);
        c.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c.put("android.media.metadata.MEDIA_ID", 1);
        c.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c.put("android.media.metadata.MEDIA_URI", 1);
        c.put("android.media.metadata.ADVERTISEMENT", 0);
        c.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        f.a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.b = obj;
        return createFromParcel;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
