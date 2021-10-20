package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) aVar.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = aVar.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = aVar.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) aVar.r(remoteActionCompat.d, 4);
        remoteActionCompat.e = aVar.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = aVar.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.a, 1);
        aVar.D(remoteActionCompat.b, 2);
        aVar.D(remoteActionCompat.c, 3);
        aVar.H(remoteActionCompat.d, 4);
        aVar.z(remoteActionCompat.e, 5);
        aVar.z(remoteActionCompat.f, 6);
    }
}
