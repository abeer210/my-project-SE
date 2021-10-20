package com.huawei.hianalytics.ab.bc.ik.cd;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public class bc {
    private static bc bc = new bc();
    private static bc cd = new bc();
    private ThreadPoolExecutor ab = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000));

    /* access modifiers changed from: package-private */
    public static class ab implements Runnable {
        private Runnable ab;

        public ab(Runnable runnable) {
            this.ab = runnable;
        }

        public void run() {
            Runnable runnable = this.ab;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    com.huawei.hianalytics.ab.bc.ef.ab.ef(C0201.m82(36096), C0201.m82(36097));
                }
            }
        }
    }

    static {
        new bc();
        new bc();
    }

    private bc() {
    }

    public static bc ab() {
        return cd;
    }

    public static bc bc() {
        return bc;
    }

    public void ab(ab abVar) {
        try {
            this.ab.execute(new ab(abVar));
        } catch (RejectedExecutionException unused) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(C0201.m82(18536), C0201.m82(18537));
        }
    }
}
