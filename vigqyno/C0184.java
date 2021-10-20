package vigqyno;

@Deprecated
/* renamed from: vigqyno.╌  reason: contains not printable characters */
public class C0184 implements AbstractC0182 {

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private AbstractC0198 f16;

    public C0184(AbstractC0198 r1) {
        if (r1 != null) {
            this.f16 = r1;
            return;
        }
        throw null;
    }

    @Override // vigqyno.AbstractC0182
    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public void m39(C0177 r3) {
        switch (C0170.f2[r3.m17().ordinal()]) {
            case 1:
                C0197 r32 = (C0197) r3;
                this.f16.m71(r32.m66(), r32.m69());
                return;
            case 2:
                this.f16.m74(((C0196) r3).m65());
                return;
            case 3:
                this.f16.m75(((C0171) r3).m3());
                return;
            case 4:
                this.f16.m72(((C0210) r3).m99());
                return;
            case 5:
                this.f16.m70(((C0217) r3).m131());
                return;
            case 6:
                this.f16.m76(((C0204) r3).m90());
                return;
            case 7:
                this.f16.m73(((C0200) r3).m81());
                return;
            case 8:
                this.f16.m77(((C0213) r3).m126());
                return;
            default:
                return;
        }
    }
}
