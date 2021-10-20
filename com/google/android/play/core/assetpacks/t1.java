package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.common.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

public final class t1 implements i3 {
    private static final gy1 g = new gy1(C0201.m82(36594));
    private final String a;
    private final v b;
    private final Context c;
    private final f2 d;
    private final fz1<Executor> e;
    private final Handler f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public t1(File file, v vVar, x0 x0Var, Context context, f2 f2Var, fz1<Executor> fz1) {
        this.a = file.getAbsolutePath();
        this.b = vVar;
        this.c = context;
        this.d = f2Var;
        this.e = fz1;
    }

    public static long e(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    private static String f(File file) throws a {
        try {
            return v1.b(Arrays.asList(file));
        } catch (NoSuchAlgorithmException e2) {
            throw new a(C0201.m82(36596), e2);
        } catch (IOException e3) {
            throw new a(String.format(C0201.m82(36595), file), e3);
        }
    }

    private final void g(int i, String str, int i2) throws a {
        Bundle bundle = new Bundle();
        bundle.putInt(C0201.m82(36597), this.d.a());
        bundle.putInt(C0201.m82(36598), i);
        File[] j = j(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j2 = 0;
        for (File file : j) {
            j2 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a2 = sy1.a(file);
            bundle.putParcelableArrayList(jz1.b(C0201.m82(36599), str, a2), arrayList2);
            bundle.putString(jz1.b(C0201.m82(36600), str, a2), f(file));
            bundle.putLong(jz1.b(C0201.m82(36601), str, a2), file.length());
            arrayList.add(a2);
        }
        bundle.putStringArrayList(jz1.a(C0201.m82(36602), str), arrayList);
        bundle.putLong(jz1.a(C0201.m82(36603), str), (long) this.d.a());
        bundle.putInt(jz1.a(C0201.m82(36604), str), i2);
        bundle.putInt(jz1.a(C0201.m82(36605), str), 0);
        String r13 = C0201.m82(36606);
        bundle.putLong(jz1.a(r13, str), e(i2, j2));
        String r1 = C0201.m82(36607);
        bundle.putLong(jz1.a(r1, str), j2);
        bundle.putStringArrayList(C0201.m82(36608), new ArrayList<>(Arrays.asList(str)));
        bundle.putLong(r13, e(i2, j2));
        bundle.putLong(r1, j2);
        this.f.post(new s1(this, new Intent(C0201.m82(36609)).putExtra(C0201.m82(36610), bundle)));
    }

    private final File[] j(String str) throws a {
        File file = new File(this.a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new r1(str));
            if (listFiles != null) {
                int length = listFiles.length;
                if (length != 0) {
                    for (File file2 : listFiles) {
                        if (sy1.a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new a(String.format(C0201.m82(36611), str));
                }
                throw new a(String.format(C0201.m82(36612), str));
            }
            throw new a(String.format(C0201.m82(36613), str));
        }
        throw new a(String.format(C0201.m82(36614), file));
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void a() {
        g.f(C0201.m82(36615), new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void a(int i) {
        g.f(C0201.m82(36616), new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void a(int i, String str) {
        g.f(C0201.m82(36617), new Object[0]);
        this.e.a().execute(new q1(this, i, str));
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void a(List<String> list) {
        g.f(C0201.m82(36618), list);
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final s02<List<String>> b(Map<String, Long> map) {
        g.f(C0201.m82(36619), new Object[0]);
        return u02.b(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final s02<ParcelFileDescriptor> c(int i, String str, String str2, int i2) {
        String r0 = C0201.m82(36620);
        g.f(C0201.m82(36621), Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        d12 d12 = new d12();
        try {
            File[] j = j(str);
            for (File file : j) {
                if (sy1.a(file).equals(str2)) {
                    d12.c(ParcelFileDescriptor.open(file, 268435456));
                    return d12.a();
                }
            }
            throw new a(String.format(C0201.m82(36622), str2));
        } catch (FileNotFoundException e2) {
            g.g(r0, e2);
            d12.b(new a(C0201.m82(36623), e2));
        } catch (a e3) {
            g.g(r0, e3);
            d12.b(e3);
        }
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void d(int i, String str, String str2, int i2) {
        g.f(C0201.m82(36624), new Object[0]);
    }

    public final /* synthetic */ void h(Intent intent) {
        this.b.a(this.c, intent);
    }

    public final /* synthetic */ void i(int i, String str) {
        try {
            g(i, str, 4);
        } catch (a e2) {
            g.g(C0201.m82(36625), e2);
        }
    }
}
