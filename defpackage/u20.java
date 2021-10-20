package defpackage;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.dynatrace.android.agent.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: u20  reason: default package */
/* compiled from: CookieWriter */
public class u20 {
    private static final String c = (u.b + C0201.m82(29322));
    private Context a;
    private CookieManager b;

    public u20(Context context) {
        this.a = context;
        a();
    }

    private void a() {
        try {
            CookieManager.setAcceptFileSchemeCookies(true);
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(this.a);
                CookieSyncManager.getInstance();
            }
            if (!CookieManager.getInstance().acceptCookie()) {
                CookieManager.getInstance().setAcceptCookie(true);
            }
            this.b = CookieManager.getInstance();
        } catch (Exception e) {
            if (u.c) {
                s30.u(c, C0201.m82(29323), e);
            }
        }
    }

    public void b(Set<String> set, Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next() + C0201.m82(29324));
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.b.flush();
        } else {
            CookieSyncManager.getInstance().sync();
        }
        c(set, arrayList);
    }

    public void c(Set<String> set, Collection<String> collection) {
        if (this.b != null) {
            if (u.c) {
                String str = c;
                s30.r(str, C0201.m82(29325) + set.toString());
                String str2 = c;
                s30.r(str2, C0201.m82(29326) + collection.toString());
            }
            for (String str3 : set) {
                for (String str4 : collection) {
                    this.b.setCookie(str3, str4);
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.b.flush();
            } else {
                CookieSyncManager.getInstance().sync();
            }
        }
    }
}
