package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

public final class c1 {
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r9 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        i(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        h(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        throw r11;
     */
    private final b1 a(Context context, String str, b1 b1Var, boolean z) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to properties file");
        }
        Properties properties = new Properties();
        properties.setProperty("pub", b1Var.e());
        properties.setProperty("pri", b1Var.f());
        properties.setProperty("cre", String.valueOf(b1Var.b));
        File q = q(context, str);
        try {
            q.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(q, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.lock();
            if (z && channel.size() > 0) {
                try {
                    channel.position(0L);
                    b1 d = d(channel);
                    if (channel != null) {
                        i(null, channel);
                    }
                    h(null, randomAccessFile);
                    return d;
                } catch (d | IOException e) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb.append("Tried reading key pair before writing new one, but failed with: ");
                        sb.append(valueOf);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                }
            }
            channel.position(0L);
            properties.store(Channels.newOutputStream(channel), (String) null);
            if (channel != null) {
                i(null, channel);
            }
            h(null, randomAccessFile);
            return b1Var;
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(valueOf2);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    private static b1 b(SharedPreferences sharedPreferences, String str) throws d {
        String string = sharedPreferences.getString(y.h(str, "|P|"), null);
        String string2 = sharedPreferences.getString(y.h(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new b1(n(string, string2), j(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r8 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        i(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        g(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        throw r1;
     */
    private final b1 c(File file) throws d, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();
        channel.lock(0, Long.MAX_VALUE, true);
        b1 d = d(channel);
        if (channel != null) {
            i(null, channel);
        }
        g(null, fileInputStream);
        return d;
    }

    private static b1 d(FileChannel fileChannel) throws d, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new d("Invalid properties file");
        }
        try {
            return new b1(n(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new d(e);
        }
    }

    public static void e(Context context) {
        File[] listFiles = l(context).listFiles();
        for (File file : listFiles) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private final void f(Context context, String str, b1 b1Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (b1Var.equals(b(sharedPreferences, str))) {
                return;
            }
        } catch (d unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(y.h(str, "|P|"), b1Var.e());
        edit.putString(y.h(str, "|K|"), b1Var.f());
        edit.putString(y.h(str, "cre"), String.valueOf(b1Var.b));
        edit.commit();
    }

    private static /* synthetic */ void g(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                x01.a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    private static /* synthetic */ void h(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                x01.a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    private static /* synthetic */ void i(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                x01.a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    private static long j(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(y.h(str, "cre"), null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static File l(Context context) {
        File i = b.i(context);
        if (i != null && i.isDirectory()) {
            return i;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static KeyPair n(String str, String str2) throws d {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new d(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new d(e2);
        }
    }

    private final b1 o(Context context, String str) throws d {
        d e;
        try {
            b1 p = p(context, str);
            if (p != null) {
                f(context, str, p);
                return p;
            }
            e = null;
            try {
                b1 b = b(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (b != null) {
                    a(context, str, b, false);
                    return b;
                }
            } catch (d e2) {
                e = e2;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (d e3) {
            e = e3;
        }
    }

    private final b1 p(Context context, String str) throws d {
        File q = q(context, str);
        if (!q.exists()) {
            return null;
        }
        try {
            return c(q);
        } catch (d | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return c(q);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new d(e2);
            }
        }
    }

    private static File q(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(l(context), str2);
    }

    public final b1 k(Context context, String str) throws d {
        b1 o = o(context, str);
        if (o != null) {
            return o;
        }
        return m(context, str);
    }

    public final b1 m(Context context, String str) {
        b1 b1Var = new b1(c.a(), System.currentTimeMillis());
        b1 a = a(context, str, b1Var, true);
        if (a == null || a.equals(b1Var)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            f(context, str, b1Var);
            return b1Var;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
        }
        return a;
    }
}
