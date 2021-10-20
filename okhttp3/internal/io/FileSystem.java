package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import vigqyno.C0201;

public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() {
        /* class okhttp3.internal.io.FileSystem.AnonymousClass1 */

        @Override // okhttp3.internal.io.FileSystem
        public sy2 appendingSink(File file) throws FileNotFoundException {
            try {
                return jy2.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return jy2.a(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException(C0201.m82(29317) + file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException(C0201.m82(29318) + file2);
                    }
                }
                return;
            }
            throw new IOException(C0201.m82(29319) + file);
        }

        @Override // okhttp3.internal.io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.io.FileSystem
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (!file.renameTo(file2)) {
                throw new IOException(C0201.m82(29320) + file + C0201.m82(29321) + file2);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public sy2 sink(File file) throws FileNotFoundException {
            try {
                return jy2.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return jy2.f(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.io.FileSystem
        public ty2 source(File file) throws FileNotFoundException {
            return jy2.j(file);
        }
    };

    sy2 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    sy2 sink(File file) throws FileNotFoundException;

    long size(File file);

    ty2 source(File file) throws FileNotFoundException;
}
