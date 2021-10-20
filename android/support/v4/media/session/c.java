package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MediaControllerCompat */
public abstract class c implements IBinder.DeathRecipient {
    public final Object a;
    public a b;
    public a c;

    /* access modifiers changed from: private */
    /* compiled from: MediaControllerCompat */
    public class a extends Handler {
    }

    /* compiled from: MediaControllerCompat */
    private static class b implements e.a {
        private final WeakReference<c> a;

        public b(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.e.a
        public void A() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void a(Object obj) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void b(int i, int i2, int i3, int i4, int i5) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(new d(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void c(Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void d(Object obj) {
            c cVar = this.a.get();
            if (cVar != null && cVar.c == null) {
                cVar.d(PlaybackStateCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void e(String str, Bundle bundle) {
            c cVar = this.a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.c == null || Build.VERSION.SDK_INT >= 23) {
                cVar.h(str, bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void g(List<?> list) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void k(CharSequence charSequence) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$c  reason: collision with other inner class name */
    /* compiled from: MediaControllerCompat */
    public static class BinderC0005c extends a.AbstractBinderC0003a {
        private final WeakReference<c> a;

        public BinderC0005c(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void A() throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void J3(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void K3(String str, Bundle bundle) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void N1(boolean z) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void T3(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.a, parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.d, parcelableVolumeInfo.e) : null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void Z1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void c(Bundle bundle) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void g(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void j2(int i) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void k(CharSequence charSequence) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void l1(boolean z) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void u0() throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void z2(int i) throws RemoteException {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i), null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = e.a(new b(this));
        } else {
            this.c = new BinderC0005c(this);
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    public void i(int i, Object obj, Bundle bundle) {
        a aVar = this.b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
