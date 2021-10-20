package defpackage;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import defpackage.jv1;
import org.reactnative.facedetector.a;
import vigqyno.C0201;

/* renamed from: tz2  reason: default package */
/* compiled from: TextRecognizerAsyncTask */
public class tz2 extends AsyncTask<Void, Void, SparseArray<iv1>> {
    private uz2 a;
    private k0 b;
    private jv1 c;
    private byte[] d;
    private int e;
    private int f;
    private int g;
    private vz2 h;
    private double i;
    private double j;
    private int k;
    private int l;

    public tz2(uz2 uz2, k0 k0Var, byte[] bArr, int i2, int i3, int i4, float f2, int i5, int i6, int i7, int i8, int i9) {
        this.a = uz2;
        this.b = k0Var;
        this.d = bArr;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        vz2 vz2 = new vz2(i2, i3, i4, i5);
        this.h = vz2;
        double d2 = (double) i6;
        double d3 = (double) (((float) vz2.d()) * f2);
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.i = d2 / d3;
        double d4 = (double) i7;
        double b2 = (double) (((float) this.h.b()) * f2);
        Double.isNaN(d4);
        Double.isNaN(b2);
        this.j = d4 / b2;
        this.k = i8;
        this.l = i9;
    }

    private WritableMap c(WritableMap writableMap) {
        String r0 = C0201.m82(1496);
        ReadableMap map = writableMap.getMap(r0);
        String r2 = C0201.m82(1497);
        WritableMap d2 = a.d(a.c(map.getMap(r2), this.h.d(), this.i), -map.getMap(C0201.m82(1498)).getDouble(C0201.m82(1499)));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap(r2, d2);
        writableMap.putMap(r0, createMap);
        String r02 = C0201.m82(1500);
        ReadableArray array = writableMap.getArray(r02);
        WritableArray createArray = Arguments.createArray();
        for (int i2 = 0; i2 < array.size(); i2++) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.merge(array.getMap(i2));
            c(createMap2);
            createArray.pushMap(createMap2);
        }
        writableMap.putArray(r02, createArray);
        return writableMap;
    }

    private WritableMap d(hv1 hv1) {
        String str;
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (hv1 hv12 : hv1.getComponents()) {
            createArray.pushMap(d(hv12));
        }
        createMap.putArray(C0201.m82(1501), createArray);
        createMap.putString(C0201.m82(1502), hv1.getValue());
        int i2 = hv1.a().left;
        int i3 = hv1.a().top;
        if (hv1.a().left < this.e / 2) {
            i2 += this.k / 2;
        } else if (hv1.a().left > this.e / 2) {
            i2 -= this.k / 2;
        }
        if (hv1.a().height() < this.f / 2) {
            i3 += this.l / 2;
        } else if (hv1.a().height() > this.f / 2) {
            i3 -= this.l / 2;
        }
        WritableMap createMap2 = Arguments.createMap();
        double d2 = (double) i2;
        double d3 = this.i;
        Double.isNaN(d2);
        createMap2.putDouble(C0201.m82(1503), d2 * d3);
        double d4 = (double) i3;
        double d5 = this.j;
        Double.isNaN(d4);
        createMap2.putDouble(C0201.m82(1504), d4 * d5);
        WritableMap createMap3 = Arguments.createMap();
        double width = (double) hv1.a().width();
        double d6 = this.i;
        Double.isNaN(width);
        createMap3.putDouble(C0201.m82(1505), width * d6);
        double height = (double) hv1.a().height();
        double d7 = this.j;
        Double.isNaN(height);
        createMap3.putDouble(C0201.m82(1506), height * d7);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putMap(C0201.m82(1507), createMap2);
        createMap4.putMap(C0201.m82(1508), createMap3);
        createMap.putMap(C0201.m82(1509), createMap4);
        if (hv1 instanceof iv1) {
            str = C0201.m82(1510);
        } else {
            str = hv1 instanceof gv1 ? C0201.m82(1511) : C0201.m82(1512);
        }
        createMap.putString(C0201.m82(1513), str);
        return createMap;
    }

    /* renamed from: a */
    public SparseArray<iv1> doInBackground(Void... voidArr) {
        if (isCancelled() || this.a == null) {
            return null;
        }
        this.c = new jv1.a(this.b).a();
        return this.c.b(b03.b(this.d, this.e, this.f, this.g).b());
    }

    /* renamed from: b */
    public void onPostExecute(SparseArray<iv1> sparseArray) {
        super.onPostExecute(sparseArray);
        jv1 jv1 = this.c;
        if (jv1 != null) {
            jv1.a();
        }
        if (sparseArray != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                WritableMap d2 = d(sparseArray.valueAt(i2));
                if (this.h.a() == 1) {
                    c(d2);
                }
                createArray.pushMap(d2);
            }
            this.a.j(createArray);
        }
        this.a.f();
    }
}
