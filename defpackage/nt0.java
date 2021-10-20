package defpackage;

/* renamed from: nt0  reason: default package */
public final /* synthetic */ class nt0 implements st0 {
    private final String a;
    private final boolean b = false;

    public nt0(String str, boolean z) {
        this.a = str;
    }

    @Override // defpackage.st0
    public final Object a() {
        return Boolean.valueOf(f01.h(kt0.h.getContentResolver(), this.a, this.b));
    }
}
