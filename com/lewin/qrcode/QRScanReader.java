package com.lewin.qrcode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Hashtable;
import vigqyno.C0201;

public class QRScanReader extends ReactContextBaseJavaModule {
    public QRScanReader(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static t62 decodeBarcodeRGB(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        t62 decodeBarcodeRGB = decodeBarcodeRGB(decodeFile);
        decodeFile.recycle();
        return decodeBarcodeRGB;
    }

    public static t62 decodeBarcodeYUV(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        t62 decodeBarcodeYUV = decodeBarcodeYUV(decodeFile);
        decodeFile.recycle();
        return decodeBarcodeYUV;
    }

    private static void encodeYUV420SP(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (i7 < i) {
                int i8 = (iArr[i5] & 16711680) >> 16;
                int i9 = (iArr[i5] & 65280) >> 8;
                int i10 = iArr[i5] & 255;
                i5++;
                int max = Math.max(0, Math.min((((((i8 * 66) + (i9 * 129)) + (i10 * 25)) + 128) >> 8) + 16, 255));
                int max2 = Math.max(0, Math.min((((((i8 * -38) - (i9 * 74)) + (i10 * 112)) + 128) >> 8) + 128, 255));
                int max3 = Math.max(0, Math.min((((((i8 * 112) - (i9 * 94)) - (i10 * 18)) + 128) >> 8) + 128, 255));
                int i11 = i4 + 1;
                bArr[i4] = (byte) max;
                if (i6 % 2 == 0 && i7 % 2 == 0) {
                    int i12 = i3 + 1;
                    bArr[i3] = (byte) max3;
                    i3 = i12 + 1;
                    bArr[i12] = (byte) max2;
                }
                i7++;
                i4 = i11;
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(32082);
    }

    @ReactMethod
    public void readerQR(String str, Promise promise) {
        t62 scanningImage = scanningImage(str);
        if (scanningImage == null) {
            promise.reject(C0201.m82(32083), C0201.m82(32084));
        } else {
            promise.resolve(scanningImage.f());
        }
    }

    public t62 scanningImage(String str) {
        if (!(str == null || str.length() == 0)) {
            Hashtable hashtable = new Hashtable();
            hashtable.put(j62.CHARACTER_SET, C0201.m82(32085));
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            int i2 = (int) (((float) options.outHeight) / 200.0f);
            if (i2 > 0) {
                i = i2;
            }
            options.inSampleSize = i;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            int width = decodeFile.getWidth();
            int height = decodeFile.getHeight();
            int[] iArr = new int[(width * height)];
            decodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
            try {
                return new qa2().b(new h62(new k72(new q62(decodeFile.getWidth(), decodeFile.getHeight(), iArr))), hashtable);
            } catch (o62 e) {
                e.printStackTrace();
            } catch (i62 e2) {
                e2.printStackTrace();
            } catch (k62 e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    public static t62 decodeBarcodeRGB(Bitmap bitmap) {
        t62 t62;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        try {
            t62 = new qa2().c(new h62(new k72(new q62(width, height, iArr))));
        } catch (o62 e) {
            e.printStackTrace();
        } catch (i62 e2) {
            e2.printStackTrace();
        } catch (k62 e3) {
            e3.printStackTrace();
        }
        bitmap.recycle();
        return t62;
        t62 = null;
        bitmap.recycle();
        return t62;
    }

    public static t62 decodeBarcodeYUV(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[((i * 3) / 2)];
        encodeYUV420SP(bArr, iArr, width, height);
        t62 decodeBarcodeYUV = decodeBarcodeYUV(bArr, width, height);
        bitmap.recycle();
        return decodeBarcodeYUV;
    }

    private static t62 decodeBarcodeYUV(byte[] bArr, int i, int i2) {
        System.currentTimeMillis();
        n62 n62 = new n62();
        t62 t62 = null;
        n62.e(null);
        try {
            t62 = n62.d(new h62(new k72(new p62(bArr, i, i2, 0, 0, i, i2, false))));
        } catch (s62 e) {
            e.printStackTrace();
        } catch (Throwable th) {
            n62.a();
            throw th;
        }
        n62.a();
        System.currentTimeMillis();
        return t62;
    }
}
