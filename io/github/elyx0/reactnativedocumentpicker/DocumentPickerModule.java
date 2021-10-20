package io.github.elyx0.reactnativedocumentpicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

public class DocumentPickerModule extends ReactContextBaseJavaModule {
    private static final String E_ACTIVITY_DOES_NOT_EXIST = null;
    private static final String E_DOCUMENT_PICKER_CANCELED = null;
    private static final String E_FAILED_TO_SHOW_PICKER = null;
    private static final String E_INVALID_DATA_RETURNED = null;
    private static final String E_UNABLE_TO_OPEN_FILE_TYPE = null;
    private static final String E_UNEXPECTED_EXCEPTION = null;
    private static final String E_UNKNOWN_ACTIVITY_RESULT = null;
    private static final String FIELD_FILE_COPY_URI = null;
    private static final String FIELD_NAME = null;
    private static final String FIELD_SIZE = null;
    private static final String FIELD_TYPE = null;
    private static final String FIELD_URI = null;
    private static final String NAME = null;
    private static final String OPTION_MULIPLE = null;
    private static final String OPTION_TYPE = null;
    private static final int READ_REQUEST_CODE = 0;
    private final ActivityEventListener activityEventListener;
    private Promise promise;

    class a extends BaseActivityEventListener {
        public a() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            if (i == 41 && DocumentPickerModule.this.promise != null) {
                DocumentPickerModule documentPickerModule = DocumentPickerModule.this;
                documentPickerModule.onShowActivityResult(i2, intent, documentPickerModule.promise);
                DocumentPickerModule.this.promise = null;
            }
        }
    }

    static {
        C0201.m83(DocumentPickerModule.class, 192);
    }

    public DocumentPickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        a aVar = new a();
        this.activityEventListener = aVar;
        reactApplicationContext.addActivityEventListener(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
        if (r12 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        r0.addSuppressed(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b2, code lost:
        throw r1;
     */
    private WritableMap getMetadata(Uri uri) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(24581), uri.toString());
        createMap.putString(C0201.m82(24582), uri.toString());
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        String type = contentResolver.getType(uri);
        String r9 = C0201.m82(24583);
        createMap.putString(r9, type);
        Cursor query = contentResolver.query(uri, null, null, null, null, null);
        if (query != null) {
            if (query.moveToFirst()) {
                int columnIndex = query.getColumnIndex(C0201.m82(24584));
                if (!query.isNull(columnIndex)) {
                    createMap.putString(C0201.m82(24585), query.getString(columnIndex));
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    int columnIndex2 = query.getColumnIndex(C0201.m82(24586));
                    if (!query.isNull(columnIndex2)) {
                        createMap.putString(r9, query.getString(columnIndex2));
                    }
                }
                int columnIndex3 = query.getColumnIndex(C0201.m82(24587));
                if (!query.isNull(columnIndex3)) {
                    createMap.putInt(C0201.m82(24588), query.getInt(columnIndex3));
                }
            }
        }
        if (query != null) {
            query.close();
        }
        return createMap;
    }

    private String[] readableArrayToStringArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = readableArray.getString(i);
        }
        return strArr;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(24589);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
    }

    public void onShowActivityResult(int i, Intent intent, Promise promise2) {
        ClipData clipData;
        if (i == 0) {
            promise2.reject(C0201.m82(24590), C0201.m82(24591));
        } else if (i == -1) {
            Uri uri = null;
            if (intent != null) {
                uri = intent.getData();
                clipData = intent.getClipData();
            } else {
                clipData = null;
            }
            try {
                WritableArray createArray = Arguments.createArray();
                if (uri != null) {
                    createArray.pushMap(getMetadata(uri));
                } else if (clipData == null || clipData.getItemCount() <= 0) {
                    promise2.reject(C0201.m82(24592), C0201.m82(24593));
                    return;
                } else {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        createArray.pushMap(getMetadata(clipData.getItemAt(i2).getUri()));
                    }
                }
                promise2.resolve(createArray);
            } catch (Exception e) {
                promise2.reject(C0201.m82(24594), e.getLocalizedMessage(), e);
            }
        } else {
            promise2.reject(C0201.m82(24596), C0201.m82(24595) + i);
        }
    }

    @ReactMethod
    public void pick(ReadableMap readableMap, Promise promise2) {
        String r0 = C0201.m82(24597);
        String r1 = C0201.m82(24598);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise2.reject(C0201.m82(24599), C0201.m82(24600));
            return;
        }
        this.promise = promise2;
        try {
            Intent intent = new Intent(C0201.m82(24601));
            intent.addCategory(C0201.m82(24602));
            intent.setType(C0201.m82(24603));
            boolean z = false;
            if (!readableMap.isNull(r1)) {
                ReadableArray array = readableMap.getArray(r1);
                if (array == null || array.size() <= 1) {
                    if (array.size() == 1) {
                        intent.setType(array.getString(0));
                    }
                } else if (Build.VERSION.SDK_INT >= 19) {
                    intent.putExtra(C0201.m82(24604), readableArrayToStringArray(array));
                } else {
                    Log.e(C0201.m82(24605), C0201.m82(24606));
                }
            }
            if (!readableMap.isNull(r0) && readableMap.getBoolean(r0)) {
                z = true;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                intent.putExtra(C0201.m82(24607), z);
            }
            if (Build.VERSION.SDK_INT < 19) {
                intent = Intent.createChooser(intent, null);
            }
            currentActivity.startActivityForResult(intent, 41, Bundle.EMPTY);
        } catch (ActivityNotFoundException e) {
            this.promise.reject(C0201.m82(24609), e.getLocalizedMessage());
            this.promise = null;
        } catch (Exception e2) {
            e2.printStackTrace();
            this.promise.reject(C0201.m82(24608), e2.getLocalizedMessage());
            this.promise = null;
        }
    }
}
