package com.google.firebase.components;

import java.util.Map;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final /* synthetic */ class q implements Runnable {
    private final Map.Entry a;
    private final s12 b;

    private q(Map.Entry entry, s12 s12) {
        this.a = entry;
        this.b = s12;
    }

    public static Runnable a(Map.Entry entry, s12 s12) {
        return new q(entry, s12);
    }

    public void run() {
        ((t12) this.a.getKey()).a(this.b);
    }
}
