package defpackage;

import java.util.List;

/* renamed from: dm2  reason: default package */
/* compiled from: BottomTabFinder */
public class dm2 {
    private List<nl2> a;

    public dm2(List<nl2> list) {
        this.a = list;
    }

    public int a(String str) {
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).t(str) != null) {
                return i;
            }
        }
        return -1;
    }
}
