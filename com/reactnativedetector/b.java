package com.reactnativedetector;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import vigqyno.C0201;

/* compiled from: ScreenshotDetectionDelegate.kt */
public final class b {
    public ContentObserver a;
    private final Context b;
    private final c c;

    /* compiled from: ScreenshotDetectionDelegate.kt */
    public static final class a extends ContentObserver {
        public final /* synthetic */ b a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, Handler handler) {
            super(handler);
            this.a = bVar;
        }

        public void onChange(boolean z, Uri uri) {
            ow2.c(uri, C0201.m82(16685));
            super.onChange(z, uri);
            if (this.a.h()) {
                b bVar = this.a;
                String g = bVar.g(bVar.f(), uri);
                if (this.a.i(g)) {
                    b bVar2 = this.a;
                    if (g != null) {
                        bVar2.j(g);
                    } else {
                        ow2.f();
                        throw null;
                    }
                }
            } else {
                this.a.k();
            }
        }
    }

    public b(Context context, c cVar) {
        ow2.c(context, C0201.m82(21848));
        ow2.c(cVar, C0201.m82(21849));
        this.b = context;
        this.c = cVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final String g(Context context, Uri uri) {
        String r0 = C0201.m82(21850);
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{C0201.m82(21851), r0}, null, null, null);
            if (query == null || !query.moveToFirst()) {
                return null;
            }
            String string = query.getString(query.getColumnIndex(r0));
            query.close();
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean h() {
        return androidx.core.content.b.a(this.b, C0201.m82(21852)) == 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean i(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        ow2.b(lowerCase, C0201.m82(21853));
        return fx2.c(lowerCase, C0201.m82(21854), false, 2, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void j(String str) {
        this.c.onScreenCaptured(str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void k() {
        this.c.onScreenCapturedWithDeniedPermission();
    }

    public final Context f() {
        return this.b;
    }

    public final void l() {
        this.a = new a(this, new Handler());
        ContentResolver contentResolver = this.b.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ContentObserver contentObserver = this.a;
        if (contentObserver != null) {
            contentResolver.registerContentObserver(uri, true, contentObserver);
        } else {
            ow2.i(C0201.m82(21855));
            throw null;
        }
    }

    public final void m() {
        ContentResolver contentResolver = this.b.getContentResolver();
        ContentObserver contentObserver = this.a;
        if (contentObserver != null) {
            contentResolver.unregisterContentObserver(contentObserver);
        } else {
            ow2.i(C0201.m82(21856));
            throw null;
        }
    }
}
