package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import vigqyno.C0201;

/* compiled from: ReactDatabaseSupplier */
public class e extends SQLiteOpenHelper {
    private static e d;
    private Context a;
    private SQLiteDatabase b;
    private long c = ((d.a.longValue() * 1024) * 1024);

    private e(Context context) {
        super(context, C0201.m82(1338), (SQLiteDatabase.CursorFactory) null, 1);
        this.a = context;
    }

    private synchronized boolean k() {
        h();
        return this.a.deleteDatabase(C0201.m82(1339));
    }

    public static e o(Context context) {
        if (d == null) {
            d = new e(context.getApplicationContext());
        }
        return d;
    }

    public synchronized void a() {
        n().delete(C0201.m82(1340), null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        throw new java.lang.RuntimeException(vigqyno.C0201.m82(1345));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (k() != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        defpackage.f60.b(vigqyno.C0201.m82(1343), vigqyno.C0201.m82(1344));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001c */
    public synchronized void c() throws RuntimeException {
        a();
        h();
        f60.b(C0201.m82(1341), C0201.m82(1342));
    }

    public synchronized void h() {
        if (this.b != null && this.b.isOpen()) {
            this.b.close();
            this.b = null;
        }
    }

    public synchronized boolean m() {
        if (this.b != null && this.b.isOpen()) {
            return true;
        }
        SQLiteException e = null;
        int i = 0;
        while (true) {
            if (i < 2) {
                if (i <= 0) {
                    break;
                }
                try {
                    k();
                    break;
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                    i++;
                }
            } else {
                break;
            }
        }
        this.b = getWritableDatabase();
        if (this.b != null) {
            this.b.setMaximumSize(this.c);
            return true;
        }
        throw e;
    }

    public synchronized SQLiteDatabase n() {
        m();
        return this.b;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C0201.m82(1346));
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            k();
            onCreate(sQLiteDatabase);
        }
    }
}
