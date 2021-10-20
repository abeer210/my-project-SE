package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: MemoryPooledByteBufferFactory */
public class y implements r60 {
    private final u60 a;
    private final v b;

    public y(v vVar, u60 u60) {
        this.b = vVar;
        this.a = u60;
    }

    public x f(InputStream inputStream, z zVar) throws IOException {
        this.a.a(inputStream, zVar);
        return zVar.a();
    }

    /* renamed from: g */
    public x c(InputStream inputStream) throws IOException {
        z zVar = new z(this.b);
        try {
            return f(inputStream, zVar);
        } finally {
            zVar.close();
        }
    }

    /* renamed from: h */
    public x d(InputStream inputStream, int i) throws IOException {
        z zVar = new z(this.b, i);
        try {
            return f(inputStream, zVar);
        } finally {
            zVar.close();
        }
    }

    /* renamed from: i */
    public x b(byte[] bArr) {
        z zVar = new z(this.b, bArr.length);
        try {
            zVar.write(bArr, 0, bArr.length);
            x k = zVar.a();
            zVar.close();
            return k;
        } catch (IOException e) {
            e60.a(e);
            throw null;
        } catch (Throwable th) {
            zVar.close();
            throw th;
        }
    }

    /* renamed from: j */
    public z a() {
        return new z(this.b);
    }

    /* renamed from: k */
    public z e(int i) {
        return new z(this.b, i);
    }
}
