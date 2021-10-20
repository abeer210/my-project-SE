package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.f;
import com.facebook.soloader.n;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import vigqyno.C0201;

/* compiled from: ApkSoSource */
public class a extends f {
    private final int h;

    /* renamed from: com.facebook.soloader.a$a  reason: collision with other inner class name */
    /* compiled from: ApkSoSource */
    protected class C0051a extends f.c {
        private File e;
        private final int f;

        public C0051a(f fVar) throws IOException {
            super(fVar);
            this.e = new File(a.this.c.getApplicationInfo().nativeLibraryDir);
            this.f = a.this.h;
        }

        @Override // com.facebook.soloader.f.c
        public boolean n(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z = false;
            if (str.equals(a.this.d)) {
                a.this.d = null;
                str2 = String.format(C0201.m82(38951), str);
            } else if ((this.f & 1) == 0) {
                str2 = C0201.m82(38952) + name + C0201.m82(38953);
            } else {
                File file = new File(this.e, str);
                if (!file.isFile()) {
                    str2 = String.format(C0201.m82(38954), name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format(C0201.m82(38955), file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        str2 = C0201.m82(38956) + name + C0201.m82(38957);
                        Log.d(C0201.m82(38958), str2);
                        return z;
                    }
                }
            }
            z = true;
            Log.d(C0201.m82(38958), str2);
            return z;
        }
    }

    public a(Context context, File file, String str, int i) {
        super(context, str, file, C0201.m82(19707));
        this.h = i;
    }

    @Override // com.facebook.soloader.n
    public byte[] j() throws IOException {
        File canonicalFile = this.f.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.f(this.c));
            if ((this.h & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.c.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.n
    public n.f m() throws IOException {
        return new C0051a(this);
    }
}
