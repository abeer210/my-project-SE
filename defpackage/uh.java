package defpackage;

import android.util.Log;
import androidx.core.util.e;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: uh  reason: default package */
/* compiled from: DecodePath */
public class uh<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;
    private final List<? extends k<DataType, ResourceType>> b;
    private final sm<ResourceType, Transcode> c;
    private final e<List<Throwable>> d;
    private final String e;

    /* access modifiers changed from: package-private */
    /* renamed from: uh$a */
    /* compiled from: DecodePath */
    public interface a<ResourceType> {
        hi<ResourceType> a(hi<ResourceType> hiVar);
    }

    public uh(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends k<DataType, ResourceType>> list, sm<ResourceType, Transcode> smVar, e<List<Throwable>> eVar) {
        this.a = cls;
        this.b = list;
        this.c = smVar;
        this.d = eVar;
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(10152));
        sb.append(cls.getSimpleName());
        String r1 = C0201.m82(10153);
        sb.append(r1);
        sb.append(cls2.getSimpleName());
        sb.append(r1);
        sb.append(cls3.getSimpleName());
        sb.append(C0201.m82(10154));
        this.e = sb.toString();
    }

    private hi<ResourceType> b(wg<DataType> wgVar, int i, int i2, i iVar) throws ci {
        List<Throwable> b2 = this.d.b();
        ep.d(b2);
        List<Throwable> list = b2;
        try {
            return c(wgVar, i, i2, iVar, list);
        } finally {
            this.d.a(list);
        }
    }

    private hi<ResourceType> c(wg<DataType> wgVar, int i, int i2, i iVar, List<Throwable> list) throws ci {
        int size = this.b.size();
        hi<ResourceType> hiVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) this.b.get(i3);
            try {
                if (kVar.a(wgVar.a(), iVar)) {
                    hiVar = kVar.b(wgVar.a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                String r6 = C0201.m82(10155);
                if (Log.isLoggable(r6, 2)) {
                    Log.v(r6, C0201.m82(10156) + kVar, e2);
                }
                list.add(e2);
            }
            if (hiVar != null) {
                break;
            }
        }
        if (hiVar != null) {
            return hiVar;
        }
        throw new ci(this.e, new ArrayList(list));
    }

    public hi<Transcode> a(wg<DataType> wgVar, int i, int i2, i iVar, a<ResourceType> aVar) throws ci {
        return this.c.a(aVar.a(b(wgVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        return C0201.m82(10157) + this.a + C0201.m82(10158) + this.b + C0201.m82(10159) + this.c + '}';
    }
}
