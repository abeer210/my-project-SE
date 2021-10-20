package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import vigqyno.C0201;

/* renamed from: pb2  reason: default package */
public class pb2 implements lb2 {
    private final Context a;
    private final String b;

    public pb2(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private static String b(String str) {
        String r0 = C0201.m82(19339);
        try {
            return C0201.m82(19340) + mb2.a(c(str.getBytes(C0201.m82(19341))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return r0;
        }
    }

    private static byte[] c(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(C0201.m82(19342)).digest(bArr);
    }

    @Override // defpackage.lb2
    public String a(String str, String str2) {
        int identifier;
        String b2 = b(str);
        if (TextUtils.isEmpty(b2) || (identifier = this.a.getResources().getIdentifier(b2, C0201.m82(19343), this.b)) == 0) {
            return str2;
        }
        try {
            return this.a.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return str2;
        }
    }
}
