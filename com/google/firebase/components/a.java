package com.google.firebase.components;

import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public abstract class a implements e {
    @Override // com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        x12<T> b = b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    @Override // com.google.firebase.components.e
    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
