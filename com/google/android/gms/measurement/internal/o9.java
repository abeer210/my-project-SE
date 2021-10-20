package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import vigqyno.C0201;

public final class o9 extends SQLiteOpenHelper {
    private final /* synthetic */ n9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o9(n9 n9Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = n9Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.a.e.c(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.a.e.b();
                this.a.e().E().d(C0201.m82(16764));
                String r0 = C0201.m82(16765);
                if (!this.a.getContext().getDatabasePath(r0).delete()) {
                    this.a.e().E().a(C0201.m82(16766), r0);
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.a.e.a();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.a.e().E().a(C0201.m82(16767), e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException(C0201.m82(16768));
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        c.b(this.a.e(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16769), C0201.m82(16770), C0201.m82(16771), n9.f);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16772), C0201.m82(16773), C0201.m82(16774), null);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16775), C0201.m82(16776), C0201.m82(16777), n9.g);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16778), C0201.m82(16779), C0201.m82(16780), n9.h);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16781), C0201.m82(16782), C0201.m82(16783), n9.j);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16784), C0201.m82(16785), C0201.m82(16786), null);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16787), C0201.m82(16788), C0201.m82(16789), n9.i);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16790), C0201.m82(16791), C0201.m82(16792), n9.k);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16793), C0201.m82(16794), C0201.m82(16795), n9.l);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16796), C0201.m82(16797), C0201.m82(16798), null);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16799), C0201.m82(16800), C0201.m82(16801), n9.m);
        c.c(this.a.e(), sQLiteDatabase, C0201.m82(16802), C0201.m82(16803), C0201.m82(16804), null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
