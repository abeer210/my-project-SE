package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.n;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import vigqyno.C0201;

/* compiled from: ExtractFromZipSoSource */
public class f extends n {
    public final File f;
    public final String g;

    /* access modifiers changed from: private */
    /* compiled from: ExtractFromZipSoSource */
    public static final class b extends n.b implements Comparable {
        public final ZipEntry c;
        public final int d;

        public b(String str, ZipEntry zipEntry, int i) {
            super(str, b(zipEntry));
            this.c = zipEntry;
            this.d = i;
        }

        private static String b(ZipEntry zipEntry) {
            return String.format(C0201.m82(30884), zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.a.compareTo(((b) obj).a);
        }
    }

    /* access modifiers changed from: protected */
    /* compiled from: ExtractFromZipSoSource */
    public class c extends n.f {
        private b[] a;
        private final ZipFile b;
        private final n c;

        /* compiled from: ExtractFromZipSoSource */
        private final class a extends n.e {
            private int a;

            private a() {
            }

            @Override // com.facebook.soloader.n.e
            public boolean a() {
                c.this.m();
                return this.a < c.this.a.length;
            }

            @Override // com.facebook.soloader.n.e
            public n.d c() throws IOException {
                c.this.m();
                b[] bVarArr = c.this.a;
                int i = this.a;
                this.a = i + 1;
                b bVar = bVarArr[i];
                InputStream inputStream = c.this.b.getInputStream(bVar.c);
                try {
                    return new n.d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public c(n nVar) throws IOException {
            this.b = new ZipFile(f.this.f);
            this.c = nVar;
        }

        @Override // com.facebook.soloader.n.f
        public final n.c a() throws IOException {
            return new n.c(m());
        }

        @Override // com.facebook.soloader.n.f
        public final n.e c() throws IOException {
            return new a();
        }

        @Override // java.io.Closeable, com.facebook.soloader.n.f, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        public final b[] m() {
            if (this.a == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(f.this.g);
                String[] g = SysUtil.g();
                Enumeration<? extends ZipEntry> entries = this.b.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int d2 = SysUtil.d(g, group);
                        if (d2 >= 0) {
                            linkedHashSet.add(group);
                            b bVar = (b) hashMap.get(group2);
                            if (bVar == null || d2 < bVar.d) {
                                hashMap.put(group2, new b(group2, zipEntry, d2));
                            }
                        }
                    }
                }
                this.c.q((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                b[] bVarArr = (b[]) hashMap.values().toArray(new b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    b bVar2 = bVarArr[i2];
                    if (n(bVar2.c, bVar2.a)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                b[] bVarArr2 = new b[i];
                int i3 = 0;
                for (b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i3] = bVar3;
                        i3++;
                    }
                }
                this.a = bVarArr2;
            }
            return this.a;
        }

        public boolean n(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public f(Context context, String str, File file, String str2) {
        super(context, str);
        this.f = file;
        this.g = str2;
    }
}
