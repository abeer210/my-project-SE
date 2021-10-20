package defpackage;

import java.security.PrivateKey;

/* renamed from: l63  reason: default package */
/* compiled from: NamedJcaJceExtHelper */
public class l63 extends k73 implements i63 {
    public l63(String str) {
        super(str);
    }

    @Override // defpackage.i63
    public v73 b(o43 o43, PrivateKey privateKey) {
        v73 v73 = new v73(o43, privateKey);
        v73.e(this.a);
        return v73;
    }
}
