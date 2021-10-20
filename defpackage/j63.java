package defpackage;

import java.io.InputStream;
import java.security.PrivateKey;
import javax.crypto.Cipher;

/* renamed from: j63  reason: default package */
/* compiled from: JceKeyTransEnvelopedRecipient */
public class j63 extends k63 {

    /* renamed from: j63$a */
    /* compiled from: JceKeyTransEnvelopedRecipient */
    class a implements q73 {
        public final /* synthetic */ o43 a;
        public final /* synthetic */ Cipher b;

        public a(j63 j63, o43 o43, Cipher cipher) {
            this.a = o43;
            this.b = cipher;
        }

        @Override // defpackage.q73
        public InputStream a(InputStream inputStream) {
            return new b73(inputStream, this.b);
        }

        @Override // defpackage.q73
        public o43 b() {
            return this.a;
        }
    }

    public j63(PrivateKey privateKey) {
        super(privateKey);
    }

    @Override // defpackage.t53
    public e63 a(o43 o43, o43 o432, byte[] bArr) throws h53 {
        return new e63(new a(this, o432, this.c.d(g(o43, o432, bArr), o432)));
    }
}
