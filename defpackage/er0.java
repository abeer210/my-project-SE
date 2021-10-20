package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import vigqyno.C0201;

/* renamed from: er0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class er0 implements View.OnClickListener {
    private final /* synthetic */ Context a;
    private final /* synthetic */ Intent b;

    public er0(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final void onClick(View view) {
        w30.g(view);
        try {
            this.a.startActivity(this.b);
            w30.h();
        } catch (ActivityNotFoundException e) {
            Log.e(C0201.m82(10804), C0201.m82(10805), e);
            w30.h();
        } catch (Throwable th) {
            w30.h();
            throw th;
        }
    }
}
