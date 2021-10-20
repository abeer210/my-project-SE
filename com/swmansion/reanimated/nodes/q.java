package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.o0;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: PropsNode */
public class q extends m implements j {
    private final Map<String, Integer> a;
    private final o0 b;
    private int c = -1;
    private final JavaOnlyMap d;
    private final c0 e;

    /* access modifiers changed from: package-private */
    /* compiled from: PropsNode */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            iArr[ReadableType.Number.ordinal()] = 1;
            a[ReadableType.String.ordinal()] = 2;
            try {
                a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public q(int i, ReadableMap readableMap, b bVar, o0 o0Var) {
        super(i, readableMap, bVar);
        this.a = e.b(readableMap.getMap(C0201.m82(20467)));
        this.b = o0Var;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        this.d = javaOnlyMap;
        this.e = new c0(javaOnlyMap);
    }

    private static void c(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
        } else if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof WritableArray) {
            writableMap.putArray(str, (WritableArray) obj);
        } else if (obj instanceof WritableMap) {
            writableMap.putMap(str, (WritableMap) obj);
        } else {
            throw new IllegalStateException(C0201.m82(20468));
        }
    }

    @Override // com.swmansion.reanimated.nodes.j
    public void a() {
        if (this.c != -1) {
            value();
        }
    }

    public void d(int i) {
        this.c = i;
        dangerouslyRescheduleEvaluate();
    }

    public void e(int i) {
        this.c = -1;
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Double evaluate() {
        boolean z;
        boolean z2;
        boolean z3;
        WritableMap writableMap;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (Map.Entry<String, Integer> entry : this.a.entrySet()) {
            m o = this.mNodesManager.o(entry.getValue().intValue(), m.class);
            if (o instanceof s) {
                WritableMap writableMap2 = (WritableMap) o.value();
                ReadableMapKeySetIterator keySetIterator = writableMap2.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    if (this.mNodesManager.q.contains(nextKey)) {
                        writableMap = this.d;
                        z = z6;
                        z2 = z5;
                        z3 = true;
                    } else if (this.mNodesManager.r.contains(nextKey)) {
                        z3 = z4;
                        z = z6;
                        z2 = true;
                        writableMap = createMap2;
                    } else {
                        z2 = z5;
                        z = true;
                        z3 = z4;
                        writableMap = createMap;
                    }
                    ReadableType type = writableMap2.getType(nextKey);
                    int i = a.a[type.ordinal()];
                    if (i == 1) {
                        writableMap.putDouble(nextKey, writableMap2.getDouble(nextKey));
                    } else if (i == 2) {
                        writableMap.putString(nextKey, writableMap2.getString(nextKey));
                    } else if (i == 3) {
                        writableMap.putArray(nextKey, (WritableArray) writableMap2.getArray(nextKey));
                    } else {
                        throw new IllegalArgumentException(C0201.m82(20469) + type);
                    }
                    z4 = z3;
                    z5 = z2;
                    z6 = z;
                }
                continue;
            } else {
                String key = entry.getKey();
                Object value = o.value();
                if (this.mNodesManager.q.contains(key)) {
                    c(this.d, key, value);
                    z4 = true;
                } else {
                    c(createMap2, key, value);
                    z5 = true;
                }
            }
        }
        int i2 = this.c;
        if (i2 != -1) {
            if (z4) {
                this.b.Z(i2, this.e);
            }
            if (z5) {
                this.mNodesManager.n(this.c, createMap2);
            }
            if (z6) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putInt(C0201.m82(20470), this.c);
                createMap3.putMap(C0201.m82(20471), createMap);
                this.mNodesManager.x(C0201.m82(20472), createMap3);
            }
        }
        return m.ZERO;
    }
}
