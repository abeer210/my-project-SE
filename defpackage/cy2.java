package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: cy2  reason: default package */
/* compiled from: BufferedSource */
public interface cy2 extends ty2, ReadableByteChannel {
    boolean D0(long j) throws IOException;

    byte[] I() throws IOException;

    long J(dy2 dy2) throws IOException;

    String J0() throws IOException;

    int K0() throws IOException;

    ay2 L();

    boolean M() throws IOException;

    byte[] O0(long j) throws IOException;

    void S(ay2 ay2, long j) throws IOException;

    short T0() throws IOException;

    long W(dy2 dy2) throws IOException;

    long X0(sy2 sy2) throws IOException;

    long Y() throws IOException;

    void b(long j) throws IOException;

    String b0(long j) throws IOException;

    void b1(long j) throws IOException;

    @Deprecated
    ay2 d();

    long f1(byte b) throws IOException;

    long i1() throws IOException;

    InputStream j1();

    int k1(ky2 ky2) throws IOException;

    boolean o0(long j, dy2 dy2) throws IOException;

    String p0(Charset charset) throws IOException;

    dy2 q(long j) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;
}
