package com.google.firebase.components;

import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final /* synthetic */ class j implements x12 {
    private final Set a;

    private j(Set set) {
        this.a = set;
    }

    public static x12 a(Set set) {
        return new j(set);
    }

    @Override // defpackage.x12
    public Object get() {
        return l.g(this.a);
    }
}
