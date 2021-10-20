package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: e02  reason: default package */
public final class e02 extends ResultReceiver {
    public final /* synthetic */ d12 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e02(Handler handler, d12 d12) {
        super(handler);
        this.a = d12;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.a.e(null);
    }
}
