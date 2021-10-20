package com.RNFetchBlob;

import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import vigqyno.C0201;

/* compiled from: RNFetchBlobFS */
public class d {
    private static HashMap<String, d> e = new HashMap<>();
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
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
    private ReactApplicationContext a;
    private DeviceEventManagerModule.RCTDeviceEventEmitter b;
    private String c = C0201.m82(18967);
    private OutputStream d = null;

    /* compiled from: RNFetchBlobFS */
    static class a extends AsyncTask<String, Integer, Integer> {
        public final /* synthetic */ Callback a;

        public a(Callback callback) {
            this.a = callback;
        }

        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            WritableArray createArray = Arguments.createArray();
            if (strArr[0] == null) {
                this.a.invoke(C0201.m82(10967));
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                this.a.invoke(C0201.m82(10968) + strArr[0] + C0201.m82(10969));
                return 0;
            }
            if (file.isDirectory()) {
                String[] list = file.list();
                for (String str : list) {
                    createArray.pushMap(d.D(file.getPath() + C0201.m82(10970) + str));
                }
            } else {
                createArray.pushMap(d.D(file.getAbsolutePath()));
            }
            this.a.invoke(null, createArray);
            return 0;
        }
    }

    /* compiled from: RNFetchBlobFS */
    class b implements MediaScannerConnection.OnScanCompletedListener {
        public final /* synthetic */ Callback a;

        public b(d dVar, Callback callback) {
            this.a = callback;
        }

        public void onScanCompleted(String str, Uri uri) {
            this.a.invoke(null, Boolean.TRUE);
        }
    }

    /* compiled from: RNFetchBlobFS */
    static class c extends AsyncTask<ReadableArray, Integer, Integer> {
        public final /* synthetic */ Callback a;

        public c(Callback callback) {
            this.a = callback;
        }

        /* renamed from: a */
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < readableArrayArr[0].size(); i++) {
                    String string = readableArrayArr[0].getString(i);
                    File file = new File(string);
                    if (file.exists() && !file.delete()) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.a.invoke(null, Boolean.TRUE);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0201.m82(11617));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(C0201.m82(11618));
                    }
                    this.a.invoke(sb.toString());
                }
            } catch (Exception e) {
                this.a.invoke(e.getLocalizedMessage());
            }
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    static {
        C0201.m83(d.class, 58);
    }

    public d(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
        this.b = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    public static void B(String str, String str2, int i2, int i3, String str3, Promise promise) {
        String r11 = C0201.m82(18968);
        try {
            String w2 = w(str);
            File file = new File(w2);
            if (file.isDirectory()) {
                String r8 = C0201.m82(18969);
                promise.reject(r8, C0201.m82(18970) + w2 + C0201.m82(18971));
            } else if (!file.exists()) {
                String r82 = C0201.m82(18972);
                promise.reject(r82, C0201.m82(18973) + w2 + C0201.m82(18974));
            } else {
                int length = (int) file.length();
                int min = Math.min(length, i3) - i2;
                FileInputStream fileInputStream = new FileInputStream(new File(w2));
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                int skip = (int) fileInputStream.skip((long) i2);
                if (skip != i2) {
                    promise.reject(r11, C0201.m82(18975) + skip + C0201.m82(18976) + i2 + C0201.m82(18977) + length);
                    return;
                }
                byte[] bArr = new byte[10240];
                int i4 = 0;
                while (true) {
                    if (i4 >= min) {
                        break;
                    }
                    int read = fileInputStream.read(bArr, 0, 10240);
                    int i5 = min - i4;
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, Math.min(i5, read));
                    i4 += read;
                }
                fileInputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                promise.resolve(str2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject(r11, e2.getLocalizedMessage());
        }
    }

    public static void C(String str, Callback callback) {
        try {
            String w2 = w(str);
            WritableMap D = D(w2);
            if (D == null) {
                callback.invoke(C0201.m82(18978) + w2 + C0201.m82(18979), null);
                return;
            }
            callback.invoke(null, D);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    public static WritableMap D(String str) {
        try {
            String w2 = w(str);
            WritableMap createMap = Arguments.createMap();
            boolean q2 = q(w2);
            String r3 = C0201.m82(18980);
            String r4 = C0201.m82(18981);
            String r5 = C0201.m82(18982);
            String r6 = C0201.m82(18983);
            String r7 = C0201.m82(18984);
            if (q2) {
                String replace = w2.replace(C0201.m82(18985), C0201.m82(18986));
                AssetFileDescriptor openFd = RNFetchBlob.RCTContext.getAssets().openFd(replace);
                createMap.putString(r7, replace);
                createMap.putString(r6, w2);
                createMap.putString(r5, C0201.m82(18987));
                createMap.putString(r4, String.valueOf(openFd.getLength()));
                createMap.putInt(r3, 0);
            } else {
                File file = new File(w2);
                if (!file.exists()) {
                    return null;
                }
                createMap.putString(r7, file.getName());
                createMap.putString(r6, file.getPath());
                createMap.putString(r5, file.isDirectory() ? C0201.m82(18988) : C0201.m82(18989));
                createMap.putString(r4, String.valueOf(file.length()));
                createMap.putString(r3, String.valueOf(file.lastModified()));
            }
            return createMap;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] E(String str, String str2) {
        boolean equalsIgnoreCase = str2.equalsIgnoreCase(C0201.m82(18990));
        String r1 = C0201.m82(18991);
        if (equalsIgnoreCase) {
            return str.getBytes(Charset.forName(r1));
        }
        if (str2.toLowerCase().contains(C0201.m82(18992))) {
            return Base64.decode(str, 2);
        }
        if (str2.equalsIgnoreCase(C0201.m82(18993))) {
            return str.getBytes(Charset.forName(C0201.m82(18994)));
        }
        return str.getBytes(Charset.forName(r1));
    }

    public static void F(String str, Callback callback) {
        try {
            e(new File(w(str)));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage(), Boolean.FALSE);
        }
    }

    public static void G(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = e.get(str).d;
            byte[] bArr = new byte[readableArray.size()];
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                bArr[i2] = (byte) readableArray.getInt(i2);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    public static void H(String str, String str2, Callback callback) {
        d dVar = e.get(str);
        try {
            dVar.d.write(E(str2, dVar.c));
            callback.invoke(new Object[0]);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    /* JADX INFO: finally extract failed */
    public static void I(String str, ReadableArray readableArray, boolean z, Promise promise) {
        String r0 = C0201.m82(18995);
        String r1 = C0201.m82(18996);
        String r2 = C0201.m82(18997);
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    String r8 = C0201.m82(18998);
                    promise.reject(r8, C0201.m82(18999) + str + C0201.m82(19000));
                    return;
                } else if (!file.createNewFile()) {
                    promise.reject(r2, r1 + str + r0);
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            try {
                byte[] bArr = new byte[readableArray.size()];
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    bArr[i2] = (byte) readableArray.getInt(i2);
                }
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                promise.resolve(Integer.valueOf(readableArray.size()));
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException unused) {
            promise.reject(r2, r1 + str + r0);
        } catch (Exception e2) {
            promise.reject(C0201.m82(19001), e2.getLocalizedMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    public static void J(String str, String str2, String str3, boolean z, Promise promise) {
        int i2;
        FileOutputStream fileOutputStream;
        Throwable th;
        String r0 = C0201.m82(19002);
        String r1 = C0201.m82(19003);
        String r2 = C0201.m82(19004);
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject(r0, C0201.m82(19005) + str + C0201.m82(19006));
                    return;
                } else if (!file.createNewFile()) {
                    promise.reject(r2, r1 + str + C0201.m82(19007));
                    return;
                }
            }
            if (str2.equalsIgnoreCase(C0201.m82(19008))) {
                String w2 = w(str3);
                File file2 = new File(w2);
                if (!file2.exists()) {
                    promise.reject(r2, C0201.m82(19009) + str + C0201.m82(19010) + w2 + C0201.m82(19011));
                    return;
                }
                byte[] bArr = new byte[10240];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        fileOutputStream = new FileOutputStream(file, z);
                        i2 = 0;
                        while (true) {
                            try {
                                int read = fileInputStream2.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                i2 += read;
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } else {
                byte[] E = E(str3, str2);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(E);
                    i2 = E.length;
                } finally {
                    fileOutputStream2.close();
                }
            }
            promise.resolve(Integer.valueOf(i2));
        } catch (FileNotFoundException unused) {
            promise.reject(r2, r1 + str + C0201.m82(19012));
        } catch (Exception e2) {
            promise.reject(r0, e2.getLocalizedMessage());
        }
    }

    public static void a(String str, Callback callback) {
        try {
            OutputStream outputStream = e.get(str).d;
            e.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db A[SYNTHETIC, Splitter:B:44:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3 A[Catch:{ Exception -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d A[SYNTHETIC, Splitter:B:56:0x010d] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115 A[Catch:{ Exception -> 0x0111 }] */
    public static void b(String str, String str2, Callback callback) {
        Throwable th;
        FileOutputStream fileOutputStream;
        String str3;
        Exception e2;
        Exception e3;
        Throwable th2;
        String r0 = C0201.m82(19013);
        String w2 = w(str);
        InputStream inputStream = null;
        try {
            if (!r(w2)) {
                callback.invoke(C0201.m82(19014) + w2 + C0201.m82(19015));
            } else if (new File(str2).exists() || new File(str2).createNewFile()) {
                InputStream p2 = p(w2);
                try {
                    fileOutputStream = new FileOutputStream(str2);
                } catch (Exception e4) {
                    e3 = e4;
                    fileOutputStream = null;
                    inputStream = p2;
                    e2 = e3;
                    try {
                        str3 = r0 + e2.getLocalizedMessage();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e5) {
                                str3 = str3 + e5.getLocalizedMessage();
                            }
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (str3 == r0) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    fileOutputStream = null;
                    inputStream = p2;
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e6) {
                            String str4 = r0 + e6.getLocalizedMessage();
                            throw th;
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
                try {
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int read = p2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    if (p2 != null) {
                        try {
                            p2.close();
                        } catch (Exception e7) {
                            str3 = r0 + e7.getLocalizedMessage();
                        }
                    }
                    fileOutputStream.close();
                    str3 = r0;
                } catch (Exception e8) {
                    e3 = e8;
                    inputStream = p2;
                    e2 = e3;
                    str3 = r0 + e2.getLocalizedMessage();
                    if (inputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    if (str3 == r0) {
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    inputStream = p2;
                    th = th2;
                    if (inputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
                if (str3 == r0) {
                    callback.invoke(str3);
                    return;
                }
                callback.invoke(new Object[0]);
            } else {
                callback.invoke(C0201.m82(19016) + str2 + C0201.m82(19017));
            }
        } catch (Exception e9) {
            e2 = e9;
            fileOutputStream = null;
            str3 = r0 + e2.getLocalizedMessage();
            if (inputStream != null) {
            }
            if (fileOutputStream != null) {
            }
            if (str3 == r0) {
            }
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
            if (inputStream != null) {
            }
            if (fileOutputStream != null) {
            }
            throw th;
        }
    }

    public static void c(String str, String str2, String str3, Promise promise) {
        try {
            File file = new File(str);
            boolean createNewFile = file.createNewFile();
            if (str3.equals(C0201.m82(19018))) {
                File file2 = new File(str2.replace(C0201.m82(19019), C0201.m82(19020)));
                if (!file2.exists()) {
                    String r4 = C0201.m82(19021);
                    promise.reject(r4, C0201.m82(19022) + str2 + C0201.m82(19023));
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[10240];
                for (int read = fileInputStream.read(bArr); read > 0; read = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else if (!createNewFile) {
                String r5 = C0201.m82(19024);
                promise.reject(r5, C0201.m82(19025) + str + C0201.m82(19026));
                return;
            } else {
                new FileOutputStream(file).write(E(str2, str3));
            }
            promise.resolve(str);
        } catch (Exception e2) {
            promise.reject(C0201.m82(19027), e2.getLocalizedMessage());
        }
    }

    public static void d(String str, ReadableArray readableArray, Promise promise) {
        try {
            File file = new File(str);
            if (!file.createNewFile()) {
                String r6 = C0201.m82(19028);
                promise.reject(r6, C0201.m82(19029) + str + C0201.m82(19030));
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[readableArray.size()];
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                bArr[i2] = (byte) readableArray.getInt(i2);
            }
            fileOutputStream.write(bArr);
            promise.resolve(str);
        } catch (Exception e2) {
            promise.reject(C0201.m82(19031), e2.getLocalizedMessage());
        }
    }

    private static void e(File file) throws IOException {
        boolean isDirectory = file.isDirectory();
        String r1 = C0201.m82(19032);
        if (isDirectory) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    e(file2);
                }
            } else {
                throw new NullPointerException(C0201.m82(19033) + file + r1);
            }
        }
        if (!file.delete()) {
            throw new IOException(C0201.m82(19034) + file + r1);
        }
    }

    public static void f(Callback callback) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        WritableMap createMap = Arguments.createMap();
        if (Build.VERSION.SDK_INT >= 18) {
            createMap.putString(C0201.m82(19035), String.valueOf(statFs.getFreeBytes()));
            createMap.putString(C0201.m82(19036), String.valueOf(statFs.getTotalBytes()));
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
            createMap.putString(C0201.m82(19037), String.valueOf(statFs2.getFreeBytes()));
            createMap.putString(C0201.m82(19038), String.valueOf(statFs2.getTotalBytes()));
        }
        callback.invoke(null, createMap);
    }

    private void g(String str, String str2, WritableArray writableArray) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(19039), str2);
        createMap.putArray(C0201.m82(19040), writableArray);
        this.b.emit(str, createMap);
    }

    private void h(String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(19041), str2);
        createMap.putString(C0201.m82(19042), str3);
        this.b.emit(str, createMap);
    }

    private void i(String str, String str2, String str3, String str4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(19043), str2);
        createMap.putString(C0201.m82(19044), str3);
        createMap.putString(C0201.m82(19045), str4);
        this.b.emit(str, createMap);
    }

    public static void j(String str, Callback callback) {
        if (q(str)) {
            try {
                RNFetchBlob.RCTContext.getAssets().openFd(str.replace(C0201.m82(19046), C0201.m82(19047)));
                callback.invoke(Boolean.TRUE, Boolean.FALSE);
            } catch (IOException unused) {
                Boolean bool = Boolean.FALSE;
                callback.invoke(bool, bool);
            }
        } else {
            String w2 = w(str);
            callback.invoke(Boolean.valueOf(new File(w2).exists()), Boolean.valueOf(new File(w2).isDirectory()));
        }
    }

    public static void k(ReactApplicationContext reactApplicationContext, Promise promise) {
        boolean equals = Environment.getExternalStorageState().equals(C0201.m82(19048));
        String r1 = C0201.m82(19049);
        if (equals) {
            try {
                promise.resolve(reactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
            } catch (Exception e2) {
                promise.reject(r1, e2.getLocalizedMessage());
            }
        } else {
            promise.reject(r1, C0201.m82(19050));
        }
    }

    public static void l(Promise promise) {
        if (Environment.getExternalStorageState().equals(C0201.m82(19051))) {
            promise.resolve(Environment.getExternalStorageDirectory().getAbsolutePath());
        } else {
            promise.reject(C0201.m82(19052), C0201.m82(19053));
        }
    }

    public static Map<String, Object> m(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(19054), reactApplicationContext.getFilesDir().getAbsolutePath());
        hashMap.put(C0201.m82(19055), reactApplicationContext.getCacheDir().getAbsolutePath());
        hashMap.put(C0201.m82(19056), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        hashMap.put(C0201.m82(19057), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(C0201.m82(19058), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        hashMap.put(C0201.m82(19059), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put(C0201.m82(19060), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        hashMap.put(C0201.m82(19061), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        if (Environment.getExternalStorageState().equals(C0201.m82(19062))) {
            hashMap.put(C0201.m82(19063), Environment.getExternalStorageDirectory().getAbsolutePath());
            File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
            String r2 = C0201.m82(19064);
            if (externalFilesDir != null) {
                hashMap.put(r2, externalFilesDir.getParentFile().getAbsolutePath());
            } else {
                hashMap.put(r2, C0201.m82(19065));
            }
        }
        hashMap.put(C0201.m82(19066), reactApplicationContext.getApplicationInfo().dataDir);
        return hashMap;
    }

    public static String n(String str) {
        return RNFetchBlob.RCTContext.getFilesDir() + C0201.m82(19067) + str;
    }

    public static void o(String str, String str2, Promise promise) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(C0201.m82(19068), C0201.m82(19069));
            hashMap.put(C0201.m82(19070), C0201.m82(19071));
            hashMap.put(C0201.m82(19072), C0201.m82(19073));
            hashMap.put(C0201.m82(19074), C0201.m82(19075));
            hashMap.put(C0201.m82(19076), C0201.m82(19077));
            hashMap.put(C0201.m82(19078), C0201.m82(19079));
            if (!hashMap.containsKey(str2)) {
                promise.reject(C0201.m82(19080), C0201.m82(19081) + str2 + C0201.m82(19082));
                return;
            }
            File file = new File(str);
            if (file.isDirectory()) {
                promise.reject(C0201.m82(19083), C0201.m82(19084) + str + C0201.m82(19085));
            } else if (!file.exists()) {
                promise.reject(C0201.m82(19086), C0201.m82(19087) + str + C0201.m82(19088));
            } else {
                MessageDigest instance = MessageDigest.getInstance((String) hashMap.get(str2));
                FileInputStream fileInputStream = new FileInputStream(str);
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                }
                StringBuilder sb = new StringBuilder();
                byte[] digest = instance.digest();
                for (byte b2 : digest) {
                    sb.append(String.format(C0201.m82(19089), Byte.valueOf(b2)));
                }
                promise.resolve(sb.toString());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject(C0201.m82(19090), e2.getLocalizedMessage());
        }
    }

    private static InputStream p(String str) throws IOException {
        String r0 = C0201.m82(19091);
        if (str.startsWith(r0)) {
            return RNFetchBlob.RCTContext.getAssets().open(str.replace(r0, C0201.m82(19092)));
        }
        return new FileInputStream(new File(str));
    }

    public static boolean q(String str) {
        return str != null && str.startsWith(C0201.m82(19093));
    }

    private static boolean r(String str) {
        String r0 = C0201.m82(19094);
        if (!str.startsWith(r0)) {
            return new File(str).exists();
        }
        try {
            RNFetchBlob.RCTContext.getAssets().open(str.replace(r0, C0201.m82(19095)));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void s(String str, Promise promise) {
        try {
            String w2 = w(str);
            File file = new File(w2);
            boolean exists = file.exists();
            String r2 = C0201.m82(19096);
            if (!exists) {
                promise.reject(C0201.m82(19097), C0201.m82(19098) + w2 + r2);
            } else if (!file.isDirectory()) {
                promise.reject(C0201.m82(19099), C0201.m82(19100) + w2 + r2);
            } else {
                String[] list = new File(w2).list();
                WritableArray createArray = Arguments.createArray();
                for (String str2 : list) {
                    createArray.pushString(str2);
                }
                promise.resolve(createArray);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject(C0201.m82(19101), e2.getLocalizedMessage());
        }
    }

    public static void t(String str, Callback callback) {
        String w2 = w(str);
        new a(callback).execute(w2);
    }

    public static void u(String str, Promise promise) {
        String r0 = C0201.m82(19102);
        File file = new File(str);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.isDirectory() ? C0201.m82(19103) : C0201.m82(19104));
            sb.append(C0201.m82(19105));
            sb.append(str);
            sb.append(C0201.m82(19106));
            promise.reject(C0201.m82(19107), sb.toString());
            return;
        }
        try {
            if (!file.mkdirs()) {
                promise.reject(r0, C0201.m82(19108) + str + C0201.m82(19109));
                return;
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e2) {
            promise.reject(r0, e2.getLocalizedMessage());
        }
    }

    public static void v(String str, String str2, Callback callback) {
        File file = new File(str);
        if (!file.exists()) {
            callback.invoke(C0201.m82(19110) + str + C0201.m82(19111));
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.flush();
                    file.delete();
                    callback.invoke(new Object[0]);
                    return;
                }
            }
        } catch (FileNotFoundException unused) {
            callback.invoke(C0201.m82(19112));
        } catch (Exception e2) {
            callback.invoke(e2.toString());
        }
    }

    public static String w(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches(C0201.m82(19113))) {
            return str;
        }
        String r0 = C0201.m82(19114);
        if (str.startsWith(r0)) {
            return str.replace(r0, C0201.m82(19115));
        }
        Uri parse = Uri.parse(str);
        if (str.startsWith(C0201.m82(19116))) {
            return str;
        }
        return com.RNFetchBlob.Utils.a.c(RNFetchBlob.RCTContext, parse);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0085 A[Catch:{ FileNotFoundException -> 0x0131, Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ac A[Catch:{ FileNotFoundException -> 0x0131, Exception -> 0x0128 }] */
    public static void x(String str, String str2, Promise promise) {
        int i2;
        byte[] bArr;
        int i3;
        String r0 = C0201.m82(19117);
        String w2 = w(str);
        if (w2 != null) {
            str = w2;
        }
        String r2 = C0201.m82(19118);
        if (w2 != null) {
            try {
                if (w2.startsWith(r0)) {
                    String replace = str.replace(r0, C0201.m82(19119));
                    i3 = (int) RNFetchBlob.RCTContext.getAssets().openFd(replace).getLength();
                    bArr = new byte[i3];
                    InputStream open = RNFetchBlob.RCTContext.getAssets().open(replace);
                    i2 = open.read(bArr, 0, i3);
                    open.close();
                    if (i2 >= i3) {
                        promise.reject(r2, C0201.m82(19120) + i2 + C0201.m82(19121) + i3);
                        return;
                    }
                    String lowerCase = str2.toLowerCase();
                    char c2 = 65535;
                    int hashCode = lowerCase.hashCode();
                    if (hashCode != -1396204209) {
                        if (hashCode != 3600241) {
                            if (hashCode == 93106001) {
                                if (lowerCase.equals(C0201.m82(19122))) {
                                    c2 = 1;
                                }
                            }
                        } else if (lowerCase.equals(C0201.m82(19123))) {
                            c2 = 2;
                        }
                    } else if (lowerCase.equals(C0201.m82(19124))) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        promise.resolve(Base64.encodeToString(bArr, 2));
                        return;
                    } else if (c2 == 1) {
                        WritableArray createArray = Arguments.createArray();
                        for (byte b2 : bArr) {
                            createArray.pushInt(b2);
                        }
                        promise.resolve(createArray);
                        return;
                    } else if (c2 != 2) {
                        promise.resolve(new String(bArr));
                        return;
                    } else {
                        promise.resolve(new String(bArr));
                        return;
                    }
                }
            } catch (FileNotFoundException e2) {
                String localizedMessage = e2.getLocalizedMessage();
                String r02 = C0201.m82(19125);
                if (localizedMessage.contains(r02)) {
                    promise.reject(r02, C0201.m82(19126) + str + C0201.m82(19127) + localizedMessage);
                    return;
                }
                promise.reject(C0201.m82(19130), C0201.m82(19128) + str + C0201.m82(19129) + localizedMessage);
                return;
            } catch (Exception e3) {
                promise.reject(r2, e3.getLocalizedMessage());
                return;
            }
        }
        if (w2 == null) {
            InputStream openInputStream = RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(str));
            i3 = openInputStream.available();
            bArr = new byte[i3];
            i2 = openInputStream.read(bArr);
            openInputStream.close();
        } else {
            File file = new File(str);
            i3 = (int) file.length();
            bArr = new byte[i3];
            FileInputStream fileInputStream = new FileInputStream(file);
            int read = fileInputStream.read(bArr);
            fileInputStream.close();
            i2 = read;
        }
        if (i2 >= i3) {
        }
    }

    public static void z(ReadableArray readableArray, Callback callback) {
        new c(callback).execute(readableArray);
    }

    public void A(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.a, strArr, strArr2, new b(this, callback));
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage(), null);
        }
    }

    public void K(String str, String str2, boolean z, Callback callback) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    callback.invoke(C0201.m82(19131), C0201.m82(19132) + str + C0201.m82(19133));
                    return;
                } else if (!file.createNewFile()) {
                    callback.invoke(C0201.m82(19134), C0201.m82(19135) + str + C0201.m82(19136));
                    return;
                }
            } else if (file.isDirectory()) {
                callback.invoke(C0201.m82(19137), C0201.m82(19138) + str + C0201.m82(19139));
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str, z);
            this.c = str2;
            String uuid = UUID.randomUUID().toString();
            e.put(uuid, this);
            this.d = fileOutputStream;
            callback.invoke(null, null, uuid);
        } catch (Exception e2) {
            callback.invoke(C0201.m82(19140), C0201.m82(19141) + str + C0201.m82(19142) + e2.getLocalizedMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
    public void y(String str, String str2, int i2, int i3, String str3) {
        InputStream inputStream;
        boolean z;
        String str4 = k;
        String str5 = p;
        String str6 = n;
        String w2 = w(str);
        String str7 = w2 != null ? w2 : str;
        try {
            int i4 = str2.equalsIgnoreCase(str5) ? 4095 : 4096;
            if (i2 > 0) {
                i4 = i2;
            }
            String str8 = w;
            if (w2 != null && str7.startsWith(str4)) {
                inputStream = RNFetchBlob.RCTContext.getAssets().open(str7.replace(str4, str8));
            } else if (w2 == null) {
                inputStream = RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(str7));
            } else {
                inputStream = new FileInputStream(new File(str7));
            }
            byte[] bArr = new byte[i4];
            boolean equalsIgnoreCase = str2.equalsIgnoreCase(m);
            int i5 = -1;
            String str9 = f;
            int i6 = 0;
            if (equalsIgnoreCase) {
                CharsetEncoder newEncoder = Charset.forName(o).newEncoder();
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    newEncoder.encode(ByteBuffer.wrap(bArr).asCharBuffer());
                    h(str3, str9, new String(bArr, i6, read));
                    if (i3 > 0) {
                        SystemClock.sleep((long) i3);
                    }
                    i6 = 0;
                }
            } else if (str2.equalsIgnoreCase(i)) {
                while (true) {
                    int read2 = inputStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    }
                    WritableArray createArray = Arguments.createArray();
                    for (int i7 = 0; i7 < read2; i7++) {
                        createArray.pushInt(bArr[i7]);
                    }
                    g(str3, str9, createArray);
                    if (i3 > 0) {
                        SystemClock.sleep((long) i3);
                    }
                }
            } else if (str2.equalsIgnoreCase(str5)) {
                while (true) {
                    int read3 = inputStream.read(bArr);
                    if (read3 == i5) {
                        break;
                    }
                    if (read3 < i4) {
                        byte[] bArr2 = new byte[read3];
                        System.arraycopy(bArr, 0, bArr2, 0, read3);
                        h(str3, str9, Base64.encodeToString(bArr2, 2));
                    } else {
                        h(str3, str9, Base64.encodeToString(bArr, 2));
                    }
                    if (i3 > 0) {
                        SystemClock.sleep((long) i3);
                        str9 = str9;
                        i5 = -1;
                    }
                }
            } else {
                String str10 = v;
                i(str3, str6, str10, g + str2 + t);
                z = true;
                if (!z) {
                    h(str3, l, str8);
                }
                inputStream.close();
            }
            z = false;
            if (!z) {
            }
            inputStream.close();
        } catch (FileNotFoundException unused) {
            i(str3, str6, j, q + str7 + u);
        } catch (Exception e2) {
            i(str3, str6, h, r + str2 + s);
            e2.printStackTrace();
        }
    }
}
