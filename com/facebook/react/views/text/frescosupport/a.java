package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.o;
import com.facebook.react.views.text.z;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: FrescoBasedReactTextInlineImageShadowNode */
public class a extends o {
    private Uri a;
    private ReadableMap b;
    private final x80 c;
    private final Object d;
    private float e = Float.NaN;
    private String f;
    private float g = Float.NaN;
    private int h = 0;

    public a(x80 x80, Object obj) {
        this.c = x80;
        this.d = obj;
    }

    private static Uri f(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String replace = str.toLowerCase(Locale.getDefault()).replace(C0201.m82(32665), C0201.m82(32666));
        return new Uri.Builder().scheme(C0201.m82(32668)).path(String.valueOf(context.getResources().getIdentifier(replace, C0201.m82(32667), context.getPackageName()))).build();
    }

    @Override // com.facebook.react.views.text.o
    public z b() {
        return new b(getThemedContext().getResources(), (int) Math.ceil((double) this.g), (int) Math.ceil((double) this.e), this.h, g(), e(), d(), c(), this.f);
    }

    public Object c() {
        return this.d;
    }

    public x80 d() {
        return this.c;
    }

    public ReadableMap e() {
        return this.b;
    }

    public Uri g() {
        return this.a;
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public boolean isVirtual() {
        return true;
    }

    @xj0(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.b = readableMap;
    }

    @Override // com.facebook.react.uimanager.i
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.g = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(32669));
    }

    @xj0(name = "resizeMode")
    public void setResizeMode(String str) {
        this.f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r1.getScheme() == null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    @xj0(name = "src")
    public void setSource(ReadableArray readableArray) {
        Uri parse;
        Uri uri = null;
        String string = (readableArray == null || readableArray.size() == 0) ? null : readableArray.getMap(0).getString(C0201.m82(32670));
        if (string != null) {
            try {
                parse = Uri.parse(string);
            } catch (Exception unused) {
            }
        }
        if (uri != this.a) {
            markUpdated();
        }
        this.a = uri;
        uri = parse;
        if (uri == null) {
            uri = f(getThemedContext(), string);
        }
        if (uri != this.a) {
        }
        this.a = uri;
        if (uri == null) {
        }
        if (uri != this.a) {
        }
        this.a = uri;
    }

    @xj0(name = "tintColor")
    public void setTintColor(int i) {
        this.h = i;
    }

    @Override // com.facebook.react.uimanager.i
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.e = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(32671));
    }
}
