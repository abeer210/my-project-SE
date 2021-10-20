package defpackage;

import android.app.Application;
import com.facebook.soloader.SoLoader;
import com.reactnativenavigation.react.a0;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0179;

/* renamed from: nd2  reason: default package */
/* compiled from: NavigationApplication */
public abstract class nd2 extends Application implements qi0 {
    public static nd2 c;
    private a0 a;
    public final Map<String, nm2> b = new HashMap();

    static {
        C0179.m19();
    }

    public a0 c() {
        return new a0(a());
    }

    public final Map<String, nm2> d() {
        return this.b;
    }

    public a0 e() {
        return this.a;
    }

    public void f(int i, String[] strArr, int[] iArr) {
    }

    public void onCreate() {
        super.onCreate();
        c = this;
        SoLoader.g(this, false);
        this.a = c();
    }
}
