package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: dg0  reason: default package */
/* compiled from: LocalAssetFetchProducer */
public class dg0 extends hg0 {
    private final AssetManager c;

    public dg0(Executor executor, r60 r60, AssetManager assetManager) {
        super(executor, r60);
        this.c = assetManager;
    }

    private static String g(ih0 ih0) {
        return ih0.q().getPath().substring(1);
    }

    private int h(ih0 ih0) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.c.openFd(g(ih0));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (IOException unused2) {
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

    @Override // defpackage.hg0
    public af0 d(ih0 ih0) throws IOException {
        return e(this.c.open(g(ih0), 2), h(ih0));
    }

    @Override // defpackage.hg0
    public String f() {
        return C0201.m82(36522);
    }
}
