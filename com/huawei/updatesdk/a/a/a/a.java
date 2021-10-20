package com.huawei.updatesdk.a.a.a;

import java.util.ArrayDeque;
import java.util.Queue;
import vigqyno.C0201;

public final class a {
    private static final a b = new a();
    private final Queue<byte[]> a = new ArrayDeque(0);

    private a() {
    }

    public static a b() {
        return b;
    }

    public void a(byte[] bArr) {
        if (bArr.length == 65536) {
            synchronized (this.a) {
                if (this.a.size() < 32 && !this.a.offer(bArr)) {
                    com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(37153), C0201.m82(37154));
                }
            }
        }
    }

    public byte[] a() {
        byte[] poll;
        synchronized (this.a) {
            poll = this.a.poll();
        }
        return poll == null ? new byte[65536] : poll;
    }
}
