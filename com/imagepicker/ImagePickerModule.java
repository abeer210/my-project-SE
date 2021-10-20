package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Patterns;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import defpackage.uc2;
import defpackage.wc2;
import defpackage.zc2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

@pj0(name = "ImagePickerManager")
public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int DEFAULT_EXPLAINING_PERMISSION_DIALIOG_THEME = c.DefaultExplainingPermissionsTheme;
    public static final String NAME = null;
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 0;
    public static final int REQUEST_LAUNCH_IMAGE_LIBRARY = 0;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 0;
    public static final int REQUEST_LAUNCH_VIDEO_LIBRARY = 0;
    public static final int REQUEST_PERMISSIONS_FOR_CAMERA = 0;
    public static final int REQUEST_PERMISSIONS_FOR_LIBRARY = 0;
    public Callback callback;
    public Uri cameraCaptureURI;
    private final int dialogThemeId;
    private sc2 imageConfig;
    private f listener;
    private Boolean noData;
    private ReadableMap options;
    private Callback permissionRequestCallback;
    private Boolean pickBoth;
    private Boolean pickVideo;
    private final ReactApplicationContext reactContext;
    private d responseHelper;
    @Deprecated
    private int videoDurationLimit;
    @Deprecated
    private int videoQuality;

    class a implements f {
        public a() {
        }

        @Override // com.facebook.react.modules.core.f
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            boolean z = true;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                z = z && (iArr[i2] == 0);
            }
            ImagePickerModule imagePickerModule = ImagePickerModule.this;
            if (imagePickerModule.callback == null || imagePickerModule.options == null) {
                return false;
            }
            if (!z) {
                ImagePickerModule.this.responseHelper.d(ImagePickerModule.this.permissionRequestCallback, C0201.m82(6065));
                return false;
            }
            if (i == 14001) {
                ImagePickerModule imagePickerModule2 = ImagePickerModule.this;
                imagePickerModule2.launchCamera(imagePickerModule2.options, ImagePickerModule.this.permissionRequestCallback);
            } else if (i == 14002) {
                ImagePickerModule imagePickerModule3 = ImagePickerModule.this;
                imagePickerModule3.launchImageLibrary(imagePickerModule3.options, ImagePickerModule.this.permissionRequestCallback);
            }
            return true;
        }
    }

    class b implements zc2.d {
        public b(ImagePickerModule imagePickerModule) {
        }

        @Override // defpackage.zc2.d
        public void a(ImagePickerModule imagePickerModule, String str) {
            if (imagePickerModule != null) {
                imagePickerModule.invokeCustomButton(str);
            }
        }

        @Override // defpackage.zc2.d
        public void b(ImagePickerModule imagePickerModule) {
            if (imagePickerModule != null) {
                imagePickerModule.doOnCancel();
            }
        }

        @Override // defpackage.zc2.d
        public void c(ImagePickerModule imagePickerModule) {
            if (imagePickerModule != null) {
                imagePickerModule.launchImageLibrary();
            }
        }

        @Override // defpackage.zc2.d
        public void d(ImagePickerModule imagePickerModule) {
            if (imagePickerModule != null) {
                imagePickerModule.launchCamera();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements uc2.c {
        public c(ImagePickerModule imagePickerModule) {
        }

        @Override // defpackage.uc2.c
        public void a(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface) {
            ImagePickerModule imagePickerModule = weakReference.get();
            if (imagePickerModule != null) {
                imagePickerModule.doOnCancel();
            }
        }

        @Override // defpackage.uc2.c
        public void b(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface) {
            ImagePickerModule imagePickerModule = weakReference.get();
            if (imagePickerModule != null) {
                Intent intent = new Intent(C0201.m82(5645));
                intent.setData(Uri.fromParts(C0201.m82(5646), imagePickerModule.getContext().getPackageName(), null));
                Activity activity = imagePickerModule.getActivity();
                if (activity != null) {
                    activity.startActivityForResult(intent, 1);
                }
            }
        }
    }

    static {
        C0201.m83(ImagePickerModule.class, 351);
    }

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, DEFAULT_EXPLAINING_PERMISSION_DIALIOG_THEME);
    }

    private File createFileFromURI(Uri uri) throws Exception {
        File externalCacheDir = this.reactContext.getExternalCacheDir();
        File file = new File(externalCacheDir, C0201.m82(18108) + uri.getLastPathSegment());
        InputStream openInputStream = this.reactContext.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    return file;
                }
            }
        } finally {
            fileOutputStream.close();
            openInputStream.close();
        }
    }

    private String getBase64StringFromFile(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileInputStream = null;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    private String getRealPathFromURI(Uri uri) {
        return yc2.d(this.reactContext, uri);
    }

    private boolean isCameraAvailable() {
        return this.reactContext.getPackageManager().hasSystemFeature(C0201.m82(18109)) || this.reactContext.getPackageManager().hasSystemFeature(C0201.m82(18110));
    }

    private void parseOptions(ReadableMap readableMap) {
        this.noData = Boolean.FALSE;
        String r0 = C0201.m82(18111);
        if (readableMap.hasKey(r0)) {
            this.noData = Boolean.valueOf(readableMap.getBoolean(r0));
        }
        this.imageConfig = this.imageConfig.b(readableMap);
        Boolean bool = Boolean.FALSE;
        this.pickVideo = bool;
        this.pickBoth = bool;
        String r02 = C0201.m82(18112);
        if (readableMap.hasKey(r02) && readableMap.getString(r02).equals(C0201.m82(18113))) {
            this.pickBoth = Boolean.TRUE;
        }
        if (readableMap.hasKey(r02) && readableMap.getString(r02).equals(C0201.m82(18114))) {
            this.pickVideo = Boolean.TRUE;
        }
        this.videoQuality = 1;
        String r03 = C0201.m82(18115);
        if (readableMap.hasKey(r03) && readableMap.getString(r03).equals(C0201.m82(18116))) {
            this.videoQuality = 0;
        }
        this.videoDurationLimit = 0;
        String r04 = C0201.m82(18117);
        if (readableMap.hasKey(r04)) {
            this.videoDurationLimit = readableMap.getInt(r04);
        }
    }

    private boolean passResult(int i) {
        return this.callback == null || (this.cameraCaptureURI == null && i == 13001) || !(i == 13001 || i == 13002 || i == 13003 || i == 13004);
    }

    private boolean permissionsCheck(Activity activity, Callback callback2, int i) {
        String[] strArr;
        String r9 = C0201.m82(18118);
        int a2 = androidx.core.content.b.a(activity, r9);
        String r1 = C0201.m82(18119);
        boolean z = true;
        if (i == 14001 ? androidx.core.content.b.a(activity, r1) == 0 && a2 == 0 : i == 14002 && a2 == 0) {
            return true;
        }
        if (!androidx.core.app.a.p(activity, r9) || !androidx.core.app.a.p(activity, r1)) {
            z = false;
        }
        if (Boolean.valueOf(z).booleanValue()) {
            androidx.appcompat.app.b a3 = uc2.a(this, this.options, new c(this));
            if (a3 != null) {
                a3.show();
            }
            return false;
        }
        if (i == 14001) {
            strArr = new String[]{r1, r9};
        } else if (i != 14002) {
            strArr = new String[0];
        } else {
            strArr = new String[]{r9};
        }
        if (activity instanceof ni0) {
            ((ni0) activity).i(strArr, i, this.listener);
        } else if (activity instanceof e) {
            ((e) activity).i(strArr, i, this.listener);
        } else if (activity instanceof tc2) {
            ((tc2) activity).a(this.listener);
            androidx.core.app.a.o(activity, strArr, i);
        } else {
            throw new UnsupportedOperationException(activity.getClass().getSimpleName() + C0201.m82(18120) + tc2.class.getSimpleName() + C0201.m82(18121) + e.class.getSimpleName());
        }
        return false;
    }

    private void putExtraFileInfo(String str, d dVar) {
        try {
            File file = new File(str);
            dVar.g(C0201.m82(18122), (double) file.length());
            dVar.i(C0201.m82(18123), file.getName());
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            String name = file.getName();
            String r1 = C0201.m82(18124);
            String r2 = C0201.m82(18125);
            if (fileExtensionFromUrl != r1) {
                dVar.i(r2, MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl));
                return;
            }
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf > 0) {
                dVar.i(r2, MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(lastIndexOf + 1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updatedResultResponse(Uri uri, String str) {
        this.responseHelper.i(C0201.m82(18126), uri.toString());
        this.responseHelper.i(C0201.m82(18127), str);
        if (!this.noData.booleanValue()) {
            this.responseHelper.i(C0201.m82(18128), getBase64StringFromFile(str));
        }
        putExtraFileInfo(str, this.responseHelper);
    }

    public void doOnCancel() {
        Callback callback2 = this.callback;
        if (callback2 != null) {
            this.responseHelper.b(callback2);
            this.callback = null;
        }
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getContext() {
        return getReactApplicationContext();
    }

    public int getDialogThemeId() {
        return this.dialogThemeId;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(18129);
    }

    public void invokeCustomButton(String str) {
        this.responseHelper.c(this.callback, str);
    }

    public void launchCamera() {
        launchCamera(this.options, this.callback);
    }

    public void launchImageLibrary() {
        launchImageLibrary(this.options, this.callback);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Uri uri;
        if (!passResult(i)) {
            this.responseHelper.a();
            if (i2 != -1) {
                wc2.f(i, this.imageConfig);
                this.responseHelper.b(this.callback);
                this.callback = null;
                return;
            }
            String r13 = C0201.m82(18145);
            String r1 = C0201.m82(18146);
            String r2 = C0201.m82(18147);
            switch (i) {
                case 13001:
                    uri = this.cameraCaptureURI;
                    break;
                case 13002:
                    uri = intent.getData();
                    String realPathFromURI = getRealPathFromURI(uri);
                    boolean z = !TextUtils.isEmpty(realPathFromURI) && Patterns.WEB_URL.matcher(realPathFromURI).matches();
                    if (realPathFromURI == null || z) {
                        try {
                            File createFileFromURI = createFileFromURI(uri);
                            String absolutePath = createFileFromURI.getAbsolutePath();
                            uri = Uri.fromFile(createFileFromURI);
                            realPathFromURI = absolutePath;
                        } catch (Exception unused) {
                            this.responseHelper.i(r1, C0201.m82(18148));
                            this.responseHelper.i(r2, uri.toString());
                            this.responseHelper.e(this.callback);
                            this.callback = null;
                            return;
                        }
                    }
                    this.imageConfig = this.imageConfig.f(new File(realPathFromURI));
                    break;
                case 13003:
                    this.responseHelper.i(r2, intent.getData().toString());
                    this.responseHelper.i(r13, getRealPathFromURI(intent.getData()));
                    this.responseHelper.e(this.callback);
                    this.callback = null;
                    return;
                case 13004:
                    String realPathFromURI2 = getRealPathFromURI(intent.getData());
                    this.responseHelper.i(r2, intent.getData().toString());
                    this.responseHelper.i(r13, realPathFromURI2);
                    wc2.b(this.reactContext, realPathFromURI2);
                    this.responseHelper.e(this.callback);
                    this.callback = null;
                    return;
                default:
                    uri = null;
                    break;
            }
            wc2.b e = wc2.e(this.responseHelper, this.imageConfig);
            if (e.b != null) {
                wc2.f(i, this.imageConfig);
                this.responseHelper.d(this.callback, e.b.getMessage());
                this.callback = null;
                return;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.imageConfig.a.getAbsolutePath(), options2);
            int i3 = options2.outWidth;
            int i4 = options2.outHeight;
            updatedResultResponse(uri, this.imageConfig.a.getAbsolutePath());
            boolean c2 = this.imageConfig.c(i3, i4, e.a);
            String r132 = C0201.m82(18149);
            String r14 = C0201.m82(18150);
            if (c2) {
                this.responseHelper.h(r14, i3);
                this.responseHelper.h(r132, i4);
                wc2.b(this.reactContext, this.imageConfig.a.getAbsolutePath());
            } else {
                sc2 c3 = wc2.c(this.reactContext, this.options, this.imageConfig, i3, i4, i);
                this.imageConfig = c3;
                File file = c3.b;
                if (file == null) {
                    wc2.f(i, c3);
                    this.responseHelper.i(r1, C0201.m82(18151));
                } else {
                    Uri fromFile = Uri.fromFile(file);
                    BitmapFactory.decodeFile(this.imageConfig.b.getAbsolutePath(), options2);
                    this.responseHelper.h(r14, options2.outWidth);
                    this.responseHelper.h(r132, options2.outHeight);
                    updatedResultResponse(fromFile, this.imageConfig.b.getAbsolutePath());
                    wc2.b(this.reactContext, this.imageConfig.b.getAbsolutePath());
                }
            }
            sc2 sc2 = this.imageConfig;
            if (sc2.g && i == 13001) {
                wc2.c g = wc2.g(sc2);
                if (g.b == null) {
                    sc2 sc22 = g.a;
                    this.imageConfig = sc22;
                    updatedResultResponse(Uri.fromFile(sc22.a()), this.imageConfig.a().getAbsolutePath());
                } else {
                    wc2.f(i, this.imageConfig);
                    this.responseHelper.i(r1, C0201.m82(18152) + g.b.getMessage());
                    return;
                }
            }
            this.responseHelper.e(this.callback);
            this.callback = null;
            this.options = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void showImagePicker(ReadableMap readableMap, Callback callback2) {
        if (getCurrentActivity() == null) {
            this.responseHelper.d(callback2, C0201.m82(18153));
            return;
        }
        this.callback = callback2;
        this.options = readableMap;
        this.imageConfig = new sc2(null, null, 0, 0, 100, 0, false);
        zc2.a(this, readableMap, new b(this)).show();
    }

    public ImagePickerModule(ReactApplicationContext reactApplicationContext, int i) {
        super(reactApplicationContext);
        Boolean bool = Boolean.FALSE;
        this.noData = bool;
        this.pickVideo = bool;
        this.pickBoth = bool;
        this.imageConfig = new sc2(null, null, 0, 0, 100, 0, false);
        this.videoQuality = 1;
        this.videoDurationLimit = 0;
        this.responseHelper = new d();
        this.listener = new a();
        this.dialogThemeId = i;
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback2) {
        int i;
        Intent intent;
        this.permissionRequestCallback = callback2;
        if (!isCameraAvailable()) {
            this.responseHelper.d(callback2, C0201.m82(18130));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            this.responseHelper.d(callback2, C0201.m82(18131));
            return;
        }
        this.callback = callback2;
        this.options = readableMap;
        if (permissionsCheck(currentActivity, callback2, 14001)) {
            parseOptions(this.options);
            if (this.pickVideo.booleanValue()) {
                i = 13004;
                intent = new Intent(C0201.m82(18132));
                intent.putExtra(C0201.m82(18133), this.videoQuality);
                int i2 = this.videoDurationLimit;
                if (i2 > 0) {
                    intent.putExtra(C0201.m82(18134), i2);
                }
            } else {
                i = 13001;
                intent = new Intent(C0201.m82(18135));
                sc2 f = this.imageConfig.f(wc2.a(this.reactContext, this.options, false));
                this.imageConfig = f;
                File file = f.a;
                String r3 = C0201.m82(18136);
                if (file != null) {
                    Uri a2 = yc2.a(this.reactContext, file);
                    this.cameraCaptureURI = a2;
                    if (a2 == null) {
                        this.responseHelper.d(callback2, r3);
                        return;
                    }
                    intent.putExtra(C0201.m82(18137), a2);
                } else {
                    this.responseHelper.d(callback2, r3);
                    return;
                }
            }
            ComponentName resolveActivity = intent.resolveActivity(this.reactContext.getPackageManager());
            String r32 = C0201.m82(18138);
            if (resolveActivity == null) {
                this.responseHelper.d(callback2, r32);
                return;
            }
            if (Build.VERSION.SDK_INT <= 19) {
                for (ResolveInfo resolveInfo : this.reactContext.getPackageManager().queryIntentActivities(intent, 65536)) {
                    this.reactContext.grantUriPermission(resolveInfo.activityInfo.packageName, this.cameraCaptureURI, 3);
                }
            }
            try {
                currentActivity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                this.responseHelper.d(callback2, r32);
            }
        }
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback2) {
        Intent intent;
        int i;
        String r0 = C0201.m82(18139);
        this.permissionRequestCallback = callback2;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            this.responseHelper.d(callback2, C0201.m82(18140));
            return;
        }
        this.callback = callback2;
        this.options = readableMap;
        if (permissionsCheck(currentActivity, callback2, 14002)) {
            parseOptions(this.options);
            boolean booleanValue = this.pickVideo.booleanValue();
            String r3 = C0201.m82(18141);
            if (booleanValue) {
                i = 13003;
                intent = new Intent(r3);
                intent.setType(C0201.m82(18142));
            } else {
                i = 13002;
                intent = new Intent(r3, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                if (this.pickBoth.booleanValue()) {
                    intent.setType(C0201.m82(18143));
                }
            }
            ComponentName resolveActivity = intent.resolveActivity(this.reactContext.getPackageManager());
            String r5 = C0201.m82(18144);
            if (resolveActivity == null) {
                this.responseHelper.d(callback2, r5);
                return;
            }
            String str = null;
            try {
                if (xc2.b(readableMap, r0)) {
                    str = readableMap.getString(r0);
                }
                currentActivity.startActivityForResult(Intent.createChooser(intent, str), i);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                this.responseHelper.d(callback2, r5);
            }
        }
    }
}
