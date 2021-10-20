package defpackage;

import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import vigqyno.C0201;

/* renamed from: vt2  reason: default package */
/* compiled from: AesCbcWithIntegrity */
public class vt2 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: vt2$b */
    /* compiled from: AesCbcWithIntegrity */
    public static final class b {
        private static final byte[] a = e();

        /* renamed from: vt2$b$a */
        /* compiled from: AesCbcWithIntegrity */
        public static class a extends SecureRandomSpi {
            private static final File b = new File(C0201.m82(8048));
            private static final Object c = new Object();
            private static DataInputStream d;
            private static OutputStream e;
            private boolean a;

            private DataInputStream a() {
                DataInputStream dataInputStream;
                synchronized (c) {
                    if (d == null) {
                        try {
                            d = new DataInputStream(new FileInputStream(b));
                        } catch (IOException e2) {
                            throw new SecurityException(C0201.m82(8049) + b + C0201.m82(8050), e2);
                        }
                    }
                    dataInputStream = d;
                }
                return dataInputStream;
            }

            private OutputStream b() throws IOException {
                OutputStream outputStream;
                synchronized (c) {
                    if (e == null) {
                        e = new FileOutputStream(b);
                    }
                    outputStream = e;
                }
                return outputStream;
            }

            public byte[] engineGenerateSeed(int i) {
                byte[] bArr = new byte[i];
                engineNextBytes(bArr);
                return bArr;
            }

            public void engineNextBytes(byte[] bArr) {
                DataInputStream a2;
                if (!this.a) {
                    engineSetSeed(b.d());
                }
                try {
                    synchronized (c) {
                        a2 = a();
                    }
                    synchronized (a2) {
                        a2.readFully(bArr);
                    }
                } catch (IOException e2) {
                    throw new SecurityException(C0201.m82(8051) + b, e2);
                }
            }

            public void engineSetSeed(byte[] bArr) {
                OutputStream b2;
                try {
                    synchronized (c) {
                        b2 = b();
                    }
                    b2.write(bArr);
                    b2.flush();
                } catch (IOException unused) {
                    String simpleName = b.class.getSimpleName();
                    Log.w(simpleName, C0201.m82(8052) + b);
                } catch (Throwable th) {
                    this.a = true;
                    throw th;
                }
                this.a = true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: vt2$b$b  reason: collision with other inner class name */
        /* compiled from: AesCbcWithIntegrity */
        public static class C0221b extends Provider {
            public C0221b() {
                super(C0201.m82(8018), 1.0d, C0201.m82(8019));
                put(C0201.m82(8020), a.class.getName());
                put(C0201.m82(8021), C0201.m82(8022));
            }
        }

        private b() {
        }

        public static void b() {
            c();
            g();
        }

        private static void c() throws SecurityException {
            String r0 = C0201.m82(20897);
            int i = Build.VERSION.SDK_INT;
            if (i >= 16 && i <= 18) {
                try {
                    Class.forName(r0).getMethod(C0201.m82(20898), byte[].class).invoke(null, d());
                    int intValue = ((Integer) Class.forName(r0).getMethod(C0201.m82(20899), String.class, Long.TYPE).invoke(null, C0201.m82(20900), 1024)).intValue();
                    if (intValue != 1024) {
                        throw new IOException(C0201.m82(20901) + intValue);
                    }
                } catch (Exception e) {
                    throw new SecurityException(C0201.m82(20902), e);
                }
            }
        }

        /* access modifiers changed from: private */
        public static byte[] d() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(a);
                dataOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new SecurityException(C0201.m82(20903), e);
            }
        }

        private static byte[] e() {
            StringBuilder sb = new StringBuilder();
            String str = Build.FINGERPRINT;
            if (str != null) {
                sb.append(str);
            }
            String f = f();
            if (f != null) {
                sb.append(f);
            }
            try {
                return sb.toString().getBytes(C0201.m82(20904));
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException(C0201.m82(20905));
            }
        }

        private static String f() {
            try {
                return (String) Build.class.getField(C0201.m82(20906)).get(null);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
            if (r0[0].getClass().getSimpleName().equals(defpackage.vt2.b.C0221b.class.getSimpleName()) != false) goto L_0x003a;
         */
        private static void g() throws SecurityException {
            if (Build.VERSION.SDK_INT <= 18) {
                Provider[] providers = Security.getProviders(C0201.m82(20907));
                synchronized (Security.class) {
                    if (providers != null) {
                        if (providers.length >= 1) {
                        }
                    }
                    Security.insertProviderAt(new C0221b(), 1);
                    SecureRandom secureRandom = new SecureRandom();
                    if (secureRandom.getProvider().getClass().getSimpleName().equals(C0221b.class.getSimpleName())) {
                        SecureRandom secureRandom2 = null;
                        try {
                            secureRandom2 = SecureRandom.getInstance(C0201.m82(20908));
                        } catch (NoSuchAlgorithmException e) {
                            new SecurityException(C0201.m82(20909), e);
                        }
                        if (!secureRandom2.getProvider().getClass().getSimpleName().equals(C0221b.class.getSimpleName())) {
                            throw new SecurityException(C0201.m82(20910) + secureRandom2.getProvider().getClass());
                        }
                    } else {
                        throw new SecurityException(C0201.m82(20911) + secureRandom.getProvider().getClass());
                    }
                }
            }
        }
    }

    /* renamed from: vt2$c */
    /* compiled from: AesCbcWithIntegrity */
    public static class c {
        private SecretKey a;
        private SecretKey b;

        public c(SecretKey secretKey, SecretKey secretKey2) {
            c(secretKey);
            d(secretKey2);
        }

        public SecretKey a() {
            return this.a;
        }

        public SecretKey b() {
            return this.b;
        }

        public void c(SecretKey secretKey) {
            this.a = secretKey;
        }

        public void d(SecretKey secretKey) {
            this.b = secretKey;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && this.a.equals(cVar.a);
        }

        public int hashCode() {
            return ((this.a.hashCode() + 31) * 31) + this.b.hashCode();
        }

        public String toString() {
            return Base64.encodeToString(a().getEncoded(), 2) + C0201.m82(20785) + Base64.encodeToString(b().getEncoded(), 2);
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    public static byte[] c(a aVar, c cVar) throws GeneralSecurityException {
        if (a(n(a.d(aVar.b(), aVar.a()), cVar.b()), aVar.c())) {
            Cipher instance = Cipher.getInstance(C0201.m82(12333));
            instance.init(2, cVar.a(), new IvParameterSpec(aVar.b()));
            return instance.doFinal(aVar.a());
        }
        throw new GeneralSecurityException(C0201.m82(12334));
    }

    public static String d(a aVar, c cVar) throws UnsupportedEncodingException, GeneralSecurityException {
        return e(aVar, cVar, C0201.m82(12335));
    }

    public static String e(a aVar, c cVar, String str) throws UnsupportedEncodingException, GeneralSecurityException {
        return new String(c(aVar, cVar), str);
    }

    public static a f(String str, c cVar) throws UnsupportedEncodingException, GeneralSecurityException {
        return g(str, cVar, C0201.m82(12336));
    }

    public static a g(String str, c cVar, String str2) throws UnsupportedEncodingException, GeneralSecurityException {
        return h(str.getBytes(str2), cVar);
    }

    public static a h(byte[] bArr, c cVar) throws GeneralSecurityException {
        byte[] j = j();
        Cipher instance = Cipher.getInstance(C0201.m82(12337));
        instance.init(1, cVar.a(), new IvParameterSpec(j));
        byte[] iv = instance.getIV();
        byte[] doFinal = instance.doFinal(bArr);
        return new a(doFinal, iv, n(a.d(iv, doFinal), cVar.b()));
    }

    private static void i() {
        if (!a.get()) {
            synchronized (b.class) {
                if (!a.get()) {
                    b.b();
                    a.set(true);
                }
            }
        }
    }

    public static byte[] j() throws GeneralSecurityException {
        return p(16);
    }

    public static c k() throws GeneralSecurityException {
        i();
        KeyGenerator instance = KeyGenerator.getInstance(C0201.m82(12338));
        instance.init(128);
        return new c(instance.generateKey(), new SecretKeySpec(p(32), C0201.m82(12339)));
    }

    public static c l(String str, byte[] bArr) throws GeneralSecurityException {
        return m(str, bArr, 10000);
    }

    public static c m(String str, byte[] bArr, int i) throws GeneralSecurityException {
        i();
        byte[] encoded = SecretKeyFactory.getInstance(C0201.m82(12340)).generateSecret(new PBEKeySpec(str.toCharArray(), bArr, i, 384)).getEncoded();
        return new c(new SecretKeySpec(b(encoded, 0, 16), C0201.m82(12341)), new SecretKeySpec(b(encoded, 16, 48), C0201.m82(12342)));
    }

    public static byte[] n(byte[] bArr, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac instance = Mac.getInstance(C0201.m82(12343));
        instance.init(secretKey);
        return instance.doFinal(bArr);
    }

    public static c o(String str) throws InvalidKeyException {
        String[] split = str.split(C0201.m82(12344));
        if (split.length == 2) {
            byte[] decode = Base64.decode(split[0], 2);
            if (decode.length == 16) {
                byte[] decode2 = Base64.decode(split[1], 2);
                if (decode2.length == 32) {
                    return new c(new SecretKeySpec(decode, 0, decode.length, C0201.m82(12345)), new SecretKeySpec(decode2, C0201.m82(12346)));
                }
                throw new InvalidKeyException(C0201.m82(12347));
            }
            throw new InvalidKeyException(C0201.m82(12348));
        }
        throw new IllegalArgumentException(C0201.m82(12349));
    }

    private static byte[] p(int i) throws GeneralSecurityException {
        i();
        byte[] bArr = new byte[i];
        SecureRandom.getInstance(C0201.m82(12350)).nextBytes(bArr);
        return bArr;
    }

    /* renamed from: vt2$a */
    /* compiled from: AesCbcWithIntegrity */
    public static class a {
        private final byte[] a;
        private final byte[] b;
        private final byte[] c;

        public a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            byte[] bArr4 = new byte[bArr.length];
            this.a = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            byte[] bArr5 = new byte[bArr2.length];
            this.b = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
            byte[] bArr6 = new byte[bArr3.length];
            this.c = bArr6;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        }

        public static byte[] d(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }

        public byte[] a() {
            return this.a;
        }

        public byte[] b() {
            return this.b;
        }

        public byte[] c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return Arrays.equals(this.a, aVar.a) && Arrays.equals(this.b, aVar.b) && Arrays.equals(this.c, aVar.c);
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.a) + 31) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
        }

        public String toString() {
            String encodeToString = Base64.encodeToString(this.b, 2);
            String encodeToString2 = Base64.encodeToString(this.a, 2);
            String encodeToString3 = Base64.encodeToString(this.c, 2);
            StringBuilder sb = new StringBuilder();
            sb.append(encodeToString);
            String r0 = C0201.m82(20664);
            sb.append(r0);
            sb.append(encodeToString3);
            sb.append(r0);
            sb.append(encodeToString2);
            return String.format(sb.toString(), new Object[0]);
        }

        public a(String str) {
            String[] split = str.split(C0201.m82(20662));
            if (split.length == 3) {
                this.b = Base64.decode(split[0], 2);
                this.c = Base64.decode(split[1], 2);
                this.a = Base64.decode(split[2], 2);
                return;
            }
            throw new IllegalArgumentException(C0201.m82(20663));
        }
    }
}
