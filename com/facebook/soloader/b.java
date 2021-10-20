package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import vigqyno.C0201;

/* compiled from: ApplicationSoSource */
public class b extends l {
    private Context a;
    private int b;
    private c c;

    public b(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext == null) {
            Log.w(C0201.m82(19846), C0201.m82(19847));
            this.a = context;
        }
        this.b = i;
        this.c = new c(new File(this.a.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // com.facebook.soloader.l
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.c.a(str, i, threadPolicy);
    }

    @Override // com.facebook.soloader.l
    public void b(int i) throws IOException {
        this.c.b(i);
    }

    @Override // com.facebook.soloader.l
    public File c(String str) throws IOException {
        return this.c.c(str);
    }

    public boolean d() throws IOException {
        try {
            File file = this.c.a;
            Context createPackageContext = this.a.createPackageContext(this.a.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            String r3 = C0201.m82(19848);
            Log.d(r3, C0201.m82(19849) + file + C0201.m82(19850) + file2);
            int i = this.b | 1;
            this.b = i;
            c cVar = new c(file2, i);
            this.c = cVar;
            cVar.b(this.b);
            this.a = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.soloader.l
    public String toString() {
        return this.c.toString();
    }
}
