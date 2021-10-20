package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import defpackage.w90;
import vigqyno.C0201;

/* compiled from: ImageResizeMode */
public class d {
    public static Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static w90.c b() {
        return w90.c.g;
    }

    public static w90.c c(String str) {
        if (C0201.m82(32093).equals(str)) {
            return w90.c.c;
        }
        if (C0201.m82(32094).equals(str)) {
            return w90.c.g;
        }
        if (C0201.m82(32095).equals(str)) {
            return w90.c.a;
        }
        if (C0201.m82(32096).equals(str)) {
            return w90.c.f;
        }
        if (C0201.m82(32097).equals(str)) {
            return h.j;
        }
        if (str == null) {
            return b();
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(32098) + str + C0201.m82(32099));
    }

    public static Shader.TileMode d(String str) {
        if (C0201.m82(32100).equals(str) || C0201.m82(32101).equals(str) || C0201.m82(32102).equals(str) || C0201.m82(32103).equals(str)) {
            return Shader.TileMode.CLAMP;
        }
        if (C0201.m82(32104).equals(str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str == null) {
            return a();
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(32105) + str + C0201.m82(32106));
    }
}
