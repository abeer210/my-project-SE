package defpackage;

import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import vigqyno.C0201;

/* renamed from: sc2  reason: default package */
/* compiled from: ImageConfig */
public class sc2 {
    public final File a;
    public final File b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;

    public sc2(File file, File file2, int i, int i2, int i3, int i4, boolean z) {
        this.a = file;
        this.b = file2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
    }

    public File a() {
        File file = this.b;
        return file != null ? file : this.a;
    }

    public sc2 b(ReadableMap readableMap) {
        boolean z;
        String r0 = C0201.m82(37701);
        int i = readableMap.hasKey(r0) ? (int) readableMap.getDouble(r0) : 0;
        String r02 = C0201.m82(37702);
        int i2 = readableMap.hasKey(r02) ? (int) readableMap.getDouble(r02) : 0;
        String r1 = C0201.m82(37703);
        int i3 = readableMap.hasKey(r1) ? (int) (readableMap.getDouble(r1) * 100.0d) : 100;
        String r03 = C0201.m82(37704);
        int i4 = readableMap.hasKey(r03) ? (int) readableMap.getDouble(r03) : 0;
        String r04 = C0201.m82(37705);
        if (readableMap.hasKey(r04)) {
            ReadableMap map = readableMap.getMap(r04);
            String r05 = C0201.m82(37706);
            if (map.hasKey(r05)) {
                z = map.getBoolean(r05);
                return new sc2(this.a, this.b, i, i2, i3, i4, z);
            }
        }
        z = false;
        return new sc2(this.a, this.b, i, i2, i3, i4, z);
    }

    public boolean c(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.c;
        return ((i < i6 && i6 > 0) || this.c == 0) && ((i2 < (i4 = this.d) && i4 > 0) || this.d == 0) && this.e == 100 && ((i5 = this.f) == 0 || i3 == i5);
    }

    public sc2 d(int i) {
        return new sc2(this.a, this.b, this.c, i, this.e, this.f, this.g);
    }

    public sc2 e(int i) {
        return new sc2(this.a, this.b, i, this.d, this.e, this.f, this.g);
    }

    public sc2 f(File file) {
        if (file != null) {
            MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath()).contains(C0201.m82(37707));
        }
        return new sc2(file, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public sc2 g(File file) {
        return new sc2(this.a, file, this.c, this.d, this.e, this.f, this.g);
    }
}
