package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;

/* compiled from: DoubleTapReloadRecognizer */
public class c {
    private boolean a = false;

    /* compiled from: DoubleTapReloadRecognizer */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            c.this.a = false;
        }
    }

    public boolean b(int i, View view) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.a) {
                this.a = false;
                return true;
            }
            this.a = true;
            new Handler().postDelayed(new a(), 200);
        }
        return false;
    }
}
