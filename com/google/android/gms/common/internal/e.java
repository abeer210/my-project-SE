package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class e {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;
    private final Map<com.google.android.gms.common.api.a<?>, b> d;
    private final View e;
    private final String f;
    private final String g;
    private final bs1 h;
    private final boolean i;
    private Integer j;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class a {
        private Account a;
        private s0<Scope> b;
        private Map<com.google.android.gms.common.api.a<?>, b> c;
        private int d = 0;
        private View e;
        private String f;
        private String g;
        private bs1 h = bs1.j;
        private boolean i;

        public final a a(Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new s0<>();
            }
            this.b.addAll(collection);
            return this;
        }

        public final e b() {
            return new e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final a c(Account account) {
            this.a = account;
            return this;
        }

        public final a d(String str) {
            this.g = str;
            return this;
        }

        public final a e(String str) {
            this.f = str;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class b {
        public final Set<Scope> a;
    }

    public e(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, bs1 bs1, boolean z) {
        this.a = account;
        this.b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.emptyMap() : map;
        this.e = view;
        this.f = str;
        this.g = str2;
        this.h = bs1;
        this.i = z;
        HashSet hashSet = new HashSet(this.b);
        for (b bVar : this.d.values()) {
            hashSet.addAll(bVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public final Account a() {
        return this.a;
    }

    @Deprecated
    public final String b() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public final Account c() {
        Account account = this.a;
        if (account != null) {
            return account;
        }
        return new Account(C0201.m82(7983), C0201.m82(7984));
    }

    public final Set<Scope> d() {
        return this.c;
    }

    public final Set<Scope> e(com.google.android.gms.common.api.a<?> aVar) {
        b bVar = this.d.get(aVar);
        if (bVar == null || bVar.a.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(bVar.a);
        return hashSet;
    }

    public final Integer f() {
        return this.j;
    }

    public final Map<com.google.android.gms.common.api.a<?>, b> g() {
        return this.d;
    }

    public final String h() {
        return this.g;
    }

    public final String i() {
        return this.f;
    }

    public final Set<Scope> j() {
        return this.b;
    }

    public final bs1 k() {
        return this.h;
    }

    public final boolean l() {
        return this.i;
    }

    public final void m(Integer num) {
        this.j = num;
    }
}
