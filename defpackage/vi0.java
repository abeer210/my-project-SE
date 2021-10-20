package defpackage;

import android.app.Application;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.f;
import com.facebook.react.uimanager.p0;
import java.util.List;
import vigqyno.C0179;
import vigqyno.C0201;

/* renamed from: vi0  reason: default package */
/* compiled from: ReactNativeHost */
public abstract class vi0 {
    private final Application a;
    private si0 b;

    static {
        C0179.m19();
    }

    public vi0(Application application) {
        this.a = application;
    }

    public abstract si0 b();

    public final Application c() {
        return this.a;
    }

    public String d() {
        return C0201.m82(27008);
    }

    public String e() {
        return null;
    }

    public JSIModulePackage f() {
        return null;
    }

    public abstract String g();

    public JavaScriptExecutorFactory h() {
        return null;
    }

    public abstract List<wi0> i();

    public si0 j() {
        if (this.b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.b = b();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.b;
    }

    public f k() {
        return null;
    }

    public p0 l() {
        return new p0();
    }

    public abstract boolean m();

    public boolean n() {
        return this.b != null;
    }
}
