package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public class c {
    private static String a;

    public interface a {
        void a(Boolean bool);
    }

    /* access modifiers changed from: private */
    public static class b extends AsyncTask<Void, Void, Boolean> {
        public a a;

        public b(a aVar) {
            this.a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x008b, code lost:
            if (r1 != null) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b1, code lost:
            if (0 == 0) goto L_0x00b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
            com.huawei.updatesdk.a.a.b.a.a.a.b(r0, r13);
         */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            String r13 = C0201.m82(28945);
            String r0 = C0201.m82(28946);
            Cursor cursor = null;
            boolean z = false;
            try {
                Context a2 = com.huawei.updatesdk.a.b.a.a.c().a();
                cursor = a2.getContentResolver().query(Uri.parse(c.a), null, null, null, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    Log.e(r0, C0201.m82(28950));
                } else {
                    boolean booleanValue = Boolean.valueOf(cursor.getString(cursor.getColumnIndex(C0201.m82(28947)))).booleanValue();
                    boolean booleanValue2 = Boolean.valueOf(cursor.getString(cursor.getColumnIndex(C0201.m82(28948)))).booleanValue();
                    boolean booleanValue3 = Boolean.valueOf(cursor.getString(cursor.getColumnIndex(C0201.m82(28949)))).booleanValue();
                    if (booleanValue && !booleanValue2 && !booleanValue3) {
                        z = true;
                    }
                }
            } catch (Exception e) {
                Log.e(r0, C0201.m82(28951) + e.toString());
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        cursor.close();
                    } catch (Exception unused) {
                        com.huawei.updatesdk.a.a.b.a.a.a.b(r0, r13);
                    }
                }
                throw th;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(bool);
            }
        }
    }

    public void a(Context context, String str, a aVar) {
        if (!com.huawei.updatesdk.b.f.b.e(context, str) || !h.g().d()) {
            aVar.a(Boolean.FALSE);
            return;
        }
        b bVar = new b(aVar);
        bVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
        try {
            Locale locale = Locale.ROOT;
            a = String.format(locale, C0201.m82(34594), str);
            bVar.get(500, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            bVar.cancel(true);
            Log.e(C0201.m82(34596), C0201.m82(34595) + e.toString());
            aVar.a(Boolean.FALSE);
        }
    }
}
