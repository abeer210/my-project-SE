package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import vigqyno.C0201;

/* renamed from: dw1  reason: default package */
/* compiled from: ImageMatrixProperty */
public class dw1 extends Property<ImageView, Matrix> {
    private final Matrix a = new Matrix();

    public dw1() {
        super(Matrix.class, C0201.m82(29762));
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
