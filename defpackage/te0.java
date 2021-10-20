package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: te0  reason: default package */
/* compiled from: ProgressiveJpegParser */
public class te0 {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private boolean g;
    private final k60 h;

    public te0(k60 k60) {
        z50.g(k60);
        this.h = k60;
    }

    private boolean a(InputStream inputStream) {
        int read;
        int i = this.e;
        while (this.a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i2 = this.c + 1;
                this.c = i2;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i3 = this.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.a = 5;
                                } else if (i3 != 5) {
                                    z50.i(false);
                                } else {
                                    int i4 = ((this.b << 8) + read) - 2;
                                    f70.a(inputStream, (long) i4);
                                    this.c += i4;
                                    this.a = 2;
                                }
                            } else if (read == 255) {
                                this.a = 3;
                            } else if (read == 0) {
                                this.a = 2;
                            } else if (read == 217) {
                                this.g = true;
                                f(i2 - 2);
                                this.a = 2;
                            } else {
                                if (read == 218) {
                                    f(i2 - 2);
                                }
                                if (b(read)) {
                                    this.a = 4;
                                } else {
                                    this.a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.a = 3;
                        }
                    } else if (read == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (read == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = read;
            } catch (IOException e2) {
                e60.a(e2);
                throw null;
            }
        }
        if (this.a == 6 || this.e == i) {
            return false;
        }
        return true;
    }

    private static boolean b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    private void f(int i) {
        if (this.d > 0) {
            this.f = i;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        this.e = i2;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public boolean g(af0 af0) {
        if (this.a == 6 || af0.z() <= this.c) {
            return false;
        }
        p60 p60 = new p60(af0.w(), (byte[]) this.h.get(16384), this.h);
        try {
            f70.a(p60, (long) this.c);
            boolean a2 = a(p60);
            s50.b(p60);
            return a2;
        } catch (IOException e2) {
            e60.a(e2);
            throw null;
        } catch (Throwable th) {
            s50.b(p60);
            throw th;
        }
    }
}
