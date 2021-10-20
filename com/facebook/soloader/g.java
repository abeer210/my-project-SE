package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* compiled from: FileLocker */
public final class g implements Closeable {
    private final FileOutputStream a;
    private final FileLock b;

    private g(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.a = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
            }
            this.b = lock;
        } finally {
            this.a.close();
        }
    }

    public static g a(File file) throws IOException {
        return new g(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.b != null) {
                this.b.release();
            }
        } finally {
            this.a.close();
        }
    }
}
