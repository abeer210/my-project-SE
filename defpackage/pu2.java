package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: pu2  reason: default package */
/* compiled from: FileUtils */
public class pu2 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    public static void a(String str, String str2) throws IOException {
        Throwable th;
        FileChannel fileChannel;
        if (!str.equalsIgnoreCase(str2)) {
            FileChannel fileChannel2 = null;
            try {
                FileChannel channel = new FileInputStream(new File(str)).getChannel();
                try {
                    fileChannel2 = new FileOutputStream(new File(str2)).getChannel();
                    channel.transferTo(0, channel.size(), fileChannel2);
                    channel.close();
                    if (channel != null) {
                        channel.close();
                    }
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel2 = channel;
                    fileChannel = fileChannel2;
                    if (fileChannel2 != null) {
                    }
                    if (fileChannel != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileChannel = null;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        }
    }
}
