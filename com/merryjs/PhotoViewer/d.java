package com.merryjs.PhotoViewer;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.stfalcon.frescoimageviewer.b;
import vigqyno.C0201;

/* compiled from: MerryPhotoView */
public class d extends View {
    private c a;
    public b.c b;
    public b[] c;
    public String d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* compiled from: MerryPhotoView */
    class a implements b.e<b> {
        public a() {
        }

        /* renamed from: b */
        public String a(b bVar) {
            return bVar.a.getString(C0201.m82(27027));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MerryPhotoView */
    public class b implements b.g {
        public b() {
        }

        @Override // com.stfalcon.frescoimageviewer.b.g
        public void a(int i) {
            b bVar = d.this.getData()[i];
            d.this.a.setShareContext(bVar.a.getString(C0201.m82(27047)));
            d.this.a.setDescription(bVar.c);
            d.this.a.setTitleText(bVar.b);
            if (d.this.getShareText() != null) {
                d.this.a.setShareText(d.this.getShareText());
            }
            d.this.a.setHideShareButton(Boolean.valueOf(d.this.d()));
            d.this.a.setHideCloseButton(Boolean.valueOf(d.this.c()));
            d.this.a.setHideTitle(Boolean.valueOf(d.this.f()));
            c cVar = d.this.a;
            cVar.setPagerText((i + 1) + C0201.m82(27048) + d.this.getData().length);
            int i2 = bVar.d;
            int i3 = -1;
            if (i2 == 0) {
                i2 = -1;
            }
            d.this.a.setTitleTextColor(i2);
            int i4 = bVar.e;
            if (i4 != 0) {
                i3 = i4;
            }
            d.this.a.setDescriptionTextColor(i3);
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(27049), bVar.b);
            createMap.putString(C0201.m82(27050), bVar.c);
            createMap.putInt(C0201.m82(27051), bVar.e);
            createMap.putInt(C0201.m82(27052), bVar.d);
            createMap.putMap(C0201.m82(27053), h.e(bVar.a));
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putMap(C0201.m82(27054), createMap);
            createMap2.putInt(C0201.m82(27055), i);
            d.this.h(createMap2);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MerryPhotoView */
    public class c implements b.f {
        public c() {
        }

        @Override // com.stfalcon.frescoimageviewer.b.f
        public void onDismiss() {
            d.this.g();
        }
    }

    public d(Context context) {
        super(context);
    }

    private b.f getDismissListener() {
        return new c();
    }

    private b.g getImageChangeListener() {
        return new b();
    }

    private jh0 getLocalImage() {
        return jh0.r(new nl0(getContext(), C0201.m82(24698)).e());
    }

    private ca0 i() {
        ca0 u = ca0.u(getResources());
        u.F(new a());
        return u;
    }

    public void b() {
        if (this.b == null) {
            Context context = getContext();
            b.c cVar = new b.c(context, getData());
            cVar.r(new a());
            cVar.t(getDismissListener());
            this.b = cVar;
            cVar.s(getImageChangeListener());
            this.b.v(getInitial());
            this.b.p(e());
            this.b.q(i());
            c cVar2 = new c(context);
            this.a = cVar2;
            this.b.u(cVar2);
            com.stfalcon.frescoimageviewer.b o = this.b.o();
            this.a.setImageViewer(o);
            o.d();
        }
    }

    public boolean c() {
        return this.i;
    }

    public boolean d() {
        return this.g;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.h;
    }

    public void g() {
        Context context = getContext();
        this.b = null;
        this.a = null;
        if (context instanceof ReactContext) {
            ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), C0201.m82(24699), null);
        }
    }

    public b[] getData() {
        return this.c;
    }

    public int getInitial() {
        return this.e;
    }

    public String getShareText() {
        return this.d;
    }

    public void h(WritableMap writableMap) {
        Context context = getContext();
        if (context instanceof ReactContext) {
            ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), C0201.m82(24700), writableMap);
        }
    }

    public d j(b[] bVarArr) {
        this.c = bVarArr;
        return this;
    }

    public d k(boolean z) {
        this.i = z;
        return this;
    }

    public d l(boolean z) {
        this.g = z;
        return this;
    }

    public d m(boolean z) {
        this.f = z;
        return this;
    }

    public d n(boolean z) {
        this.h = z;
        return this;
    }

    public d o(int i2) {
        this.e = i2;
        return this;
    }

    public d p(String str) {
        this.d = str;
        return this;
    }
}
