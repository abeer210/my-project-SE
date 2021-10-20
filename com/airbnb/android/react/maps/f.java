package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.a0;
import com.google.android.gms.maps.model.b0;
import com.google.android.gms.maps.model.c0;
import com.google.android.gms.maps.model.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import vigqyno.C0201;

/* compiled from: AirMapLocalTile */
public class f extends c {
    private b0 a;
    private a0 b;
    private a c;
    private String d;
    private float e;
    private float f;

    /* access modifiers changed from: package-private */
    /* compiled from: AirMapLocalTile */
    public class a implements c0 {
        private int b;
        private String c;

        public a(int i, String str) {
            this.b = i;
            this.c = str;
        }

        private String a(int i, int i2, int i3) {
            return this.c.replace(C0201.m82(17900), Integer.toString(i)).replace(C0201.m82(17901), Integer.toString(i2)).replace(C0201.m82(17902), Integer.toString(i3));
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|(2:8|(1:10)(1:63))|11|12|13|14|15|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002e */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x004e A[SYNTHETIC, Splitter:B:33:0x004e] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0055 A[SYNTHETIC, Splitter:B:37:0x0055] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0061 A[SYNTHETIC, Splitter:B:45:0x0061] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0068 A[SYNTHETIC, Splitter:B:49:0x0068] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x006f A[SYNTHETIC, Splitter:B:55:0x006f] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0076 A[SYNTHETIC, Splitter:B:59:0x0076] */
        private byte[] b(int i, int i2, int i3) {
            ByteArrayOutputStream byteArrayOutputStream;
            FileInputStream fileInputStream;
            Throwable th;
            IOException e;
            OutOfMemoryError e2;
            try {
                fileInputStream = new FileInputStream(new File(a(i, i2, i3)));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException e3) {
                    e = e3;
                    byteArrayOutputStream = null;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    return null;
                } catch (OutOfMemoryError e4) {
                    e2 = e4;
                    byteArrayOutputStream = null;
                    try {
                        e2.printStackTrace();
                        if (fileInputStream != null) {
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    byteArrayOutputStream = null;
                    th = th3;
                    if (fileInputStream != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    throw th;
                }
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 16384);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (IOException e5) {
                    e = e5;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    return null;
                } catch (OutOfMemoryError e6) {
                    e2 = e6;
                    e2.printStackTrace();
                    if (fileInputStream != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                fileInputStream = null;
                byteArrayOutputStream = null;
                e.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                return null;
            } catch (OutOfMemoryError e8) {
                e2 = e8;
                fileInputStream = null;
                byteArrayOutputStream = null;
                e2.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                return null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                fileInputStream = null;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused5) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused6) {
                    }
                }
                throw th;
            }
        }

        public void c(String str) {
            this.c = str;
        }

        public void d(int i) {
            this.b = i;
        }

        @Override // com.google.android.gms.maps.model.c0
        public z getTile(int i, int i2, int i3) {
            byte[] b2 = b(i, i2, i3);
            if (b2 == null) {
                return c0.a;
            }
            int i4 = this.b;
            return new z(i4, i4, b2);
        }
    }

    public f(Context context) {
        super(context);
    }

    private b0 h() {
        b0 b0Var = new b0();
        b0Var.y(this.f);
        a aVar = new a((int) this.e, this.d);
        this.c = aVar;
        b0Var.u(aVar);
        return b0Var;
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        this.b.b();
    }

    public void f(c cVar) {
        this.b = cVar.f(getTileOverlayOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.b;
    }

    public b0 getTileOverlayOptions() {
        if (this.a == null) {
            this.a = h();
        }
        return this.a;
    }

    public void setPathTemplate(String str) {
        this.d = str;
        a aVar = this.c;
        if (aVar != null) {
            aVar.c(str);
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setTileSize(float f2) {
        this.e = f2;
        a aVar = this.c;
        if (aVar != null) {
            aVar.d((int) f2);
        }
    }

    public void setZIndex(float f2) {
        this.f = f2;
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.d(f2);
        }
    }
}
