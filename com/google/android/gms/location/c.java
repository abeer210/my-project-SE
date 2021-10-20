package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import java.util.List;

@Deprecated
public interface c {
    h<Status> a(f fVar, PendingIntent pendingIntent);

    h<Status> b(f fVar, f fVar2, PendingIntent pendingIntent);

    h<Status> c(f fVar, List<String> list);
}
