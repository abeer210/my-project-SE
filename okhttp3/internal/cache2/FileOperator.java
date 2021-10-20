package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;

public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel2) {
        this.fileChannel = fileChannel2;
    }

    public void read(long j, ay2 ay2, long j2) throws IOException {
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, ay2);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void write(long j, ay2 ay2, long j2) throws IOException {
        if (j2 < 0 || j2 > ay2.Q()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.fileChannel.transferFrom(ay2, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
