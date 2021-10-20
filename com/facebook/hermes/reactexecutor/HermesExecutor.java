package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import vigqyno.C0201;

public class HermesExecutor extends JavaScriptExecutor {
    private static String a;

    static {
        SoLoader.j(C0201.m82(10907));
        try {
            SoLoader.j(C0201.m82(10908));
            a = C0201.m82(10909);
        } catch (UnsatisfiedLinkError unused) {
            SoLoader.j(C0201.m82(10910));
            a = C0201.m82(10911);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public HermesExecutor(b bVar) {
        super(r3);
        HybridData hybridData;
        if (bVar == null) {
            hybridData = initHybridDefaultConfig();
        } else {
            hybridData = initHybrid(bVar.a, bVar.b);
        }
    }

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(long j, boolean z);

    private static native HybridData initHybridDefaultConfig();

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return C0201.m82(10912) + a;
    }
}
