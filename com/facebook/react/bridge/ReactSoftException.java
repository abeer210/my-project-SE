package com.facebook.react.bridge;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import vigqyno.C0201;

@zh0
@Deprecated
public class ReactSoftException {
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th);
    }

    @zh0
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        if (!sListeners.contains(reactSoftExceptionListener)) {
            sListeners.add(reactSoftExceptionListener);
        }
    }

    @zh0
    public static void clearListeners() {
        sListeners.clear();
    }

    @zh0
    public static void logSoftException(String str, Throwable th) {
        if (sListeners.size() > 0) {
            for (ReactSoftExceptionListener reactSoftExceptionListener : sListeners) {
                reactSoftExceptionListener.logSoftException(str, th);
            }
            return;
        }
        f60.j(str, C0201.m82(18276), th);
    }

    @zh0
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        sListeners.remove(reactSoftExceptionListener);
    }
}
