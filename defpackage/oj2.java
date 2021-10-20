package defpackage;

import com.facebook.react.bridge.Promise;

/* renamed from: oj2  reason: default package */
/* compiled from: NativeCommandListener */
public class oj2 extends bj2 {
    private String b;
    private String c;
    private Promise d;
    private oi2 e;
    private pj2 f;

    public oj2(String str, String str2, Promise promise, oi2 oi2, pj2 pj2) {
        this.c = str;
        this.b = str2;
        this.d = promise;
        this.e = oi2;
        this.f = pj2;
    }

    @Override // defpackage.aj2, defpackage.bj2
    public void a(String str) {
        Promise promise = this.d;
        if (promise != null) {
            promise.resolve(str);
        }
        this.e.e(this.c, this.b, this.f.a());
    }

    @Override // defpackage.aj2, defpackage.bj2
    public void onError(String str) {
        Promise promise = this.d;
        if (promise != null) {
            promise.reject(new Throwable(str));
        }
    }
}
