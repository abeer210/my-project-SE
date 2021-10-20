package org.reactnative.camera;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import java.util.ArrayList;
import java.util.Map;
import vigqyno.C0201;

public class CameraViewManager extends ViewGroupManager<d> {
    private static final String REACT_CLASS = null;

    public enum a {
        EVENT_CAMERA_READY("onCameraReady"),
        EVENT_ON_MOUNT_ERROR("onMountError"),
        EVENT_ON_BAR_CODE_READ("onBarCodeRead"),
        EVENT_ON_FACES_DETECTED("onFacesDetected"),
        EVENT_ON_BARCODES_DETECTED("onGoogleVisionBarcodesDetected"),
        EVENT_ON_FACE_DETECTION_ERROR("onFaceDetectionError"),
        EVENT_ON_BARCODE_DETECTION_ERROR("onGoogleVisionBarcodeDetectionError"),
        EVENT_ON_TEXT_RECOGNIZED("onTextRecognized"),
        EVENT_ON_PICTURE_TAKEN("onPictureTaken"),
        EVENT_ON_PICTURE_SAVED("onPictureSaved"),
        EVENT_ON_RECORDING_START("onRecordingStart"),
        EVENT_ON_RECORDING_END("onRecordingEnd"),
        EVENT_ON_TOUCH("onTouch");
        
        private final String a;

        private a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    static {
        C0201.m83(CameraViewManager.class, 672);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e.b a2 = e.a();
        a[] values = a.values();
        for (a aVar : values) {
            a2.b(aVar.toString(), e.d(C0201.m82(9865), aVar.toString()));
        }
        return a2.a();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(9866);
    }

    @xj0(name = "autoFocus")
    public void setAutoFocus(d dVar, boolean z) {
        dVar.setAutoFocus(z);
    }

    @xj0(name = "autoFocusPointOfInterest")
    public void setAutoFocusPointOfInterest(d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.v((float) readableMap.getDouble(C0201.m82(9867)), (float) readableMap.getDouble(C0201.m82(9868)));
        }
    }

    @xj0(name = "barCodeScannerEnabled")
    public void setBarCodeScanning(d dVar, boolean z) {
        dVar.setShouldScanBarCodes(z);
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

    @xj0(name = "cameraId")
    public void setCameraId(d dVar, String str) {
        dVar.setCameraId(str);
    }

    @xj0(name = "cameraViewDimensions")
    public void setCameraViewDimensions(d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.p0((int) readableMap.getDouble(C0201.m82(9869)), (int) readableMap.getDouble(C0201.m82(9870)));
        }
    }

    @xj0(name = "detectedImageInEvent")
    public void setDetectedImageInEvent(d dVar, boolean z) {
        dVar.setDetectedImageInEvent(z);
    }

    @xj0(name = "exposure")
    public void setExposureCompensation(d dVar, float f) {
        dVar.setExposureCompensation(f);
    }

    @xj0(name = "faceDetectorEnabled")
    public void setFaceDetecting(d dVar, boolean z) {
        dVar.setShouldDetectFaces(z);
    }

    @xj0(name = "faceDetectionClassifications")
    public void setFaceDetectionClassifications(d dVar, int i) {
        dVar.setFaceDetectionClassifications(i);
    }

    @xj0(name = "faceDetectionLandmarks")
    public void setFaceDetectionLandmarks(d dVar, int i) {
        dVar.setFaceDetectionLandmarks(i);
    }

    @xj0(name = "faceDetectionMode")
    public void setFaceDetectionMode(d dVar, int i) {
        dVar.setFaceDetectionMode(i);
    }

    @xj0(name = "flashMode")
    public void setFlashMode(d dVar, int i) {
        dVar.setFlash(i);
    }

    @xj0(name = "focusDepth")
    public void setFocusDepth(d dVar, float f) {
        dVar.setFocusDepth(f);
    }

    @xj0(name = "googleVisionBarcodeDetectorEnabled")
    public void setGoogleVisionBarcodeDetecting(d dVar, boolean z) {
        dVar.setShouldGoogleDetectBarcodes(z);
    }

    @xj0(name = "googleVisionBarcodeMode")
    public void setGoogleVisionBarcodeMode(d dVar, int i) {
        dVar.setGoogleVisionBarcodeMode(i);
    }

    @xj0(name = "googleVisionBarcodeType")
    public void setGoogleVisionBarcodeType(d dVar, int i) {
        dVar.setGoogleVisionBarcodeType(i);
    }

    @xj0(name = "pictureSize")
    public void setPictureSize(d dVar, String str) {
        dVar.setPictureSize(str.equals(C0201.m82(9871)) ? null : un0.f(str));
    }

    @xj0(name = "playSoundOnCapture")
    public void setPlaySoundOnCapture(d dVar, boolean z) {
        dVar.setPlaySoundOnCapture(z);
    }

    @xj0(name = "playSoundOnRecord")
    public void setPlaySoundOnRecord(d dVar, boolean z) {
        dVar.setPlaySoundOnRecord(z);
    }

    @xj0(name = "ratio")
    public void setRatio(d dVar, String str) {
        dVar.setAspectRatio(ln0.j(str));
    }

    @xj0(name = "rectOfInterest")
    public void setRectOfInterest(d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.q0((float) readableMap.getDouble(C0201.m82(9872)), (float) readableMap.getDouble(C0201.m82(9873)), (float) readableMap.getDouble(C0201.m82(9874)), (float) readableMap.getDouble(C0201.m82(9875)));
        }
    }

    @xj0(name = "textRecognizerEnabled")
    public void setTextRecognizing(d dVar, boolean z) {
        dVar.setShouldRecognizeText(z);
    }

    @xj0(name = "touchDetectorEnabled")
    public void setTouchDetectorEnabled(d dVar, boolean z) {
        dVar.setShouldDetectTouches(z);
    }

    @xj0(name = "trackingEnabled")
    public void setTracking(d dVar, boolean z) {
        dVar.setTracking(z);
    }

    @xj0(name = "type")
    public void setType(d dVar, int i) {
        dVar.setFacing(i);
    }

    @xj0(name = "useCamera2Api")
    public void setUseCamera2Api(d dVar, boolean z) {
        dVar.setUsingCamera2Api(z);
    }

    @xj0(name = "useNativeZoom")
    public void setUseNativeZoom(d dVar, boolean z) {
        dVar.setUseNativeZoom(z);
    }

    @xj0(name = "whiteBalance")
    public void setWhiteBalance(d dVar, int i) {
        dVar.setWhiteBalance(i);
    }

    @xj0(name = "zoom")
    public void setZoom(d dVar, float f) {
        dVar.setZoom(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    public void onDropViewInstance(d dVar) {
        dVar.onHostDestroy();
        super.onDropViewInstance((View) dVar);
    }
}
