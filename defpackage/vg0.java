package defpackage;

import android.content.ContentResolver;
import java.io.IOException;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: vg0  reason: default package */
/* compiled from: QualifiedResourceFetchProducer */
public class vg0 extends hg0 {
    private final ContentResolver c;

    public vg0(Executor executor, r60 r60, ContentResolver contentResolver) {
        super(executor, r60);
        this.c = contentResolver;
    }

    @Override // defpackage.hg0
    public af0 d(ih0 ih0) throws IOException {
        return e(this.c.openInputStream(ih0.q()), -1);
    }

    @Override // defpackage.hg0
    public String f() {
        return C0201.m82(21637);
    }
}
