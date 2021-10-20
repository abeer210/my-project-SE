package com.facebook.react.bridge;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@zh0
public class ReactMarker {
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();

    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j);
    }

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i);
    }

    @zh0
    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        if (!sFabricMarkerListeners.contains(fabricMarkerListener)) {
            sFabricMarkerListeners.add(fabricMarkerListener);
        }
    }

    @zh0
    public static void addListener(MarkerListener markerListener) {
        if (!sListeners.contains(markerListener)) {
            sListeners.add(markerListener);
        }
    }

    @zh0
    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    @zh0
    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    @zh0
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j) {
        for (FabricMarkerListener fabricMarkerListener : sFabricMarkerListeners) {
            fabricMarkerListener.logFabricMarker(reactMarkerConstants, str, i, j);
        }
    }

    @zh0
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @zh0
    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    @zh0
    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }

    @zh0
    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    @zh0
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        logFabricMarker(reactMarkerConstants, str, i, -1);
    }

    @zh0
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @zh0
    public static void logMarker(String str, String str2, int i) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i);
    }

    @zh0
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @zh0
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        logMarker(reactMarkerConstants, (String) null, i);
    }

    @zh0
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @zh0
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        logFabricMarker(reactMarkerConstants, str, i);
        for (MarkerListener markerListener : sListeners) {
            markerListener.logMarker(reactMarkerConstants, str, i);
        }
    }
}
