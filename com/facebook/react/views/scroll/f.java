package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.q;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ReactScrollViewCommandHelper */
public class f {

    /* compiled from: ReactScrollViewCommandHelper */
    public interface a<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, b bVar);

        void scrollToEnd(T t, c cVar);
    }

    /* compiled from: ReactScrollViewCommandHelper */
    public static class b {
        public final int a;
        public final int b;
        public final boolean c;

        public b(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* compiled from: ReactScrollViewCommandHelper */
    public static class c {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }
    }

    public static Map<String, Integer> a() {
        return e.f(C0201.m82(22250), 1, C0201.m82(22251), 2, C0201.m82(22252), 3);
    }

    public static <T> void b(a<T> aVar, T t, int i, ReadableArray readableArray) {
        yh0.c(aVar);
        yh0.c(t);
        yh0.c(readableArray);
        if (i == 1) {
            d(aVar, t, readableArray);
        } else if (i == 2) {
            e(aVar, t, readableArray);
        } else if (i == 3) {
            aVar.flashScrollIndicators(t);
        } else {
            throw new IllegalArgumentException(String.format(C0201.m82(22253), Integer.valueOf(i), aVar.getClass().getSimpleName()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    public static <T> void c(a<T> aVar, T t, String str, ReadableArray readableArray) {
        char c2;
        yh0.c(aVar);
        yh0.c(t);
        yh0.c(readableArray);
        int hashCode = str.hashCode();
        if (hashCode != -402165208) {
            if (hashCode != 28425985) {
                if (hashCode == 2055114131 && str.equals(C0201.m82(22254))) {
                    c2 = 1;
                    if (c2 != 0) {
                        d(aVar, t, readableArray);
                        return;
                    } else if (c2 == 1) {
                        e(aVar, t, readableArray);
                        return;
                    } else if (c2 == 2) {
                        aVar.flashScrollIndicators(t);
                        return;
                    } else {
                        throw new IllegalArgumentException(String.format(C0201.m82(22257), str, aVar.getClass().getSimpleName()));
                    }
                }
            } else if (str.equals(C0201.m82(22255))) {
                c2 = 2;
                if (c2 != 0) {
                }
            }
        } else if (str.equals(C0201.m82(22256))) {
            c2 = 0;
            if (c2 != 0) {
            }
        }
        c2 = 65535;
        if (c2 != 0) {
        }
    }

    private static <T> void d(a<T> aVar, T t, ReadableArray readableArray) {
        aVar.scrollTo(t, new b(Math.round(q.b(readableArray.getDouble(0))), Math.round(q.b(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    private static <T> void e(a<T> aVar, T t, ReadableArray readableArray) {
        aVar.scrollToEnd(t, new c(readableArray.getBoolean(0)));
    }
}
