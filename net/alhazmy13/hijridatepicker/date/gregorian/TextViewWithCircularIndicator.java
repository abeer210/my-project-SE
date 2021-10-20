package net.alhazmy13.hijridatepicker.date.gregorian;

import android.content.Context;
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
        a();
    }

    private void a() {
        this.a.setFakeBoldText(true);
        this.a.setAntiAlias(true);
        this.a.setColor(this.b);
        this.a.setTextAlign(Paint.Align.CENTER);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setAlpha(255);
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
