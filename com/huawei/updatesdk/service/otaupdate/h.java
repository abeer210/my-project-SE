package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public class h {
    private static h e = new h();
    private static String f;
    private String a;
    private String b;
    private String c = null;
    private String d;

    /* access modifiers changed from: private */
    public static class b extends AsyncTask<Void, Void, String> {
        private b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0077 A[SYNTHETIC, Splitter:B:14:0x0077] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1 A[SYNTHETIC, Splitter:B:23:0x00a1] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae A[SYNTHETIC, Splitter:B:31:0x00ae] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            Throwable th;
            Exception e;
            String str;
            String r11 = C0201.m82(25425);
            String r0 = C0201.m82(25426);
            Cursor cursor = null;
            String str2 = null;
            try {
                Cursor cursor2 = com.huawei.updatesdk.a.b.a.a.c().a().getContentResolver().query(Uri.parse(h.f), null, null, null, null);
                if (cursor2 != null) {
                    try {
                        if (cursor2.moveToFirst()) {
                            str2 = cursor2.getString(cursor2.getColumnIndex(C0201.m82(25427)));
                            h.g().a(str2);
                            String c = h.g().c();
                            com.huawei.updatesdk.b.b.a.c().a(c, System.currentTimeMillis());
                            com.huawei.updatesdk.b.b.a.c().b(c, str2);
                            if (cursor2 != null) {
                                return str2;
                            }
                            try {
                                cursor2.close();
                                return str2;
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = null;
                        cursor = cursor2;
                        try {
                            Log.e(r0, C0201.m82(25429) + e.toString());
                            if (cursor != null) {
                            }
                            return str;
                        } catch (Throwable th2) {
                            cursor2 = cursor;
                            th = th2;
                            if (cursor2 != null) {
                                try {
                                    cursor2.close();
                                } catch (Exception unused2) {
                                    com.huawei.updatesdk.a.a.b.a.a.a.b(r0, r11);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
                Log.e(r0, C0201.m82(25428));
                if (cursor2 != null) {
                }
                com.huawei.updatesdk.a.a.b.a.a.a.b(r0, r11);
                return str2;
            } catch (Exception e3) {
                e = e3;
                str = null;
                Log.e(r0, C0201.m82(25429) + e.toString());
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused3) {
                        str2 = str;
                    }
                }
                return str;
            }
        }
    }

    private h() {
    }

    public static h g() {
        return e;
    }

    public String a() {
        return !TextUtils.isEmpty(this.a) ? this.a : this.b;
    }

    public void a(Context context, String str) {
        this.b = null;
        if (com.huawei.updatesdk.b.f.b.d(context, str)) {
            if (Math.abs(System.currentTimeMillis() - com.huawei.updatesdk.b.b.a.c().b(str)) < 86400000) {
                g().a(com.huawei.updatesdk.b.b.a.c().a(str));
                return;
            }
            f = String.format(Locale.ROOT, C0201.m82(36157), str);
            b bVar = new b();
            bVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
            try {
                bVar.get(1000, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                bVar.cancel(true);
                Log.e(C0201.m82(36159), C0201.m82(36158) + e2.toString());
            }
        }
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.c = str;
    }

    public boolean d() {
        String str = this.a;
        if (str != null) {
            return str.equals(this.b);
        }
        return true;
    }

    public boolean e() {
        return TextUtils.equals(this.d, C0201.m82(36160));
    }
}
