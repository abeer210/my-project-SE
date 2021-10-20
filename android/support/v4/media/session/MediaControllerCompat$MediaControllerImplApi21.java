package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

public class MediaControllerCompat$MediaControllerImplApi21 {
    public final Object a;
    private final List<c> b;
    private HashMap<c, a> c;
    public final MediaSessionCompat.Token d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> a;

        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
                    mediaControllerCompat$MediaControllerImplApi21.d.b(b.a.i(d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class a extends c.BinderC0005c {
        public a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0005c
        public void A() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0005c
        public void T3(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0005c
        public void Z1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0005c
        public void c(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0005c
        public void g(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0005c
        public void k(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }
    }

    public void a() {
        if (this.d.a() != null) {
            for (c cVar : this.b) {
                a aVar = new a(cVar);
                this.c.put(cVar, aVar);
                cVar.c = aVar;
                try {
                    this.d.a().H(aVar);
                    cVar.i(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.b.clear();
        }
    }
}
