package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    private final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private final Uri h;
    private Object i;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(d.a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public static final class b {
        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public b b(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f = uri;
            return this;
        }

        public b f(String str) {
            this.a = str;
            return this;
        }

        public b g(Uri uri) {
            this.h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        b bVar = new b();
        bVar.f(d.f(obj));
        bVar.i(d.h(obj));
        bVar.h(d.g(obj));
        bVar.b(d.b(obj));
        bVar.d(d.d(obj));
        bVar.e(d.e(obj));
        Bundle c2 = d.c(obj);
        if (c2 != null) {
            MediaSessionCompat.a(c2);
            uri = (Uri) c2.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (!c2.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || c2.size() != 2) {
                c2.remove("android.support.v4.media.description.MEDIA_URI");
                c2.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            bVar.c(bundle);
            if (uri == null) {
                bVar.g(uri);
            } else if (Build.VERSION.SDK_INT >= 23) {
                bVar.g(e.a(obj));
            }
            MediaDescriptionCompat a2 = bVar.a();
            a2.i = obj;
            return a2;
        }
        bundle = c2;
        bVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a22 = bVar.a();
        a22.i = obj;
        return a22;
    }

    public Object b() {
        if (this.i != null || Build.VERSION.SDK_INT < 21) {
            return this.i;
        }
        Object b2 = d.a.b();
        d.a.g(b2, this.a);
        d.a.i(b2, this.b);
        d.a.h(b2, this.c);
        d.a.c(b2, this.d);
        d.a.e(b2, this.e);
        d.a.f(b2, this.f);
        Bundle bundle = this.g;
        if (Build.VERSION.SDK_INT < 23 && this.h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
        }
        d.a.d(b2, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            e.a.a(b2, this.h);
        }
        Object a2 = d.a.a(b2);
        this.i = a2;
        return a2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i2);
            TextUtils.writeToParcel(this.c, parcel, i2);
            TextUtils.writeToParcel(this.d, parcel, i2);
            parcel.writeParcelable(this.e, i2);
            parcel.writeParcelable(this.f, i2);
            parcel.writeBundle(this.g);
            parcel.writeParcelable(this.h, i2);
            return;
        }
        d.i(b(), parcel, i2);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.e = (Bitmap) parcel.readParcelable(classLoader);
        this.f = (Uri) parcel.readParcelable(classLoader);
        this.g = parcel.readBundle(classLoader);
        this.h = (Uri) parcel.readParcelable(classLoader);
    }
}
