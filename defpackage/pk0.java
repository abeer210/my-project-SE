package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: pk0  reason: default package */
/* compiled from: ReactFindViewUtil */
public class pk0 {
    private static final List<b> a = new ArrayList();
    private static final Map<a, Set<String>> b = new HashMap();

    /* renamed from: pk0$a */
    /* compiled from: ReactFindViewUtil */
    public interface a {
        void a(View view, String str);
    }

    /* renamed from: pk0$b */
    /* compiled from: ReactFindViewUtil */
    public interface b {
        String a();

        void b(View view);
    }

    public static void a(b bVar) {
        a.add(bVar);
    }

    public static View b(View view, String str) {
        String d = d(view);
        if (d != null && d.equals(str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View b2 = b(viewGroup.getChildAt(i), str);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public static void c(View view, b bVar) {
        View b2 = b(view, bVar.a());
        if (b2 != null) {
            bVar.b(b2);
        }
        a(bVar);
    }

    private static String d(View view) {
        Object tag = view.getTag(ii0.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void e(View view) {
        String d = d(view);
        if (d != null) {
            Iterator<b> it = a.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (d != null && d.equals(next.a())) {
                    next.b(view);
                    it.remove();
                }
            }
            for (Map.Entry<a, Set<String>> entry : b.entrySet()) {
                Set<String> value = entry.getValue();
                if (value != null && value.contains(d)) {
                    entry.getKey().a(view, d);
                }
            }
        }
    }
}
