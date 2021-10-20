package com.huawei.hms.update.a;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import vigqyno.C0201;

/* compiled from: RandomFileOutputStream */
public class b extends OutputStream {
    private RandomAccessFile a;

    public b(File file, int i) {
        String r0 = C0201.m82(14405);
        String r1 = C0201.m82(14406);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, C0201.m82(14407));
            this.a = randomAccessFile;
            randomAccessFile.setLength((long) i);
        } catch (FileNotFoundException unused) {
            HMSLog.e(r1, r0);
        } catch (IOException unused2) {
            IOUtils.closeQuietly(this.a);
            HMSLog.e(r1, r0);
        }
    }

    public void a(long j) throws IOException {
        this.a.seek(j);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
