package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton */
public class b0 extends ToggleButton {
    private final y a;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        y yVar = new y(this);
        this.a = yVar;
        yVar.m(attributeSet, i);
    }
}
