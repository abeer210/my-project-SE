package defpackage;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

@TargetApi(24)
/* renamed from: pc1  reason: default package */
public final class pc1 {
    private static final Method b = c();
    private static final Method c = d();
    private final JobScheduler a;

    private pc1(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }

    private final int a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.a, jobInfo, str, Integer.valueOf(i), str2)).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, C0201.m82(15998), e);
            }
        }
        return this.a.schedule(jobInfo);
    }

    public static int b(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(C0201.m82(15999));
        if (b == null || context.checkSelfPermission(C0201.m82(16000)) != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new pc1(jobScheduler).a(jobInfo, str, e(), str2);
    }

    private static Method c() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod(C0201.m82(16001), JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            String r1 = C0201.m82(16002);
            if (!Log.isLoggable(r1, 6)) {
                return null;
            }
            Log.e(r1, C0201.m82(16003));
            return null;
        }
    }

    private static Method d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod(C0201.m82(16004), null);
            } catch (NoSuchMethodException unused) {
                String r2 = C0201.m82(16005);
                if (Log.isLoggable(r2, 6)) {
                    Log.e(r2, C0201.m82(16006));
                }
            }
        }
        return null;
    }

    private static int e() {
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                String r3 = C0201.m82(16007);
                if (Log.isLoggable(r3, 6)) {
                    Log.e(r3, C0201.m82(16008), e);
                }
            }
        }
        return 0;
    }
}
