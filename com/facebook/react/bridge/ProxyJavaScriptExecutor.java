package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaJSExecutor;
import vigqyno.C0201;

@zh0
public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    private JavaJSExecutor mJavaJSExecutor;

    public static class Factory implements JavaScriptExecutorFactory {
        private final JavaJSExecutor.Factory mJavaJSExecutorFactory;

        public Factory(JavaJSExecutor.Factory factory) {
            this.mJavaJSExecutorFactory = factory;
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public JavaScriptExecutor create() throws Exception {
            return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public void startSamplingProfiler() {
            throw new UnsupportedOperationException(C0201.m82(18459) + toString());
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public void stopSamplingProfiler(String str) {
            throw new UnsupportedOperationException(C0201.m82(18460) + toString());
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public ProxyJavaScriptExecutor(JavaJSExecutor javaJSExecutor) {
        super(initHybrid(javaJSExecutor));
        this.mJavaJSExecutor = javaJSExecutor;
    }

    private static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public void close() {
        JavaJSExecutor javaJSExecutor = this.mJavaJSExecutor;
        if (javaJSExecutor != null) {
            javaJSExecutor.close();
            this.mJavaJSExecutor = null;
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return C0201.m82(21424);
    }
}
