package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import vigqyno.C0201;

@TargetApi(23)
/* renamed from: yt2  reason: default package */
/* compiled from: FingerprintManagerCompatApi23 */
public final class yt2 {

    /* access modifiers changed from: package-private */
    /* renamed from: yt2$a */
    /* compiled from: FingerprintManagerCompatApi23 */
    public static class a extends FingerprintManager.AuthenticationCallback {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.a.a(i, charSequence);
        }

        public void onAuthenticationFailed() {
            this.a.b();
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.a.c(i, charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.a.d(new c(yt2.f(authenticationResult.getCryptoObject())));
        }
    }

    /* renamed from: yt2$b */
    /* compiled from: FingerprintManagerCompatApi23 */
    public static abstract class b {
        public abstract void a(int i, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i, CharSequence charSequence);

        public abstract void d(c cVar);
    }

    /* renamed from: yt2$c */
    /* compiled from: FingerprintManagerCompatApi23 */
    public static final class c {
        private d a;

        public c(d dVar) {
            this.a = dVar;
        }

        public d a() {
            return this.a;
        }
    }

    public static void b(Context context, d dVar, int i, Object obj, b bVar, Handler handler) {
        FingerprintManager c2 = c(context);
        if (c2 != null) {
            c2.authenticate(h(dVar), (CancellationSignal) obj, i, g(bVar), handler);
        }
    }

    private static FingerprintManager c(Context context) {
        return (FingerprintManager) context.getSystemService(C0201.m82(30417));
    }

    public static boolean d(Context context) {
        FingerprintManager c2 = c(context);
        return c2 != null && c2.hasEnrolledFingerprints();
    }

    public static boolean e(Context context) {
        FingerprintManager c2 = c(context);
        return c2 != null && c2.isHardwareDetected();
    }

    /* access modifiers changed from: private */
    public static d f(FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new d(cryptoObject.getMac());
        }
        return null;
    }

    private static FingerprintManager.AuthenticationCallback g(b bVar) {
        return new a(bVar);
    }

    private static FingerprintManager.CryptoObject h(d dVar) {
        if (dVar == null) {
            return null;
        }
        if (dVar.a() != null) {
            return new FingerprintManager.CryptoObject(dVar.a());
        }
        if (dVar.c() != null) {
            return new FingerprintManager.CryptoObject(dVar.c());
        }
        if (dVar.b() != null) {
            return new FingerprintManager.CryptoObject(dVar.b());
        }
        return null;
    }

    /* renamed from: yt2$d */
    /* compiled from: FingerprintManagerCompatApi23 */
    public static class d {
        private final Signature a;
        private final Cipher b;
        private final Mac c;

        public d(Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
        }

        public Cipher a() {
            return this.b;
        }

        public Mac b() {
            return this.c;
        }

        public Signature c() {
            return this.a;
        }

        public d(Cipher cipher) {
            this.b = cipher;
            this.a = null;
            this.c = null;
        }

        public d(Mac mac) {
            this.c = mac;
            this.b = null;
            this.a = null;
        }
    }
}
