package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: a7  reason: default package */
/* compiled from: ViewUtilsApi29 */
public class a7 extends z6 {
    @Override // defpackage.b7, defpackage.w6
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.b7, defpackage.x6
    public void e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // defpackage.b7, defpackage.y6
    public void f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.b7, defpackage.w6
    public void g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.b7, defpackage.z6
    public void h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.b7, defpackage.x6
    public void i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.b7, defpackage.x6
    public void j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
