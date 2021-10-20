package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpUrlLoader */
public class c implements zj<sj, InputStream> {
    private final Call.Factory a;

    /* compiled from: OkHttpUrlLoader */
    public static class a implements ak<sj, InputStream> {
        private static volatile Call.Factory b;
        private final Call.Factory a;

        public a() {
            this(b());
        }

        private static Call.Factory b() {
            if (b == null) {
                synchronized (a.class) {
                    if (b == null) {
                        b = new OkHttpClient();
                    }
                }
            }
            return b;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<sj, InputStream> c(dk dkVar) {
            return new c(this.a);
        }

        public a(Call.Factory factory) {
            this.a = factory;
        }
    }

    public c(Call.Factory factory) {
        this.a = factory;
    }

    /* renamed from: c */
    public zj.a<InputStream> b(sj sjVar, int i, int i2, i iVar) {
        return new zj.a<>(sjVar, new b(this.a, sjVar));
    }

    /* renamed from: d */
    public boolean a(sj sjVar) {
        return true;
    }
}
