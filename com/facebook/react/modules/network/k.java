package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import vigqyno.C0201;

/* compiled from: ProgressiveStringDecoder */
public class k {
    private final CharsetDecoder a;
    private byte[] b = null;

    public k(Charset charset) {
        this.a = charset.newDecoder();
    }

    public String a(byte[] bArr, int i) {
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[(bArr2.length + i)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.b.length, i);
            i += this.b.length;
            bArr = bArr3;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        boolean z = true;
        CharBuffer charBuffer = null;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < 4) {
            try {
                charBuffer = this.a.decode(wrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z2 || i2 <= 0) {
            z = false;
        }
        if (z) {
            byte[] bArr4 = new byte[i2];
            this.b = bArr4;
            System.arraycopy(bArr, i - i2, bArr4, 0, i2);
        } else {
            this.b = null;
        }
        if (z2) {
            return new String(charBuffer.array(), 0, charBuffer.length());
        }
        f60.A(C0201.m82(9099), C0201.m82(9100));
        return C0201.m82(9101);
    }
}
