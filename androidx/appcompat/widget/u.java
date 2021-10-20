package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBar */
public class u extends SeekBar {
    private final v a;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.i();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
    }

    public u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        v vVar = new v(this);
        this.a = vVar;
        vVar.c(attributeSet, i);
    }
}
