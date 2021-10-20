package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import vigqyno.C0201;

/* compiled from: ExoSoSource */
public final class e extends n {

    /* compiled from: ExoSoSource */
    private final class b extends n.f {
        public static final String b = null;
        public static final String c = null;
        public static final String d = null;
        public static final String e = null;
        public static final String f = null;
        public static final String g = null;
        private final c[] a;

        /* compiled from: ExoSoSource */
        private final class a extends n.e {
            private int a;

            private a() {
            }

            @Override // com.facebook.soloader.n.e
            public boolean a() {
                return this.a < b.this.a.length;
            }

            @Override // com.facebook.soloader.n.e
            public n.d c() throws IOException {
                c[] cVarArr = b.this.a;
                int i = this.a;
                this.a = i + 1;
                c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.c);
                try {
                    return new n.d(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        static {
            C0201.m83(b.class, 88);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
            r0.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f5, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f9, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
            r0.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
            throw r0;
         */
        public b(e eVar, n nVar) throws IOException {
            boolean z;
            Context context = eVar.c;
            File file = new File(e + context.getPackageName() + d);
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] g2 = SysUtil.g();
            for (String str : g2) {
                File file2 = new File(file, str);
                if (file2.isDirectory()) {
                    linkedHashSet.add(str);
                    File file3 = new File(file2, g);
                    if (file3.isFile()) {
                        FileReader fileReader = new FileReader(file3);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                bufferedReader.close();
                                fileReader.close();
                                break;
                            } else if (readLine.length() != 0) {
                                int indexOf = readLine.indexOf(32);
                                if (indexOf != -1) {
                                    String str2 = readLine.substring(0, indexOf) + f;
                                    int size = arrayList.size();
                                    int i = 0;
                                    while (true) {
                                        if (i >= size) {
                                            z = false;
                                            break;
                                        } else if (((c) arrayList.get(i)).a.equals(str2)) {
                                            z = true;
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                    if (!z) {
                                        String substring = readLine.substring(indexOf + 1);
                                        arrayList.add(new c(str2, substring, new File(file2, substring)));
                                    }
                                } else {
                                    throw new RuntimeException(b + readLine + c);
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            nVar.q((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            this.a = (c[]) arrayList.toArray(new c[arrayList.size()]);
        }

        @Override // com.facebook.soloader.n.f
        public n.c a() throws IOException {
            return new n.c(this.a);
        }

        @Override // com.facebook.soloader.n.f
        public n.e c() throws IOException {
            return new a();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ExoSoSource */
    public static final class c extends n.b {
        public final File c;

        public c(String str, String str2, File file) {
            super(str, str2);
            this.c = file;
        }
    }

    public e(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.n
    public n.f m() throws IOException {
        return new b(this, this);
    }
}
