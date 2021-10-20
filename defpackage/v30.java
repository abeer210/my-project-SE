package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import com.dynatrace.android.agent.u;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: v30  reason: default package */
/* compiled from: LcUtility */
public final class v30 {
    private static final String f = (u.b + C0201.m82(25132));
    private static final v30 g = new v30();
    private static final Hashtable<String, e30> h = new Hashtable<>();
    private String a;
    private String b;
    private ArrayList<o30> c = new ArrayList<>(2);
    private boolean d = false;
    private boolean e = true;

    /* renamed from: v30$a */
    /* compiled from: LcUtility */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[e30.values().length];
            a = iArr;
            iArr[e30.onActivityCreate.ordinal()] = 1;
            a[e30.onActivityStart.ordinal()] = 2;
            a[e30.onActivityResume.ordinal()] = 3;
            a[e30.onActivityPause.ordinal()] = 4;
            a[e30.onActivityStop.ordinal()] = 5;
        }
    }

    private v30() {
    }

    public static v30 b() {
        return g;
    }

    @SuppressLint({"NewApi"})
    private boolean c(Context context, boolean z, boolean z2) {
        List<ActivityManager.RunningTaskInfo> list;
        ActivityManager activityManager;
        boolean z3 = false;
        boolean z4 = true;
        if (this.e && (activityManager = (ActivityManager) context.getSystemService(C0201.m82(25133))) != null) {
            try {
                list = activityManager.getRunningTasks(1);
            } catch (Exception unused) {
                this.e = false;
            }
            if (list != null || list.isEmpty()) {
                z4 = d(z, z2);
            } else if (list.get(0).topActivity.getPackageName().equals(context.getPackageName()) && ((z4 = true ^ z))) {
                Enumeration<e30> elements = h.elements();
                while (true) {
                    if (elements.hasMoreElements()) {
                        if (!elements.nextElement().equals(e30.onActivityResume)) {
                            break;
                        }
                    } else {
                        z3 = z4;
                        break;
                    }
                }
                z4 = z3;
            }
            this.d = z4;
            return z4;
        }
        list = null;
        if (list != null) {
        }
        z4 = d(z, z2);
        this.d = z4;
        return z4;
    }

    private boolean d(boolean z, boolean z2) {
        if (!(z && z2) || h.size() > 1) {
            Enumeration<e30> elements = h.elements();
            while (elements.hasMoreElements()) {
                if (!elements.nextElement().equals(e30.onActivityStop)) {
                    return false;
                }
            }
            return true;
        }
        if (u.c) {
            s30.r(f, C0201.m82(25134));
        }
        return true;
    }

    public String a() {
        if (this.d) {
            return null;
        }
        return this.a;
    }

    public void e(o30 o30) {
        ArrayList<o30> arrayList = this.c;
        if (arrayList != null) {
            arrayList.add(o30);
        }
    }

    public void f(Activity activity, e30 e30) {
        if (activity != null && e30 != null) {
            String m = u30.n().m(activity);
            h.put(m, e30);
            String simpleName = activity.getClass().getSimpleName();
            int i = a.a[e30.ordinal()];
            String r3 = C0201.m82(25135);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!simpleName.equals(this.a)) {
                        this.b = this.a;
                        this.a = simpleName;
                    }
                    if (u.c) {
                        s30.r(f, String.format(r3, simpleName, e30, this.a, this.b));
                    }
                    if (this.d) {
                        Iterator<o30> it = this.c.iterator();
                        while (it.hasNext()) {
                            it.next().b();
                        }
                        this.d = false;
                    }
                } else if (i != 4) {
                    if (i == 5) {
                        if (u.c) {
                            s30.r(f, String.format(r3, simpleName, e30, this.a, this.b));
                        }
                        boolean c2 = c(activity.getApplicationContext(), activity.isFinishing(), activity.isTaskRoot());
                        this.d = c2;
                        if (c2) {
                            Iterator<o30> it2 = this.c.iterator();
                            while (it2.hasNext()) {
                                it2.next().a();
                            }
                        }
                        h.remove(m);
                    }
                } else if (u.c) {
                    s30.r(f, String.format(r3, simpleName, e30, this.a, this.b));
                }
            } else if (u.c) {
                s30.r(f, String.format(r3, simpleName, e30, this.a, this.b));
            }
        }
    }
}
