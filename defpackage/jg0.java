package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: jg0  reason: default package */
/* compiled from: LocalResourceFetchProducer */
public class jg0 extends hg0 {
    private final Resources c;

    public jg0(Executor executor, r60 r60, Resources resources) {
        super(executor, r60);
        this.c = resources;
    }

    private int g(ih0 ih0) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.c.openRawResourceFd(h(ih0));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private static int h(ih0 ih0) {
        return Integer.parseInt(ih0.q().getPath().substring(1));
    }

    @Override // defpackage.hg0
    public af0 d(ih0 ih0) throws IOException {
        return e(this.c.openRawResource(h(ih0)), g(ih0));
    }

    @Override // defpackage.hg0
    public String f() {
        return C0201.m82(33505);
    }
}
