package com.dynatrace.android.agent;

import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: RootDetector */
public class w {
    private static final String a = (u.b + C0201.m82(2048));
    private static final File b = new File(C0201.m82(2049));
    private static final String[] c = {C0201.m82(2050), C0201.m82(2051)};

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A[SYNTHETIC, Splitter:B:20:0x0047] */
    private static boolean a() {
        Exception e;
        try {
            Process exec = Runtime.getRuntime().exec(c);
            BufferedReader bufferedReader = null;
            try {
                ArrayList arrayList = new ArrayList();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        if (u.c) {
                            s30.u(a, C0201.m82(2052), e);
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                if (u.c) {
                                    s30.u(a, C0201.m82(2053), e3);
                                }
                            }
                        }
                        return false;
                    }
                }
                if (arrayList.size() > 0) {
                    return true;
                }
                return false;
            } catch (Exception e4) {
                e = e4;
                if (u.c) {
                }
                if (bufferedReader != null) {
                }
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b() {
        try {
            return b.exists();
        } catch (Exception e) {
            if (!u.c) {
                return false;
            }
            s30.u(a, b.toString(), e);
            return false;
        }
    }

    private static boolean c() {
        String str = Build.TAGS;
        return str != null && str.contains(C0201.m82(2054));
    }

    public static boolean d() {
        return c() || b() || a();
    }
}
