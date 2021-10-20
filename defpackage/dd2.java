package defpackage;

/* renamed from: dd2  reason: default package */
/* compiled from: ConnectionType */
public enum dd2 {
    BLUETOOTH("bluetooth"),
    CELLULAR("cellular"),
    ETHERNET("ethernet"),
    NONE("none"),
    UNKNOWN("unknown"),
    WIFI("wifi"),
    WIMAX("wimax"),
    VPN("vpn");
    
    public final String a;

    private dd2(String str) {
        this.a = str;
    }
}
