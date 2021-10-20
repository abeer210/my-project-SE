package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: j6  reason: default package */
/* compiled from: TransitionUtils */
public class j6 {
    private static final boolean a = (Build.VERSION.SDK_INT >= 19);
    private static final boolean b = (Build.VERSION.SDK_INT >= 18);
    private static final boolean c;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28) {
            z = false;
        }
        c = z;
    }

    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        v6.j(view, matrix);
        v6.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b2 = b(view, matrix, rectF, viewGroup);
        if (b2 != null) {
            imageView.setImageBitmap(b2);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    private static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup2;
        int round;
        int round2;
        if (a) {
            z2 = !view.isAttachedToWindow();
            if (viewGroup != null) {
                z = viewGroup.isAttachedToWindow();
                Bitmap bitmap = null;
                if (b || !z2) {
                    viewGroup2 = null;
                    i = 0;
                } else if (!z) {
                    return null;
                } else {
                    viewGroup2 = (ViewGroup) view.getParent();
                    i = viewGroup2.indexOfChild(view);
                    viewGroup.getOverlay().add(view);
                }
                round = Math.round(rectF.width());
                round2 = Math.round(rectF.height());
                if (round > 0 && round2 > 0) {
                    float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
                    int round3 = Math.round(((float) round) * min);
                    int round4 = Math.round(((float) round2) * min);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    matrix.postScale(min, min);
                    if (!c) {
                        Picture picture = new Picture();
                        Canvas beginRecording = picture.beginRecording(round3, round4);
                        beginRecording.concat(matrix);
                        view.draw(beginRecording);
                        picture.endRecording();
                        bitmap = Bitmap.createBitmap(picture);
                    } else {
                        bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmap);
                        canvas.concat(matrix);
                        view.draw(canvas);
                    }
                }
                if (b && z2) {
                    viewGroup.getOverlay().remove(view);
                    viewGroup2.addView(view, i);
                }
                return bitmap;
            }
        } else {
            z2 = false;
        }
        z = false;
        Bitmap bitmap2 = null;
        if (b) {
        }
        viewGroup2 = null;
        i = 0;
        round = Math.round(rectF.width());
        round2 = Math.round(rectF.height());
        float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        int round32 = Math.round(((float) round) * min2);
        int round42 = Math.round(((float) round2) * min2);
        matrix.postTranslate(-rectF.left, -rectF.top);
        matrix.postScale(min2, min2);
        if (!c) {
        }
        viewGroup.getOverlay().remove(view);
        viewGroup2.addView(view, i);
        return bitmap2;
    }

    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
