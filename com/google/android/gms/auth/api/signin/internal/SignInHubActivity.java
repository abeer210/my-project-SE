package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import defpackage.q4;
import vigqyno.C0201;

@KeepName
public class SignInHubActivity extends d {
    private static boolean y;
    private boolean q = false;
    private SignInConfiguration u;
    private boolean v;
    private int w;
    private Intent x;

    /* access modifiers changed from: private */
    public class a implements q4.a<Void> {
        private a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [u4, java.lang.Object] */
        @Override // defpackage.q4.a
        public final /* synthetic */ void a(u4<Void> u4Var, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.w, SignInHubActivity.this.x);
            SignInHubActivity.this.finish();
        }

        @Override // defpackage.q4.a
        public final u4<Void> b(int i, Bundle bundle) {
            return new g(SignInHubActivity.this, f.k());
        }

        @Override // defpackage.q4.a
        public final void c(u4<Void> u4Var) {
        }
    }

    static {
        C0201.m83(SignInHubActivity.class, 420);
    }

    private final void B(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra(C0201.m82(20526), status);
        setResult(0, intent);
        finish();
        y = false;
    }

    private final void D() {
        q().c(0, null, new a());
        y = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.q) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    String r0 = C0201.m82(20527);
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(r0);
                    if (signInAccount == null || signInAccount.c() == null) {
                        String r5 = C0201.m82(20529);
                        if (intent.hasExtra(r5)) {
                            int intExtra = intent.getIntExtra(r5, 8);
                            if (intExtra == 13) {
                                intExtra = 12501;
                            }
                            B(intExtra);
                            return;
                        }
                    } else {
                        GoogleSignInAccount c = signInAccount.c();
                        n.c(this).b(this.u.o(), c);
                        intent.removeExtra(r0);
                        intent.putExtra(C0201.m82(20528), c);
                        this.v = true;
                        this.w = i2;
                        this.x = intent;
                        D();
                        return;
                    }
                }
                B(8);
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (C0201.m82(20530).equals(action)) {
            B(12500);
            return;
        }
        String r2 = C0201.m82(20531);
        boolean equals = action.equals(r2);
        String r4 = C0201.m82(20532);
        if (equals || action.equals(C0201.m82(20533))) {
            String r3 = C0201.m82(20535);
            SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra(r3).getParcelable(r3);
            this.u = signInConfiguration;
            if (signInConfiguration == null) {
                Log.e(r4, C0201.m82(20536));
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                boolean z = bundle.getBoolean(C0201.m82(20539));
                this.v = z;
                if (z) {
                    this.w = bundle.getInt(C0201.m82(20540));
                    this.x = (Intent) bundle.getParcelable(C0201.m82(20541));
                    D();
                }
            } else if (y) {
                setResult(0);
                B(12502);
            } else {
                y = true;
                Intent intent2 = new Intent(action);
                if (action.equals(r2)) {
                    intent2.setPackage(C0201.m82(20537));
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra(r3, this.u);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.q = true;
                    Log.w(r4, C0201.m82(20538));
                    B(17);
                }
            }
        } else {
            String r9 = C0201.m82(20534);
            String valueOf = String.valueOf(intent.getAction());
            Log.e(r4, valueOf.length() != 0 ? r9.concat(valueOf) : new String(r9));
            finish();
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onDestroy() {
        w30.k(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(C0201.m82(20542), this.v);
        if (this.v) {
            bundle.putInt(C0201.m82(20543), this.w);
            bundle.putParcelable(C0201.m82(20544), this.x);
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onStop() {
        w30.D(this);
        super.onStop();
    }
}
