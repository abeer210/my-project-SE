package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i40  reason: default package */
/* compiled from: FileBinaryResource */
public class i40 implements h40 {
    private final File a;

    private i40(File file) {
        z50.g(file);
        this.a = file;
    }

    public static i40 b(File file) {
        if (file != null) {
            return new i40(file);
        }
        return null;
    }

    @Override // defpackage.h40
    public InputStream a() throws IOException {
        return new FileInputStream(this.a);
    }

    public File c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i40)) {
            return false;
        }
        return this.a.equals(((i40) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.h40
    public long size() {
        return this.a.length();
    }
}
