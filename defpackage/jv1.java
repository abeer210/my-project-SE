package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import com.google.android.gms.vision.b;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: jv1  reason: default package */
public final class jv1 extends com.google.android.gms.vision.a<iv1> {
    private final ji1 c;

    /* renamed from: jv1$a */
    public static class a {
        private Context a;
        private ki1 b = new ki1();

        public a(Context context) {
            this.a = context;
        }

        public jv1 a() {
            return new jv1(new ji1(this.a, this.b));
        }
    }

    private jv1(ji1 ji1) {
        this.c = ji1;
    }

    @Override // com.google.android.gms.vision.a
    public final void a() {
        super.a();
        this.c.d();
    }

    public final SparseArray<iv1> b(b bVar) {
        Bitmap bitmap;
        byte[] bArr;
        fi1 fi1 = new fi1(new Rect());
        if (bVar != null) {
            np1 o = np1.o(bVar);
            if (bVar.a() != null) {
                bitmap = bVar.a();
            } else {
                b.C0064b c2 = bVar.c();
                ByteBuffer b = bVar.b();
                int a2 = c2.a();
                int i = o.a;
                int i2 = o.b;
                if (!b.hasArray() || b.arrayOffset() != 0) {
                    byte[] bArr2 = new byte[b.capacity()];
                    b.get(bArr2);
                    bArr = bArr2;
                } else {
                    bArr = b.array();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new YuvImage(bArr, a2, i, i2, null).compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            Bitmap b2 = pp1.b(bitmap, o);
            if (!fi1.a.isEmpty()) {
                Rect rect = fi1.a;
                int f = bVar.c().f();
                int b3 = bVar.c().b();
                int i3 = o.e;
                if (i3 == 1) {
                    rect = new Rect(b3 - rect.bottom, rect.left, b3 - rect.top, rect.right);
                } else if (i3 == 2) {
                    rect = new Rect(f - rect.right, b3 - rect.bottom, f - rect.left, b3 - rect.top);
                } else if (i3 == 3) {
                    rect = new Rect(rect.top, f - rect.right, rect.bottom, f - rect.left);
                }
                fi1.a.set(rect);
            }
            o.e = 0;
            di1[] f2 = this.c.f(b2, o, fi1);
            SparseArray sparseArray = new SparseArray();
            for (di1 di1 : f2) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(di1.j);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(di1.j, sparseArray2);
                }
                sparseArray2.append(di1.k, di1);
            }
            SparseArray<iv1> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                sparseArray3.append(sparseArray.keyAt(i4), new iv1((SparseArray) sparseArray.valueAt(i4)));
            }
            return sparseArray3;
        }
        throw new IllegalArgumentException(C0201.m82(29143));
    }
}
