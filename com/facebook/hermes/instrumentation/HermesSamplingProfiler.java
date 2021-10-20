package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;
import vigqyno.C0201;

public class HermesSamplingProfiler {
    static {
        SoLoader.j(C0201.m82(15015));
    }

    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();
}
