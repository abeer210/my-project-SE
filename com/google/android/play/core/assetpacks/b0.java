package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public final class b0 {
    private static final gy1 c = new gy1(C0201.m82(30068));
    private final Context a;
    private final f2 b;

    static {
        TimeUnit.DAYS.toMillis(14);
        TimeUnit.DAYS.toMillis(28);
    }

    public b0(Context context, f2 f2Var) {
        this.a = context;
        this.b = f2Var;
    }

    private final File B(String str) {
        return new File(G(), str);
    }

    private final File C(String str, int i, long j) {
        return new File(m(str, i, j), C0201.m82(30069));
    }

    private final List<File> D() {
        ArrayList arrayList = new ArrayList();
        try {
            if (G().exists()) {
                if (G().listFiles() != null) {
                    File[] listFiles = G().listFiles();
                    for (File file : listFiles) {
                        if (!file.getCanonicalPath().equals(E().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            c.e(C0201.m82(30070), e);
        }
    }

    private final File E() {
        return new File(G(), C0201.m82(30071));
    }

    private final File F(String str, int i, long j) {
        return new File(new File(new File(E(), str), String.valueOf(i)), String.valueOf(j));
    }

    private final File G() {
        return new File(this.a.getFilesDir(), C0201.m82(30072));
    }

    private final File a(String str, int i) {
        return new File(B(str), String.valueOf(i));
    }

    private static void e(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long h = h(file);
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals(String.valueOf(h)) && !file2.getName().equals(C0201.m82(30073))) {
                    q(file2);
                }
            }
        }
    }

    private static long h(File file) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals(C0201.m82(30074))) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            c.d(e, C0201.m82(30075), new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private static boolean q(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= q(file2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    public final void A(String str, int i, long j) {
        if (F(str, i, j).exists()) {
            q(F(str, i, j));
        }
    }

    public final File b(String str, int i, long j) {
        return new File(a(str, i), String.valueOf(j));
    }

    public final File c(String str, int i, long j, String str2) {
        return new File(new File(new File(F(str, i, j), C0201.m82(30076)), C0201.m82(30077)), str2);
    }

    public final Map<String, b> d() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : D()) {
                b i = i(file.getName());
                if (i != null) {
                    hashMap.put(file.getName(), i);
                }
            }
        } catch (IOException e) {
            c.e(C0201.m82(30078), e);
        }
        return hashMap;
    }

    public final void f(String str, int i, long j, int i2) throws IOException {
        File C = C(str, i, j);
        Properties properties = new Properties();
        properties.put(C0201.m82(30079), String.valueOf(i2));
        C.getParentFile().mkdirs();
        C.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(C);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void g(List<String> list) {
        int a2 = this.b.a();
        List<File> D = D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            File file = D.get(i);
            if (!list.contains(file.getName()) && h(file) != ((long) a2)) {
                q(file);
            }
        }
    }

    public final b i(String str) throws IOException {
        String o = o(str);
        if (o == null) {
            return null;
        }
        File file = new File(o, C0201.m82(30080));
        if (file.isDirectory()) {
            return b.a(o, file.getCanonicalPath());
        }
        c.e(C0201.m82(30081), file);
        return null;
    }

    public final File j(String str, int i, long j) {
        return new File(b(str, i, j), C0201.m82(30082));
    }

    public final File k(String str, int i, long j, String str2) {
        return new File(new File(new File(F(str, i, j), C0201.m82(30083)), C0201.m82(30084)), str2);
    }

    public final Map<String, Long> l() {
        HashMap hashMap = new HashMap();
        for (String str : d().keySet()) {
            hashMap.put(str, Long.valueOf(x(str)));
        }
        return hashMap;
    }

    public final File m(String str, int i, long j) {
        return new File(F(str, i, j), C0201.m82(30085));
    }

    public final File n(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), C0201.m82(30086));
    }

    public final String o(String str) throws IOException {
        int length;
        File file = new File(G(), str);
        if (!file.exists()) {
            c.c(C0201.m82(30087), str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.b.a()));
        if (!file2.exists()) {
            c.c(C0201.m82(30088), str, Integer.valueOf(this.b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            c.c(C0201.m82(30090), str, Integer.valueOf(this.b.a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            c.e(C0201.m82(30089), str, Integer.valueOf(this.b.a()));
            return null;
        }
    }

    public final void p() {
        List<File> D = D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            File file = D.get(i);
            if (file.listFiles() != null) {
                e(file);
                long h = h(file);
                if (((long) this.b.a()) != h) {
                    try {
                        new File(new File(file, String.valueOf(h)), C0201.m82(30091)).createNewFile();
                    } catch (IOException unused) {
                        c.e(C0201.m82(30092), new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    e(file2);
                }
            }
        }
    }

    public final int r(String str, int i, long j) throws IOException {
        File C = C(str, i, j);
        if (!C.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(C);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            String r2 = C0201.m82(30093);
            String property = properties.getProperty(r2);
            String r5 = C0201.m82(30094);
            if (property != null) {
                try {
                    return Integer.parseInt(properties.getProperty(r2));
                } catch (NumberFormatException e) {
                    throw new t0(r5, e);
                }
            } else {
                throw new t0(r5);
            }
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final File s(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), C0201.m82(30095));
    }

    public final boolean t(String str) {
        if (!B(str).exists()) {
            return true;
        }
        return q(B(str));
    }

    public final int u(String str) {
        return (int) h(B(str));
    }

    public final File v(String str, int i, long j) {
        return new File(new File(F(str, i, j), C0201.m82(30096)), C0201.m82(30097));
    }

    public final File w(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), C0201.m82(30098));
    }

    public final long x(String str) {
        return h(a(str, u(str)));
    }

    public final File y(String str, int i, long j, String str2) {
        return new File(v(str, i, j), str2);
    }

    public final void z() {
        q(G());
    }
}
