package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import vigqyno.C0201;

/* compiled from: MinElf */
public final class i {

    /* access modifiers changed from: private */
    /* compiled from: MinElf */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: MinElf */
    public enum b {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        
        private final String a;

        private b(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public static String[] a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return b(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    public static String[] b(FileChannel fileChannel) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (f(fileChannel, allocate, 0) == 1179403647) {
            boolean z = true;
            if (g(fileChannel, allocate, 4) != 1) {
                z = false;
            }
            if (g(fileChannel, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long f = z ? f(fileChannel, allocate, 28) : c(fileChannel, allocate, 32);
            long e = z ? (long) e(fileChannel, allocate, 44) : (long) e(fileChannel, allocate, 56);
            int e2 = e(fileChannel, allocate, z ? 42 : 54);
            if (e == 65535) {
                long f2 = z ? f(fileChannel, allocate, 32) : c(fileChannel, allocate, 40);
                if (z) {
                    j10 = f(fileChannel, allocate, f2 + 28);
                } else {
                    j10 = f(fileChannel, allocate, f2 + 44);
                }
                e = j10;
            }
            long j11 = f;
            long j12 = 0;
            while (true) {
                if (j12 >= e) {
                    j = 0;
                    break;
                }
                if (z) {
                    j9 = f(fileChannel, allocate, j11 + 0);
                } else {
                    j9 = f(fileChannel, allocate, j11 + 0);
                }
                if (j9 == 2) {
                    j = z ? f(fileChannel, allocate, j11 + 4) : c(fileChannel, allocate, j11 + 8);
                } else {
                    j11 += (long) e2;
                    j12++;
                }
            }
            long j13 = 0;
            if (j != 0) {
                long j14 = j;
                long j15 = 0;
                int i = 0;
                while (true) {
                    long f3 = z ? f(fileChannel, allocate, j14 + j13) : c(fileChannel, allocate, j14 + j13);
                    String r6 = C0201.m82(20127);
                    if (f3 == 1) {
                        j2 = j;
                        if (i != Integer.MAX_VALUE) {
                            i++;
                        } else {
                            throw new a(r6);
                        }
                    } else {
                        j2 = j;
                        if (f3 == 5) {
                            j15 = z ? f(fileChannel, allocate, j14 + 4) : c(fileChannel, allocate, j14 + 8);
                        }
                    }
                    long j16 = 16;
                    j14 += z ? 8 : 16;
                    j13 = 0;
                    if (f3 != 0) {
                        z = z;
                        j = j2;
                    } else if (j15 != 0) {
                        int i2 = 0;
                        while (true) {
                            if (((long) i2) >= e) {
                                j3 = 0;
                                break;
                            }
                            if (z) {
                                j4 = f(fileChannel, allocate, f + j13);
                            } else {
                                j4 = f(fileChannel, allocate, f + j13);
                            }
                            if (j4 == 1) {
                                if (z) {
                                    j6 = f(fileChannel, allocate, f + 8);
                                } else {
                                    j6 = c(fileChannel, allocate, f + j16);
                                }
                                if (z) {
                                    j5 = e;
                                    j7 = f(fileChannel, allocate, f + 20);
                                } else {
                                    j5 = e;
                                    j7 = c(fileChannel, allocate, f + 40);
                                }
                                if (j6 <= j15 && j15 < j7 + j6) {
                                    if (z) {
                                        j8 = f(fileChannel, allocate, f + 4);
                                    } else {
                                        j8 = c(fileChannel, allocate, f + 8);
                                    }
                                    j3 = j8 + (j15 - j6);
                                }
                            } else {
                                j5 = e;
                            }
                            f += (long) e2;
                            i2++;
                            e = j5;
                            j16 = 16;
                            j13 = 0;
                        }
                        long j17 = 0;
                        if (j3 != 0) {
                            String[] strArr = new String[i];
                            int i3 = 0;
                            while (true) {
                                long j18 = j2 + j17;
                                long f4 = z ? f(fileChannel, allocate, j18) : c(fileChannel, allocate, j18);
                                if (f4 == 1) {
                                    strArr[i3] = d(fileChannel, allocate, (z ? f(fileChannel, allocate, j2 + 4) : c(fileChannel, allocate, j2 + 8)) + j3);
                                    if (i3 != Integer.MAX_VALUE) {
                                        i3++;
                                    } else {
                                        throw new a(r6);
                                    }
                                }
                                j2 += z ? 8 : 16;
                                if (f4 != 0) {
                                    j17 = 0;
                                } else if (i3 == i) {
                                    return strArr;
                                } else {
                                    throw new a(r6);
                                }
                            }
                        } else {
                            throw new a(C0201.m82(20128));
                        }
                    } else {
                        throw new a(C0201.m82(20129));
                    }
                }
            } else {
                throw new a(C0201.m82(20130));
            }
        } else {
            throw new a(C0201.m82(20131));
        }
    }

    private static long c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        h(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static String d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short g = g(fileChannel, byteBuffer, j);
            if (g == 0) {
                return sb.toString();
            }
            sb.append((char) g);
            j = j2;
        }
    }

    private static int e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        h(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    private static long f(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        h(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static short g(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        h(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    private static void h(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new a(C0201.m82(20132));
    }
}
