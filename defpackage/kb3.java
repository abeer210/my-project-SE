package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: kb3  reason: default package */
/* compiled from: Properties */
public class kb3 {
    private static final ThreadLocal a = new ThreadLocal();

    /* access modifiers changed from: package-private */
    /* renamed from: kb3$a */
    /* compiled from: Properties */
    public static class a implements PrivilegedAction {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            Map map = (Map) kb3.a.get();
            if (map != null) {
                return map.get(this.a);
            }
            return System.getProperty(this.a);
        }
    }

    private static String b(String str) {
        return (String) AccessController.doPrivileged(new a(str));
    }

    public static boolean c(String str) {
        try {
            String b = b(str);
            if (b != null) {
                return C0201.m82(10187).equals(mb3.d(b));
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
