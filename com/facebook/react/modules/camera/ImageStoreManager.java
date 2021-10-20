package com.facebook.react.modules.camera;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

@pj0(name = "ImageStoreManager")
public class ImageStoreManager extends NativeImageStoreSpec {
    private static final int BUFFER_SIZE = 0;
    public static final String NAME = null;

    private class b extends GuardedAsyncTask<Void, Void> {
        private final String a;
        private final Callback b;
        private final Callback c;

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                InputStream openInputStream = ImageStoreManager.this.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.a));
                try {
                    this.b.invoke(ImageStoreManager.this.convertInputStreamToBase64OutputStream(openInputStream));
                } catch (IOException e) {
                    this.c.invoke(e.getMessage());
                } catch (Throwable th) {
                    ImageStoreManager.closeQuietly(openInputStream);
                    throw th;
                }
                ImageStoreManager.closeQuietly(openInputStream);
            } catch (FileNotFoundException e2) {
                this.c.invoke(e2.getMessage());
            }
        }

        private b(ReactContext reactContext, String str, Callback callback, Callback callback2) {
            super(reactContext);
            this.a = str;
            this.b = callback;
            this.c = callback2;
        }
    }

    static {
        C0201.m83(ImageStoreManager.class, 497);
    }

    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreSpec
    public void addImageFromBase64(String str, Callback callback, Callback callback2) {
    }

    /* JADX INFO: finally extract failed */
    public String convertInputStreamToBase64OutputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    closeQuietly(base64OutputStream);
                    return byteArrayOutputStream.toString();
                }
            } catch (Throwable th) {
                closeQuietly(base64OutputStream);
                throw th;
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreSpec
    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        new b(getReactApplicationContext(), str, callback, callback2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(9774);
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreSpec
    public void hasImageForTag(String str, Callback callback) {
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreSpec
    public void removeImageForTag(String str) {
    }
}
