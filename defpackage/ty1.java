package defpackage;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: ty1  reason: default package */
public final class ty1 {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;

    static {
        C0201.m83(ty1.class, 8);
    }

    public static void a(PackageManager packageManager, ComponentName componentName, int i2) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i2 | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i3 = 0;
                    loop0:
                    while (true) {
                        if (i3 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i3];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                componentInfo = componentInfoArr2[i4];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i3++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static void b(wy1 wy1, InputStream inputStream, OutputStream outputStream, long j2) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format(a, Integer.valueOf(readInt)));
            String str = e;
            throw new vy1(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j3 = 0;
            while (true) {
                long j4 = j2 - j3;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException(f);
                    } else if (read2 != 0) {
                        String str2 = h;
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                f(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                f(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    e(bArr, wy1, outputStream, readUnsignedShort, read2, j4);
                                    break;
                                } else {
                                    throw new IOException(str2);
                                }
                            case 250:
                                read2 = dataInputStream.readUnsignedShort();
                                e(bArr, wy1, outputStream, (long) dataInputStream.readUnsignedShort(), read2, j4);
                                break;
                            case 251:
                                read2 = dataInputStream.readInt();
                                e(bArr, wy1, outputStream, (long) dataInputStream.readUnsignedShort(), read2, j4);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    e(bArr, wy1, outputStream, readInt2, read2, j4);
                                    break;
                                } else {
                                    throw new IOException(str2);
                                }
                            case 253:
                                read2 = dataInputStream.readUnsignedShort();
                                e(bArr, wy1, outputStream, (long) dataInputStream.readInt(), read2, j4);
                                break;
                            case 254:
                                read2 = dataInputStream.readInt();
                                e(bArr, wy1, outputStream, (long) dataInputStream.readInt(), read2, j4);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                e(bArr, wy1, outputStream, readLong, read2, j4);
                                break;
                            default:
                                f(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                        }
                        j3 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append(c);
            sb.append(read);
            throw new vy1(sb.toString());
        }
    }

    public static <T> void c(T t) {
        if (t == null) {
            throw null;
        }
    }

    public static <T> void d(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(C0201.m82(3556)));
        }
    }

    private static void e(byte[] bArr, wy1 wy1, OutputStream outputStream, long j2, int i2, long j3) throws IOException {
        int i3 = i2;
        if (i3 < 0) {
            throw new IOException(g);
        } else if (j2 >= 0) {
            long j4 = (long) i3;
            if (j4 <= j3) {
                try {
                    InputStream h2 = new xy1(wy1, j2, j4).h();
                    while (i3 > 0) {
                        try {
                            int min = Math.min(i3, 16384);
                            int i4 = 0;
                            while (i4 < min) {
                                int read = h2.read(bArr, i4, min - i4);
                                if (read != -1) {
                                    i4 += read;
                                } else {
                                    throw new IOException(b);
                                }
                            }
                            outputStream.write(bArr, 0, min);
                            i3 -= min;
                        } catch (Throwable th) {
                            ez1.a(th, th);
                        }
                    }
                    if (h2 != null) {
                        h2.close();
                        return;
                    }
                    return;
                } catch (EOFException e2) {
                    throw new IOException(j, e2);
                }
            } else {
                throw new IOException(d);
            }
        } else {
            throw new IOException(i);
        }
        throw th;
    }

    private static void f(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i2, long j2) throws IOException {
        if (i2 < 0) {
            throw new IOException(C0201.m82(3559));
        } else if (((long) i2) <= j2) {
            while (i2 > 0) {
                try {
                    int min = Math.min(i2, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i2 -= min;
                } catch (EOFException unused) {
                    throw new IOException(C0201.m82(3557));
                }
            }
        } else {
            throw new IOException(C0201.m82(3558));
        }
    }

    public static <T> void g(T t) {
        if (t == null) {
            throw new NullPointerException(C0201.m82(3560));
        }
    }
}
