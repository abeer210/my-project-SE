package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.util.a;
import com.facebook.react.util.b;
import vigqyno.C0201;

@pj0(name = "ExceptionsManager")
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    public static final String NAME = null;
    private final gj0 mDevSupportManager;

    static {
        C0201.m83(ExceptionsManagerModule.class, 627);
    }

    public ExceptionsManagerModule(gj0 gj0) {
        super(null);
        this.mDevSupportManager = gj0;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        if (this.mDevSupportManager.b()) {
            this.mDevSupportManager.d();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(5358);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap readableMap) {
        String r0 = C0201.m82(5359);
        String string = readableMap.hasKey(r0) ? readableMap.getString(r0) : C0201.m82(5360);
        String r1 = C0201.m82(5361);
        ReadableArray array = readableMap.hasKey(r1) ? readableMap.getArray(r1) : Arguments.createArray();
        String r2 = C0201.m82(5362);
        int i = readableMap.hasKey(r2) ? readableMap.getInt(r2) : -1;
        String r3 = C0201.m82(5363);
        boolean z = false;
        boolean z2 = readableMap.hasKey(r3) ? readableMap.getBoolean(r3) : false;
        if (this.mDevSupportManager.b()) {
            String r32 = C0201.m82(5364);
            if (readableMap.getMap(r32) != null) {
                ReadableMap map = readableMap.getMap(r32);
                String r6 = C0201.m82(5365);
                if (map.hasKey(r6)) {
                    z = readableMap.getMap(r32).getBoolean(r6);
                }
            }
            if (!z) {
                this.mDevSupportManager.g(string, array, i);
                return;
            }
            return;
        }
        String a = a.a(readableMap);
        if (!z2) {
            String a2 = b.a(string, array);
            String r12 = C0201.m82(5366);
            f60.i(r12, a2);
            if (a != null) {
                f60.c(r12, C0201.m82(5367), a);
                return;
            }
            return;
        }
        c cVar = new c(b.a(string, array));
        cVar.a(a);
        throw cVar;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String str, ReadableArray readableArray, double d) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString(C0201.m82(5368), str);
        javaOnlyMap.putArray(C0201.m82(5369), readableArray);
        javaOnlyMap.putInt(C0201.m82(5370), (int) d);
        javaOnlyMap.putBoolean(C0201.m82(5371), true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String str, ReadableArray readableArray, double d) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString(C0201.m82(5372), str);
        javaOnlyMap.putArray(C0201.m82(5373), readableArray);
        javaOnlyMap.putInt(C0201.m82(5374), (int) d);
        javaOnlyMap.putBoolean(C0201.m82(5375), false);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
        int i = (int) d;
        if (this.mDevSupportManager.b()) {
            this.mDevSupportManager.r(str, readableArray, i);
        }
    }
}
