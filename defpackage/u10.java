package defpackage;

import java.util.List;
import vigqyno.C0201;

/* renamed from: u10  reason: default package */
/* compiled from: MonitoringDataPacket */
public class u10 {
    public String a;
    public List<String> b;

    public u10(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public String a() {
        StringBuilder sb = new StringBuilder(this.a);
        for (String str : this.b) {
            sb.append(C0201.m82(22344));
            sb.append(str);
        }
        return sb.toString();
    }
}
