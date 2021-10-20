package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.q;
import java.lang.reflect.Array;
import vigqyno.C0201;

public class RenderableViewManager extends ViewGroupManager<w0> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 0.0f;
    private static final double EPSILON = 0.0d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 0;
    private static final SparseArray<a0> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();
    private static final c sMatrixDecompositionContext = new c();
    private static final double[] sTransformDecompositionArray = new double[16];
    private final String mClassName;
    private final e svgClass;

    static class CircleViewManager extends RenderableViewManager {
        public CircleViewManager() {
            super(e.RNSVGCircle, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "cx")
        public void setCx(b bVar, Dynamic dynamic) {
            bVar.setCx(dynamic);
        }

        @xj0(name = "cy")
        public void setCy(b bVar, Dynamic dynamic) {
            bVar.setCy(dynamic);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        @xj0(name = "r")
        public void setR(b bVar, Dynamic dynamic) {
            bVar.setR(dynamic);
        }
    }

    static class ClipPathViewManager extends GroupViewManager {
        public ClipPathViewManager() {
            super(e.RNSVGClipPath);
        }
    }

    static class DefsViewManager extends RenderableViewManager {
        public DefsViewManager() {
            super(e.RNSVGDefs, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }
    }

    static class EllipseViewManager extends RenderableViewManager {
        public EllipseViewManager() {
            super(e.RNSVGEllipse, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "cx")
        public void setCx(g gVar, Dynamic dynamic) {
            gVar.setCx(dynamic);
        }

        @xj0(name = "cy")
        public void setCy(g gVar, Dynamic dynamic) {
            gVar.setCy(dynamic);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        @xj0(name = "rx")
        public void setRx(g gVar, Dynamic dynamic) {
            gVar.setRx(dynamic);
        }

        @xj0(name = "ry")
        public void setRy(g gVar, Dynamic dynamic) {
            gVar.setRy(dynamic);
        }
    }

    static class GroupViewManager extends RenderableViewManager {
        public GroupViewManager() {
            super(e.RNSVGGroup, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "font")
        public void setFont(k kVar, ReadableMap readableMap) {
            kVar.setFont(readableMap);
        }

        @xj0(name = "fontSize")
        public void setFontSize(k kVar, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = b.a[dynamic.getType().ordinal()];
            String r3 = C0201.m82(16009);
            if (i == 1) {
                javaOnlyMap.putDouble(r3, dynamic.asDouble());
            } else if (i == 2) {
                javaOnlyMap.putString(r3, dynamic.asString());
            } else {
                return;
            }
            kVar.setFont(javaOnlyMap);
        }

        @xj0(name = "fontWeight")
        public void setFontWeight(k kVar, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = b.a[dynamic.getType().ordinal()];
            String r3 = C0201.m82(16010);
            if (i == 1) {
                javaOnlyMap.putDouble(r3, dynamic.asDouble());
            } else if (i == 2) {
                javaOnlyMap.putString(r3, dynamic.asString());
            } else {
                return;
            }
            kVar.setFont(javaOnlyMap);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        public GroupViewManager(e eVar) {
            super(eVar, null);
        }
    }

    static class ImageViewManager extends RenderableViewManager {
        public ImageViewManager() {
            super(e.RNSVGImage, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "align")
        public void setAlign(l lVar, String str) {
            lVar.setAlign(str);
        }

        @xj0(name = "height")
        public void setHeight(l lVar, Dynamic dynamic) {
            lVar.setHeight(dynamic);
        }

        @xj0(name = "meetOrSlice")
        public void setMeetOrSlice(l lVar, int i) {
            lVar.setMeetOrSlice(i);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        @xj0(name = "src")
        public void setSrc(l lVar, ReadableMap readableMap) {
            lVar.setSrc(readableMap);
        }

        @xj0(name = "width")
        public void setWidth(l lVar, Dynamic dynamic) {
            lVar.setWidth(dynamic);
        }

        @xj0(name = "x")
        public void setX(l lVar, Dynamic dynamic) {
            lVar.setX(dynamic);
        }

        @xj0(name = "y")
        public void setY(l lVar, Dynamic dynamic) {
            lVar.setY(dynamic);
        }
    }

    static class LineViewManager extends RenderableViewManager {
        public LineViewManager() {
            super(e.RNSVGLine, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        @xj0(name = "x1")
        public void setX1(m mVar, Dynamic dynamic) {
            mVar.setX1(dynamic);
        }

        @xj0(name = "x2")
        public void setX2(m mVar, Dynamic dynamic) {
            mVar.setX2(dynamic);
        }

        @xj0(name = "y1")
        public void setY1(m mVar, Dynamic dynamic) {
            mVar.setY1(dynamic);
        }

        @xj0(name = "y2")
        public void setY2(m mVar, Dynamic dynamic) {
            mVar.setY2(dynamic);
        }
    }

    static class LinearGradientManager extends RenderableViewManager {
        public LinearGradientManager() {
            super(e.RNSVGLinearGradient, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "gradient")
        public void setGradient(n nVar, ReadableArray readableArray) {
            nVar.setGradient(readableArray);
        }

        @xj0(name = "gradientTransform")
        public void setGradientTransform(n nVar, ReadableArray readableArray) {
            nVar.setGradientTransform(readableArray);
        }

        @xj0(name = "gradientUnits")
        public void setGradientUnits(n nVar, int i) {
            nVar.setGradientUnits(i);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        @xj0(name = "x1")
        public void setX1(n nVar, Dynamic dynamic) {
            nVar.setX1(dynamic);
        }

        @xj0(name = "x2")
        public void setX2(n nVar, Dynamic dynamic) {
            nVar.setX2(dynamic);
        }

        @xj0(name = "y1")
        public void setY1(n nVar, Dynamic dynamic) {
            nVar.setY1(dynamic);
        }

        @xj0(name = "y2")
        public void setY2(n nVar, Dynamic dynamic) {
            nVar.setY2(dynamic);
        }
    }

    static class MarkerManager extends GroupViewManager {
        public MarkerManager() {
            super(e.RNSVGMarker);
        }

        @xj0(name = "align")
        public void setAlign(o oVar, String str) {
            oVar.setAlign(str);
        }

        @xj0(name = "markerHeight")
        public void setMarkerHeight(o oVar, Dynamic dynamic) {
            oVar.setMarkerHeight(dynamic);
        }

        @xj0(name = "markerUnits")
        public void setMarkerUnits(o oVar, String str) {
            oVar.setMarkerUnits(str);
        }

        @xj0(name = "markerWidth")
        public void setMarkerWidth(o oVar, Dynamic dynamic) {
            oVar.setMarkerWidth(dynamic);
        }

        @xj0(name = "meetOrSlice")
        public void setMeetOrSlice(o oVar, int i) {
            oVar.setMeetOrSlice(i);
        }

        @xj0(name = "minX")
        public void setMinX(o oVar, float f) {
            oVar.setMinX(f);
        }

        @xj0(name = "minY")
        public void setMinY(o oVar, float f) {
            oVar.setMinY(f);
        }

        @xj0(name = "orient")
        public void setOrient(o oVar, String str) {
            oVar.setOrient(str);
        }

        @xj0(name = "refX")
        public void setRefX(o oVar, Dynamic dynamic) {
            oVar.setRefX(dynamic);
        }

        @xj0(name = "refY")
        public void setRefY(o oVar, Dynamic dynamic) {
            oVar.setRefY(dynamic);
        }

        @xj0(name = "vbHeight")
        public void setVbHeight(o oVar, float f) {
            oVar.setVbHeight(f);
        }

        @xj0(name = "vbWidth")
        public void setVbWidth(o oVar, float f) {
            oVar.setVbWidth(f);
        }
    }

    static class MaskManager extends GroupViewManager {
        public MaskManager() {
            super(e.RNSVGMask);
        }

        @xj0(name = "height")
        public void setHeight(p pVar, Dynamic dynamic) {
            pVar.setHeight(dynamic);
        }

        @xj0(name = "maskContentUnits")
        public void setMaskContentUnits(p pVar, int i) {
            pVar.setMaskContentUnits(i);
        }

        @xj0(name = "maskTransform")
        public void setMaskTransform(p pVar, ReadableArray readableArray) {
            pVar.setMaskTransform(readableArray);
        }

        @xj0(name = "maskUnits")
        public void setMaskUnits(p pVar, int i) {
            pVar.setMaskUnits(i);
        }

        @xj0(name = "width")
        public void setWidth(p pVar, Dynamic dynamic) {
            pVar.setWidth(dynamic);
        }

        @xj0(name = "x")
        public void setX(p pVar, Dynamic dynamic) {
            pVar.setX(dynamic);
        }

        @xj0(name = "y")
        public void setY(p pVar, Dynamic dynamic) {
            pVar.setY(dynamic);
        }
    }

    static class PathViewManager extends RenderableViewManager {
        public PathViewManager() {
            super(e.RNSVGPath, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "d")
        public void setD(s sVar, String str) {
            sVar.setD(str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }
    }

    static class PatternManager extends GroupViewManager {
        public PatternManager() {
            super(e.RNSVGPattern);
        }

        @xj0(name = "align")
        public void setAlign(t tVar, String str) {
            tVar.setAlign(str);
        }

        @xj0(name = "height")
        public void setHeight(t tVar, Dynamic dynamic) {
            tVar.setHeight(dynamic);
        }

        @xj0(name = "meetOrSlice")
        public void setMeetOrSlice(t tVar, int i) {
            tVar.setMeetOrSlice(i);
        }

        @xj0(name = "minX")
        public void setMinX(t tVar, float f) {
            tVar.setMinX(f);
        }

        @xj0(name = "minY")
        public void setMinY(t tVar, float f) {
            tVar.setMinY(f);
        }

        @xj0(name = "patternContentUnits")
        public void setPatternContentUnits(t tVar, int i) {
            tVar.setPatternContentUnits(i);
        }

        @xj0(name = "patternTransform")
        public void setPatternTransform(t tVar, ReadableArray readableArray) {
            tVar.setPatternTransform(readableArray);
        }

        @xj0(name = "patternUnits")
        public void setPatternUnits(t tVar, int i) {
            tVar.setPatternUnits(i);
        }

        @xj0(name = "vbHeight")
        public void setVbHeight(t tVar, float f) {
            tVar.setVbHeight(f);
        }

        @xj0(name = "vbWidth")
        public void setVbWidth(t tVar, float f) {
            tVar.setVbWidth(f);
        }

        @xj0(name = "width")
        public void setWidth(t tVar, Dynamic dynamic) {
            tVar.setWidth(dynamic);
        }

        @xj0(name = "x")
        public void setX(t tVar, Dynamic dynamic) {
            tVar.setX(dynamic);
        }

        @xj0(name = "y")
        public void setY(t tVar, Dynamic dynamic) {
            tVar.setY(dynamic);
        }
    }

    static class RadialGradientManager extends RenderableViewManager {
        public RadialGradientManager() {
            super(e.RNSVGRadialGradient, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "cx")
        public void setCx(y yVar, Dynamic dynamic) {
            yVar.setCx(dynamic);
        }

        @xj0(name = "cy")
        public void setCy(y yVar, Dynamic dynamic) {
            yVar.setCy(dynamic);
        }

        @xj0(name = "fx")
        public void setFx(y yVar, Dynamic dynamic) {
            yVar.setFx(dynamic);
        }

        @xj0(name = "fy")
        public void setFy(y yVar, Dynamic dynamic) {
            yVar.setFy(dynamic);
        }

        @xj0(name = "gradient")
        public void setGradient(y yVar, ReadableArray readableArray) {
            yVar.setGradient(readableArray);
        }

        @xj0(name = "gradientTransform")
        public void setGradientTransform(y yVar, ReadableArray readableArray) {
            yVar.setGradientTransform(readableArray);
        }

        @xj0(name = "gradientUnits")
        public void setGradientUnits(y yVar, int i) {
            yVar.setGradientUnits(i);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        @xj0(name = "rx")
        public void setRx(y yVar, Dynamic dynamic) {
            yVar.setRx(dynamic);
        }

        @xj0(name = "ry")
        public void setRy(y yVar, Dynamic dynamic) {
            yVar.setRy(dynamic);
        }
    }

    static class RectViewManager extends RenderableViewManager {
        public RectViewManager() {
            super(e.RNSVGRect, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "height")
        public void setHeight(z zVar, Dynamic dynamic) {
            zVar.setHeight(dynamic);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        @xj0(name = "rx")
        public void setRx(z zVar, Dynamic dynamic) {
            zVar.setRx(dynamic);
        }

        @xj0(name = "ry")
        public void setRy(z zVar, Dynamic dynamic) {
            zVar.setRy(dynamic);
        }

        @xj0(name = "width")
        public void setWidth(z zVar, Dynamic dynamic) {
            zVar.setWidth(dynamic);
        }

        @xj0(name = "x")
        public void setX(z zVar, Dynamic dynamic) {
            zVar.setX(dynamic);
        }

        @xj0(name = "y")
        public void setY(z zVar, Dynamic dynamic) {
            zVar.setY(dynamic);
        }
    }

    static class SymbolManager extends GroupViewManager {
        public SymbolManager() {
            super(e.RNSVGSymbol);
        }

        @xj0(name = "align")
        public void setAlign(f0 f0Var, String str) {
            f0Var.setAlign(str);
        }

        @xj0(name = "meetOrSlice")
        public void setMeetOrSlice(f0 f0Var, int i) {
            f0Var.setMeetOrSlice(i);
        }

        @xj0(name = "minX")
        public void setMinX(f0 f0Var, float f) {
            f0Var.setMinX(f);
        }

        @xj0(name = "minY")
        public void setMinY(f0 f0Var, float f) {
            f0Var.setMinY(f);
        }

        @xj0(name = "vbHeight")
        public void setVbHeight(f0 f0Var, float f) {
            f0Var.setVbHeight(f);
        }

        @xj0(name = "vbWidth")
        public void setVbWidth(f0 f0Var, float f) {
            f0Var.setVbWidth(f);
        }
    }

    static class TSpanViewManager extends TextViewManager {
        public TSpanViewManager() {
            super(e.RNSVGTSpan);
        }

        @xj0(name = "content")
        public void setContent(g0 g0Var, String str) {
            g0Var.setContent(str);
        }
    }

    static class TextPathViewManager extends TextViewManager {
        public TextPathViewManager() {
            super(e.RNSVGTextPath);
        }

        @xj0(name = "href")
        public void setHref(h0 h0Var, String str) {
            h0Var.setHref(str);
        }

        @xj0(name = "method")
        public void setMethod(h0 h0Var, String str) {
            h0Var.setMethod(str);
        }

        @xj0(name = "midLine")
        public void setSharp(h0 h0Var, String str) {
            h0Var.setSharp(str);
        }

        @xj0(name = "side")
        public void setSide(h0 h0Var, String str) {
            h0Var.setSide(str);
        }

        @xj0(name = "spacing")
        public void setSpacing(h0 h0Var, String str) {
            h0Var.setSpacing(str);
        }

        @xj0(name = "startOffset")
        public void setStartOffset(h0 h0Var, Dynamic dynamic) {
            h0Var.setStartOffset(dynamic);
        }
    }

    static class TextViewManager extends GroupViewManager {
        public TextViewManager() {
            super(e.RNSVGText);
        }

        @xj0(name = "baselineShift")
        public void setBaselineShift(t0 t0Var, Dynamic dynamic) {
            t0Var.setBaselineShift(dynamic);
        }

        @xj0(name = "dx")
        public void setDeltaX(t0 t0Var, Dynamic dynamic) {
            t0Var.setDeltaX(dynamic);
        }

        @xj0(name = "dy")
        public void setDeltaY(t0 t0Var, Dynamic dynamic) {
            t0Var.setDeltaY(dynamic);
        }

        @xj0(name = "font")
        public void setFont(t0 t0Var, ReadableMap readableMap) {
            t0Var.setFont(readableMap);
        }

        @xj0(name = "inlineSize")
        public void setInlineSize(t0 t0Var, Dynamic dynamic) {
            t0Var.setInlineSize(dynamic);
        }

        @xj0(name = "lengthAdjust")
        public void setLengthAdjust(t0 t0Var, String str) {
            t0Var.setLengthAdjust(str);
        }

        @xj0(name = "alignmentBaseline")
        public void setMethod(t0 t0Var, String str) {
            t0Var.setMethod(str);
        }

        @xj0(name = "rotate")
        public void setRotate(t0 t0Var, Dynamic dynamic) {
            t0Var.setRotate(dynamic);
        }

        @xj0(name = "textLength")
        public void setTextLength(t0 t0Var, Dynamic dynamic) {
            t0Var.setTextLength(dynamic);
        }

        @xj0(name = "verticalAlign")
        public void setVerticalAlign(t0 t0Var, String str) {
            t0Var.setVerticalAlign(str);
        }

        @xj0(name = "x")
        public void setX(t0 t0Var, Dynamic dynamic) {
            t0Var.setPositionX(dynamic);
        }

        @xj0(name = "y")
        public void setY(t0 t0Var, Dynamic dynamic) {
            t0Var.setPositionY(dynamic);
        }

        public TextViewManager(e eVar) {
            super(eVar);
        }
    }

    static class UseViewManager extends RenderableViewManager {
        public UseViewManager() {
            super(e.RNSVGUse, null);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(k0 k0Var, View view) {
            RenderableViewManager.super.addEventEmitters(k0Var, (w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ a0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(k0 k0Var) {
            return RenderableViewManager.super.createViewInstance(k0Var);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((w0) view);
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.horcrux.svg.RenderableViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((w0) view);
        }

        @xj0(name = "height")
        public void setHeight(u0 u0Var, Dynamic dynamic) {
            u0Var.setHeight(dynamic);
        }

        @xj0(name = "href")
        public void setHref(u0 u0Var, String str) {
            u0Var.setHref(str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b, com.horcrux.svg.RenderableViewManager
        @xj0(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((w0) view, f);
        }

        @xj0(name = "width")
        public void setWidth(u0 u0Var, Dynamic dynamic) {
            u0Var.setWidth(dynamic);
        }

        @xj0(name = "x")
        public void setX(u0 u0Var, Dynamic dynamic) {
            u0Var.setX(dynamic);
        }

        @xj0(name = "y")
        public void setY(u0 u0Var, Dynamic dynamic) {
            u0Var.setY(dynamic);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements ViewGroup.OnHierarchyChangeListener {
        public a() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view instanceof w0) {
                RenderableViewManager.this.invalidateSvgView((w0) view);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof w0) {
                RenderableViewManager.this.invalidateSvgView((w0) view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            int[] iArr = new int[e.values().length];
            b = iArr;
            try {
                iArr[e.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            b[e.RNSVGPath.ordinal()] = 2;
            b[e.RNSVGCircle.ordinal()] = 3;
            b[e.RNSVGEllipse.ordinal()] = 4;
            b[e.RNSVGLine.ordinal()] = 5;
            b[e.RNSVGRect.ordinal()] = 6;
            b[e.RNSVGText.ordinal()] = 7;
            b[e.RNSVGTSpan.ordinal()] = 8;
            b[e.RNSVGTextPath.ordinal()] = 9;
            b[e.RNSVGImage.ordinal()] = 10;
            b[e.RNSVGClipPath.ordinal()] = 11;
            b[e.RNSVGDefs.ordinal()] = 12;
            b[e.RNSVGUse.ordinal()] = 13;
            b[e.RNSVGSymbol.ordinal()] = 14;
            b[e.RNSVGLinearGradient.ordinal()] = 15;
            b[e.RNSVGRadialGradient.ordinal()] = 16;
            b[e.RNSVGPattern.ordinal()] = 17;
            b[e.RNSVGMask.ordinal()] = 18;
            try {
                b[e.RNSVGMarker.ordinal()] = 19;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ReadableType.values().length];
            a = iArr2;
            iArr2[ReadableType.Number.ordinal()] = 1;
            try {
                a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends j.a {
        public final double[] f = new double[4];
        public final double[] g = new double[3];
        public final double[] h = new double[3];
        public final double[] i = new double[3];
        public final double[] j = new double[3];
    }

    /* access modifiers changed from: package-private */
    public class d extends i {
        public d(RenderableViewManager renderableViewManager) {
        }

        @yj0(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i, Dynamic dynamic) {
        }
    }

    /* access modifiers changed from: private */
    public enum e {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGMarker
    }

    static {
        C0201.m83(RenderableViewManager.class, 242);
    }

    public /* synthetic */ RenderableViewManager(e eVar, a aVar) {
        this(eVar);
    }

    private static void decomposeMatrix() {
        c cVar = sMatrixDecompositionContext;
        double[] dArr = cVar.f;
        double[] dArr2 = cVar.g;
        double[] dArr3 = cVar.h;
        double[] dArr4 = cVar.i;
        double[] dArr5 = cVar.j;
        if (!isZero(sTransformDecompositionArray[15])) {
            double[][] dArr6 = (double[][]) Array.newInstance(double.class, 4, 4);
            double[] dArr7 = new double[16];
            for (int i = 0; i < 4; i++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    double[] dArr8 = sTransformDecompositionArray;
                    int i3 = (i * 4) + i2;
                    double d2 = dArr8[i3] / dArr8[15];
                    dArr6[i][i2] = d2;
                    if (i2 == 3) {
                        d2 = 0.0d;
                    }
                    dArr7[i3] = d2;
                }
            }
            dArr7[15] = 1.0d;
            if (!isZero(j.m(dArr7))) {
                if (!isZero(dArr6[0][3]) || !isZero(dArr6[1][3]) || !isZero(dArr6[2][3])) {
                    j.q(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, j.t(j.n(dArr7)), dArr);
                } else {
                    dArr[2] = 0.0d;
                    dArr[1] = 0.0d;
                    dArr[0] = 0.0d;
                    dArr[3] = 1.0d;
                }
                System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
                double[][] dArr9 = (double[][]) Array.newInstance(double.class, 3, 3);
                for (int i4 = 0; i4 < 3; i4++) {
                    dArr9[i4][0] = dArr6[i4][0];
                    dArr9[i4][1] = dArr6[i4][1];
                    dArr9[i4][2] = dArr6[i4][2];
                }
                dArr2[0] = j.x(dArr9[0]);
                dArr9[0] = j.y(dArr9[0], dArr2[0]);
                dArr3[0] = j.w(dArr9[0], dArr9[1]);
                dArr9[1] = j.u(dArr9[1], dArr9[0], 1.0d, -dArr3[0]);
                dArr3[0] = j.w(dArr9[0], dArr9[1]);
                dArr9[1] = j.u(dArr9[1], dArr9[0], 1.0d, -dArr3[0]);
                dArr2[1] = j.x(dArr9[1]);
                dArr9[1] = j.y(dArr9[1], dArr2[1]);
                dArr3[0] = dArr3[0] / dArr2[1];
                dArr3[1] = j.w(dArr9[0], dArr9[2]);
                dArr9[2] = j.u(dArr9[2], dArr9[0], 1.0d, -dArr3[1]);
                dArr3[2] = j.w(dArr9[1], dArr9[2]);
                dArr9[2] = j.u(dArr9[2], dArr9[1], 1.0d, -dArr3[2]);
                dArr2[2] = j.x(dArr9[2]);
                dArr9[2] = j.y(dArr9[2], dArr2[2]);
                dArr3[1] = dArr3[1] / dArr2[2];
                dArr3[2] = dArr3[2] / dArr2[2];
                if (j.w(dArr9[0], j.v(dArr9[1], dArr9[2])) < 0.0d) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        dArr2[i5] = dArr2[i5] * -1.0d;
                        double[] dArr10 = dArr9[i5];
                        dArr10[0] = dArr10[0] * -1.0d;
                        double[] dArr11 = dArr9[i5];
                        dArr11[1] = dArr11[1] * -1.0d;
                        double[] dArr12 = dArr9[i5];
                        dArr12[2] = dArr12[2] * -1.0d;
                    }
                }
                dArr5[0] = j.s((-Math.atan2(dArr9[2][1], dArr9[2][2])) * 57.29577951308232d);
                dArr5[1] = j.s((-Math.atan2(-dArr9[2][0], Math.sqrt((dArr9[2][1] * dArr9[2][1]) + (dArr9[2][2] * dArr9[2][2])))) * 57.29577951308232d);
                dArr5[2] = j.s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
            }
        }
    }

    public static a0 getRenderableViewByTag(int i) {
        return mTagToRenderableView.get(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void invalidateSvgView(w0 w0Var) {
        e0 svgView = w0Var.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (w0Var instanceof t0) {
            ((t0) w0Var).U().f();
        }
    }

    private static boolean isZero(double d2) {
        return !Double.isNaN(d2) && Math.abs(d2) < 1.0E-5d;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(q.c(0.0f));
        view.setTranslationY(q.c(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    public static void setRenderableView(int i, a0 a0Var) {
        mTagToRenderableView.put(i, a0Var);
        Runnable runnable = mTagToRunnable.get(i);
        if (runnable != null) {
            runnable.run();
            mTagToRunnable.delete(i);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        m0.b(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        view.setTranslationX(q.c((float) sMatrixDecompositionContext.i[0]));
        view.setTranslationY(q.c((float) sMatrixDecompositionContext.i[1]));
        view.setRotation((float) sMatrixDecompositionContext.j[2]);
        view.setRotationX((float) sMatrixDecompositionContext.j[0]);
        view.setRotationY((float) sMatrixDecompositionContext.j[1]);
        view.setScaleX((float) sMatrixDecompositionContext.g[0]);
        view.setScaleY((float) sMatrixDecompositionContext.g[1]);
        double[] dArr = sMatrixDecompositionContext.f;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = -1.0f / f;
            float f3 = com.facebook.react.uimanager.c.e().density;
            view.setCameraDistance(f3 * f3 * f2 * 5.0f);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<d> getShadowNodeClass() {
        return d.class;
    }

    @xj0(name = "clipPath")
    public void setClipPath(w0 w0Var, String str) {
        w0Var.setClipPath(str);
    }

    @xj0(name = "clipRule")
    public void setClipRule(w0 w0Var, int i) {
        w0Var.setClipRule(i);
    }

    @xj0(name = "fill")
    public void setFill(a0 a0Var, Dynamic dynamic) {
        a0Var.setFill(dynamic);
    }

    @xj0(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(a0 a0Var, float f) {
        a0Var.setFillOpacity(f);
    }

    @xj0(defaultInt = 1, name = "fillRule")
    public void setFillRule(a0 a0Var, int i) {
        a0Var.setFillRule(i);
    }

    @xj0(name = "markerEnd")
    public void setMarkerEnd(w0 w0Var, String str) {
        w0Var.setMarkerEnd(str);
    }

    @xj0(name = "markerMid")
    public void setMarkerMid(w0 w0Var, String str) {
        w0Var.setMarkerMid(str);
    }

    @xj0(name = "markerStart")
    public void setMarkerStart(w0 w0Var, String str) {
        w0Var.setMarkerStart(str);
    }

    @xj0(name = "mask")
    public void setMask(w0 w0Var, String str) {
        w0Var.setMask(str);
    }

    @xj0(name = "matrix")
    public void setMatrix(w0 w0Var, Dynamic dynamic) {
        w0Var.setMatrix(dynamic);
    }

    @xj0(name = "name")
    public void setName(w0 w0Var, String str) {
        w0Var.setName(str);
    }

    @xj0(name = "onLayout")
    public void setOnLayout(w0 w0Var, boolean z) {
        w0Var.setOnLayout(z);
    }

    @xj0(name = "propList")
    public void setPropList(a0 a0Var, ReadableArray readableArray) {
        a0Var.setPropList(readableArray);
    }

    @xj0(name = "responsible")
    public void setResponsible(w0 w0Var, boolean z) {
        w0Var.setResponsible(z);
    }

    @xj0(name = "stroke")
    public void setStroke(a0 a0Var, Dynamic dynamic) {
        a0Var.setStroke(dynamic);
    }

    @xj0(name = "strokeDasharray")
    public void setStrokeDasharray(a0 a0Var, ReadableArray readableArray) {
        a0Var.setStrokeDasharray(readableArray);
    }

    @xj0(name = "strokeDashoffset")
    public void setStrokeDashoffset(a0 a0Var, float f) {
        a0Var.setStrokeDashoffset(f);
    }

    @xj0(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(a0 a0Var, int i) {
        a0Var.setStrokeLinecap(i);
    }

    @xj0(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(a0 a0Var, int i) {
        a0Var.setStrokeLinejoin(i);
    }

    @xj0(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(a0 a0Var, float f) {
        a0Var.setStrokeMiterlimit(f);
    }

    @xj0(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(a0 a0Var, float f) {
        a0Var.setStrokeOpacity(f);
    }

    @xj0(name = "strokeWidth")
    public void setStrokeWidth(a0 a0Var, Dynamic dynamic) {
        a0Var.setStrokeWidth(dynamic);
    }

    @xj0(name = "transform")
    public void setTransform(w0 w0Var, Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Array) {
            ReadableArray asArray = dynamic.asArray();
            if (asArray == null) {
                resetTransformProperty(w0Var);
            } else {
                setTransformProperty(w0Var, asArray);
            }
            Matrix matrix = w0Var.getMatrix();
            w0Var.e = matrix;
            w0Var.j = matrix.invert(w0Var.h);
        }
    }

    @xj0(name = "vectorEffect")
    public void setVectorEffect(a0 a0Var, int i) {
        a0Var.setVectorEffect(i);
    }

    private RenderableViewManager(e eVar) {
        this.svgClass = eVar;
        this.mClassName = eVar.toString();
    }

    public void addEventEmitters(k0 k0Var, w0 w0Var) {
        super.addEventEmitters(k0Var, (View) w0Var);
        w0Var.setOnHierarchyChangeListener(new a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new d(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public w0 createViewInstance(k0 k0Var) {
        switch (b.b[this.svgClass.ordinal()]) {
            case 1:
                return new k(k0Var);
            case 2:
                return new s(k0Var);
            case 3:
                return new b(k0Var);
            case 4:
                return new g(k0Var);
            case 5:
                return new m(k0Var);
            case 6:
                return new z(k0Var);
            case 7:
                return new t0(k0Var);
            case 8:
                return new g0(k0Var);
            case 9:
                return new h0(k0Var);
            case 10:
                return new l(k0Var);
            case 11:
                return new c(k0Var);
            case 12:
                return new e(k0Var);
            case 13:
                return new u0(k0Var);
            case 14:
                return new f0(k0Var);
            case 15:
                return new n(k0Var);
            case 16:
                return new y(k0Var);
            case 17:
                return new t(k0Var);
            case 18:
                return new p(k0Var);
            case 19:
                return new o(k0Var);
            default:
                throw new IllegalStateException(C0201.m82(7414) + this.svgClass.toString());
        }
    }

    public void onAfterUpdateTransaction(w0 w0Var) {
        super.onAfterUpdateTransaction((View) w0Var);
        invalidateSvgView(w0Var);
    }

    public void onDropViewInstance(w0 w0Var) {
        super.onDropViewInstance((View) w0Var);
        mTagToRenderableView.remove(w0Var.getId());
    }

    @xj0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(w0 w0Var, float f) {
        w0Var.setOpacity(f);
    }
}
