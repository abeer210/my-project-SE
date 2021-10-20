package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: lp2  reason: default package */
/* compiled from: TopTabsLayoutCreator */
public class lp2 {
    private Context a;
    private List<nl2> b;

    public lp2(Context context, List<nl2> list) {
        this.a = context;
        this.b = list;
    }

    public np2 a() {
        Context context = this.a;
        List<nl2> list = this.b;
        return new np2(context, list, new go2(list));
    }
}
