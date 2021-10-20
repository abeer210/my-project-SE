package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.core.content.b;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import vigqyno.C0201;

@pj0(name = "RNCWebView")
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 0;
    public static final String MODULE_NAME = null;
    private static final int PICKER = 0;
    private static final int PICKER_LEGACY = 0;
    public final String DEFAULT_MIME_TYPES = C0201.m82(24086);
    private DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private Uri outputFileUri;
    private f webviewFileDownloaderPermissionListener = new a();

    class a implements f {
        public a() {
        }

        @Override // com.facebook.react.modules.core.f
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(RNCWebViewModule.this.getCurrentActivity().getApplicationContext(), C0201.m82(35183), 1).show();
            } else if (RNCWebViewModule.this.downloadRequest != null) {
                RNCWebViewModule.this.downloadFile();
            }
            return true;
        }
    }

    static {
        C0201.m83(RNCWebViewModule.class, 349);
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches(C0201.m82(24087))) {
            str = getMimeTypeFromExtension(str.replace(C0201.m82(24088), C0201.m82(24089)));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(C0201.m82(24090)));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches(C0201.m82(24092))) {
            str = getMimeTypeFromExtension(str.replace(C0201.m82(24093), C0201.m82(24094)));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(C0201.m82(24095)));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{C0201.m82(24097)};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches(C0201.m82(24098))) {
                strArr2[i] = getMimeTypeFromExtension(str.replace(C0201.m82(24099), C0201.m82(24100)));
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0072  */
    private File getCapturedFile(String str) throws IOException {
        String str2;
        String str3;
        String str4;
        String r7;
        boolean equals = str.equals(C0201.m82(24101));
        String r1 = C0201.m82(24102);
        if (equals) {
            str4 = Environment.DIRECTORY_PICTURES;
            r7 = C0201.m82(24103);
            str3 = C0201.m82(24104);
        } else if (str.equals(C0201.m82(24105))) {
            str4 = Environment.DIRECTORY_MOVIES;
            r7 = C0201.m82(24106);
            str3 = C0201.m82(24107);
        } else {
            str2 = r1;
            str3 = str2;
            String str5 = r1 + String.valueOf(System.currentTimeMillis()) + str3;
            if (Build.VERSION.SDK_INT >= 23) {
                return new File(Environment.getExternalStoragePublicDirectory(str2), str5);
            }
            return File.createTempFile(str5, str3, getReactApplicationContext().getExternalFilesDir(null));
        }
        r1 = r7;
        str2 = str4;
        String str52 = r1 + String.valueOf(System.currentTimeMillis()) + str3;
        if (Build.VERSION.SDK_INT >= 23) {
        }
    }

    private Intent getFileChooserIntent(String str) {
        String r0 = str.isEmpty() ? C0201.m82(24108) : str;
        if (str.matches(C0201.m82(24109))) {
            r0 = getMimeTypeFromExtension(str.replace(C0201.m82(24110), C0201.m82(24111)));
        }
        Intent intent = new Intent(C0201.m82(24112));
        intent.addCategory(C0201.m82(24113));
        intent.setType(r0);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File file;
        try {
            file = getCapturedFile(str);
        } catch (IOException e) {
            Log.e(C0201.m82(24119), C0201.m82(24120), e);
            e.printStackTrace();
            file = null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return FileProvider.e(reactApplicationContext, packageName + C0201.m82(24121), file);
    }

    private e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException(C0201.m82(24123));
        } else if (currentActivity instanceof e) {
            return (e) currentActivity;
        } else {
            throw new IllegalStateException(C0201.m82(24122));
        }
    }

    private Intent getPhotoIntent() {
        String r1 = C0201.m82(24124);
        Intent intent = new Intent(r1);
        Uri outputUri = getOutputUri(r1);
        this.outputFileUri = outputUri;
        intent.putExtra(C0201.m82(24125), outputUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        Uri[] uriArr = null;
        if (intent == null) {
            return null;
        }
        if (intent.getData() == null) {
            if (intent.getClipData() != null) {
                int itemCount = intent.getClipData().getItemCount();
                uriArr = new Uri[itemCount];
                for (int i2 = 0; i2 < itemCount; i2++) {
                    uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
                }
            }
            return uriArr;
        } else if (i != -1 || Build.VERSION.SDK_INT < 21) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
    }

    private Intent getVideoIntent() {
        String r1 = C0201.m82(24126);
        Intent intent = new Intent(r1);
        Uri outputUri = getOutputUri(r1);
        this.outputFileUri = outputUri;
        intent.putExtra(C0201.m82(24127), outputUri);
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void downloadFile() {
        ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService(C0201.m82(24128))).enqueue(this.downloadRequest);
        Toast.makeText(getCurrentActivity().getApplicationContext(), C0201.m82(24129), 1).show();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(24130);
    }

    public boolean grantFileDownloaderPermissions() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        Activity currentActivity = getCurrentActivity();
        String r2 = C0201.m82(24131);
        boolean z = b.a(currentActivity, r2) == 0;
        if (!z) {
            getPermissionAwareActivity().i(new String[]{r2}, 1, this.webviewFileDownloaderPermissionListener);
        }
        return z;
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        Boolean bool = Boolean.FALSE;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            bool = Boolean.TRUE;
        }
        if (i >= 16 && i <= 18) {
            bool = Boolean.TRUE;
        }
        promise.resolve(bool);
    }

    public boolean needsCameraPermission() {
        String r0 = C0201.m82(24132);
        try {
            if (!Arrays.asList(getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096).requestedPermissions).contains(r0) || b.a(getCurrentActivity(), r0) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Uri uri;
        if (this.filePathCallback != null || this.filePathCallbackLegacy != null) {
            if (i != 1) {
                if (i == 3) {
                    if (i2 != -1) {
                        uri = null;
                    } else {
                        uri = intent == null ? this.outputFileUri : intent.getData();
                    }
                    this.filePathCallbackLegacy.onReceiveValue(uri);
                }
            } else if (i2 != -1) {
                ValueCallback<Uri[]> valueCallback = this.filePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                Uri[] selectedFiles = getSelectedFiles(intent, i2);
                if (selectedFiles != null) {
                    this.filePathCallback.onReceiveValue(selectedFiles);
                } else {
                    this.filePathCallback.onReceiveValue(new Uri[]{this.outputFileUri});
                }
            }
            this.filePathCallback = null;
            this.filePathCallbackLegacy = null;
            this.outputFileUri = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), C0201.m82(24133));
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue()) {
            arrayList.add(getPhotoIntent());
        }
        if (acceptsVideo(str).booleanValue()) {
            arrayList.add(getVideoIntent());
        }
        createChooser.putExtra(C0201.m82(24134), (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        } else {
            Log.w(C0201.m82(24135), C0201.m82(24136));
        }
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(isArrayEmpty(acceptedMimeType).booleanValue() || arrayContainsString(acceptedMimeType, C0201.m82(24091)).booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(isArrayEmpty(acceptedMimeType).booleanValue() || arrayContainsString(acceptedMimeType, C0201.m82(24096)).booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent(C0201.m82(24114));
        intent.addCategory(C0201.m82(24115));
        intent.setType(C0201.m82(24116));
        intent.putExtra(C0201.m82(24117), getAcceptedMimeType(strArr));
        intent.putExtra(C0201.m82(24118), z);
        return intent;
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, Intent intent, String[] strArr, boolean z) {
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue()) {
                arrayList.add(getPhotoIntent());
            }
            if (acceptsVideo(strArr).booleanValue()) {
                arrayList.add(getVideoIntent());
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent2 = new Intent(C0201.m82(24137));
        intent2.putExtra(C0201.m82(24138), fileChooserIntent);
        intent2.putExtra(C0201.m82(24139), (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent2.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent2, 1);
        } else {
            Log.w(C0201.m82(24140), C0201.m82(24141));
        }
        return true;
    }
}
