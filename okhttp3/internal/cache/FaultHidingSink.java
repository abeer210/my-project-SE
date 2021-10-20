package okhttp3.internal.cache;

import java.io.IOException;

public class FaultHidingSink extends ey2 {
    private boolean hasErrors;

    public FaultHidingSink(sy2 sy2) {
        super(sy2);
    }

    @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable, defpackage.ey2
    public void close() throws IOException {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    @Override // defpackage.sy2, defpackage.ey2, java.io.Flushable
    public void flush() throws IOException {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    public void onException(IOException iOException) {
    }

    @Override // defpackage.sy2, defpackage.ey2
    public void write(ay2 ay2, long j) throws IOException {
        if (this.hasErrors) {
            ay2.b(j);
            return;
        }
        try {
            super.write(ay2, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}
