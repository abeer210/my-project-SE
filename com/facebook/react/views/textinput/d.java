package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import vigqyno.C0201;

/* compiled from: ReactEditTextInputConnectionWrapper */
public class d extends InputConnectionWrapper {
    private c a;
    private com.facebook.react.uimanager.events.d b;
    private boolean c;
    private String d = null;

    public d(InputConnection inputConnection, ReactContext reactContext, c cVar) {
        super(inputConnection, false);
        this.b = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.a = cVar;
    }

    private void a(String str) {
        if (str.equals(C0201.m82(9113))) {
            str = C0201.m82(9114);
        }
        this.b.v(new j(this.a.getId(), str));
    }

    private void b(String str) {
        if (this.c) {
            this.d = str;
        } else {
            a(str);
        }
    }

    public boolean beginBatchEdit() {
        this.c = true;
        return super.beginBatchEdit();
    }

    public boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals(C0201.m82(9115))) {
                charSequence2 = C0201.m82(9116);
            }
            b(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        a(C0201.m82(9117));
        return super.deleteSurroundingText(i, i2);
    }

    public boolean endBatchEdit() {
        this.c = false;
        String str = this.d;
        if (str != null) {
            a(str);
            this.d = null;
        }
        return super.endBatchEdit();
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                a(C0201.m82(9118));
            } else if (keyEvent.getKeyCode() == 66) {
                a(C0201.m82(9119));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.a.getSelectionStart();
        int selectionEnd = this.a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.a.getSelectionStart();
        boolean z = false;
        boolean z2 = selectionStart == selectionEnd;
        boolean z3 = selectionStart2 == selectionStart;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0) {
            z = true;
        }
        b((z || (!z2 && z3)) ? C0201.m82(9120) : String.valueOf(this.a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
