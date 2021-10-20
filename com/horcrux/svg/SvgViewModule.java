package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import vigqyno.C0201;

public class SvgViewModule extends ReactContextBaseJavaModule {

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ Callback c;
        public final /* synthetic */ int d;

        /* renamed from: com.horcrux.svg.SvgViewModule$a$a  reason: collision with other inner class name */
        class RunnableC0076a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a  reason: collision with other inner class name */
            class RunnableC0077a implements Runnable {
                public RunnableC0077a() {
                }

                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.a, aVar.b, aVar.c, aVar.d + 1);
                }
            }

            public RunnableC0076a() {
            }

            public void run() {
                e0 svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.a);
                if (svgViewByTag != null) {
                    svgViewByTag.setToDataUrlTask(new RunnableC0077a());
                }
            }
        }

        class b implements Runnable {
            public b() {
            }

            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.a, aVar.b, aVar.c, aVar.d + 1);
            }
        }

        public a(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.a = i;
            this.b = readableMap;
            this.c = callback;
            this.d = i2;
        }

        public void run() {
            e0 svgViewByTag = SvgViewManager.getSvgViewByTag(this.a);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.a, new RunnableC0076a());
            } else if (svgViewByTag.v()) {
                svgViewByTag.setToDataUrlTask(new b());
            } else {
                ReadableMap readableMap = this.b;
                if (readableMap != null) {
                    this.c.invoke(svgViewByTag.x(readableMap.getInt(C0201.m82(31734)), this.b.getInt(C0201.m82(31735))));
                    return;
                }
                this.c.invoke(svgViewByTag.w());
            }
        }
    }

    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public static void toDataURL(int i, ReadableMap readableMap, Callback callback, int i2) {
        UiThreadUtil.runOnUiThread(new a(i, readableMap, callback, i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(2297);
    }

    @ReactMethod
    public void toDataURL(int i, ReadableMap readableMap, Callback callback) {
        toDataURL(i, readableMap, callback, 0);
    }
}
