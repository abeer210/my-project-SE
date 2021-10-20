package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: ig0  reason: default package */
/* compiled from: LocalFileFetchProducer */
public class ig0 extends hg0 {
    public ig0(Executor executor, r60 r60) {
        super(executor, r60);
    }

    @Override // defpackage.hg0
    public af0 d(ih0 ih0) throws IOException {
        return e(new FileInputStream(ih0.p().toString()), (int) ih0.p().length());
    }

    @Override // defpackage.hg0
    public String f() {
        return C0201.m82(35347);
    }
}
