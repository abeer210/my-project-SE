package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.text.NumberFormat;
import vigqyno.C0201;

/* compiled from: DownloadProgress */
public class f extends b {
    private ProgressBar a;
    private TextView b;
    private int c = 0;
    private DialogInterface.OnKeyListener d = new a();

    /* compiled from: DownloadProgress */
    private static class a implements DialogInterface.OnKeyListener {
        private a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4 && keyEvent.getRepeatCount() == 0;
        }
    }

    @Override // com.huawei.hms.update.ui.b
    public AlertDialog a() {
        AlertDialog.Builder builder = new AlertDialog.Builder(f(), g());
        View inflate = View.inflate(f(), ResourceLoaderUtil.getLayoutId(C0201.m82(35496)), null);
        builder.setView(inflate);
        builder.setCancelable(false);
        builder.setOnKeyListener(this.d);
        this.a = (ProgressBar) inflate.findViewById(ResourceLoaderUtil.getIdId(C0201.m82(35497)));
        this.b = (TextView) inflate.findViewById(ResourceLoaderUtil.getIdId(C0201.m82(35498)));
        b(this.c);
        return builder.create();
    }

    public void b(int i) {
        ProgressBar progressBar;
        Activity f = f();
        if (f == null || f.isFinishing()) {
            HMSLog.w(C0201.m82(35499), C0201.m82(35500));
        } else if (this.b != null && (progressBar = this.a) != null) {
            progressBar.setProgress(i);
            this.b.setText(NumberFormat.getPercentInstance().format((double) (((float) i) / 100.0f)));
        }
    }

    public void a(int i) {
        this.c = i;
    }
}
