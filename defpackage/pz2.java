package defpackage;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import org.reactnative.facedetector.a;
import org.reactnative.facedetector.b;

/* renamed from: pz2  reason: default package */
/* compiled from: FaceDetectorAsyncTask */
public class pz2 extends AsyncTask<Void, Void, SparseArray<nu1>> {
    private byte[] a;
    private int b;
    private int c;
    private int d;
    private b e;
    private qz2 f;
    private vz2 g;
    private double h;
    private double i;
    private int j;
    private int k;

    public pz2(qz2 qz2, b bVar, byte[] bArr, int i2, int i3, int i4, float f2, int i5, int i6, int i7, int i8, int i9) {
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f = qz2;
        this.e = bVar;
        vz2 vz2 = new vz2(i2, i3, i4, i5);
        this.g = vz2;
        double d2 = (double) i6;
        double d3 = (double) (((float) vz2.d()) * f2);
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.h = d2 / d3;
        double d4 = (double) i7;
        double b2 = (double) (((float) this.g.b()) * f2);
        Double.isNaN(d4);
        Double.isNaN(b2);
        this.i = d4 / b2;
        this.j = i8;
        this.k = i9;
    }

    private WritableArray c(SparseArray<nu1> sparseArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            WritableMap g2 = a.g(sparseArray.valueAt(i2), this.h, this.i, this.b, this.c, this.j, this.k);
            if (this.g.a() == 1) {
                a.e(g2, this.g.d(), this.h);
            } else {
                a.a(g2);
            }
            createArray.pushMap(g2);
        }
        return createArray;
    }

    /* renamed from: a */
    public SparseArray<nu1> doInBackground(Void... voidArr) {
        b bVar;
        if (isCancelled() || this.f == null || (bVar = this.e) == null || !bVar.c()) {
            return null;
        }
        return this.e.b(b03.b(this.a, this.b, this.c, this.d));
    }

    /* renamed from: b */
    public void onPostExecute(SparseArray<nu1> sparseArray) {
        super.onPostExecute(sparseArray);
        if (sparseArray == null) {
            this.f.b(this.e);
            return;
        }
        if (sparseArray.size() > 0) {
            this.f.c(c(sparseArray));
        }
        this.f.i();
    }
}
