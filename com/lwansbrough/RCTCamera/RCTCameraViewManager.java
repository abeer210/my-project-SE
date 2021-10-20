package com.lwansbrough.RCTCamera;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import java.util.ArrayList;
import java.util.Map;
import vigqyno.C0201;

public class RCTCameraViewManager extends ViewGroupManager<d> {
    public static final int COMMAND_START_PREVIEW = 0;
    public static final int COMMAND_STOP_PREVIEW = 0;
    private static final String REACT_CLASS = null;

    static {
        C0201.m83(RCTCameraViewManager.class, 399);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e.e(C0201.m82(31676), 1, C0201.m82(31677), 2);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(31678);
    }

    @xj0(name = "aspect")
    public void setAspect(d dVar, int i) {
        dVar.setAspect(i);
    }

    @xj0(name = "barCodeTypes")
    public void setBarCodeTypes(d dVar, ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList arrayList = new ArrayList(readableArray.size());
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(readableArray.getString(i));
            }
            dVar.setBarCodeTypes(arrayList);
        }
    }

    @xj0(name = "barcodeScannerEnabled")
    public void setBarcodeScannerEnabled(d dVar, boolean z) {
        dVar.setBarcodeScannerEnabled(z);
    }

    @xj0(name = "captureAudio")
    public void setCaptureAudio(d dVar, boolean z) {
    }

    @xj0(name = "captureMode")
    public void setCaptureMode(d dVar, int i) {
        dVar.setCaptureMode(i);
    }

    @xj0(name = "captureQuality")
    public void setCaptureQuality(d dVar, String str) {
        dVar.setCaptureQuality(str);
    }

    @xj0(name = "captureTarget")
    public void setCaptureTarget(d dVar, int i) {
    }

    @xj0(name = "clearWindowBackground")
    public void setClearWindowBackground(d dVar, boolean z) {
        dVar.setClearWindowBackground(z);
    }

    @xj0(name = "flashMode")
    public void setFlashMode(d dVar, int i) {
        dVar.setFlashMode(i);
    }

    @xj0(name = "orientation")
    public void setOrientation(d dVar, int i) {
        dVar.setOrientation(i);
    }

    @xj0(name = "torchMode")
    public void setTorchMode(d dVar, int i) {
        dVar.setTorchMode(i);
    }

    @xj0(name = "type")
    public void setType(d dVar, int i) {
        dVar.setCameraType(i);
    }

    @xj0(name = "zoom")
    public void setZoom(d dVar, int i) {
        dVar.setZoom(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    public void receiveCommand(d dVar, int i, ReadableArray readableArray) {
        if (dVar == null) {
            throw new AssertionError();
        } else if (i == 1) {
            dVar.i();
        } else if (i == 2) {
            dVar.h();
        } else {
            throw new IllegalArgumentException(String.format(C0201.m82(31679), Integer.valueOf(i), RCTCameraViewManager.class.getSimpleName()));
        }
    }
}
