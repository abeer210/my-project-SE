package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import org.reactnative.facedetector.a;
import org.reactnative.facedetector.b;
import vigqyno.C0201;

/* renamed from: zz2  reason: default package */
/* compiled from: FileFaceDetectionAsyncTask */
public class zz2 extends AsyncTask<Void, Void, SparseArray<nu1>> {
    private String a;
    private String b;
    private Promise c;
    private int d = 0;
    private int e = 0;
    private Context f;
    private ReadableMap g;
    private int h = 0;
    private b i;

    public zz2(Context context, ReadableMap readableMap, Promise promise) {
        this.a = readableMap.getString(C0201.m82(36239));
        this.c = promise;
        this.g = readableMap;
        this.f = context;
    }

    private static b a(ReadableMap readableMap, Context context) {
        b bVar = new b(context);
        bVar.i(false);
        String r3 = C0201.m82(36240);
        if (readableMap.hasKey(r3)) {
            bVar.h(readableMap.getInt(r3));
        }
        String r32 = C0201.m82(36241);
        if (readableMap.hasKey(r32)) {
            bVar.f(readableMap.getInt(r32));
        }
        String r33 = C0201.m82(36242);
        if (readableMap.hasKey(r33)) {
            bVar.g(readableMap.getInt(r33));
        }
        return bVar;
    }

    /* renamed from: b */
    public SparseArray<nu1> doInBackground(Void... voidArr) {
        if (isCancelled()) {
            return null;
        }
        this.i = a(this.g, this.f);
        Bitmap decodeFile = BitmapFactory.decodeFile(this.b);
        this.d = decodeFile.getWidth();
        this.e = decodeFile.getHeight();
        try {
            this.h = new k4(this.b).k(C0201.m82(36243), 0);
        } catch (IOException e2) {
            Log.e(C0201.m82(36246), C0201.m82(36244) + this.b + C0201.m82(36245), e2);
        }
        return this.i.b(b03.a(decodeFile));
    }

    /* renamed from: c */
    public void onPostExecute(SparseArray<nu1> sparseArray) {
        super.onPostExecute(sparseArray);
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            WritableMap f2 = a.f(sparseArray.valueAt(i2));
            String r4 = C0201.m82(36247);
            f2.putDouble(r4, ((-f2.getDouble(r4)) + 360.0d) % 360.0d);
            String r42 = C0201.m82(36248);
            f2.putDouble(r42, ((-f2.getDouble(r42)) + 360.0d) % 360.0d);
            createArray.pushMap(f2);
        }
        createMap.putArray(C0201.m82(36249), createArray);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt(C0201.m82(36250), this.d);
        createMap2.putInt(C0201.m82(36251), this.e);
        createMap2.putInt(C0201.m82(36252), this.h);
        createMap2.putString(C0201.m82(36253), this.a);
        createMap.putMap(C0201.m82(36254), createMap2);
        this.i.d();
        this.c.resolve(createMap);
    }

    public void onPreExecute() {
        String str = this.a;
        String r1 = C0201.m82(36255);
        if (str == null) {
            this.c.reject(r1, C0201.m82(36256));
            cancel(true);
            return;
        }
        String path = Uri.parse(str).getPath();
        this.b = path;
        String r3 = C0201.m82(36257);
        if (path == null) {
            Promise promise = this.c;
            promise.reject(r1, C0201.m82(36258) + this.a + r3);
            cancel(true);
            return;
        }
        if (!(path.startsWith(this.f.getCacheDir().getPath()) || this.b.startsWith(this.f.getFilesDir().getPath()))) {
            this.c.reject(r1, C0201.m82(36259));
            cancel(true);
        } else if (!new File(this.b).exists()) {
            Promise promise2 = this.c;
            promise2.reject(r1, C0201.m82(36260) + this.b + r3);
            cancel(true);
        }
    }
}
