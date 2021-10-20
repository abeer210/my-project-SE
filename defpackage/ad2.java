package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

/* renamed from: ad2  reason: default package */
/* compiled from: DeviceIdResolver */
public class ad2 {
    private final Context a;

    public ad2(Context context) {
        this.a = context;
    }

    public String a() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object invoke = Class.forName(C0201.m82(7672)).getDeclaredMethod(C0201.m82(7673), new Class[0]).invoke(null, new Object[0]);
        return (String) invoke.getClass().getMethod(C0201.m82(7674), new Class[0]).invoke(invoke, new Object[0]);
    }

    public String b() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object invoke = Class.forName(C0201.m82(7675)).getDeclaredMethod(C0201.m82(7676), Context.class).invoke(null, this.a);
        return (String) invoke.getClass().getMethod(C0201.m82(7677), new Class[0]).invoke(invoke, new Object[0]);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
    public String c() {
        try {
            return a();
        } catch (ClassNotFoundException unknown) {
            try {
            } catch (ClassNotFoundException unused) {
                System.err.println(C0201.m82(7680));
                return C0201.m82(7681);
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused2) {
                System.err.println(C0201.m82(7679));
                System.err.println(C0201.m82(7680));
                return C0201.m82(7681);
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused3) {
            System.err.println(C0201.m82(7678));
        }
        return b();
    }
}
