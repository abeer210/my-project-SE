package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.vision.L;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

@Keep
public class DynamiteClearcutLogger {
    private static final ThreadPoolExecutor zzbo = new ThreadPoolExecutor(1, 2, 2, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new ThreadPoolExecutor.DiscardPolicy());
    private b zzbp = new b(0.03333333333333333d);
    private VisionClearcutLogger zzbq;

    public DynamiteClearcutLogger(Context context) {
        this.zzbq = new VisionClearcutLogger(context);
    }

    public final void zza(int i, oj1 oj1) {
        if (i != 3 || this.zzbp.a()) {
            zzbo.execute(new a(this, i, oj1));
            return;
        }
        L.zza(C0201.m82(36862), new Object[0]);
    }
}
