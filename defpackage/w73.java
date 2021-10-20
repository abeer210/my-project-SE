package defpackage;

import java.security.Key;

/* renamed from: w73  reason: default package */
/* compiled from: JceGenericKey */
public class w73 extends p73 {
    public w73(o43 o43, Key key) {
        super(o43, b(key));
    }

    private static Object b(Key key) {
        byte[] encoded = key.getEncoded();
        return encoded != null ? encoded : key;
    }
}
