package com.facebook.react.bridge;

import vigqyno.C0201;

public class PromiseImpl implements Promise {
    private static final String ERROR_DEFAULT_CODE = null;
    private static final String ERROR_DEFAULT_MESSAGE = null;
    private static final String ERROR_MAP_KEY_CODE = null;
    private static final String ERROR_MAP_KEY_MESSAGE = null;
    private static final String ERROR_MAP_KEY_NATIVE_STACK = null;
    private static final String ERROR_MAP_KEY_USER_INFO = null;
    private static final int ERROR_STACK_FRAME_LIMIT = 0;
    private static final String STACK_FRAME_KEY_CLASS = null;
    private static final String STACK_FRAME_KEY_FILE = null;
    private static final String STACK_FRAME_KEY_LINE_NUMBER = null;
    private static final String STACK_FRAME_KEY_METHOD_NAME = null;
    private Callback mReject;
    private Callback mResolve;

    static {
        C0201.m83(PromiseImpl.class, 404);
    }

    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2) {
        reject(str, str2, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            callback.invoke(obj);
            this.mResolve = null;
            this.mReject = null;
        }
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th) {
        reject(str, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th) {
        reject(str, str2, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th) {
        reject(null, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th, WritableMap writableMap) {
        reject(null, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, WritableMap writableMap) {
        reject(str, null, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th, WritableMap writableMap) {
        reject(str, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, WritableMap writableMap) {
        reject(str, str2, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th, WritableMap writableMap) {
        if (this.mReject == null) {
            this.mResolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        String r2 = C0201.m82(2609);
        if (str == null) {
            writableNativeMap.putString(r2, C0201.m82(2610));
        } else {
            writableNativeMap.putString(r2, str);
        }
        String r8 = C0201.m82(2611);
        if (str2 != null) {
            writableNativeMap.putString(r8, str2);
        } else if (th != null) {
            writableNativeMap.putString(r8, th.getMessage());
        } else {
            writableNativeMap.putString(r8, C0201.m82(2612));
        }
        String r82 = C0201.m82(2613);
        if (writableMap != null) {
            writableNativeMap.putMap(r82, writableMap);
        } else {
            writableNativeMap.putNull(r82);
        }
        String r9 = C0201.m82(2614);
        if (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int i = 0;
            while (i < stackTrace.length && i < 50) {
                StackTraceElement stackTraceElement = stackTrace[i];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString(C0201.m82(2615), stackTraceElement.getClassName());
                writableNativeMap2.putString(C0201.m82(2616), stackTraceElement.getFileName());
                writableNativeMap2.putInt(C0201.m82(2617), stackTraceElement.getLineNumber());
                writableNativeMap2.putString(C0201.m82(2618), stackTraceElement.getMethodName());
                writableNativeArray.pushMap(writableNativeMap2);
                i++;
            }
            writableNativeMap.putArray(r9, writableNativeArray);
        } else {
            writableNativeMap.putArray(r9, new WritableNativeArray());
        }
        this.mReject.invoke(writableNativeMap);
        this.mResolve = null;
        this.mReject = null;
    }

    @Override // com.facebook.react.bridge.Promise
    @Deprecated
    public void reject(String str) {
        reject(null, str, null, null);
    }
}
