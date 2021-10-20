package defpackage;

import java.io.IOException;

/* renamed from: ey  reason: default package */
/* compiled from: VideoInformationMediaHeaderAtom */
public class ey extends qx {
    public int c;
    public int[] d;

    public ey(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
        this.c = orVar.p();
        this.d = new int[]{orVar.p(), orVar.p(), orVar.p()};
    }

    public void a(xy xyVar) {
        xyVar.K(12, this.d);
        xyVar.J(11, this.c);
    }
}
