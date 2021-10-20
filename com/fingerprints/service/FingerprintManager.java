package com.fingerprints.service;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Log;
import com.fingerprints.service.IFingerprintClient;
import com.fingerprints.service.IFingerprintService;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import vigqyno.C0188;
import vigqyno.C0201;

public class FingerprintManager {
    public static final int ARG_IDENTIFY_UPDATED = 0;
    public static final int CAPTURE_FAILED_TOO_FAST = 0;
    public static final int DELETE_TEMPLATES_SUCCESS = 0;
    public static final int FPC_GUIDE_DATA_INVALID = 0;
    public static final int FPC_GUIDE_DIRECTION_E = 0;
    public static final int FPC_GUIDE_DIRECTION_N = 0;
    public static final int FPC_GUIDE_DIRECTION_NA = 0;
    public static final int FPC_GUIDE_DIRECTION_NE = 0;
    public static final int FPC_GUIDE_DIRECTION_NW = 0;
    public static final int FPC_GUIDE_DIRECTION_S = 0;
    public static final int FPC_GUIDE_DIRECTION_SE = 0;
    public static final int FPC_GUIDE_DIRECTION_SW = 0;
    public static final int FPC_GUIDE_DIRECTION_W = 0;
    public static final int INTERNEL_FINGERDOWN_TIMEOUT = 0;
    public static final int MEG_FINGERDOWN_TIMEOUT = 0;
    public static final int MEG_WAIT_FINGERDOWN_TIMEOUT = 0;
    public static final int MSG_CAPTURE_FAILED = 0;
    public static final int MSG_DELETE_RESULT = 0;
    public static final int MSG_ENROLMENT_DATA_IMAGE_QUALITY = 0;
    public static final int MSG_ENROLMENT_DATA_IMAGE_STITCHED = 0;
    public static final int MSG_ENROLMENT_DATA_IMMOBILE = 0;
    public static final int MSG_ENROLMENT_DATA_NEXT_DIRECTION = 0;
    public static final int MSG_ENROLMENT_DATA_PROGRESS = 0;
    public static final int MSG_ENROLMENT_DONE = 0;
    public static final int MSG_ENROLMENT_FAILED = 0;
    public static final int MSG_ENROLMENT_LAST_TOUCH = 0;
    public static final int MSG_ENROLMENT_MASK_LIST = 0;
    public static final int MSG_ENROLMENT_NEXT_TOUCH = 0;
    public static final int MSG_ENROLMENT_SEND_GUIDE_DATA = 0;
    public static final int MSG_ENROLMENT_TOUCHES_QUALITY = 0;
    public static final int MSG_ENROL_PROGRESS = 0;
    public static final int MSG_FINGER_PRESENT = 0;
    public static final int MSG_FINGER_UP = 0;
    public static final int MSG_IDENTIFY_MATCH = 0;
    public static final int MSG_IDENTIFY_NO_MATCH = 0;
    public static final int MSG_NOT_ENABLED = 0;
    public static final int MSG_NOT_ENROLLED = 0;
    public static final int MSG_SENSOR_ERROR = 0;
    public static final int MSG_UNKNOWN = 0;
    public static final int MSG_USER_CANCEL = 0;
    public static final int MSG_WAITING_FINGER = 0;
    private static String TAG;
    private static Bundle mBundle;
    private static Bundle mGuidedDataBundle;
    private CaptureCallback mCaptureCallback;
    private IFingerprintClient mClient;
    private DeleteTemplateCallback mDeleteTemplateCallback;
    private EnrolCallback mEnrolCallback;
    private EventHandler mEventhHandler;
    private GuidedDataCallback mGuidedDataCallback;
    private IdentifyCallback mIdentifyCallback;
    private IdentifyListener mIdentifyListener;
    private boolean mReadyToStore = false;
    private IFingerprintService mService;
    private int mUserdata = C0188.f23;
    public HandlerThread mzHanderThread;

    public interface AlipayIdentifyCallback extends IdentifyCallback {
        void onCancel();
    }

    public interface CaptureCallback {
        void onCaptureCompleted();

        void onCaptureFailed(int i);

        void onInput();

        void onWaitingForInput();
    }

    public interface DeleteTemplateCallback {
        void onDeleteResult(boolean z);
    }

    public interface EnrolCallback {
        void onEnrolled(int i);

        void onEnrollmentFailed();

        void onFingerDownTimeOut();

        void onProgress(GuidedData guidedData);
    }

    /* access modifiers changed from: private */
    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            String str = FingerprintManager.TAG;
            Log.i(str, C0201.m82(19254) + message.what);
            boolean z = false;
            switch (message.what) {
                case 1:
                    if (FingerprintManager.this.mCaptureCallback != null) {
                        FingerprintManager.this.mCaptureCallback.onWaitingForInput();
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onStatus(1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 2:
                    if (FingerprintManager.this.mCaptureCallback != null) {
                        FingerprintManager.this.mCaptureCallback.onInput();
                    }
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        sendMessageDelayed(obtainMessage(26), 3000);
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onStatus(2, FingerprintManager.this.mUserdata);
                        removeMessages(21);
                        return;
                    }
                    return;
                case 3:
                    if (FingerprintManager.this.mCaptureCallback != null) {
                        FingerprintManager.this.mCaptureCallback.onCaptureCompleted();
                    }
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        removeMessages(26);
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onStatus(3, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 4:
                    EnrolCallback enrolCallback = FingerprintManager.this.mEnrolCallback;
                    return;
                case 5:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.this.mEnrolCallback.onEnrolled(message.arg1);
                        if (FingerprintManager.this.mReadyToStore) {
                            FingerprintManager.this.mReadyToStore = false;
                            FingerprintManager.this.mEnrolCallback = null;
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    if (FingerprintManager.this.mIdentifyCallback != null) {
                        IdentifyCallback identifyCallback = FingerprintManager.this.mIdentifyCallback;
                        int i = message.arg1;
                        if (message.arg2 == 1) {
                            z = true;
                        }
                        identifyCallback.onIdentified(i, z);
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(6, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 7:
                    if (FingerprintManager.this.mIdentifyCallback != null) {
                        FingerprintManager.this.mIdentifyCallback.onNoMatch();
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(7, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 8:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.this.mEnrolCallback.onEnrollmentFailed();
                        return;
                    }
                    return;
                case 9:
                case 20:
                case 22:
                case 23:
                case 25:
                case 27:
                case 28:
                case 29:
                default:
                    return;
                case 10:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.this.PackGuidedData();
                        return;
                    }
                    return;
                case 11:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        Bundle data = message.getData();
                        String r0 = C0201.m82(19265);
                        FingerprintManager.mGuidedDataBundle.putIntArray(r0, data.getIntArray(r0));
                        return;
                    }
                    return;
                case 12:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        Bundle data2 = message.getData();
                        String r02 = C0201.m82(19264);
                        FingerprintManager.mGuidedDataBundle.putIntArray(r02, data2.getIntArray(r02));
                        return;
                    }
                    return;
                case 13:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        Bundle data3 = message.getData();
                        String r1 = C0201.m82(19262);
                        FingerprintManager.mGuidedDataBundle.putIntArray(r1, data3.getIntArray(r1));
                        FingerprintManager.mGuidedDataBundle.putInt(C0201.m82(19263), message.arg1);
                        return;
                    }
                    return;
                case 14:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt(C0201.m82(19260), message.arg1);
                        FingerprintManager.mGuidedDataBundle.putInt(C0201.m82(19261), message.arg2);
                        return;
                    }
                    return;
                case 15:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt(C0201.m82(19259), message.arg1);
                        return;
                    }
                    return;
                case 16:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt(C0201.m82(19258), message.arg1);
                        return;
                    }
                    return;
                case 17:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt(C0201.m82(19257), message.arg1);
                        if (message.arg1 == 100) {
                            FingerprintManager.this.mReadyToStore = true;
                            return;
                        }
                        return;
                    }
                    return;
                case 18:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt(C0201.m82(19256), message.arg1);
                        return;
                    }
                    return;
                case 19:
                    if (FingerprintManager.this.mCaptureCallback != null) {
                        FingerprintManager.this.mCaptureCallback.onCaptureFailed(message.arg1);
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(19, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 21:
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(21, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 24:
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(24, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 26:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.this.mEnrolCallback.onFingerDownTimeOut();
                        return;
                    }
                    return;
                case 30:
                    if (FingerprintManager.this.mDeleteTemplateCallback != null) {
                        String str2 = FingerprintManager.TAG;
                        Log.d(str2, C0201.m82(19255) + message.arg1);
                        DeleteTemplateCallback deleteTemplateCallback = FingerprintManager.this.mDeleteTemplateCallback;
                        if (message.arg1 == 1) {
                            z = true;
                        }
                        deleteTemplateCallback.onDeleteResult(z);
                        return;
                    }
                    return;
            }
        }
    }

    public class GuidedData {
        public GuidedRect guidedLastTouch;
        public GuidedMaskList guidedMaskList;
        public int guidedNextDirection;
        public GuidedRect guidedNextTouch;
        public int guidedProgress;
        public GuidedResult guidedResult;

        public GuidedData(int i, int i2, GuidedResult guidedResult2, GuidedRect guidedRect, GuidedRect guidedRect2, GuidedMaskList guidedMaskList2) {
            this.guidedProgress = i;
            this.guidedNextDirection = i2;
            this.guidedResult = guidedResult2;
            this.guidedLastTouch = guidedRect;
            this.guidedNextTouch = guidedRect2;
            this.guidedMaskList = guidedMaskList2;
        }
    }

    public interface GuidedDataCallback {
        void onImageQuality(int i, int i2);

        void onImageStitched(int i);

        void onImmobile(int i);

        void onLastTouch(int[] iArr);

        void onMaskList(int i, int[] iArr);

        void onNextDirection(int i);

        void onNextTouch(int[] iArr);

        void onProgressPercentage(int i);

        void onSendGuideData();
    }

    public class GuidedMaskList {
        public ArrayList<GuidedRect> guidedMaskList;
        public int guidedNumberOfMask;

        public GuidedMaskList(ArrayList<GuidedRect> arrayList, int i) {
            this.guidedMaskList = arrayList;
            this.guidedNumberOfMask = i;
        }
    }

    public class GuidedRect {
        public Point guidedBottomLeft;
        public Point guidedBottomRight;
        public Point guidedTopLeft;
        public Point guidedTopRight;

        public GuidedRect(Point point, Point point2, Point point3, Point point4) {
            this.guidedBottomLeft = point;
            this.guidedBottomRight = point2;
            this.guidedTopLeft = point3;
            this.guidedTopRight = point4;
        }
    }

    public class GuidedRejectReasons {
        public boolean guidedLowCoverage;
        public boolean guidedLowQuality;

        public GuidedRejectReasons(boolean z, boolean z2) {
            this.guidedLowCoverage = z;
            this.guidedLowQuality = z2;
        }
    }

    public class GuidedResult {
        public int guidedAcceptance;
        public boolean guidedImmobile;
        public GuidedRejectReasons guidedRejectReasons;
        public boolean guidedStitched;

        public GuidedResult(int i, boolean z, boolean z2, GuidedRejectReasons guidedRejectReasons2) {
            this.guidedAcceptance = i;
            this.guidedStitched = z;
            this.guidedImmobile = z2;
            this.guidedRejectReasons = guidedRejectReasons2;
        }
    }

    public interface IdentifyCallback {
        void onIdentified(int i, boolean z);

        void onNoMatch();
    }

    public interface IdentifyListener {
        void onResult(int i, int i2, int i3);

        void onStatus(int i, int i2);
    }

    static {
        C0201.m83(FingerprintManager.class, 120);
    }

    private FingerprintManager(IBinder iBinder, Looper looper) throws RemoteException {
        this.mService = IFingerprintService.Stub.asInterface(iBinder);
        if (looper == null) {
            Log.d(TAG, C0201.m82(33652));
            HandlerThread handlerThread = new HandlerThread(C0201.m82(33653));
            this.mzHanderThread = handlerThread;
            handlerThread.start();
            looper = this.mzHanderThread.getLooper();
        }
        String str = TAG;
        Log.e(str, C0201.m82(33654) + this.mService);
        EventHandler eventHandler = new EventHandler(looper);
        mBundle = new Bundle();
        mGuidedDataBundle = new Bundle();
        AnonymousClass1 r4 = new IFingerprintClient.Stub() {
            /* class com.fingerprints.service.FingerprintManager.AnonymousClass1 */

            @Override // com.fingerprints.service.IFingerprintClient
            public void onBundleMessage(int i, int i2, int i3, Bundle bundle) throws RemoteException {
                Message obtainMessage = FingerprintManager.this.mEventhHandler.obtainMessage(i, i2, i3);
                obtainMessage.setData(bundle);
                FingerprintManager.this.mEventhHandler.sendMessage(obtainMessage);
            }

            @Override // com.fingerprints.service.IFingerprintClient
            public void onBundleMessage2(int i, int i2, int[] iArr) throws RemoteException {
                Message obtainMessage = FingerprintManager.this.mEventhHandler.obtainMessage(i, i2, 0);
                switch (i) {
                    case 11:
                        FingerprintManager.mBundle.putIntArray(C0201.m82(28291), iArr);
                        obtainMessage.setData(FingerprintManager.mBundle);
                        break;
                    case 12:
                        FingerprintManager.mBundle.putIntArray(C0201.m82(28290), iArr);
                        obtainMessage.setData(FingerprintManager.mBundle);
                        break;
                    case 13:
                        FingerprintManager.mBundle.putIntArray(C0201.m82(28288), iArr);
                        FingerprintManager.mBundle.putInt(C0201.m82(28289), i2);
                        obtainMessage.setData(FingerprintManager.mBundle);
                        break;
                }
                FingerprintManager.this.mEventhHandler.sendMessage(obtainMessage);
            }

            @Override // com.fingerprints.service.IFingerprintClient
            public void onMessage(int i, int i2, int i3) throws RemoteException {
                String str = FingerprintManager.TAG;
                Log.i(str, C0201.m82(28292) + i);
                FingerprintManager.this.mEventhHandler.sendMessage(FingerprintManager.this.mEventhHandler.obtainMessage(i, i2, i3));
            }
        };
        this.mClient = r4;
        IFingerprintService iFingerprintService = this.mService;
        if (iFingerprintService == null || !iFingerprintService.open(r4)) {
            throw new RuntimeException();
        }
        this.mEventhHandler = eventHandler;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0166 A[LOOP:0: B:19:0x0164->B:20:0x0166, LOOP_END] */
    private void PackGuidedData() {
        boolean z;
        boolean z2;
        int i;
        int i2 = mGuidedDataBundle.getInt(C0201.m82(33655));
        int i3 = mGuidedDataBundle.getInt(C0201.m82(33656));
        int i4 = mGuidedDataBundle.getInt(C0201.m82(33657));
        boolean z3 = mGuidedDataBundle.getInt(C0201.m82(33658)) != 0;
        boolean z4 = mGuidedDataBundle.getInt(C0201.m82(33659)) != 0;
        int i5 = mGuidedDataBundle.getInt(C0201.m82(33660));
        int i6 = mGuidedDataBundle.getInt(C0201.m82(33661));
        if (i5 != 1) {
            if (i5 == 16) {
                z2 = true;
            } else if (i5 != 17) {
                z2 = false;
            }
            z = false;
            GuidedResult guidedResult = new GuidedResult(i4, z3, z4, new GuidedRejectReasons(z2, z));
            Bundle bundle = mGuidedDataBundle;
            String r1 = C0201.m82(33662);
            Point point = new Point(bundle.getIntArray(r1)[0], mGuidedDataBundle.getIntArray(r1)[1]);
            Point point2 = new Point(mGuidedDataBundle.getIntArray(r1)[2], mGuidedDataBundle.getIntArray(r1)[3]);
            Point point3 = new Point(mGuidedDataBundle.getIntArray(r1)[4], mGuidedDataBundle.getIntArray(r1)[5]);
            Point point4 = new Point(mGuidedDataBundle.getIntArray(r1)[6], mGuidedDataBundle.getIntArray(r1)[7]);
            Bundle bundle2 = mGuidedDataBundle;
            String r14 = C0201.m82(33663);
            Point point5 = new Point(bundle2.getIntArray(r14)[0], mGuidedDataBundle.getIntArray(r14)[1]);
            Point point6 = new Point(mGuidedDataBundle.getIntArray(r14)[2], mGuidedDataBundle.getIntArray(r14)[3]);
            Point point7 = new Point(mGuidedDataBundle.getIntArray(r14)[4], mGuidedDataBundle.getIntArray(r14)[5]);
            Point point8 = new Point(mGuidedDataBundle.getIntArray(r14)[6], mGuidedDataBundle.getIntArray(r14)[7]);
            GuidedRect guidedRect = new GuidedRect(point, point2, point3, point4);
            GuidedRect guidedRect2 = new GuidedRect(point5, point6, point7, point8);
            ArrayList arrayList = new ArrayList();
            i = 0;
            while (i < i6) {
                Bundle bundle3 = mGuidedDataBundle;
                String r12 = C0201.m82(33664);
                int i7 = i * 8;
                arrayList.add(new GuidedRect(new Point(bundle3.getIntArray(r12)[i7 + 0], mGuidedDataBundle.getIntArray(r12)[i7 + 1]), new Point(mGuidedDataBundle.getIntArray(r12)[i7 + 2], mGuidedDataBundle.getIntArray(r12)[i7 + 3]), new Point(mGuidedDataBundle.getIntArray(r12)[i7 + 4], mGuidedDataBundle.getIntArray(r12)[i7 + 5]), new Point(mGuidedDataBundle.getIntArray(r12)[i7 + 6], mGuidedDataBundle.getIntArray(r12)[i7 + 7])));
                i++;
                guidedRect2 = guidedRect2;
                guidedRect = guidedRect;
                guidedResult = guidedResult;
            }
            this.mEnrolCallback.onProgress(new GuidedData(i2, i3, guidedResult, guidedRect, guidedRect2, new GuidedMaskList(arrayList, i6)));
        }
        z2 = false;
        z = true;
        GuidedResult guidedResult2 = new GuidedResult(i4, z3, z4, new GuidedRejectReasons(z2, z));
        Bundle bundle4 = mGuidedDataBundle;
        String r13 = C0201.m82(33662);
        Point point9 = new Point(bundle4.getIntArray(r13)[0], mGuidedDataBundle.getIntArray(r13)[1]);
        Point point22 = new Point(mGuidedDataBundle.getIntArray(r13)[2], mGuidedDataBundle.getIntArray(r13)[3]);
        Point point32 = new Point(mGuidedDataBundle.getIntArray(r13)[4], mGuidedDataBundle.getIntArray(r13)[5]);
        Point point42 = new Point(mGuidedDataBundle.getIntArray(r13)[6], mGuidedDataBundle.getIntArray(r13)[7]);
        Bundle bundle22 = mGuidedDataBundle;
        String r142 = C0201.m82(33663);
        Point point52 = new Point(bundle22.getIntArray(r142)[0], mGuidedDataBundle.getIntArray(r142)[1]);
        Point point62 = new Point(mGuidedDataBundle.getIntArray(r142)[2], mGuidedDataBundle.getIntArray(r142)[3]);
        Point point72 = new Point(mGuidedDataBundle.getIntArray(r142)[4], mGuidedDataBundle.getIntArray(r142)[5]);
        Point point82 = new Point(mGuidedDataBundle.getIntArray(r142)[6], mGuidedDataBundle.getIntArray(r142)[7]);
        GuidedRect guidedRect3 = new GuidedRect(point9, point22, point32, point42);
        GuidedRect guidedRect22 = new GuidedRect(point52, point62, point72, point82);
        ArrayList arrayList2 = new ArrayList();
        i = 0;
        while (i < i6) {
        }
        this.mEnrolCallback.onProgress(new GuidedData(i2, i3, guidedResult2, guidedRect3, guidedRect22, new GuidedMaskList(arrayList2, i6)));
    }

    public static void notifyScreenOff() {
        try {
            String str = TAG;
            Log.i(str, C0201.m82(33665) + Thread.currentThread().hashCode());
            IBinder service = ServiceManager.getService(C0201.m82(33666));
            if (service != null) {
                IFingerprintService.Stub.asInterface(service).notifyScreenOff();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void notifyScreenOn() {
        try {
            String str = TAG;
            Log.i(str, C0201.m82(33667) + Thread.currentThread().hashCode());
            IBinder service = ServiceManager.getService(C0201.m82(33668));
            if (service != null) {
                IFingerprintService.Stub.asInterface(service).notifyScreenOn();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static FingerprintManager open() {
        try {
            return new FingerprintManager((IBinder) Class.forName(C0201.m82(33669)).getMethod(C0201.m82(33670), String.class).invoke(null, C0201.m82(33671)), Looper.myLooper());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return null;
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return null;
        } catch (RuntimeException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public void abort() {
        try {
            this.mService.cancel(this.mClient);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void deleteFingerData(DeleteTemplateCallback deleteTemplateCallback, int[] iArr) {
        if (deleteTemplateCallback != null) {
            this.mDeleteTemplateCallback = deleteTemplateCallback;
            try {
                this.mService.removeData(this.mClient, iArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public int[] getIds() {
        try {
            Log.i(TAG, C0201.m82(33672));
            return this.mService.getIds(this.mClient);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isFingerEnable() {
        try {
            return this.mService.isFingerEnable();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSurpport() {
        try {
            return this.mService.isSurpport();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void release() {
        Log.i(TAG, C0201.m82(33673));
        if (this.mzHanderThread != null) {
            Log.i(TAG, C0201.m82(33674));
            this.mzHanderThread.quit();
            this.mzHanderThread = null;
        }
        try {
            this.mService.release(this.mClient);
            if (this.mCaptureCallback != null) {
                this.mCaptureCallback = null;
            }
            if (this.mEnrolCallback != null && !this.mReadyToStore) {
                this.mEnrolCallback = null;
            }
            if (this.mIdentifyCallback != null) {
                this.mIdentifyCallback = null;
            }
            this.mIdentifyListener = null;
            this.mClient = null;
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setCaptureCallback(CaptureCallback captureCallback) {
        this.mCaptureCallback = captureCallback;
    }

    public void shouldRestartByScreenOn() {
        try {
            String str = TAG;
            Log.i(str, C0201.m82(33675) + Thread.currentThread().hashCode());
            this.mService.shouldRestartByScreenOn(this.mClient);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void startEnrol(EnrolCallback enrolCallback, int i) {
        if (enrolCallback != null) {
            this.mEnrolCallback = enrolCallback;
            try {
                this.mService.startGuidedEnrol(this.mClient, i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else {
            throw null;
        }
    }

    public void startIdentify(IdentifyCallback identifyCallback, int[] iArr) {
        if (iArr != null && identifyCallback != null) {
            this.mIdentifyCallback = identifyCallback;
            try {
                this.mService.startIdentify(this.mClient, iArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean updateTA(String str) {
        try {
            return this.mService.updateTA(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void startIdentify(IdentifyListener identifyListener, int[] iArr, int i, int i2) {
        if (iArr == null || identifyListener == null) {
            throw null;
        }
        this.mIdentifyListener = identifyListener;
        this.mUserdata = i2;
        String str = TAG;
        Log.i(str, C0201.m82(33676) + iArr[0]);
        if (i > 0) {
            EventHandler eventHandler = this.mEventhHandler;
            eventHandler.sendMessageDelayed(eventHandler.obtainMessage(21, -1, i2), (long) i);
        }
        try {
            this.mService.startIdentify(this.mClient, iArr);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
