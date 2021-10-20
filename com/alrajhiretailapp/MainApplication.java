package com.alrajhiretailapp;

import android.content.Context;
import cl.json.c;
import com.reactnativenavigation.react.y;
import io.invertase.firebase.notifications.e;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0179;
import vigqyno.C0201;

public class MainApplication extends nd2 implements c {
    private final vi0 d = new a(this, this);

    class a extends y {
        static {
            C0179.m19();
        }

        public a(MainApplication mainApplication, nd2 nd2) {
            super(nd2);
        }

        @Override // defpackage.vi0
        public String g() {
            return C0201.m82(2171);
        }

        @Override // defpackage.vi0
        public List<wi0> i() {
            ArrayList<wi0> a = new hi0(this).a();
            a.add(new c());
            a.add(new a());
            a.add(new com.alrajhiretailapp.rasp.a());
            a.add(new io.invertase.firebase.messaging.c());
            a.add(new e());
            a.add(new b());
            a.add(new pp2());
            a.add(new d());
            return a;
        }

        @Override // defpackage.vi0
        public boolean m() {
            return false;
        }
    }

    static {
        C0179.m19();
    }

    private static void g(Context context, si0 si0) {
    }

    @Override // defpackage.qi0
    public vi0 a() {
        return this.d;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        x4.k(this);
    }

    @Override // cl.json.c
    public String b() {
        return C0201.m82(18913);
    }

    @Override // defpackage.nd2
    public void onCreate() {
        w30.j(this);
        super.onCreate();
        g(this, a().j());
    }
}
