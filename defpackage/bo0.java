package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.h;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.api.a;
import vigqyno.C0201;

/* renamed from: bo0  reason: default package */
public final class bo0 {
    public static final a.g<os0> a = new a.g<>();
    public static final a.g<i> b = new a.g<>();
    private static final a.AbstractC0054a<os0, a> c = new jo0();
    private static final a.AbstractC0054a<i, GoogleSignInOptions> d = new ko0();
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> e = new com.google.android.gms.common.api.a<>(C0201.m82(26701), d, b);
    public static final com.google.android.gms.auth.api.signin.a f = new h();

    @Deprecated
    /* renamed from: bo0$a */
    public static class a implements a.d.c, a.d {
        private final boolean a;

        @Deprecated
        /* renamed from: bo0$a$a  reason: collision with other inner class name */
        public static class C0027a {
            public Boolean a = Boolean.FALSE;

            public a a() {
                return new a(this);
            }
        }

        static {
            new C0027a().a();
        }

        public a(C0027a aVar) {
            this.a = aVar.a.booleanValue();
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString(C0201.m82(36261), null);
            bundle.putBoolean(C0201.m82(36262), this.a);
            return bundle;
        }
    }

    static {
        com.google.android.gms.common.api.a<do0> aVar = co0.c;
        new com.google.android.gms.common.api.a(C0201.m82(26700), c, a);
        ho0 ho0 = co0.d;
    }
}
