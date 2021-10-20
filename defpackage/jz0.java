package defpackage;

/* renamed from: jz0  reason: default package */
public enum jz0 implements nv0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    
    private final int a;

    private jz0(int i) {
        this.a = i;
    }

    @Override // defpackage.nv0
    public final int u() {
        return this.a;
    }
}
