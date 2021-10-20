package org.reactnative.facedetector;

import android.graphics.PointF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* compiled from: FaceDetectorUtils */
public class a {
    private static final String[] a = {C0201.m82(1522), C0201.m82(1523), C0201.m82(1524), C0201.m82(1525), C0201.m82(1526), C0201.m82(1527), C0201.m82(1528), C0201.m82(1529), C0201.m82(1530), C0201.m82(1531), C0201.m82(1532), C0201.m82(1533)};

    public static WritableMap a(WritableMap writableMap) {
        String r0 = C0201.m82(1534);
        writableMap.putDouble(r0, ((-writableMap.getDouble(r0)) + 360.0d) % 360.0d);
        String r02 = C0201.m82(1535);
        writableMap.putDouble(r02, ((-writableMap.getDouble(r02)) + 360.0d) % 360.0d);
        return writableMap;
    }

    public static WritableMap b(PointF pointF, double d, double d2, int i, int i2, int i3, int i4) {
        WritableMap createMap = Arguments.createMap();
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        float f = pointF.x;
        float f2 = (float) (i / 2);
        if (f < f2) {
            valueOf.floatValue();
            int i5 = i3 / 2;
        } else if (f > f2) {
            valueOf.floatValue();
            int i6 = i3 / 2;
        }
        float f3 = pointF.y;
        float f4 = (float) (i2 / 2);
        if (f3 < f4) {
            valueOf2.floatValue();
            int i7 = i4 / 2;
        } else if (f3 > f4) {
            valueOf2.floatValue();
            int i8 = i4 / 2;
        }
        double d3 = (double) pointF.x;
        Double.isNaN(d3);
        createMap.putDouble(C0201.m82(1536), d3 * d);
        double d4 = (double) pointF.y;
        Double.isNaN(d4);
        createMap.putDouble(C0201.m82(1537), d4 * d2);
        return createMap;
    }

    public static WritableMap c(ReadableMap readableMap, int i, double d) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        String r1 = C0201.m82(1538);
        createMap.putDouble(r1, h(readableMap.getDouble(r1), i, d));
        return createMap;
    }

    public static WritableMap d(ReadableMap readableMap, double d) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        String r1 = C0201.m82(1539);
        createMap.putDouble(r1, readableMap.getDouble(r1) + d);
        return createMap;
    }

    public static WritableMap e(WritableMap writableMap, int i, double d) {
        String r0 = C0201.m82(1540);
        ReadableMap map = writableMap.getMap(r0);
        String r2 = C0201.m82(1541);
        WritableMap d2 = d(c(map.getMap(r2), i, d), -map.getMap(C0201.m82(1542)).getDouble(C0201.m82(1543)));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap(r2, d2);
        String[] strArr = a;
        for (String str : strArr) {
            ReadableMap map2 = writableMap.hasKey(str) ? writableMap.getMap(str) : null;
            if (map2 != null) {
                writableMap.putMap(str, c(map2, i, d));
            }
        }
        writableMap.putMap(r0, createMap);
        return writableMap;
    }

    public static WritableMap f(nu1 nu1) {
        return g(nu1, 1.0d, 1.0d, 0, 0, 0, 0);
    }

    public static WritableMap g(nu1 nu1, double d, double d2, int i, int i2, int i3, int i4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(1544), nu1.d());
        createMap.putDouble(C0201.m82(1545), (double) nu1.b());
        createMap.putDouble(C0201.m82(1546), (double) nu1.a());
        if (nu1.g() >= 0.0f) {
            createMap.putDouble(C0201.m82(1547), (double) nu1.g());
        }
        if (nu1.e() >= 0.0f) {
            createMap.putDouble(C0201.m82(1548), (double) nu1.e());
        }
        if (nu1.f() >= 0.0f) {
            createMap.putDouble(C0201.m82(1549), (double) nu1.f());
        }
        for (pu1 pu1 : nu1.h()) {
            createMap.putMap(a[pu1.b()], b(pu1.a(), d, d2, i, i2, i3, i4));
        }
        WritableMap createMap2 = Arguments.createMap();
        Float valueOf = Float.valueOf(nu1.i().x);
        Float valueOf2 = Float.valueOf(nu1.i().y);
        float f = (float) (i / 2);
        if (nu1.i().x < f) {
            valueOf = Float.valueOf(valueOf.floatValue() + ((float) (i3 / 2)));
        } else if (nu1.i().x > f) {
            valueOf = Float.valueOf(valueOf.floatValue() - ((float) (i3 / 2)));
        }
        float f2 = (float) (i2 / 2);
        if (nu1.i().y < f2) {
            valueOf2 = Float.valueOf(valueOf2.floatValue() + ((float) (i4 / 2)));
        } else if (nu1.i().y > f2) {
            valueOf2 = Float.valueOf(valueOf2.floatValue() - ((float) (i4 / 2)));
        }
        double floatValue = (double) valueOf.floatValue();
        Double.isNaN(floatValue);
        createMap2.putDouble(C0201.m82(1550), floatValue * d);
        double floatValue2 = (double) valueOf2.floatValue();
        Double.isNaN(floatValue2);
        createMap2.putDouble(C0201.m82(1551), floatValue2 * d2);
        WritableMap createMap3 = Arguments.createMap();
        double j = (double) nu1.j();
        Double.isNaN(j);
        createMap3.putDouble(C0201.m82(1552), j * d);
        double c = (double) nu1.c();
        Double.isNaN(c);
        createMap3.putDouble(C0201.m82(1553), c * d2);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putMap(C0201.m82(1554), createMap2);
        createMap4.putMap(C0201.m82(1555), createMap3);
        createMap.putMap(C0201.m82(1556), createMap4);
        return createMap;
    }

    public static double h(double d, int i, double d2) {
        double d3 = (double) i;
        Double.isNaN(d3);
        return (d3 - (d / d2)) * d2;
    }
}
