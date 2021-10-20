package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.yalantis.ucrop.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import vigqyno.C0201;

public class PickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int CAMERA_PICKER_REQUEST = 0;
    private static final String E_ACTIVITY_DOES_NOT_EXIST = null;
    private static final String E_CALLBACK_ERROR = null;
    private static final String E_CAMERA_IS_NOT_AVAILABLE = null;
    private static final String E_CANNOT_LAUNCH_CAMERA = null;
    private static final String E_ERROR_WHILE_CLEANING_FILES = null;
    private static final String E_FAILED_TO_OPEN_CAMERA = null;
    private static final String E_FAILED_TO_SHOW_PICKER = null;
    private static final String E_NO_IMAGE_DATA_FOUND = null;
    private static final String E_PERMISSIONS_MISSING = null;
    private static final String E_PICKER_CANCELLED_KEY = null;
    private static final String E_PICKER_CANCELLED_MSG = null;
    private static final int IMAGE_PICKER_REQUEST = 0;
    private a compression = new a();
    private String cropperActiveWidgetColor = null;
    private boolean cropperCircleOverlay = false;
    private String cropperStatusBarColor = null;
    private String cropperToolbarColor = null;
    private String cropperToolbarTitle = null;
    private String cropperToolbarWidgetColor = null;
    private boolean cropping = false;
    private boolean disableCropperColorSetters = false;
    private boolean enableRotationGesture = false;
    private boolean freeStyleCropEnabled = false;
    private int height = 0;
    private boolean hideBottomControls = false;
    private boolean includeBase64 = false;
    private boolean includeExif = false;
    private Uri mCameraCaptureURI;
    private String mCurrentMediaPath;
    private String mediaType = C0201.m82(28343);
    private boolean multiple = false;
    private ReadableMap options;
    private ReactApplicationContext reactContext;
    private e resultCollector = new e();
    private boolean showCropFrame = true;
    private boolean showCropGuidelines = true;
    private boolean useFrontCamera = false;
    private int width = 0;

    class a implements Callable<Void> {
        public final /* synthetic */ PickerModule a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ Promise c;

        public a(PickerModule pickerModule, PickerModule pickerModule2, Activity activity, Promise promise) {
            this.a = pickerModule2;
            this.b = activity;
            this.c = promise;
        }

        /* renamed from: a */
        public Void call() {
            try {
                File file = new File(this.a.getTmpDir(this.b));
                if (file.exists()) {
                    this.a.deleteRecursive(file);
                    this.c.resolve(null);
                    return null;
                }
                throw new Exception(C0201.m82(21416));
            } catch (Exception e) {
                e.printStackTrace();
                this.c.reject(C0201.m82(21417), e.getMessage());
            }
        }
    }

    class b implements Callable<Void> {
        public final /* synthetic */ String a;
        public final /* synthetic */ PickerModule b;
        public final /* synthetic */ Promise c;

        public b(PickerModule pickerModule, String str, PickerModule pickerModule2, Promise promise) {
            this.a = str;
            this.b = pickerModule2;
            this.c = promise;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            try {
                String str = this.a;
                if (str.startsWith(C0201.m82(21307))) {
                    str = str.substring(7);
                }
                File file = new File(str);
                if (file.exists()) {
                    this.b.deleteRecursive(file);
                    this.c.resolve(null);
                    return null;
                }
                throw new Exception(C0201.m82(21308) + str);
            } catch (Exception e) {
                e.printStackTrace();
                this.c.reject(C0201.m82(21309), e.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements com.facebook.react.modules.core.f {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ Callable b;

        public c(PickerModule pickerModule, Promise promise, Callable callable) {
            this.a = promise;
            this.b = callable;
        }

        @Override // com.facebook.react.modules.core.f
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i == 1) {
                for (int i2 : iArr) {
                    if (i2 == -1) {
                        this.a.reject(C0201.m82(21344), C0201.m82(21345));
                        return true;
                    }
                }
                try {
                    this.b.call();
                } catch (Exception e) {
                    this.a.reject(C0201.m82(21346), C0201.m82(21347), e);
                }
            }
            return true;
        }
    }

    class d implements Callable<Void> {
        public final /* synthetic */ Activity a;

        public d(Activity activity) {
            this.a = activity;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.initiateCamera(this.a);
            return null;
        }
    }

    class e implements Callable<Void> {
        public final /* synthetic */ Activity a;

        public e(Activity activity) {
            this.a = activity;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.initiatePicker(this.a);
            return null;
        }
    }

    class f implements Callable<Void> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ Uri b;

        public f(Activity activity, Uri uri) {
            this.a = activity;
            this.b = uri;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.startCropping(this.a, this.b);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements Runnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        class a implements Callback {
            public a() {
            }

            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                String str = (String) objArr[0];
                try {
                    Bitmap validateVideo = PickerModule.this.validateVideo(str);
                    long lastModified = new File(str).lastModified();
                    long longValue = PickerModule.getVideoDuration(str).longValue();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt(C0201.m82(23523), validateVideo.getWidth());
                    writableNativeMap.putInt(C0201.m82(23524), validateVideo.getHeight());
                    writableNativeMap.putString(C0201.m82(23525), g.this.d);
                    writableNativeMap.putInt(C0201.m82(23526), (int) new File(str).length());
                    writableNativeMap.putInt(C0201.m82(23527), (int) longValue);
                    String r0 = C0201.m82(23528);
                    writableNativeMap.putString(r0, C0201.m82(23529) + str);
                    writableNativeMap.putString(C0201.m82(23530), String.valueOf(lastModified));
                    PickerModule.this.resultCollector.d(writableNativeMap);
                } catch (Exception e) {
                    PickerModule.this.resultCollector.c(C0201.m82(23531), e);
                }
            }
        }

        class b implements Callback {
            public b() {
            }

            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                WritableNativeMap writableNativeMap = (WritableNativeMap) objArr[0];
                PickerModule.this.resultCollector.b(writableNativeMap.getString(C0201.m82(23707)), writableNativeMap.getString(C0201.m82(23708)));
            }
        }

        public g(Activity activity, String str, String str2, String str3) {
            this.a = activity;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public void run() {
            PickerModule.this.compression.b(this.a, PickerModule.this.options, this.b, this.c, new PromiseImpl(new a(), new b()));
        }
    }

    static {
        C0201.m83(PickerModule.class, 393);
    }

    public PickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    private void cameraPickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.b(C0201.m82(28344), C0201.m82(28345));
        } else if (i2 == -1) {
            Uri uri = this.mCameraCaptureURI;
            String r5 = C0201.m82(28346);
            if (uri == null) {
                this.resultCollector.b(r5, C0201.m82(28347));
            } else if (this.cropping) {
                new i.a().e(Bitmap.CompressFormat.JPEG);
                startCropping(activity, uri);
            } else {
                try {
                    this.resultCollector.e(1);
                    WritableMap selection = getSelection(activity, uri, true);
                    if (selection != null) {
                        this.resultCollector.d(selection);
                    }
                } catch (Exception e2) {
                    this.resultCollector.b(r5, e2.getMessage());
                }
            }
        }
    }

    private void configureCropperColors(i.a aVar) {
        String str = this.cropperActiveWidgetColor;
        if (str != null) {
            aVar.b(Color.parseColor(str));
        }
        String str2 = this.cropperToolbarColor;
        if (str2 != null) {
            aVar.l(Color.parseColor(str2));
        }
        String str3 = this.cropperStatusBarColor;
        if (str3 != null) {
            aVar.k(Color.parseColor(str3));
        }
        String str4 = this.cropperToolbarWidgetColor;
        if (str4 != null) {
            aVar.n(Color.parseColor(str4));
        }
    }

    private File createImageFile() throws IOException {
        String str = C0201.m82(28348) + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, C0201.m82(28349), externalFilesDir);
        this.mCurrentMediaPath = C0201.m82(28350) + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private File createVideoFile() throws IOException {
        String str = C0201.m82(28351) + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, C0201.m82(28352), externalFilesDir);
        this.mCurrentMediaPath = C0201.m82(28353) + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private void croppingResult(Activity activity, int i, int i2, Intent intent) {
        if (intent != null) {
            Uri b2 = i.b(intent);
            String r11 = C0201.m82(28354);
            if (b2 != null) {
                try {
                    if (this.width > 0 && this.height > 0) {
                        b2 = Uri.fromFile(this.compression.d(this.reactContext, b2.getPath(), this.width, this.height, 100));
                    }
                    WritableMap selection = getSelection(activity, b2, false);
                    if (selection != null) {
                        selection.putMap(C0201.m82(28355), getCroppedRectMap(intent));
                        this.resultCollector.e(1);
                        this.resultCollector.d(selection);
                        return;
                    }
                    throw new Exception(C0201.m82(28356));
                } catch (Exception e2) {
                    this.resultCollector.b(r11, e2.getMessage());
                }
            } else {
                this.resultCollector.b(r11, C0201.m82(28357));
            }
        } else {
            this.resultCollector.b(C0201.m82(28358), C0201.m82(28359));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    private void getAsyncSelection(Activity activity, Uri uri, boolean z) throws Exception {
        String resolveRealPath = resolveRealPath(activity, uri, z);
        if (resolveRealPath == null || resolveRealPath.isEmpty()) {
            this.resultCollector.b(C0201.m82(28361), C0201.m82(28362));
            return;
        }
        String mimeType = getMimeType(resolveRealPath);
        if (mimeType == null || !mimeType.startsWith(C0201.m82(28360))) {
            this.resultCollector.d(getImage(activity, resolveRealPath));
        } else {
            getVideo(activity, resolveRealPath, mimeType);
        }
    }

    private String getBase64StringFromFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
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
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private static WritableMap getCroppedRectMap(Intent intent) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(C0201.m82(28364), intent.getIntExtra(C0201.m82(28363), -1));
        writableNativeMap.putInt(C0201.m82(28366), intent.getIntExtra(C0201.m82(28365), -1));
        writableNativeMap.putInt(C0201.m82(28368), intent.getIntExtra(C0201.m82(28367), -1));
        writableNativeMap.putInt(C0201.m82(28370), intent.getIntExtra(C0201.m82(28369), -1));
        return writableNativeMap;
    }

    private WritableMap getImage(Activity activity, String str) throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str.startsWith(C0201.m82(28371)) || str.startsWith(C0201.m82(28372))) {
            throw new Exception(C0201.m82(28382));
        }
        String path = this.compression.a(this.reactContext, this.options, str, validateImage(str)).getPath();
        BitmapFactory.Options validateImage = validateImage(path);
        long lastModified = new File(str).lastModified();
        writableNativeMap.putString(C0201.m82(28374), C0201.m82(28373) + path);
        writableNativeMap.putInt(C0201.m82(28375), validateImage.outWidth);
        writableNativeMap.putInt(C0201.m82(28376), validateImage.outHeight);
        writableNativeMap.putString(C0201.m82(28377), validateImage.outMimeType);
        writableNativeMap.putInt(C0201.m82(28378), (int) new File(path).length());
        writableNativeMap.putString(C0201.m82(28379), String.valueOf(lastModified));
        if (this.includeBase64) {
            writableNativeMap.putString(C0201.m82(28380), getBase64StringFromFile(path));
        }
        if (this.includeExif) {
            try {
                writableNativeMap.putMap(C0201.m82(28381), b.a(str));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return writableNativeMap;
    }

    private String getMimeType(String str) {
        Uri fromFile = Uri.fromFile(new File(str));
        if (fromFile.getScheme().equals(C0201.m82(28383))) {
            return this.reactContext.getContentResolver().getType(fromFile);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(fromFile.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    private WritableMap getSelection(Activity activity, Uri uri, boolean z) throws Exception {
        String resolveRealPath = resolveRealPath(activity, uri, z);
        if (resolveRealPath == null || resolveRealPath.isEmpty()) {
            throw new Exception(C0201.m82(28385));
        }
        String mimeType = getMimeType(resolveRealPath);
        if (mimeType == null || !mimeType.startsWith(C0201.m82(28384))) {
            return getImage(activity, resolveRealPath);
        }
        getVideo(activity, resolveRealPath, mimeType);
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getTmpDir(Activity activity) {
        String str = activity.getCacheDir() + C0201.m82(28386);
        new File(str).mkdir();
        return str;
    }

    private void getVideo(Activity activity, String str, String str2) throws Exception {
        validateVideo(str);
        new Thread(new g(activity, str, getTmpDir(activity) + C0201.m82(28387) + UUID.randomUUID().toString() + C0201.m82(28388), str2)).run();
    }

    /* access modifiers changed from: private */
    public static Long getVideoDuration(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
    }

    private void imagePickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.b(C0201.m82(28389), C0201.m82(28390));
        } else if (i2 == -1) {
            boolean z = this.multiple;
            String r6 = C0201.m82(28391);
            if (z) {
                ClipData clipData = intent.getClipData();
                if (clipData == null) {
                    try {
                        this.resultCollector.e(1);
                        getAsyncSelection(activity, intent.getData(), false);
                    } catch (Exception e2) {
                        this.resultCollector.b(r6, e2.getMessage());
                    }
                } else {
                    this.resultCollector.e(clipData.getItemCount());
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        getAsyncSelection(activity, clipData.getItemAt(i3).getUri(), false);
                    }
                }
            } else {
                Uri data = intent.getData();
                if (data == null) {
                    this.resultCollector.b(r6, C0201.m82(28392));
                } else if (this.cropping) {
                    startCropping(activity, data);
                } else {
                    try {
                        getAsyncSelection(activity, data, false);
                    } catch (Exception e3) {
                        this.resultCollector.b(r6, e3.getMessage());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void initiateCamera(Activity activity) {
        File file;
        String str;
        try {
            if (this.mediaType.equals(C0201.m82(28393))) {
                str = C0201.m82(28394);
                file = createVideoFile();
            } else {
                str = C0201.m82(28395);
                file = createImageFile();
            }
            Intent intent = new Intent(str);
            if (Build.VERSION.SDK_INT < 21) {
                this.mCameraCaptureURI = Uri.fromFile(file);
            } else {
                this.mCameraCaptureURI = FileProvider.e(activity, activity.getApplicationContext().getPackageName() + C0201.m82(28396), file);
            }
            intent.putExtra(C0201.m82(28397), this.mCameraCaptureURI);
            if (this.useFrontCamera) {
                intent.putExtra(C0201.m82(28398), 1);
                intent.putExtra(C0201.m82(28399), 1);
                intent.putExtra(C0201.m82(28400), true);
            }
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                this.resultCollector.b(C0201.m82(28401), C0201.m82(28402));
            } else {
                activity.startActivityForResult(intent, 61111);
            }
        } catch (Exception e2) {
            this.resultCollector.c(C0201.m82(28403), e2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void initiatePicker(Activity activity) {
        try {
            Intent intent = new Intent(C0201.m82(28404));
            boolean z = this.cropping;
            String r2 = C0201.m82(28405);
            String r3 = C0201.m82(28406);
            if (z || this.mediaType.equals(C0201.m82(28407))) {
                intent.setType(r3);
                if (this.cropping) {
                    intent.putExtra(r2, new String[]{C0201.m82(28411), C0201.m82(28412)});
                }
            } else {
                boolean equals = this.mediaType.equals(C0201.m82(28408));
                String r4 = C0201.m82(28409);
                if (equals) {
                    intent.setType(r4);
                } else {
                    intent.setType(C0201.m82(28410));
                    intent.putExtra(r2, new String[]{r3, r4});
                }
            }
            intent.setFlags(67108864);
            intent.putExtra(C0201.m82(28413), this.multiple);
            intent.addCategory(C0201.m82(28414));
            activity.startActivityForResult(Intent.createChooser(intent, C0201.m82(28415)), 61110);
        } catch (Exception e2) {
            this.resultCollector.c(C0201.m82(28416), e2);
        }
    }

    private boolean isCameraAvailable(Activity activity) {
        return activity.getPackageManager().hasSystemFeature(C0201.m82(28417)) || activity.getPackageManager().hasSystemFeature(C0201.m82(28418));
    }

    private void permissionsCheck(Activity activity, Promise promise, List<String> list, Callable<Void> callable) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (androidx.core.content.b.a(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ((com.facebook.react.modules.core.e) activity).i((String[]) arrayList.toArray(new String[arrayList.size()]), 1, new c(this, promise, callable));
            return;
        }
        try {
            callable.call();
        } catch (Exception e2) {
            promise.reject(C0201.m82(28419), C0201.m82(28420), e2);
        }
    }

    private String resolveRealPath(Activity activity, Uri uri, boolean z) throws IOException {
        if (Build.VERSION.SDK_INT < 21) {
            return d.c(activity, uri);
        }
        if (z) {
            return Uri.parse(this.mCurrentMediaPath).getPath();
        }
        return d.c(activity, uri);
    }

    private void setConfiguration(ReadableMap readableMap) {
        String r0 = C0201.m82(28421);
        this.mediaType = readableMap.hasKey(r0) ? readableMap.getString(r0) : C0201.m82(28422);
        String r02 = C0201.m82(28423);
        boolean z = true;
        this.multiple = readableMap.hasKey(r02) && readableMap.getBoolean(r02);
        String r03 = C0201.m82(28424);
        this.includeBase64 = readableMap.hasKey(r03) && readableMap.getBoolean(r03);
        String r04 = C0201.m82(28425);
        this.includeExif = readableMap.hasKey(r04) && readableMap.getBoolean(r04);
        String r05 = C0201.m82(28426);
        this.width = readableMap.hasKey(r05) ? readableMap.getInt(r05) : 0;
        String r06 = C0201.m82(28427);
        this.height = readableMap.hasKey(r06) ? readableMap.getInt(r06) : 0;
        String r07 = C0201.m82(28428);
        this.cropping = readableMap.hasKey(r07) && readableMap.getBoolean(r07);
        String r08 = C0201.m82(28429);
        String str = null;
        this.cropperActiveWidgetColor = readableMap.hasKey(r08) ? readableMap.getString(r08) : null;
        String r09 = C0201.m82(28430);
        this.cropperStatusBarColor = readableMap.hasKey(r09) ? readableMap.getString(r09) : null;
        String r010 = C0201.m82(28431);
        this.cropperToolbarColor = readableMap.hasKey(r010) ? readableMap.getString(r010) : null;
        String r011 = C0201.m82(28432);
        this.cropperToolbarTitle = readableMap.hasKey(r011) ? readableMap.getString(r011) : null;
        String r012 = C0201.m82(28433);
        if (readableMap.hasKey(r012)) {
            str = readableMap.getString(r012);
        }
        this.cropperToolbarWidgetColor = str;
        String r013 = C0201.m82(28434);
        this.cropperCircleOverlay = readableMap.hasKey(r013) && readableMap.getBoolean(r013);
        String r014 = C0201.m82(28435);
        this.freeStyleCropEnabled = readableMap.hasKey(r014) && readableMap.getBoolean(r014);
        String r015 = C0201.m82(28436);
        this.showCropGuidelines = !readableMap.hasKey(r015) || readableMap.getBoolean(r015);
        String r016 = C0201.m82(28437);
        this.showCropFrame = !readableMap.hasKey(r016) || readableMap.getBoolean(r016);
        String r017 = C0201.m82(28438);
        this.hideBottomControls = readableMap.hasKey(r017) && readableMap.getBoolean(r017);
        String r018 = C0201.m82(28439);
        this.enableRotationGesture = readableMap.hasKey(r018) && readableMap.getBoolean(r018);
        String r019 = C0201.m82(28440);
        this.disableCropperColorSetters = readableMap.hasKey(r019) && readableMap.getBoolean(r019);
        if (!readableMap.hasKey(C0201.m82(28441)) || !readableMap.getBoolean(C0201.m82(28442))) {
            z = false;
        }
        this.useFrontCamera = z;
        this.options = readableMap;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startCropping(Activity activity, Uri uri) {
        int i;
        i.a aVar = new i.a();
        aVar.e(Bitmap.CompressFormat.JPEG);
        aVar.f(100);
        aVar.d(this.cropperCircleOverlay);
        aVar.g(this.freeStyleCropEnabled);
        aVar.j(this.showCropGuidelines);
        aVar.i(this.showCropFrame);
        aVar.h(this.hideBottomControls);
        String str = this.cropperToolbarTitle;
        if (str != null) {
            aVar.m(str);
        }
        if (this.enableRotationGesture) {
            aVar.c(3, 3, 3);
        }
        if (!this.disableCropperColorSetters) {
            configureCropperColors(aVar);
        }
        String tmpDir = getTmpDir(activity);
        i c2 = i.c(uri, Uri.fromFile(new File(tmpDir, UUID.randomUUID().toString() + C0201.m82(28443))));
        c2.g(aVar);
        int i2 = this.width;
        if (i2 > 0 && (i = this.height) > 0) {
            c2.f((float) i2, (float) i);
        }
        c2.d(activity);
    }

    private BitmapFactory.Options validateImage(String str) throws Exception {
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        options2.inPreferredConfig = Bitmap.Config.RGB_565;
        options2.inDither = true;
        BitmapFactory.decodeFile(str, options2);
        if (options2.outMimeType != null && options2.outWidth != 0 && options2.outHeight != 0) {
            return options2;
        }
        throw new Exception(C0201.m82(28444));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Bitmap validateVideo(String str) throws Exception {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new Exception(C0201.m82(28445));
    }

    @ReactMethod
    public void clean(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(C0201.m82(28446), C0201.m82(28447));
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList(C0201.m82(28448)), new a(this, this, currentActivity, promise));
        }
    }

    @ReactMethod
    public void cleanSingle(String str, Promise promise) {
        if (str == null) {
            promise.reject(C0201.m82(28449), C0201.m82(28450));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(C0201.m82(28451), C0201.m82(28452));
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList(C0201.m82(28453)), new b(this, str, this, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(28454);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == 61110) {
            imagePickerResult(activity, i, i2, intent);
        } else if (i == 61111) {
            cameraPickerResult(activity, i, i2, intent);
        } else if (i == 69) {
            croppingResult(activity, i, i2, intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openCamera(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(C0201.m82(28455), C0201.m82(28456));
        } else if (!isCameraAvailable(currentActivity)) {
            promise.reject(C0201.m82(28457), C0201.m82(28458));
        } else {
            setConfiguration(readableMap);
            this.resultCollector.f(promise, false);
            permissionsCheck(currentActivity, promise, Arrays.asList(C0201.m82(28459), C0201.m82(28460)), new d(currentActivity));
        }
    }

    @ReactMethod
    public void openCropper(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(C0201.m82(28461), C0201.m82(28462));
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.f(promise, false);
        permissionsCheck(currentActivity, promise, Collections.singletonList(C0201.m82(28464)), new f(currentActivity, Uri.parse(readableMap.getString(C0201.m82(28463)))));
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(C0201.m82(28465), C0201.m82(28466));
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.f(promise, this.multiple);
        permissionsCheck(currentActivity, promise, Collections.singletonList(C0201.m82(28467)), new e(currentActivity));
    }
}
