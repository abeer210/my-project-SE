package net.alhazmy13.hijridatepicker.date.hijri;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.b;
import net.alhazmy13.hijridatepicker.c;
import net.alhazmy13.hijridatepicker.g;

public class TextViewWithCircularIndicator extends TextView {
    public Paint a = new Paint();
    private int b;
    private final String c;
    private boolean d;

    public TextViewWithCircularIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = b.d(context, c.mdtp_accent_color);
        this.c = context.getResources().getString(g.mdtp_item_is_selected);
        c();
    }

    private ColorStateList a(int i, boolean z) {
        int[][] iArr = {new int[]{16842919}, new int[]{16842913}, new int[0]};
        int[] iArr2 = new int[3];
        iArr2[0] = i;
        int i2 = -1;
        iArr2[1] = -1;
        if (!z) {
            i2 = -16777216;
        }
        iArr2[2] = i2;
        return new ColorStateList(iArr, iArr2);
    }

    private void c() {
        this.a.setFakeBoldText(true);
        this.a.setAntiAlias(true);
        this.a.setColor(this.b);
        this.a.setTextAlign(Paint.Align.CENTER);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setAlpha(255);
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void d(int i, boolean z) {
        this.b = i;
        this.a.setColor(i);
        setTextColor(a(i, z));
    }

    public CharSequence getContentDescription() {
        CharSequence text = getText();
        if (!this.d) {
            return text;
        }
        return String.format(this.c, text);
    }

    public void onDraw(Canvas canvas) {
        if (this.d) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (Math.min(width, height) / 2), this.a);
        }
        setSelected(this.d);
        super.onDraw(canvas);
    }
}
