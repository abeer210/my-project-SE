package com.facebook.react.bridge;

@zh0
public interface JavaJSExecutor {

    public interface Factory {
        JavaJSExecutor create() throws Exception;
    }

    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @zh0
    String executeJSCall(String str, String str2) throws ProxyExecutorException;

    @zh0
    void loadBundle(String str) throws ProxyExecutorException;

    @zh0
    void setGlobalVariable(String str, String str2);
}
