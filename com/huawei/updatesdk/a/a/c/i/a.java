package com.huawei.updatesdk.a.a.c.i;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.updatesdk.a.a.c.i.c.b;
import java.util.Locale;
import vigqyno.C0201;

public class a {
    private static final Uri a = Uri.parse(C0201.m82(4532));
    private static final Uri b = Uri.parse(C0201.m82(4533));
    private static final Uri c = Uri.parse(C0201.m82(4534));

    /* renamed from: com.huawei.updatesdk.a.a.c.i.a$a  reason: collision with other inner class name */
    public static class C0110a {
        private String a;
        private String b;

        public String a() {
            return this.b;
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

        public void c(String str) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r6 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r6 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r1.b() != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    public static C0110a a(Context context) throws SecurityException {
        Cursor cursor;
        Throwable th;
        Throwable th2;
        SecurityException e;
        Exception e2;
        String r0 = C0201.m82(4535);
        C0110a aVar = new C0110a();
        Cursor cursor2 = null;
        try {
            cursor = b.d() ? c(context) : e(context);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            while (cursor.moveToNext()) {
                try {
                    aVar.b(cursor.getString(cursor.getColumnIndex(C0201.m82(4536))));
                    aVar.c(cursor.getString(cursor.getColumnIndex(C0201.m82(4537))));
                    aVar.a(cursor.getString(cursor.getColumnIndex(C0201.m82(4538))).toLowerCase(Locale.getDefault()));
                } catch (SecurityException e3) {
                    e = e3;
                    cursor2 = cursor;
                    try {
                        com.huawei.updatesdk.a.a.b.a.a.a.a(r0, C0201.m82(4540), e);
                        throw e;
                    } catch (Throwable th3) {
                        th2 = th3;
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    try {
                        com.huawei.updatesdk.a.a.b.a.a.a.a(r0, C0201.m82(4539), e2);
                    } catch (Throwable th4) {
                        cursor2 = cursor;
                        th2 = th4;
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SecurityException e5) {
            e = e5;
            com.huawei.updatesdk.a.a.b.a.a.a.a(r0, C0201.m82(4540), e);
            throw e;
        } catch (Exception e6) {
            e2 = e6;
            cursor = null;
            com.huawei.updatesdk.a.a.b.a.a.a.a(r0, C0201.m82(4539), e2);
        }
    }

    private static Cursor b(Context context) {
        return context.getContentResolver().query(b, null, null, null, null);
    }

    private static Cursor c(Context context) {
        Cursor cursor;
        if (b.a().a() == 0) {
            cursor = b(context);
            if (cursor == null) {
                cursor = d(context);
            }
        } else {
            cursor = d(context);
            if (cursor == null) {
                cursor = b(context);
            }
        }
        return cursor == null ? e(context) : cursor;
    }

    private static Cursor d(Context context) {
        return context.getContentResolver().query(c, null, null, null, null);
    }

    private static Cursor e(Context context) {
        return context.getContentResolver().query(a, null, null, null, null);
    }

    public static boolean f(Context context) {
        try {
            C0110a a2 = a(context);
            if (a2 != null) {
                return a2.a() != null && a2.a().contains(C0201.m82(4541));
            }
            return true;
        } catch (SecurityException e) {
            com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(4542), C0201.m82(4543), e);
            return false;
        }
    }
}
