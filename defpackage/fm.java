package defpackage;

import android.graphics.Bitmap;
import defpackage.ng;

/* renamed from: fm  reason: default package */
/* compiled from: GifBitmapProvider */
public final class fm implements ng.a {
    private final qi a;
    private final ni b;

    public fm(qi qiVar, ni niVar) {
        this.a = qiVar;
        this.b = niVar;
    }

    @Override // defpackage.ng.a
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.a.e(i, i2, config);
    }

    @Override // defpackage.ng.a
    public int[] b(int i) {
        ni niVar = this.b;
        if (niVar == null) {
            return new int[i];
        }
        return (int[]) niVar.e(i, int[].class);
    }

    @Override // defpackage.ng.a
    public void c(Bitmap bitmap) {
        this.a.c(bitmap);
    }

    @Override // defpackage.ng.a
    public void d(byte[] bArr) {
        ni niVar = this.b;
        if (niVar != null) {
            niVar.c(bArr);
        }
    }

    @Override // defpackage.ng.a
    public byte[] e(int i) {
        ni niVar = this.b;
        if (niVar == null) {
            return new byte[i];
        }
        return (byte[]) niVar.e(i, byte[].class);
    }

    @Override // defpackage.ng.a
    public void f(int[] iArr) {
        ni niVar = this.b;
        if (niVar != null) {
            niVar.c(iArr);
        }
    }
}
