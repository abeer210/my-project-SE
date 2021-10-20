package defpackage;

import androidx.core.util.e;
import com.bumptech.glide.load.i;
import defpackage.uh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* renamed from: fi  reason: default package */
/* compiled from: LoadPath */
public class fi<Data, ResourceType, Transcode> {
    private final e<List<Throwable>> a;
    private final List<? extends uh<Data, ResourceType, Transcode>> b;
    private final String c;

    public fi(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<uh<Data, ResourceType, Transcode>> list, e<List<Throwable>> eVar) {
        this.a = eVar;
        ep.c(list);
        this.b = list;
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(15132));
        sb.append(cls.getSimpleName());
        String r1 = C0201.m82(15133);
        sb.append(r1);
        sb.append(cls2.getSimpleName());
        sb.append(r1);
        sb.append(cls3.getSimpleName());
        sb.append(C0201.m82(15134));
        this.c = sb.toString();
    }

    private hi<Transcode> b(wg<Data> wgVar, i iVar, int i, int i2, uh.a<ResourceType> aVar, List<Throwable> list) throws ci {
        int size = this.b.size();
        hi<Transcode> hiVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                hiVar = ((uh) this.b.get(i3)).a(wgVar, i, i2, iVar, aVar);
            } catch (ci e) {
                list.add(e);
            }
            if (hiVar != null) {
                break;
            }
        }
        if (hiVar != null) {
            return hiVar;
        }
        throw new ci(this.c, new ArrayList(list));
    }

    public hi<Transcode> a(wg<Data> wgVar, i iVar, int i, int i2, uh.a<ResourceType> aVar) throws ci {
        List<Throwable> b2 = this.a.b();
        ep.d(b2);
        List<Throwable> list = b2;
        try {
            return b(wgVar, iVar, i, i2, aVar, list);
        } finally {
            this.a.a(list);
        }
    }

    public String toString() {
        return C0201.m82(15135) + Arrays.toString(this.b.toArray()) + '}';
    }
}
