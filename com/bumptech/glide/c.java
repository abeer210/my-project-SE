package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import defpackage.ch;
import defpackage.eh;
import defpackage.ek;
import defpackage.gk;
import defpackage.hk;
import defpackage.ik;
import defpackage.jk;
import defpackage.kk;
import defpackage.lk;
import defpackage.mj;
import defpackage.mk;
import defpackage.nj;
import defpackage.nk;
import defpackage.ok;
import defpackage.pj;
import defpackage.pk;
import defpackage.qj;
import defpackage.rj;
import defpackage.vl;
import defpackage.wj;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: Glide */
public class c implements ComponentCallbacks2 {
    private static volatile c i;
    private static volatile boolean j;
    private final qi a;
    private final hj b;
    private final e c;
    private final i d;
    private final ni e;
    private final gn f;
    private final ym g;
    private final List<k> h = new ArrayList();

    /* compiled from: Glide */
    public interface a {
        ao a();
    }

    public c(Context context, wh whVar, hj hjVar, qi qiVar, ni niVar, gn gnVar, ym ymVar, int i2, a aVar, Map<Class<?>, l<?, ?>> map, List<zn<Object>> list, boolean z, boolean z2) {
        k kVar;
        k kVar2;
        Object obj;
        f fVar = f.NORMAL;
        this.a = qiVar;
        this.e = niVar;
        this.b = hjVar;
        this.f = gnVar;
        this.g = ymVar;
        Resources resources = context.getResources();
        i iVar = new i();
        this.d = iVar;
        iVar.o(new dl());
        if (Build.VERSION.SDK_INT >= 27) {
            this.d.o(new il());
        }
        List<ImageHeaderParser> g2 = this.d.g();
        em emVar = new em(context, g2, qiVar, niVar);
        k<ParcelFileDescriptor, Bitmap> h2 = ul.h(qiVar);
        fl flVar = new fl(this.d.g(), resources.getDisplayMetrics(), qiVar, niVar);
        if (!z2 || Build.VERSION.SDK_INT < 28) {
            kVar = new zk(flVar);
            kVar2 = new rl(flVar, niVar);
        } else {
            kVar2 = new ml();
            kVar = new al();
        }
        am amVar = new am(context);
        ek.c cVar = new ek.c(resources);
        ek.d dVar = new ek.d(resources);
        ek.b bVar = new ek.b(resources);
        ek.a aVar2 = new ek.a(resources);
        vk vkVar = new vk(niVar);
        om omVar = new om();
        rm rmVar = new rm();
        ContentResolver contentResolver = context.getContentResolver();
        i iVar2 = this.d;
        iVar2.a(ByteBuffer.class, new oj());
        iVar2.a(InputStream.class, new fk(niVar));
        String r15 = C0201.m82(5843);
        iVar2.e(r15, ByteBuffer.class, Bitmap.class, kVar);
        iVar2.e(r15, InputStream.class, Bitmap.class, kVar2);
        if (eh.c()) {
            obj = ng.class;
            this.d.e(r15, ParcelFileDescriptor.class, Bitmap.class, new ol(flVar));
        } else {
            obj = ng.class;
        }
        i iVar3 = this.d;
        iVar3.e(r15, ParcelFileDescriptor.class, Bitmap.class, h2);
        iVar3.e(r15, AssetFileDescriptor.class, Bitmap.class, ul.c(qiVar));
        iVar3.d(Bitmap.class, Bitmap.class, hk.a.b());
        iVar3.e(r15, Bitmap.class, Bitmap.class, new tl());
        iVar3.b(Bitmap.class, vkVar);
        tk tkVar = new tk(resources, kVar);
        String r12 = C0201.m82(5844);
        iVar3.e(r12, ByteBuffer.class, BitmapDrawable.class, tkVar);
        iVar3.e(r12, InputStream.class, BitmapDrawable.class, new tk(resources, kVar2));
        iVar3.e(r12, ParcelFileDescriptor.class, BitmapDrawable.class, new tk(resources, h2));
        iVar3.b(BitmapDrawable.class, new uk(qiVar, vkVar));
        nm nmVar = new nm(g2, emVar, niVar);
        String r7 = C0201.m82(5845);
        iVar3.e(r7, InputStream.class, gm.class, nmVar);
        iVar3.e(r7, ByteBuffer.class, gm.class, emVar);
        iVar3.b(gm.class, new hm());
        iVar3.d(obj, obj, hk.a.b());
        iVar3.e(r15, obj, Bitmap.class, new lm(qiVar));
        iVar3.c(Uri.class, Drawable.class, amVar);
        iVar3.c(Uri.class, Bitmap.class, new ql(amVar, qiVar));
        iVar3.p(new vl.a());
        iVar3.d(File.class, ByteBuffer.class, new pj.b());
        iVar3.d(File.class, InputStream.class, new rj.e());
        iVar3.c(File.class, File.class, new cm());
        iVar3.d(File.class, ParcelFileDescriptor.class, new rj.b());
        iVar3.d(File.class, File.class, hk.a.b());
        iVar3.p(new ch.a(niVar));
        if (eh.c()) {
            this.d.p(new eh.a());
        }
        i iVar4 = this.d;
        iVar4.d(Integer.TYPE, InputStream.class, cVar);
        iVar4.d(Integer.TYPE, ParcelFileDescriptor.class, bVar);
        iVar4.d(Integer.class, InputStream.class, cVar);
        iVar4.d(Integer.class, ParcelFileDescriptor.class, bVar);
        iVar4.d(Integer.class, Uri.class, dVar);
        iVar4.d(Integer.TYPE, AssetFileDescriptor.class, aVar2);
        iVar4.d(Integer.class, AssetFileDescriptor.class, aVar2);
        iVar4.d(Integer.TYPE, Uri.class, dVar);
        iVar4.d(String.class, InputStream.class, new qj.c());
        iVar4.d(Uri.class, InputStream.class, new qj.c());
        iVar4.d(String.class, InputStream.class, new gk.c());
        iVar4.d(String.class, ParcelFileDescriptor.class, new gk.b());
        iVar4.d(String.class, AssetFileDescriptor.class, new gk.a());
        iVar4.d(Uri.class, InputStream.class, new lk.a());
        iVar4.d(Uri.class, InputStream.class, new mj.c(context.getAssets()));
        iVar4.d(Uri.class, ParcelFileDescriptor.class, new mj.b(context.getAssets()));
        iVar4.d(Uri.class, InputStream.class, new mk.a(context));
        iVar4.d(Uri.class, InputStream.class, new nk.a(context));
        if (Build.VERSION.SDK_INT >= 29) {
            this.d.d(Uri.class, InputStream.class, new ok.c(context));
            this.d.d(Uri.class, ParcelFileDescriptor.class, new ok.b(context));
        }
        i iVar5 = this.d;
        iVar5.d(Uri.class, InputStream.class, new ik.d(contentResolver));
        iVar5.d(Uri.class, ParcelFileDescriptor.class, new ik.b(contentResolver));
        iVar5.d(Uri.class, AssetFileDescriptor.class, new ik.a(contentResolver));
        iVar5.d(Uri.class, InputStream.class, new jk.a());
        iVar5.d(URL.class, InputStream.class, new pk.a());
        iVar5.d(Uri.class, File.class, new wj.a(context));
        iVar5.d(sj.class, InputStream.class, new kk.a());
        iVar5.d(byte[].class, ByteBuffer.class, new nj.a());
        iVar5.d(byte[].class, InputStream.class, new nj.d());
        iVar5.d(Uri.class, Uri.class, hk.a.b());
        iVar5.d(Drawable.class, Drawable.class, hk.a.b());
        iVar5.c(Drawable.class, Drawable.class, new bm());
        iVar5.q(Bitmap.class, BitmapDrawable.class, new pm(resources));
        iVar5.q(Bitmap.class, byte[].class, omVar);
        iVar5.q(Drawable.class, byte[].class, new qm(qiVar, omVar, rmVar));
        iVar5.q(gm.class, byte[].class, rmVar);
        if (Build.VERSION.SDK_INT >= 23) {
            k<ByteBuffer, Bitmap> d2 = ul.d(qiVar);
            this.d.c(ByteBuffer.class, Bitmap.class, d2);
            this.d.c(ByteBuffer.class, BitmapDrawable.class, new tk(resources, d2));
        }
        this.c = new e(context, niVar, this.d, new ko(), aVar, map, list, whVar, z, i2);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!j) {
            j = true;
            m(context, generatedAppGlideModule);
            j = false;
            return;
        }
        throw new IllegalStateException(C0201.m82(5846));
    }

    public static c c(Context context) {
        if (i == null) {
            GeneratedAppGlideModule d2 = d(context.getApplicationContext());
            synchronized (c.class) {
                if (i == null) {
                    a(context, d2);
                }
            }
        }
        return i;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName(C0201.m82(5847)).getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            String r1 = C0201.m82(5848);
            if (!Log.isLoggable(r1, 5)) {
                return null;
            }
            Log.w(r1, C0201.m82(5849));
            return null;
        } catch (InstantiationException e2) {
            q(e2);
            throw null;
        } catch (IllegalAccessException e3) {
            q(e3);
            throw null;
        } catch (NoSuchMethodException e4) {
            q(e4);
            throw null;
        } catch (InvocationTargetException e5) {
            q(e5);
            throw null;
        }
    }

    private static gn l(Context context) {
        ep.e(context, C0201.m82(5850));
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new d(), generatedAppGlideModule);
    }

    private static void n(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<mn> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new on(applicationContext).a();
        }
        String r2 = C0201.m82(5851);
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d2 = generatedAppGlideModule.d();
            Iterator<mn> it = emptyList.iterator();
            while (it.hasNext()) {
                mn next = it.next();
                if (d2.contains(next.getClass())) {
                    if (Log.isLoggable(r2, 3)) {
                        Log.d(r2, C0201.m82(5852) + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(r2, 3)) {
            Iterator<mn> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d(r2, C0201.m82(5853) + it2.next().getClass());
            }
        }
        dVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        for (mn mnVar : emptyList) {
            mnVar.a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c a2 = dVar.a(applicationContext);
        for (mn mnVar2 : emptyList) {
            try {
                mnVar2.b(applicationContext, a2, a2.d);
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException(C0201.m82(5854) + mnVar2.getClass().getName(), e2);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, a2, a2.d);
        }
        applicationContext.registerComponentCallbacks(a2);
        i = a2;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException(C0201.m82(5855), exc);
    }

    public static k t(Context context) {
        return l(context).e(context);
    }

    public void b() {
        fp.a();
        this.b.b();
        this.a.b();
        this.e.b();
    }

    public ni e() {
        return this.e;
    }

    public qi f() {
        return this.a;
    }

    public ym g() {
        return this.g;
    }

    public Context h() {
        return this.c.getBaseContext();
    }

    public e i() {
        return this.c;
    }

    public i j() {
        return this.d;
    }

    public gn k() {
        return this.f;
    }

    public void o(k kVar) {
        synchronized (this.h) {
            if (!this.h.contains(kVar)) {
                this.h.add(kVar);
            } else {
                throw new IllegalStateException(C0201.m82(5856));
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        b();
    }

    public void onTrimMemory(int i2) {
        r(i2);
    }

    public boolean p(no<?> noVar) {
        synchronized (this.h) {
            for (k kVar : this.h) {
                if (kVar.x(noVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void r(int i2) {
        fp.a();
        for (k kVar : this.h) {
            kVar.onTrimMemory(i2);
        }
        this.b.a(i2);
        this.a.a(i2);
        this.e.a(i2);
    }

    public void s(k kVar) {
        synchronized (this.h) {
            if (this.h.contains(kVar)) {
                this.h.remove(kVar);
            } else {
                throw new IllegalStateException(C0201.m82(5857));
            }
        }
    }
}
