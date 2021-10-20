package com.google.firebase.iid;

import java.util.concurrent.TimeUnit;

public final /* synthetic */ class i implements Runnable {
    private final h a;

    public i(h hVar) {
        this.a = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r4 = java.lang.String.valueOf(r1);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 8);
        r6.append("Sending ");
        r6.append(r4);
        android.util.Log.d("MessengerIpcClient", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r3 = r0.f.a;
        r4 = r0.b;
        r5 = android.os.Message.obtain();
        r5.what = r1.c;
        r5.arg1 = r1.a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.c());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.c.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        r0.b(2, r1.getMessage());
     */
    public final void run() {
        h hVar = this.a;
        while (true) {
            synchronized (hVar) {
                if (hVar.a == 2) {
                    if (hVar.d.isEmpty()) {
                        hVar.g();
                        return;
                    }
                    m<?> poll = hVar.d.poll();
                    hVar.e.put(poll.a, poll);
                    hVar.f.b.schedule(new l(hVar, poll), 30, TimeUnit.SECONDS);
                } else {
                    return;
                }
            }
        }
    }
}
