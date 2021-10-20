package io.invertase.firebase.storage;

import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnPausedListener;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageException;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StreamDownloadTask;
import com.google.firebase.storage.UploadTask;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class RNFirebaseStorage extends ReactContextBaseJavaModule {
    private static final String CachesDirectoryPath = null;
    private static final String DocumentDirectoryPath = null;
    private static final String ExternalDirectoryPath = null;
    private static final String ExternalStorageDirectoryPath = null;
    private static final String FileTypeDirectory = null;
    private static final String FileTypeRegular = null;
    private static final String PicturesDirectoryPath = null;
    private static final String STORAGE_DOWNLOAD_FAILURE = null;
    private static final String STORAGE_DOWNLOAD_SUCCESS = null;
    private static final String STORAGE_EVENT = null;
    private static final String STORAGE_STATE_CHANGED = null;
    private static final String STORAGE_UPLOAD_FAILURE = null;
    private static final String STORAGE_UPLOAD_SUCCESS = null;
    private static final String TAG = null;
    private static final String TemporaryDirectoryPath = null;

    class a implements ws1<StreamDownloadTask.TaskSnapshot> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Promise c;

        public a(String str, String str2, Promise promise) {
            this.a = str;
            this.b = str2;
            this.c = promise;
        }

        /* renamed from: a */
        public void onSuccess(StreamDownloadTask.TaskSnapshot taskSnapshot) {
            Log.d(C0201.m82(15946), C0201.m82(15945) + taskSnapshot);
            WritableMap downloadTaskAsMap = RNFirebaseStorage.this.getDownloadTaskAsMap(taskSnapshot);
            RNFirebaseStorage.this.sendJSEvent(this.a, C0201.m82(15947), this.b, downloadTaskAsMap);
            this.c.resolve(RNFirebaseStorage.this.getDownloadTaskAsMap(taskSnapshot));
        }
    }

    class b implements OnPausedListener<StreamDownloadTask.TaskSnapshot> {
        public b(RNFirebaseStorage rNFirebaseStorage, String str, String str2) {
        }
    }

    class c implements OnProgressListener<StreamDownloadTask.TaskSnapshot> {
        public c(RNFirebaseStorage rNFirebaseStorage, String str, String str2) {
        }
    }

    class d implements StreamDownloadTask.StreamProcessor {
        public d(RNFirebaseStorage rNFirebaseStorage, String str) {
        }
    }

    class e implements OnPausedListener<UploadTask.TaskSnapshot> {
        public e(RNFirebaseStorage rNFirebaseStorage, String str, String str2) {
        }
    }

    class f implements OnProgressListener<UploadTask.TaskSnapshot> {
        public f(RNFirebaseStorage rNFirebaseStorage, String str, String str2) {
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements ws1<UploadTask.TaskSnapshot> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Promise c;

        /* access modifiers changed from: package-private */
        public class a implements ws1<WritableMap> {
            public a() {
            }

            /* renamed from: a */
            public void onSuccess(WritableMap writableMap) {
                g gVar = g.this;
                RNFirebaseStorage.this.sendJSEvent(gVar.a, C0201.m82(15826), gVar.b, writableMap);
            }
        }

        /* access modifiers changed from: package-private */
        public class b implements ws1<WritableMap> {
            public b() {
            }

            /* renamed from: a */
            public void onSuccess(WritableMap writableMap) {
                g gVar = g.this;
                RNFirebaseStorage.this.sendJSEvent(gVar.a, C0201.m82(15760), gVar.b, writableMap);
            }
        }

        /* access modifiers changed from: package-private */
        public class c implements ws1<WritableMap> {
            public c() {
            }

            /* renamed from: a */
            public void onSuccess(WritableMap writableMap) {
                g.this.c.resolve(writableMap);
            }
        }

        public g(String str, String str2, Promise promise) {
            this.a = str;
            this.b = str2;
            this.c = promise;
        }

        /* renamed from: a */
        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
            Log.d(C0201.m82(15504), C0201.m82(15503) + taskSnapshot);
            RNFirebaseStorage.this.getUploadTaskAsMap(taskSnapshot, new a());
            RNFirebaseStorage.this.getUploadTaskAsMap(taskSnapshot, new b());
            RNFirebaseStorage.this.getUploadTaskAsMap(taskSnapshot, new c());
        }
    }

    class h implements vs1 {
        public final /* synthetic */ Promise a;

        public h(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.e(C0201.m82(15438), C0201.m82(15437) + exc.getMessage());
            RNFirebaseStorage.this.promiseRejectStorageException(this.a, exc);
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements ws1<Uri> {
        public final /* synthetic */ UploadTask.TaskSnapshot a;
        public final /* synthetic */ ws1 b;

        public i(UploadTask.TaskSnapshot taskSnapshot, ws1 ws1) {
            this.a = taskSnapshot;
            this.b = ws1;
        }

        /* renamed from: a */
        public void onSuccess(Uri uri) {
            this.b.onSuccess(RNFirebaseStorage.this.getRespAsMap(this.a, uri.toString()));
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements vs1 {
        public final /* synthetic */ UploadTask.TaskSnapshot a;
        public final /* synthetic */ ws1 b;

        public j(UploadTask.TaskSnapshot taskSnapshot, ws1 ws1) {
            this.a = taskSnapshot;
            this.b = ws1;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            int errorCode = ((StorageException) exc).getErrorCode();
            if (errorCode == -13021 || errorCode == -13010) {
                this.b.onSuccess(RNFirebaseStorage.this.getRespAsMap(this.a, null));
            }
        }
    }

    class k implements vs1 {
        public final /* synthetic */ Promise a;

        public k(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            RNFirebaseStorage.this.promiseRejectStorageException(this.a, exc);
        }
    }

    class l implements ws1<Void> {
        public final /* synthetic */ Promise a;

        public l(RNFirebaseStorage rNFirebaseStorage, Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(Void r2) {
            this.a.resolve(null);
        }
    }

    class m implements vs1 {
        public final /* synthetic */ Promise a;

        public m(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            RNFirebaseStorage.this.promiseRejectStorageException(this.a, exc);
        }
    }

    class n implements ws1<Uri> {
        public final /* synthetic */ Promise a;

        public n(RNFirebaseStorage rNFirebaseStorage, Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(Uri uri) {
            this.a.resolve(uri.toString());
        }
    }

    class o implements vs1 {
        public final /* synthetic */ Promise a;

        public o(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            RNFirebaseStorage.this.promiseRejectStorageException(this.a, exc);
        }
    }

    class p implements ws1<StorageMetadata> {
        public final /* synthetic */ Promise a;

        public p(Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(StorageMetadata storageMetadata) {
            this.a.resolve(RNFirebaseStorage.this.getMetadataAsMap(storageMetadata));
        }
    }

    class q implements vs1 {
        public final /* synthetic */ Promise a;

        public q(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            RNFirebaseStorage.this.promiseRejectStorageException(this.a, exc);
        }
    }

    class r implements ws1<StorageMetadata> {
        public final /* synthetic */ Promise a;

        public r(Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(StorageMetadata storageMetadata) {
            this.a.resolve(RNFirebaseStorage.this.getMetadataAsMap(storageMetadata));
        }
    }

    class s implements vs1 {
        public final /* synthetic */ Promise a;

        public s(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.e(C0201.m82(14521), C0201.m82(14520) + exc.getMessage());
            RNFirebaseStorage.this.promiseRejectStorageException(this.a, exc);
        }
    }

    static {
        C0201.m83(RNFirebaseStorage.class, 447);
    }

    public RNFirebaseStorage(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(C0201.m82(21531), C0201.m82(21532));
    }

    private StorageMetadata buildMetadataFromMap(ReadableMap readableMap, Uri uri) {
        String str;
        String r0 = C0201.m82(21533);
        StorageMetadata.Builder builder = new StorageMetadata.Builder();
        try {
            Map<String, Object> j2 = io.invertase.firebase.c.j(readableMap);
            Map map = (Map) j2.get(C0201.m82(21534));
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    builder.setCustomMetadata((String) entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            builder.setCacheControl((String) j2.get(C0201.m82(21535)));
            builder.setContentDisposition((String) j2.get(C0201.m82(21536)));
            builder.setContentEncoding((String) j2.get(C0201.m82(21537)));
            builder.setContentLanguage((String) j2.get(C0201.m82(21538)));
            if (readableMap.hasKey(r0)) {
                builder.setContentType((String) j2.get(r0));
            } else if (uri != null) {
                if (uri.getScheme().equals(C0201.m82(21539))) {
                    str = getReactApplicationContext().getContentResolver().getType(uri);
                } else {
                    str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
                }
                if (str != null) {
                    builder.setContentType(str);
                }
            }
        } catch (Exception e2) {
            Log.e(C0201.m82(21541), C0201.m82(21540) + e2.getMessage());
        }
        return builder.build();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WritableMap getDownloadTaskAsMap(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(21542), (double) taskSnapshot.getBytesTransferred());
        createMap.putString(C0201.m82(21543), taskSnapshot.getStorage().getPath());
        createMap.putString(C0201.m82(21544), getTaskStatus(taskSnapshot.getTask()));
        createMap.putDouble(C0201.m82(21545), (double) taskSnapshot.getTotalByteCount());
        return createMap;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WritableMap getMetadataAsMap(StorageMetadata storageMetadata) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(21546), storageMetadata.getBucket());
        createMap.putString(C0201.m82(21547), storageMetadata.getGeneration());
        createMap.putString(C0201.m82(21548), storageMetadata.getMetadataGeneration());
        createMap.putString(C0201.m82(21549), storageMetadata.getPath());
        createMap.putString(C0201.m82(21550), storageMetadata.getName());
        createMap.putDouble(C0201.m82(21551), (double) storageMetadata.getSizeBytes());
        createMap.putDouble(C0201.m82(21552), (double) storageMetadata.getCreationTimeMillis());
        createMap.putDouble(C0201.m82(21553), (double) storageMetadata.getUpdatedTimeMillis());
        createMap.putString(C0201.m82(21554), storageMetadata.getMd5Hash());
        createMap.putString(C0201.m82(21555), storageMetadata.getCacheControl());
        createMap.putString(C0201.m82(21556), storageMetadata.getContentDisposition());
        createMap.putString(C0201.m82(21557), storageMetadata.getContentEncoding());
        createMap.putString(C0201.m82(21558), storageMetadata.getContentLanguage());
        createMap.putString(C0201.m82(21559), storageMetadata.getContentType());
        WritableMap createMap2 = Arguments.createMap();
        for (String str : storageMetadata.getCustomMetadataKeys()) {
            createMap2.putString(str, storageMetadata.getCustomMetadata(str));
        }
        createMap.putMap(C0201.m82(21560), createMap2);
        return createMap;
    }

    private StorageReference getReference(String str, String str2) {
        FirebaseStorage instance = FirebaseStorage.getInstance(l12.l(str2));
        if (str.startsWith(C0201.m82(21561))) {
            return instance.getReferenceFromUrl(str.substring(5));
        }
        return instance.getReference(str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WritableMap getRespAsMap(UploadTask.TaskSnapshot taskSnapshot, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(21562), (double) taskSnapshot.getBytesTransferred());
        createMap.putString(C0201.m82(21563), str);
        StorageMetadata metadata = taskSnapshot.getMetadata();
        if (metadata != null) {
            createMap.putMap(C0201.m82(21564), getMetadataAsMap(metadata));
        }
        createMap.putString(C0201.m82(21565), taskSnapshot.getStorage().getPath());
        createMap.putString(C0201.m82(21566), getTaskStatus(taskSnapshot.getTask()));
        createMap.putDouble(C0201.m82(21567), (double) taskSnapshot.getTotalByteCount());
        return createMap;
    }

    private String getTaskStatus(StorageTask<?> storageTask) {
        if (storageTask.isInProgress()) {
            return C0201.m82(21568);
        }
        if (storageTask.isPaused()) {
            return C0201.m82(21569);
        }
        if (storageTask.isSuccessful() || storageTask.isComplete()) {
            return C0201.m82(21573);
        }
        if (storageTask.isCanceled()) {
            return C0201.m82(21570);
        }
        return storageTask.getException() != null ? C0201.m82(21571) : C0201.m82(21572);
    }

    private Uri getURI(String str) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null || parse.getScheme().isEmpty()) {
            return Uri.fromFile(new File(str));
        }
        return parse;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void getUploadTaskAsMap(UploadTask.TaskSnapshot taskSnapshot, ws1<WritableMap> ws1) {
        if (taskSnapshot != null) {
            zs1 downloadUrl = taskSnapshot.getStorage().getDownloadUrl();
            downloadUrl.d(new j(taskSnapshot, ws1));
            downloadUrl.f(new i(taskSnapshot, ws1));
            return;
        }
        ws1.onSuccess(Arguments.createMap());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void promiseRejectStorageException(Promise promise, Exception exc) {
        String r0 = C0201.m82(21574);
        String message = exc.getMessage();
        try {
            boolean z = exc instanceof StorageException;
            String r3 = C0201.m82(21575);
            if (z) {
                int errorCode = ((StorageException) exc).getErrorCode();
                if (errorCode == -13040) {
                    r0 = C0201.m82(21592);
                    message = C0201.m82(21593);
                } else if (errorCode == -13000) {
                    message = r3;
                } else if (errorCode == -13031) {
                    r0 = C0201.m82(21590);
                    message = C0201.m82(21591);
                } else if (errorCode == -13030) {
                    r0 = C0201.m82(21588);
                    message = C0201.m82(21589);
                } else if (errorCode == -13021) {
                    r0 = C0201.m82(21586);
                    message = C0201.m82(21587);
                } else if (errorCode != -13020) {
                    switch (errorCode) {
                        case -13013:
                            r0 = C0201.m82(21582);
                            message = C0201.m82(21583);
                            break;
                        case -13012:
                            r0 = C0201.m82(21580);
                            message = C0201.m82(21581);
                            break;
                        case -13011:
                            r0 = C0201.m82(21578);
                            message = C0201.m82(21579);
                            break;
                        case -13010:
                            r0 = C0201.m82(21576);
                            message = C0201.m82(21577);
                            break;
                    }
                } else {
                    r0 = C0201.m82(21584);
                    message = C0201.m82(21585);
                }
                r3 = message;
            }
        } finally {
            promise.reject(r0, message, exc);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void sendJSEvent(String str, String str2, String str3, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap(C0201.m82(21594), writableMap);
        createMap.putString(C0201.m82(21595), str3);
        createMap.putString(C0201.m82(21596), str2);
        createMap.putString(C0201.m82(21597), str);
        io.invertase.firebase.c.k(getReactApplicationContext(), C0201.m82(21598), createMap);
    }

    @ReactMethod
    public void delete(String str, String str2, Promise promise) {
        zs1 delete = getReference(str2, str).delete();
        delete.f(new l(this, promise));
        delete.d(new k(promise));
    }

    @ReactMethod
    public void downloadFile(String str, String str2, String str3, Promise promise) {
        if (!isExternalStorageWritable()) {
            promise.reject(C0201.m82(21599), C0201.m82(21600));
            return;
        }
        Log.d(C0201.m82(21602), C0201.m82(21601) + str2);
        getReference(str2, str).getStream(new d(this, str3)).addOnProgressListener(new c(this, str, str2)).addOnPausedListener(new b(this, str, str2)).addOnSuccessListener(new a(str, str2, promise)).addOnFailureListener(new s(promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(21603), getReactApplicationContext().getFilesDir().getAbsolutePath());
        hashMap.put(C0201.m82(21604), getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(C0201.m82(21605), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(C0201.m82(21606), getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(C0201.m82(21607), 0);
        hashMap.put(C0201.m82(21608), 1);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        String r2 = C0201.m82(21609);
        if (externalStorageDirectory != null) {
            hashMap.put(r2, externalStorageDirectory.getAbsolutePath());
        } else {
            hashMap.put(r2, null);
        }
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir(null);
        String r22 = C0201.m82(21610);
        if (externalFilesDir != null) {
            hashMap.put(r22, externalFilesDir.getAbsolutePath());
        } else {
            hashMap.put(r22, null);
        }
        return hashMap;
    }

    @ReactMethod
    public void getDownloadURL(String str, String str2, Promise promise) {
        Log.d(C0201.m82(21612), C0201.m82(21611) + str2);
        zs1 downloadUrl = getReference(str2, str).getDownloadUrl();
        downloadUrl.f(new n(this, promise));
        downloadUrl.d(new m(promise));
    }

    @ReactMethod
    public void getMetadata(String str, String str2, Promise promise) {
        zs1 metadata = getReference(str2, str).getMetadata();
        metadata.f(new p(promise));
        metadata.d(new o(promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(21613);
    }

    public boolean isExternalStorageWritable() {
        boolean z;
        boolean z2;
        String externalStorageState = Environment.getExternalStorageState();
        if (C0201.m82(21614).equals(externalStorageState)) {
            z2 = true;
            z = true;
        } else {
            z2 = C0201.m82(21615).equals(externalStorageState);
            z = false;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    @ReactMethod
    public void putFile(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        StorageReference reference = getReference(str2, str);
        Log.i(C0201.m82(21618), C0201.m82(21616) + str3 + C0201.m82(21617) + str2);
        try {
            Uri uri = getURI(str3);
            reference.putFile(uri, buildMetadataFromMap(readableMap, uri)).addOnFailureListener(new h(promise)).addOnSuccessListener(new g(str, str2, promise)).addOnProgressListener(new f(this, str, str2)).addOnPausedListener(new e(this, str, str2));
        } catch (Exception e2) {
            promiseRejectStorageException(promise, e2);
        }
    }

    @ReactMethod
    public void setMaxDownloadRetryTime(String str, double d2) {
        FirebaseStorage.getInstance(l12.l(str)).setMaxDownloadRetryTimeMillis((long) d2);
    }

    @ReactMethod
    public void setMaxOperationRetryTime(String str, double d2) {
        FirebaseStorage.getInstance(l12.l(str)).setMaxOperationRetryTimeMillis((long) d2);
    }

    @ReactMethod
    public void setMaxUploadRetryTime(String str, double d2) {
        FirebaseStorage.getInstance(l12.l(str)).setMaxUploadRetryTimeMillis((long) d2);
    }

    @ReactMethod
    public void updateMetadata(String str, String str2, ReadableMap readableMap, Promise promise) {
        zs1 updateMetadata = getReference(str2, str).updateMetadata(buildMetadataFromMap(readableMap, null));
        updateMetadata.f(new r(promise));
        updateMetadata.d(new q(promise));
    }
}
