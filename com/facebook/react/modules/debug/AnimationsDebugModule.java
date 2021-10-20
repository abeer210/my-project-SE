package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.debug.b;
import java.util.Locale;
import vigqyno.C0201;

@pj0(name = "AnimationsDebugModule")
public class AnimationsDebugModule extends NativeAnimationsDebugModuleSpec {
    public static final String NAME = null;
    private final qj0 mCatalystSettings;
    private b mFrameCallback;

    static {
        C0201.m83(AnimationsDebugModule.class, 491);
    }

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, qj0 qj0) {
        super(reactApplicationContext);
        this.mCatalystSettings = qj0;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(15446);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        b bVar = this.mFrameCallback;
        if (bVar != null) {
            bVar.n();
            this.mFrameCallback = null;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec
    public void startRecordingFps() {
        qj0 qj0 = this.mCatalystSettings;
        if (qj0 != null && qj0.a()) {
            if (this.mFrameCallback == null) {
                b bVar = new b(getReactApplicationContext());
                this.mFrameCallback = bVar;
                bVar.m();
                return;
            }
            throw new JSApplicationCausedNativeException(C0201.m82(15447));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec
    public void stopRecordingFps(double d) {
        b bVar = this.mFrameCallback;
        if (bVar != null) {
            bVar.n();
            b.C0044b g = this.mFrameCallback.g((long) d);
            if (g == null) {
                Toast.makeText(getReactApplicationContext(), C0201.m82(15448), 1);
            } else {
                String str = String.format(Locale.US, C0201.m82(15449), Double.valueOf(g.d), Integer.valueOf(g.a), Integer.valueOf(g.c)) + C0201.m82(15451) + String.format(Locale.US, C0201.m82(15450), Double.valueOf(g.e), Integer.valueOf(g.b), Integer.valueOf(g.c)) + C0201.m82(15452) + String.format(Locale.US, C0201.m82(15453), Integer.valueOf(g.f));
                f60.b(C0201.m82(15454), str);
                Toast.makeText(getReactApplicationContext(), str, 1).show();
            }
            this.mFrameCallback = null;
        }
    }
}
