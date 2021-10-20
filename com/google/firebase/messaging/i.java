package com.google.firebase.messaging;

import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {
    private final h a;

    public i(h hVar) {
        this.a = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.k();
    }
}
