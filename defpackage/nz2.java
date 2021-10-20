package defpackage;

import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* renamed from: nz2  reason: default package */
/* compiled from: BarcodeDetectorAsyncTask */
public class nz2 extends AsyncTask<Void, Void, SparseArray<wt1>> {
    private byte[] a;
    private int b;
    private int c;
    private int d;
    private xy2 e;
    private oz2 f;
    private double g;
    private double h;
    private vz2 i;
    private int j;
    private int k;

    public nz2(oz2 oz2, xy2 xy2, byte[] bArr, int i2, int i3, int i4, float f2, int i5, int i6, int i7, int i8, int i9) {
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f = oz2;
        this.e = xy2;
        vz2 vz2 = new vz2(i2, i3, i4, i5);
        this.i = vz2;
        double d2 = (double) i6;
        double d3 = (double) (((float) vz2.d()) * f2);
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.g = d2 / d3;
        double d4 = (double) i7;
        double b2 = (double) (((float) this.i.b()) * f2);
        Double.isNaN(d4);
        Double.isNaN(b2);
        this.h = d4 / b2;
        this.j = i8;
        this.k = i9;
    }

    private WritableMap c(Rect rect) {
        WritableMap createMap = Arguments.createMap();
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = this.b;
        if (i2 < i4 / 2) {
            i2 += this.j / 2;
        } else if (i2 > i4 / 2) {
            i2 -= this.j / 2;
        }
        int i5 = rect.top;
        int i6 = this.c;
        if (i5 < i6 / 2) {
            i3 += this.k / 2;
        } else if (i5 > i6 / 2) {
            i3 -= this.k / 2;
        }
        double d2 = (double) i2;
        double d3 = this.g;
        Double.isNaN(d2);
        createMap.putDouble(C0201.m82(9666), d2 * d3);
        double d4 = (double) i3;
        double d5 = this.h;
        Double.isNaN(d4);
        createMap.putDouble(C0201.m82(9667), d4 * d5);
        WritableMap createMap2 = Arguments.createMap();
        double width = (double) rect.width();
        double d6 = this.g;
        Double.isNaN(width);
        createMap2.putDouble(C0201.m82(9668), width * d6);
        double height = (double) rect.height();
        double d7 = this.h;
        Double.isNaN(height);
        createMap2.putDouble(C0201.m82(9669), height * d7);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putMap(C0201.m82(9670), createMap);
        createMap3.putMap(C0201.m82(9671), createMap2);
        return createMap3;
    }

    private WritableArray d(SparseArray<wt1> sparseArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            wt1 valueAt = sparseArray.valueAt(i2);
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(9672), valueAt.c);
            createMap.putString(C0201.m82(9673), valueAt.b);
            createMap.putString(C0201.m82(9674), wy2.a(valueAt.a));
            createMap.putMap(C0201.m82(9675), c(valueAt.o()));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    /* renamed from: a */
    public SparseArray<wt1> doInBackground(Void... voidArr) {
        xy2 xy2;
        if (isCancelled() || this.f == null || (xy2 = this.e) == null || !xy2.c()) {
            return null;
        }
        return this.e.b(b03.b(this.a, this.b, this.c, this.d));
    }

    /* renamed from: b */
    public void onPostExecute(SparseArray<wt1> sparseArray) {
        super.onPostExecute(sparseArray);
        if (sparseArray == null) {
            this.f.e(this.e);
            return;
        }
        if (sparseArray.size() > 0) {
            this.f.a(d(sparseArray), this.b, this.c, this.a);
        }
        this.f.k();
    }
}
