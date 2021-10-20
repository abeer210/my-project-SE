package defpackage;

/* renamed from: r30  reason: default package */
/* compiled from: ConnectionType */
public enum r30 {
    OFFLINE("o"),
    MOBILE("m"),
    WIFI("w"),
    LAN("l"),
    OTHER("");
    
    private String a;

    private r30(String str) {
        this.a = str;
    }

    public String b() {
        return this.a;
    }
}
