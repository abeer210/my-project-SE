package defpackage;

/* renamed from: i30  reason: default package */
/* compiled from: VisitStoreVersion */
public enum i30 {
    V1_SERVER_SPLITTING(1),
    V2_AGENT_SPLITTING(2);
    
    private int a;

    private i30(int i) {
        this.a = i;
    }

    public static i30 b(int i, i30 i30) {
        i30[] values = values();
        for (i30 i302 : values) {
            if (i302.a == i) {
                return i302;
            }
        }
        return i30;
    }

    public int d() {
        return this.a;
    }
}
