package com.huawei.updatesdk.a.b.b;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.c.d;
import com.huawei.updatesdk.b.c.c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import vigqyno.C0201;

public class b extends AsyncTask<Void, Void, Void> {
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    private String a = C0201.m82(7621);
    private HttpURLConnection b;
    private boolean c = false;
    private a d;
    private Handler e = new HandlerC0112b(null);

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (b.this.b != null) {
                b.this.c = true;
                b.this.b.disconnect();
            }
            d.a(new File(b.e()));
        }
    }

    /* renamed from: com.huawei.updatesdk.a.b.b.b$b  reason: collision with other inner class name */
    private static class HandlerC0112b extends Handler {
        private HandlerC0112b() {
        }

        public /* synthetic */ HandlerC0112b(a aVar) {
            this();
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof a) {
                a aVar = (a) obj;
                Intent intent = new Intent();
                com.huawei.updatesdk.a.b.c.b a = com.huawei.updatesdk.a.b.c.b.a(intent);
                int i = message.what;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            Context a2 = com.huawei.updatesdk.a.b.a.a.c().a();
                            com.huawei.updatesdk.b.d.a.a(a2, b.e() + C0201.m82(35207), aVar.c());
                        } else if (i != 5) {
                            return;
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(C0201.m82(35208), message.what);
                    intent.putExtras(bundle);
                    c.b().b(a);
                    return;
                }
                intent.putExtra(C0201.m82(35209), aVar.e());
                intent.putExtra(C0201.m82(35210), aVar.a());
                c.b().a(a);
            }
        }
    }

    static {
        C0201.m83(b.class, 23);
    }

    public b(a aVar) {
        this.d = aVar;
        if (!TextUtils.isEmpty(aVar.c())) {
            this.a = aVar.c();
        }
    }

    private void a(int i, long j, String str, int i2) {
        a aVar = new a();
        aVar.a(i);
        aVar.a(j);
        aVar.a(str);
        Handler handler = this.e;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(i2, aVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[SYNTHETIC, Splitter:B:31:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    private void a(a aVar, String str) {
        Throwable th;
        FileNotFoundException e2;
        Exception e3;
        String r0 = C0201.m82(7622);
        String r1 = C0201.m82(7623);
        if (aVar != null && !TextUtils.isEmpty(aVar.b())) {
            String str2 = str + C0201.m82(7624);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str2));
                try {
                    if (!a(aVar, fileOutputStream2, str2)) {
                        d.a(new File(e()));
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                        com.huawei.updatesdk.a.a.b.a.a.a.b(r1, r0);
                    }
                } catch (FileNotFoundException e4) {
                    e2 = e4;
                    fileOutputStream = fileOutputStream2;
                    com.huawei.updatesdk.a.a.b.a.a.a.b(r1, C0201.m82(7626) + e2.toString());
                    if (fileOutputStream == null) {
                        return;
                    }
                    fileOutputStream.close();
                } catch (Exception e5) {
                    e3 = e5;
                    fileOutputStream = fileOutputStream2;
                    try {
                        com.huawei.updatesdk.a.a.b.a.a.a.b(r1, C0201.m82(7625) + e3.toString());
                        if (fileOutputStream == null) {
                            return;
                        }
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                            com.huawei.updatesdk.a.a.b.a.a.a.b(r1, r0);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e6) {
                e2 = e6;
                com.huawei.updatesdk.a.a.b.a.a.a.b(r1, C0201.m82(7626) + e2.toString());
                if (fileOutputStream == null) {
                }
                fileOutputStream.close();
            } catch (Exception e7) {
                e3 = e7;
                com.huawei.updatesdk.a.a.b.a.a.a.b(r1, C0201.m82(7625) + e3.toString());
                if (fileOutputStream == null) {
                }
                fileOutputStream.close();
            }
        }
    }

    private void a(InputStream inputStream, OutputStream outputStream) {
        String r0 = C0201.m82(7627);
        String r1 = C0201.m82(7628);
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                com.huawei.updatesdk.a.a.b.a.a.a.b(r0, r1 + e2.toString());
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e3) {
                com.huawei.updatesdk.a.a.b.a.a.a.b(r0, r1 + e3.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee A[SYNTHETIC, Splitter:B:64:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0118  */
    private boolean a(a aVar, OutputStream outputStream, String str) {
        InputStream inputStream;
        Throwable th;
        boolean z;
        Exception e2;
        BufferedOutputStream bufferedOutputStream;
        Throwable th2;
        int i;
        boolean z2;
        int i2;
        String str2;
        int i3;
        boolean z3 = false;
        OutputStream outputStream2 = null;
        long j = -1;
        int i4 = 0;
        try {
            HttpURLConnection a2 = c.a().a(aVar.b());
            this.b = a2;
            if (a2 == null) {
                boolean z4 = this.c;
                str2 = this.a;
                i4 = 0;
                j = -1;
                i3 = z4 ? 3 : 5;
            } else {
                a2.connect();
                int e3 = w30.e(this.b);
                if (200 == e3 || 206 == e3) {
                    long j2 = aVar.e();
                    try {
                        inputStream = new BufferedInputStream(w30.a(this.b), 8192);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
                            try {
                                byte[] bArr = new byte[8192];
                                long j3 = 0;
                                int i5 = 0;
                                while (true) {
                                    try {
                                        int read = inputStream.read(bArr);
                                        if (read != -1) {
                                            try {
                                                bufferedOutputStream.write(bArr, 0, read);
                                                i5 += read;
                                                if (Math.abs(System.currentTimeMillis() - j3) > 1000) {
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    if (((long) i5) != j2) {
                                                        i = i5;
                                                        try {
                                                            a(i5, j2, this.a, 2);
                                                        } catch (Throwable th3) {
                                                            th2 = th3;
                                                        }
                                                    } else {
                                                        i = i5;
                                                    }
                                                    j3 = currentTimeMillis;
                                                    i5 = i;
                                                }
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                                i4 = i5;
                                                try {
                                                    a(inputStream, bufferedOutputStream);
                                                    try {
                                                        throw th2;
                                                    } catch (Exception e4) {
                                                        e2 = e4;
                                                        i5 = i4;
                                                        inputStream = null;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        i5 = i4;
                                                        inputStream = null;
                                                        i4 = i5;
                                                        j = j2;
                                                        if (!z3) {
                                                        }
                                                        a(inputStream, outputStream2);
                                                        com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                        d();
                                                        throw th;
                                                    }
                                                } catch (Exception e5) {
                                                    e2 = e5;
                                                    i5 = i4;
                                                    outputStream2 = bufferedOutputStream;
                                                    i4 = i5;
                                                    j = j2;
                                                    z = false;
                                                    try {
                                                        com.huawei.updatesdk.a.a.b.a.a.a.b(g, h + e2.toString());
                                                        if (!z) {
                                                        }
                                                        a(inputStream, outputStream2);
                                                        com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                        d();
                                                        return false;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        z3 = z;
                                                        i5 = i4;
                                                        j2 = j;
                                                        i4 = i5;
                                                        j = j2;
                                                        if (!z3) {
                                                        }
                                                        a(inputStream, outputStream2);
                                                        com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                        d();
                                                        throw th;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    i5 = i4;
                                                    outputStream2 = bufferedOutputStream;
                                                    i4 = i5;
                                                    j = j2;
                                                    if (!z3) {
                                                    }
                                                    a(inputStream, outputStream2);
                                                    com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                    d();
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            try {
                                                break;
                                            } catch (Exception e6) {
                                                e2 = e6;
                                                outputStream2 = bufferedOutputStream;
                                                i4 = i5;
                                                j = j2;
                                                z = false;
                                                com.huawei.updatesdk.a.a.b.a.a.a.b(g, h + e2.toString());
                                                if (!z) {
                                                }
                                                a(inputStream, outputStream2);
                                                com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                d();
                                                return false;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                outputStream2 = bufferedOutputStream;
                                                i4 = i5;
                                                j = j2;
                                                if (!z3) {
                                                }
                                                a(inputStream, outputStream2);
                                                com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                d();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                        i = i5;
                                        i4 = i;
                                        a(inputStream, bufferedOutputStream);
                                        throw th2;
                                    }
                                }
                                a(inputStream, bufferedOutputStream);
                                if (((long) i5) == j2 && j2 > 0) {
                                    try {
                                        if (!TextUtils.isEmpty(aVar.d()) && aVar.d().equalsIgnoreCase(d.a(str, f))) {
                                            z2 = true;
                                            if (!z2) {
                                                try {
                                                    i2 = i5;
                                                    try {
                                                        a(i5, j2, this.a, 4);
                                                    } catch (Exception e7) {
                                                        e2 = e7;
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        z3 = z2;
                                                        i5 = i2;
                                                        inputStream = null;
                                                        i4 = i5;
                                                        j = j2;
                                                        if (!z3) {
                                                        }
                                                        a(inputStream, outputStream2);
                                                        com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                        d();
                                                        throw th;
                                                    }
                                                } catch (Exception e8) {
                                                    e2 = e8;
                                                    i2 = i5;
                                                    j = j2;
                                                    z = z2;
                                                    i4 = i2;
                                                    inputStream = null;
                                                    com.huawei.updatesdk.a.a.b.a.a.a.b(g, h + e2.toString());
                                                    if (!z) {
                                                        a(i4, j, this.a, this.c ? 3 : 5);
                                                    }
                                                    a(inputStream, outputStream2);
                                                    com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                    d();
                                                    return false;
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    z3 = z2;
                                                    inputStream = null;
                                                    i4 = i5;
                                                    j = j2;
                                                    if (!z3) {
                                                        a(i4, j, this.a, this.c ? 3 : 5);
                                                    }
                                                    a(inputStream, outputStream2);
                                                    com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                                    d();
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i5;
                                            }
                                            if (!z2) {
                                                a(i2, j2, this.a, this.c ? 3 : 5);
                                            }
                                            a((InputStream) null, (OutputStream) null);
                                            com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                            d();
                                            return z2;
                                        }
                                    } catch (Exception e9) {
                                        e2 = e9;
                                        i4 = i5;
                                        inputStream = null;
                                        j = j2;
                                        z = false;
                                        com.huawei.updatesdk.a.a.b.a.a.a.b(g, h + e2.toString());
                                        if (!z) {
                                        }
                                        a(inputStream, outputStream2);
                                        com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                        d();
                                        return false;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        i4 = i5;
                                        inputStream = null;
                                        j = j2;
                                        if (!z3) {
                                        }
                                        a(inputStream, outputStream2);
                                        com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                        d();
                                        throw th;
                                    }
                                }
                                z2 = false;
                                if (!z2) {
                                }
                                if (!z2) {
                                }
                                a((InputStream) null, (OutputStream) null);
                                com.huawei.updatesdk.b.e.a.b.a().remove(this);
                                d();
                                return z2;
                            } catch (Throwable th13) {
                                th2 = th13;
                                a(inputStream, bufferedOutputStream);
                                throw th2;
                            }
                        } catch (Throwable th14) {
                            th2 = th14;
                            bufferedOutputStream = null;
                            a(inputStream, bufferedOutputStream);
                            throw th2;
                        }
                    } catch (Throwable th15) {
                        th2 = th15;
                        inputStream = null;
                        bufferedOutputStream = null;
                        a(inputStream, bufferedOutputStream);
                        throw th2;
                    }
                } else {
                    boolean z5 = this.c;
                    str2 = this.a;
                    if (z5) {
                        i3 = 3;
                    } else {
                        i4 = 0;
                        j = -1;
                        i3 = 5;
                    }
                }
            }
            a(i4, j, str2, i3);
            a((InputStream) null, (OutputStream) null);
        } catch (Exception e10) {
            e2 = e10;
            inputStream = null;
            z = false;
            com.huawei.updatesdk.a.a.b.a.a.a.b(g, h + e2.toString());
            if (!z) {
            }
            a(inputStream, outputStream2);
            com.huawei.updatesdk.b.e.a.b.a().remove(this);
            d();
            return false;
        } catch (Throwable th16) {
            th = th16;
            inputStream = null;
            if (!z3) {
            }
            a(inputStream, outputStream2);
            com.huawei.updatesdk.b.e.a.b.a().remove(this);
            d();
            throw th;
        }
        com.huawei.updatesdk.b.e.a.b.a().remove(this);
        d();
        return false;
    }

    private void d() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* access modifiers changed from: private */
    public static String e() {
        String b2 = com.huawei.updatesdk.a.b.a.a.c().b();
        boolean isEmpty = TextUtils.isEmpty(b2);
        String r2 = C0201.m82(7629);
        if (isEmpty) {
            return r2;
        }
        String str = b2 + C0201.m82(7630);
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : r2;
    }

    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        com.huawei.updatesdk.b.e.a.b.a(this);
        a(this.d, e());
        return null;
    }

    public void a() {
        new Thread(new a()).start();
    }

    public void b() {
        this.e = null;
    }

    public void onCancelled() {
        super.onCancelled();
        a();
    }
}
