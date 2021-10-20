package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import vigqyno.C0201;

public final class FallbackJSBundleLoader extends JSBundleLoader {
    public static final String RECOVERABLE = null;
    public static final String TAG = null;
    private Stack<JSBundleLoader> mLoaders = new Stack<>();
    private final ArrayList<Exception> mRecoveredErrors = new ArrayList<>();

    static {
        C0201.m83(FallbackJSBundleLoader.class, 352);
    }

    public FallbackJSBundleLoader(List<JSBundleLoader> list) {
        ListIterator<JSBundleLoader> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            this.mLoaders.push(listIterator.previous());
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x0024 */
    private JSBundleLoader getDelegateLoader() {
        if (!this.mLoaders.empty()) {
            return this.mLoaders.peek();
        }
        RuntimeException runtimeException = new RuntimeException(C0201.m82(8187));
        Iterator<Exception> it = this.mRecoveredErrors.iterator();
        Throwable th = runtimeException;
        while (it.hasNext()) {
            th.initCause(it.next());
            th = th;
            while (th.getCause() != null) {
                th = th.getCause();
            }
        }
        throw runtimeException;
    }

    @Override // com.facebook.react.bridge.JSBundleLoader
    public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
        while (true) {
            try {
                return getDelegateLoader().loadScript(jSBundleLoaderDelegate);
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().startsWith(C0201.m82(8188))) {
                    throw e;
                }
                this.mLoaders.pop();
                this.mRecoveredErrors.add(e);
                f60.G(C0201.m82(8189), C0201.m82(8190), e);
            }
        }
        throw e;
    }
}
