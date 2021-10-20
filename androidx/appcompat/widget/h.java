package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.j;

/* compiled from: AppCompatCheckedTextView */
public class h extends CheckedTextView {
    private static final int[] b = {16843016};
    private final y a;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.a;
        if (yVar != null) {
            yVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(n.d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.s(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.a;
        if (yVar != null) {
            yVar.p(context, i);
        }
    }

    public h(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        y yVar = new y(this);
        this.a = yVar;
        yVar.m(attributeSet, i);
        this.a.b();
        x0 u = x0.u(getContext(), attributeSet, b, i, 0);
        setCheckMarkDrawable(u.g(0));
        u.v();
    }
}
