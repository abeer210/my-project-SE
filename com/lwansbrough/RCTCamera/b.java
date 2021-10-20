package com.lwansbrough.RCTCamera;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: RCTCamera */
public class b {
    private static b h;
    private static final C0120b i = new C0120b(853, 480);
    private static final C0120b j = new C0120b(1280, 720);
    private static final C0120b k = new C0120b(1920, 1080);
    private final HashMap<Integer, a> a = new HashMap<>();
    private final HashMap<Integer, Integer> b = new HashMap<>();
    private final Map<Number, Camera> c = new HashMap();
    private boolean d = false;
    private List<String> e = null;
    private int f = -1;
    private int g = 0;

    /* access modifiers changed from: private */
    /* compiled from: RCTCamera */
    public class a {
        public final Camera.CameraInfo a;
        public int b = 0;
        public int c = -1;
        public int d = -1;
        public int e = -1;
        public int f = -1;

        public a(b bVar, Camera.CameraInfo cameraInfo) {
            this.a = cameraInfo;
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.b$b  reason: collision with other inner class name */
    /* compiled from: RCTCamera */
    private static class C0120b {
        public int a;
        public int b;

        public C0120b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private b(int i2) {
        this.g = i2;
        for (int i3 = 0; i3 < Camera.getNumberOfCameras(); i3++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i3, cameraInfo);
            if (cameraInfo.facing == 1 && this.a.get(1) == null) {
                this.a.put(1, new a(this, cameraInfo));
                this.b.put(1, Integer.valueOf(i3));
                a(1);
                q(1);
            } else if (cameraInfo.facing == 0 && this.a.get(2) == null) {
                this.a.put(2, new a(this, cameraInfo));
                this.b.put(2, Integer.valueOf(i3));
                a(2);
                q(2);
            }
        }
    }

    public static void d(int i2) {
        h = new b(i2);
    }

    private Camera.Size g(List<Camera.Size> list, int i2, int i3) {
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            if (size != null) {
                if (Math.sqrt(Math.pow((double) (size2.width - i2), 2.0d) + Math.pow((double) (size2.height - i3), 2.0d)) >= Math.sqrt(Math.pow((double) (size.width - i2), 2.0d) + Math.pow((double) (size.height - i3), 2.0d))) {
                }
            }
            size = size2;
        }
        return size;
    }

    public static b h() {
        return h;
    }

    private Camera.Size n(List<Camera.Size> list) {
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            if (size == null || size2.width * size2.height < size.width * size.height) {
                size = size2;
            }
        }
        return size;
    }

    public void A(int i2, int i3, int i4) {
        a aVar = this.a.get(Integer.valueOf(i2));
        if (aVar != null) {
            aVar.e = i3;
            aVar.f = i4;
        }
    }

    public void B(int i2, int i3) {
        Camera a2 = a(i2);
        if (a2 != null) {
            Camera.Parameters parameters = a2.getParameters();
            String flashMode = parameters.getFlashMode();
            if (i3 == 0) {
                flashMode = C0201.m82(4793);
            } else if (i3 == 1) {
                flashMode = C0201.m82(4792);
            }
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(flashMode)) {
                parameters.setFlashMode(flashMode);
                try {
                    a2.setParameters(parameters);
                } catch (RuntimeException e2) {
                    Log.e(C0201.m82(4794), C0201.m82(4795), e2);
                }
            }
        }
    }

    public void C(int i2, int i3) {
        Camera a2 = a(i2);
        if (a2 != null) {
            Camera.Parameters parameters = a2.getParameters();
            int maxZoom = parameters.getMaxZoom();
            if (parameters.isZoomSupported() && i3 >= 0 && i3 < maxZoom) {
                parameters.setZoom(i3);
                try {
                    a2.setParameters(parameters);
                } catch (RuntimeException e2) {
                    Log.e(C0201.m82(4796), C0201.m82(4797), e2);
                }
            }
        }
    }

    public synchronized Camera a(int i2) {
        if (this.c.get(Integer.valueOf(i2)) == null && this.b.get(Integer.valueOf(i2)) != null) {
            try {
                this.c.put(Integer.valueOf(i2), Camera.open(this.b.get(Integer.valueOf(i2)).intValue()));
                c(i2);
            } catch (Exception e2) {
                Log.e(C0201.m82(4798), C0201.m82(4799), e2);
            }
        }
        return this.c.get(Integer.valueOf(i2));
    }

    public void b(int i2, int i3) {
        int i4;
        Camera camera = this.c.get(Integer.valueOf(i2));
        if (camera != null) {
            a aVar = this.a.get(Integer.valueOf(i2));
            Camera.CameraInfo cameraInfo = aVar.a;
            int i5 = cameraInfo.orientation;
            if (cameraInfo.facing == 1) {
                i4 = (i5 + (i3 * 90)) % 360;
            } else {
                i4 = ((i5 - (i3 * 90)) + 360) % 360;
            }
            aVar.b = i4;
            Camera.Parameters parameters = camera.getParameters();
            parameters.setRotation(aVar.b);
            try {
                camera.setParameters(parameters);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void c(int i2) {
        int i3;
        int i4;
        Camera camera = this.c.get(Integer.valueOf(i2));
        if (camera != null) {
            a aVar = this.a.get(Integer.valueOf(i2));
            Camera.CameraInfo cameraInfo = aVar.a;
            int i5 = cameraInfo.orientation;
            if (cameraInfo.facing == 1) {
                int i6 = this.g;
                i3 = ((i6 * 90) + i5) % 360;
                i4 = ((720 - i5) - (i6 * 90)) % 360;
            } else {
                i3 = ((i5 - (this.g * 90)) + 360) % 360;
                i4 = i3;
            }
            aVar.b = i3;
            s(i3);
            camera.setDisplayOrientation(i4);
            Camera.Parameters parameters = camera.getParameters();
            parameters.setRotation(aVar.b);
            Camera.Size f2 = f(parameters.getSupportedPreviewSizes(), C0188.f24, C0188.f24);
            int i7 = f2.width;
            int i8 = f2.height;
            parameters.setPreviewSize(i7, i8);
            try {
                camera.setParameters(parameters);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            int i9 = aVar.b;
            if (i9 == 0 || i9 == 180) {
                aVar.c = i7;
                aVar.d = i8;
                return;
            }
            aVar.c = i8;
            aVar.d = i7;
        }
    }

    public List<String> e() {
        return this.e;
    }

    public Camera.Size f(List<Camera.Size> list, int i2, int i3) {
        int i4;
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            int i5 = size2.width;
            if (i5 <= i2 && (i4 = size2.height) <= i3) {
                if (size == null || i5 * i4 > size.width * size.height) {
                    size = size2;
                }
            }
        }
        return size;
    }

    public int i() {
        return this.f;
    }

    public int j(int i2) {
        a aVar = this.a.get(Integer.valueOf(i2));
        if (aVar == null) {
            return 0;
        }
        return aVar.d;
    }

    public int k(int i2) {
        a aVar = this.a.get(Integer.valueOf(i2));
        if (aVar == null) {
            return 0;
        }
        return aVar.f;
    }

    public int l(int i2) {
        a aVar = this.a.get(Integer.valueOf(i2));
        if (aVar == null) {
            return 0;
        }
        return aVar.e;
    }

    public int m(int i2) {
        a aVar = this.a.get(Integer.valueOf(i2));
        if (aVar == null) {
            return 0;
        }
        return aVar.c;
    }

    public List<Camera.Size> o(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            return supportedVideoSizes;
        }
        return parameters.getSupportedPreviewSizes();
    }

    public boolean p() {
        return this.d;
    }

    public void q(int i2) {
        Camera camera = this.c.get(Integer.valueOf(i2));
        if (camera != null) {
            this.c.remove(Integer.valueOf(i2));
            camera.release();
        }
    }

    public void r(int i2) {
        this.g = i2;
        c(1);
        c(2);
    }

    public void s(int i2) {
    }

    public void t(List<String> list) {
        this.e = list;
    }

    public void u(boolean z) {
        this.d = z;
    }

    public void v(int i2, int i3) {
        Camera camera = this.c.get(Integer.valueOf(i2));
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            parameters.setRecordingHint(z);
            try {
                camera.setParameters(parameters);
            } catch (RuntimeException e2) {
                Log.e(C0201.m82(4800), C0201.m82(4801), e2);
            }
        }
    }

    public void w(int i2, String str) {
        Camera a2 = a(i2);
        if (a2 != null) {
            Camera.Parameters parameters = a2.getParameters();
            Camera.Size size = null;
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1078030475:
                    if (str.equals(C0201.m82(4808))) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -318184504:
                    if (str.equals(C0201.m82(4807))) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 107348:
                    if (str.equals(C0201.m82(4806))) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1604548:
                    if (str.equals(C0201.m82(4805))) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1688155:
                    if (str.equals(C0201.m82(4804))) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3202466:
                    if (str.equals(C0201.m82(4803))) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 46737913:
                    if (str.equals(C0201.m82(4802))) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    size = n(supportedPictureSizes);
                    break;
                case 1:
                    size = supportedPictureSizes.get(supportedPictureSizes.size() / 2);
                    break;
                case 2:
                    size = f(parameters.getSupportedPictureSizes(), C0188.f24, C0188.f24);
                    break;
                case 3:
                    Camera.Size f2 = f(parameters.getSupportedPreviewSizes(), C0188.f24, C0188.f24);
                    size = g(parameters.getSupportedPictureSizes(), f2.width, f2.height);
                    break;
                case 4:
                    C0120b bVar = i;
                    size = f(supportedPictureSizes, bVar.a, bVar.b);
                    break;
                case 5:
                    C0120b bVar2 = j;
                    size = f(supportedPictureSizes, bVar2.a, bVar2.b);
                    break;
                case 6:
                    C0120b bVar3 = k;
                    size = f(supportedPictureSizes, bVar3.a, bVar3.b);
                    break;
            }
            if (size != null) {
                parameters.setPictureSize(size.width, size.height);
                try {
                    a2.setParameters(parameters);
                } catch (RuntimeException e2) {
                    Log.e(C0201.m82(4809), C0201.m82(4810), e2);
                }
            }
        }
    }

    public CamcorderProfile x(int i2, String str) {
        Camera.Size size;
        CamcorderProfile camcorderProfile;
        Camera a2 = a(i2);
        if (a2 == null) {
            return null;
        }
        List<Camera.Size> o = o(a2);
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals(C0201.m82(4816))) {
                    c2 = 1;
                    break;
                }
                break;
            case 107348:
                if (str.equals(C0201.m82(4815))) {
                    c2 = 0;
                    break;
                }
                break;
            case 1604548:
                if (str.equals(C0201.m82(4814))) {
                    c2 = 3;
                    break;
                }
                break;
            case 1688155:
                if (str.equals(C0201.m82(4813))) {
                    c2 = 4;
                    break;
                }
                break;
            case 3202466:
                if (str.equals(C0201.m82(4812))) {
                    c2 = 2;
                    break;
                }
                break;
            case 46737913:
                if (str.equals(C0201.m82(4811))) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            size = n(o);
            camcorderProfile = CamcorderProfile.get(this.b.get(Integer.valueOf(i2)).intValue(), 4);
        } else if (c2 == 1) {
            size = o.get(o.size() / 2);
            camcorderProfile = CamcorderProfile.get(this.b.get(Integer.valueOf(i2)).intValue(), 5);
        } else if (c2 == 2) {
            size = f(o, C0188.f24, C0188.f24);
            camcorderProfile = CamcorderProfile.get(this.b.get(Integer.valueOf(i2)).intValue(), 1);
        } else if (c2 == 3) {
            C0120b bVar = i;
            size = f(o, bVar.a, bVar.b);
            camcorderProfile = CamcorderProfile.get(this.b.get(Integer.valueOf(i2)).intValue(), 4);
        } else if (c2 == 4) {
            C0120b bVar2 = j;
            size = f(o, bVar2.a, bVar2.b);
            camcorderProfile = CamcorderProfile.get(this.b.get(Integer.valueOf(i2)).intValue(), 5);
        } else if (c2 != 5) {
            camcorderProfile = null;
            size = null;
        } else {
            C0120b bVar3 = k;
            size = f(o, bVar3.a, bVar3.b);
            camcorderProfile = CamcorderProfile.get(this.b.get(Integer.valueOf(i2)).intValue(), 6);
        }
        if (camcorderProfile == null) {
            return null;
        }
        if (size != null) {
            camcorderProfile.videoFrameHeight = size.height;
            camcorderProfile.videoFrameWidth = size.width;
        }
        return camcorderProfile;
    }

    public void y(int i2, int i3) {
        Camera a2 = a(i2);
        if (a2 != null) {
            Camera.Parameters parameters = a2.getParameters();
            String flashMode = parameters.getFlashMode();
            if (i3 == 0) {
                flashMode = C0201.m82(4819);
            } else if (i3 == 1) {
                flashMode = C0201.m82(4818);
            } else if (i3 == 2) {
                flashMode = C0201.m82(4817);
            }
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(flashMode)) {
                parameters.setFlashMode(flashMode);
                try {
                    a2.setParameters(parameters);
                } catch (RuntimeException e2) {
                    Log.e(C0201.m82(4820), C0201.m82(4821), e2);
                }
            }
        }
    }

    public void z(int i2) {
        if (this.f != i2) {
            this.f = i2;
            c(1);
            c(2);
        }
    }
}
