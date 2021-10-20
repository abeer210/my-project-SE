package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

public class RNSVGRenderableManager extends ReactContextBaseJavaModule {
    public RNSVGRenderableManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBBox(int i, ReadableMap readableMap) {
        RectF rectF;
        a0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return null;
        }
        boolean z = readableMap.getBoolean(C0201.m82(19535));
        boolean z2 = readableMap.getBoolean(C0201.m82(19536));
        boolean z3 = readableMap.getBoolean(C0201.m82(19537));
        boolean z4 = readableMap.getBoolean(C0201.m82(19538));
        renderableViewByTag.m(null, null);
        float f = renderableViewByTag.u;
        renderableViewByTag.y();
        RectF rectF2 = new RectF();
        if (z) {
            rectF2.union(renderableViewByTag.M);
        }
        if (z2) {
            rectF2.union(renderableViewByTag.N);
        }
        if (z3) {
            rectF2.union(renderableViewByTag.O);
        }
        if (z4 && (rectF = renderableViewByTag.P) != null) {
            rectF2.intersect(rectF);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(19539), (double) (rectF2.left / f));
        createMap.putDouble(C0201.m82(19540), (double) (rectF2.top / f));
        createMap.putDouble(C0201.m82(19541), (double) (rectF2.width() / f));
        createMap.putDouble(C0201.m82(19542), (double) (rectF2.height() / f));
        return createMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCTM(int i) {
        a0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return null;
        }
        float f = renderableViewByTag.u;
        Matrix matrix = new Matrix(renderableViewByTag.c);
        matrix.preConcat(renderableViewByTag.getSvgView().v);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(19543), (double) fArr[0]);
        createMap.putDouble(C0201.m82(19544), (double) fArr[3]);
        createMap.putDouble(C0201.m82(19545), (double) fArr[1]);
        createMap.putDouble(C0201.m82(19546), (double) fArr[4]);
        createMap.putDouble(C0201.m82(19547), (double) (fArr[2] / f));
        createMap.putDouble(C0201.m82(19548), (double) (fArr[5] / f));
        return createMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(19549);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPointAtLength(int i, ReadableMap readableMap) {
        a0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return null;
        }
        PathMeasure pathMeasure = new PathMeasure(renderableViewByTag.m(null, null), false);
        float f = (float) readableMap.getDouble(C0201.m82(19550));
        float f2 = renderableViewByTag.u;
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        pathMeasure.getPosTan(Math.max(0.0f, Math.min(f, pathMeasure.getLength())), fArr, fArr2);
        double atan2 = Math.atan2((double) fArr2[1], (double) fArr2[0]);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(19551), (double) (fArr[0] / f2));
        createMap.putDouble(C0201.m82(19552), (double) (fArr[1] / f2));
        createMap.putDouble(C0201.m82(19553), atan2);
        return createMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getScreenCTM(int i) {
        a0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return null;
        }
        float[] fArr = new float[9];
        renderableViewByTag.c.getValues(fArr);
        float f = renderableViewByTag.u;
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(19554), (double) fArr[0]);
        createMap.putDouble(C0201.m82(19555), (double) fArr[3]);
        createMap.putDouble(C0201.m82(19556), (double) fArr[1]);
        createMap.putDouble(C0201.m82(19557), (double) fArr[4]);
        createMap.putDouble(C0201.m82(19558), (double) (fArr[2] / f));
        createMap.putDouble(C0201.m82(19559), (double) (fArr[5] / f));
        return createMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getTotalLength(int i) {
        a0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return 0.0f;
        }
        return new PathMeasure(renderableViewByTag.m(null, null), false).getLength() / renderableViewByTag.u;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInFill(int i, ReadableMap readableMap) {
        a0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return false;
        }
        float f = renderableViewByTag.u;
        if (renderableViewByTag.n(new float[]{((float) readableMap.getDouble(C0201.m82(19560))) * f, ((float) readableMap.getDouble(C0201.m82(19561))) * f}) != -1) {
            return true;
        }
        return false;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInStroke(int i, ReadableMap readableMap) {
        a0 renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return false;
        }
        renderableViewByTag.m(null, null);
        renderableViewByTag.y();
        float f = renderableViewByTag.u;
        double d = readableMap.getDouble(C0201.m82(19562));
        double d2 = (double) f;
        Double.isNaN(d2);
        int i2 = (int) (d * d2);
        double d3 = readableMap.getDouble(C0201.m82(19563));
        Double.isNaN(d2);
        int i3 = (int) (d3 * d2);
        Region region = renderableViewByTag.S;
        if (region == null || !region.contains(i2, i3)) {
            return false;
        }
        return true;
    }
}
