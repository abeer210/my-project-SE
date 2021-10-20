package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import vigqyno.C0201;

public final class f3 extends SQLiteOpenHelper {
    private final /* synthetic */ g3 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f3(g3 g3Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = g3Var;
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.a.e().E().d(C0201.m82(32810));
            String r0 = C0201.m82(32811);
            if (!this.a.getContext().getDatabasePath(r0).delete()) {
                this.a.e().E().a(C0201.m82(32812), r0);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.a.e().E().a(C0201.m82(32813), e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        c.b(this.a.e(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:3:0x000a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (Build.VERSION.SDK_INT < 15) {
            ?? r0 = 0;
            try {
                r0 = sQLiteDatabase.rawQuery(C0201.m82(32814), r0);
                r0.moveToFirst();
            } finally {
                if (r0 != 0) {
                    r0.close();
                }
            }
        }
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(32815), C0201.m82(32816), C0201.m82(32817), null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
