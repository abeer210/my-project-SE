package vigqyno;

import android.os.Build;
import android.os.Environment;
import android.os.Process;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: vigqyno.▀  reason: contains not printable characters */
public class C0195 {

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public static String f26 = "acmfafjnjmad";

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private String f27;

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public HashMap<String, ZipEntry> f28;

    /* renamed from: ┃  reason: not valid java name and contains not printable characters */
    private String f29;

    /* renamed from: ┄  reason: not valid java name and contains not printable characters */
    private String f30;

    static {
        C0179.m19();
    }

    public C0195() {
        this.f27 = null;
        this.f29 = null;
        this.f28 = null;
        this.f30 = null;
        this.f27 = m48(getClass().getClassLoader());
        this.f29 = m56();
        this.f28 = m58();
        this.f30 = m52();
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private static String m48(ClassLoader classLoader) {
        String str = "!/" + "AndroidManifest.xml";
        String[] strArr = {"jar", "file"};
        URL resource = classLoader.getResource("AndroidManifest.xml");
        if (resource != null) {
            String url = resource.toString();
            if (url.endsWith(str)) {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    url = url.replaceFirst(Pattern.quote(strArr[i] + ":"), "");
                }
                return url.substring(0, url.length() - str.length());
            }
        }
        return System.getProperty("java.class.path");
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private static String m49(String str) {
        return "lib/" + str + "/lib" + f26 + ".so";
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private static void m50(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private static void m51(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private String m52() {
        String str = "/data/data/" + this.f29 + "/cache";
        File file = new File(str);
        if ((file.isDirectory() && file.canWrite()) || file.mkdirs()) {
            return str;
        }
        String property = System.getProperty("java.io.tmpdir");
        File file2 = new File(property);
        if (property.startsWith(Environment.getDataDirectory().getAbsolutePath()) && ((file2.isDirectory() && file2.canWrite()) || file2.mkdirs())) {
            return property;
        }
        String str2 = Environment.getDataDirectory() + "/user/" + (Process.myUid() / 100000) + "/" + this.f29 + "/cache";
        File file3 = new File(str2);
        if ((!file3.isDirectory() || !file3.canWrite()) && !file3.mkdirs()) {
            return null;
        }
        return str2;
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public static boolean m53(String str, String str2) {
        ZipFile zipFile = new ZipFile(str);
        try {
            return zipFile.getEntry(str2) != null;
        } finally {
            m51(zipFile);
        }
    }

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    private static Collection<String> m54() {
        ArrayList arrayList = new ArrayList();
        for (String str : m57()) {
            arrayList.add(m49(str));
        }
        return arrayList;
    }

    /* renamed from: ┄  reason: not valid java name and contains not printable characters */
    public static String m55() {
        return f26;
    }

    /* renamed from: ┅  reason: not valid java name and contains not printable characters */
    private static String m56() {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/cmdline"));
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new RuntimeException("Could not find package name");
            }
            String trim = readLine.trim();
            if (trim.lastIndexOf(58) != -1) {
                return trim.substring(0, trim.lastIndexOf(":"));
            }
            m50(bufferedReader);
            return trim;
        } finally {
            m50(bufferedReader);
        }
    }

    /* renamed from: ┆  reason: not valid java name and contains not printable characters */
    private static final String[] m57() {
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    /* renamed from: ┈  reason: not valid java name and contains not printable characters */
    private HashMap<String, ZipEntry> m58() {
        if (this.f27 == null || this.f27.isEmpty()) {
            throw new RuntimeException("APK filename is not found yet");
        }
        ZipFile zipFile = new ZipFile(this.f27);
        try {
            HashMap<String, ZipEntry> hashMap = new HashMap<>();
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                hashMap.put(zipEntry.getName(), zipEntry);
            }
            return hashMap;
        } finally {
            m51(zipFile);
        }
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public String m59() {
        return this.f30;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public void m60(String str, String str2) {
        ZipFile zipFile = new ZipFile(this.f27);
        try {
            InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(str));
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        m50(fileOutputStream);
                        m50(inputStream);
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                m50(fileOutputStream);
                m50(inputStream);
                throw th;
            }
        } finally {
            m51(zipFile);
        }
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public boolean m61(String str) {
        if (this.f28 != null) {
            return this.f28.containsKey(str);
        }
        throw new RuntimeException("Entries are not found yet");
    }

    /* renamed from: ┃  reason: not valid java name and contains not printable characters */
    public String m62() {
        String[] r1 = m57();
        for (String str : r1) {
            if (m61(str)) {
                return m49(str);
            }
        }
        throw new FileNotFoundException("Could not find library inside APK: " + m63());
    }

    /* renamed from: ┇  reason: not valid java name and contains not printable characters */
    public String m63() {
        return this.f27;
    }

    /* renamed from: ┉  reason: not valid java name and contains not printable characters */
    public String m64() {
        return this.f29;
    }
}
