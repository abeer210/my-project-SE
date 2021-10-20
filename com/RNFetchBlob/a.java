package com.RNFetchBlob;

import android.net.Uri;
import android.util.Base64;
import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import vigqyno.C0201;

/* compiled from: RNFetchBlobBody */
public class a extends RequestBody {
    public static final String A = null;
    public static final String B = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private InputStream a;
    private long b = 0;
    private ReadableArray c;
    private String d;
    private String e;
    private g.e f;
    private MediaType g;
    private File h;
    private Boolean i = Boolean.FALSE;

    /* access modifiers changed from: package-private */
    /* renamed from: com.RNFetchBlob.a$a  reason: collision with other inner class name */
    /* compiled from: RNFetchBlobBody */
    public static /* synthetic */ class C0029a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[g.e.values().length];
            a = iArr;
            iArr[g.e.SingleFile.ordinal()] = 1;
            a[g.e.AsIs.ordinal()] = 2;
            try {
                a[g.e.Others.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: RNFetchBlobBody */
    public class b {
        public String a;
        public String b;
        public String c;
        public String d;

        public b(a aVar, ReadableMap readableMap) {
            String r2 = C0201.m82(30648);
            if (readableMap.hasKey(r2)) {
                this.a = readableMap.getString(r2);
            }
            String r22 = C0201.m82(30649);
            if (readableMap.hasKey(r22)) {
                this.b = readableMap.getString(r22);
            }
            String r23 = C0201.m82(30650);
            if (readableMap.hasKey(r23)) {
                this.c = readableMap.getString(r23);
            } else {
                this.c = this.b == null ? C0201.m82(30651) : C0201.m82(30652);
            }
            String r24 = C0201.m82(30653);
            if (readableMap.hasKey(r24)) {
                this.d = readableMap.getString(r24);
            }
        }
    }

    static {
        C0201.m83(a.class, 60);
    }

    public a(String str) {
        this.d = str;
    }

    private ArrayList<b> c() throws IOException {
        long j2;
        int i2;
        ArrayList<b> arrayList = new ArrayList<>();
        ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
        long j3 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            b bVar = new b(this, this.c.getMap(i3));
            arrayList.add(bVar);
            String str = bVar.d;
            if (str == null) {
                h.a(C0201.m82(19407) + bVar.a + C0201.m82(19408));
            } else {
                if (bVar.b == null) {
                    i2 = str.getBytes().length;
                } else if (str.startsWith(C0201.m82(19409))) {
                    String w2 = d.w(str.substring(19));
                    if (d.q(w2)) {
                        try {
                            i2 = reactApplicationContext.getAssets().open(w2.replace(C0201.m82(19410), C0201.m82(19411))).available();
                        } catch (IOException e2) {
                            h.a(e2.getLocalizedMessage());
                        }
                    } else {
                        j2 = new File(d.w(w2)).length();
                        j3 += j2;
                    }
                } else if (str.startsWith(C0201.m82(19412))) {
                    String substring = str.substring(22);
                    InputStream inputStream = null;
                    try {
                        inputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(substring));
                        j3 += (long) inputStream.available();
                        if (inputStream == null) {
                        }
                    } catch (Exception e3) {
                        h.a(C0201.m82(19413) + substring + C0201.m82(19414) + e3.getLocalizedMessage());
                        if (inputStream == null) {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                    inputStream.close();
                } else {
                    i2 = Base64.decode(str, 0).length;
                }
                j2 = (long) i2;
                j3 += j2;
            }
        }
        this.b = j3;
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0148, code lost:
        if (r10 != null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x014a, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x016f, code lost:
        if (r10 == null) goto L_0x01bd;
     */
    private File d() throws IOException {
        String str = n + this.d;
        File cacheDir = RNFetchBlob.RCTContext.getCacheDir();
        String str2 = o;
        String str3 = m;
        File createTempFile = File.createTempFile(str2, str3, cacheDir);
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        ArrayList<b> c2 = c();
        ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
        Iterator<b> it = c2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str4 = A;
            if (hasNext) {
                b next = it.next();
                String str5 = next.d;
                String str6 = next.a;
                if (!(str6 == null || str5 == null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(str);
                    String str7 = t;
                    sb.append(str7);
                    String sb2 = sb.toString();
                    String str8 = next.b;
                    String str9 = z;
                    String str10 = l;
                    String str11 = y;
                    String str12 = k;
                    if (str8 != null) {
                        fileOutputStream.write(((sb2 + str12 + str6 + w + next.b + str11) + str10 + next.c + str9).getBytes());
                        boolean startsWith = str5.startsWith(u);
                        String str13 = s;
                        if (startsWith) {
                            String w2 = d.w(str5.substring(19));
                            if (d.q(w2)) {
                                try {
                                    g(reactApplicationContext.getAssets().open(w2.replace(v, str3)), fileOutputStream);
                                } catch (IOException e2) {
                                    h.a(p + w2 + str13 + e2.getLocalizedMessage());
                                }
                            } else {
                                File file = new File(d.w(w2));
                                if (file.exists()) {
                                    g(new FileInputStream(file), fileOutputStream);
                                } else {
                                    h.a(x + w2 + r);
                                }
                            }
                        } else if (str5.startsWith(q)) {
                            String substring = str5.substring(22);
                            InputStream inputStream = null;
                            try {
                                inputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(substring));
                                g(inputStream, fileOutputStream);
                            } catch (Exception e3) {
                                h.a(B + substring + str13 + e3.getLocalizedMessage());
                            } catch (Throwable th) {
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } else {
                            fileOutputStream.write(Base64.decode(str5, 0));
                        }
                    } else {
                        fileOutputStream.write(((sb2 + str12 + str6 + str11) + str10 + next.c + str9).getBytes());
                        fileOutputStream.write(next.d.getBytes());
                    }
                    fileOutputStream.write(str7.getBytes());
                    it = it;
                }
            } else {
                fileOutputStream.write((str4 + str + j).getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
                return createTempFile;
            }
        }
    }

    private void e(long j2) {
        f j3 = g.j(this.d);
        if (j3 != null) {
            long j4 = this.b;
            if (j4 != 0 && j3.a(((float) j2) / ((float) j4))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString(C0201.m82(19415), this.d);
                createMap.putString(C0201.m82(19416), String.valueOf(j2));
                createMap.putString(C0201.m82(19417), String.valueOf(this.b));
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(19418), createMap);
            }
        }
    }

    private InputStream f() throws Exception {
        boolean startsWith = this.e.startsWith(C0201.m82(19419));
        String r1 = C0201.m82(19420);
        if (startsWith) {
            String w2 = d.w(this.e.substring(19));
            if (d.q(w2)) {
                try {
                    return RNFetchBlob.RCTContext.getAssets().open(w2.replace(C0201.m82(19421), C0201.m82(19422)));
                } catch (Exception e2) {
                    throw new Exception(C0201.m82(19423) + e2.getLocalizedMessage());
                }
            } else {
                File file = new File(d.w(w2));
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    return new FileInputStream(file);
                } catch (Exception e3) {
                    throw new Exception(r1 + e3.getLocalizedMessage());
                }
            }
        } else if (this.e.startsWith(C0201.m82(19424))) {
            String substring = this.e.substring(22);
            try {
                return RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(substring));
            } catch (Exception e4) {
                throw new Exception(C0201.m82(19425) + substring, e4);
            }
        } else {
            try {
                return new ByteArrayInputStream(Base64.decode(this.e, 0));
            } catch (Exception e5) {
                throw new Exception(r1 + e5.getLocalizedMessage());
            }
        }
    }

    private void g(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    private void h(InputStream inputStream, by2 by2) throws IOException {
        byte[] bArr = new byte[10240];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read > 0) {
                by2.write(bArr, 0, read);
                j2 += (long) read;
                e(j2);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    public a a(boolean z2) {
        this.i = Boolean.valueOf(z2);
        return this;
    }

    public boolean b() {
        try {
            if (this.h == null || !this.h.exists()) {
                return true;
            }
            this.h.delete();
            return true;
        } catch (Exception e2) {
            h.a(e2.getLocalizedMessage());
            return false;
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.i.booleanValue()) {
            return -1;
        }
        return this.b;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.g;
    }

    public a i(ReadableArray readableArray) {
        this.c = readableArray;
        try {
            this.h = d();
            this.a = new FileInputStream(this.h);
            this.b = this.h.length();
        } catch (Exception e2) {
            e2.printStackTrace();
            h.a(C0201.m82(19426) + e2.getLocalizedMessage());
        }
        return this;
    }

    public a j(String str) {
        this.e = str;
        if (str == null) {
            this.e = C0201.m82(19427);
            this.f = g.e.AsIs;
        }
        try {
            int i2 = C0029a.a[this.f.ordinal()];
            if (i2 == 1) {
                InputStream f2 = f();
                this.a = f2;
                this.b = (long) f2.available();
            } else if (i2 == 2) {
                this.b = (long) this.e.getBytes().length;
                this.a = new ByteArrayInputStream(this.e.getBytes());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            h.a(C0201.m82(19428) + e2.getLocalizedMessage() + C0201.m82(19429));
        }
        return this;
    }

    public a k(MediaType mediaType) {
        this.g = mediaType;
        return this;
    }

    public a l(g.e eVar) {
        this.f = eVar;
        return this;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(by2 by2) {
        try {
            h(this.a, by2);
        } catch (Exception e2) {
            h.a(e2.getLocalizedMessage());
            e2.printStackTrace();
        }
    }
}
