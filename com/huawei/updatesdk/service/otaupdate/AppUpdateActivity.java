package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.updatesdk.b.f.b;
import com.huawei.updatesdk.b.g.a;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.c;
import java.io.Serializable;
import java.util.concurrent.Executors;
import vigqyno.C0201;

public class AppUpdateActivity extends Activity implements b, com.huawei.updatesdk.b.c.b {
    private String a = C0201.m82(21646);
    private AlertDialog b;
    private com.huawei.updatesdk.b.g.a c;
    private com.huawei.updatesdk.b.g.a d;
    private ProgressBar e;
    private TextView f;
    private boolean g = false;
    private boolean h = false;
    private ApkUpgradeInfo i = null;
    private boolean j = false;
    private boolean k = false;
    private com.huawei.updatesdk.a.b.b.b l;
    private int m = -99;
    private int n = -99;
    private int o = -99;
    private Intent p = null;
    private n q;

    /* access modifiers changed from: package-private */
    public class a implements DialogInterface.OnKeyListener {
        public a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            AppUpdateActivity.this.m = 4;
            AppUpdateActivity.this.finish();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        public final /* synthetic */ com.huawei.updatesdk.a.b.c.b a;

        public b(com.huawei.updatesdk.a.b.c.b bVar) {
            this.a = bVar;
        }

        public void run() {
            Bundle b2 = this.a.b();
            if (b2 != null) {
                int i = b2.getInt(C0201.m82(24621));
                d.a().a(AppUpdateActivity.this.a((AppUpdateActivity) i, b2.getInt(C0201.m82(24622)), -1));
                AppUpdateActivity.this.c((AppUpdateActivity) i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements com.huawei.updatesdk.b.g.b {
        public c() {
        }

        @Override // com.huawei.updatesdk.b.g.b
        public void a() {
            AppUpdateActivity.this.e.setProgress(0);
            AppUpdateActivity.this.e.setMax(0);
            AppUpdateActivity.this.f.setText(C0201.m82(24569));
            AppUpdateActivity.this.a();
            if (AppUpdateActivity.this.l != null) {
                AppUpdateActivity.this.l.a();
            }
            AppUpdateActivity.this.c.a();
            if (AppUpdateActivity.this.j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.d((AppUpdateActivity) appUpdateActivity.i);
                return;
            }
            AppUpdateActivity.this.m = 4;
            AppUpdateActivity.this.finish();
        }

        @Override // com.huawei.updatesdk.b.g.b
        public void b() {
            AppUpdateActivity.this.c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements a.d {
        public d() {
        }

        @Override // com.huawei.updatesdk.b.g.a.d
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements View.OnClickListener {
        public final /* synthetic */ String a;

        public e(String str) {
            this.a = str;
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                AppUpdateActivity.this.c((AppUpdateActivity) this.a);
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements com.huawei.updatesdk.b.g.b {
        public final /* synthetic */ ApkUpgradeInfo a;
        public final /* synthetic */ com.huawei.updatesdk.b.g.a b;

        public f(ApkUpgradeInfo apkUpgradeInfo, com.huawei.updatesdk.b.g.a aVar) {
            this.a = apkUpgradeInfo;
            this.b = aVar;
        }

        @Override // com.huawei.updatesdk.b.g.b
        public void a() {
            if (!com.huawei.updatesdk.a.a.c.i.b.d(AppUpdateActivity.this)) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                Toast.makeText(appUpdateActivity, g.e(appUpdateActivity, C0201.m82(24914)), 0).show();
                AppUpdateActivity.this.finish();
                return;
            }
            AppUpdateActivity.this.e((AppUpdateActivity) this.a);
            this.b.a();
        }

        @Override // com.huawei.updatesdk.b.g.b
        public void b() {
            this.b.a();
            if (AppUpdateActivity.this.j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.d((AppUpdateActivity) appUpdateActivity.i);
                return;
            }
            AppUpdateActivity.this.m = 4;
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements a.d {
        public g() {
        }

        @Override // com.huawei.updatesdk.b.g.a.d
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements DialogInterface.OnKeyListener {
        public final /* synthetic */ com.huawei.updatesdk.b.g.a a;

        public h(com.huawei.updatesdk.b.g.a aVar) {
            this.a = aVar;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (AppUpdateActivity.this.j) {
                this.a.a();
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.d((AppUpdateActivity) appUpdateActivity.i);
                return true;
            }
            AppUpdateActivity.this.m = 4;
            AppUpdateActivity.this.finish();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements com.huawei.updatesdk.b.g.b {
        public i() {
        }

        @Override // com.huawei.updatesdk.b.g.b
        public void a() {
            AppUpdateActivity.this.o = 101;
            if (!com.huawei.updatesdk.a.a.c.i.b.d(AppUpdateActivity.this)) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                Toast.makeText(appUpdateActivity, g.e(appUpdateActivity, C0201.m82(24741)), 0).show();
                AppUpdateActivity.this.m = 2;
                AppUpdateActivity.this.finish();
                return;
            }
            AppUpdateActivity.this.f();
        }

        @Override // com.huawei.updatesdk.b.g.b
        public void b() {
            AppUpdateActivity.this.d.a();
            AppUpdateActivity.this.m = 4;
            AppUpdateActivity.this.o = 100;
            if (!AppUpdateActivity.this.j) {
                c cVar = new c();
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                cVar.a(appUpdateActivity, appUpdateActivity.a, new k());
                return;
            }
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements a.d {
        public j() {
        }

        @Override // com.huawei.updatesdk.b.g.a.d
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    public class k implements c.a {
        public k() {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.c.a
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                try {
                    Intent intent = new Intent(C0201.m82(25036));
                    intent.setPackage(AppUpdateActivity.this.a);
                    AppUpdateActivity.this.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    com.huawei.updatesdk.a.a.b.a.a.a.b(C0201.m82(25038), C0201.m82(25037) + e.toString());
                }
            }
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    public static class l implements DialogInterface.OnDismissListener {
        private l() {
        }

        public /* synthetic */ l(b bVar) {
            this();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(C0201.m82(25004), 10001);
            d.a().b(intent);
        }
    }

    /* access modifiers changed from: private */
    public static class m implements DialogInterface.OnShowListener {
        private m() {
        }

        public /* synthetic */ m(b bVar) {
            this();
        }

        public void onShow(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(C0201.m82(25003), 10002);
            d.a().b(intent);
        }
    }

    /* access modifiers changed from: private */
    public class n extends com.huawei.updatesdk.a.b.c.a {
        private n() {
        }

        public /* synthetic */ n(AppUpdateActivity appUpdateActivity, b bVar) {
            this();
        }

        @Override // com.huawei.updatesdk.a.b.c.a
        public void a(Context context, com.huawei.updatesdk.a.b.c.b bVar) {
            if (bVar.d()) {
                if (AppUpdateActivity.this.c != null) {
                    AppUpdateActivity.this.c.a();
                }
                AppUpdateActivity.this.a();
                String a2 = bVar.a();
                String dataString = bVar.c().getDataString();
                if (dataString != null && dataString.length() >= 9) {
                    String substring = dataString.substring(8);
                    if (C0201.m82(25440).equals(a2) && AppUpdateActivity.this.a.equals(substring)) {
                        d.a().a(AppUpdateActivity.this.a((AppUpdateActivity) 6, 0, -1));
                        com.huawei.updatesdk.b.f.b.a();
                        AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                        appUpdateActivity.a((AppUpdateActivity) appUpdateActivity.i.getPackage_(), AppUpdateActivity.this.i.getDetailId_());
                        if (AppUpdateActivity.this.j) {
                            AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                            appUpdateActivity2.d((AppUpdateActivity) appUpdateActivity2.i);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Intent a(int i2, int i3, int i4) {
        Intent intent = new Intent();
        intent.putExtra(C0201.m82(21647), i4);
        intent.putExtra(C0201.m82(21648), i2);
        intent.putExtra(C0201.m82(21649), i3);
        return intent;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a() {
        try {
            if (this.b != null && this.b.isShowing()) {
                this.b.dismiss();
                this.b = null;
            }
        } catch (IllegalArgumentException unused) {
            com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(21650), C0201.m82(21651));
        }
    }

    private void a(View view) {
        if (com.huawei.updatesdk.a.a.c.h.b.g()) {
            try {
                ScrollView scrollView = (ScrollView) view.findViewById(g.c(this, C0201.m82(21652)));
                if (Build.VERSION.SDK_INT >= 22) {
                    TypedValue typedValue = new TypedValue();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    getTheme().resolveAttribute(16843987, typedValue, true);
                    ((WindowManager) getSystemService(C0201.m82(21653))).getDefaultDisplay().getMetrics(displayMetrics);
                    int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics);
                    scrollView.setPadding(complexToDimensionPixelSize, 0, complexToDimensionPixelSize, 0);
                }
            } catch (Exception e2) {
                com.huawei.updatesdk.a.a.b.a.a.a.b(C0201.m82(21654), e2.toString());
            }
        }
    }

    private void a(com.huawei.updatesdk.a.b.c.b bVar) {
        Bundle b2 = bVar.b();
        if (b2 != null) {
            int i2 = b2.getInt(C0201.m82(21655), -1);
            d.a().a(a(-1, -1, i2));
            if (!com.huawei.updatesdk.a.b.b.d.a.a(i2)) {
                a();
                if (com.huawei.updatesdk.a.b.b.d.a.b(i2)) {
                    Toast.makeText(this, getString(g.e(this, C0201.m82(21656))), 0).show();
                    finish();
                }
            }
        }
    }

    private void a(ApkUpgradeInfo apkUpgradeInfo, TextView textView) {
        if (textView != null) {
            if (apkUpgradeInfo.getDiffSize_() > 0) {
                String a2 = i.a(this, (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? apkUpgradeInfo.getLongSize_() : apkUpgradeInfo.getLongSize_() + apkUpgradeInfo.getObbSize_());
                SpannableString spannableString = new SpannableString(a2);
                spannableString.setSpan(new StrikethroughSpan(), 0, a2.length(), 33);
                spannableString.setSpan(new TextAppearanceSpan(C0201.m82(21657), 0, (int) textView.getTextSize(), null, null), 0, spannableString.length(), 33);
                textView.setText(spannableString);
                return;
            }
            textView.setVisibility(8);
        }
    }

    private void a(String str) {
        Intent intent = new Intent(C0201.m82(21658));
        intent.setPackage(this.a);
        intent.putExtra(C0201.m82(21659), str);
        intent.putExtra(C0201.m82(21660), this.k);
        try {
            this.h = false;
            startActivityForResult(intent, 1002);
        } catch (ActivityNotFoundException e2) {
            com.huawei.updatesdk.a.a.b.a.a.a.b(C0201.m82(21662), C0201.m82(21661) + e2.toString());
            this.h = true;
            Intent intent2 = new Intent();
            intent2.putExtra(C0201.m82(21663), 8);
            d.a().b(intent2);
            d(this.i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.m = 1;
            finish();
            return;
        }
        Intent intent = new Intent(C0201.m82(21664));
        intent.setPackage(this.a);
        intent.putExtra(C0201.m82(21665), str2);
        intent.putExtra(C0201.m82(21666), str);
        intent.addFlags(268468224);
        try {
            startActivity(intent);
            if (!this.j) {
                finish();
            }
        } catch (ActivityNotFoundException unused) {
            f.a(this);
            f.a(this.a);
            Intent intent2 = new Intent();
            intent2.putExtra(C0201.m82(21667), 8);
            d.a().b(intent2);
            com.huawei.updatesdk.b.g.a aVar = this.d;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    private long b(ApkUpgradeInfo apkUpgradeInfo) {
        long longSize_ = apkUpgradeInfo.getLongSize_();
        if (apkUpgradeInfo.getPackingType_() == 1 && apkUpgradeInfo.getBundleSize_() > 0) {
            return apkUpgradeInfo.getBundleSize_();
        }
        if (apkUpgradeInfo.getPackingType_() == 3 && apkUpgradeInfo.getObbSize_() > 0) {
            longSize_ += apkUpgradeInfo.getObbSize_();
        }
        if (apkUpgradeInfo.getDiffSize_() <= 0) {
            return longSize_;
        }
        long diffSize_ = (long) apkUpgradeInfo.getDiffSize_();
        return (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? diffSize_ : diffSize_ + apkUpgradeInfo.getObbSize_();
    }

    private void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C0201.m82(21668));
        intentFilter.addDataScheme(C0201.m82(21669));
        n nVar = new n(this, null);
        this.q = nVar;
        a.a(this, intentFilter, nVar);
    }

    private void b(com.huawei.updatesdk.a.b.c.b bVar) {
        if (this.e != null) {
            this.e.setProgress(i.a(bVar.b(C0201.m82(21671), 0), bVar.b(C0201.m82(21670), 0)));
            this.f.setText(i.a((int) ((((float) this.e.getProgress()) / ((float) this.e.getMax())) * 100.0f)));
        }
    }

    private void b(String str) {
        View inflate = LayoutInflater.from(this).inflate(g.d(this, C0201.m82(21672)), (ViewGroup) null);
        ((TextView) inflate.findViewById(g.c(this, C0201.m82(21674)))).setText(TextUtils.isEmpty(this.i.getNewFeatures_()) ? getString(g.e(this, C0201.m82(21673))) : this.i.getNewFeatures_());
        ((TextView) inflate.findViewById(g.c(this, C0201.m82(21675)))).setText(this.i.getVersion_());
        ((TextView) inflate.findViewById(g.c(this, C0201.m82(21676)))).setText(i.a(this, b(this.i)));
        ((TextView) inflate.findViewById(g.c(this, C0201.m82(21677)))).setText(this.i.getName_());
        a(this.i, (TextView) inflate.findViewById(g.c(this, C0201.m82(21678))));
        a(inflate);
        com.huawei.updatesdk.b.g.a a2 = com.huawei.updatesdk.b.g.a.a(this, str, null);
        this.d = a2;
        a2.a(inflate);
    }

    private void b(String str, String str2) {
        AlertDialog alertDialog = this.b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            this.b = (com.huawei.updatesdk.a.a.c.h.b.g() ? new AlertDialog.Builder(this) : ((getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(this, 16974546) : new AlertDialog.Builder(this, 16974545)).create();
            View inflate = LayoutInflater.from(this).inflate(g.d(this, C0201.m82(21679)), (ViewGroup) null);
            ((TextView) inflate.findViewById(g.c(this, C0201.m82(21680)))).setText(getString(g.e(this, C0201.m82(21681)), new Object[]{str2}));
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(g.c(this, C0201.m82(21682)));
            this.e = progressBar;
            progressBar.setMax(100);
            this.f = (TextView) inflate.findViewById(g.c(this, C0201.m82(21683)));
            inflate.findViewById(g.c(this, C0201.m82(21684))).setOnClickListener(new e(str));
            this.b.setView(inflate);
            this.b.setCancelable(false);
            this.b.setCanceledOnTouchOutside(false);
            if (!a.a(this)) {
                this.b.show();
            }
            this.f.setText(i.a(0));
        }
    }

    private void c() {
        int a2 = com.huawei.updatesdk.b.f.a.d().a();
        if (a2 >= 11 && a2 < 17) {
            this.d.a(g.b(this, C0201.m82(21685)), g.a(this, C0201.m82(21686)));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c(int i2) {
        if (i2 == 5 || i2 == 4) {
            Toast.makeText(this, getString(g.e(this, C0201.m82(21687))), 0).show();
            com.huawei.updatesdk.b.f.b.a();
            finish();
        }
        if (i2 == 7) {
            com.huawei.updatesdk.b.f.b.a();
            if (this.g) {
                d(this.i);
            } else {
                finish();
            }
        }
    }

    private void c(com.huawei.updatesdk.a.b.c.b bVar) {
        new Handler(Looper.getMainLooper()).post(new b(bVar));
    }

    private void c(ApkUpgradeInfo apkUpgradeInfo) {
        com.huawei.updatesdk.b.g.a a2 = com.huawei.updatesdk.b.g.a.a(this, null, getString(g.e(this, C0201.m82(21688)), new Object[]{apkUpgradeInfo.getName_()}));
        a2.a(new f(apkUpgradeInfo, a2));
        String string = getString(g.e(this, C0201.m82(21689)));
        a2.a(new g());
        a2.a(a.c.CONFIRM, string);
        a2.a(new h(a2));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c(String str) {
        com.huawei.updatesdk.b.g.a a2 = com.huawei.updatesdk.b.g.a.a(this, null, getString(g.e(this, C0201.m82(21690))));
        this.c = a2;
        a2.a(new c());
        String string = getString(g.e(this, C0201.m82(21691)));
        this.c.a(new d());
        this.c.a(a.c.CONFIRM, string);
    }

    private void d() {
        com.huawei.updatesdk.b.g.a aVar = this.d;
        if (aVar != null) {
            aVar.a(new l(null));
            this.d.a(new m(null));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d(ApkUpgradeInfo apkUpgradeInfo) {
        if (apkUpgradeInfo == null) {
            finish();
            return;
        }
        String string = getString(g.e(this, C0201.m82(21692)));
        String string2 = getString(g.e(this, C0201.m82(21693)));
        String string3 = getString(g.e(this, C0201.m82(21694)));
        b(string);
        if (1 == apkUpgradeInfo.getIsCompulsoryUpdate_()) {
            string3 = getString(g.e(this, C0201.m82(21695)));
            if (this.k) {
                this.d.c();
            }
            this.g = true;
        }
        this.d.a(new i());
        d();
        this.d.a(new j());
        if (this.g) {
            this.d.a(false);
        } else {
            this.d.a(new a());
        }
        this.d.a(a.c.CONFIRM, string2);
        this.d.a(a.c.CANCEL, string3);
        c();
    }

    private void e() {
        a.a(this, this.q);
        com.huawei.updatesdk.b.c.c.a().b(this);
        com.huawei.updatesdk.a.b.b.b bVar = this.l;
        if (bVar != null) {
            bVar.b();
        }
        f.a((b) null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e(ApkUpgradeInfo apkUpgradeInfo) {
        b();
        b(apkUpgradeInfo.getPackage_(), apkUpgradeInfo.getName_());
        com.huawei.updatesdk.a.b.b.a aVar = new com.huawei.updatesdk.a.b.b.a(apkUpgradeInfo.getDownurl_(), apkUpgradeInfo.getLongSize_(), apkUpgradeInfo.getSha256_());
        aVar.a(apkUpgradeInfo.getPackage_());
        com.huawei.updatesdk.a.b.b.b bVar = new com.huawei.updatesdk.a.b.b.b(aVar);
        this.l = bVar;
        bVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f() {
        if (!com.huawei.updatesdk.b.f.b.c(this, this.a)) {
            if (com.huawei.updatesdk.a.b.a.a.c() == null) {
                com.huawei.updatesdk.a.b.a.a.a(this);
            }
            f.a(this);
            f.a(this.a);
            this.d.a();
            return;
        }
        a(this.i.getPackage_(), this.i.getDetailId_());
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void a(int i2) {
        Toast.makeText(this, getString(g.e(this, C0201.m82(21696))), 0).show();
        d.a().a(i2);
        finish();
    }

    @Override // com.huawei.updatesdk.b.c.b
    public void a(int i2, com.huawei.updatesdk.a.b.c.b bVar) {
        if (bVar != null) {
            if (i2 == 0) {
                a(bVar);
            } else if (1 == i2) {
                b(bVar);
            } else if (2 == i2) {
                c(bVar);
            }
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void a(ApkUpgradeInfo apkUpgradeInfo) {
        if (apkUpgradeInfo != null) {
            com.huawei.updatesdk.b.c.c.a().a(this);
            c(apkUpgradeInfo);
            return;
        }
        Toast.makeText(this, getString(g.e(this, C0201.m82(21697))), 0).show();
        finish();
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void b(int i2) {
        Toast.makeText(this, getString(g.e(this, C0201.m82(21698))), 0).show();
        d.a().a(i2);
        finish();
    }

    public void finish() {
        if (this.g) {
            overridePendingTransition(0, 0);
        }
        Intent intent = new Intent();
        this.p = intent;
        intent.putExtra(C0201.m82(21699), this.m);
        this.p.putExtra(C0201.m82(21700), this.n);
        this.p.putExtra(C0201.m82(21701), this.g);
        this.p.putExtra(C0201.m82(21702), this.o);
        d.a().b(this.p);
        super.finish();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1002) {
            if (intent != null) {
                com.huawei.updatesdk.a.b.c.b a2 = com.huawei.updatesdk.a.b.c.b.a(intent);
                this.m = i3;
                this.n = a2.a(C0201.m82(21703), -99);
                this.g = a2.a(C0201.m82(21704), false);
            }
            this.o = i3 == 4 ? 100 : 101;
            if (!this.h) {
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        w30.i(this);
        requestWindowFeature(1);
        com.huawei.updatesdk.a.a.c.h.b.d().a(getWindow());
        super.onCreate(bundle);
        Bundle b2 = com.huawei.updatesdk.a.b.c.b.a(getIntent()).b();
        if (b2 == null) {
            super.finish();
            return;
        }
        Serializable serializable = null;
        try {
            serializable = b2.getSerializable(C0201.m82(21705));
        } catch (Exception unused) {
            Log.e(C0201.m82(21706), C0201.m82(21707));
        }
        if (serializable instanceof ApkUpgradeInfo) {
            this.i = (ApkUpgradeInfo) serializable;
            this.k = b2.getBoolean(C0201.m82(21708), false);
            if (this.i.getIsCompulsoryUpdate_() == 1) {
                this.j = true;
            }
            if (!TextUtils.isEmpty(h.g().c())) {
                this.a = h.g().c();
            }
            if (this.i.getDevType_() == 1 && com.huawei.updatesdk.b.f.b.a(this, this.a) == b.EnumC0114b.INSTALLED) {
                a(this.i.getPackage_());
            } else {
                d(this.i);
            }
        } else {
            this.m = 3;
            finish();
        }
    }

    public void onDestroy() {
        w30.k(this);
        com.huawei.updatesdk.b.g.a aVar = this.c;
        if (aVar != null) {
            aVar.a();
            this.c = null;
        }
        com.huawei.updatesdk.b.g.a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.a();
            this.d = null;
        }
        a();
        e();
        super.onDestroy();
        finishActivity(1002);
    }

    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    public /* synthetic */ void onStop() {
        w30.D(this);
        super.onStop();
    }
}
