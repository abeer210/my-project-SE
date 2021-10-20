package defpackage;

import com.bumptech.glide.load.d;
import com.bumptech.glide.load.i;
import defpackage.aj;
import java.io.File;

/* renamed from: qh  reason: default package */
/* compiled from: DataCacheWriter */
public class qh<DataType> implements aj.b {
    private final d<DataType> a;
    private final DataType b;
    private final i c;

    public qh(d<DataType> dVar, DataType datatype, i iVar) {
        this.a = dVar;
        this.b = datatype;
        this.c = iVar;
    }

    @Override // defpackage.aj.b
    public boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}
