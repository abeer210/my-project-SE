package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: zx  reason: default package */
/* compiled from: SubtitleSampleDescriptionAtom */
public class zx extends wx<a> {

    /* access modifiers changed from: package-private */
    /* renamed from: zx$a */
    /* compiled from: SubtitleSampleDescriptionAtom */
    public class a extends vx {
        public int b;
        public long c;
        public int d;
        public int e;
        public int f;
        public int[] g;
    }

    public zx(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
    }

    public void b(oy oyVar) {
        boolean z = false;
        a aVar = (a) this.d.get(0);
        oyVar.B(1, (aVar.b & 536870912) == 536870912);
        oyVar.B(2, (aVar.b & 1073741824) == 1073741824);
        if ((aVar.b & -1073741824) == -1073741824) {
            z = true;
        }
        oyVar.B(3, z);
        oyVar.L(4, aVar.c);
        oyVar.J(5, aVar.d);
        int i = aVar.e;
        if (i == 1) {
            oyVar.R(6, C0201.m82(23534));
        } else if (i == 2) {
            oyVar.R(6, C0201.m82(23533));
        } else if (i == 4) {
            oyVar.R(6, C0201.m82(23532));
        }
        oyVar.J(7, aVar.f);
        oyVar.K(8, aVar.g);
    }

    /* renamed from: c */
    public a a(or orVar) throws IOException {
        return null;
    }
}
