package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

/* compiled from: NativeImageTranscoderFactory */
public final class c {
    public static sh0 a(int i, boolean z) {
        try {
            return (sh0) Class.forName(C0201.m82(32732)).getConstructor(Integer.TYPE, Boolean.TYPE).newInstance(Integer.valueOf(i), Boolean.valueOf(z));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException(C0201.m82(32733), e);
        }
    }
}
