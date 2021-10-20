package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.dynatrace.android.agent.u;
import vigqyno.C0201;

/* renamed from: n30  reason: default package */
/* compiled from: ParmDbHelper */
public class n30 extends SQLiteOpenHelper {
    private static final String a = (u.b + C0201.m82(3087));
    private static final String b = String.format(C0201.m82(3092), C0201.m82(3088), C0201.m82(3089), C0201.m82(3090), C0201.m82(3091));

    public n30(Context context) {
        super(context, C0201.m82(3093), (SQLiteDatabase.CursorFactory) null, 1);
    }

    private void c(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(C0201.m82(3094) + str);
        } catch (Exception e) {
            if (u.c) {
                String str2 = a;
                s30.u(str2, C0201.m82(3095) + str, e);
            }
        }
    }

    private Long h(String str) {
        Cursor query = getReadableDatabase().query(true, C0201.m82(3096), new String[]{str}, C0201.m82(3097), null, null, null, null, null);
        Long l = null;
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            l = Long.valueOf(query.getLong(query.getColumnIndexOrThrow(str)));
        }
        query.close();
        return l;
    }

    private void n(SQLiteDatabase sQLiteDatabase, int i, int i2, String str) {
        boolean z = u.c;
        String r1 = C0201.m82(3098);
        if (z) {
            s30.r(a, String.format(C0201.m82(3100), str, C0201.m82(3099), r1, Integer.valueOf(i), Integer.valueOf(i2)));
        }
        c(sQLiteDatabase, r1);
        onCreate(sQLiteDatabase);
    }

    public long a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(3101), (Integer) 0);
        contentValues.put(C0201.m82(3102), (Integer) 0);
        return getWritableDatabase().insert(C0201.m82(3103), null, contentValues);
    }

    public Long k() {
        return h(C0201.m82(3104));
    }

    public Long m() {
        return h(C0201.m82(3105));
    }

    public boolean o() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(3106), (Integer) 0);
        contentValues.put(C0201.m82(3107), (Integer) 0);
        if (getWritableDatabase().update(C0201.m82(3108), contentValues, C0201.m82(3109), null) > 0) {
            return true;
        }
        return false;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (u.c) {
            s30.r(a, String.format(C0201.m82(3112), C0201.m82(3110), C0201.m82(3111)));
        }
        sQLiteDatabase.execSQL(b);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        n(sQLiteDatabase, i, i2, C0201.m82(3113));
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        n(sQLiteDatabase, i, i2, C0201.m82(3114));
    }

    public boolean p(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(3115), Long.valueOf(j));
        return getWritableDatabase().update(C0201.m82(3116), contentValues, C0201.m82(3117), null) > 0;
    }

    public boolean r(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(3118), Long.valueOf(j));
        return getWritableDatabase().update(C0201.m82(3119), contentValues, C0201.m82(3120), null) > 0;
    }
}
