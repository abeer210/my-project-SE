package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* compiled from: AppCompatRatingBar */
public class t extends RatingBar {
    private final r a;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.ratingBarStyle);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.a.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r rVar = new r(this);
        this.a = rVar;
        rVar.c(attributeSet, i);
    }
}
