package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

@pj0(name = "FileReaderModule")
public class FileReaderModule extends NativeFileReaderModuleSpec {
    private static final String ERROR_INVALID_BLOB = null;
    public static final String NAME = null;

    static {
        C0201.m83(FileReaderModule.class, 595);
    }

    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private BlobModule getBlobModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (BlobModule) reactApplicationContextIfActiveOrWarn.getNativeModule(BlobModule.class);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(32828);
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsDataURL(ReadableMap readableMap, Promise promise) {
        String r0 = C0201.m82(32829);
        BlobModule blobModule = getBlobModule(C0201.m82(32830));
        if (blobModule == null) {
            promise.reject(new IllegalStateException(C0201.m82(32831)));
            return;
        }
        byte[] resolve = blobModule.resolve(readableMap.getString(C0201.m82(32832)), readableMap.getInt(C0201.m82(32833)), readableMap.getInt(C0201.m82(32834)));
        if (resolve == null) {
            promise.reject(C0201.m82(32835), C0201.m82(32836));
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(32837));
            if (!readableMap.hasKey(r0) || readableMap.getString(r0).isEmpty()) {
                sb.append(C0201.m82(32838));
            } else {
                sb.append(readableMap.getString(r0));
            }
            sb.append(C0201.m82(32839));
            sb.append(Base64.encodeToString(resolve, 2));
            promise.resolve(sb.toString());
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsText(ReadableMap readableMap, String str, Promise promise) {
        BlobModule blobModule = getBlobModule(C0201.m82(32840));
        if (blobModule == null) {
            promise.reject(new IllegalStateException(C0201.m82(32841)));
            return;
        }
        byte[] resolve = blobModule.resolve(readableMap.getString(C0201.m82(32842)), readableMap.getInt(C0201.m82(32843)), readableMap.getInt(C0201.m82(32844)));
        if (resolve == null) {
            promise.reject(C0201.m82(32845), C0201.m82(32846));
            return;
        }
        try {
            promise.resolve(new String(resolve, str));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
