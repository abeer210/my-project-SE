package com.google.android.gms.vision;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.Keep;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vigqyno.C0201;

@Keep
public class EngineManager {
    private static final ConcurrentMap<Pair<String, String>, EngineManager> zzai = new ConcurrentHashMap();
    private final String zzaj;

    private EngineManager(String str, String str2) {
        str2 = str2.startsWith(C0201.m82(20473)) ? str2.substring(3) : str2;
        this.zzaj = str2.endsWith(C0201.m82(20474)) ? str2.substring(0, str2.length() - 3) : str2;
    }

    public static EngineManager zza(String str, String str2) {
        Pair<String, String> create = Pair.create(str, str2);
        if (zzai.get(create) != null) {
            return zzai.get(create);
        }
        zzai.putIfAbsent(create, new EngineManager(str, str2));
        return zzai.get(create);
    }

    public static File zzc(Context context) {
        return new File(C0201.m82(20475));
    }

    public final synchronized void zzb(Context context) {
        throw new UnsupportedOperationException(C0201.m82(20476));
    }

    public final synchronized boolean zza(Context context) {
        System.loadLibrary(this.zzaj);
        return true;
    }
}
