package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import vigqyno.C0201;

/* renamed from: w23  reason: default package */
/* compiled from: LazyConstructionEnumeration */
public class w23 implements Enumeration {
    private l03 a;
    private Object b = a();

    public w23(byte[] bArr) {
        this.a = new l03(bArr, true);
    }

    private Object a() {
        try {
            return this.a.s();
        } catch (IOException e) {
            throw new t03(C0201.m82(10421) + e, e);
        }
    }

    public boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.b;
        this.b = a();
        return obj;
    }
}
