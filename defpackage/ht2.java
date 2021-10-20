package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import vigqyno.C0201;

/* renamed from: ht2  reason: default package */
/* compiled from: MessageDigests */
public final class ht2 {
    public static MessageDigest a() {
        try {
            return MessageDigest.getInstance(C0201.m82(38344));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static MessageDigest b() {
        try {
            return MessageDigest.getInstance(C0201.m82(38345));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
