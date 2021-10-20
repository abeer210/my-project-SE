package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "SourceCode")
public class SourceCodeModule extends NativeSourceCodeSpec {
    public static final String NAME = null;

    static {
        C0201.m83(SourceCodeModule.class, 335);
    }

    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(10217);
    }

    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        String sourceURL = getReactApplicationContext().getSourceURL();
        yh0.d(sourceURL, C0201.m82(10218));
        hashMap.put(C0201.m82(10219), sourceURL);
        return hashMap;
    }
}
