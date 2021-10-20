package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.dynatrace.android.agent.t;
import com.dynatrace.android.agent.u;
import defpackage.k30;
import java.util.Iterator;
import java.util.LinkedList;
import vigqyno.C0201;

/* renamed from: l30  reason: default package */
/* compiled from: EventsDbHelper */
public class l30 extends SQLiteOpenHelper {
    public static final int d = t.CRASH.d();
    private static final String e = (u.b + C0201.m82(12370));
    private SQLiteStatement a = getWritableDatabase().compileStatement(C0201.m82(12372));
    private SQLiteStatement b;
    private SQLiteStatement c;

    public l30(Context context) {
        super(context, C0201.m82(12371), (SQLiteDatabase.CursorFactory) null, 8);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.b = writableDatabase.compileStatement(C0201.m82(12373) + d);
        SQLiteDatabase writableDatabase2 = getWritableDatabase();
        this.c = writableDatabase2.compileStatement(C0201.m82(12374) + C0201.m82(12375) + C0201.m82(12376));
    }

    private void n(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(C0201.m82(12377) + str);
        } catch (Exception e2) {
            if (u.c) {
                String str2 = e;
                s30.u(str2, C0201.m82(12378) + str, e2);
            }
        }
    }

    private void s(SQLiteDatabase sQLiteDatabase, int i, int i2, String str) {
        boolean z = u.c;
        String r1 = C0201.m82(12379);
        if (z) {
            s30.r(e, String.format(C0201.m82(12381), str, C0201.m82(12380), r1, Integer.valueOf(i), Integer.valueOf(i2)));
        }
        n(sQLiteDatabase, r1);
        onCreate(sQLiteDatabase);
    }

    public boolean a() {
        return getWritableDatabase().delete(C0201.m82(12382), null, null) > 0;
    }

    public void c(long j, boolean z) {
        SQLiteStatement sQLiteStatement = z ? this.b : this.a;
        sQLiteStatement.bindLong(1, j);
        int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
        if (u.c) {
            String str = e;
            s30.r(str, C0201.m82(12383) + executeUpdateDelete);
        }
    }

    public int h(int i, int i2) {
        long j = (long) i;
        this.c.bindLong(1, j);
        this.c.bindLong(2, j);
        this.c.bindLong(3, (long) i2);
        int executeUpdateDelete = this.c.executeUpdateDelete();
        if (u.c) {
            String str = e;
            s30.r(str, C0201.m82(12384) + executeUpdateDelete);
        }
        return executeUpdateDelete;
    }

    public void k(long j, long j2) {
        getWritableDatabase().delete(C0201.m82(12385), C0201.m82(12386), new String[]{String.valueOf(j), String.valueOf(j2)});
    }

    public void m(long j, long j2, int i, int i2, long j3) {
        int delete = getWritableDatabase().delete(C0201.m82(12387), C0201.m82(12388), new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i), String.valueOf(i2), String.valueOf(j3)});
        if (u.c) {
            String str = e;
            s30.r(str, C0201.m82(12389) + delete);
        }
    }

    public Cursor o() {
        return p(0);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        String r0 = C0201.m82(12390);
        if (u.c) {
            s30.r(e, String.format(C0201.m82(12393), C0201.m82(12391), C0201.m82(12392)));
        }
        try {
            sQLiteDatabase.execSQL(r0);
        } catch (Exception e2) {
            if (u.c) {
                s30.u(e, r0, e2);
            }
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        s(sQLiteDatabase, i, i2, C0201.m82(12394));
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        s(sQLiteDatabase, i, i2, C0201.m82(12395));
    }

    public Cursor p(long j) {
        String[] strArr = {C0201.m82(12396), C0201.m82(12397), C0201.m82(12398), C0201.m82(12399), C0201.m82(12400), C0201.m82(12401), C0201.m82(12402), C0201.m82(12403), C0201.m82(12404), C0201.m82(12405), C0201.m82(12406)};
        SQLiteDatabase readableDatabase = getReadableDatabase();
        return readableDatabase.query(true, C0201.m82(12408), strArr, C0201.m82(12407) + j, null, null, null, C0201.m82(12409), null);
    }

    public void r(LinkedList<k30.a> linkedList) {
        if (linkedList != null && !linkedList.isEmpty()) {
            Iterator<k30.a> it = linkedList.iterator();
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.beginTransaction();
                while (it.hasNext()) {
                    try {
                        k30.a next = it.next();
                        if (next.c.g()) {
                            g30 g30 = next.c;
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(C0201.m82(12410), Long.valueOf(g30.b));
                            contentValues.put(C0201.m82(12411), Long.valueOf(g30.c));
                            i30 i30 = g30.e;
                            i30 i302 = i30.V2_AGENT_SPLITTING;
                            String r7 = C0201.m82(12412);
                            if (i30 == i302) {
                                contentValues.put(r7, Integer.valueOf(g30.d));
                            } else {
                                contentValues.put(r7, (Integer) -1);
                            }
                            contentValues.put(C0201.m82(12413), next.a);
                            contentValues.put(C0201.m82(12414), next.b);
                            contentValues.put(C0201.m82(12415), Integer.valueOf(next.d));
                            contentValues.put(C0201.m82(12416), Long.valueOf(g30.a));
                            contentValues.put(C0201.m82(12417), Long.valueOf(next.e));
                            contentValues.put(C0201.m82(12418), Integer.valueOf(g30.f == -1 ? 1 : g30.f));
                            contentValues.put(C0201.m82(12419), Integer.valueOf(next.f));
                            writableDatabase.insert(C0201.m82(12420), null, contentValues);
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e2) {
                if (u.c) {
                    s30.u(e, C0201.m82(12421), e2);
                }
            }
        }
    }

    public boolean u(g30 g30) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(12422), Integer.valueOf(g30.f));
        if (getWritableDatabase().update(C0201.m82(12423), contentValues, C0201.m82(12424), new String[]{String.valueOf(g30.b), String.valueOf(g30.c)}) > 0) {
            return true;
        }
        return false;
    }
}
