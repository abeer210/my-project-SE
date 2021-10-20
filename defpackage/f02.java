package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import vigqyno.C0201;

/* renamed from: f02  reason: default package */
public final class f02 implements b02 {
    private final k02 a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public f02(k02 k02) {
        this.a = k02;
    }

    @Override // defpackage.b02
    public final s02<Void> a(Activity activity, a02 a02) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra(C0201.m82(14040), a02.a());
        d12 d12 = new d12();
        intent.putExtra(C0201.m82(14041), new e02(this.b, d12));
        activity.startActivity(intent);
        return d12.a();
    }

    @Override // defpackage.b02
    public final s02<a02> b() {
        return this.a.a();
    }
}
